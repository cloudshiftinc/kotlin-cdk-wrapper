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

package cloudshift.awscdk.dsl.services.cassandra

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cassandra.CfnKeyspace
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnKeyspaceDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnKeyspace.Builder = CfnKeyspace.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun keyspaceName(keyspaceName: String) {
        cdkBuilder.keyspaceName(keyspaceName)
    }

    public fun replicationSpecification(replicationSpecification: IResolvable) {
        cdkBuilder.replicationSpecification(replicationSpecification)
    }

    public fun replicationSpecification(replicationSpecification: CfnKeyspace.ReplicationSpecificationProperty) {
        cdkBuilder.replicationSpecification(replicationSpecification)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnKeyspace {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
