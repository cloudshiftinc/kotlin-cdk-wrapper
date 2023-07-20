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

  public fun downScaling(downScaling: IResolvable) {
    cdkBuilder.downScaling(downScaling)
  }

  public fun downScaling(downScaling: CfnLayer.AutoScalingThresholdsProperty) {
    cdkBuilder.downScaling(downScaling)
  }

  public fun enable(enable: Boolean) {
    cdkBuilder.enable(enable)
  }

  public fun enable(enable: IResolvable) {
    cdkBuilder.enable(enable)
  }

  public fun upScaling(upScaling: IResolvable) {
    cdkBuilder.upScaling(upScaling)
  }

  public fun upScaling(upScaling: CfnLayer.AutoScalingThresholdsProperty) {
    cdkBuilder.upScaling(upScaling)
  }

  public fun build(): CfnLayer.LoadBasedAutoScalingProperty = cdkBuilder.build()
}
