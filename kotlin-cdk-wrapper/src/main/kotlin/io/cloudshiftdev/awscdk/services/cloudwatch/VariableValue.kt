@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudwatch

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface VariableValue {
  public fun label(): String? = unwrap(this).getLabel()

  public fun `value`(): String

  @CdkDslMarker
  public interface Builder {
    public fun label(label: String)

    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudwatch.VariableValue.Builder =
        software.amazon.awscdk.services.cloudwatch.VariableValue.builder()

    override fun label(label: String) {
      cdkBuilder.label(label)
    }

    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.cloudwatch.VariableValue =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudwatch.VariableValue,
  ) : CdkObject(cdkObject), VariableValue {
    override fun label(): String? = unwrap(this).getLabel()

    override fun `value`(): String = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VariableValue {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudwatch.VariableValue):
        VariableValue = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VariableValue):
        software.amazon.awscdk.services.cloudwatch.VariableValue = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudwatch.VariableValue
  }
}
