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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class CfnEventSourceMappingEndpointsPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.EndpointsProperty.Builder =
        CfnEventSourceMapping.EndpointsProperty.builder()

    private val _kafkaBootstrapServers: MutableList<String> = mutableListOf()

    public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String) {
        _kafkaBootstrapServers.addAll(listOf(*kafkaBootstrapServers))
    }

    public fun kafkaBootstrapServers(kafkaBootstrapServers: Collection<String>) {
        _kafkaBootstrapServers.addAll(kafkaBootstrapServers)
    }

    public fun build(): CfnEventSourceMapping.EndpointsProperty {
        if (_kafkaBootstrapServers.isNotEmpty()) cdkBuilder.kafkaBootstrapServers(_kafkaBootstrapServers)
        return cdkBuilder.build()
    }
}
