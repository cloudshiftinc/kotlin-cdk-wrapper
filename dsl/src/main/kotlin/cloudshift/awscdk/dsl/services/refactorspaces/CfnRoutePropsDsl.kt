@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import software.amazon.awscdk.services.refactorspaces.CfnRouteProps
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRoutePropsDsl {
    private val cdkBuilder: CfnRouteProps.Builder = CfnRouteProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    public fun applicationIdentifier(applicationIdentifier: String) {
        cdkBuilder.applicationIdentifier(applicationIdentifier)
    }

    public fun defaultRoute(defaultRoute: IResolvable) {
        cdkBuilder.defaultRoute(defaultRoute)
    }

    public fun defaultRoute(defaultRoute: CfnRoute.DefaultRouteInputProperty) {
        cdkBuilder.defaultRoute(defaultRoute)
    }

    public fun environmentIdentifier(environmentIdentifier: String) {
        cdkBuilder.environmentIdentifier(environmentIdentifier)
    }

    public fun routeType(routeType: String) {
        cdkBuilder.routeType(routeType)
    }

    public fun serviceIdentifier(serviceIdentifier: String) {
        cdkBuilder.serviceIdentifier(serviceIdentifier)
    }

    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun uriPathRoute(uriPathRoute: IResolvable) {
        cdkBuilder.uriPathRoute(uriPathRoute)
    }

    public fun uriPathRoute(uriPathRoute: CfnRoute.UriPathRouteInputProperty) {
        cdkBuilder.uriPathRoute(uriPathRoute)
    }

    public fun build(): CfnRouteProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
