@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * Settings for one failover condition.
 *
 * The parent of this entity is FailoverCondition.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * FailoverConditionSettingsProperty failoverConditionSettingsProperty =
 * FailoverConditionSettingsProperty.builder()
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
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-failoverconditionsettings.html)
 */
@CdkDslMarker
public class CfnChannelFailoverConditionSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FailoverConditionSettingsProperty.Builder =
        CfnChannel.FailoverConditionSettingsProperty.builder()

    /**
     * @param audioSilenceSettings MediaLive will perform a failover if the specified audio selector
     *   is silent for the specified period.
     */
    public fun audioSilenceSettings(audioSilenceSettings: IResolvable) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings)
    }

    /**
     * @param audioSilenceSettings MediaLive will perform a failover if the specified audio selector
     *   is silent for the specified period.
     */
    public fun audioSilenceSettings(
        audioSilenceSettings: CfnChannel.AudioSilenceFailoverSettingsProperty
    ) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings)
    }

    /**
     * @param inputLossSettings MediaLive will perform a failover if content is not detected in this
     *   input for the specified period.
     */
    public fun inputLossSettings(inputLossSettings: IResolvable) {
        cdkBuilder.inputLossSettings(inputLossSettings)
    }

    /**
     * @param inputLossSettings MediaLive will perform a failover if content is not detected in this
     *   input for the specified period.
     */
    public fun inputLossSettings(inputLossSettings: CfnChannel.InputLossFailoverSettingsProperty) {
        cdkBuilder.inputLossSettings(inputLossSettings)
    }

    /**
     * @param videoBlackSettings MediaLive will perform a failover if content is considered black
     *   for the specified period.
     */
    public fun videoBlackSettings(videoBlackSettings: IResolvable) {
        cdkBuilder.videoBlackSettings(videoBlackSettings)
    }

    /**
     * @param videoBlackSettings MediaLive will perform a failover if content is considered black
     *   for the specified period.
     */
    public fun videoBlackSettings(
        videoBlackSettings: CfnChannel.VideoBlackFailoverSettingsProperty
    ) {
        cdkBuilder.videoBlackSettings(videoBlackSettings)
    }

    public fun build(): CfnChannel.FailoverConditionSettingsProperty = cdkBuilder.build()
}
