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
public class CfnDataSourceSalesforceChatterFeedConfigurationPropertyDsl {
  private val cdkBuilder: CfnDataSource.SalesforceChatterFeedConfigurationProperty.Builder =
      CfnDataSource.SalesforceChatterFeedConfigurationProperty.builder()

  private val _fieldMappings: MutableList<Any> = mutableListOf()

  private val _includeFilterTypes: MutableList<String> = mutableListOf()

  public fun documentDataFieldName(documentDataFieldName: String) {
    cdkBuilder.documentDataFieldName(documentDataFieldName)
  }

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

  public fun includeFilterTypes(vararg includeFilterTypes: String) {
    _includeFilterTypes.addAll(listOf(*includeFilterTypes))
  }

  public fun includeFilterTypes(includeFilterTypes: Collection<String>) {
    _includeFilterTypes.addAll(includeFilterTypes)
  }

  public fun build(): CfnDataSource.SalesforceChatterFeedConfigurationProperty {
    if(_fieldMappings.isNotEmpty()) cdkBuilder.fieldMappings(_fieldMappings)
    if(_includeFilterTypes.isNotEmpty()) cdkBuilder.includeFilterTypes(_includeFilterTypes)
    return cdkBuilder.build()
  }
}
