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

package cloudshift.awscdk.dsl.services.kafkaconnect

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kafkaconnect.CfnConnector
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnConnectorCloudWatchLogsLogDeliveryPropertyDsl {
    private val cdkBuilder: CfnConnector.CloudWatchLogsLogDeliveryProperty.Builder =
        CfnConnector.CloudWatchLogsLogDeliveryProperty.builder()

    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    public fun logGroup(logGroup: String) {
        cdkBuilder.logGroup(logGroup)
    }

    public fun build(): CfnConnector.CloudWatchLogsLogDeliveryProperty = cdkBuilder.build()
}
