@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Failover Condition settings. There can be multiple failover conditions inside
 * AutomaticInputFailoverSettings.
 *
 * The parent of this entity is AutomaticInputFailoverSettings.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FailoverConditionProperty failoverConditionProperty = FailoverConditionProperty.builder()
 * .failoverConditionSettings(FailoverConditionSettingsProperty.builder()
 * .audioSilenceSettings(AudioSilenceFailoverSettingsProperty.builder()
 * .audioSelectorName("audioSelectorName")
 * .audioSilenceThresholdMsec(123)
 * .build())
 * .inputLossSettings(InputLossFailoverSettingsProperty.builder()
 * .inputLossThresholdMsec(123)
 * .build())
 * .videoBlackSettings(VideoBlackFailoverSettingsProperty.builder()
 * .blackDetectThreshold(123)
 * .videoBlackThresholdMsec(123)
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-failovercondition.html)
 */
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
