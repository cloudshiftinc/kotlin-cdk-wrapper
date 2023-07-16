@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.kendra.CfnDataSource

@CdkDslMarker
public class CfnDataSourceDocumentAttributeValuePropertyDsl {
  private val cdkBuilder: CfnDataSource.DocumentAttributeValueProperty.Builder =
      CfnDataSource.DocumentAttributeValueProperty.builder()

  private val _stringListValue: MutableList<String> = mutableListOf()

  public fun dateValue(dateValue: String) {
    cdkBuilder.dateValue(dateValue)
  }

  public fun longValue(longValue: Number) {
    cdkBuilder.longValue(longValue)
  }

  public fun stringListValue(vararg stringListValue: String) {
    _stringListValue.addAll(listOf(*stringListValue))
  }

  public fun stringListValue(stringListValue: Collection<String>) {
    _stringListValue.addAll(stringListValue)
  }

  public fun stringValue(stringValue: String) {
    cdkBuilder.stringValue(stringValue)
  }

  public fun build(): CfnDataSource.DocumentAttributeValueProperty {
    if(_stringListValue.isNotEmpty()) cdkBuilder.stringListValue(_stringListValue)
    return cdkBuilder.build()
  }
}
