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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex

/**
 * Specifies the properties, such as relevance tuning and searchability, of an index field.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * DocumentMetadataConfigurationProperty documentMetadataConfigurationProperty =
 * DocumentMetadataConfigurationProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .relevance(RelevanceProperty.builder()
 * .duration("duration")
 * .freshness(false)
 * .importance(123)
 * .rankOrder("rankOrder")
 * .valueImportanceItems(List.of(ValueImportanceItemProperty.builder()
 * .key("key")
 * .value(123)
 * .build()))
 * .build())
 * .search(SearchProperty.builder()
 * .displayable(false)
 * .facetable(false)
 * .searchable(false)
 * .sortable(false)
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-index-documentmetadataconfiguration.html)
 */
@CdkDslMarker
public class CfnIndexDocumentMetadataConfigurationPropertyDsl {
    private val cdkBuilder: CfnIndex.DocumentMetadataConfigurationProperty.Builder =
        CfnIndex.DocumentMetadataConfigurationProperty.builder()

    /** @param name The name of the index field. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param relevance Provides tuning parameters to determine how the field affects the search
     *   results.
     */
    public fun relevance(relevance: IResolvable) {
        cdkBuilder.relevance(relevance)
    }

    /**
     * @param relevance Provides tuning parameters to determine how the field affects the search
     *   results.
     */
    public fun relevance(relevance: CfnIndex.RelevanceProperty) {
        cdkBuilder.relevance(relevance)
    }

    /** @param search Provides information about how the field is used during a search. */
    public fun search(search: IResolvable) {
        cdkBuilder.search(search)
    }

    /** @param search Provides information about how the field is used during a search. */
    public fun search(search: CfnIndex.SearchProperty) {
        cdkBuilder.search(search)
    }

    /** @param type The data type of the index field. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnIndex.DocumentMetadataConfigurationProperty = cdkBuilder.build()
}
