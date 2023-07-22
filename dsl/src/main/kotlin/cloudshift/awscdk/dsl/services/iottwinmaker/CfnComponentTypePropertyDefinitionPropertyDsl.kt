@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnComponentType

@CdkDslMarker
public class CfnComponentTypePropertyDefinitionPropertyDsl {
  private val cdkBuilder: CfnComponentType.PropertyDefinitionProperty.Builder =
      CfnComponentType.PropertyDefinitionProperty.builder()

  /**
   * @param configurations A mapping that specifies configuration information about the property.
   */
  public fun configurations(configurations: Map<String, String>) {
    cdkBuilder.configurations(configurations)
  }

  /**
   * @param configurations A mapping that specifies configuration information about the property.
   */
  public fun configurations(configurations: IResolvable) {
    cdkBuilder.configurations(configurations)
  }

  /**
   * @param dataType An object that specifies the data type of a property.
   */
  public fun dataType(dataType: IResolvable) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param dataType An object that specifies the data type of a property.
   */
  public fun dataType(dataType: CfnComponentType.DataTypeProperty) {
    cdkBuilder.dataType(dataType)
  }

  /**
   * @param defaultValue A boolean value that specifies whether the property ID comes from an
   * external data store.
   */
  public fun defaultValue(defaultValue: IResolvable) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param defaultValue A boolean value that specifies whether the property ID comes from an
   * external data store.
   */
  public fun defaultValue(defaultValue: CfnComponentType.DataValueProperty) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param isExternalId A boolean value that specifies whether the property ID comes from an
   * external data store.
   */
  public fun isExternalId(isExternalId: Boolean) {
    cdkBuilder.isExternalId(isExternalId)
  }

  /**
   * @param isExternalId A boolean value that specifies whether the property ID comes from an
   * external data store.
   */
  public fun isExternalId(isExternalId: IResolvable) {
    cdkBuilder.isExternalId(isExternalId)
  }

  /**
   * @param isRequiredInEntity A boolean value that specifies whether the property is required in an
   * entity.
   */
  public fun isRequiredInEntity(isRequiredInEntity: Boolean) {
    cdkBuilder.isRequiredInEntity(isRequiredInEntity)
  }

  /**
   * @param isRequiredInEntity A boolean value that specifies whether the property is required in an
   * entity.
   */
  public fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
    cdkBuilder.isRequiredInEntity(isRequiredInEntity)
  }

  /**
   * @param isStoredExternally A boolean value that specifies whether the property is stored
   * externally.
   */
  public fun isStoredExternally(isStoredExternally: Boolean) {
    cdkBuilder.isStoredExternally(isStoredExternally)
  }

  /**
   * @param isStoredExternally A boolean value that specifies whether the property is stored
   * externally.
   */
  public fun isStoredExternally(isStoredExternally: IResolvable) {
    cdkBuilder.isStoredExternally(isStoredExternally)
  }

  /**
   * @param isTimeSeries A boolean value that specifies whether the property consists of time series
   * data.
   */
  public fun isTimeSeries(isTimeSeries: Boolean) {
    cdkBuilder.isTimeSeries(isTimeSeries)
  }

  /**
   * @param isTimeSeries A boolean value that specifies whether the property consists of time series
   * data.
   */
  public fun isTimeSeries(isTimeSeries: IResolvable) {
    cdkBuilder.isTimeSeries(isTimeSeries)
  }

  public fun build(): CfnComponentType.PropertyDefinitionProperty = cdkBuilder.build()
}
