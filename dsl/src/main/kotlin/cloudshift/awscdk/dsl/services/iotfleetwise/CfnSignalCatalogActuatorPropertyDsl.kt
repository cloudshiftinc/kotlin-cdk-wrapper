@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

@CdkDslMarker
public class CfnSignalCatalogActuatorPropertyDsl {
  private val cdkBuilder: CfnSignalCatalog.ActuatorProperty.Builder =
      CfnSignalCatalog.ActuatorProperty.builder()

  private val _allowedValues: MutableList<String> = mutableListOf()

  public fun allowedValues(vararg allowedValues: String) {
    _allowedValues.addAll(listOf(*allowedValues))
  }

  public fun allowedValues(allowedValues: Collection<String>) {
    _allowedValues.addAll(allowedValues)
  }

  public fun assignedValue(assignedValue: String) {
    cdkBuilder.assignedValue(assignedValue)
  }

  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun fullyQualifiedName(fullyQualifiedName: String) {
    cdkBuilder.fullyQualifiedName(fullyQualifiedName)
  }

  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnSignalCatalog.ActuatorProperty {
    if(_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
    return cdkBuilder.build()
  }
}
