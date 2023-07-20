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
import software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource
import kotlin.String

@CdkDslMarker
public class CfnApplicationReferenceDataSourceS3ReferenceDataSourcePropertyDsl {
    private val cdkBuilder: CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder =
        CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.builder()

    public fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
    }

    public fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
    }

    public fun referenceRoleArn(referenceRoleArn: String) {
        cdkBuilder.referenceRoleArn(referenceRoleArn)
    }

    public fun build(): CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty =
        cdkBuilder.build()
}
