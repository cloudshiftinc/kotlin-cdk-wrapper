package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.services.lambda.IVersion
import kotlin.Boolean
import kotlin.Unit

public interface EdgeLambda {
  public fun eventType(): LambdaEdgeEventType

  public fun functionVersion(): IVersion

  public fun includeBody(): Boolean? = unwrap(this).getIncludeBody()

  public interface Builder {
    public fun eventType(eventType: LambdaEdgeEventType) {
    }

    public fun functionVersion(functionVersion: IVersion) {
    }

    public fun includeBody(includeBody: Boolean) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.EdgeLambda.Builder =
        software.amazon.awscdk.services.cloudfront.EdgeLambda.builder()

    public override fun eventType(eventType: LambdaEdgeEventType) {
      cdkBuilder.eventType(eventType.let(LambdaEdgeEventType::unwrap))
    }

    public override fun functionVersion(functionVersion: IVersion) {
      cdkBuilder.functionVersion(functionVersion.let(IVersion::unwrap))
    }

    public override fun includeBody(includeBody: Boolean) {
      cdkBuilder.includeBody(includeBody)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.EdgeLambda = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.EdgeLambda,
  ) : EdgeLambda {
    public override fun eventType(): LambdaEdgeEventType =
        unwrap(this).getEventType().let(LambdaEdgeEventType::wrap)

    public override fun functionVersion(): IVersion =
        unwrap(this).getFunctionVersion().let(IVersion::wrap)

    public override fun includeBody(): Boolean? = unwrap(this).getIncludeBody()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EdgeLambda {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.EdgeLambda): EdgeLambda
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EdgeLambda): software.amazon.awscdk.services.cloudfront.EdgeLambda
        = (wrapped as Wrapper).cdkObject
  }
}
