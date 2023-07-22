@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypeDataTypePropertyDsl {
  private val cdkBuilder: CfnComponentType.DataTypeProperty.Builder =
      CfnComponentType.DataTypeProperty.builder()

  private val _allowedValues: MutableList<Any> = mutableListOf()

  /**
   * @param allowedValues The allowed values for this data type.
   */
  public fun allowedValues(vararg allowedValues: Any) {
    _allowedValues.addAll(listOf(*allowedValues))
  }

  /**
   * @param allowedValues The allowed values for this data type.
   */
  public fun allowedValues(allowedValues: Collection<Any>) {
    _allowedValues.addAll(allowedValues)
  }

  /**
   * @param allowedValues The allowed values for this data type.
   */
  public fun allowedValues(allowedValues: IResolvable) {
    cdkBuilder.allowedValues(allowedValues)
  }

  /**
   * @param nestedType The nested type in the data type.
   */
  public fun nestedType(nestedType: IResolvable) {
    cdkBuilder.nestedType(nestedType)
  }

  /**
   * @param nestedType The nested type in the data type.
   */
  public fun nestedType(nestedType: CfnComponentType.DataTypeProperty) {
    cdkBuilder.nestedType(nestedType)
  }

  /**
   * @param relationship A relationship that associates a component with another component.
   */
  public fun relationship(relationship: IResolvable) {
    cdkBuilder.relationship(relationship)
  }

  /**
   * @param relationship A relationship that associates a component with another component.
   */
  public fun relationship(relationship: CfnComponentType.RelationshipProperty) {
    cdkBuilder.relationship(relationship)
  }

  /**
   * @param type The underlying type of the data type. 
   * Valid Values: `RELATIONSHIP | STRING | LONG | BOOLEAN | INTEGER | DOUBLE | LIST | MAP`
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param unitOfMeasure The unit of measure used in this data type.
   */
  public fun unitOfMeasure(unitOfMeasure: String) {
    cdkBuilder.unitOfMeasure(unitOfMeasure)
  }

  public fun build(): CfnComponentType.DataTypeProperty {
    if(_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
    return cdkBuilder.build()
  }
}
