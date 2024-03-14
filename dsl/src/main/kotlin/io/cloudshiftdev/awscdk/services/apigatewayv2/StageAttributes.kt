package io.cloudshiftdev.awscdk.services.apigatewayv2

import kotlin.String
import kotlin.Unit

public interface StageAttributes {
  public fun stageName(): String

  public interface Builder {
    public fun stageName(stageName: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigatewayv2.StageAttributes.Builder =
        software.amazon.awscdk.services.apigatewayv2.StageAttributes.builder()

    public override fun stageName(stageName: String) {
      cdkBuilder.stageName(stageName)
    }

    public fun build(): software.amazon.awscdk.services.apigatewayv2.StageAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigatewayv2.StageAttributes,
  ) : StageAttributes {
    public override fun stageName(): String = unwrap(this).getStageName()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): StageAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigatewayv2.StageAttributes):
        StageAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: StageAttributes):
        software.amazon.awscdk.services.apigatewayv2.StageAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
