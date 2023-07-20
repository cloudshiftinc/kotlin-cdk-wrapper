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

package cloudshift.awscdk.dsl.services.kinesisfirehose

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisfirehose.CfnDeliveryStream
import kotlin.Boolean

@CdkDslMarker
public class CfnDeliveryStreamDynamicPartitioningConfigurationPropertyDsl {
    private val cdkBuilder: CfnDeliveryStream.DynamicPartitioningConfigurationProperty.Builder =
        CfnDeliveryStream.DynamicPartitioningConfigurationProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun retryOptions(retryOptions: IResolvable) {
        cdkBuilder.retryOptions(retryOptions)
    }

    public fun retryOptions(retryOptions: CfnDeliveryStream.RetryOptionsProperty) {
        cdkBuilder.retryOptions(retryOptions)
    }

    public fun build(): CfnDeliveryStream.DynamicPartitioningConfigurationProperty =
        cdkBuilder.build()
}
