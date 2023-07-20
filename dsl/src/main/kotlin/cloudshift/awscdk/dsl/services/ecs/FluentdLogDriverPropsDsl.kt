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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ecs.FluentdLogDriverProps
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class FluentdLogDriverPropsDsl {
    private val cdkBuilder: FluentdLogDriverProps.Builder = FluentdLogDriverProps.builder()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun asyncConnect(asyncConnect: Boolean) {
        cdkBuilder.asyncConnect(asyncConnect)
    }

    public fun bufferLimit(bufferLimit: Number) {
        cdkBuilder.bufferLimit(bufferLimit)
    }

    public fun env(vararg env: String) {
        _env.addAll(listOf(*env))
    }

    public fun env(env: Collection<String>) {
        _env.addAll(env)
    }

    public fun envRegex(envRegex: String) {
        cdkBuilder.envRegex(envRegex)
    }

    public fun labels(vararg labels: String) {
        _labels.addAll(listOf(*labels))
    }

    public fun labels(labels: Collection<String>) {
        _labels.addAll(labels)
    }

    public fun maxRetries(maxRetries: Number) {
        cdkBuilder.maxRetries(maxRetries)
    }

    public fun retryWait(retryWait: Duration) {
        cdkBuilder.retryWait(retryWait)
    }

    public fun subSecondPrecision(subSecondPrecision: Boolean) {
        cdkBuilder.subSecondPrecision(subSecondPrecision)
    }

    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    public fun build(): FluentdLogDriverProps {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
