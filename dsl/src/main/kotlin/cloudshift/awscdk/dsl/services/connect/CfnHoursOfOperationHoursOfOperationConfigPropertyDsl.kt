@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnHoursOfOperation

@CdkDslMarker
public class CfnHoursOfOperationHoursOfOperationConfigPropertyDsl {
  private val cdkBuilder: CfnHoursOfOperation.HoursOfOperationConfigProperty.Builder =
      CfnHoursOfOperation.HoursOfOperationConfigProperty.builder()

  /**
   * @param day The day that the hours of operation applies to. 
   */
  public fun day(day: String) {
    cdkBuilder.day(day)
  }

  /**
   * @param endTime The end time that your contact center closes. 
   */
  public fun endTime(endTime: IResolvable) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param endTime The end time that your contact center closes. 
   */
  public fun endTime(endTime: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty) {
    cdkBuilder.endTime(endTime)
  }

  /**
   * @param startTime The start time that your contact center opens. 
   */
  public fun startTime(startTime: IResolvable) {
    cdkBuilder.startTime(startTime)
  }

  /**
   * @param startTime The start time that your contact center opens. 
   */
  public fun startTime(startTime: CfnHoursOfOperation.HoursOfOperationTimeSliceProperty) {
    cdkBuilder.startTime(startTime)
  }

  public fun build(): CfnHoursOfOperation.HoursOfOperationConfigProperty = cdkBuilder.build()
}
