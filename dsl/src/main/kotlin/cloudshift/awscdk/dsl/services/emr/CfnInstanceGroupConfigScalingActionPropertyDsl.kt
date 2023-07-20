@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emr.CfnInstanceGroupConfig

@CdkDslMarker
public class CfnInstanceGroupConfigScalingActionPropertyDsl {
  private val cdkBuilder: CfnInstanceGroupConfig.ScalingActionProperty.Builder =
      CfnInstanceGroupConfig.ScalingActionProperty.builder()

  public fun market(market: String) {
    cdkBuilder.market(market)
  }

  public fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: IResolvable) {
    cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
  }

  public
      fun simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration: CfnInstanceGroupConfig.SimpleScalingPolicyConfigurationProperty) {
    cdkBuilder.simpleScalingPolicyConfiguration(simpleScalingPolicyConfiguration)
  }

  public fun build(): CfnInstanceGroupConfig.ScalingActionProperty = cdkBuilder.build()
}
