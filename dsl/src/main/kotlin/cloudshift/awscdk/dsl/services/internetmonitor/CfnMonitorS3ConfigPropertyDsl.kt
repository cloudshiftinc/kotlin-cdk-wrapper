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

package cloudshift.awscdk.dsl.services.internetmonitor

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.internetmonitor.CfnMonitor
import kotlin.String

@CdkDslMarker
public class CfnMonitorS3ConfigPropertyDsl {
    private val cdkBuilder: CfnMonitor.S3ConfigProperty.Builder =
        CfnMonitor.S3ConfigProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun logDeliveryStatus(logDeliveryStatus: String) {
        cdkBuilder.logDeliveryStatus(logDeliveryStatus)
    }

    public fun build(): CfnMonitor.S3ConfigProperty = cdkBuilder.build()
}
