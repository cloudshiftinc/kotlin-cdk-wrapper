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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.refactorspaces.CfnRoute
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRouteUriPathRouteInputPropertyDsl {
    private val cdkBuilder: CfnRoute.UriPathRouteInputProperty.Builder =
        CfnRoute.UriPathRouteInputProperty.builder()

    private val _methods: MutableList<String> = mutableListOf()

    public fun activationState(activationState: String) {
        cdkBuilder.activationState(activationState)
    }

    public fun appendSourcePath(appendSourcePath: Boolean) {
        cdkBuilder.appendSourcePath(appendSourcePath)
    }

    public fun appendSourcePath(appendSourcePath: IResolvable) {
        cdkBuilder.appendSourcePath(appendSourcePath)
    }

    public fun includeChildPaths(includeChildPaths: Boolean) {
        cdkBuilder.includeChildPaths(includeChildPaths)
    }

    public fun includeChildPaths(includeChildPaths: IResolvable) {
        cdkBuilder.includeChildPaths(includeChildPaths)
    }

    public fun methods(vararg methods: String) {
        _methods.addAll(listOf(*methods))
    }

    public fun methods(methods: Collection<String>) {
        _methods.addAll(methods)
    }

    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): CfnRoute.UriPathRouteInputProperty {
        if (_methods.isNotEmpty()) cdkBuilder.methods(_methods)
        return cdkBuilder.build()
    }
}
