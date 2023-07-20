@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ssm

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.ssm.ListParameterAttributes
import software.amazon.awscdk.services.ssm.ParameterValueType

@CdkDslMarker
public class ListParameterAttributesDsl {
  private val cdkBuilder: ListParameterAttributes.Builder = ListParameterAttributes.builder()

  public fun elementType(elementType: ParameterValueType) {
    cdkBuilder.elementType(elementType)
  }

  public fun parameterName(parameterName: String) {
    cdkBuilder.parameterName(parameterName)
  }

  public fun simpleName(simpleName: Boolean) {
    cdkBuilder.simpleName(simpleName)
  }

  public fun version(version: Number) {
    cdkBuilder.version(version)
  }

  public fun build(): ListParameterAttributes = cdkBuilder.build()
}
