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

package cloudshift.awscdk.dsl.services.appmesh

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.appmesh.GrpcRouteMatch
import software.amazon.awscdk.services.appmesh.HeaderMatch
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class GrpcRouteMatchDsl {
    private val cdkBuilder: GrpcRouteMatch.Builder = GrpcRouteMatch.builder()

    private val _metadata: MutableList<HeaderMatch> = mutableListOf()

    public fun metadata(vararg metadata: HeaderMatch) {
        _metadata.addAll(listOf(*metadata))
    }

    public fun metadata(metadata: Collection<HeaderMatch>) {
        _metadata.addAll(metadata)
    }

    public fun methodName(methodName: String) {
        cdkBuilder.methodName(methodName)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun serviceName(serviceName: String) {
        cdkBuilder.serviceName(serviceName)
    }

    public fun build(): GrpcRouteMatch {
        if (_metadata.isNotEmpty()) cdkBuilder.metadata(_metadata)
        return cdkBuilder.build()
    }
}
