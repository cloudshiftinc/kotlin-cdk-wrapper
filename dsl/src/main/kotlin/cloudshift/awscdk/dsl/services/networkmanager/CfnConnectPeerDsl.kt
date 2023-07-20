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
import software.amazon.awscdk.services.networkmanager.CfnConnectPeer
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnConnectPeerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnConnectPeer.Builder = CfnConnectPeer.Builder.create(scope, id)

    private val _insideCidrBlocks: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun bgpOptions(bgpOptions: IResolvable) {
        cdkBuilder.bgpOptions(bgpOptions)
    }

    public fun bgpOptions(bgpOptions: CfnConnectPeer.BgpOptionsProperty) {
        cdkBuilder.bgpOptions(bgpOptions)
    }

    public fun connectAttachmentId(connectAttachmentId: String) {
        cdkBuilder.connectAttachmentId(connectAttachmentId)
    }

    public fun coreNetworkAddress(coreNetworkAddress: String) {
        cdkBuilder.coreNetworkAddress(coreNetworkAddress)
    }

    public fun insideCidrBlocks(vararg insideCidrBlocks: String) {
        _insideCidrBlocks.addAll(listOf(*insideCidrBlocks))
    }

    public fun insideCidrBlocks(insideCidrBlocks: Collection<String>) {
        _insideCidrBlocks.addAll(insideCidrBlocks)
    }

    public fun peerAddress(peerAddress: String) {
        cdkBuilder.peerAddress(peerAddress)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnConnectPeer {
        if (_insideCidrBlocks.isNotEmpty()) cdkBuilder.insideCidrBlocks(_insideCidrBlocks)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
