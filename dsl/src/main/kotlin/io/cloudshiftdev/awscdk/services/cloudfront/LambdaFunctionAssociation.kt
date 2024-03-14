package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IVersion
import kotlin.Boolean
import kotlin.Unit

public interface LambdaFunctionAssociation {
  /**
   * The lambda event type defines at which event the lambda is called during the request lifecycle.
   */
  public fun eventType(): LambdaEdgeEventType

  /**
   * Allows a Lambda function to have read access to the body content.
   *
   * Only valid for "request" event types (`ORIGIN_REQUEST` or `VIEWER_REQUEST`).
   * See
   * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html
   *
   * Default: false
   */
  public fun includeBody(): Boolean? = unwrap(this).getIncludeBody()

  /**
   * A version of the lambda to associate.
   */
  public fun lambdaFunction(): IVersion

  /**
   * A builder for [LambdaFunctionAssociation]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventType The lambda event type defines at which event the lambda is called during the
     * request lifecycle. 
     */
    public fun eventType(eventType: LambdaEdgeEventType)

    /**
     * @param includeBody Allows a Lambda function to have read access to the body content.
     * Only valid for "request" event types (`ORIGIN_REQUEST` or `VIEWER_REQUEST`).
     * See
     * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html
     */
    public fun includeBody(includeBody: Boolean)

    /**
     * @param lambdaFunction A version of the lambda to associate. 
     */
    public fun lambdaFunction(lambdaFunction: IVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.Builder =
        software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation.builder()

    /**
     * @param eventType The lambda event type defines at which event the lambda is called during the
     * request lifecycle. 
     */
    override fun eventType(eventType: LambdaEdgeEventType) {
      cdkBuilder.eventType(eventType.let(LambdaEdgeEventType::unwrap))
    }

    /**
     * @param includeBody Allows a Lambda function to have read access to the body content.
     * Only valid for "request" event types (`ORIGIN_REQUEST` or `VIEWER_REQUEST`).
     * See
     * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html
     */
    override fun includeBody(includeBody: Boolean) {
      cdkBuilder.includeBody(includeBody)
    }

    /**
     * @param lambdaFunction A version of the lambda to associate. 
     */
    override fun lambdaFunction(lambdaFunction: IVersion) {
      cdkBuilder.lambdaFunction(lambdaFunction.let(IVersion::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.LambdaFunctionAssociation,
  ) : CdkObject(cdkObject), LambdaFunctionAssociation {
    /**
     * The lambda event type defines at which event the lambda is called during the request
     * lifecycle.
     */
    override fun eventType(): LambdaEdgeEventType =
        unwrap(this).getEventType().let(LambdaEdgeEventType::wrap)

    /**
     * Allows a Lambda function to have read access to the body content.
     *
     * Only valid for "request" event types (`ORIGIN_REQUEST` or `VIEWER_REQUEST`).
     * See
     * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html
     *
     * Default: false
     */
    override fun includeBody(): Boolean? = unwrap(this).getIncludeBody()

    /**
     * A version of the lambda to associate.
     */
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
