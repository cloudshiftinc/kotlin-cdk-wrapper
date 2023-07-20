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
import software.amazon.awscdk.services.ecs.GelfCompressionType
import software.amazon.awscdk.services.ecs.GelfLogDriverProps
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class GelfLogDriverPropsDsl {
    private val cdkBuilder: GelfLogDriverProps.Builder = GelfLogDriverProps.builder()

    private val _env: MutableList<String> = mutableListOf()

    private val _labels: MutableList<String> = mutableListOf()

    public fun address(address: String) {
        cdkBuilder.address(address)
    }

    public fun compressionLevel(compressionLevel: Number) {
        cdkBuilder.compressionLevel(compressionLevel)
    }

    public fun compressionType(compressionType: GelfCompressionType) {
        cdkBuilder.compressionType(compressionType)
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

    public fun tag(tag: String) {
        cdkBuilder.tag(tag)
    }

    public fun tcpMaxReconnect(tcpMaxReconnect: Number) {
        cdkBuilder.tcpMaxReconnect(tcpMaxReconnect)
    }

    public fun tcpReconnectDelay(tcpReconnectDelay: Duration) {
        cdkBuilder.tcpReconnectDelay(tcpReconnectDelay)
    }

    public fun build(): GelfLogDriverProps {
        if (_env.isNotEmpty()) cdkBuilder.env(_env)
        if (_labels.isNotEmpty()) cdkBuilder.labels(_labels)
        return cdkBuilder.build()
    }
}
