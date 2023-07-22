@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudwatch

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions
import software.amazon.awscdk.services.cloudwatch.DefaultValue
import software.amazon.awscdk.services.cloudwatch.Values
import software.amazon.awscdk.services.cloudwatch.VariableInputType
import software.amazon.awscdk.services.cloudwatch.VariableType

@CdkDslMarker
public class DashboardVariableOptionsDsl {
  private val cdkBuilder: DashboardVariableOptions.Builder = DashboardVariableOptions.builder()

  /**
   * @param defaultValue Optional default value.
   */
  public fun defaultValue(defaultValue: DefaultValue) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * @param id Unique id. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param inputType The way the variable value is selected. 
   */
  public fun inputType(inputType: VariableInputType) {
    cdkBuilder.inputType(inputType)
  }

  /**
   * @param label Optional label in the toolbar.
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * @param type Type of the variable. 
   */
  public fun type(type: VariableType) {
    cdkBuilder.type(type)
  }

  /**
   * @param value Pattern or property value to replace. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * @param values Optional values (required for [VariableInputType.RADIO] and
   * [VariableInputType.SELECT] dashboard variables).
   */
  public fun values(values: Values) {
    cdkBuilder.values(values)
  }

  /**
   * @param visible Whether the variable is visible.
   */
  public fun visible(visible: Boolean) {
    cdkBuilder.visible(visible)
  }

  public fun build(): DashboardVariableOptions = cdkBuilder.build()
}
