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
public class CfnDataSourceSalesforceStandardObjectAttachmentConfigurationPropertyDsl {
  private val cdkBuilder:
      CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.Builder =
      CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty.builder()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  public fun documentTitleFieldName(documentTitleFieldName: String) {
    cdkBuilder.documentTitleFieldName(documentTitleFieldName)
  }

  public fun fieldMappings(vararg fieldMappings: Any) {
    _fieldMappings.addAll(listOf(*fieldMappings))
  }

  public fun fieldMappings(fieldMappings: Collection<Any>) {
    _fieldMappings.addAll(fieldMappings)
  }

  public fun fieldMappings(fieldMappings: IResolvable) {
    cdkBuilder.fieldMappings(fieldMappings)
  }

  public fun build(): CfnDataSource.SalesforceStandardObjectAttachmentConfigurationProperty {
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    return cdkBuilder.build()
  }
}
