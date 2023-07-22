@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentIoTJobAbortCriteriaPropertyDsl {
  private val cdkBuilder: CfnDeployment.IoTJobAbortCriteriaProperty.Builder =
      CfnDeployment.IoTJobAbortCriteriaProperty.builder()

  /**
   * @param action The action to perform when the criteria are met. 
   */
  public fun action(action: String) {
    cdkBuilder.action(action)
  }

  /**
   * @param failureType The type of job deployment failure that can cancel a job. 
   */
  public fun failureType(failureType: String) {
    cdkBuilder.failureType(failureType)
  }

  /**
   * @param minNumberOfExecutedThings The minimum number of things that receive the configuration
   * before the job can cancel. 
   */
  public fun minNumberOfExecutedThings(minNumberOfExecutedThings: Number) {
    cdkBuilder.minNumberOfExecutedThings(minNumberOfExecutedThings)
  }

  /**
   * @param thresholdPercentage The minimum percentage of `failureType` failures that occur before
   * the job can cancel. 
   * This parameter supports up to two digits after the decimal (for example, you can specify `10.9`
   * or `10.99` , but not `10.999` ).
   */
  public fun thresholdPercentage(thresholdPercentage: Number) {
    cdkBuilder.thresholdPercentage(thresholdPercentage)
  }

  public fun build(): CfnDeployment.IoTJobAbortCriteriaProperty = cdkBuilder.build()
}
