package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class DashboardVariable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardVariable,
) : CdkObject(cdkObject), IVariable {
  /**
   * Return the variable JSON for use in the dashboard.
   */
  public override fun toJson(): Any = unwrap(this).toJson()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cloudwatch.DashboardVariable].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional default value.
     *
     * Default: - no default value is set
     *
     * @param defaultValue Optional default value. 
     */
    public fun defaultValue(defaultValue: DefaultValue)

    /**
     * Unique id.
     *
     * @param id Unique id. 
     */
    public fun id(id: String)

    /**
     * The way the variable value is selected.
     *
     * @param inputType The way the variable value is selected. 
     */
    public fun inputType(inputType: VariableInputType)

    /**
     * Optional label in the toolbar.
     *
     * Default: - the variable's value
     *
     * @param label Optional label in the toolbar. 
     */
    public fun label(label: String)

    /**
     * Type of the variable.
     *
     * @param type Type of the variable. 
     */
    public fun type(type: VariableType)

    /**
     * Pattern or property value to replace.
     *
     * @param value Pattern or property value to replace. 
     */
    public fun `value`(`value`: String)

    /**
     * Optional values (required for [VariableInputType.RADIO] and [VariableInputType.SELECT]
     * dashboard variables).
     *
     * Default: - no values
     *
     * @param values Optional values (required for [VariableInputType.RADIO] and
     * [VariableInputType.SELECT] dashboard variables). 
     */
    public fun values(values: Values)

    /**
     * Whether the variable is visible.
     *
     * Default: - true
     *
     * @param visible Whether the variable is visible. 
     */
    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.DashboardVariable.Builder =
        software.amazon.awscdk.services.cloudwatch.DashboardVariable.Builder.create()

    /**
     * Optional default value.
     *
     * Default: - no default value is set
     *
     * @param defaultValue Optional default value. 
     */
    override fun defaultValue(defaultValue: DefaultValue) {
      cdkBuilder.defaultValue(defaultValue.let(DefaultValue::unwrap))
    }

    /**
     * Unique id.
     *
     * @param id Unique id. 
     */
    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    /**
     * The way the variable value is selected.
     *
     * @param inputType The way the variable value is selected. 
     */
    override fun inputType(inputType: VariableInputType) {
      cdkBuilder.inputType(inputType.let(VariableInputType::unwrap))
    }

    /**
     * Optional label in the toolbar.
     *
     * Default: - the variable's value
     *
     * @param label Optional label in the toolbar. 
     */
    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    /**
     * Type of the variable.
     *
     * @param type Type of the variable. 
     */
    override fun type(type: VariableType) {
      cdkBuilder.type(type.let(VariableType::unwrap))
    }

    /**
     * Pattern or property value to replace.
     *
     * @param value Pattern or property value to replace. 
     */
    override fun `value`(`value`: String) {
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
    override fun values(values: Values) {
      cdkBuilder.values(values.let(Values::unwrap))
    }

    /**
     * Whether the variable is visible.
     *
     * Default: - true
     *
     * @param visible Whether the variable is visible. 
     */
    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.DashboardVariable =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DashboardVariable {
      val builderImpl = BuilderImpl()
      return DashboardVariable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardVariable):
        DashboardVariable = DashboardVariable(cdkObject)

    internal fun unwrap(wrapped: DashboardVariable):
        software.amazon.awscdk.services.cloudwatch.DashboardVariable = wrapped.cdkObject
  }
}
