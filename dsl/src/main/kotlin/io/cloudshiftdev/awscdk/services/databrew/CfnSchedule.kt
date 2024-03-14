package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchedule internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.databrew.CfnSchedule,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The dates and times when the job is to run.
   */
  public open fun cronExpression(): String = unwrap(this).getCronExpression()

  /**
   * The dates and times when the job is to run.
   */
  public open fun cronExpression(`value`: String) {
    unwrap(this).setCronExpression(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A list of jobs to be run, according to the schedule.
   */
  public open fun jobNames(): List<String> = unwrap(this).getJobNames() ?: emptyList()

  /**
   * A list of jobs to be run, according to the schedule.
   */
  public open fun jobNames(`value`: List<String>) {
    unwrap(this).setJobNames(`value`)
  }

  /**
   * A list of jobs to be run, according to the schedule.
   */
  public open fun jobNames(vararg `value`: String): Unit = jobNames(`value`.toList())

  /**
   * The name of the schedule.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the schedule.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata tags that have been applied to the schedule.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata tags that have been applied to the schedule.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata tags that have been applied to the schedule.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.databrew.CfnSchedule].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The dates and times when the job is to run.
     *
     * For more information, see [Working with cron expressions for recipe
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron) in the *AWS
     * Glue DataBrew Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-cronexpression)
     * @param cronExpression The dates and times when the job is to run. 
     */
    public fun cronExpression(cronExpression: String)

    /**
     * A list of jobs to be run, according to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
     * @param jobNames A list of jobs to be run, according to the schedule. 
     */
    public fun jobNames(jobNames: List<String>)

    /**
     * A list of jobs to be run, according to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
     * @param jobNames A list of jobs to be run, according to the schedule. 
     */
    public fun jobNames(vararg jobNames: String)

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-name)
     * @param name The name of the schedule. 
     */
    public fun name(name: String)

    /**
     * Metadata tags that have been applied to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
     * @param tags Metadata tags that have been applied to the schedule. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata tags that have been applied to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
     * @param tags Metadata tags that have been applied to the schedule. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnSchedule.Builder =
        software.amazon.awscdk.services.databrew.CfnSchedule.Builder.create(scope, id)

    /**
     * The dates and times when the job is to run.
     *
     * For more information, see [Working with cron expressions for recipe
     * jobs](https://docs.aws.amazon.com/databrew/latest/dg/jobs.recipe.html#jobs.cron) in the *AWS
     * Glue DataBrew Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-cronexpression)
     * @param cronExpression The dates and times when the job is to run. 
     */
    override fun cronExpression(cronExpression: String) {
      cdkBuilder.cronExpression(cronExpression)
    }

    /**
     * A list of jobs to be run, according to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
     * @param jobNames A list of jobs to be run, according to the schedule. 
     */
    override fun jobNames(jobNames: List<String>) {
      cdkBuilder.jobNames(jobNames)
    }

    /**
     * A list of jobs to be run, according to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-jobnames)
     * @param jobNames A list of jobs to be run, according to the schedule. 
     */
    override fun jobNames(vararg jobNames: String): Unit = jobNames(jobNames.toList())

    /**
     * The name of the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-name)
     * @param name The name of the schedule. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Metadata tags that have been applied to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
     * @param tags Metadata tags that have been applied to the schedule. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Metadata tags that have been applied to the schedule.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-schedule.html#cfn-databrew-schedule-tags)
     * @param tags Metadata tags that have been applied to the schedule. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnSchedule = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchedule {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchedule(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnSchedule): CfnSchedule
        = CfnSchedule(cdkObject)

    internal fun unwrap(wrapped: CfnSchedule): software.amazon.awscdk.services.databrew.CfnSchedule
        = wrapped.cdkObject
  }
}
