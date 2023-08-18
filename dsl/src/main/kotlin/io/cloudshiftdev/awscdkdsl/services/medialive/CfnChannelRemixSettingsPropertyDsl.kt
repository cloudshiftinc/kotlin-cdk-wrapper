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
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The settings for remixing audio in the output.
 *
 * The parent of this entity is AudioDescription.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * RemixSettingsProperty remixSettingsProperty = RemixSettingsProperty.builder()
 * .channelMappings(List.of(AudioChannelMappingProperty.builder()
 * .inputChannelLevels(List.of(InputChannelLevelProperty.builder()
 * .gain(123)
 * .inputChannel(123)
 * .build()))
 * .outputChannel(123)
 * .build()))
 * .channelsIn(123)
 * .channelsOut(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-remixsettings.html)
 */
@CdkDslMarker
public class CfnChannelRemixSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.RemixSettingsProperty.Builder =
        CfnChannel.RemixSettingsProperty.builder()

    private val _channelMappings: MutableList<Any> = mutableListOf()

    /**
     * @param channelMappings A mapping of input channels to output channels, with appropriate gain
     *   adjustments.
     */
    public fun channelMappings(vararg channelMappings: Any) {
        _channelMappings.addAll(listOf(*channelMappings))
    }

    /**
     * @param channelMappings A mapping of input channels to output channels, with appropriate gain
     *   adjustments.
     */
    public fun channelMappings(channelMappings: Collection<Any>) {
        _channelMappings.addAll(channelMappings)
    }

    /**
     * @param channelMappings A mapping of input channels to output channels, with appropriate gain
     *   adjustments.
     */
    public fun channelMappings(channelMappings: IResolvable) {
        cdkBuilder.channelMappings(channelMappings)
    }

    /** @param channelsIn The number of input channels to be used. */
    public fun channelsIn(channelsIn: Number) {
        cdkBuilder.channelsIn(channelsIn)
    }

    /**
     * @param channelsOut The number of output channels to be produced. Valid values: 1, 2, 4, 6, 8.
     */
    public fun channelsOut(channelsOut: Number) {
        cdkBuilder.channelsOut(channelsOut)
    }

    public fun build(): CfnChannel.RemixSettingsProperty {
        if (_channelMappings.isNotEmpty()) cdkBuilder.channelMappings(_channelMappings)
        return cdkBuilder.build()
    }
}
