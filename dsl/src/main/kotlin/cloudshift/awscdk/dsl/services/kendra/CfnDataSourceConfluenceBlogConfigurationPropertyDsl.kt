@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceConfluenceBlogConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.ConfluenceBlogConfigurationProperty.Builder =
      CfnDataSource.ConfluenceBlogConfigurationProperty.builder()

  private val _blogFieldMappings: MutableList<Any> = mutableListOf()

  /**
   * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * If you specify the `BlogFieldMappings` parameter, you must specify at least one field mapping.
   */
  public fun blogFieldMappings(vararg blogFieldMappings: Any) {
    _blogFieldMappings.addAll(listOf(*blogFieldMappings))
  }

  /**
   * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * If you specify the `BlogFieldMappings` parameter, you must specify at least one field mapping.
   */
  public fun blogFieldMappings(blogFieldMappings: Collection<Any>) {
    _blogFieldMappings.addAll(blogFieldMappings)
  }

  /**
   * @param blogFieldMappings Maps attributes or field names of Confluence blogs to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Confluence fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Confluence data
   * source field names must exist in your Confluence custom metadata.
   *
   * If you specify the `BlogFieldMappings` parameter, you must specify at least one field mapping.
   */
  public fun blogFieldMappings(blogFieldMappings: IResolvable) {
    cdkBuilder.blogFieldMappings(blogFieldMappings)
  }

  public fun build(): CfnDataSource.ConfluenceBlogConfigurationProperty {
    if(_blogFieldMappings.isNotEmpty()) cdkBuilder.blogFieldMappings(_blogFieldMappings)
    return cdkBuilder.build()
  }
}
