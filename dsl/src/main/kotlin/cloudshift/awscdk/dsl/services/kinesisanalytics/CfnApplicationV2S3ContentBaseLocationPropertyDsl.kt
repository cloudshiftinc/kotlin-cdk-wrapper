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

package cloudshift.awscdk.dsl.services.kinesisanalytics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationV2S3ContentBaseLocationPropertyDsl {
    private val cdkBuilder: CfnApplicationV2.S3ContentBaseLocationProperty.Builder =
        CfnApplicationV2.S3ContentBaseLocationProperty.builder()

    public fun basePath(basePath: String) {
        cdkBuilder.basePath(basePath)
    }

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun build(): CfnApplicationV2.S3ContentBaseLocationProperty = cdkBuilder.build()
}
