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

package cloudshift.awscdk.dsl.services.kinesisanalyticsv2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication

@CdkDslMarker
public class CfnApplicationDeployAsApplicationConfigurationPropertyDsl {
    private val cdkBuilder: CfnApplication.DeployAsApplicationConfigurationProperty.Builder =
        CfnApplication.DeployAsApplicationConfigurationProperty.builder()

    public fun s3ContentLocation(s3ContentLocation: IResolvable) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun s3ContentLocation(s3ContentLocation: CfnApplication.S3ContentBaseLocationProperty) {
        cdkBuilder.s3ContentLocation(s3ContentLocation)
    }

    public fun build(): CfnApplication.DeployAsApplicationConfigurationProperty = cdkBuilder.build()
}
