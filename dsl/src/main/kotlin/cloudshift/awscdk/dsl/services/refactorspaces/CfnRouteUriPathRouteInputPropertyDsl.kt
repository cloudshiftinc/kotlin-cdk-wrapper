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

package cloudshift.awscdk.dsl.services.refactorspaces

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.refactorspaces.CfnRoute

/**
 * The configuration for the URI path route type.
 *
 * Example:
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
@CdkDslMarker
public class CfnRouteUriPathRouteInputPropertyDsl {
    private val cdkBuilder: CfnRoute.UriPathRouteInputProperty.Builder =
        CfnRoute.UriPathRouteInputProperty.builder()

    private val _methods: MutableList<String> = mutableListOf()

    /**
     * @param activationState If set to `ACTIVE` , traffic is forwarded to this route’s service
     *   after the route is created.
     */
    public fun activationState(activationState: String) {
        cdkBuilder.activationState(activationState)
    }

    /**
     * @param appendSourcePath If set to `true` , this option appends the source path to the service
     *   URL endpoint.
     */
    public fun appendSourcePath(appendSourcePath: Boolean) {
        cdkBuilder.appendSourcePath(appendSourcePath)
    }

    /**
     * @param appendSourcePath If set to `true` , this option appends the source path to the service
     *   URL endpoint.
     */
    public fun appendSourcePath(appendSourcePath: IResolvable) {
        cdkBuilder.appendSourcePath(appendSourcePath)
    }

    /**
     * @param includeChildPaths Indicates whether to match all subpaths of the given source path. If
     *   this value is `false` , requests must match the source path exactly before they are
     *   forwarded to this route's service.
     */
    public fun includeChildPaths(includeChildPaths: Boolean) {
        cdkBuilder.includeChildPaths(includeChildPaths)
    }

    /**
     * @param includeChildPaths Indicates whether to match all subpaths of the given source path. If
     *   this value is `false` , requests must match the source path exactly before they are
     *   forwarded to this route's service.
     */
    public fun includeChildPaths(includeChildPaths: IResolvable) {
        cdkBuilder.includeChildPaths(includeChildPaths)
    }

    /**
     * @param methods A list of HTTP methods to match. An empty list matches all values. If a method
     *   is present, only HTTP requests using that method are forwarded to this route’s service.
     */
    public fun methods(vararg methods: String) {
        _methods.addAll(listOf(*methods))
    }

    /**
     * @param methods A list of HTTP methods to match. An empty list matches all values. If a method
     *   is present, only HTTP requests using that method are forwarded to this route’s service.
     */
    public fun methods(methods: Collection<String>) {
        _methods.addAll(methods)
    }

    /**
     * @param sourcePath This is the path that Refactor Spaces uses to match traffic. Paths must
     *   start with `/` and are relative to the base of the application. To use path parameters in
     *   the source path, add a variable in curly braces. For example, the resource path {user}
     *   represents a path parameter called 'user'.
     */
    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): CfnRoute.UriPathRouteInputProperty {
        if (_methods.isNotEmpty()) cdkBuilder.methods(_methods)
        return cdkBuilder.build()
    }
}
