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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * The self-managed Apache Kafka cluster for your event source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * SelfManagedEventSourceProperty selfManagedEventSourceProperty =
 * SelfManagedEventSourceProperty.builder()
 * .endpoints(EndpointsProperty.builder()
 * .kafkaBootstrapServers(List.of("kafkaBootstrapServers"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedeventsource.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingSelfManagedEventSourcePropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.SelfManagedEventSourceProperty.Builder =
        CfnEventSourceMapping.SelfManagedEventSourceProperty.builder()

    /**
     * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
     *   format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
     */
    public fun endpoints(endpoints: IResolvable) {
        cdkBuilder.endpoints(endpoints)
    }

    /**
     * @param endpoints The list of bootstrap servers for your Kafka brokers in the following
     *   format: `"KafkaBootstrapServers": ["abc.xyz.com:xxxx","abc2.xyz.com:xxxx"]` .
     */
    public fun endpoints(endpoints: CfnEventSourceMapping.EndpointsProperty) {
        cdkBuilder.endpoints(endpoints)
    }

    public fun build(): CfnEventSourceMapping.SelfManagedEventSourceProperty = cdkBuilder.build()
}
