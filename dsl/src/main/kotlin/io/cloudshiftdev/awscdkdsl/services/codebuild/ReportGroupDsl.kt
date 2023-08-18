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
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.codebuild.ReportGroup
import software.amazon.awscdk.services.codebuild.ReportGroupType
import software.amazon.awscdk.services.s3.IBucket
import software.constructs.Construct

/**
 * The ReportGroup resource class.
 *
 * Example:
 * ```
 * Source source;
 * // create a new ReportGroup
 * ReportGroup reportGroup = new ReportGroup(this, "ReportGroup");
 * Project project = Project.Builder.create(this, "Project")
 * .source(source)
 * .buildSpec(BuildSpec.fromObject(Map.of(
 * // ...
 * "reports", Map.of(
 * reportGroup.getReportGroupArn(), Map.of(
 * "files", "**&#47;*",
 * "base-directory", "build/test-results")))))
 * .build();
 * ```
 */
@CdkDslMarker
public class ReportGroupDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: ReportGroup.Builder = ReportGroup.Builder.create(scope, id)

    /**
     * An optional S3 bucket to export the reports to.
     *
     * Default: - the reports will not be exported
     *
     * @param exportBucket An optional S3 bucket to export the reports to.
     */
    public fun exportBucket(exportBucket: IBucket) {
        cdkBuilder.exportBucket(exportBucket)
    }

    /**
     * What to do when this resource is deleted from a stack.
     *
     * As CodeBuild does not allow deleting a ResourceGroup that has reports inside of it, this is
     * set to retain the resource by default.
     *
     * Default: RemovalPolicy.RETAIN
     *
     * @param removalPolicy What to do when this resource is deleted from a stack.
     */
    public fun removalPolicy(removalPolicy: RemovalPolicy) {
        cdkBuilder.removalPolicy(removalPolicy)
    }

    /**
     * The physical name of the report group.
     *
     * Default: - CloudFormation-generated name
     *
     * @param reportGroupName The physical name of the report group.
     */
    public fun reportGroupName(reportGroupName: String) {
        cdkBuilder.reportGroupName(reportGroupName)
    }

    /**
     * The type of report group. This can be one of the following values:.
     * * **TEST** - The report group contains test reports.
     * * **CODE_COVERAGE** - The report group contains code coverage reports.
     *
     * Default: TEST
     *
     * @param type The type of report group. This can be one of the following values:.
     */
    public fun type(type: ReportGroupType) {
        cdkBuilder.type(type)
    }

    /**
     * Whether to output the report files into the export bucket as-is, or create a ZIP from them
     * before doing the export.
     *
     * Ignored if `exportBucket` has not been provided.
     *
     * Default: - false (the files will not be ZIPped)
     *
     * @param zipExport Whether to output the report files into the export bucket as-is, or create a
     *   ZIP from them before doing the export.
     */
    public fun zipExport(zipExport: Boolean) {
        cdkBuilder.zipExport(zipExport)
    }

    public fun build(): ReportGroup = cdkBuilder.build()
}
