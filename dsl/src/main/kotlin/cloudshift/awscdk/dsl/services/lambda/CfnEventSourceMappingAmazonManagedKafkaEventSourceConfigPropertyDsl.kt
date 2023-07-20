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

@CdkDslMarker
public class CfnEventSourceMappingAmazonManagedKafkaEventSourceConfigPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.Builder =
        CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty.builder()

    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
    }

    public fun build(): CfnEventSourceMapping.AmazonManagedKafkaEventSourceConfigProperty =
        cdkBuilder.build()
}
