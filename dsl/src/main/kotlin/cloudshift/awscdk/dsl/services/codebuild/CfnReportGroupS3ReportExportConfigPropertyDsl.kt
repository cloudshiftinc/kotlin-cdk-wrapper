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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnReportGroup
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnReportGroupS3ReportExportConfigPropertyDsl {
    private val cdkBuilder: CfnReportGroup.S3ReportExportConfigProperty.Builder =
        CfnReportGroup.S3ReportExportConfigProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
    }

    public fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    public fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
    }

    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnReportGroup.S3ReportExportConfigProperty = cdkBuilder.build()
}
