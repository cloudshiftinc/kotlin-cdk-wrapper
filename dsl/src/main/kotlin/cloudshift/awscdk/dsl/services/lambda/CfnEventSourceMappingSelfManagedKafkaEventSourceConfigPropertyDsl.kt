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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnEventSourceMapping

/**
 * Specific configuration settings for a self-managed Apache Kafka event source.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lambda.*;
 * SelfManagedKafkaEventSourceConfigProperty selfManagedKafkaEventSourceConfigProperty =
 * SelfManagedKafkaEventSourceConfigProperty.builder()
 * .consumerGroupId("consumerGroupId")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lambda-eventsourcemapping-selfmanagedkafkaeventsourceconfig.html)
 */
@CdkDslMarker
public class CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl {
    private val cdkBuilder:
        CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder =
        CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.builder()

    /**
     * @param consumerGroupId The identifier for the Kafka consumer group to join. The consumer
     *   group ID must be unique among all your Kafka event sources. After creating a Kafka event
     *   source mapping with the consumer group ID specified, you cannot update this value. For more
     *   information, see
     *   [Customizable consumer group ID](https://docs.aws.amazon.com/lambda/latest/dg/with-msk.html#services-msk-consumer-group-id)
     *   .
     */
    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
    }

    public fun build(): CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty =
        cdkBuilder.build()
}
