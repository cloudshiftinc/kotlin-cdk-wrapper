@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import software.constructs.Construct

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
 * In the `AWS::RefactorSpaces::Route` resource, you can only update the `ActivationState` property,
 * which resides under the `UriPathRoute` and `DefaultRoute` properties. All other properties
 * associated with the `AWS::RefactorSpaces::Route` cannot be updated, even though the property
 * description might indicate otherwise. Updating all other properties will result in the replacement
 * of Route.
 *
 *
 * When you create a route, Refactor Spaces configures the Amazon API Gateway to send traffic to the
 * target service as follows:
 *
 * * *URL Endpoints*
 *
 * If the service has a URL endpoint, and the endpoint resolves to a private IP address, Refactor
 * Spaces routes traffic using the API Gateway VPC link. If a service endpoint resolves to a public IP
 * address, Refactor Spaces routes traffic over the public internet. Services can have HTTP or HTTPS
 * URL endpoints. For HTTPS URLs, publicly-signed certificates are supported. Private Certificate
 * Authorities (CAs) are permitted only if the CA's domain is also publicly resolvable.
 *
 * Refactor Spaces automatically resolves the public Domain Name System (DNS) names that are set in
 * `CreateService:UrlEndpoint` when you create a service. The DNS names resolve when the DNS
 * time-to-live (TTL) expires, or every 60 seconds for TTLs less than 60 seconds. This periodic DNS
 * resolution ensures that the route configuration remains up-to-date.
 *
 * *One-time health check*
 *
 * A one-time health check is performed on the service when either the route is updated from
 * inactive to active, or when it is created with an active state. If the health check fails, the route
 * transitions the route state to `FAILED` , an error code of `SERVICE_ENDPOINT_HEALTH_CHECK_FAILURE`
 * is provided, and no traffic is sent to the service.
 *
 * For private URLs, a target group is created on the Network Load Balancer and the load balancer
 * target group runs default target health checks. By default, the health check is run against the
 * service endpoint URL. Optionally, the health check can be performed against a different protocol,
 * port, and/or path using the
 * [CreateService:UrlEndpoint](https://docs.aws.amazon.com/migrationhub-refactor-spaces/latest/APIReference/API_CreateService.html#migrationhubrefactorspaces-CreateService-request-UrlEndpoint)
 * parameter. All other health check settings for the load balancer use the default values described in
 * the [Health checks for your target
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
@CdkDslMarker
public class CfnRouteDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnRoute.Builder = CfnRoute.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The unique identifier of the application.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-applicationidentifier)
   * @param applicationIdentifier The unique identifier of the application. 
   */
  public fun applicationIdentifier(applicationIdentifier: String) {
    cdkBuilder.applicationIdentifier(applicationIdentifier)
  }

  /**
   * Configuration for the default route type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
   * @param defaultRoute Configuration for the default route type. 
   */
  public fun defaultRoute(defaultRoute: IResolvable) {
    cdkBuilder.defaultRoute(defaultRoute)
  }

  /**
   * Configuration for the default route type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-defaultroute)
   * @param defaultRoute Configuration for the default route type. 
   */
  public fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty) {
    cdkBuilder.defaultRoute(defaultRoute)
  }

  /**
   * The unique identifier of the environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-environmentidentifier)
   * @param environmentIdentifier The unique identifier of the environment. 
   */
  public fun environmentIdentifier(environmentIdentifier: String) {
    cdkBuilder.environmentIdentifier(environmentIdentifier)
  }

  /**
   * The route type of the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-routetype)
   * @param routeType The route type of the route. 
   */
  public fun routeType(routeType: String) {
    cdkBuilder.routeType(routeType)
  }

  /**
   * The unique identifier of the service.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-serviceidentifier)
   * @param serviceIdentifier The unique identifier of the service. 
   */
  public fun serviceIdentifier(serviceIdentifier: String) {
    cdkBuilder.serviceIdentifier(serviceIdentifier)
  }

  /**
   * The tags assigned to the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
   * @param tags The tags assigned to the route. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The tags assigned to the route.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-tags)
   * @param tags The tags assigned to the route. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * The configuration for the URI path route type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
   * @param uriPathRoute The configuration for the URI path route type. 
   */
  public fun uriPathRoute(uriPathRoute: IResolvable) {
    cdkBuilder.uriPathRoute(uriPathRoute)
  }

  /**
   * The configuration for the URI path route type.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-refactorspaces-route.html#cfn-refactorspaces-route-uripathroute)
   * @param uriPathRoute The configuration for the URI path route type. 
   */
  public fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty) {
    cdkBuilder.uriPathRoute(uriPathRoute)
  }

  public fun build(): CfnRoute {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
