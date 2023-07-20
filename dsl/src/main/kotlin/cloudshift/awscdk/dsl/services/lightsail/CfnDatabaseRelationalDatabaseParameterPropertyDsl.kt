@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDatabase

@CdkDslMarker
public class CfnDatabaseRelationalDatabaseParameterPropertyDsl {
  private val cdkBuilder: CfnDatabase.RelationalDatabaseParameterProperty.Builder =
      CfnDatabase.RelationalDatabaseParameterProperty.builder()

  public fun allowedValues(allowedValues: String) {
    cdkBuilder.allowedValues(allowedValues)
  }

  public fun applyMethod(applyMethod: String) {
    cdkBuilder.applyMethod(applyMethod)
  }

  public fun applyType(applyType: String) {
    cdkBuilder.applyType(applyType)
  }

  public fun dataType(dataType: String) {
    cdkBuilder.dataType(dataType)
  }

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun isModifiable(isModifiable: Boolean) {
    cdkBuilder.isModifiable(isModifiable)
  }

  public fun isModifiable(isModifiable: IResolvable) {
    cdkBuilder.isModifiable(isModifiable)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun parameterValue(parameterValue: String) {
    cdkBuilder.parameterValue(parameterValue)
  }

  public fun build(): CfnDatabase.RelationalDatabaseParameterProperty = cdkBuilder.build()
}
