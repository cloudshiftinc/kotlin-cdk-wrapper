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
