@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceServiceNowServiceCatalogConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.Builder =
      CfnDataSource.ServiceNowServiceCatalogConfigurationProperty.builder()

  private val _excludeAttachmentFilePatterns: MutableList<String> = mutableListOf()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  private val _includeAttachmentFilePatterns: MutableList<String> = mutableListOf()

  /**
   * @param crawlAttachments `TRUE` to index attachments to service catalog items.
   */
  public fun crawlAttachments(crawlAttachments: Boolean) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  /**
   * @param crawlAttachments `TRUE` to index attachments to service catalog items.
   */
  public fun crawlAttachments(crawlAttachments: IResolvable) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  /**
   * @param documentDataFieldName The name of the ServiceNow field that is mapped to the index
   * document contents field in the Amazon Kendra index. 
   */
  public fun documentDataFieldName(documentDataFieldName: String) {
    cdkBuilder.documentDataFieldName(documentDataFieldName)
  }

  /**
   * @param documentTitleFieldName The name of the ServiceNow field that is mapped to the index
   * document title field.
   */
  public fun documentTitleFieldName(documentTitleFieldName: String) {
    cdkBuilder.documentTitleFieldName(documentTitleFieldName)
  }

  /**
   * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude certain
   * attachments of catalogs in your ServiceNow.
   * Item that match the patterns are excluded from the index. Items that don't match the patterns
   * are included in the index. If an item matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the item isn't included in the index.
   *
   * The regex is applied to the file name of the attachment.
   */
  public fun excludeAttachmentFilePatterns(vararg excludeAttachmentFilePatterns: String) {
    _excludeAttachmentFilePatterns.addAll(listOf(*excludeAttachmentFilePatterns))
  }

  /**
   * @param excludeAttachmentFilePatterns A list of regular expression patterns to exclude certain
   * attachments of catalogs in your ServiceNow.
   * Item that match the patterns are excluded from the index. Items that don't match the patterns
   * are included in the index. If an item matches both an inclusion and exclusion pattern, the
   * exclusion pattern takes precedence and the item isn't included in the index.
   *
   * The regex is applied to the file name of the attachment.
   */
  public fun excludeAttachmentFilePatterns(excludeAttachmentFilePatterns: Collection<String>) {
    _excludeAttachmentFilePatterns.addAll(excludeAttachmentFilePatterns)
  }

  /**
   * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index field
   * names.
   * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
   * source field names must exist in your ServiceNow custom metadata.
   */
  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  /**
   * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index field
   * names.
   * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
   * source field names must exist in your ServiceNow custom metadata.
   */
  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  /**
   * @param fieldMappings Maps attributes or field names of catalogs to Amazon Kendra index field
   * names.
   * To create custom fields, use the `UpdateIndex` API before you map to ServiceNow fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The ServiceNow data
   * source field names must exist in your ServiceNow custom metadata.
   */
  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  /**
   * @param includeAttachmentFilePatterns A list of regular expression patterns to include certain
   * attachments of catalogs in your ServiceNow.
   * Item that match the patterns are included in the index. Items that don't match the patterns are
   * excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion
   * pattern takes precedence and the item isn't included in the index.
   *
   * The regex is applied to the file name of the attachment.
   */
  public fun includeAttachmentFilePatterns(vararg includeAttachmentFilePatterns: String) {
    _includeAttachmentFilePatterns.addAll(listOf(*includeAttachmentFilePatterns))
  }

  /**
   * @param includeAttachmentFilePatterns A list of regular expression patterns to include certain
   * attachments of catalogs in your ServiceNow.
   * Item that match the patterns are included in the index. Items that don't match the patterns are
   * excluded from the index. If an item matches both an inclusion and exclusion pattern, the exclusion
   * pattern takes precedence and the item isn't included in the index.
   *
   * The regex is applied to the file name of the attachment.
   */
  public fun includeAttachmentFilePatterns(includeAttachmentFilePatterns: Collection<String>) {
    _includeAttachmentFilePatterns.addAll(includeAttachmentFilePatterns)
  }

  public fun build(): CfnDataSource.ServiceNowServiceCatalogConfigurationProperty {
    if(_excludeAttachmentFilePatterns.isNotEmpty())
        cdkBuilder.excludeAttachmentFilePatterns(_excludeAttachmentFilePatterns)
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    if(_includeAttachmentFilePatterns.isNotEmpty())
        cdkBuilder.includeAttachmentFilePatterns(_includeAttachmentFilePatterns)
    return cdkBuilder.build()
  }
}
