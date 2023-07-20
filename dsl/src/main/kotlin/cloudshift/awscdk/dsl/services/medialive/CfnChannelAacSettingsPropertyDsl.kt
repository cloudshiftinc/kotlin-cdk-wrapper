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
import software.amazon.awscdk.services.medialive.CfnChannel
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelAacSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.AacSettingsProperty.Builder =
        CfnChannel.AacSettingsProperty.builder()

    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    public fun codingMode(codingMode: String) {
        cdkBuilder.codingMode(codingMode)
    }

    public fun inputType(inputType: String) {
        cdkBuilder.inputType(inputType)
    }

    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    public fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
    }

    public fun rawFormat(rawFormat: String) {
        cdkBuilder.rawFormat(rawFormat)
    }

    public fun sampleRate(sampleRate: Number) {
        cdkBuilder.sampleRate(sampleRate)
    }

    public fun spec(spec: String) {
        cdkBuilder.spec(spec)
    }

    public fun vbrQuality(vbrQuality: String) {
        cdkBuilder.vbrQuality(vbrQuality)
    }

    public fun build(): CfnChannel.AacSettingsProperty = cdkBuilder.build()
}
