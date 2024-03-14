package io.cloudshiftdev.awscdk.services.codepipeline

import kotlin.String
import kotlin.Unit

public open class Variable internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.Variable,
) {
  public open fun reference(): String = unwrap(this).reference()

  public open fun variableName(): String = unwrap(this).getVariableName()

  public interface Builder {
    public fun defaultValue(defaultValue: String) {
    }

    public fun description(description: String) {
    }

    public fun variableName(variableName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Variable.Builder =
        software.amazon.awscdk.services.codepipeline.Variable.Builder.create()

    public override fun defaultValue(defaultValue: String) {
      cdkBuilder.defaultValue(defaultValue)
    }

    public override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public override fun variableName(variableName: String) {
      cdkBuilder.variableName(variableName)
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.Variable = cdkBuilder.build()
  }

  public companion object {
    init {

    }

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
