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

package cloudshift.awscdk.dsl.services.ivs

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ivs.CfnChannel
import software.constructs.Construct
import kotlin.Boolean
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

    public fun authorized(authorized: Boolean) {
        cdkBuilder.authorized(authorized)
    }

    public fun authorized(authorized: IResolvable) {
        cdkBuilder.authorized(authorized)
    }

    public fun insecureIngest(insecureIngest: Boolean) {
        cdkBuilder.insecureIngest(insecureIngest)
    }

    public fun insecureIngest(insecureIngest: IResolvable) {
        cdkBuilder.insecureIngest(insecureIngest)
    }

    public fun latencyMode(latencyMode: String) {
        cdkBuilder.latencyMode(latencyMode)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun preset(preset: String) {
        cdkBuilder.preset(preset)
    }

    public fun recordingConfigurationArn(recordingConfigurationArn: String) {
        cdkBuilder.recordingConfigurationArn(recordingConfigurationArn)
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

    public fun build(): CfnChannel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
