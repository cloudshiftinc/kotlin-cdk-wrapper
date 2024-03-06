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

package io.cloudshiftdev.awscdkdsl.services.customerprofiles

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.customerprofiles.CfnDomain

/**
 * The process of matching duplicate profiles.
 *
 * If `Matching = true` , Amazon Connect Customer Profiles starts a weekly batch process called
 * *Identity Resolution Job* . If you do not specify a date and time for the *Identity Resolution
 * Job* to run, by default it runs every Saturday at 12AM UTC to detect duplicate profiles in your
 * domains. After the *Identity Resolution Job* completes, use the `GetMatches` API to return and
 * review the results. Or, if you have configured `ExportingConfig` in the `MatchingRequest` , you
 * can download the results from S3.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.customerprofiles.*;
 * MatchingProperty matchingProperty = MatchingProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .autoMerging(AutoMergingProperty.builder()
 * .enabled(false)
 * // the properties below are optional
 * .conflictResolution(ConflictResolutionProperty.builder()
 * .conflictResolvingModel("conflictResolvingModel")
 * // the properties below are optional
 * .sourceName("sourceName")
 * .build())
 * .consolidation(ConsolidationProperty.builder()
 * .matchingAttributesList(List.of(List.of("matchingAttributesList")))
 * .build())
 * .minAllowedConfidenceScoreForMerging(123)
 * .build())
 * .exportingConfig(ExportingConfigProperty.builder()
 * .s3Exporting(S3ExportingConfigProperty.builder()
 * .s3BucketName("s3BucketName")
 * // the properties below are optional
 * .s3KeyName("s3KeyName")
 * .build())
 * .build())
 * .jobSchedule(JobScheduleProperty.builder()
 * .dayOfTheWeek("dayOfTheWeek")
 * .time("time")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-customerprofiles-domain-matching.html)
 */
@CdkDslMarker
public class CfnDomainMatchingPropertyDsl {
    private val cdkBuilder: CfnDomain.MatchingProperty.Builder =
        CfnDomain.MatchingProperty.builder()

    /** @param autoMerging Configuration information about the auto-merging process. */
    public fun autoMerging(autoMerging: IResolvable) {
        cdkBuilder.autoMerging(autoMerging)
    }

    /** @param autoMerging Configuration information about the auto-merging process. */
    public fun autoMerging(autoMerging: CfnDomain.AutoMergingProperty) {
        cdkBuilder.autoMerging(autoMerging)
    }

    /** @param enabled The flag that enables the matching process of duplicate profiles. */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /** @param enabled The flag that enables the matching process of duplicate profiles. */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /** @param exportingConfig The S3 location where Identity Resolution Jobs write result files. */
    public fun exportingConfig(exportingConfig: IResolvable) {
        cdkBuilder.exportingConfig(exportingConfig)
    }

    /** @param exportingConfig The S3 location where Identity Resolution Jobs write result files. */
    public fun exportingConfig(exportingConfig: CfnDomain.ExportingConfigProperty) {
        cdkBuilder.exportingConfig(exportingConfig)
    }

    /**
     * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
     *   every week.
     */
    public fun jobSchedule(jobSchedule: IResolvable) {
        cdkBuilder.jobSchedule(jobSchedule)
    }

    /**
     * @param jobSchedule The day and time when do you want to start the Identity Resolution Job
     *   every week.
     */
    public fun jobSchedule(jobSchedule: CfnDomain.JobScheduleProperty) {
        cdkBuilder.jobSchedule(jobSchedule)
    }

    public fun build(): CfnDomain.MatchingProperty = cdkBuilder.build()
}
