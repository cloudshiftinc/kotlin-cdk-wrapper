@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iotfleetwise.CfnSignalCatalog

@CdkDslMarker
public class CfnSignalCatalogSensorPropertyDsl {
  private val cdkBuilder: CfnSignalCatalog.SensorProperty.Builder =
      CfnSignalCatalog.SensorProperty.builder()

  private val _allowedValues: MutableList<String> = mutableListOf()

  /**
   * @param allowedValues (Optional) A list of possible values a sensor can take.
   */
  public fun allowedValues(vararg allowedValues: String) {
    _allowedValues.addAll(listOf(*allowedValues))
  }

  /**
   * @param allowedValues (Optional) A list of possible values a sensor can take.
   */
  public fun allowedValues(allowedValues: Collection<String>) {
    _allowedValues.addAll(allowedValues)
  }

  /**
   * @param dataType The specified data type of the sensor. 
   */
  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param description (Optional) A brief description of a sensor.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param fullyQualifiedName The fully qualified name of the sensor. 
   * For example, the fully qualified name of a sensor might be `Vehicle.Body.Engine.Battery` .
   */
  public fun fullyQualifiedName(fullyQualifiedName: String) {
    cdkBuilder.fullyQualifiedName(fullyQualifiedName)
  }

  /**
   * @param max (Optional) The specified possible maximum value of the sensor.
   */
  public fun max(max: Number) {
    cdkBuilder.max(max)
  }

  /**
   * @param min (Optional) The specified possible minimum value of the sensor.
   */
  public fun min(min: Number) {
    cdkBuilder.min(min)
  }

  /**
   * @param unit (Optional) The scientific unit of measurement for data collected by the sensor.
   */
  public fun unit(unit: String) {
    cdkBuilder.unit(unit)
  }

  public fun build(): CfnSignalCatalog.SensorProperty {
    if(_allowedValues.isNotEmpty()) cdkBuilder.allowedValues(_allowedValues)
    return cdkBuilder.build()
  }
}
