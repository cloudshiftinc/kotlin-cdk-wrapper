@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public open class DashboardVariable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.cloudwatch.DashboardVariable,
) : CdkObject(cdkObject), IVariable {
  public override fun toJson(): Any = unwrap(this).toJson()

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
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.DashboardVariable.Builder =
        software.amazon.awscdk.services.cloudwatch.DashboardVariable.Builder.create()

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
