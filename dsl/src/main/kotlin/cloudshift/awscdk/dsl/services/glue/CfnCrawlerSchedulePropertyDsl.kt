@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.glue.CfnCrawler

@CdkDslMarker
public class CfnCrawlerSchedulePropertyDsl {
  private val cdkBuilder: CfnCrawler.ScheduleProperty.Builder =
      CfnCrawler.ScheduleProperty.builder()

  /**
   * @param scheduleExpression A `cron` expression used to specify the schedule.
   * For more information, see [Time-Based Schedules for Jobs and
   * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) . For
   * example, to run something every day at 12:15 UTC, specify `cron(15 12 * * ? *)` .
   */
  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnCrawler.ScheduleProperty = cdkBuilder.build()
}
