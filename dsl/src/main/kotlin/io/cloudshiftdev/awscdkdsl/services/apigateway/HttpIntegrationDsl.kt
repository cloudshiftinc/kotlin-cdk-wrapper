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

package io.cloudshiftdev.awscdkdsl.services.apigateway

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.apigateway.HttpIntegration
import software.amazon.awscdk.services.apigateway.IntegrationOptions

/**
 * You can integrate an API method with an HTTP endpoint using the HTTP proxy integration or the
 * HTTP custom integration,.
 *
 * With the proxy integration, the setup is simple. You only need to set the HTTP method and the
 * HTTP endpoint URI, according to the backend requirements, if you are not concerned with content
 * encoding or caching.
 *
 * With the custom integration, the setup is more involved. In addition to the proxy integration
 * setup steps, you need to specify how the incoming request data is mapped to the integration
 * request and how the resulting integration response data is mapped to the method response.
 *
 * Example:
 * ```
 * Function authFn;
 * Resource books;
 * RequestAuthorizer auth = RequestAuthorizer.Builder.create(this, "booksAuthorizer")
 * .handler(authFn)
 * .identitySources(List.of(IdentitySource.header("Authorization")))
 * .build();
 * books.addMethod("GET", new HttpIntegration("http://amazon.com"), MethodOptions.builder()
 * .authorizer(auth)
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpIntegrationDsl(
    url: String,
) {
    private val cdkBuilder: HttpIntegration.Builder = HttpIntegration.Builder.create(url)

    /**
     * HTTP method to use when invoking the backend URL.
     *
     * Default: GET
     *
     * @param httpMethod HTTP method to use when invoking the backend URL.
     */
    public fun httpMethod(httpMethod: String) {
        cdkBuilder.httpMethod(httpMethod)
    }

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     *
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    public fun options(options: IntegrationOptionsDsl.() -> Unit = {}) {
        val builder = IntegrationOptionsDsl()
        builder.apply(options)
        cdkBuilder.options(builder.build())
    }

    /**
     * Integration options, such as request/resopnse mapping, content handling, etc.
     *
     * Default: defaults based on `IntegrationOptions` defaults
     *
     * @param options Integration options, such as request/resopnse mapping, content handling, etc.
     */
    public fun options(options: IntegrationOptions) {
        cdkBuilder.options(options)
    }

    /**
     * Determines whether to use proxy integration or custom integration.
     *
     * Default: true
     *
     * @param proxy Determines whether to use proxy integration or custom integration.
     */
    public fun proxy(proxy: Boolean) {
        cdkBuilder.proxy(proxy)
    }

    public fun build(): HttpIntegration = cdkBuilder.build()
}
