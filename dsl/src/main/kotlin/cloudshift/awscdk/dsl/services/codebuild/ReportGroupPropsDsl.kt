@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.codebuild.ReportGroupProps
import software.amazon.awscdk.services.codebuild.ReportGroupType
import software.amazon.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.String

/**
 * Construction properties for `ReportGroup`.
 *
 * Example:
 *
 * ```
 * Source source;
 * // create a new ReportGroup
 * ReportGroup reportGroup = ReportGroup.Builder.create(this, "ReportGroup")
 * .type(ReportGroupType.CODE_COVERAGE)
 * .build();
 * Project project = Project.Builder.create(this, "Project")
 * .source(source)
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * // ...
 * "reports", Map.of(
 * reportGroup.getReportGroupArn(), Map.of(
 * "files", "**&#47;*",
 * "base-directory", "build/coverage-report.xml",
 * "file-format", "JACOCOXML")))))
 * .build();
 * ```
 */
@CdkDslMarker
public class ReportGroupPropsDsl {
    private val cdkBuilder: ReportGroupProps.Builder = ReportGroupProps.builder()

    /**
     * @param exportBucket An optional S3 bucket to export the reports to.
     */
    public fun exportBucket(exportBucket: IBucket) {
        cdkBuilder.exportBucket(exportBucket)
    }

    /**
     * @param removalPolicy What to do when this resource is deleted from a stack.
     * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it,
     * this is set to retain the resource by default.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * @param reportGroupName The physical name of the report group.
     */
    public fun reportGroupName(reportGroupName: String) {
        cdkBuilder.reportGroupName(reportGroupName)
    }

    /**
     * @param type The type of report group. This can be one of the following values:.
     * * **TEST** - The report group contains test reports.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     */
    public fun type(type: ReportGroupType) {
        cdkBuilder.type(type)
    }

    /**
     * @param zipExport Whether to output the report files into the export bucket as-is, or create a
     * ZIP from them before doing the export.
     * Ignored if `exportBucket` has not been provided.
     */
    public fun zipExport(zipExport: Boolean) {
        cdkBuilder.zipExport(zipExport)
    }

    public fun build(): ReportGroupProps = cdkBuilder.build()
}
