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
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for crawling knowledge articles in the ServiceNow site.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ServiceNowKnowledgeArticleConfigurationProperty serviceNowKnowledgeArticleConfigurationProperty =
 * ServiceNowKnowledgeArticleConfigurationProperty.builder()
 * .documentDataFieldName("documentDataFieldName")
 * // the properties below are optional
 * .crawlAttachments(false)
 * .documentTitleFieldName("documentTitleFieldName")
 * .excludeAttachmentFilePatterns(List.of("excludeAttachmentFilePatterns"))
 * .fieldMappings(List.of(DataSourceToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .filterQuery("filterQuery")
 * .includeAttachmentFilePatterns(List.of("includeAttachmentFilePatterns"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-servicenowknowledgearticleconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceServiceNowKnowledgeArticleConfigurationPropertyDsl {
    private val cdkBuilder: CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.Builder =
        CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty.builder()

    private val _excludeAttachmentFilePatterns: MutableList<String> = mutableListOf()

    private val _fieldMappings: MutableList<Any> = mutableListOf()

    private val _includeAttachmentFilePatterns: MutableList<String> = mutableListOf()

    /** @param crawlAttachments `TRUE` to index attachments to knowledge articles. */
    public fun crawlAttachments(crawlAttachments: Boolean) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    /** @param crawlAttachments `TRUE` to index attachments to knowledge articles. */
    public fun crawlAttachments(crawlAttachments: IResolvable) {
        cdkBuilder.crawlAttachments(crawlAttachments)
    }

    /**
     * @param documentDataFieldName The name of the ServiceNow field that is mapped to the index
     *   document contents field in the Amazon Kendra index.
     */
    public fun documentDataFieldName(documentDataFieldName: String) {
        cdkBuilder.documentDataFieldName(documentDataFieldName)
    }

    /**
     * @param documentTitleFieldName The name of the ServiceNow field that is mapped to the index
     *   document title field.
     */
    public fun documentTitleFieldName(documentTitleFieldName: String) {
        cdkBuilder.documentTitleFieldName(documentTitleFieldName)
    }

    /**
     * @param excludeAttachmentFilePatterns A list of regular expression patterns applied to exclude
     *   certain knowledge article attachments. Attachments that match the patterns are excluded
     *   from the index. Items that don't match the patterns are included in the index. If an item
     *   matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and
     *   the item isn't included in the index.
     */
    public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String) {
        _excludeAttachmentFilePatterns.addAll(listOf(*excludeAttachmentFilePatterns))
    }

    /**
     * @param excludeAttachmentFilePatterns A list of regular expression patterns applied to exclude
     *   certain knowledge article attachments. Attachments that match the patterns are excluded
     *   from the index. Items that don't match the patterns are included in the index. If an item
     *   matches both an inclusion and exclusion pattern, the exclusion pattern takes precedence and
     *   the item isn't included in the index.
     */
    public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: Collection<String>) {
        _excludeAttachmentFilePatterns.addAll(excludeAttachmentFilePatterns)
    }

    /**
     * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   ServiceNow fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The ServiceNow data source field names must exist in your ServiceNow custom metadata.
     */
    public fun fieldMappings(vararg fieldMappings: Any) {
        _fieldMappings.addAll(listOf(*fieldMappings))
    }

    /**
     * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   ServiceNow fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The ServiceNow data source field names must exist in your ServiceNow custom metadata.
     */
    public fun fieldMappings(fieldMappings: Collection<Any>) {
        _fieldMappings.addAll(fieldMappings)
    }

    /**
     * @param fieldMappings Maps attributes or field names of knoweldge articles to Amazon Kendra
     *   index field names. To create custom fields, use the `UpdateIndex` API before you map to
     *   ServiceNow fields. For more information, see
     *   [Mapping data source fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html)
     *   . The ServiceNow data source field names must exist in your ServiceNow custom metadata.
     */
    public fun fieldMappings(fieldMappings: IResolvable) {
        cdkBuilder.fieldMappings(fieldMappings)
    }

    /**
     * @param filterQuery A query that selects the knowledge articles to index. The query can return
     *   articles from multiple knowledge bases, and the knowledge bases can be public or private.
     *
     * The query string must be one generated by the ServiceNow console. For more information, see
     * [Specifying documents to index with a query](https://docs.aws.amazon.com/kendra/latest/dg/servicenow-query.html)
     * .
     */
    public fun filterQuery(filterQuery: String) {
        cdkBuilder.filterQuery(filterQuery)
    }

    /**
     * @param includeAttachmentFilePatterns A list of regular expression patterns applied to include
     *   knowledge article attachments. Attachments that match the patterns are included in the
     *   index. Items that don't match the patterns are excluded from the index. If an item matches
     *   both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     *   item isn't included in the index.
     */
    public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String) {
        _includeAttachmentFilePatterns.addAll(listOf(*includeAttachmentFilePatterns))
    }

    /**
     * @param includeAttachmentFilePatterns A list of regular expression patterns applied to include
     *   knowledge article attachments. Attachments that match the patterns are included in the
     *   index. Items that don't match the patterns are excluded from the index. If an item matches
     *   both an inclusion and exclusion pattern, the exclusion pattern takes precedence and the
     *   item isn't included in the index.
     */
    public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: Collection<String>) {
        _includeAttachmentFilePatterns.addAll(includeAttachmentFilePatterns)
    }

    public fun build(): CfnDataSource.ServiceNowKnowledgeArticleConfigurationProperty {
        if (_excludeAttachmentFilePatterns.isNotEmpty())
            cdkBuilder.excludeAttachmentFilePatterns(_excludeAttachmentFilePatterns)
        if (_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
        if (_includeAttachmentFilePatterns.isNotEmpty())
            cdkBuilder.includeAttachmentFilePatterns(_includeAttachmentFilePatterns)
        return cdkBuilder.build()
    }
}
