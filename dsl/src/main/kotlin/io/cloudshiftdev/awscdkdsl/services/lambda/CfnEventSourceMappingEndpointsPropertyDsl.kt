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

package io.cloudshiftdev.awscdkdsl.services.lambda

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * The list of bootstrap servers for your Kafka brokers in the following format:
 * `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * EndpointsProperty endpointsProperty = EndpointsProperty.builder()
 * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-endpoints.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingEndpointsPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.EndpointsProperty.Builder =
        CfnEventSourceMapping.EndpointsProperty.builder()

    private val _kafkaBootstrapServers: MutableList<String> = mutableListOf()

    /**
     * @param kafkaBootstrapServers The list of bootstrap servers for your Kafka brokers in the
     *   following format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
     */
    public fun kafkaBootstrapServers(vararg kafkaBootstrapServers: String) {
        _kafkaBootstrapServers.addAll(listOf(*kafkaBootstrapServers))
    }

    /**
     * @param kafkaBootstrapServers The list of bootstrap servers for your Kafka brokers in the
     *   following format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
     */
    public fun kafkaBootstrapServers(kafkaBootstrapServers: Collection<String>) {
        _kafkaBootstrapServers.addAll(kafkaBootstrapServers)
    }

    public fun build(): CfnEventSourceMapping.EndpointsProperty {
        if (_kafkaBootstrapServers.isNotEmpty())
            cdkBuilder.kafkaBootstrapServers(_kafkaBootstrapServers)
        return cdkBuilder.build()
    }
}
