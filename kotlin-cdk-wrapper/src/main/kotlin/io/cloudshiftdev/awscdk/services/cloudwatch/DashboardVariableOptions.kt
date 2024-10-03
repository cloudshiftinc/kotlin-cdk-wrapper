@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Options for [DashboardVariable].
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.cloudwatch.*;
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
public interface DashboardVariableOptions {
  /**
   * Optional default value.
   *
   * Default: - no default value is set
   */
  public fun defaultValue(): DefaultValue? = unwrap(this).getDefaultValue()?.let(DefaultValue::wrap)

  /**
   * Unique id.
   */
  public fun id(): String

  /**
   * The way the variable value is selected.
   */
  public fun inputType(): VariableInputType

  /**
   * Optional label in the toolbar.
   *
   * Default: - the variable's value
   */
  public fun label(): String? = unwrap(this).getLabel()

  /**
   * Type of the variable.
   */
  public fun type(): VariableType

  /**
   * Pattern or property value to replace.
   */
  public fun `value`(): String

  /**
   * Optional values (required for [VariableInputType.RADIO] and [VariableInputType.SELECT]
   * dashboard variables).
   *
   * Default: - no values
   */
  public fun values(): Values? = unwrap(this).getValues()?.let(Values::wrap)

  /**
   * Whether the variable is visible.
   *
   * Default: - true
   */
  public fun visible(): Boolean? = unwrap(this).getVisible()

  /**
   * A builder for [DashboardVariableOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param defaultValue Optional default value.
     */
    public fun defaultValue(defaultValue: DefaultValue)

    /**
     * @param id Unique id. 
     */
    public fun id(id: String)

    /**
     * @param inputType The way the variable value is selected. 
     */
    public fun inputType(inputType: VariableInputType)

    /**
     * @param label Optional label in the toolbar.
     */
    public fun label(label: String)

    /**
     * @param type Type of the variable. 
     */
    public fun type(type: VariableType)

    /**
     * @param value Pattern or property value to replace. 
     */
    public fun `value`(`value`: String)

    /**
     * @param values Optional values (required for [VariableInputType.RADIO] and
     * [VariableInputType.SELECT] dashboard variables).
     */
    public fun values(values: Values)

    /**
     * @param visible Whether the variable is visible.
     */
    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions.Builder =
        software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions.builder()

    /**
     * @param defaultValue Optional default value.
     */
    override fun defaultValue(defaultValue: DefaultValue) {
      cdkBuilder.defaultValue(defaultValue.let(DefaultValue.Companion::unwrap))
    }

    /**
     * @param id Unique id. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * @param inputType The way the variable value is selected. 
     */
    override fun inputType(inputType: VariableInputType) {
      cdkBuilder.inputType(inputType.let(VariableInputType.Companion::unwrap))
    }

    /**
     * @param label Optional label in the toolbar.
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * @param type Type of the variable. 
     */
    override fun type(type: VariableType) {
      cdkBuilder.type(type.let(VariableType.Companion::unwrap))
    }

    /**
     * @param value Pattern or property value to replace. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    /**
     * @param values Optional values (required for [VariableInputType.RADIO] and
     * [VariableInputType.SELECT] dashboard variables).
     */
    override fun values(values: Values) {
      cdkBuilder.values(values.let(Values.Companion::unwrap))
    }

    /**
     * @param visible Whether the variable is visible.
     */
    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions,
  ) : CdkObject(cdkObject),
      DashboardVariableOptions {
    /**
     * Optional default value.
     *
     * Default: - no default value is set
     */
    override fun defaultValue(): DefaultValue? =
        unwrap(this).getDefaultValue()?.let(DefaultValue::wrap)

    /**
     * Unique id.
     */
    override fun id(): String = unwrap(this).getId()

    /**
     * The way the variable value is selected.
     */
    override fun inputType(): VariableInputType =
        unwrap(this).getInputType().let(VariableInputType::wrap)

    /**
     * Optional label in the toolbar.
     *
     * Default: - the variable's value
     */
    override fun label(): String? = unwrap(this).getLabel()

    /**
     * Type of the variable.
     */
    override fun type(): VariableType = unwrap(this).getType().let(VariableType::wrap)

    /**
     * Pattern or property value to replace.
     */
    override fun `value`(): String = unwrap(this).getValue()

    /**
     * Optional values (required for [VariableInputType.RADIO] and [VariableInputType.SELECT]
     * dashboard variables).
     *
     * Default: - no values
     */
    override fun values(): Values? = unwrap(this).getValues()?.let(Values::wrap)

    /**
     * Whether the variable is visible.
     *
     * Default: - true
     */
    override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DashboardVariableOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions):
        DashboardVariableOptions = CdkObjectWrappers.wrap(cdkObject) as? DashboardVariableOptions ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: DashboardVariableOptions):
        software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions
  }
}
