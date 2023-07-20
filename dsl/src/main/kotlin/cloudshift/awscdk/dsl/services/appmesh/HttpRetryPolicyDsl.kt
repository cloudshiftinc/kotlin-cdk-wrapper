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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.appmesh.HttpRetryEvent
import software.amazon.awscdk.services.appmesh.HttpRetryPolicy
import software.amazon.awscdk.services.appmesh.TcpRetryEvent
import kotlin.Number
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class HttpRetryPolicyDsl {
    private val cdkBuilder: HttpRetryPolicy.Builder = HttpRetryPolicy.builder()

    private val _httpRetryEvents: MutableList<HttpRetryEvent> = mutableListOf()

    private val _tcpRetryEvents: MutableList<TcpRetryEvent> = mutableListOf()

    public fun httpRetryEvents(vararg httpRetryEvents: HttpRetryEvent) {
        _httpRetryEvents.addAll(listOf(*httpRetryEvents))
    }

    public fun httpRetryEvents(httpRetryEvents: Collection<HttpRetryEvent>) {
        _httpRetryEvents.addAll(httpRetryEvents)
    }

    public fun retryAttempts(retryAttempts: Number) {
        cdkBuilder.retryAttempts(retryAttempts)
    }

    public fun retryTimeout(retryTimeout: Duration) {
        cdkBuilder.retryTimeout(retryTimeout)
    }

    public fun tcpRetryEvents(vararg tcpRetryEvents: TcpRetryEvent) {
        _tcpRetryEvents.addAll(listOf(*tcpRetryEvents))
    }

    public fun tcpRetryEvents(tcpRetryEvents: Collection<TcpRetryEvent>) {
        _tcpRetryEvents.addAll(tcpRetryEvents)
    }

    public fun build(): HttpRetryPolicy {
        if (_httpRetryEvents.isNotEmpty()) cdkBuilder.httpRetryEvents(_httpRetryEvents)
        if (_tcpRetryEvents.isNotEmpty()) cdkBuilder.tcpRetryEvents(_tcpRetryEvents)
        return cdkBuilder.build()
    }
}
