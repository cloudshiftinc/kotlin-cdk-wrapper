@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnLayer

@CdkDslMarker
public class CfnLayerLoadBasedAutoScalingPropertyDsl {
  private val cdkBuilder: CfnLayer.LoadBasedAutoScalingProperty.Builder =
      CfnLayer.LoadBasedAutoScalingProperty.builder()

  /**
   * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
   * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
   */
  public fun downScaling(downScaling: IResolvable) {
    cdkBuilder.downScaling(downScaling)
  }

  /**
   * @param downScaling An `AutoScalingThresholds` object that describes the downscaling
   * configuration, which defines how and when AWS OpsWorks Stacks reduces the number of instances.
   */
  public fun downScaling(downScaling: CfnLayer.AutoScalingThresholdsProperty) {
    cdkBuilder.downScaling(downScaling)
  }

  /**
   * @param enable Whether load-based auto scaling is enabled for the layer.
   */
  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param enable Whether load-based auto scaling is enabled for the layer.
   */
  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  /**
   * @param upScaling An `AutoScalingThresholds` object that describes the upscaling configuration,
   * which defines how and when AWS OpsWorks Stacks increases the number of instances.
   */
  public fun upScaling(upScaling: IResolvable) {
    cdkBuilder.upScaling(upScaling)
  }

  /**
   * @param upScaling An `AutoScalingThresholds` object that describes the upscaling configuration,
   * which defines how and when AWS OpsWorks Stacks increases the number of instances.
   */
  public fun upScaling(upScaling: CfnLayer.AutoScalingThresholdsProperty) {
    cdkBuilder.upScaling(upScaling)
  }

  public fun build(): CfnLayer.LoadBasedAutoScalingProperty = cdkBuilder.build()
}
