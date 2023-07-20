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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceV2S3ReferenceDataSourcePropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder =
        CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.builder()

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
    }

    public fun build(): CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty =
        cdkBuilder.build()
}
