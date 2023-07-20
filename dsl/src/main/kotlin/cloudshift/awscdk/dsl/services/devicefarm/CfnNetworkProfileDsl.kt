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

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.devicefarm.CfnNetworkProfile
import software.constructs.Construct
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnNetworkProfileDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnNetworkProfile.Builder = CfnNetworkProfile.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun downlinkBandwidthBits(downlinkBandwidthBits: Number) {
        cdkBuilder.downlinkBandwidthBits(downlinkBandwidthBits)
    }

    public fun downlinkDelayMs(downlinkDelayMs: Number) {
        cdkBuilder.downlinkDelayMs(downlinkDelayMs)
    }

    public fun downlinkJitterMs(downlinkJitterMs: Number) {
        cdkBuilder.downlinkJitterMs(downlinkJitterMs)
    }

    public fun downlinkLossPercent(downlinkLossPercent: Number) {
        cdkBuilder.downlinkLossPercent(downlinkLossPercent)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun projectArn(projectArn: String) {
        cdkBuilder.projectArn(projectArn)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun uplinkBandwidthBits(uplinkBandwidthBits: Number) {
        cdkBuilder.uplinkBandwidthBits(uplinkBandwidthBits)
    }

    public fun uplinkDelayMs(uplinkDelayMs: Number) {
        cdkBuilder.uplinkDelayMs(uplinkDelayMs)
    }

    public fun uplinkJitterMs(uplinkJitterMs: Number) {
        cdkBuilder.uplinkJitterMs(uplinkJitterMs)
    }

    public fun uplinkLossPercent(uplinkLossPercent: Number) {
        cdkBuilder.uplinkLossPercent(uplinkLossPercent)
    }

    public fun build(): CfnNetworkProfile {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
