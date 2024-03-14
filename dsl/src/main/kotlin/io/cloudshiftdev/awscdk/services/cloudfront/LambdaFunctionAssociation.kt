package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.services.lambda.IVersion
import kotlin.Boolean
import kotlin.Unit

public interface LambdaFunctionAssociation {
  public fun eventType(): LambdaEdgeEventType

  public fun includeBody(): Boolean? = unwrap(this).getIncludeBody()

  public fun lambdaFunction(): IVersion

  public interface Builder {
    public fun eventType(eventType: LambdaEdgeEventType) {
    }

    public fun includeBody(includeBody: Boolean) {
    }

    public fun lambdaFunction(lambdaFunction: IVersion) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.Builder =
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.builder()

    public override fun eventType(eventType: LambdaEdgeEventType) {
      cdkBuilder.eventType(eventType.let(LambdaEdgeEventType::unwrap))
    }

    public override fun includeBody(includeBody: Boolean) {
      cdkBuilder.includeBody(includeBody)
    }

    public override fun lambdaFunction(lambdaFunction: IVersion) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation,
  ) : LambdaFunctionAssociation {
    public override fun eventType(): LambdaEdgeEventType =
        unwrap(this).getEventType().let(LambdaEdgeEventType::wrap)

    public override fun includeBody(): Boolean? = unwrap(this).getIncludeBody()

    public override fun lambdaFunction(): IVersion =
        unwrap(this).getLambdaFunction().let(IVersion::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaFunctionAssociation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation):
        LambdaFunctionAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaFunctionAssociation):
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation = (wrapped as
        Wrapper).cdkObject
  }
}
