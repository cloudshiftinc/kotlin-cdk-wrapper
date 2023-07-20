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

package cloudshift.awscdk.dsl.cloudassembly.schema

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.cloudassembly.schema.AmiContextQuery
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.collections.MutableList

@CdkDslMarker
public class AmiContextQueryDsl {
    private val cdkBuilder: AmiContextQuery.Builder = AmiContextQuery.builder()

    private val _owners: MutableList<String> = mutableListOf()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun filters(filters: Map<String, List<String>>) {
        cdkBuilder.filters(filters)
    }

    public fun lookupRoleArn(lookupRoleArn: String) {
        cdkBuilder.lookupRoleArn(lookupRoleArn)
    }

    public fun owners(vararg owners: String) {
        _owners.addAll(listOf(*owners))
    }

    public fun owners(owners: Collection<String>) {
        _owners.addAll(owners)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): AmiContextQuery {
        if (_owners.isNotEmpty()) cdkBuilder.owners(_owners)
        return cdkBuilder.build()
    }
}
