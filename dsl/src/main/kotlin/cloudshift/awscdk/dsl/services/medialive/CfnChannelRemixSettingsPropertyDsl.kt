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
import kotlin.Any
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnChannelRemixSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.RemixSettingsProperty.Builder =
        CfnChannel.RemixSettingsProperty.builder()

    private val _channelMappings: MutableList<Any> = mutableListOf()

    public fun channelMappings(vararg channelMappings: Any) {
        _channelMappings.addAll(listOf(*channelMappings))
    }

    public fun channelMappings(channelMappings: Collection<Any>) {
        _channelMappings.addAll(channelMappings)
    }

    public fun channelMappings(channelMappings: IResolvable) {
        cdkBuilder.channelMappings(channelMappings)
    }

    public fun channelsIn(channelsIn: Number) {
        cdkBuilder.channelsIn(channelsIn)
    }

    public fun channelsOut(channelsOut: Number) {
        cdkBuilder.channelsOut(channelsOut)
    }

    public fun build(): CfnChannel.RemixSettingsProperty {
        if (_channelMappings.isNotEmpty()) cdkBuilder.channelMappings(_channelMappings)
        return cdkBuilder.build()
    }
}
