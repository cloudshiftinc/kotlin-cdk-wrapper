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

package io.cloudshiftdev.awscdkdsl.services.databrew

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.databrew.CfnSchedule
import software.constructs.Construct

/**
 * Specifies a new schedule for one or more AWS Glue DataBrew jobs.
 *
 * Jobs can be run at a specific date and time, or at regular intervals.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * CfnSchedule cfnSchedule = CfnSchedule.Builder.create(this, "MyCfnSchedule")
 * .cronExpression("cronExpression")
 * .name("name")
 * // the properties below are optional
 * .jobNames(List.of("jobNames"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html)
 */
@CdkDslMarker
public class CfnScheduleDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnSchedule.Builder = CfnSchedule.Builder.create(scope, id)

    private val _jobNames: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The dates and times when the job is to run.
     *
     * For more information, see
     * [Working with cron expressions for recipe jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron)
     * in the *AWS Glue DataBrew Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-cronexpression)
     *
     * @param cronExpression The dates and times when the job is to run.
     */
    public fun cronExpression(cronExpression: String) {
        cdkBuilder.cronExpression(cronExpression)
    }

    /**
     * A list of jobs to be run, according to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
     *
     * @param jobNames A list of jobs to be run, according to the schedule.
     */
    public fun jobNames(vararg jobNames: String) {
        _jobNames.addAll(listOf(*jobNames))
    }

    /**
     * A list of jobs to be run, according to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
     *
     * @param jobNames A list of jobs to be run, according to the schedule.
     */
    public fun jobNames(jobNames: Collection<String>) {
        _jobNames.addAll(jobNames)
    }

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-name)
     *
     * @param name The name of the schedule.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * Metadata tags that have been applied to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
     *
     * @param tags Metadata tags that have been applied to the schedule.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata tags that have been applied to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
     *
     * @param tags Metadata tags that have been applied to the schedule.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnSchedule {
        if (_jobNames.isNotEmpty()) cdkBuilder.jobNames(_jobNames)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
