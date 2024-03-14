package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.lambda.IVersion
import kotlin.Boolean
import kotlin.Unit

public interface EdgeLambda {
  /**
   * The type of event in response to which should the function be invoked.
   */
  public fun eventType(): LambdaEdgeEventType

  /**
   * The version of the Lambda function that will be invoked.
   *
   * **Note**: it's not possible to use the '$LATEST' function version for Lambda&#64;Edge!
   */
  public fun functionVersion(): IVersion

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
   * A builder for [EdgeLambda]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventType The type of event in response to which should the function be invoked. 
     */
    public fun eventType(eventType: LambdaEdgeEventType)

    /**
     * @param functionVersion The version of the Lambda function that will be invoked. 
     * **Note**: it's not possible to use the '$LATEST' function version for Lambda&#64;Edge!
     */
    public fun functionVersion(functionVersion: IVersion)

    /**
     * @param includeBody Allows a Lambda function to have read access to the body content.
     * Only valid for "request" event types (`ORIGIN_REQUEST` or `VIEWER_REQUEST`).
     * See
     * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/lambda-include-body-access.html
     */
    public fun includeBody(includeBody: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.EdgeLambda.Builder =
        software.amazon.awscdk.services.cloudfront.EdgeLambda.builder()

    /**
     * @param eventType The type of event in response to which should the function be invoked. 
     */
    override fun eventType(eventType: LambdaEdgeEventType) {
      cdkBuilder.eventType(eventType.let(LambdaEdgeEventType::unwrap))
    }

    /**
     * @param functionVersion The version of the Lambda function that will be invoked. 
     * **Note**: it's not possible to use the '$LATEST' function version for Lambda&#64;Edge!
     */
    override fun functionVersion(functionVersion: IVersion) {
      cdkBuilder.functionVersion(functionVersion.let(IVersion::unwrap))
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

    public fun build(): software.amazon.awscdk.services.cloudfront.EdgeLambda = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.cloudfront.EdgeLambda,
  ) : EdgeLambda {
    /**
     * The type of event in response to which should the function be invoked.
     */
    override fun eventType(): LambdaEdgeEventType =
        unwrap(this).getEventType().let(LambdaEdgeEventType::wrap)

    /**
     * The version of the Lambda function that will be invoked.
     *
     * **Note**: it's not possible to use the '$LATEST' function version for Lambda&#64;Edge!
     */
    override fun functionVersion(): IVersion = unwrap(this).getFunctionVersion().let(IVersion::wrap)

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
