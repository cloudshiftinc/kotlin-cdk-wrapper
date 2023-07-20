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

package cloudshift.awscdk.dsl.services.codegurureviewer

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.codegurureviewer.CfnRepositoryAssociation
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRepositoryAssociationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnRepositoryAssociation.Builder =
        CfnRepositoryAssociation.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun owner(owner: String) {
        cdkBuilder.owner(owner)
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

    public fun build(): CfnRepositoryAssociation {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
