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
public class CfnEventSourceMappingSelfManagedKafkaEventSourceConfigPropertyDsl {
    private val cdkBuilder: CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.Builder =
        CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty.builder()

    public fun consumerGroupId(consumerGroupId: String) {
        cdkBuilder.consumerGroupId(consumerGroupId)
    }

    public fun build(): CfnEventSourceMapping.SelfManagedKafkaEventSourceConfigProperty =
        cdkBuilder.build()
}
