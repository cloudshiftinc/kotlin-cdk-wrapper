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

  public fun allowedValues(vararg allowedValues: Any) {
    _allowedValues.addAll(listOf(*allowedValues))
  }

  public fun allowedValues(allowedValues: Collection<Any>) {
    _allowedValues.addAll(allowedValues)
  }

  public fun allowedValues(allowedValues: IResolvable) {
    cdkBuilder.allowedValues(allowedValues)
  }

  public fun nestedType(nestedType: IResolvable) {
    cdkBuilder.nestedType(nestedType)
  }

  public fun nestedType(nestedType: CfnEntity.DataTypeProperty) {
    cdkBuilder.nestedType(nestedType)
  }

  public fun relationship(relationship: IResolvable) {
    cdkBuilder.relationship(relationship)
  }

  public fun relationship(relationship: CfnEntity.RelationshipProperty) {
    cdkBuilder.relationship(relationship)
  }

  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun unitOfMeasure(unitOfMeasure: String) {
    cdkBuilder.unitOfMeasure(unitOfMeasure)
  }

  public fun build(): CfnEntity.DataTypeProperty {
    if(_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
    return cdkBuilder.build()
  }
}
