@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

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

/**
 * Creates an API destination, which is an HTTP invocation endpoint configured as a target for
 * events.
 *
 * When using ApiDesinations with OAuth authentication we recommend these best practices:
 *
 * * Create a secret in Secrets Manager with your OAuth credentials.
 * * Reference that secret in your CloudFormation template for `AWS::Events::Connection` using
 * CloudFormation dynamic reference syntax. For more information, see [Secrets Manager
 * secrets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
 * .
 *
 * When the Connection resource is created the secret will be passed to EventBridge and stored in
 * the customer account using “Service Linked Secrets,” effectively creating two secrets. This will
 * minimize the cost because the original secret is only accessed when a CloudFormation template is
 * created or updated, not every time an event is sent to the ApiDestination. The secret stored in the
 * customer account by EventBridge is the one used for each event sent to the ApiDestination and AWS is
 * responsible for the fees.
 *
 *
 * The secret stored in the customer account by EventBridge can’t be updated directly, only when a
 * CloudFormation template is updated.
 *
 *
 * For examples of CloudFormation templates that use secrets, see
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#aws-resource-events-connection--examples)
 * .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.events.*;
 * CfnApiDestination cfnApiDestination = CfnApiDestination.Builder.create(this,
 * "MyCfnApiDestination")
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
public open class CfnApiDestination(
  cdkObject: software.amazon.awscdk.services.events.CfnApiDestination,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiDestinationProps,
  ) :
      this(software.amazon.awscdk.services.events.CfnApiDestination(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApiDestinationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiDestinationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApiDestinationProps(props)
  )

  /**
   * The ARN of the API destination that was created by the request.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the Amazon Resource Name (ARN) of an API destination in resource format, so it can be
   * used in the `Resource` element of IAM permission policy statements.
   *
   * For more information, see [Resource types defined by Amazon
   * EventBridge](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazoneventbridge.html#amazoneventbridge-resources-for-iam-policies)
   * in the *Service Authorization Reference* .
   *
   * For example, the following resource defines an IAM policy that grants permission to update a
   * specific API destination.
   *
   * `Resources: ExamplePolicy: Type: AWS::IAM::Policy Properties: PolicyName: ExamplePolicy
   * PolicyDocument: Version: '2012-10-17' Statement: - Effect: Allow Action: -
   * events:UpdateApiDestination Resource: - !GetAtt myApiDestination.ArnForPolicy`
   */
  public open fun attrArnForPolicy(): String = unwrap(this).getAttrArnForPolicy()

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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.events.CfnApiDestination.CFN_RESOURCE_TYPE_NAME

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
        software.amazon.awscdk.services.events.CfnApiDestination = wrapped.cdkObject as
        software.amazon.awscdk.services.events.CfnApiDestination
  }
}
