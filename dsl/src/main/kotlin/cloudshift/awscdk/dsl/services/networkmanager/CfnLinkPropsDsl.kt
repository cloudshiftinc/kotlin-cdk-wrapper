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

package cloudshift.awscdk.dsl.services.networkmanager

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.networkmanager.CfnLink
import software.amazon.awscdk.services.networkmanager.CfnLinkProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLinkPropsDsl {
    private val cdkBuilder: CfnLinkProps.Builder = CfnLinkProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun bandwidth(bandwidth: IResolvable) {
        cdkBuilder.bandwidth(bandwidth)
    }

    public fun bandwidth(bandwidth: CfnLink.BandwidthProperty) {
        cdkBuilder.bandwidth(bandwidth)
    }

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun globalNetworkId(globalNetworkId: String) {
        cdkBuilder.globalNetworkId(globalNetworkId)
    }

    public fun provider(provider: String) {
        cdkBuilder.provider(provider)
    }

    public fun siteId(siteId: String) {
        cdkBuilder.siteId(siteId)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnLinkProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
