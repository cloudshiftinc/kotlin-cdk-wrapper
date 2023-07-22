@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceSalesforceStandardObjectConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.SalesforceStandardObjectConfigurationProperty.Builder =
      CfnDataSource.SalesforceStandardObjectConfigurationProperty.builder()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  /**
   * @param documentDataFieldName The name of the field in the standard object table that contains
   * the document contents. 
   */
  public fun documentDataFieldName(documentDataFieldName: String) {
    cdkBuilder.documentDataFieldName(documentDataFieldName)
  }

  /**
   * @param documentTitleFieldName The name of the field in the standard object table that contains
   * the document title.
   */
  public fun documentTitleFieldName(documentTitleFieldName: String) {
    cdkBuilder.documentTitleFieldName(documentTitleFieldName)
  }

  /**
   * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
   * source field names must exist in your Salesforce custom metadata.
   */
  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  /**
   * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
   * source field names must exist in your Salesforce custom metadata.
   */
  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  /**
   * @param fieldMappings Maps attributes or field names of the standard object to Amazon Kendra
   * index field names.
   * To create custom fields, use the `UpdateIndex` API before you map to Salesforce fields. For
   * more information, see [Mapping data source
   * fields](https://docs.aws.amazon.com/kendra/latest/dg/field-mapping.html) . The Salesforce data
   * source field names must exist in your Salesforce custom metadata.
   */
  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  /**
   * @param name The name of the standard object. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnDataSource.SalesforceStandardObjectConfigurationProperty {
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    return cdkBuilder.build()
  }
}
