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
import kotlin.String

@CdkDslMarker
public class CfnReportGroupReportExportConfigPropertyDsl {
    private val cdkBuilder: CfnReportGroup.ReportExportConfigProperty.Builder =
        CfnReportGroup.ReportExportConfigProperty.builder()

    public fun exportConfigType(exportConfigType: String) {
        cdkBuilder.exportConfigType(exportConfigType)
    }

    public fun s3Destination(s3Destination: IResolvable) {
        cdkBuilder.s3Destination(s3Destination)
    }

    public fun s3Destination(s3Destination: CfnReportGroup.S3ReportExportConfigProperty) {
        cdkBuilder.s3Destination(s3Destination)
    }

    public fun build(): CfnReportGroup.ReportExportConfigProperty = cdkBuilder.build()
}
