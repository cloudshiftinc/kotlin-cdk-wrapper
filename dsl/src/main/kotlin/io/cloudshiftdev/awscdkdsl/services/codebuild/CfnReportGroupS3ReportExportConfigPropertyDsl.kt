@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.codebuild

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnReportGroup

/**
 * Information about the S3 bucket where the raw data of a report are exported.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * S3ReportExportConfigProperty s3ReportExportConfigProperty =
 * S3ReportExportConfigProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .encryptionDisabled(false)
 * .encryptionKey("encryptionKey")
 * .packaging("packaging")
 * .path("path")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-s3reportexportconfig.html)
 */
@CdkDslMarker
public class CfnReportGroupS3ReportExportConfigPropertyDsl {
    private val cdkBuilder: CfnReportGroup.S3ReportExportConfigProperty.Builder =
        CfnReportGroup.S3ReportExportConfigProperty.builder()

    /** @param bucket The name of the S3 bucket where the raw data of a report are exported. */
    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    /**
     * @param bucketOwner The AWS account identifier of the owner of the Amazon S3 bucket. This
     *   allows report data to be exported to an Amazon S3 bucket that is owned by an account other
     *   than the account running the build.
     */
    public fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
    }

    /**
     * @param encryptionDisabled A boolean value that specifies if the results of a report are
     *   encrypted.
     */
    public fun encryptionDisabled(encryptionDisabled: Boolean) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    /**
     * @param encryptionDisabled A boolean value that specifies if the results of a report are
     *   encrypted.
     */
    public fun encryptionDisabled(encryptionDisabled: IResolvable) {
        cdkBuilder.encryptionDisabled(encryptionDisabled)
    }

    /** @param encryptionKey The encryption key for the report's encrypted raw data. */
    public fun encryptionKey(encryptionKey: String) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param packaging The type of build output artifact to create. Valid values include:.
     * * `NONE` : CodeBuild creates the raw data in the output bucket. This is the default if
     *   packaging is not specified.
     * * `ZIP` : CodeBuild creates a ZIP file with the raw data in the output bucket.
     */
    public fun packaging(packaging: String) {
        cdkBuilder.packaging(packaging)
    }

    /** @param path The path to the exported report's raw data results. */
    public fun path(path: String) {
        cdkBuilder.path(path)
    }

    public fun build(): CfnReportGroup.S3ReportExportConfigProperty = cdkBuilder.build()
}
