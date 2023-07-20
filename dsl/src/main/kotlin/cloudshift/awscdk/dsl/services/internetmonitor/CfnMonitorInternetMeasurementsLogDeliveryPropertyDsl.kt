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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.internetmonitor.CfnMonitor

@CdkDslMarker
public class CfnMonitorInternetMeasurementsLogDeliveryPropertyDsl {
    private val cdkBuilder: CfnMonitor.InternetMeasurementsLogDeliveryProperty.Builder =
        CfnMonitor.InternetMeasurementsLogDeliveryProperty.builder()

    public fun s3Config(s3Config: IResolvable) {
        cdkBuilder.s3Config(s3Config)
    }

    public fun s3Config(s3Config: CfnMonitor.S3ConfigProperty) {
        cdkBuilder.s3Config(s3Config)
    }

    public fun build(): CfnMonitor.InternetMeasurementsLogDeliveryProperty = cdkBuilder.build()
}
