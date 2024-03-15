@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.lambda.IVersion
import kotlin.Boolean
import kotlin.Unit

public interface LambdaFunctionAssociation {
  public fun eventType(): LambdaEdgeEventType

  public fun includeBody(): Boolean? = unwrap(this).getIncludeBody()

  public fun lambdaFunction(): IVersion

  @CdkDslMarker
  public interface Builder {
    public fun eventType(eventType: LambdaEdgeEventType)

    public fun includeBody(includeBody: Boolean)

    public fun lambdaFunction(lambdaFunction: IVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.Builder =
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.builder()

    override fun eventType(eventType: LambdaEdgeEventType) {
      cdkBuilder.eventType(eventType.let(LambdaEdgeEventType::unwrap))
    }

    override fun includeBody(includeBody: Boolean) {
      cdkBuilder.includeBody(includeBody)
    }

    override fun lambdaFunction(lambdaFunction: IVersion) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation,
  ) : CdkObject(cdkObject), LambdaFunctionAssociation {
    override fun eventType(): LambdaEdgeEventType =
        unwrap(this).getEventType().let(LambdaEdgeEventType::wrap)

    override fun includeBody(): Boolean? = unwrap(this).getIncludeBody()

    override fun lambdaFunction(): IVersion = unwrap(this).getLambdaFunction().let(IVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaFunctionAssociation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation):
        LambdaFunctionAssociation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LambdaFunctionAssociation):
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation
  }
}
