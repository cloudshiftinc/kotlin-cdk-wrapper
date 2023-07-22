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

/**
 * Dashboard Variable.
 *
 * Example:
 *
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Dashboard dashboard = Dashboard.Builder.create(this, "Dash")
 * .defaultInterval(Duration.days(7))
 * .variables(List.of(DashboardVariable.Builder.create()
 * .id("functionName")
 * .type(VariableType.PATTERN)
 * .label("Function")
 * .inputType(VariableInputType.RADIO)
 * .value("originalFuncNameInDashboard")
 * // equivalent to cw.Values.fromSearch('{AWS/Lambda,FunctionName} MetricName=\"Duration\"',
 * 'FunctionName')
 * .values(Values.fromSearchComponents(SearchComponents.builder()
 * .namespace("AWS/Lambda")
 * .dimensions(List.of("FunctionName"))
 * .metricName("Duration")
 * .populateFrom("FunctionName")
 * .build()))
 * .defaultValue(DefaultValue.FIRST)
 * .visible(true)
 * .build()))
 * .build();
 * ```
 */
@CdkDslMarker
public class DashboardVariableDsl {
  private val cdkBuilder: DashboardVariable.Builder = DashboardVariable.Builder.create()

  /**
   * Optional default value.
   *
   * Default: - no default value is set
   *
   * @param defaultValue Optional default value. 
   */
  public fun defaultValue(defaultValue: DefaultValue) {
    cdkBuilder.defaultValue(defaultValue)
  }

  /**
   * Unique id.
   *
   * @param id Unique id. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * The way the variable value is selected.
   *
   * @param inputType The way the variable value is selected. 
   */
  public fun inputType(inputType: VariableInputType) {
    cdkBuilder.inputType(inputType)
  }

  /**
   * Optional label in the toolbar.
   *
   * Default: - the variable's value
   *
   * @param label Optional label in the toolbar. 
   */
  public fun label(label: String) {
    cdkBuilder.label(label)
  }

  /**
   * Type of the variable.
   *
   * @param type Type of the variable. 
   */
  public fun type(type: VariableType) {
    cdkBuilder.type(type)
  }

  /**
   * Pattern or property value to replace.
   *
   * @param value Pattern or property value to replace. 
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  /**
   * Optional values (required for [VariableInputType.RADIO] and [VariableInputType.SELECT]
   * dashboard variables).
   *
   * Default: - no values
   *
   * @param values Optional values (required for [VariableInputType.RADIO] and
   * [VariableInputType.SELECT] dashboard variables). 
   */
  public fun values(values: Values) {
    cdkBuilder.values(values)
  }

  /**
   * Whether the variable is visible.
   *
   * Default: - true
   *
   * @param visible Whether the variable is visible. 
   */
  public fun visible(visible: Boolean) {
    cdkBuilder.visible(visible)
  }

  public fun build(): DashboardVariable = cdkBuilder.build()
}
