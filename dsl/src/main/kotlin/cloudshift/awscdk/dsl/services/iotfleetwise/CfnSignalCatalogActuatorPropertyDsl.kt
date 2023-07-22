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

  /**
   * @param allowedValues (Optional) A list of possible values an actuator can take.
   */
  public fun allowedValues(vararg allowedValues: String) {
    _allowedValues.addAll(listOf(*allowedValues))
  }

  /**
   * @param allowedValues (Optional) A list of possible values an actuator can take.
   */
  public fun allowedValues(allowedValues: Collection<String>) {
    _allowedValues.addAll(allowedValues)
  }

  /**
   * @param assignedValue (Optional) A specified value for the actuator.
   */
  public fun assignedValue(assignedValue: String) {
    cdkBuilder.assignedValue(assignedValue)
  }

  /**
   * @param dataType The specified data type of the actuator. 
   */
  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param description (Optional) A brief description of the actuator.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param fullyQualifiedName The fully qualified name of the actuator. 
   * For example, the fully qualified name of an actuator might be `Vehicle.Front.Left.Door.Lock` .
   */
  public fun fullyQualifiedName(fullyQualifiedName: String) {
    cdkBuilder.fullyQualifiedName(fullyQualifiedName)
  }

  /**
   * @param max (Optional) The specified possible maximum value of an actuator.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min (Optional) The specified possible minimum value of an actuator.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  /**
   * @param unit (Optional) The scientific unit for the actuator.
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnSignalCatalog.ActuatorProperty {
    if(_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
    return cdkBuilder.build()
  }
}
