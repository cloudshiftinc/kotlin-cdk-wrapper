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
import software.amazon.awscdk.services.refactorspaces.CfnRouteProps

@CdkDslMarker
public class CfnRoutePropsDsl {
  private val cdkBuilder: CfnRouteProps.Builder = CfnRouteProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param applicationIdentifier The unique identifier of the application. 
   */
  public fun applicationIdentifier(applicationIdentifier: String) {
    cdkBuilder.applicationIdentifier(applicationIdentifier)
  }

  /**
   * @param defaultRoute Configuration for the default route type.
   */
  public fun defaultRoute(defaultRoute: IResolvable) {
    cdkBuilder.defaultRoute(defaultRoute)
  }

  /**
   * @param defaultRoute Configuration for the default route type.
   */
  public fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty) {
    cdkBuilder.defaultRoute(defaultRoute)
  }

  /**
   * @param environmentIdentifier The unique identifier of the environment. 
   */
  public fun environmentIdentifier(environmentIdentifier: String) {
    cdkBuilder.environmentIdentifier(environmentIdentifier)
  }

  /**
   * @param routeType The route type of the route. 
   */
  public fun routeType(routeType: String) {
    cdkBuilder.routeType(routeType)
  }

  /**
   * @param serviceIdentifier The unique identifier of the service. 
   */
  public fun serviceIdentifier(serviceIdentifier: String) {
    cdkBuilder.serviceIdentifier(serviceIdentifier)
  }

  /**
   * @param tags The tags assigned to the route.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags assigned to the route.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param uriPathRoute The configuration for the URI path route type.
   */
  public fun uriPathRoute(uriPathRoute: IResolvable) {
    cdkBuilder.uriPathRoute(uriPathRoute)
  }

  /**
   * @param uriPathRoute The configuration for the URI path route type.
   */
  public fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty) {
    cdkBuilder.uriPathRoute(uriPathRoute)
  }

  public fun build(): CfnRouteProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
