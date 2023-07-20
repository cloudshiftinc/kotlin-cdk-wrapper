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

package cloudshift.awscdk.dsl.services.qldb

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.qldb.CfnLedger
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnLedgerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnLedger.Builder = CfnLedger.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun deletionProtection(deletionProtection: Boolean) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun deletionProtection(deletionProtection: IResolvable) {
        cdkBuilder.deletionProtection(deletionProtection)
    }

    public fun kmsKey(kmsKey: String) {
        cdkBuilder.kmsKey(kmsKey)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun permissionsMode(permissionsMode: String) {
        cdkBuilder.permissionsMode(permissionsMode)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnLedger {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
