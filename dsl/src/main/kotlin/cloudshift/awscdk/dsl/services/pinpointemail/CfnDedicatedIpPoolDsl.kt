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

package cloudshift.awscdk.dsl.services.pinpointemail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.pinpointemail.CfnDedicatedIpPool
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnDedicatedIpPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnDedicatedIpPool.Builder = CfnDedicatedIpPool.Builder.create(scope, id)

    private val _tags: MutableList<CfnDedicatedIpPool.TagsProperty> = mutableListOf()

    public fun poolName(poolName: String) {
        cdkBuilder.poolName(poolName)
    }

    public fun tags(tags: CfnDedicatedIpPoolTagsPropertyDsl.() -> Unit) {
        _tags.add(CfnDedicatedIpPoolTagsPropertyDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnDedicatedIpPool.TagsProperty>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnDedicatedIpPool {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
