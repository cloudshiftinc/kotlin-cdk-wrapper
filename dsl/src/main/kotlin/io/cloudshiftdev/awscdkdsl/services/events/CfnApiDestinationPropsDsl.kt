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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.events.CfnApiDestinationProps

/**
 * Properties for defining a `CfnApiDestination`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
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
@CdkDslMarker
public class CfnApiDestinationPropsDsl {
    private val cdkBuilder: CfnApiDestinationProps.Builder = CfnApiDestinationProps.builder()

    /**
     * @param connectionArn The ARN of the connection to use for the API destination. The
     *   destination endpoint must support the authorization type specified for the connection.
     */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /** @param description A description for the API destination to create. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param httpMethod The method to use for the request to the HTTP invocation endpoint. */
    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * @param invocationEndpoint The URL to the HTTP invocation endpoint for the API destination.
     */
    public fun invocationEndpoint(invocationEndpoint: String) {
        cdkBuilder.invocationEndpoint(invocationEndpoint)
    }

    /**
     * @param invocationRateLimitPerSecond The maximum number of requests per second to send to the
     *   HTTP invocation endpoint.
     */
    public fun invocationRateLimitPerSecond(invocationRateLimitPerSecond: Number) {
        cdkBuilder.invocationRateLimitPerSecond(invocationRateLimitPerSecond)
    }

    /** @param name The name for the API destination to create. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnApiDestinationProps = cdkBuilder.build()
}
