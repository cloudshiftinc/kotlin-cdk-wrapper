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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for the encoding of outputs.
 *
 * This entity is at the top level in the channel.
 *
 * Example:
 * ```
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-encodersettings.html)
 */
@CdkDslMarker
public class CfnChannelEncoderSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.EncoderSettingsProperty.Builder =
        CfnChannel.EncoderSettingsProperty.builder()

    private val _audioDescriptions: MutableList<Any> = mutableListOf()

    private val _captionDescriptions: MutableList<Any> = mutableListOf()

    private val _outputGroups: MutableList<Any> = mutableListOf()

    private val _videoDescriptions: MutableList<Any> = mutableListOf()

    /** @param audioDescriptions The encoding information for output audio. */
    public fun audioDescriptions(vararg audioDescriptions: Any) {
        _audioDescriptions.addAll(listOf(*audioDescriptions))
    }

    /** @param audioDescriptions The encoding information for output audio. */
    public fun audioDescriptions(audioDescriptions: Collection<Any>) {
        _audioDescriptions.addAll(audioDescriptions)
    }

    /** @param audioDescriptions The encoding information for output audio. */
    public fun audioDescriptions(audioDescriptions: IResolvable) {
        cdkBuilder.audioDescriptions(audioDescriptions)
    }

    /** @param availBlanking The settings for ad avail blanking. */
    public fun availBlanking(availBlanking: IResolvable) {
        cdkBuilder.availBlanking(availBlanking)
    }

    /** @param availBlanking The settings for ad avail blanking. */
    public fun availBlanking(availBlanking: CfnChannel.AvailBlankingProperty) {
        cdkBuilder.availBlanking(availBlanking)
    }

    /** @param availConfiguration The configuration settings for the ad avail handling. */
    public fun availConfiguration(availConfiguration: IResolvable) {
        cdkBuilder.availConfiguration(availConfiguration)
    }

    /** @param availConfiguration The configuration settings for the ad avail handling. */
    public fun availConfiguration(availConfiguration: CfnChannel.AvailConfigurationProperty) {
        cdkBuilder.availConfiguration(availConfiguration)
    }

    /** @param blackoutSlate The settings for the blackout slate. */
    public fun blackoutSlate(blackoutSlate: IResolvable) {
        cdkBuilder.blackoutSlate(blackoutSlate)
    }

    /** @param blackoutSlate The settings for the blackout slate. */
    public fun blackoutSlate(blackoutSlate: CfnChannel.BlackoutSlateProperty) {
        cdkBuilder.blackoutSlate(blackoutSlate)
    }

    /** @param captionDescriptions The encoding information for output captions. */
    public fun captionDescriptions(vararg captionDescriptions: Any) {
        _captionDescriptions.addAll(listOf(*captionDescriptions))
    }

    /** @param captionDescriptions The encoding information for output captions. */
    public fun captionDescriptions(captionDescriptions: Collection<Any>) {
        _captionDescriptions.addAll(captionDescriptions)
    }

    /** @param captionDescriptions The encoding information for output captions. */
    public fun captionDescriptions(captionDescriptions: IResolvable) {
        cdkBuilder.captionDescriptions(captionDescriptions)
    }

    /** @param colorCorrectionSettings the value to be set. */
    public fun colorCorrectionSettings(colorCorrectionSettings: IResolvable) {
        cdkBuilder.colorCorrectionSettings(colorCorrectionSettings)
    }

    /** @param colorCorrectionSettings the value to be set. */
    public fun colorCorrectionSettings(
        colorCorrectionSettings: CfnChannel.ColorCorrectionSettingsProperty
    ) {
        cdkBuilder.colorCorrectionSettings(colorCorrectionSettings)
    }

    /** @param featureActivations Settings to enable specific features. */
    public fun featureActivations(featureActivations: IResolvable) {
        cdkBuilder.featureActivations(featureActivations)
    }

    /** @param featureActivations Settings to enable specific features. */
    public fun featureActivations(featureActivations: CfnChannel.FeatureActivationsProperty) {
        cdkBuilder.featureActivations(featureActivations)
    }

    /** @param globalConfiguration The configuration settings that apply to the entire channel. */
    public fun globalConfiguration(globalConfiguration: IResolvable) {
        cdkBuilder.globalConfiguration(globalConfiguration)
    }

    /** @param globalConfiguration The configuration settings that apply to the entire channel. */
    public fun globalConfiguration(globalConfiguration: CfnChannel.GlobalConfigurationProperty) {
        cdkBuilder.globalConfiguration(globalConfiguration)
    }

    /**
     * @param motionGraphicsConfiguration Settings to enable and configure the motion graphics
     *   overlay feature in the channel.
     */
    public fun motionGraphicsConfiguration(motionGraphicsConfiguration: IResolvable) {
        cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration)
    }

    /**
     * @param motionGraphicsConfiguration Settings to enable and configure the motion graphics
     *   overlay feature in the channel.
     */
    public fun motionGraphicsConfiguration(
        motionGraphicsConfiguration: CfnChannel.MotionGraphicsConfigurationProperty
    ) {
        cdkBuilder.motionGraphicsConfiguration(motionGraphicsConfiguration)
    }

    /** @param nielsenConfiguration The settings to configure Nielsen watermarks. */
    public fun nielsenConfiguration(nielsenConfiguration: IResolvable) {
        cdkBuilder.nielsenConfiguration(nielsenConfiguration)
    }

    /** @param nielsenConfiguration The settings to configure Nielsen watermarks. */
    public fun nielsenConfiguration(nielsenConfiguration: CfnChannel.NielsenConfigurationProperty) {
        cdkBuilder.nielsenConfiguration(nielsenConfiguration)
    }

    /** @param outputGroups The settings for the output groups in the channel. */
    public fun outputGroups(vararg outputGroups: Any) {
        _outputGroups.addAll(listOf(*outputGroups))
    }

    /** @param outputGroups The settings for the output groups in the channel. */
    public fun outputGroups(outputGroups: Collection<Any>) {
        _outputGroups.addAll(outputGroups)
    }

    /** @param outputGroups The settings for the output groups in the channel. */
    public fun outputGroups(outputGroups: IResolvable) {
        cdkBuilder.outputGroups(outputGroups)
    }

    /** @param thumbnailConfiguration the value to be set. */
    public fun thumbnailConfiguration(thumbnailConfiguration: IResolvable) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    /** @param thumbnailConfiguration the value to be set. */
    public fun thumbnailConfiguration(
        thumbnailConfiguration: CfnChannel.ThumbnailConfigurationProperty
    ) {
        cdkBuilder.thumbnailConfiguration(thumbnailConfiguration)
    }

    /**
     * @param timecodeConfig Contains settings used to acquire and adjust timecode information from
     *   the inputs.
     */
    public fun timecodeConfig(timecodeConfig: IResolvable) {
        cdkBuilder.timecodeConfig(timecodeConfig)
    }

    /**
     * @param timecodeConfig Contains settings used to acquire and adjust timecode information from
     *   the inputs.
     */
    public fun timecodeConfig(timecodeConfig: CfnChannel.TimecodeConfigProperty) {
        cdkBuilder.timecodeConfig(timecodeConfig)
    }

    /** @param videoDescriptions The encoding information for output videos. */
    public fun videoDescriptions(vararg videoDescriptions: Any) {
        _videoDescriptions.addAll(listOf(*videoDescriptions))
    }

    /** @param videoDescriptions The encoding information for output videos. */
    public fun videoDescriptions(videoDescriptions: Collection<Any>) {
        _videoDescriptions.addAll(videoDescriptions)
    }

    /** @param videoDescriptions The encoding information for output videos. */
    public fun videoDescriptions(videoDescriptions: IResolvable) {
        cdkBuilder.videoDescriptions(videoDescriptions)
    }

    public fun build(): CfnChannel.EncoderSettingsProperty {
        if (_audioDescriptions.isNotEmpty()) cdkBuilder.audioDescriptions(_audioDescriptions)
        if (_captionDescriptions.isNotEmpty()) cdkBuilder.captionDescriptions(_captionDescriptions)
        if (_outputGroups.isNotEmpty()) cdkBuilder.outputGroups(_outputGroups)
        if (_videoDescriptions.isNotEmpty()) cdkBuilder.videoDescriptions(_videoDescriptions)
        return cdkBuilder.build()
    }
}
