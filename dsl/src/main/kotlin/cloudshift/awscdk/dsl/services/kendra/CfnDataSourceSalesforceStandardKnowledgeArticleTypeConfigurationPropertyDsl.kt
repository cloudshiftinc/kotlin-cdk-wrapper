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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for standard Salesforce knowledge articles.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * SalesforceStandardKnowledgeArticleTypeConfigurationProperty
 * salesforceStandardKnowledgeArticleTypeConfigurationProperty =
 * SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardknowledgearticletypeconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceSalesforceStandardKnowledgeArticleTypeConfigurationPropertyDsl {
    private val cdkBuilder:
        CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty.Builder =
        CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty.builder()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    /**
     * @param documentDataFieldName The name of the field that contains the document data to index.
     */
    public fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
    }

    /** @param documentTitleFieldName The name of the field that contains the document title. */
    public fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
    }

    /**
     * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   Salesforce fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Salesforce data source field names must exist in your Salesforce custom metadata.
     */
    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    /**
     * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   Salesforce fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Salesforce data source field names must exist in your Salesforce custom metadata.
     */
    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    /**
     * @param fieldMappings Maps attributes or field names of the knowledge article to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   Salesforce fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The Salesforce data source field names must exist in your Salesforce custom metadata.
     */
    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    public fun build(): CfnDataSource.SalesforceStandardKnowledgeArticleTypeConfigurationProperty {
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        return cdkBuilder.build()
    }
}
