@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.refactorspaces.CfnApplication
import software.amazon.awscdk.services.refactorspaces.CfnApplicationProps
import software.amazon.awscdk.services.refactorspaces.CfnEnvironment
import software.amazon.awscdk.services.refactorspaces.CfnEnvironmentProps
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import software.amazon.awscdk.services.refactorspaces.CfnRouteProps
import software.amazon.awscdk.services.refactorspaces.CfnService
import software.amazon.awscdk.services.refactorspaces.CfnServiceProps
import software.constructs.Construct

public object refactorspaces {
  /**
   * Creates an AWS Migration Hub Refactor Spaces application.
   *
   * The account that owns the environment also owns the applications created inside the
   * environment, regardless of the account that creates the application. Refactor Spaces provisions an
   * Amazon API Gateway , API Gateway VPC link, and Network Load Balancer for the application proxy
   * inside your account.
   *
   * In environments created with a
   * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
   * of `NONE` you need to configure [VPC to VPC
   * connectivity](https://docs.aws.amazon.com/whitepapers/latest/aws-vpc-connectivity-options/amazon-vpc-to-amazon-vpc-connectivity-options.html)
   * between your service VPC and the application proxy VPC to route traffic through the application
   * proxy to a service with a private URL endpoint. For more information, see [Create an
   * application](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/getting-started-create-application.html)
   * in the *Refactor Spaces User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnApplication cfnApplication = CfnApplication.Builder.create(this, "MyCfnApplication")
   * .environmentIdentifier("environmentIdentifier")
   * .name("name")
   * .proxyType("proxyType")
   * .vpcId("vpcId")
   * // the properties below are optional
   * .apiGatewayProxy(ApiGatewayProxyInputProperty.builder()
   * .endpointType("endpointType")
   * .stageName("stageName")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html)
   */
  public inline fun cfnApplication(
    scope: Construct,
    id: String,
    block: CfnApplicationDsl.() -> Unit = {},
  ): CfnApplication {
    val builder = CfnApplicationDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A wrapper object holding the Amazon API Gateway endpoint input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * ApiGatewayProxyInputProperty apiGatewayProxyInputProperty =
   * ApiGatewayProxyInputProperty.builder()
   * .endpointType("endpointType")
   * .stageName("stageName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-application-apigatewayproxyinput.html)
   */
  public inline
      fun cfnApplicationApiGatewayProxyInputProperty(block: CfnApplicationApiGatewayProxyInputPropertyDsl.() -> Unit
      = {}): CfnApplication.ApiGatewayProxyInputProperty {
    val builder = CfnApplicationApiGatewayProxyInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnApplication`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
   * .environmentIdentifier("environmentIdentifier")
   * .name("name")
   * .proxyType("proxyType")
   * .vpcId("vpcId")
   * // the properties below are optional
   * .apiGatewayProxy(ApiGatewayProxyInputProperty.builder()
   * .endpointType("endpointType")
   * .stageName("stageName")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-application.html)
   */
  public inline fun cfnApplicationProps(block: CfnApplicationPropsDsl.() -> Unit = {}):
      CfnApplicationProps {
    val builder = CfnApplicationPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates an AWS Migration Hub Refactor Spaces environment.
   *
   * The caller owns the environment resource, and all Refactor Spaces applications, services, and
   * routes created within the environment. They are referred to as the *environment owner* . The
   * environment owner has cross-account visibility and control of Refactor Spaces resources that are
   * added to the environment by other accounts that the environment is shared with.
   *
   * When creating an environment with a
   * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
   * of `TRANSIT_GATEWAY` , Refactor Spaces provisions a transit gateway to enable services in VPCs to
   * communicate directly across accounts. If
   * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
   * is `NONE` , Refactor Spaces does not create a transit gateway and you must use your network
   * infrastructure to route traffic to services with private URL endpoints.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnEnvironment cfnEnvironment = CfnEnvironment.Builder.create(this, "MyCfnEnvironment")
   * .name("name")
   * .networkFabricType("networkFabricType")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html)
   */
  public inline fun cfnEnvironment(
    scope: Construct,
    id: String,
    block: CfnEnvironmentDsl.() -> Unit = {},
  ): CfnEnvironment {
    val builder = CfnEnvironmentDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnEnvironment`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnEnvironmentProps cfnEnvironmentProps = CfnEnvironmentProps.builder()
   * .name("name")
   * .networkFabricType("networkFabricType")
   * // the properties below are optional
   * .description("description")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-environment.html)
   */
  public inline fun cfnEnvironmentProps(block: CfnEnvironmentPropsDsl.() -> Unit = {}):
      CfnEnvironmentProps {
    val builder = CfnEnvironmentPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates an AWS Migration Hub Refactor Spaces route.
   *
   * The account owner of the service resource is always the environment owner, regardless of which
   * account creates the route. Routes target a service in the application. If an application does not
   * have any routes, then the first route must be created as a `DEFAULT` `RouteType` .
   *
   * When created, the default route defaults to an active state so state is not a required input.
   * However, like all other state values the state of the default route can be updated after creation,
   * but only when all other routes are also inactive. Conversely, no route can be active without the
   * default route also being active.
   *
   *
   * In the `AWS::RefactorSpaces::Route` resource, you can only update the `ActivationState`
   * property, which resides under the `UriPathRoute` and `DefaultRoute` properties. All other
   * properties associated with the `AWS::RefactorSpaces::Route` cannot be updated, even though the
   * property description might indicate otherwise. Updating all other properties will result in the
   * replacement of Route.
   *
   *
   * When you create a route, Refactor Spaces configures the Amazon API Gateway to send traffic to
   * the target service as follows:
   *
   * * *URL Endpoints*
   *
   * If the service has a URL endpoint, and the endpoint resolves to a private IP address, Refactor
   * Spaces routes traffic using the API Gateway VPC link. If a service endpoint resolves to a public
   * IP address, Refactor Spaces routes traffic over the public internet. Services can have HTTP or
   * HTTPS URL endpoints. For HTTPS URLs, publicly-signed certificates are supported. Private
   * Certificate Authorities (CAs) are permitted only if the CA's domain is also publicly resolvable.
   *
   * Refactor Spaces automatically resolves the public Domain Name System (DNS) names that are set
   * in `CreateService:UrlEndpoint` when you create a service. The DNS names resolve when the DNS
   * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds. This periodic DNS
   * resolution ensures that the route configuration remains up-to-date.
   *
   * *One-time health check*
   *
   * A one-time health check is performed on the service when either the route is updated from
   * inactive to active, or when it is created with an active state. If the health check fails, the
   * route transitions the route state to `FAILED` , an error code of
   * `SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE` is provided, and no traffic is sent to the service.
   *
   * For private URLs, a target group is created on the Network Load Balancer and the load balancer
   * target group runs default target health checks. By default, the health check is run against the
   * service endpoint URL. Optionally, the health check can be performed against a different protocol,
   * port, and/or path using the
   * [CreateService:UrlEndpoint](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateService.html#migrationhubrefactorspaces-CreateService-request-UrlEndpoint)
   * parameter. All other health check settings for the load balancer use the default values described
   * in the [Health checks for your target
   * groups](https://docs.aws.amazon.com/elasticloadbalancing/latest/application/target-group-health-checks.html)
   * in the *Elastic Load Balancing guide* . The health check is considered successful if at least one
   * target within the target group transitions to a healthy state.
   *
   * * *AWS Lambda function endpoints*
   *
   * If the service has an AWS Lambda function endpoint, then Refactor Spaces configures the Lambda
   * function's resource policy to allow the application's API Gateway to invoke the function.
   *
   * The Lambda function state is checked. If the function is not active, the function configuration
   * is updated so that Lambda resources are provisioned. If the Lambda state is `Failed` , then the
   * route creation fails. For more information, see the [GetFunctionConfiguration's State response
   * parameter](https://docs.aws.amazon.com/lambda/latest/dg/API_GetFunctionConfiguration.html#SSS-GetFunctionConfiguration-response-State)
   * in the *AWS Lambda Developer Guide* .
   *
   * A check is performed to determine that a Lambda function with the specified ARN exists. If it
   * does not exist, the health check fails. For public URLs, a connection is opened to the public
   * endpoint. If the URL is not reachable, the health check fails.
   *
   * *Environments without a network bridge*
   *
   * When you create environments without a network bridge (
   * [CreateEnvironment:NetworkFabricType](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateEnvironment.html#migrationhubrefactorspaces-CreateEnvironment-request-NetworkFabricType)
   * is `NONE)` and you use your own networking infrastructure, you need to configure [VPC to VPC
   * connectivity](https://docs.aws.amazon.com/whitepapers/latest/aws-vpc-connectivity-options/amazon-vpc-to-amazon-vpc-connectivity-options.html)
   * between your network and the application proxy VPC. Route creation from the application proxy to
   * service endpoints will fail if your network is not configured to connect to the application proxy
   * VPC. For more information, see [Create a
   * route](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/userguide/getting-started-create-role.html)
   * in the *Refactor Spaces User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnRoute cfnRoute = CfnRoute.Builder.create(this, "MyCfnRoute")
   * .applicationIdentifier("applicationIdentifier")
   * .environmentIdentifier("environmentIdentifier")
   * .routeType("routeType")
   * .serviceIdentifier("serviceIdentifier")
   * // the properties below are optional
   * .defaultRoute(DefaultRouteInputProperty.builder()
   * .activationState("activationState")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .uriPathRoute(UriPathRouteInputProperty.builder()
   * .activationState("activationState")
   * // the properties below are optional
   * .appendSourcePath(false)
   * .includeChildPaths(false)
   * .methods(List.of("methods"))
   * .sourcePath("sourcePath")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html)
   */
  public inline fun cfnRoute(
    scope: Construct,
    id: String,
    block: CfnRouteDsl.() -> Unit = {},
  ): CfnRoute {
    val builder = CfnRouteDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration for the default route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * DefaultRouteInputProperty defaultRouteInputProperty = DefaultRouteInputProperty.builder()
   * .activationState("activationState")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-defaultrouteinput.html)
   */
  public inline
      fun cfnRouteDefaultRouteInputProperty(block: CfnRouteDefaultRouteInputPropertyDsl.() -> Unit =
      {}): CfnRoute.DefaultRouteInputProperty {
    val builder = CfnRouteDefaultRouteInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnRoute`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnRouteProps cfnRouteProps = CfnRouteProps.builder()
   * .applicationIdentifier("applicationIdentifier")
   * .environmentIdentifier("environmentIdentifier")
   * .routeType("routeType")
   * .serviceIdentifier("serviceIdentifier")
   * // the properties below are optional
   * .defaultRoute(DefaultRouteInputProperty.builder()
   * .activationState("activationState")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .uriPathRoute(UriPathRouteInputProperty.builder()
   * .activationState("activationState")
   * // the properties below are optional
   * .appendSourcePath(false)
   * .includeChildPaths(false)
   * .methods(List.of("methods"))
   * .sourcePath("sourcePath")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html)
   */
  public inline fun cfnRouteProps(block: CfnRoutePropsDsl.() -> Unit = {}): CfnRouteProps {
    val builder = CfnRoutePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration for the URI path route type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * UriPathRouteInputProperty uriPathRouteInputProperty = UriPathRouteInputProperty.builder()
   * .activationState("activationState")
   * // the properties below are optional
   * .appendSourcePath(false)
   * .includeChildPaths(false)
   * .methods(List.of("methods"))
   * .sourcePath("sourcePath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-route-uripathrouteinput.html)
   */
  public inline
      fun cfnRouteUriPathRouteInputProperty(block: CfnRouteUriPathRouteInputPropertyDsl.() -> Unit =
      {}): CfnRoute.UriPathRouteInputProperty {
    val builder = CfnRouteUriPathRouteInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates an AWS Migration Hub Refactor Spaces service.
   *
   * The account owner of the service is always the environment owner, regardless of which account
   * in the environment creates the service. Services have either a URL endpoint in a virtual private
   * cloud (VPC), or a Lambda function endpoint.
   *
   *
   * If an AWS resource is launched in a service VPC, and you want it to be accessible to all of an
   * environment’s services with VPCs and routes, apply the `RefactorSpacesSecurityGroup` to the
   * resource. Alternatively, to add more cross-account constraints, apply your own security group.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnService cfnService = CfnService.Builder.create(this, "MyCfnService")
   * .applicationIdentifier("applicationIdentifier")
   * .endpointType("endpointType")
   * .environmentIdentifier("environmentIdentifier")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .lambdaEndpoint(LambdaEndpointInputProperty.builder()
   * .arn("arn")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .urlEndpoint(UrlEndpointInputProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .healthUrl("healthUrl")
   * .build())
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html)
   */
  public inline fun cfnService(
    scope: Construct,
    id: String,
    block: CfnServiceDsl.() -> Unit = {},
  ): CfnService {
    val builder = CfnServiceDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * The input for the AWS Lambda endpoint type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * LambdaEndpointInputProperty lambdaEndpointInputProperty = LambdaEndpointInputProperty.builder()
   * .arn("arn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-lambdaendpointinput.html)
   */
  public inline
      fun cfnServiceLambdaEndpointInputProperty(block: CfnServiceLambdaEndpointInputPropertyDsl.() -> Unit
      = {}): CfnService.LambdaEndpointInputProperty {
    val builder = CfnServiceLambdaEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnService`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * CfnServiceProps cfnServiceProps = CfnServiceProps.builder()
   * .applicationIdentifier("applicationIdentifier")
   * .endpointType("endpointType")
   * .environmentIdentifier("environmentIdentifier")
   * .name("name")
   * // the properties below are optional
   * .description("description")
   * .lambdaEndpoint(LambdaEndpointInputProperty.builder()
   * .arn("arn")
   * .build())
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .urlEndpoint(UrlEndpointInputProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .healthUrl("healthUrl")
   * .build())
   * .vpcId("vpcId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-service.html)
   */
  public inline fun cfnServiceProps(block: CfnServicePropsDsl.() -> Unit = {}): CfnServiceProps {
    val builder = CfnServicePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The configuration for the URL endpoint type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.refactorspaces.*;
   * UrlEndpointInputProperty urlEndpointInputProperty = UrlEndpointInputProperty.builder()
   * .url("url")
   * // the properties below are optional
   * .healthUrl("healthUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-refactorspaces-service-urlendpointinput.html)
   */
  public inline
      fun cfnServiceUrlEndpointInputProperty(block: CfnServiceUrlEndpointInputPropertyDsl.() -> Unit
      = {}): CfnService.UrlEndpointInputProperty {
    val builder = CfnServiceUrlEndpointInputPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
