@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Configuration of attachment settings for the Confluence data source.
 *
 * Attachment settings are optional, if you don't specify settings attachments, Amazon Kendra won't
 * index them.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * ConfluenceAttachmentConfigurationProperty confluenceAttachmentConfigurationProperty =
 * ConfluenceAttachmentConfigurationProperty.builder()
 * .attachmentFieldMappings(List.of(ConfluenceAttachmentToIndexFieldMappingProperty.builder()
 * .dataSourceFieldName("dataSourceFieldName")
 * .indexFieldName("indexFieldName")
 * // the properties below are optional
 * .dateFieldFormat("dateFieldFormat")
 * .build()))
 * .crawlAttachments(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-confluenceattachmentconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceConfluenceAttachmentConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluenceAttachmentConfigurationProperty.Builder =
      CfnDataSource.ConfluenceAttachmentConfigurationProperty.builder()

  private val _attachmentFieldMappings: MutableList<Any> = mutableListOf()

  /**
   * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
   * Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
   * mapping.
   */
  public fun attachmentFieldMappings(vararg attachmentFieldMappings: Any) {
    _attachmentFieldMappings.addAll(listOf(*attachmentFieldMappings))
  }

  /**
   * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
   * Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
   * mapping.
   */
  public fun attachmentFieldMappings(attachmentFieldMappings: Collection<Any>) {
    _attachmentFieldMappings.addAll(attachmentFieldMappings)
  }

  /**
   * @param attachmentFieldMappings Maps attributes or field names of Confluence attachments to
   * Amazon Kendra index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * If you specify the `AttachentFieldMappings` parameter, you must specify at least one field
   * mapping.
   */
  public fun attachmentFieldMappings(attachmentFieldMappings: IResolvable) {
    cdkBuilder.attachmentFieldMappings(attachmentFieldMappings)
  }

  /**
   * @param crawlAttachments `TRUE` to index attachments of pages and blogs in Confluence.
   */
  public fun crawlAttachments(crawlAttachments: Boolean) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  /**
   * @param crawlAttachments `TRUE` to index attachments of pages and blogs in Confluence.
   */
  public fun crawlAttachments(crawlAttachments: IResolvable) {
    cdkBuilder.crawlAttachments(crawlAttachments)
  }

  public fun build(): CfnDataSource.ConfluenceAttachmentConfigurationProperty {
    if(_attachmentFieldMappings.isNotEmpty())
        cdkBuilder.attachmentFieldMappings(_attachmentFieldMappings)
    return cdkBuilder.build()
  }
}
