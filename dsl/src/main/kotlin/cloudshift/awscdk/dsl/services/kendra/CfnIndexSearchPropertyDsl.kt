@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Provides information about how a custom index field is used during a search.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * SearchProperty searchProperty = SearchProperty.builder()
 * .displayable(false)
 * .facetable(false)
 * .searchable(false)
 * .sortable(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-search.html)
 */
@CdkDslMarker
public class CfnIndexSearchPropertyDsl {
    private val cdkBuilder: CfnIndex.SearchProperty.Builder = CfnIndex.SearchProperty.builder()

    /**
     * @param displayable Determines whether the field is returned in the query response. The
     *   default is `true` .
     */
    public fun displayable(displayable: Boolean) {
        cdkBuilder.displayable(displayable)
    }

    /**
     * @param displayable Determines whether the field is returned in the query response. The
     *   default is `true` .
     */
    public fun displayable(displayable: IResolvable) {
        cdkBuilder.displayable(displayable)
    }

    /**
     * @param facetable Indicates that the field can be used to create search facets, a count of
     *   results for each value in the field. The default is `false` .
     */
    public fun facetable(facetable: Boolean) {
        cdkBuilder.facetable(facetable)
    }

    /**
     * @param facetable Indicates that the field can be used to create search facets, a count of
     *   results for each value in the field. The default is `false` .
     */
    public fun facetable(facetable: IResolvable) {
        cdkBuilder.facetable(facetable)
    }

    /**
     * @param searchable Determines whether the field is used in the search. If the `Searchable`
     *   field is `true` , you can use relevance tuning to manually tune how Amazon Kendra weights
     *   the field in the search. The default is `true` for string fields and `false` for number and
     *   date fields.
     */
    public fun searchable(searchable: Boolean) {
        cdkBuilder.searchable(searchable)
    }

    /**
     * @param searchable Determines whether the field is used in the search. If the `Searchable`
     *   field is `true` , you can use relevance tuning to manually tune how Amazon Kendra weights
     *   the field in the search. The default is `true` for string fields and `false` for number and
     *   date fields.
     */
    public fun searchable(searchable: IResolvable) {
        cdkBuilder.searchable(searchable)
    }

    /**
     * @param sortable Determines whether the field can be used to sort the results of a query. The
     *   default is `false` .
     */
    public fun sortable(sortable: Boolean) {
        cdkBuilder.sortable(sortable)
    }

    /**
     * @param sortable Determines whether the field can be used to sort the results of a query. The
     *   default is `false` .
     */
    public fun sortable(sortable: IResolvable) {
        cdkBuilder.sortable(sortable)
    }

    public fun build(): CfnIndex.SearchProperty = cdkBuilder.build()
}
