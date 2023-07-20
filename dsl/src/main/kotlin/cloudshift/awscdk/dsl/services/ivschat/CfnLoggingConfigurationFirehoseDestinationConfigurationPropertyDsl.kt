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

package cloudshift.awscdk.dsl.services.ivschat

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ivschat.CfnLoggingConfiguration
import kotlin.String

@CdkDslMarker
public class CfnLoggingConfigurationFirehoseDestinationConfigurationPropertyDsl {
    private val cdkBuilder: CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.Builder =
        CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty.builder()

    public fun deliveryStreamName(deliveryStreamName: String) {
        cdkBuilder.deliveryStreamName(deliveryStreamName)
    }

    public fun build(): CfnLoggingConfiguration.FirehoseDestinationConfigurationProperty =
        cdkBuilder.build()
}
