@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@CdkDslMarker
public class CfnInstanceGroupConfigScalingConstraintsPropertyDsl {
  private val cdkBuilder: CfnInstanceGroupConfig.ScalingConstraintsProperty.Builder =
      CfnInstanceGroupConfig.ScalingConstraintsProperty.builder()

  public fun maxCapacity(maxCapacity: Number) {
    cdkBuilder.maxCapacity(maxCapacity)
  }

  public fun minCapacity(minCapacity: Number) {
    cdkBuilder.minCapacity(minCapacity)
  }

  public fun build(): CfnInstanceGroupConfig.ScalingConstraintsProperty = cdkBuilder.build()
}
