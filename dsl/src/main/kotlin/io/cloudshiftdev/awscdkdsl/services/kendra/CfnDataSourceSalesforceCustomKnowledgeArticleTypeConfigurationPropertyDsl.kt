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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for indexing Salesforce custom articles.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * SalesforceCustomKnowledgeArticleTypeConfigurationProperty
 * salesforceCustomKnowledgeArticleTypeConfigurationProperty =
 * SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
 * .name("name")
 * // the properties below are optional
 * .documentTitleFieldName("documentTitleFieldName")
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcecustomknowledgearticletypeconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceSalesforceCustomKnowledgeArticleTypeConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty.Builder =
        CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty.builder()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    /**
     * @param documentDataFieldName The name of the field in the custom knowledge article that
     *   contains the document data to index.
     */
    public fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
    }

    /**
     * @param documentTitleFieldName The name of the field in the custom knowledge article that
     *   contains the document title.
     */
    public fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
    }

    /**
     * @param fieldMappings Maps attributes or field names of the custom knowledge article to Amazon
     *   Kendra index field names. To create custom fields, use the `UpdateIndex` API before you map
     *   to Salesforce fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Salesforce data source field names must exist in your Salesforce custom metadata.
     */
    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    /**
     * @param fieldMappings Maps attributes or field names of the custom knowledge article to Amazon
     *   Kendra index field names. To create custom fields, use the `UpdateIndex` API before you map
     *   to Salesforce fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Salesforce data source field names must exist in your Salesforce custom metadata.
     */
    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    /**
     * @param fieldMappings Maps attributes or field names of the custom knowledge article to Amazon
     *   Kendra index field names. To create custom fields, use the `UpdateIndex` API before you map
     *   to Salesforce fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Salesforce data source field names must exist in your Salesforce custom metadata.
     */
    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    /** @param name The name of the configuration. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnDataSource.SalesforceCustomKnowledgeArticleTypeConfigurationProperty {
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        return cdkBuilder.build()
    }
}
