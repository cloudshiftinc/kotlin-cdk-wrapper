@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityDataTypePropertyDsl {
  private val cdkBuilder: CfnEntity.DataTypeProperty.Builder = CfnEntity.DataTypeProperty.builder()

  private val _allowedValues: MutableList<Any> = mutableListOf()

  /**
   * @param allowedValues The allowed values.
   */
  public fun allowedValues(vararg allowedValues: Any) {
    _allowedValues.addAll(listOf(*allowedValues))
  }

  /**
   * @param allowedValues The allowed values.
   */
  public fun allowedValues(allowedValues: Collection<Any>) {
    _allowedValues.addAll(allowedValues)
  }

  /**
   * @param allowedValues The allowed values.
   */
  public fun allowedValues(allowedValues: IResolvable) {
    cdkBuilder.allowedValues(allowedValues)
  }

  /**
   * @param nestedType The nested type.
   */
  public fun nestedType(nestedType: IResolvable) {
    cdkBuilder.nestedType(nestedType)
  }

  /**
   * @param nestedType The nested type.
   */
  public fun nestedType(nestedType: CfnEntity.DataTypeProperty) {
    cdkBuilder.nestedType(nestedType)
  }

  /**
   * @param relationship The relationship.
   */
  public fun relationship(relationship: IResolvable) {
    cdkBuilder.relationship(relationship)
  }

  /**
   * @param relationship The relationship.
   */
  public fun relationship(relationship: CfnEntity.RelationshipProperty) {
    cdkBuilder.relationship(relationship)
  }

  /**
   * @param type The entity type.
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * @param unitOfMeasure The unit of measure.
   */
  public fun unitOfMeasure(unitOfMeasure: String) {
    cdkBuilder.unitOfMeasure(unitOfMeasure)
  }

  public fun build(): CfnEntity.DataTypeProperty {
    if(_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
    return cdkBuilder.build()
  }
}
