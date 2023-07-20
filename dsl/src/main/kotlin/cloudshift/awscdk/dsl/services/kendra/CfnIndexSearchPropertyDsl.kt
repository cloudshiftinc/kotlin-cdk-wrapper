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

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex
import kotlin.Boolean

@CdkDslMarker
public class CfnIndexSearchPropertyDsl {
    private val cdkBuilder: CfnIndex.SearchProperty.Builder = CfnIndex.SearchProperty.builder()

    public fun displayable(displayable: Boolean) {
        cdkBuilder.displayable(displayable)
    }

    public fun displayable(displayable: IResolvable) {
        cdkBuilder.displayable(displayable)
    }

    public fun facetable(facetable: Boolean) {
        cdkBuilder.facetable(facetable)
    }

    public fun facetable(facetable: IResolvable) {
        cdkBuilder.facetable(facetable)
    }

    public fun searchable(searchable: Boolean) {
        cdkBuilder.searchable(searchable)
    }

    public fun searchable(searchable: IResolvable) {
        cdkBuilder.searchable(searchable)
    }

    public fun sortable(sortable: Boolean) {
        cdkBuilder.sortable(sortable)
    }

    public fun sortable(sortable: IResolvable) {
        cdkBuilder.sortable(sortable)
    }

    public fun build(): CfnIndex.SearchProperty = cdkBuilder.build()
}
