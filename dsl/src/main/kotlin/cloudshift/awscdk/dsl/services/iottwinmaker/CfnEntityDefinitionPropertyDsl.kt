@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iottwinmaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iottwinmaker.CfnEntity

@CdkDslMarker
public class CfnEntityDefinitionPropertyDsl {
  private val cdkBuilder: CfnEntity.DefinitionProperty.Builder =
      CfnEntity.DefinitionProperty.builder()

  public fun configuration(configuration: Map<String, String>) {
    cdkBuilder.configuration(configuration)
  }

  public fun configuration(configuration: IResolvable) {
    cdkBuilder.configuration(configuration)
  }

  public fun dataType(dataType: IResolvable) {
    cdkBuilder.dataType(dataType)
  }

  public fun dataType(dataType: CfnEntity.DataTypeProperty) {
    cdkBuilder.dataType(dataType)
  }

  public fun defaultValue(defaultValue: IResolvable) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun defaultValue(defaultValue: CfnEntity.DataValueProperty) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun isExternalId(isExternalId: Boolean) {
    cdkBuilder.isExternalId(isExternalId)
  }

  public fun isExternalId(isExternalId: IResolvable) {
    cdkBuilder.isExternalId(isExternalId)
  }

  public fun isFinal(isFinal: Boolean) {
    cdkBuilder.isFinal(isFinal)
  }

  public fun isFinal(isFinal: IResolvable) {
    cdkBuilder.isFinal(isFinal)
  }

  public fun isImported(isImported: Boolean) {
    cdkBuilder.isImported(isImported)
  }

  public fun isImported(isImported: IResolvable) {
    cdkBuilder.isImported(isImported)
  }

  public fun isInherited(isInherited: Boolean) {
    cdkBuilder.isInherited(isInherited)
  }

  public fun isInherited(isInherited: IResolvable) {
    cdkBuilder.isInherited(isInherited)
  }

  public fun isRequiredInEntity(isRequiredInEntity: Boolean) {
    cdkBuilder.isRequiredInEntity(isRequiredInEntity)
  }

  public fun isRequiredInEntity(isRequiredInEntity: IResolvable) {
    cdkBuilder.isRequiredInEntity(isRequiredInEntity)
  }

  public fun isStoredExternally(isStoredExternally: Boolean) {
    cdkBuilder.isStoredExternally(isStoredExternally)
  }

  public fun isStoredExternally(isStoredExternally: IResolvable) {
    cdkBuilder.isStoredExternally(isStoredExternally)
  }

  public fun isTimeSeries(isTimeSeries: Boolean) {
    cdkBuilder.isTimeSeries(isTimeSeries)
  }

  public fun isTimeSeries(isTimeSeries: IResolvable) {
    cdkBuilder.isTimeSeries(isTimeSeries)
  }

  public fun build(): CfnEntity.DefinitionProperty = cdkBuilder.build()
}
