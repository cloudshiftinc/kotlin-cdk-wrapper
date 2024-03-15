@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface VariableProps {
  public fun defaultValue(): String? = unwrap(this).getDefaultValue()

  public fun description(): String? = unwrap(this).getDescription()

  public fun variableName(): String

  @CdkDslMarker
  public interface Builder {
    public fun defaultValue(defaultValue: String)

    public fun description(description: String)

    public fun variableName(variableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.VariableProps.Builder =
        software.amazon.awscdk.services.codepipeline.VariableProps.builder()

    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun variableName(variableName: String) {
      cdkBuilder.variableName(variableName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.VariableProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codepipeline.VariableProps,
  ) : CdkObject(cdkObject), VariableProps {
    override fun defaultValue(): String? = unwrap(this).getDefaultValue()

    override fun description(): String? = unwrap(this).getDescription()

    override fun variableName(): String = unwrap(this).getVariableName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): VariableProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.VariableProps):
        VariableProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: VariableProps):
        software.amazon.awscdk.services.codepipeline.VariableProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.VariableProps
  }
}
