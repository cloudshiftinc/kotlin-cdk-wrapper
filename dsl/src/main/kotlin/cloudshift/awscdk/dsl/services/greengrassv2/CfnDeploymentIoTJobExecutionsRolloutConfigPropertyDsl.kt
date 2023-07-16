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

  public fun exponentialRate(exponentialRate: IResolvable) {
    cdkBuilder.exponentialRate(exponentialRate)
  }

  public fun exponentialRate(exponentialRate: CfnDeployment.IoTJobExponentialRolloutRateProperty) {
    cdkBuilder.exponentialRate(exponentialRate)
  }

  public fun maximumPerMinute(maximumPerMinute: Number) {
    cdkBuilder.maximumPerMinute(maximumPerMinute)
  }

  public fun build(): CfnDeployment.IoTJobExecutionsRolloutConfigProperty = cdkBuilder.build()
}
