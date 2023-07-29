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

package cloudshift.awscdk.dsl.services.codebuild

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.codebuild.CfnProject

/**
 * Contains configuration information about a batch build project.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.codebuild.*;
 * ProjectBuildBatchConfigProperty projectBuildBatchConfigProperty =
 * ProjectBuildBatchConfigProperty.builder()
 * .batchReportMode("batchReportMode")
 * .combineArtifacts(false)
 * .restrictions(BatchRestrictionsProperty.builder()
 * .computeTypesAllowed(List.of("computeTypesAllowed"))
 * .maximumBuildsAllowed(123)
 * .build())
 * .serviceRole("serviceRole")
 * .timeoutInMins(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-codebuild-project-projectbuildbatchconfig.html)
 */
@CdkDslMarker
public class CfnProjectProjectBuildBatchConfigPropertyDsl {
    private val cdkBuilder: CfnProject.ProjectBuildBatchConfigProperty.Builder =
        CfnProject.ProjectBuildBatchConfigProperty.builder()

    /**
     * @param batchReportMode Specifies how build status reports are sent to the source provider for
     *   the batch build. This property is only used when the source provider for your project is
     *   Bitbucket, GitHub, or GitHub Enterprise, and your project is configured to report build
     *   statuses to the source provider.
     * * **REPORT_AGGREGATED_BATCH** - (Default) Aggregate all of the build statuses into a single
     *   status report.
     * * **REPORT_INDIVIDUAL_BUILDS** - Send a separate status report for each individual build.
     */
    public fun batchReportMode(batchReportMode: String) {
        cdkBuilder.batchReportMode(batchReportMode)
    }

    /**
     * @param combineArtifacts Specifies if the build artifacts for the batch build should be
     *   combined into a single artifact location.
     */
    public fun combineArtifacts(combineArtifacts: Boolean) {
        cdkBuilder.combineArtifacts(combineArtifacts)
    }

    /**
     * @param combineArtifacts Specifies if the build artifacts for the batch build should be
     *   combined into a single artifact location.
     */
    public fun combineArtifacts(combineArtifacts: IResolvable) {
        cdkBuilder.combineArtifacts(combineArtifacts)
    }

    /**
     * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
     *   batch build.
     */
    public fun restrictions(restrictions: IResolvable) {
        cdkBuilder.restrictions(restrictions)
    }

    /**
     * @param restrictions A `BatchRestrictions` object that specifies the restrictions for the
     *   batch build.
     */
    public fun restrictions(restrictions: CfnProject.BatchRestrictionsProperty) {
        cdkBuilder.restrictions(restrictions)
    }

    /** @param serviceRole Specifies the service role ARN for the batch build project. */
    public fun serviceRole(serviceRole: String) {
        cdkBuilder.serviceRole(serviceRole)
    }

    /**
     * @param timeoutInMins Specifies the maximum amount of time, in minutes, that the batch build
     *   must be completed in.
     */
    public fun timeoutInMins(timeoutInMins: Number) {
        cdkBuilder.timeoutInMins(timeoutInMins)
    }

    public fun build(): CfnProject.ProjectBuildBatchConfigProperty = cdkBuilder.build()
}
