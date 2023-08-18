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

package io.cloudshiftdev.awscdkdsl.services.elasticloadbalancingv2

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.CfnListenerRule

/**
 * Information about a redirect action.
 *
 * A URI consists of the following components: protocol://hostname:port/path?query. You must modify
 * at least one of the following components to avoid a redirect loop: protocol, hostname, port, or
 * path. Any components that you do not modify retain their original values.
 *
 * You can reuse URI components using the following reserved keywords:
 * * #{protocol}
 * * #{host}
 * * #{port}
 * * #{path} (the leading "/" is removed)
 * * #{query}
 *
 * For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or the
 * query to "#{query}&amp;value=xyz".
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * RedirectConfigProperty redirectConfigProperty = RedirectConfigProperty.builder()
 * .statusCode("statusCode")
 * // the properties below are optional
 * .host("host")
 * .path("path")
 * .port("port")
 * .protocol("protocol")
 * .query("query")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-elasticloadbalancingv2-listenerrule-redirectconfig.html)
 */
@CdkDslMarker
public class CfnListenerRuleRedirectConfigPropertyDsl {
    private val cdkBuilder: CfnListenerRule.RedirectConfigProperty.Builder =
        CfnListenerRule.RedirectConfigProperty.builder()

    /**
     * @param host The hostname. This component is not percent-encoded. The hostname can
     *   contain #{host}.
     */
    public fun host(host: String) {
        cdkBuilder.host(host)
    }

    /**
     * @param path The absolute path, starting with the leading "/". This component is not
     *   percent-encoded. The path can contain #{host}, #{path}, and #{port}.
     */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    /** @param port The port. You can specify a value from 1 to 65535 or #{port}. */
    public fun port(port: String) {
        cdkBuilder.port(port)
    }

    /**
     * @param protocol The protocol. You can specify HTTP, HTTPS, or #{protocol}. You can redirect
     *   HTTP to HTTP, HTTP to HTTPS, and HTTPS to HTTPS. You cannot redirect HTTPS to HTTP.
     */
    public fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
    }

    /**
     * @param query The query parameters, URL-encoded when necessary, but not percent-encoded. Do
     *   not include the leading "?", as it is automatically added. You can specify any of the
     *   reserved keywords.
     */
    public fun query(query: String) {
        cdkBuilder.query(query)
    }

    /**
     * @param statusCode The HTTP redirect code. The redirect is either permanent (HTTP 301) or
     *   temporary (HTTP 302).
     */
    public fun statusCode(statusCode: String) {
        cdkBuilder.statusCode(statusCode)
    }

    public fun build(): CfnListenerRule.RedirectConfigProperty = cdkBuilder.build()
}
