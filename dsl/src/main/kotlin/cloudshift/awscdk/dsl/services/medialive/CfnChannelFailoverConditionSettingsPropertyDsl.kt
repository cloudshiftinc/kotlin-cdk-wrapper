@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

@CdkDslMarker
public class CfnChannelFailoverConditionSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.FailoverConditionSettingsProperty.Builder =
        CfnChannel.FailoverConditionSettingsProperty.builder()

    public fun audioSilenceSettings(audioSilenceSettings: IResolvable) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings)
    }

    public fun audioSilenceSettings(audioSilenceSettings: CfnChannel.AudioSilenceFailoverSettingsProperty) {
        cdkBuilder.audioSilenceSettings(audioSilenceSettings)
    }

    public fun inputLossSettings(inputLossSettings: IResolvable) {
        cdkBuilder.inputLossSettings(inputLossSettings)
    }

    public fun inputLossSettings(inputLossSettings: CfnChannel.InputLossFailoverSettingsProperty) {
        cdkBuilder.inputLossSettings(inputLossSettings)
    }

    public fun videoBlackSettings(videoBlackSettings: IResolvable) {
        cdkBuilder.videoBlackSettings(videoBlackSettings)
    }

    public fun videoBlackSettings(videoBlackSettings: CfnChannel.VideoBlackFailoverSettingsProperty) {
        cdkBuilder.videoBlackSettings(videoBlackSettings)
    }

    public fun build(): CfnChannel.FailoverConditionSettingsProperty = cdkBuilder.build()
}
