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

package io.cloudshiftdev.awscdkdsl.services.mediatailor

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediatailor.CfnChannel
import software.constructs.Construct

/**
 * Definition of AWS::MediaTailor::Channel Resource Type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.mediatailor.*;
 * CfnChannel cfnChannel = CfnChannel.Builder.create(this, "MyCfnChannel")
 * .channelName("channelName")
 * .outputs(List.of(RequestOutputItemProperty.builder()
 * .manifestName("manifestName")
 * .sourceGroup("sourceGroup")
 * // the properties below are optional
 * .dashPlaylistSettings(DashPlaylistSettingsProperty.builder()
 * .manifestWindowSeconds(123)
 * .minBufferTimeSeconds(123)
 * .minUpdatePeriodSeconds(123)
 * .suggestedPresentationDelaySeconds(123)
 * .build())
 * .hlsPlaylistSettings(HlsPlaylistSettingsProperty.builder()
 * .manifestWindowSeconds(123)
 * .build())
 * .build()))
 * .playbackMode("playbackMode")
 * // the properties below are optional
 * .fillerSlate(SlateSourceProperty.builder()
 * .sourceLocationName("sourceLocationName")
 * .vodSourceName("vodSourceName")
 * .build())
 * .logConfiguration(LogConfigurationForChannelProperty.builder()
 * .logTypes(List.of("logTypes"))
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tier("tier")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html)
 */
@CdkDslMarker
public class CfnChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

    private val _outputs: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-channelname)
     *
     * @param channelName
     */
    public fun channelName(channelName: String) {
        cdkBuilder.channelName(channelName)
    }

    /**
     * Slate VOD source configuration.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     *
     * @param fillerSlate Slate VOD source configuration.</p>.
     */
    public fun fillerSlate(fillerSlate: IResolvable) {
        cdkBuilder.fillerSlate(fillerSlate)
    }

    /**
     * Slate VOD source configuration.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-fillerslate)
     *
     * @param fillerSlate Slate VOD source configuration.</p>.
     */
    public fun fillerSlate(fillerSlate: CfnChannel.SlateSourceProperty) {
        cdkBuilder.fillerSlate(fillerSlate)
    }

    /**
     * The log configuration for the channel.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     *
     * @param logConfiguration The log configuration for the channel.</p>.
     */
    public fun logConfiguration(logConfiguration: IResolvable) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * The log configuration for the channel.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-logconfiguration)
     *
     * @param logConfiguration The log configuration for the channel.</p>.
     */
    public fun logConfiguration(logConfiguration: CfnChannel.LogConfigurationForChannelProperty) {
        cdkBuilder.logConfiguration(logConfiguration)
    }

    /**
     * The channel's output properties.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     *
     * @param outputs The channel's output properties.</p>.
     */
    public fun outputs(vararg outputs: Any) {
        _outputs.addAll(listOf(*outputs))
    }

    /**
     * The channel's output properties.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     *
     * @param outputs The channel's output properties.</p>.
     */
    public fun outputs(outputs: Collection<Any>) {
        _outputs.addAll(outputs)
    }

    /**
     * The channel's output properties.</p>.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-outputs)
     *
     * @param outputs The channel's output properties.</p>.
     */
    public fun outputs(outputs: IResolvable) {
        cdkBuilder.outputs(outputs)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-playbackmode)
     *
     * @param playbackMode
     */
    public fun playbackMode(playbackMode: String) {
        cdkBuilder.playbackMode(playbackMode)
    }

    /**
     * The tags to assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     *
     * @param tags The tags to assign to the channel.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The tags to assign to the channel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tags)
     *
     * @param tags The tags to assign to the channel.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediatailor-channel.html#cfn-mediatailor-channel-tier)
     *
     * @param tier
     */
    public fun tier(tier: String) {
        cdkBuilder.tier(tier)
    }

    public fun build(): CfnChannel {
        if (_outputs.isNotEmpty()) cdkBuilder.outputs(_outputs)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
