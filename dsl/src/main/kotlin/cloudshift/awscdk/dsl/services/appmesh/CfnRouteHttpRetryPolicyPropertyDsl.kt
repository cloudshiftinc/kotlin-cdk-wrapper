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
public class CfnRouteHttpRetryPolicyPropertyDsl {
    private val cdkBuilder: CfnRoute.HttpRetryPolicyProperty.Builder =
        CfnRoute.HttpRetryPolicyProperty.builder()

    private val _httpRetryEvents: MutableList<String> = mutableListOf()

    private val _tcpRetryEvents: MutableList<String> = mutableListOf()

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

    public fun build(): CfnRoute.HttpRetryPolicyProperty {
        if (_httpRetryEvents.isNotEmpty()) cdkBuilder.httpRetryEvents(_httpRetryEvents)
        if (_tcpRetryEvents.isNotEmpty()) cdkBuilder.tcpRetryEvents(_tcpRetryEvents)
        return cdkBuilder.build()
    }
}
