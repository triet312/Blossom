package bruteforce.presentation;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.bruteforce.blossom.R;

import bruteforce.business.AccessTask;
import bruteforce.objects.Task;

/**
 Class: ShowTaskActivity
 Author: Triet Nguyen
 Purpose: To set up front-end stuff for ShowTask page
 */
public class ShowTaskActivity extends AppCompatActivity {
    //fields
    AccessTask accessTask;
    Task showTask;
    Task doTask;
    String holder;

    /**
     onCreate

     Purpose: setup everything for ShowTask page
     Parameters: Bundle savedInstanceState
     Returns: none
     */
    @Override
    protected  void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show_task);
        //set this activity to handle activity_show_task.xml

        Intent intent = getIntent();
        holder = "username1";
        accessTask = new AccessTask(holder);
        showTask = (Task)intent.getSerializableExtra("key");
        doTask = accessTask.getTask(showTask.getTaskID());
        //get data passed from MainActivity
    }

    /**
     buttonModifyOnClick

     Purpose: transfer to UpdateTaskActivity when pressing Modify button
     Parameters: View v
     Returns: none
     */
    public void buttonModifyOnClick(View v) {
        Intent modify = new Intent(ShowTaskActivity.this,UpdateTaskActivity.class);
        modify.putExtra("key",showTask);
        ShowTaskActivity.this.startActivity(modify);
    }

    /**
     buttonDeleteOnClick

     Purpose: delete selected task when pressing Delete button
     Parameters: View v
     Returns: none
     */
    public void buttonDeleteOnClick(View v) {
        accessTask.deleteTask();
        NavUtils.navigateUpFromSameTask(this);


    }
}
