@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityPropertyGroupPropertyDsl {
  private val cdkBuilder: CfnEntity.PropertyGroupProperty.Builder =
      CfnEntity.PropertyGroupProperty.builder()

  private val _propertyNames: MutableList<String> = mutableListOf()

  /**
   * @param groupType The group type.
   */
  public fun groupType(groupType: String) {
    cdkBuilder.groupType(groupType)
  }

  /**
   * @param propertyNames The property names.
   */
  public fun propertyNames(vararg propertyNames: String) {
    _propertyNames.addAll(listOf(*propertyNames))
  }

  /**
   * @param propertyNames The property names.
   */
  public fun propertyNames(propertyNames: Collection<String>) {
    _propertyNames.addAll(propertyNames)
  }

  public fun build(): CfnEntity.PropertyGroupProperty {
    if(_propertyNames.isNotEmpty()) cdkBuilder.propertyNames(_propertyNames)
    return cdkBuilder.build()
  }
}
