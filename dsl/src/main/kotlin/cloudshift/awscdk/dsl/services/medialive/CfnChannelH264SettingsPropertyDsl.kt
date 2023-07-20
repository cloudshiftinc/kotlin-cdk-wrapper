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
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnChannelH264SettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.H264SettingsProperty.Builder =
        CfnChannel.H264SettingsProperty.builder()

    public fun adaptiveQuantization(adaptiveQuantization: String) {
        cdkBuilder.adaptiveQuantization(adaptiveQuantization)
    }

    public fun afdSignaling(afdSignaling: String) {
        cdkBuilder.afdSignaling(afdSignaling)
    }

    public fun bitrate(bitrate: Number) {
        cdkBuilder.bitrate(bitrate)
    }

    public fun bufFillPct(bufFillPct: Number) {
        cdkBuilder.bufFillPct(bufFillPct)
    }

    public fun bufSize(bufSize: Number) {
        cdkBuilder.bufSize(bufSize)
    }

    public fun colorMetadata(colorMetadata: String) {
        cdkBuilder.colorMetadata(colorMetadata)
    }

    public fun colorSpaceSettings(colorSpaceSettings: IResolvable) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    public fun colorSpaceSettings(colorSpaceSettings: CfnChannel.H264ColorSpaceSettingsProperty) {
        cdkBuilder.colorSpaceSettings(colorSpaceSettings)
    }

    public fun entropyEncoding(entropyEncoding: String) {
        cdkBuilder.entropyEncoding(entropyEncoding)
    }

    public fun filterSettings(filterSettings: IResolvable) {
        cdkBuilder.filterSettings(filterSettings)
    }

    public fun filterSettings(filterSettings: CfnChannel.H264FilterSettingsProperty) {
        cdkBuilder.filterSettings(filterSettings)
    }

    public fun fixedAfd(fixedAfd: String) {
        cdkBuilder.fixedAfd(fixedAfd)
    }

    public fun flickerAq(flickerAq: String) {
        cdkBuilder.flickerAq(flickerAq)
    }

    public fun forceFieldPictures(forceFieldPictures: String) {
        cdkBuilder.forceFieldPictures(forceFieldPictures)
    }

    public fun framerateControl(framerateControl: String) {
        cdkBuilder.framerateControl(framerateControl)
    }

    public fun framerateDenominator(framerateDenominator: Number) {
        cdkBuilder.framerateDenominator(framerateDenominator)
    }

    public fun framerateNumerator(framerateNumerator: Number) {
        cdkBuilder.framerateNumerator(framerateNumerator)
    }

    public fun gopBReference(gopBReference: String) {
        cdkBuilder.gopBReference(gopBReference)
    }

    public fun gopClosedCadence(gopClosedCadence: Number) {
        cdkBuilder.gopClosedCadence(gopClosedCadence)
    }

    public fun gopNumBFrames(gopNumBFrames: Number) {
        cdkBuilder.gopNumBFrames(gopNumBFrames)
    }

    public fun gopSize(gopSize: Number) {
        cdkBuilder.gopSize(gopSize)
    }

    public fun gopSizeUnits(gopSizeUnits: String) {
        cdkBuilder.gopSizeUnits(gopSizeUnits)
    }

    public fun level(level: String) {
        cdkBuilder.level(level)
    }

    public fun lookAheadRateControl(lookAheadRateControl: String) {
        cdkBuilder.lookAheadRateControl(lookAheadRateControl)
    }

    public fun maxBitrate(maxBitrate: Number) {
        cdkBuilder.maxBitrate(maxBitrate)
    }

    public fun minIInterval(minIInterval: Number) {
        cdkBuilder.minIInterval(minIInterval)
    }

    public fun numRefFrames(numRefFrames: Number) {
        cdkBuilder.numRefFrames(numRefFrames)
    }

    public fun parControl(parControl: String) {
        cdkBuilder.parControl(parControl)
    }

    public fun parDenominator(parDenominator: Number) {
        cdkBuilder.parDenominator(parDenominator)
    }

    public fun parNumerator(parNumerator: Number) {
        cdkBuilder.parNumerator(parNumerator)
    }

    public fun profile(profile: String) {
        cdkBuilder.profile(profile)
    }

    public fun qualityLevel(qualityLevel: String) {
        cdkBuilder.qualityLevel(qualityLevel)
    }

    public fun qvbrQualityLevel(qvbrQualityLevel: Number) {
        cdkBuilder.qvbrQualityLevel(qvbrQualityLevel)
    }

    public fun rateControlMode(rateControlMode: String) {
        cdkBuilder.rateControlMode(rateControlMode)
    }

    public fun scanType(scanType: String) {
        cdkBuilder.scanType(scanType)
    }

    public fun sceneChangeDetect(sceneChangeDetect: String) {
        cdkBuilder.sceneChangeDetect(sceneChangeDetect)
    }

    public fun slices(slices: Number) {
        cdkBuilder.slices(slices)
    }

    public fun softness(softness: Number) {
        cdkBuilder.softness(softness)
    }

    public fun spatialAq(spatialAq: String) {
        cdkBuilder.spatialAq(spatialAq)
    }

    public fun subgopLength(subgopLength: String) {
        cdkBuilder.subgopLength(subgopLength)
    }

    public fun syntax(syntax: String) {
        cdkBuilder.syntax(syntax)
    }

    public fun temporalAq(temporalAq: String) {
        cdkBuilder.temporalAq(temporalAq)
    }

    public fun timecodeBurninSettings(timecodeBurninSettings: IResolvable) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
    }

    public fun timecodeBurninSettings(timecodeBurninSettings: CfnChannel.TimecodeBurninSettingsProperty) {
        cdkBuilder.timecodeBurninSettings(timecodeBurninSettings)
    }

    public fun timecodeInsertion(timecodeInsertion: String) {
        cdkBuilder.timecodeInsertion(timecodeInsertion)
    }

    public fun build(): CfnChannel.H264SettingsProperty = cdkBuilder.build()
}
