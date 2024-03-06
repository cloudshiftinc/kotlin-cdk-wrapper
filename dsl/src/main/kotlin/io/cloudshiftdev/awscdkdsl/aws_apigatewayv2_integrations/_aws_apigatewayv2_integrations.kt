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

package io.cloudshiftdev.awscdkdsl.aws_apigatewayv2_integrations

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegrationProps
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegrationProps
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegrationProps
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpPrivateIntegrationOptions
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegrationProps
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegrationProps
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpUrlIntegrationProps
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration
import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegrationProps
import software.amazon.awscdk.services.elasticloadbalancingv2.IApplicationListener
import software.amazon.awscdk.services.elasticloadbalancingv2.INetworkListener
import software.amazon.awscdk.services.lambda.IFunction
import software.amazon.awscdk.services.servicediscovery.IService

public object aws_apigatewayv2_integrations {
    /**
     * The Application Load Balancer integration resource for HTTP API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * ApplicationLoadBalancer lb = ApplicationLoadBalancer.Builder.create(this,
     * "lb").vpc(vpc).build();
     * ApplicationListener listener = lb.addListener("listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddApplicationTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(new HttpAlbIntegration("DefaultIntegration", listener))
     * .build();
     * ```
     */
    public inline fun httpAlbIntegration(
        id: String,
        listener: IApplicationListener,
        block: HttpAlbIntegrationDsl.() -> Unit = {},
    ): HttpAlbIntegration {
        val builder = HttpAlbIntegrationDsl(id, listener)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize `HttpAlbIntegration`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpAlbIntegration;
     * ApplicationLoadBalancer lb;
     * ApplicationListener listener = lb.addListener("listener",
     * BaseApplicationListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddApplicationTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(HttpAlbIntegration.Builder.create("DefaultIntegration", listener)
     * .parameterMapping(new ParameterMapping().custom("myKey", "myValue"))
     * .build())
     * .build();
     * ```
     */
    public inline fun httpAlbIntegrationProps(
        block: HttpAlbIntegrationPropsDsl.() -> Unit = {}
    ): HttpAlbIntegrationProps {
        val builder = HttpAlbIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Lambda Proxy integration resource for HTTP API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpLambdaIntegration;
     * Function booksDefaultFn;
     * HttpLambdaIntegration booksIntegration = new HttpLambdaIntegration("BooksIntegration",
     * booksDefaultFn);
     * HttpApi httpApi = new HttpApi(this, "HttpApi");
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/books")
     * .methods(List.of(HttpMethod.GET))
     * .integration(booksIntegration)
     * .build());
     * ```
     */
    public inline fun httpLambdaIntegration(
        id: String,
        handler: IFunction,
        block: HttpLambdaIntegrationDsl.() -> Unit = {},
    ): HttpLambdaIntegration {
        val builder = HttpLambdaIntegrationDsl(id, handler)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Lambda Proxy integration properties.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.*;
     * ParameterMapping parameterMapping;
     * PayloadFormatVersion payloadFormatVersion;
     * HttpLambdaIntegrationProps httpLambdaIntegrationProps = HttpLambdaIntegrationProps.builder()
     * .parameterMapping(parameterMapping)
     * .payloadFormatVersion(payloadFormatVersion)
     * .build();
     * ```
     */
    public inline fun httpLambdaIntegrationProps(
        block: HttpLambdaIntegrationPropsDsl.() -> Unit = {}
    ): HttpLambdaIntegrationProps {
        val builder = HttpLambdaIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Network Load Balancer integration resource for HTTP API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpNlbIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * NetworkLoadBalancer lb = NetworkLoadBalancer.Builder.create(this, "lb").vpc(vpc).build();
     * NetworkListener listener = lb.addListener("listener",
     * BaseNetworkListenerProps.builder().port(80).build());
     * listener.addTargets("target", AddNetworkTargetsProps.builder()
     * .port(80)
     * .build());
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(new HttpNlbIntegration("DefaultIntegration", listener))
     * .build();
     * ```
     */
    public inline fun httpNlbIntegration(
        id: String,
        listener: INetworkListener,
        block: HttpNlbIntegrationDsl.() -> Unit = {},
    ): HttpNlbIntegration {
        val builder = HttpNlbIntegrationDsl(id, listener)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize `HttpNlbIntegration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.*;
     * ParameterMapping parameterMapping;
     * VpcLink vpcLink;
     * HttpNlbIntegrationProps httpNlbIntegrationProps = HttpNlbIntegrationProps.builder()
     * .method(HttpMethod.ANY)
     * .parameterMapping(parameterMapping)
     * .secureServerName("secureServerName")
     * .vpcLink(vpcLink)
     * .build();
     * ```
     */
    public inline fun httpNlbIntegrationProps(
        block: HttpNlbIntegrationPropsDsl.() -> Unit = {}
    ): HttpNlbIntegrationProps {
        val builder = HttpNlbIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * Base options for private integration.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.*;
     * ParameterMapping parameterMapping;
     * VpcLink vpcLink;
     * HttpPrivateIntegrationOptions httpPrivateIntegrationOptions =
     * HttpPrivateIntegrationOptions.builder()
     * .method(HttpMethod.ANY)
     * .parameterMapping(parameterMapping)
     * .secureServerName("secureServerName")
     * .vpcLink(vpcLink)
     * .build();
     * ```
     */
    public inline fun httpPrivateIntegrationOptions(
        block: HttpPrivateIntegrationOptionsDsl.() -> Unit = {}
    ): HttpPrivateIntegrationOptions {
        val builder = HttpPrivateIntegrationOptionsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The Service Discovery integration resource for HTTP API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.servicediscovery.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
     * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "Namespace")
     * .name("boobar.com")
     * .vpc(vpc)
     * .build();
     * Service service = namespace.createService("Service");
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(HttpServiceDiscoveryIntegration.Builder.create("DefaultIntegration",
     * service)
     * .vpcLink(vpcLink)
     * .build())
     * .build();
     * ```
     */
    public inline fun httpServiceDiscoveryIntegration(
        id: String,
        service: IService,
        block: HttpServiceDiscoveryIntegrationDsl.() -> Unit = {},
    ): HttpServiceDiscoveryIntegration {
        val builder = HttpServiceDiscoveryIntegrationDsl(id, service)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize `HttpServiceDiscoveryIntegration`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.services.servicediscovery.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpServiceDiscoveryIntegration;
     * Vpc vpc = new Vpc(this, "VPC");
     * VpcLink vpcLink = VpcLink.Builder.create(this, "VpcLink").vpc(vpc).build();
     * PrivateDnsNamespace namespace = PrivateDnsNamespace.Builder.create(this, "Namespace")
     * .name("boobar.com")
     * .vpc(vpc)
     * .build();
     * Service service = namespace.createService("Service");
     * HttpApi httpEndpoint = HttpApi.Builder.create(this, "HttpProxyPrivateApi")
     * .defaultIntegration(HttpServiceDiscoveryIntegration.Builder.create("DefaultIntegration",
     * service)
     * .vpcLink(vpcLink)
     * .build())
     * .build();
     * ```
     */
    public inline fun httpServiceDiscoveryIntegrationProps(
        block: HttpServiceDiscoveryIntegrationPropsDsl.() -> Unit = {}
    ): HttpServiceDiscoveryIntegrationProps {
        val builder = HttpServiceDiscoveryIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The StepFunctions integration resource for HTTP API.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * StateMachine stateMachine;
     * HttpApi httpApi;
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/start")
     * .methods(List.of(HttpMethod.POST))
     * .integration(HttpStepFunctionsIntegration.Builder.create("StartExecutionIntegration")
     * .stateMachine(stateMachine)
     * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION)
     * .build())
     * .build());
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/start-sync")
     * .methods(List.of(HttpMethod.POST))
     * .integration(HttpStepFunctionsIntegration.Builder.create("StartSyncExecutionIntegration")
     * .stateMachine(stateMachine)
     * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_SYNC_EXECUTION)
     * .build())
     * .build());
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/stop")
     * .methods(List.of(HttpMethod.POST))
     * .integration(HttpStepFunctionsIntegration.Builder.create("StopExecutionIntegration")
     * .stateMachine(stateMachine)
     * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_STOP_EXECUTION)
     * // For the `STOP_EXECUTION` subtype, it is necessary to specify the `executionArn`.
     * .parameterMapping(new ParameterMapping().custom("ExecutionArn",
     * "$request.querystring.executionArn"))
     * .build())
     * .build());
     * ```
     */
    public inline fun httpStepFunctionsIntegration(
        id: String,
        block: HttpStepFunctionsIntegrationDsl.() -> Unit = {}
    ): HttpStepFunctionsIntegration {
        val builder = HttpStepFunctionsIntegrationDsl(id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize `HttpStepFunctionsIntegration`.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.HttpStepFunctionsIntegration;
     * import software.amazon.awscdk.services.stepfunctions.*;
     * StateMachine stateMachine;
     * HttpApi httpApi;
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/start")
     * .methods(List.of(HttpMethod.POST))
     * .integration(HttpStepFunctionsIntegration.Builder.create("StartExecutionIntegration")
     * .stateMachine(stateMachine)
     * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_EXECUTION)
     * .build())
     * .build());
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/start-sync")
     * .methods(List.of(HttpMethod.POST))
     * .integration(HttpStepFunctionsIntegration.Builder.create("StartSyncExecutionIntegration")
     * .stateMachine(stateMachine)
     * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_START_SYNC_EXECUTION)
     * .build())
     * .build());
     * httpApi.addRoutes(AddRoutesOptions.builder()
     * .path("/stop")
     * .methods(List.of(HttpMethod.POST))
     * .integration(HttpStepFunctionsIntegration.Builder.create("StopExecutionIntegration")
     * .stateMachine(stateMachine)
     * .subtype(HttpIntegrationSubtype.STEPFUNCTIONS_STOP_EXECUTION)
     * // For the `STOP_EXECUTION` subtype, it is necessary to specify the `executionArn`.
     * .parameterMapping(new ParameterMapping().custom("ExecutionArn",
     * "$request.querystring.executionArn"))
     * .build())
     * .build());
     * ```
     */
    public inline fun httpStepFunctionsIntegrationProps(
        block: HttpStepFunctionsIntegrationPropsDsl.() -> Unit = {}
    ): HttpStepFunctionsIntegrationProps {
        val builder = HttpStepFunctionsIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * The HTTP Proxy integration resource for HTTP API.
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
    public inline fun httpUrlIntegration(
        id: String,
        url: String,
        block: HttpUrlIntegrationDsl.() -> Unit = {},
    ): HttpUrlIntegration {
        val builder = HttpUrlIntegrationDsl(id, url)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Properties to initialize a new `HttpProxyIntegration`.
     *
     * Example:
     * ```
     * // The code below shows an example of how to instantiate this type.
     * // The values are placeholders you should change.
     * import software.amazon.awscdk.services.apigatewayv2.*;
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.*;
     * ParameterMapping parameterMapping;
     * HttpUrlIntegrationProps httpUrlIntegrationProps = HttpUrlIntegrationProps.builder()
     * .method(HttpMethod.ANY)
     * .parameterMapping(parameterMapping)
     * .build();
     * ```
     */
    public inline fun httpUrlIntegrationProps(
        block: HttpUrlIntegrationPropsDsl.() -> Unit = {}
    ): HttpUrlIntegrationProps {
        val builder = HttpUrlIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }

    /**
     * AWS WebSocket AWS Type Integration.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration;
     * import software.amazon.awscdk.services.dynamodb.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role apiRole;
     * Table table;
     * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
     * WebSocketStage.Builder.create(this, "mystage")
     * .webSocketApi(webSocketApi)
     * .stageName("dev")
     * .autoDeploy(true)
     * .build();
     * webSocketApi.addRoute("$connect", WebSocketRouteOptions.builder()
     * .integration(WebSocketAwsIntegration.Builder.create("DynamodbPutItem")
     * .integrationUri(String.format("arn:aws:apigateway:%s:dynamodb:action/PutItem", this.region))
     * .integrationMethod(HttpMethod.POST)
     * .credentialsRole(apiRole)
     * .requestTemplates(Map.of(
     * "application/json", JSON.stringify(Map.of(
     * "TableName", table.getTableName(),
     * "Item", Map.of(
     * "id", Map.of(
     * "S", "$context.requestId"))))))
     * .build())
     * .build());
     * ```
     */
    public inline fun webSocketAwsIntegration(
        id: String,
        block: WebSocketAwsIntegrationDsl.() -> Unit = {}
    ): WebSocketAwsIntegration {
        val builder = WebSocketAwsIntegrationDsl(id)
        builder.apply(block)
        return builder.build()
    }

    /**
     * Props for AWS type integration for an HTTP Api.
     *
     * Example:
     * ```
     * import software.amazon.awscdk.aws_apigatewayv2_integrations.WebSocketAwsIntegration;
     * import software.amazon.awscdk.services.dynamodb.*;
     * import software.amazon.awscdk.services.iam.*;
     * Role apiRole;
     * Table table;
     * WebSocketApi webSocketApi = new WebSocketApi(this, "mywsapi");
     * WebSocketStage.Builder.create(this, "mystage")
     * .webSocketApi(webSocketApi)
     * .stageName("dev")
     * .autoDeploy(true)
     * .build();
     * webSocketApi.addRoute("$connect", WebSocketRouteOptions.builder()
     * .integration(WebSocketAwsIntegration.Builder.create("DynamodbPutItem")
     * .integrationUri(String.format("arn:aws:apigateway:%s:dynamodb:action/PutItem", this.region))
     * .integrationMethod(HttpMethod.POST)
     * .credentialsRole(apiRole)
     * .requestTemplates(Map.of(
     * "application/json", JSON.stringify(Map.of(
     * "TableName", table.getTableName(),
     * "Item", Map.of(
     * "id", Map.of(
     * "S", "$context.requestId"))))))
     * .build())
     * .build());
     * ```
     */
    public inline fun webSocketAwsIntegrationProps(
        block: WebSocketAwsIntegrationPropsDsl.() -> Unit = {}
    ): WebSocketAwsIntegrationProps {
        val builder = WebSocketAwsIntegrationPropsDsl()
        builder.apply(block)
        return builder.build()
    }
}
