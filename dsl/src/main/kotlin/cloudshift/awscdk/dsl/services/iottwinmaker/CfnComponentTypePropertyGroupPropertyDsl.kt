@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

/**
 * The property group.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iottwinmaker.*;
 * PropertyGroupProperty propertyGroupProperty = PropertyGroupProperty.builder()
 * .groupType("groupType")
 * .propertyNames(List.of("propertyNames"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-iottwinmaker-componenttype-propertygroup.html)
 */
@CdkDslMarker
public class CfnComponentTypePropertyGroupPropertyDsl {
  private val cdkBuilder: CfnComponentType.PropertyGroupProperty.Builder =
      CfnComponentType.PropertyGroupProperty.builder()

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

  public fun build(): CfnComponentType.PropertyGroupProperty {
    if(_propertyNames.isNotEmpty()) cdkBuilder.propertyNames(_propertyNames)
    return cdkBuilder.build()
  }
}
