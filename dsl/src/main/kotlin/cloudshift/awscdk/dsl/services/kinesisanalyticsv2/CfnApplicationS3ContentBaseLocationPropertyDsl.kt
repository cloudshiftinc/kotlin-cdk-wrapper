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
import software.amazon.awscdk.services.kinesisanalyticsv2.CfnApplication
import kotlin.String

@CdkDslMarker
public class CfnApplicationS3ContentBaseLocationPropertyDsl {
    private val cdkBuilder: CfnApplication.S3ContentBaseLocationProperty.Builder =
        CfnApplication.S3ContentBaseLocationProperty.builder()

    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun build(): CfnApplication.S3ContentBaseLocationProperty = cdkBuilder.build()
}
