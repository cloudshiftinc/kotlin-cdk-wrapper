@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnSchedule`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.databrew.*;
 * CfnScheduleProps cfnScheduleProps = CfnScheduleProps.builder()
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
public interface CfnScheduleProps {
  /**
   * The dates and times when the job is to run.
   *
   * For more information, see [Working with cron expressions for recipe
   * jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron) in the *AWS Glue
   * DataBrew Developer Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-cronexpression)
   */
  public fun cronExpression(): String

  /**
   * A list of jobs to be run, according to the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
   */
  public fun jobNames(): List<String> = unwrap(this).getJobNames() ?: emptyList()

  /**
   * The name of the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-name)
   */
  public fun name(): String

  /**
   * Metadata tags that have been applied to the schedule.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnScheduleProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param cronExpression The dates and times when the job is to run. 
     * For more information, see [Working with cron expressions for recipe
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron) in the *AWS
     * Glue DataBrew Developer Guide* .
     */
    public fun cronExpression(cronExpression: String)

    /**
     * @param jobNames A list of jobs to be run, according to the schedule.
     */
    public fun jobNames(jobNames: List<String>)

    /**
     * @param jobNames A list of jobs to be run, according to the schedule.
     */
    public fun jobNames(vararg jobNames: String)

    /**
     * @param name The name of the schedule. 
     */
    public fun name(name: String)

    /**
     * @param tags Metadata tags that have been applied to the schedule.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata tags that have been applied to the schedule.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnScheduleProps.Builder =
        software.amazon.awscdk.services.databrew.CfnScheduleProps.builder()

    /**
     * @param cronExpression The dates and times when the job is to run. 
     * For more information, see [Working with cron expressions for recipe
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron) in the *AWS
     * Glue DataBrew Developer Guide* .
     */
    override fun cronExpression(cronExpression: String) {
      cdkBuilder.cronExpression(cronExpression)
    }

    /**
     * @param jobNames A list of jobs to be run, according to the schedule.
     */
    override fun jobNames(jobNames: List<String>) {
      cdkBuilder.jobNames(jobNames)
    }

    /**
     * @param jobNames A list of jobs to be run, according to the schedule.
     */
    override fun jobNames(vararg jobNames: String): Unit = jobNames(jobNames.toList())

    /**
     * @param name The name of the schedule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Metadata tags that have been applied to the schedule.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata tags that have been applied to the schedule.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnScheduleProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.databrew.CfnScheduleProps,
  ) : CdkObject(cdkObject), CfnScheduleProps {
    /**
     * The dates and times when the job is to run.
     *
     * For more information, see [Working with cron expressions for recipe
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron) in the *AWS
     * Glue DataBrew Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-cronexpression)
     */
    override fun cronExpression(): String = unwrap(this).getCronExpression()

    /**
     * A list of jobs to be run, according to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
     */
    override fun jobNames(): List<String> = unwrap(this).getJobNames() ?: emptyList()

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Metadata tags that have been applied to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnScheduleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnScheduleProps):
        CfnScheduleProps = CdkObjectWrappers.wrap(cdkObject) as CfnScheduleProps

    internal fun unwrap(wrapped: CfnScheduleProps):
        software.amazon.awscdk.services.databrew.CfnScheduleProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.databrew.CfnScheduleProps
  }
}
