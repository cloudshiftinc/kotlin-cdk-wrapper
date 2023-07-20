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

package cloudshift.awscdk.dsl.services.mediapackage

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediapackage.CfnChannel
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnChannelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnChannel.Builder = CfnChannel.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    public fun egressAccessLogs(egressAccessLogs: IResolvable) {
        cdkBuilder.egressAccessLogs(egressAccessLogs)
    }

    public fun egressAccessLogs(egressAccessLogs: CfnChannel.LogConfigurationProperty) {
        cdkBuilder.egressAccessLogs(egressAccessLogs)
    }

    public fun hlsIngest(hlsIngest: IResolvable) {
        cdkBuilder.hlsIngest(hlsIngest)
    }

    public fun hlsIngest(hlsIngest: CfnChannel.HlsIngestProperty) {
        cdkBuilder.hlsIngest(hlsIngest)
    }

    public fun id(id: String) {
        cdkBuilder.id(id)
    }

    public fun ingressAccessLogs(ingressAccessLogs: IResolvable) {
        cdkBuilder.ingressAccessLogs(ingressAccessLogs)
    }

    public fun ingressAccessLogs(ingressAccessLogs: CfnChannel.LogConfigurationProperty) {
        cdkBuilder.ingressAccessLogs(ingressAccessLogs)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnChannel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
