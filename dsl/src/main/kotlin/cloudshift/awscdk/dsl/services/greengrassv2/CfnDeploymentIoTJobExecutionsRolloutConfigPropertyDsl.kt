@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentIoTJobExecutionsRolloutConfigPropertyDsl {
  private val cdkBuilder: CfnDeployment.IoTJobExecutionsRolloutConfigProperty.Builder =
      CfnDeployment.IoTJobExecutionsRolloutConfigProperty.builder()

  /**
   * @param exponentialRate The exponential rate to increase the job rollout rate.
   */
  public fun exponentialRate(exponentialRate: IResolvable) {
    cdkBuilder.exponentialRate(exponentialRate)
  }

  /**
   * @param exponentialRate The exponential rate to increase the job rollout rate.
   */
  public fun exponentialRate(exponentialRate: CfnDeployment.IoTJobExponentialRolloutRateProperty) {
    cdkBuilder.exponentialRate(exponentialRate)
  }

  /**
   * @param maximumPerMinute The maximum number of devices that receive a pending job notification,
   * per minute.
   */
  public fun maximumPerMinute(maximumPerMinute: Number) {
    cdkBuilder.maximumPerMinute(maximumPerMinute)
  }

  public fun build(): CfnDeployment.IoTJobExecutionsRolloutConfigProperty = cdkBuilder.build()
}
