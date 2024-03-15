@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public open class Variable internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.codepipeline.Variable,
) : CdkObject(cdkObject) {
  public open fun reference(): String = unwrap(this).reference()

  public open fun variableName(): String = unwrap(this).getVariableName()

  @CdkDslMarker
  public interface Builder {
    public fun defaultValue(defaultValue: String)

    public fun description(description: String)

    public fun variableName(variableName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Variable.Builder =
        software.amazon.awscdk.services.codepipeline.Variable.Builder.create()

    override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun variableName(variableName: String) {
      cdkBuilder.variableName(variableName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.Variable = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Variable {
      val builderImpl = BuilderImpl()
      return Variable(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Variable): Variable =
        Variable(cdkObject)

    internal fun unwrap(wrapped: Variable): software.amazon.awscdk.services.codepipeline.Variable =
        wrapped.cdkObject
  }
}
