/**
 * BotSturdy
 * CronTest.java
 * 3574
 * 2016. 9. 8.
 */
package EarthQuake;

import java.util.ArrayList;

import org.quartz.CronScheduleBuilder;
import org.quartz.CronTrigger;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;

/**
 * @author 3574
 *
 */
public class ScheduleController {
	public ScheduleController() {
		try {
			ArrayList state = new ArrayList<String>();
			//�ֱ������� �����Ŭ job Ŭ���� ���
			//job Ŭ������ �����ڿ� ���ڰ� ���� �ȵ�, inner class�� �����ϸ� �ȵ�.
			//job Ŭ������ ������ ����
			JobDetail job = JobBuilder.newJob(ScheduleBotJob.class)
									  .withIdentity("testJob")
									  .usingJobData("jobSays", "�ֱ� ���� �߻� ����")
									  .usingJobData("myFloatValue", "product by MinYoung Lee").build();
			job.getJobDataMap().put("state", state);


			// 10�ʸ��� ��� ���� java Timer�� ���
			/*
			 * Trigger trigger = TriggerBuilder.newTrigger()
			 * .withSchedule(SimpleScheduleBuilder.simpleSchedule()
			 * .withIntervalInSeconds(10) .repeatForever()) .build();
			 */

			// CronTrigger �� 10�ʸ���(10,20,30 ...) �۾� ����

			CronTrigger cronTrigger = TriggerBuilder.newTrigger()
													.withIdentity("crontrigger", "crontriggergroup1")
//													.withSchedule(CronScheduleBuilder.cronSchedule("1 * * * * ?"))
													.withSchedule(CronScheduleBuilder.cronSchedule("0/10 * * * * ?"))
													.build();

			// schedule the job
			SchedulerFactory schFactory = new StdSchedulerFactory();
			Scheduler sch = schFactory.getScheduler();

			//�����ٷ� ����
			sch.start();
			sch.scheduleJob(job, cronTrigger);

			// �����ٷ� ���� sch.shutdown();

		} catch (SchedulerException e) {
			e.printStackTrace();
		}
	}


	public static void main(String[] args) {
		
		new ScheduleController();
	}

}
