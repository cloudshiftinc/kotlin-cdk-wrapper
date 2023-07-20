@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.DashboardVariable
import software.amazon.awscdk.services.cloudwatch.DefaultValue
import software.amazon.awscdk.services.cloudwatch.Values
import software.amazon.awscdk.services.cloudwatch.VariableInputType
import software.amazon.awscdk.services.cloudwatch.VariableType

@CdkDslMarker
public class DashboardVariableDsl {
  private val cdkBuilder: DashboardVariable.Builder = DashboardVariable.Builder.create()

  public fun defaultValue(defaultValue: DefaultValue) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun inputType(inputType: VariableInputType) {
    cdkBuilder.inputType(inputType)
  }

  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  public fun type(type: VariableType) {
    cdkBuilder.type(type)
  }

  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun values(values: Values) {
    cdkBuilder.values(values)
  }

  public fun visible(visible: Boolean) {
    cdkBuilder.visible(visible)
  }

  public fun build(): DashboardVariable = cdkBuilder.build()
}
