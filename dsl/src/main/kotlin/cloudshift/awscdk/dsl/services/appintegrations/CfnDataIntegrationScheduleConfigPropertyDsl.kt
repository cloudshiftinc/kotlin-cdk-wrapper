@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appintegrations

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appintegrations.CfnDataIntegration

@CdkDslMarker
public class CfnDataIntegrationScheduleConfigPropertyDsl {
  private val cdkBuilder: CfnDataIntegration.ScheduleConfigProperty.Builder =
      CfnDataIntegration.ScheduleConfigProperty.builder()

  /**
   * @param firstExecutionFrom The start date for objects to import in the first flow run as an
   * Unix/epoch timestamp in milliseconds or in ISO-8601 format.
   */
  public fun firstExecutionFrom(firstExecutionFrom: String) {
    cdkBuilder.firstExecutionFrom(firstExecutionFrom)
  }

  /**
   * @param object The name of the object to pull from the data source.
   */
  public fun `object`(`object`: String) {
    cdkBuilder.`object`(`object`)
  }

  /**
   * @param scheduleExpression How often the data should be pulled from data source. 
   */
  public fun scheduleExpression(scheduleExpression: String) {
    cdkBuilder.scheduleExpression(scheduleExpression)
  }

  public fun build(): CfnDataIntegration.ScheduleConfigProperty = cdkBuilder.build()
}
