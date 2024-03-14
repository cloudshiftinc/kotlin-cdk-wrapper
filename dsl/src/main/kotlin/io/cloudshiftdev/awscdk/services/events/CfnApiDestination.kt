package io.cloudshiftdev.awscdk.services.events

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnApiDestination internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.CfnApiDestination,
) : CfnResource(cdkObject), IInspectable {
  /**
   * The ARN of the API destination that was created by the request.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ARN of the connection to use for the API destination.
   */
  public open fun connectionArn(): String = unwrap(this).getConnectionArn()

  /**
   * The ARN of the connection to use for the API destination.
   */
  public open fun connectionArn(`value`: String) {
    unwrap(this).setConnectionArn(`value`)
  }

  /**
   * A description for the API destination to create.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description for the API destination to create.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The method to use for the request to the HTTP invocation endpoint.
   */
  public open fun httpMethod(): String = unwrap(this).getHttpMethod()

  /**
   * The method to use for the request to the HTTP invocation endpoint.
   */
  public open fun httpMethod(`value`: String) {
    unwrap(this).setHttpMethod(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The URL to the HTTP invocation endpoint for the API destination.
   */
  public open fun invocationEndpoint(): String = unwrap(this).getInvocationEndpoint()

  /**
   * The URL to the HTTP invocation endpoint for the API destination.
   */
  public open fun invocationEndpoint(`value`: String) {
    unwrap(this).setInvocationEndpoint(`value`)
  }

  /**
   * The maximum number of requests per second to send to the HTTP invocation endpoint.
   */
  public open fun invocationRateLimitPerSecond(): Number? =
      unwrap(this).getInvocationRateLimitPerSecond()

  /**
   * The maximum number of requests per second to send to the HTTP invocation endpoint.
   */
  public open fun invocationRateLimitPerSecond(`value`: Number) {
    unwrap(this).setInvocationRateLimitPerSecond(`value`)
  }

  /**
   * The name for the API destination to create.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name for the API destination to create.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.events.CfnApiDestination].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ARN of the connection to use for the API destination.
     *
     * The destination endpoint must support the authorization type specified for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-connectionarn)
     * @param connectionArn The ARN of the connection to use for the API destination. 
     */
    public fun connectionArn(connectionArn: String)

    /**
     * A description for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-description)
     * @param description A description for the API destination to create. 
     */
    public fun description(description: String)

    /**
     * The method to use for the request to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-httpmethod)
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
     */
    public fun httpMethod(httpMethod: String)

    /**
     * The URL to the HTTP invocation endpoint for the API destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationendpoint)
     * @param invocationEndpoint The URL to the HTTP invocation endpoint for the API destination. 
     */
    public fun invocationEndpoint(invocationEndpoint: String)

    /**
     * The maximum number of requests per second to send to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationratelimitpersecond)
     * @param invocationRateLimitPerSecond The maximum number of requests per second to send to the
     * HTTP invocation endpoint. 
     */
    public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number)

    /**
     * The name for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-name)
     * @param name The name for the API destination to create. 
     */
    public fun name(name: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.CfnApiDestination.Builder =
        software.amazon.awscdk.services.events.CfnApiDestination.Builder.create(scope, id)

    /**
     * The ARN of the connection to use for the API destination.
     *
     * The destination endpoint must support the authorization type specified for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-connectionarn)
     * @param connectionArn The ARN of the connection to use for the API destination. 
     */
    override fun connectionArn(connectionArn: String) {
      cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * A description for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-description)
     * @param description A description for the API destination to create. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The method to use for the request to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-httpmethod)
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint. 
     */
    override fun httpMethod(httpMethod: String) {
      cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * The URL to the HTTP invocation endpoint for the API destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationendpoint)
     * @param invocationEndpoint The URL to the HTTP invocation endpoint for the API destination. 
     */
    override fun invocationEndpoint(invocationEndpoint: String) {
      cdkBuilder.invocationEndpoint(invocationEndpoint)
    }

    /**
     * The maximum number of requests per second to send to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationratelimitpersecond)
     * @param invocationRateLimitPerSecond The maximum number of requests per second to send to the
     * HTTP invocation endpoint. 
     */
    override fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number) {
      cdkBuilder.invocationRateLimitPerSecond(invocationRateLimitPerSecond)
    }

    /**
     * The name for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-name)
     * @param name The name for the API destination to create. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.events.CfnApiDestination =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiDestination {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiDestination(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.CfnApiDestination):
        CfnApiDestination = CfnApiDestination(cdkObject)

    internal fun unwrap(wrapped: CfnApiDestination):
        software.amazon.awscdk.services.events.CfnApiDestination = wrapped.cdkObject
  }
}
