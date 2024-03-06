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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_authorizers

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps

/**
 * Properties to initialize HttpJwtAuthorizer.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer;
 * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
 * String issuer = "https://test.us.auth0.com";
 * HttpJwtAuthorizer authorizer = HttpJwtAuthorizer.Builder.create("BooksAuthorizer", issuer)
 * .jwtAudience(List.of("3131231"))
 * .build();
 * HttpApi api = new HttpApi(this, "HttpApi");
 * api.addRoutes(AddRoutesOptions.builder()
 * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
 * .path("/books")
 * .authorizer(authorizer)
 * .build());
 * ```
 */
@CdkDslMarker
public class HttpJwtAuthorizerPropsDsl {
    private val cdkBuilder: HttpJwtAuthorizerProps.Builder = HttpJwtAuthorizerProps.builder()

    private val _identitySource: MutableList<String> = mutableListOf()

    private val _jwtAudience: MutableList<String> = mutableListOf()

    /** @param authorizerName The name of the authorizer. */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /** @param identitySource The identity source for which authorization is requested. */
    public fun identitySource(vararg identitySource: String) {
        _identitySource.addAll(listOf(*identitySource))
    }

    /** @param identitySource The identity source for which authorization is requested. */
    public fun identitySource(identitySource: Collection<String>) {
        _identitySource.addAll(identitySource)
    }

    /**
     * @param jwtAudience A list of the intended recipients of the JWT. A valid JWT must provide an
     *   aud that matches at least one entry in this list.
     */
    public fun jwtAudience(vararg jwtAudience: String) {
        _jwtAudience.addAll(listOf(*jwtAudience))
    }

    /**
     * @param jwtAudience A list of the intended recipients of the JWT. A valid JWT must provide an
     *   aud that matches at least one entry in this list.
     */
    public fun jwtAudience(jwtAudience: Collection<String>) {
        _jwtAudience.addAll(jwtAudience)
    }

    public fun build(): HttpJwtAuthorizerProps {
        if (_identitySource.isNotEmpty()) cdkBuilder.identitySource(_identitySource)
        if (_jwtAudience.isNotEmpty()) cdkBuilder.jwtAudience(_jwtAudience)
        return cdkBuilder.build()
    }
}
