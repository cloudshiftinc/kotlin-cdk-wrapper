@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypePropertyGroupPropertyDsl {
  private val cdkBuilder: CfnComponentType.PropertyGroupProperty.Builder =
      CfnComponentType.PropertyGroupProperty.builder()

  private val _propertyNames: MutableList<String> = mutableListOf()

  public fun groupType(groupType: String) {
    cdkBuilder.groupType(groupType)
  }

  public fun propertyNames(vararg propertyNames: String) {
    _propertyNames.addAll(listOf(*propertyNames))
  }

  public fun propertyNames(propertyNames: Collection<String>) {
    _propertyNames.addAll(propertyNames)
  }

  public fun build(): CfnComponentType.PropertyGroupProperty {
    if(_propertyNames.isNotEmpty()) cdkBuilder.propertyNames(_propertyNames)
    return cdkBuilder.build()
  }
}
