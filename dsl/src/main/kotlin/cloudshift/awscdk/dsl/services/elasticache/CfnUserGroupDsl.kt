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

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.elasticache.CfnUserGroup
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnUserGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUserGroup.Builder = CfnUserGroup.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    private val _userIds: MutableList<String> = mutableListOf()

    public fun engine(engine: String) {
        cdkBuilder.engine(engine)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun userGroupId(userGroupId: String) {
        cdkBuilder.userGroupId(userGroupId)
    }

    public fun userIds(vararg userIds: String) {
        _userIds.addAll(listOf(*userIds))
    }

    public fun userIds(userIds: Collection<String>) {
        _userIds.addAll(userIds)
    }

    public fun build(): CfnUserGroup {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        if (_userIds.isNotEmpty()) cdkBuilder.userIds(_userIds)
        return cdkBuilder.build()
    }
}
