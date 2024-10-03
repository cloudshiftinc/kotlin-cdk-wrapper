@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit

/**
 * Properties for defining a `CfnApiDestination`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * CfnApiDestinationProps cfnApiDestinationProps = CfnApiDestinationProps.builder()
 * .connectionArn("connectionArn")
 * .httpMethod("httpMethod")
 * .invocationEndpoint("invocationEndpoint")
 * // the properties below are optional
 * .description("description")
 * .invocationRateLimitPerSecond(123)
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html)
 */
public interface CfnApiDestinationProps {
  /**
   * The ARN of the connection to use for the API destination.
   *
   * The destination endpoint must support the authorization type specified for the connection.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-connectionarn)
   */
  public fun connectionArn(): String

  /**
   * A description for the API destination to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The method to use for the request to the HTTP invocation endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-httpmethod)
   */
  public fun httpMethod(): String

  /**
   * The URL to the HTTP invocation endpoint for the API destination.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationendpoint)
   */
  public fun invocationEndpoint(): String

  /**
   * The maximum number of requests per second to send to the HTTP invocation endpoint.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationratelimitpersecond)
   */
  public fun invocationRateLimitPerSecond(): Number? =
      unwrap(this).getInvocationRateLimitPerSecond()

  /**
   * The name for the API destination to create.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [CfnApiDestinationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param connectionArn The ARN of the connection to use for the API destination. 
     * The destination endpoint must support the authorization type specified for the connection.
     */
    public fun connectionArn(connectionArn: String)

    /**
     * @param description A description for the API destination to create.
     */
    public fun description(description: String)

    /**
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
     */
    public fun httpMethod(httpMethod: String)

    /**
     * @param invocationEndpoint The URL to the HTTP invocation endpoint for the API destination. 
     */
    public fun invocationEndpoint(invocationEndpoint: String)

    /**
     * @param invocationRateLimitPerSecond The maximum number of requests per second to send to the
     * HTTP invocation endpoint.
     */
    public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number)

    /**
     * @param name The name for the API destination to create.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnApiDestinationProps.Builder =
        software.amazon.awscdk.services.events.CfnApiDestinationProps.builder()

    /**
     * @param connectionArn The ARN of the connection to use for the API destination. 
     * The destination endpoint must support the authorization type specified for the connection.
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param description A description for the API destination to create.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param invocationEndpoint The URL to the HTTP invocation endpoint for the API destination. 
     */
    override fun invocationEndpoint(invocationEndpoint: String) {
      cdkBuilder.invocationEndpoint(invocationEndpoint)
    }

    /**
     * @param invocationRateLimitPerSecond The maximum number of requests per second to send to the
     * HTTP invocation endpoint.
     */
    override fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number) {
      cdkBuilder.invocationRateLimitPerSecond(invocationRateLimitPerSecond)
    }

    /**
     * @param name The name for the API destination to create.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnApiDestinationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.events.CfnApiDestinationProps,
  ) : CdkObject(cdkObject),
      CfnApiDestinationProps {
    /**
     * The ARN of the connection to use for the API destination.
     *
     * The destination endpoint must support the authorization type specified for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-connectionarn)
     */
    override fun connectionArn(): String = unwrap(this).getConnectionArn()

    /**
     * A description for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The method to use for the request to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-httpmethod)
     */
    override fun httpMethod(): String = unwrap(this).getHttpMethod()

    /**
     * The URL to the HTTP invocation endpoint for the API destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationendpoint)
     */
    override fun invocationEndpoint(): String = unwrap(this).getInvocationEndpoint()

    /**
     * The maximum number of requests per second to send to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationratelimitpersecond)
     */
    override fun invocationRateLimitPerSecond(): Number? =
        unwrap(this).getInvocationRateLimitPerSecond()

    /**
     * The name for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-name)
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiDestinationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnApiDestinationProps):
        CfnApiDestinationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApiDestinationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiDestinationProps):
        software.amazon.awscdk.services.events.CfnApiDestinationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.events.CfnApiDestinationProps
  }
}
