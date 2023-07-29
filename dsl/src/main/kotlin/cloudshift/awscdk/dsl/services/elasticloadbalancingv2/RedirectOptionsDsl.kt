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

package cloudshift.awscdk.dsl.services.elasticloadbalancingv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.elasticloadbalancingv2.RedirectOptions

/**
 * Options for `ListenerAction.redirect()`.
 *
 * A URI consists of the following components: protocol://hostname:port/path?query. You must modify
 * at least one of the following components to avoid a redirect loop: protocol, hostname, port, or
 * path. Any components that you do not modify retain their original values.
 *
 * You can reuse URI components using the following reserved keywords:
 * * `#{protocol}`
 * * `#{host}`
 * * `#{port}`
 * * `#{path}` (the leading "/" is removed)
 * * `#{query}`
 *
 * For example, you can change the path to "/new/#{path}", the hostname to "example.#{host}", or the
 * query to "#{query}&amp;value=xyz".
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.elasticloadbalancingv2.*;
 * RedirectOptions redirectOptions = RedirectOptions.builder()
 * .host("host")
 * .path("path")
 * .permanent(false)
 * .port("port")
 * .protocol("protocol")
 * .query("query")
 * .build();
 * ```
 */
@CdkDslMarker
public class RedirectOptionsDsl {
    private val cdkBuilder: RedirectOptions.Builder = RedirectOptions.builder()

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

    /**
     * @param permanent The HTTP redirect code. The redirect is either permanent (HTTP 301) or
     *   temporary (HTTP 302).
     */
    public fun permanent(permanent: Boolean) {
        cdkBuilder.permanent(permanent)
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

    public fun build(): RedirectOptions = cdkBuilder.build()
}
