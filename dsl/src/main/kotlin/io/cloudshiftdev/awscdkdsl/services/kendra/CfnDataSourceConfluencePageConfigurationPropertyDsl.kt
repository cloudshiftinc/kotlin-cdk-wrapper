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

package io.cloudshiftdev.awscdkdsl.services.kendra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Configuration of the page settings for the Confluence data source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ConfluencePageConfigurationProperty confluencePageConfigurationProperty =
 * ConfluencePageConfigurationProperty.builder()
 * .pageFieldMappings(List.of(ConfluencePageToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluencepageconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceConfluencePageConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ConfluencePageConfigurationProperty.Builder =
        CfnDataSource.ConfluencePageConfigurationProperty.builder()

    private val _pageFieldMappings: MutableList<Any> = mutableListOf()

    /**
     * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   Confluence fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `PageFieldMappings` parameter, you must specify at least one field
     * mapping.
     */
    public fun pageFieldMappings(vararg pageFieldMappings: Any) {
        _pageFieldMappings.addAll(listOf(*pageFieldMappings))
    }

    /**
     * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   Confluence fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `PageFieldMappings` parameter, you must specify at least one field
     * mapping.
     */
    public fun pageFieldMappings(pageFieldMappings: Collection<Any>) {
        _pageFieldMappings.addAll(pageFieldMappings)
    }

    /**
     * @param pageFieldMappings Maps attributes or field names of Confluence pages to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   Confluence fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Confluence data source field names must exist in your Confluence custom metadata.
     *
     * If you specify the `PageFieldMappings` parameter, you must specify at least one field
     * mapping.
     */
    public fun pageFieldMappings(pageFieldMappings: IResolvable) {
        cdkBuilder.pageFieldMappings(pageFieldMappings)
    }

    public fun build(): CfnDataSource.ConfluencePageConfigurationProperty {
        if (_pageFieldMappings.isNotEmpty()) cdkBuilder.pageFieldMappings(_pageFieldMappings)
        return cdkBuilder.build()
    }
}
