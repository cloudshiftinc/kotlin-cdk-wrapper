@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface DashboardVariableOptions {
  public fun defaultValue(): DefaultValue? = unwrap(this).getDefaultValue()?.let(DefaultValue::wrap)

  public fun id(): String

  public fun inputType(): VariableInputType

  public fun label(): String? = unwrap(this).getLabel()

  public fun type(): VariableType

  public fun `value`(): String

  public fun values(): Values? = unwrap(this).getValues()?.let(Values::wrap)

  public fun visible(): Boolean? = unwrap(this).getVisible()

  @CdkDslMarker
  public interface Builder {
    public fun defaultValue(defaultValue: DefaultValue)

    public fun id(id: String)

    public fun inputType(inputType: VariableInputType)

    public fun label(label: String)

    public fun type(type: VariableType)

    public fun `value`(`value`: String)

    public fun values(values: Values)

    public fun visible(visible: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions.Builder =
        software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions.builder()

    override fun defaultValue(defaultValue: DefaultValue) {
      cdkBuilder.defaultValue(defaultValue.let(DefaultValue::unwrap))
    }

    override fun id(id: String) {
      cdkBuilder.id(id)
    }

    override fun inputType(inputType: VariableInputType) {
      cdkBuilder.inputType(inputType.let(VariableInputType::unwrap))
    }

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun type(type: VariableType) {
      cdkBuilder.type(type.let(VariableType::unwrap))
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    override fun values(values: Values) {
      cdkBuilder.values(values.let(Values::unwrap))
    }

    override fun visible(visible: Boolean) {
      cdkBuilder.visible(visible)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions,
  ) : CdkObject(cdkObject), DashboardVariableOptions {
    override fun defaultValue(): DefaultValue? =
        unwrap(this).getDefaultValue()?.let(DefaultValue::wrap)

    override fun id(): String = unwrap(this).getId()

    override fun inputType(): VariableInputType =
        unwrap(this).getInputType().let(VariableInputType::wrap)

    override fun label(): String? = unwrap(this).getLabel()

    override fun type(): VariableType = unwrap(this).getType().let(VariableType::wrap)

    override fun `value`(): String = unwrap(this).getValue()

    override fun values(): Values? = unwrap(this).getValues()?.let(Values::wrap)

    override fun visible(): Boolean? = unwrap(this).getVisible()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DashboardVariableOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions):
        DashboardVariableOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DashboardVariableOptions):
        software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudwatch.DashboardVariableOptions
  }
}
