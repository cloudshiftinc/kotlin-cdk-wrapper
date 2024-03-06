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

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpJwtAuthorizerProps
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizerProps
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizerProps
import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer
import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizerProps
import software.amazon.awscdk.services.cognito.IUserPool
import software.amazon.awscdk.services.lambda.IFunction

public object aws_apigatewayv2_authorizers {
    /**
     * Authorize Http Api routes on whether the requester is registered as part of an AWS Cognito
     * user pool.
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
    public inline fun httpJwtAuthorizer(
        id: String,
        jwtIssuer: String,
        block: HttpJwtAuthorizerDsl.() -> Unit = {},
    ): HttpJwtAuthorizer {
        val builder = HttpJwtAuthorizerDsl(id, jwtIssuer)
        builder.apply(block)
        return builder.build()
    }

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
    public inline fun httpJwtAuthorizerProps(
        block: HttpJwtAuthorizerPropsDsl.() -> Unit = {}
    ): HttpJwtAuthorizerProps {
        val builder = HttpJwtAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Authorize Http Api routes via a lambda function.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer;
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
     * // This function handles your auth logic
     * Function authHandler;
     * HttpLambdaAuthorizer authorizer = HttpLambdaAuthorizer.Builder.create("BooksAuthorizer",
     * authHandler)
     * .responseTypes(List.of(HttpLambdaResponseType.SIMPLE))
     * .build();
     * HttpApi api = new HttpApi(this, "HttpApi");
     * api.addRoutes(AddRoutesOptions.builder()
     * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
     * .path("/books")
     * .authorizer(authorizer)
     * .build());
     * ```
     */
    public inline fun httpLambdaAuthorizer(
        id: String,
        handler: IFunction,
        block: HttpLambdaAuthorizerDsl.() -> Unit = {},
    ): HttpLambdaAuthorizer {
        val builder = HttpLambdaAuthorizerDsl(id, handler)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize HttpTokenAuthorizer.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaAuthorizer;
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpLambdaResponseType;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
     * // This function handles your auth logic
     * Function authHandler;
     * HttpLambdaAuthorizer authorizer = HttpLambdaAuthorizer.Builder.create("BooksAuthorizer",
     * authHandler)
     * .responseTypes(List.of(HttpLambdaResponseType.SIMPLE))
     * .build();
     * HttpApi api = new HttpApi(this, "HttpApi");
     * api.addRoutes(AddRoutesOptions.builder()
     * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
     * .path("/books")
     * .authorizer(authorizer)
     * .build());
     * ```
     */
    public inline fun httpLambdaAuthorizerProps(
        block: HttpLambdaAuthorizerPropsDsl.() -> Unit = {}
    ): HttpLambdaAuthorizerProps {
        val builder = HttpLambdaAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Authorize Http Api routes on whether the requester is registered as part of an AWS Cognito
     * user pool.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.cognito.*;
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.HttpUserPoolAuthorizer;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration;
     * UserPool userPool = new UserPool(this, "UserPool");
     * HttpUserPoolAuthorizer authorizer = new HttpUserPoolAuthorizer("BooksAuthorizer", userPool);
     * HttpApi api = new HttpApi(this, "HttpApi");
     * api.addRoutes(AddRoutesOptions.builder()
     * .integration(new HttpUrlIntegration("BooksIntegration", "https://get-books-proxy.example.com"))
     * .path("/books")
     * .authorizer(authorizer)
     * .build());
     * ```
     */
    public inline fun httpUserPoolAuthorizer(
        id: String,
        pool: IUserPool,
        block: HttpUserPoolAuthorizerDsl.() -> Unit = {},
    ): HttpUserPoolAuthorizer {
        val builder = HttpUserPoolAuthorizerDsl(id, pool)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize HttpUserPoolAuthorizer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.*;
     * import software.amazon.awscdk.services.cognito.*;
     * UserPoolClient userPoolClient;
     * HttpUserPoolAuthorizerProps httpUserPoolAuthorizerProps = HttpUserPoolAuthorizerProps.builder()
     * .authorizerName("authorizerName")
     * .identitySource(List.of("identitySource"))
     * .userPoolClients(List.of(userPoolClient))
     * .userPoolRegion("userPoolRegion")
     * .build();
     * ```
     */
    public inline fun httpUserPoolAuthorizerProps(
        block: HttpUserPoolAuthorizerPropsDsl.() -> Unit = {}
    ): HttpUserPoolAuthorizerProps {
        val builder = HttpUserPoolAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Authorize WebSocket Api routes via a lambda function.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.WebSocketLambdaAuthorizer;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketLambdaIntegration;
     * // This function handles your auth logic
     * Function authHandler;
     * // This function handles your WebSocket requests
     * Function handler;
     * WebSocketLambdaAuthorizer authorizer = new WebSocketLambdaAuthorizer("Authorizer",
     * authHandler);
     * WebSocketLambdaIntegration integration = new WebSocketLambdaIntegration("Integration",
     * handler);
     * WebSocketApi.Builder.create(this, "WebSocketApi")
     * .connectRouteOptions(WebSocketRouteOptions.builder()
     * .integration(integration)
     * .authorizer(authorizer)
     * .build())
     * .build();
     * ```
     */
    public inline fun webSocketLambdaAuthorizer(
        id: String,
        handler: IFunction,
        block: WebSocketLambdaAuthorizerDsl.() -> Unit = {},
    ): WebSocketLambdaAuthorizer {
        val builder = WebSocketLambdaAuthorizerDsl(id, handler)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize WebSocketTokenAuthorizer.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.aws_apigatewayv2_authorizers.*;
     * WebSocketLambdaAuthorizerProps webSocketLambdaAuthorizerProps =
     * WebSocketLambdaAuthorizerProps.builder()
     * .authorizerName("authorizerName")
     * .identitySource(List.of("identitySource"))
     * .build();
     * ```
     */
    public inline fun webSocketLambdaAuthorizerProps(
        block: WebSocketLambdaAuthorizerPropsDsl.() -> Unit = {}
    ): WebSocketLambdaAuthorizerProps {
        val builder = WebSocketLambdaAuthorizerPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
