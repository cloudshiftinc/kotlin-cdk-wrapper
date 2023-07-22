@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFailoverConditionPropertyDsl {
  private val cdkBuilder: CfnChannel.FailoverConditionProperty.Builder =
      CfnChannel.FailoverConditionProperty.builder()

  /**
   * @param failoverConditionSettings Settings for a specific failover condition.
   */
  public fun failoverConditionSettings(failoverConditionSettings: IResolvable) {
    cdkBuilder.failoverConditionSettings(failoverConditionSettings)
  }

  /**
   * @param failoverConditionSettings Settings for a specific failover condition.
   */
  public
      fun failoverConditionSettings(failoverConditionSettings: CfnChannel.FailoverConditionSettingsProperty) {
    cdkBuilder.failoverConditionSettings(failoverConditionSettings)
  }

  public fun build(): CfnChannel.FailoverConditionProperty = cdkBuilder.build()
}
