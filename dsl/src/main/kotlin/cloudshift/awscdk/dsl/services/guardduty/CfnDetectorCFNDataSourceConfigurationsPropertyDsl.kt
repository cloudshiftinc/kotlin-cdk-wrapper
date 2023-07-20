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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.guardduty.CfnDetector

@CdkDslMarker
public class CfnDetectorCFNDataSourceConfigurationsPropertyDsl {
    private val cdkBuilder: CfnDetector.CFNDataSourceConfigurationsProperty.Builder =
        CfnDetector.CFNDataSourceConfigurationsProperty.builder()

    public fun kubernetes(kubernetes: IResolvable) {
        cdkBuilder.kubernetes(kubernetes)
    }

    public fun kubernetes(kubernetes: CfnDetector.CFNKubernetesConfigurationProperty) {
        cdkBuilder.kubernetes(kubernetes)
    }

    public fun malwareProtection(malwareProtection: IResolvable) {
        cdkBuilder.malwareProtection(malwareProtection)
    }

    public fun malwareProtection(malwareProtection: CfnDetector.CFNMalwareProtectionConfigurationProperty) {
        cdkBuilder.malwareProtection(malwareProtection)
    }

    public fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs)
    }

    public fun s3Logs(s3Logs: CfnDetector.CFNS3LogsConfigurationProperty) {
        cdkBuilder.s3Logs(s3Logs)
    }

    public fun build(): CfnDetector.CFNDataSourceConfigurationsProperty = cdkBuilder.build()
}
