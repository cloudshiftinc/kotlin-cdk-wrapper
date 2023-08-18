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
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnReportGroup

/**
 * Information about the location where the run of a report is exported.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ReportExportConfigProperty reportExportConfigProperty = ReportExportConfigProperty.builder()
 * .exportConfigType("exportConfigType")
 * // the properties below are optional
 * .s3Destination(S3ReportExportConfigProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .encryptionDisabled(false)
 * .encryptionKey("encryptionKey")
 * .packaging("packaging")
 * .path("path")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-reportgroup-reportexportconfig.html)
 */
@CdkDslMarker
public class CfnReportGroupReportExportConfigPropertyDsl {
    private val cdkBuilder: CfnReportGroup.ReportExportConfigProperty.Builder =
        CfnReportGroup.ReportExportConfigProperty.builder()

    /**
     * @param exportConfigType The export configuration type. Valid values are:.
     * * `S3` : The report results are exported to an S3 bucket.
     * * `NO_EXPORT` : The report results are not exported.
     */
    public fun exportConfigType(exportConfigType: String) {
        cdkBuilder.exportConfigType(exportConfigType)
    }

    /**
     * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
     *   bucket where the run of a report is exported.
     */
    public fun s3Destination(s3Destination: IResolvable) {
        cdkBuilder.s3Destination(s3Destination)
    }

    /**
     * @param s3Destination A `S3ReportExportConfig` object that contains information about the S3
     *   bucket where the run of a report is exported.
     */
    public fun s3Destination(s3Destination: CfnReportGroup.S3ReportExportConfigProperty) {
        cdkBuilder.s3Destination(s3Destination)
    }

    public fun build(): CfnReportGroup.ReportExportConfigProperty = cdkBuilder.build()
}
