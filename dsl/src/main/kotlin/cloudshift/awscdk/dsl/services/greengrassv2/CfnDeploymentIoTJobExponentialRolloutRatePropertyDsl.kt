@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrassv2

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Number
import kotlin.Unit
import software.amazon.awscdk.services.greengrassv2.CfnDeployment

@CdkDslMarker
public class CfnDeploymentIoTJobExponentialRolloutRatePropertyDsl {
  private val cdkBuilder: CfnDeployment.IoTJobExponentialRolloutRateProperty.Builder =
      CfnDeployment.IoTJobExponentialRolloutRateProperty.builder()

  /**
   * @param baseRatePerMinute The minimum number of devices that receive a pending job notification,
   * per minute, when the job starts. 
   * This parameter defines the initial rollout rate of the job.
   */
  public fun baseRatePerMinute(baseRatePerMinute: Number) {
    cdkBuilder.baseRatePerMinute(baseRatePerMinute)
  }

  /**
   * @param incrementFactor The exponential factor to increase the rollout rate for the job. 
   * This parameter supports up to one digit after the decimal (for example, you can specify `1.5` ,
   * but not `1.55` ).
   */
  public fun incrementFactor(incrementFactor: Number) {
    cdkBuilder.incrementFactor(incrementFactor)
  }

  /**
   * @param rateIncreaseCriteria The criteria to increase the rollout rate for the job. 
   */
  public fun rateIncreaseCriteria(rateIncreaseCriteria: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(rateIncreaseCriteria)
    cdkBuilder.rateIncreaseCriteria(builder.map)
  }

  /**
   * @param rateIncreaseCriteria The criteria to increase the rollout rate for the job. 
   */
  public fun rateIncreaseCriteria(rateIncreaseCriteria: Any) {
    cdkBuilder.rateIncreaseCriteria(rateIncreaseCriteria)
  }

  public fun build(): CfnDeployment.IoTJobExponentialRolloutRateProperty = cdkBuilder.build()
}
