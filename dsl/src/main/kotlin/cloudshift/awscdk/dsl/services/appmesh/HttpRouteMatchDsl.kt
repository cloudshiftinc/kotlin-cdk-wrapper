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
import software.amazon.awscdk.services.appmesh.HeaderMatch
import software.amazon.awscdk.services.appmesh.HttpRouteMatch
import software.amazon.awscdk.services.appmesh.HttpRouteMethod
import software.amazon.awscdk.services.appmesh.HttpRoutePathMatch
import software.amazon.awscdk.services.appmesh.HttpRouteProtocol
import software.amazon.awscdk.services.appmesh.QueryParameterMatch
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class HttpRouteMatchDsl {
    private val cdkBuilder: HttpRouteMatch.Builder = HttpRouteMatch.builder()

    private val _headers: MutableList<HeaderMatch> = mutableListOf()

    private val _queryParameters: MutableList<QueryParameterMatch> = mutableListOf()

    public fun headers(vararg headers: HeaderMatch) {
        _headers.addAll(listOf(*headers))
    }

    public fun headers(headers: Collection<HeaderMatch>) {
        _headers.addAll(headers)
    }

    public fun method(method: HttpRouteMethod) {
        cdkBuilder.method(method)
    }

    public fun path(path: HttpRoutePathMatch) {
        cdkBuilder.path(path)
    }

    public fun port(port: Number) {
        cdkBuilder.port(port)
    }

    public fun protocol(protocol: HttpRouteProtocol) {
        cdkBuilder.protocol(protocol)
    }

    public fun queryParameters(vararg queryParameters: QueryParameterMatch) {
        _queryParameters.addAll(listOf(*queryParameters))
    }

    public fun queryParameters(queryParameters: Collection<QueryParameterMatch>) {
        _queryParameters.addAll(queryParameters)
    }

    public fun build(): HttpRouteMatch {
        if (_headers.isNotEmpty()) cdkBuilder.headers(_headers)
        if (_queryParameters.isNotEmpty()) cdkBuilder.queryParameters(_queryParameters)
        return cdkBuilder.build()
    }
}
