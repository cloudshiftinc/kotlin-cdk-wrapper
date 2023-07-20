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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appmesh.CfnRoute
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnRouteGrpcRetryPolicyPropertyDsl {
    private val cdkBuilder: CfnRoute.GrpcRetryPolicyProperty.Builder =
        CfnRoute.GrpcRetryPolicyProperty.builder()

    private val _grpcRetryEvents: MutableList<String> = mutableListOf()

    private val _httpRetryEvents: MutableList<String> = mutableListOf()

    private val _tcpRetryEvents: MutableList<String> = mutableListOf()

    public fun grpcRetryEvents(vararg grpcRetryEvents: String) {
        _grpcRetryEvents.addAll(listOf(*grpcRetryEvents))
    }

    public fun grpcRetryEvents(grpcRetryEvents: Collection<String>) {
        _grpcRetryEvents.addAll(grpcRetryEvents)
    }

    public fun httpRetryEvents(vararg httpRetryEvents: String) {
        _httpRetryEvents.addAll(listOf(*httpRetryEvents))
    }

    public fun httpRetryEvents(httpRetryEvents: Collection<String>) {
        _httpRetryEvents.addAll(httpRetryEvents)
    }

    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun perRetryTimeout(perRetryTimeout: IResolvable) {
        cdkBuilder.perRetryTimeout(perRetryTimeout)
    }

    public fun perRetryTimeout(perRetryTimeout: CfnRoute.DurationProperty) {
        cdkBuilder.perRetryTimeout(perRetryTimeout)
    }

    public fun tcpRetryEvents(vararg tcpRetryEvents: String) {
        _tcpRetryEvents.addAll(listOf(*tcpRetryEvents))
    }

    public fun tcpRetryEvents(tcpRetryEvents: Collection<String>) {
        _tcpRetryEvents.addAll(tcpRetryEvents)
    }

    public fun build(): CfnRoute.GrpcRetryPolicyProperty {
        if (_grpcRetryEvents.isNotEmpty()) cdkBuilder.grpcRetryEvents(_grpcRetryEvents)
        if (_httpRetryEvents.isNotEmpty()) cdkBuilder.httpRetryEvents(_httpRetryEvents)
        if (_tcpRetryEvents.isNotEmpty()) cdkBuilder.tcpRetryEvents(_tcpRetryEvents)
        return cdkBuilder.build()
    }
}
