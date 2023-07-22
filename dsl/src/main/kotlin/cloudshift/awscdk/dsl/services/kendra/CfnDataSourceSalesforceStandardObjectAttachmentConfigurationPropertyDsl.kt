@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnDataSource

/**
 * Provides the configuration information for processing attachments to Salesforce standard objects.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kendra.*;
 * SalesforceStandardObjectAttachmentConfigurationProperty
 * salesforceStandardObjectAttachmentConfigurationProperty =
 * SalesforceStandardObjectAttachmentConfigurationProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kendra-datasource-salesforcestandardobjectattachmentconfiguration.html)
 */
@CdkDslMarker
public class CfnDataSourceSalesforceStandardObjectAttachmentConfigurationPropertyDsl {
  private val cdkBuilder:
      CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.Builder =
      CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.builder()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  /**
   * @param documentTitleFieldName The name of the field used for the document title.
   */
  public fun documentTitleFieldName(documentTitleFieldName: String) {
    cdkBuilder.documentTitleFieldName(documentTitleFieldName)
  }

  /**
   * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra index
   * fields.
   */
  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  /**
   * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra index
   * fields.
   */
  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  /**
   * @param fieldMappings One or more objects that map fields in attachments to Amazon Kendra index
   * fields.
   */
  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  public fun build(): CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty {
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    return cdkBuilder.build()
  }
}
