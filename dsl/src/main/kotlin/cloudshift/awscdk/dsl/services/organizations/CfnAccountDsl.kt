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

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.organizations.CfnAccount
import software.constructs.Construct
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnAccountDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAccount.Builder = CfnAccount.Builder.create(scope, id)

    private val _parentIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun accountName(accountName: String) {
        cdkBuilder.accountName(accountName)
    }

    public fun email(email: String) {
        cdkBuilder.email(email)
    }

    public fun parentIds(vararg parentIds: String) {
        _parentIds.addAll(listOf(*parentIds))
    }

    public fun parentIds(parentIds: Collection<String>) {
        _parentIds.addAll(parentIds)
    }

    public fun roleName(roleName: String) {
        cdkBuilder.roleName(roleName)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnAccount {
        if (_parentIds.isNotEmpty()) cdkBuilder.parentIds(_parentIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
