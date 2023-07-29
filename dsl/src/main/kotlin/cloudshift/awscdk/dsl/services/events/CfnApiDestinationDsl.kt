@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.CfnApiDestination
import software.constructs.Construct

/**
 * Creates an API destination, which is an HTTP invocation endpoint configured as a target for
 * events.
 *
 * When using ApiDesinations with OAuth authentication we recommend these best practices:
 * * Create a secret in Secrets Manager with your OAuth credentials.
 * * Reference that secret in your CloudFormation template for `AWS::Events::Connection` using
 *   CloudFormation dynamic reference syntax. For more information, see
 *   [Secrets Manager secrets](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/dynamic-references.html#dynamic-references-secretsmanager)
 *   .
 *
 * When the Connection resource is created the secret will be passed to EventBridge and stored in
 * the customer account using “Service Linked Secrets,” effectively creating two secrets. This will
 * minimize the cost because the original secret is only accessed when a CloudFormation template is
 * created or updated, not every time an event is sent to the ApiDestination. The secret stored in
 * the customer account by EventBridge is the one used for each event sent to the ApiDestination and
 * AWS is responsible for the fees.
 *
 * The secret stored in the customer account by EventBridge can’t be updated directly, only when a
 * CloudFormation template is updated.
 *
 * For examples of CloudFormation templates that use secrets, see
 * [Examples](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-connection.html#aws-resource-events-connection--examples)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
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
@CdkDslMarker
public class CfnApiDestinationDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApiDestination.Builder = CfnApiDestination.Builder.create(scope, id)

    /**
     * The ARN of the connection to use for the API destination.
     *
     * The destination endpoint must support the authorization type specified for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-connectionarn)
     *
     * @param connectionArn The ARN of the connection to use for the API destination.
     */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * A description for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-description)
     *
     * @param description A description for the API destination to create.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * The method to use for the request to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-httpmethod)
     *
     * @param httpMethod The method to use for the request to the HTTP invocation endpoint.
     */
    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * The URL to the HTTP invocation endpoint for the API destination.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationendpoint)
     *
     * @param invocationEndpoint The URL to the HTTP invocation endpoint for the API destination.
     */
    public fun invocationEndpoint(invocationEndpoint: String) {
        cdkBuilder.invocationEndpoint(invocationEndpoint)
    }

    /**
     * The maximum number of requests per second to send to the HTTP invocation endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-invocationratelimitpersecond)
     *
     * @param invocationRateLimitPerSecond The maximum number of requests per second to send to the
     *   HTTP invocation endpoint.
     */
    public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number) {
        cdkBuilder.invocationRateLimitPerSecond(invocationRateLimitPerSecond)
    }

    /**
     * The name for the API destination to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-events-apidestination.html#cfn-events-apidestination-name)
     *
     * @param name The name for the API destination to create.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnApiDestination = cdkBuilder.build()
}
