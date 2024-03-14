package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTrigger internal constructor(
  private val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The actions initiated by this trigger.
   */
  public open fun actions(): Any = unwrap(this).getActions()

  /**
   * The actions initiated by this trigger.
   */
  public open fun actions(`value`: IResolvable) {
    unwrap(this).setActions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The actions initiated by this trigger.
   */
  public open fun actions(__idx_ac66f0: List<Any>) {
    unwrap(this).setActions(__idx_ac66f0)
  }

  /**
   * The actions initiated by this trigger.
   */
  public open fun actions(vararg __idx_ac66f0: Any): Unit = actions(__idx_ac66f0.toList())

  /**
   * Reserved for future use.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * A description of this trigger.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of this trigger.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Batch condition that must be met (specified number of events received or batch time window
   * expired) before EventBridge event trigger fires.
   */
  public open fun eventBatchingCondition(): Any? = unwrap(this).getEventBatchingCondition()

  /**
   * Batch condition that must be met (specified number of events received or batch time window
   * expired) before EventBridge event trigger fires.
   */
  public open fun eventBatchingCondition(`value`: IResolvable) {
    unwrap(this).setEventBatchingCondition(`value`.let(IResolvable::unwrap))
  }

  /**
   * Batch condition that must be met (specified number of events received or batch time window
   * expired) before EventBridge event trigger fires.
   */
  public open fun eventBatchingCondition(`value`: EventBatchingConditionProperty) {
    unwrap(this).setEventBatchingCondition(`value`.let(EventBatchingConditionProperty::unwrap))
  }

  /**
   * Batch condition that must be met (specified number of events received or batch time window
   * expired) before EventBridge event trigger fires.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3805b8102585a0b00724653340e1533f283c30872821ec2dbcf1164affdccc22")
  public open
      fun eventBatchingCondition(`value`: EventBatchingConditionProperty.Builder.() -> Unit): Unit =
      eventBatchingCondition(EventBatchingConditionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the trigger.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the trigger.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The predicate of this trigger, which defines when it will fire.
   */
  public open fun predicate(): Any? = unwrap(this).getPredicate()

  /**
   * The predicate of this trigger, which defines when it will fire.
   */
  public open fun predicate(`value`: IResolvable) {
    unwrap(this).setPredicate(`value`.let(IResolvable::unwrap))
  }

  /**
   * The predicate of this trigger, which defines when it will fire.
   */
  public open fun predicate(`value`: PredicateProperty) {
    unwrap(this).setPredicate(`value`.let(PredicateProperty::unwrap))
  }

  /**
   * The predicate of this trigger, which defines when it will fire.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f3e1c423dcfb6c1c880205abf7fe6c49b084192461d25f3ab2f32db63dbd1d08")
  public open fun predicate(`value`: PredicateProperty.Builder.() -> Unit): Unit =
      predicate(PredicateProperty(`value`))

  /**
   * A `cron` expression used to specify the schedule.
   */
  public open fun schedule(): String? = unwrap(this).getSchedule()

  /**
   * A `cron` expression used to specify the schedule.
   */
  public open fun schedule(`value`: String) {
    unwrap(this).setSchedule(`value`)
  }

  /**
   * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
   */
  public open fun startOnCreation(): Any? = unwrap(this).getStartOnCreation()

  /**
   * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
   */
  public open fun startOnCreation(`value`: Boolean) {
    unwrap(this).setStartOnCreation(`value`)
  }

  /**
   * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
   */
  public open fun startOnCreation(`value`: IResolvable) {
    unwrap(this).setStartOnCreation(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags to use with this trigger.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * The tags to use with this trigger.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The type of trigger that this is.
   */
  public open fun type(): String = unwrap(this).getType()

  /**
   * The type of trigger that this is.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The name of the workflow associated with the trigger.
   */
  public open fun workflowName(): String? = unwrap(this).getWorkflowName()

  /**
   * The name of the workflow associated with the trigger.
   */
  public open fun workflowName(`value`: String) {
    unwrap(this).setWorkflowName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnTrigger].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The actions initiated by this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
     * @param actions The actions initiated by this trigger. 
     */
    public fun actions(actions: IResolvable)

    /**
     * The actions initiated by this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
     * @param actions The actions initiated by this trigger. 
     */
    public fun actions(actions: List<Any>)

    /**
     * The actions initiated by this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
     * @param actions The actions initiated by this trigger. 
     */
    public fun actions(vararg actions: Any)

    /**
     * A description of this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
     * @param description A description of this trigger. 
     */
    public fun description(description: String)

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires. 
     */
    public fun eventBatchingCondition(eventBatchingCondition: IResolvable)

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires. 
     */
    public fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty)

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7278c0637d7ff3a0fce804c7246b18af2dbe03cc954e7a2baff78791cf900b47")
    public
        fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty.Builder.() -> Unit)

    /**
     * The name of the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
     * @param name The name of the trigger. 
     */
    public fun name(name: String)

    /**
     * The predicate of this trigger, which defines when it will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
     * @param predicate The predicate of this trigger, which defines when it will fire. 
     */
    public fun predicate(predicate: IResolvable)

    /**
     * The predicate of this trigger, which defines when it will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
     * @param predicate The predicate of this trigger, which defines when it will fire. 
     */
    public fun predicate(predicate: PredicateProperty)

    /**
     * The predicate of this trigger, which defines when it will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
     * @param predicate The predicate of this trigger, which defines when it will fire. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbcadeabe28dcb7d3e5fdda448dd4d3bd87ce8fb1a70b9ca1c8c3e294d2a844c")
    public fun predicate(predicate: PredicateProperty.Builder.() -> Unit)

    /**
     * A `cron` expression used to specify the schedule.
     *
     * For more information, see [Time-Based Schedules for Jobs and
     * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) in
     * the *AWS Glue Developer Guide* . For example, to run something every day at 12:15 UTC, specify
     * `cron(15 12 * * ? *)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
     * @param schedule A `cron` expression used to specify the schedule. 
     */
    public fun schedule(schedule: String)

    /**
     * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
     *
     * True is not supported for `ON_DEMAND` triggers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation)
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created. 
     */
    public fun startOnCreation(startOnCreation: Boolean)

    /**
     * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
     *
     * True is not supported for `ON_DEMAND` triggers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation)
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created. 
     */
    public fun startOnCreation(startOnCreation: IResolvable)

    /**
     * The tags to use with this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags)
     * @param tags The tags to use with this trigger. 
     */
    public fun tags(tags: Any)

    /**
     * The type of trigger that this is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
     * @param type The type of trigger that this is. 
     */
    public fun type(type: String)

    /**
     * The name of the workflow associated with the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname)
     * @param workflowName The name of the workflow associated with the trigger. 
     */
    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTrigger.Builder =
        software.amazon.awscdk.services.glue.CfnTrigger.Builder.create(scope, id)

    /**
     * The actions initiated by this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
     * @param actions The actions initiated by this trigger. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * The actions initiated by this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
     * @param actions The actions initiated by this trigger. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * The actions initiated by this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
     * @param actions The actions initiated by this trigger. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * A description of this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
     * @param description A description of this trigger. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires. 
     */
    override fun eventBatchingCondition(eventBatchingCondition: IResolvable) {
      cdkBuilder.eventBatchingCondition(eventBatchingCondition.let(IResolvable::unwrap))
    }

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires. 
     */
    override fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty) {
      cdkBuilder.eventBatchingCondition(eventBatchingCondition.let(EventBatchingConditionProperty::unwrap))
    }

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7278c0637d7ff3a0fce804c7246b18af2dbe03cc954e7a2baff78791cf900b47")
    override
        fun eventBatchingCondition(eventBatchingCondition: EventBatchingConditionProperty.Builder.() -> Unit):
        Unit = eventBatchingCondition(EventBatchingConditionProperty(eventBatchingCondition))

    /**
     * The name of the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
     * @param name The name of the trigger. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The predicate of this trigger, which defines when it will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
     * @param predicate The predicate of this trigger, which defines when it will fire. 
     */
    override fun predicate(predicate: IResolvable) {
      cdkBuilder.predicate(predicate.let(IResolvable::unwrap))
    }

    /**
     * The predicate of this trigger, which defines when it will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
     * @param predicate The predicate of this trigger, which defines when it will fire. 
     */
    override fun predicate(predicate: PredicateProperty) {
      cdkBuilder.predicate(predicate.let(PredicateProperty::unwrap))
    }

    /**
     * The predicate of this trigger, which defines when it will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
     * @param predicate The predicate of this trigger, which defines when it will fire. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cbcadeabe28dcb7d3e5fdda448dd4d3bd87ce8fb1a70b9ca1c8c3e294d2a844c")
    override fun predicate(predicate: PredicateProperty.Builder.() -> Unit): Unit =
        predicate(PredicateProperty(predicate))

    /**
     * A `cron` expression used to specify the schedule.
     *
     * For more information, see [Time-Based Schedules for Jobs and
     * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) in
     * the *AWS Glue Developer Guide* . For example, to run something every day at 12:15 UTC, specify
     * `cron(15 12 * * ? *)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
     * @param schedule A `cron` expression used to specify the schedule. 
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
     *
     * True is not supported for `ON_DEMAND` triggers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation)
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created. 
     */
    override fun startOnCreation(startOnCreation: Boolean) {
      cdkBuilder.startOnCreation(startOnCreation)
    }

    /**
     * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
     *
     * True is not supported for `ON_DEMAND` triggers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation)
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created. 
     */
    override fun startOnCreation(startOnCreation: IResolvable) {
      cdkBuilder.startOnCreation(startOnCreation.let(IResolvable::unwrap))
    }

    /**
     * The tags to use with this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags)
     * @param tags The tags to use with this trigger. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The type of trigger that this is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
     * @param type The type of trigger that this is. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * The name of the workflow associated with the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname)
     * @param workflowName The name of the workflow associated with the trigger. 
     */
    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTrigger = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrigger {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrigger(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger): CfnTrigger =
        CfnTrigger(cdkObject)

    internal fun unwrap(wrapped: CfnTrigger): software.amazon.awscdk.services.glue.CfnTrigger =
        wrapped.cdkObject
  }

  public interface ActionProperty {
    /**
     * The job arguments used when this trigger fires.
     *
     * For this job run, they replace the default arguments set in the job definition itself.
     *
     * You can specify arguments here that your own job-execution script consumes, in addition to
     * arguments that AWS Glue itself consumes.
     *
     * For information about how to specify and consume your own job arguments, see [Calling AWS
     * Glue APIs in
     * Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html) in
     * the *AWS Glue Developer Guide* .
     *
     * For information about the key-value pairs that AWS Glue consumes to set up your job, see the
     * [Special Parameters Used by AWS
     * Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
     * topic in the developer guide.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments)
     */
    public fun arguments(): Any? = unwrap(this).getArguments()

    /**
     * The name of the crawler to be used with this action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-crawlername)
     */
    public fun crawlerName(): String? = unwrap(this).getCrawlerName()

    /**
     * The name of a job to be executed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname)
     */
    public fun jobName(): String? = unwrap(this).getJobName()

    /**
     * Specifies configuration properties of a job run notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-notificationproperty)
     */
    public fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

    /**
     * The name of the `SecurityConfiguration` structure to be used with this action.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-securityconfiguration)
     */
    public fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

    /**
     * The `JobRun` timeout in minutes.
     *
     * This is the maximum time that a job run can consume resources before it is terminated and
     * enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout value
     * set in the parent job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-timeout)
     */
    public fun timeout(): Number? = unwrap(this).getTimeout()

    /**
     * A builder for [ActionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param arguments The job arguments used when this trigger fires.
       * For this job run, they replace the default arguments set in the job definition itself.
       *
       * You can specify arguments here that your own job-execution script consumes, in addition to
       * arguments that AWS Glue itself consumes.
       *
       * For information about how to specify and consume your own job arguments, see [Calling AWS
       * Glue APIs in
       * Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html)
       * in the *AWS Glue Developer Guide* .
       *
       * For information about the key-value pairs that AWS Glue consumes to set up your job, see
       * the [Special Parameters Used by AWS
       * Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
       * topic in the developer guide.
       */
      public fun arguments(arguments: Any)

      /**
       * @param crawlerName The name of the crawler to be used with this action.
       */
      public fun crawlerName(crawlerName: String)

      /**
       * @param jobName The name of a job to be executed.
       */
      public fun jobName(jobName: String)

      /**
       * @param notificationProperty Specifies configuration properties of a job run notification.
       */
      public fun notificationProperty(notificationProperty: IResolvable)

      /**
       * @param notificationProperty Specifies configuration properties of a job run notification.
       */
      public fun notificationProperty(notificationProperty: NotificationPropertyProperty)

      /**
       * @param notificationProperty Specifies configuration properties of a job run notification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67d942a337878632a7155a8861a9d8ba5da45d910ab542bc94aa976aff03c77f")
      public
          fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit)

      /**
       * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
       * with this action.
       */
      public fun securityConfiguration(securityConfiguration: String)

      /**
       * @param timeout The `JobRun` timeout in minutes.
       * This is the maximum time that a job run can consume resources before it is terminated and
       * enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout
       * value set in the parent job.
       */
      public fun timeout(timeout: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty.Builder
          = software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty.builder()

      /**
       * @param arguments The job arguments used when this trigger fires.
       * For this job run, they replace the default arguments set in the job definition itself.
       *
       * You can specify arguments here that your own job-execution script consumes, in addition to
       * arguments that AWS Glue itself consumes.
       *
       * For information about how to specify and consume your own job arguments, see [Calling AWS
       * Glue APIs in
       * Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html)
       * in the *AWS Glue Developer Guide* .
       *
       * For information about the key-value pairs that AWS Glue consumes to set up your job, see
       * the [Special Parameters Used by AWS
       * Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
       * topic in the developer guide.
       */
      override fun arguments(arguments: Any) {
        cdkBuilder.arguments(arguments)
      }

      /**
       * @param crawlerName The name of the crawler to be used with this action.
       */
      override fun crawlerName(crawlerName: String) {
        cdkBuilder.crawlerName(crawlerName)
      }

      /**
       * @param jobName The name of a job to be executed.
       */
      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      /**
       * @param notificationProperty Specifies configuration properties of a job run notification.
       */
      override fun notificationProperty(notificationProperty: IResolvable) {
        cdkBuilder.notificationProperty(notificationProperty.let(IResolvable::unwrap))
      }

      /**
       * @param notificationProperty Specifies configuration properties of a job run notification.
       */
      override fun notificationProperty(notificationProperty: NotificationPropertyProperty) {
        cdkBuilder.notificationProperty(notificationProperty.let(NotificationPropertyProperty::unwrap))
      }

      /**
       * @param notificationProperty Specifies configuration properties of a job run notification.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67d942a337878632a7155a8861a9d8ba5da45d910ab542bc94aa976aff03c77f")
      override
          fun notificationProperty(notificationProperty: NotificationPropertyProperty.Builder.() -> Unit):
          Unit = notificationProperty(NotificationPropertyProperty(notificationProperty))

      /**
       * @param securityConfiguration The name of the `SecurityConfiguration` structure to be used
       * with this action.
       */
      override fun securityConfiguration(securityConfiguration: String) {
        cdkBuilder.securityConfiguration(securityConfiguration)
      }

      /**
       * @param timeout The `JobRun` timeout in minutes.
       * This is the maximum time that a job run can consume resources before it is terminated and
       * enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout
       * value set in the parent job.
       */
      override fun timeout(timeout: Number) {
        cdkBuilder.timeout(timeout)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty,
    ) : ActionProperty {
      /**
       * The job arguments used when this trigger fires.
       *
       * For this job run, they replace the default arguments set in the job definition itself.
       *
       * You can specify arguments here that your own job-execution script consumes, in addition to
       * arguments that AWS Glue itself consumes.
       *
       * For information about how to specify and consume your own job arguments, see [Calling AWS
       * Glue APIs in
       * Python](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-python-calling.html)
       * in the *AWS Glue Developer Guide* .
       *
       * For information about the key-value pairs that AWS Glue consumes to set up your job, see
       * the [Special Parameters Used by AWS
       * Glue](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-programming-etl-glue-arguments.html)
       * topic in the developer guide.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-arguments)
       */
      override fun arguments(): Any? = unwrap(this).getArguments()

      /**
       * The name of the crawler to be used with this action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-crawlername)
       */
      override fun crawlerName(): String? = unwrap(this).getCrawlerName()

      /**
       * The name of a job to be executed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-jobname)
       */
      override fun jobName(): String? = unwrap(this).getJobName()

      /**
       * Specifies configuration properties of a job run notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-notificationproperty)
       */
      override fun notificationProperty(): Any? = unwrap(this).getNotificationProperty()

      /**
       * The name of the `SecurityConfiguration` structure to be used with this action.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-securityconfiguration)
       */
      override fun securityConfiguration(): String? = unwrap(this).getSecurityConfiguration()

      /**
       * The `JobRun` timeout in minutes.
       *
       * This is the maximum time that a job run can consume resources before it is terminated and
       * enters TIMEOUT status. The default is 2,880 minutes (48 hours). This overrides the timeout
       * value set in the parent job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-action.html#cfn-glue-trigger-action-timeout)
       */
      override fun timeout(): Number? = unwrap(this).getTimeout()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ActionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty):
          ActionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ActionProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.ActionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface EventBatchingConditionProperty {
    /**
     * Number of events that must be received from Amazon EventBridge before EventBridge event
     * trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-eventbatchingcondition.html#cfn-glue-trigger-eventbatchingcondition-batchsize)
     */
    public fun batchSize(): Number

    /**
     * Window of time in seconds after which EventBridge event trigger fires.
     *
     * Window starts when first event is received.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-eventbatchingcondition.html#cfn-glue-trigger-eventbatchingcondition-batchwindow)
     */
    public fun batchWindow(): Number? = unwrap(this).getBatchWindow()

    /**
     * A builder for [EventBatchingConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param batchSize Number of events that must be received from Amazon EventBridge before
       * EventBridge event trigger fires. 
       */
      public fun batchSize(batchSize: Number)

      /**
       * @param batchWindow Window of time in seconds after which EventBridge event trigger fires.
       * Window starts when first event is received.
       */
      public fun batchWindow(batchWindow: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty.builder()

      /**
       * @param batchSize Number of events that must be received from Amazon EventBridge before
       * EventBridge event trigger fires. 
       */
      override fun batchSize(batchSize: Number) {
        cdkBuilder.batchSize(batchSize)
      }

      /**
       * @param batchWindow Window of time in seconds after which EventBridge event trigger fires.
       * Window starts when first event is received.
       */
      override fun batchWindow(batchWindow: Number) {
        cdkBuilder.batchWindow(batchWindow)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty,
    ) : EventBatchingConditionProperty {
      /**
       * Number of events that must be received from Amazon EventBridge before EventBridge event
       * trigger fires.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-eventbatchingcondition.html#cfn-glue-trigger-eventbatchingcondition-batchsize)
       */
      override fun batchSize(): Number = unwrap(this).getBatchSize()

      /**
       * Window of time in seconds after which EventBridge event trigger fires.
       *
       * Window starts when first event is received.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-eventbatchingcondition.html#cfn-glue-trigger-eventbatchingcondition-batchwindow)
       */
      override fun batchWindow(): Number? = unwrap(this).getBatchWindow()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): EventBatchingConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty):
          EventBatchingConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: EventBatchingConditionProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.EventBatchingConditionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface NotificationPropertyProperty {
    /**
     * After a job run starts, the number of minutes to wait before sending a job run delay
     * notification.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html#cfn-glue-trigger-notificationproperty-notifydelayafter)
     */
    public fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()

    /**
     * A builder for [NotificationPropertyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notifyDelayAfter After a job run starts, the number of minutes to wait before
       * sending a job run delay notification.
       */
      public fun notifyDelayAfter(notifyDelayAfter: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty.builder()

      /**
       * @param notifyDelayAfter After a job run starts, the number of minutes to wait before
       * sending a job run delay notification.
       */
      override fun notifyDelayAfter(notifyDelayAfter: Number) {
        cdkBuilder.notifyDelayAfter(notifyDelayAfter)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty,
    ) : NotificationPropertyProperty {
      /**
       * After a job run starts, the number of minutes to wait before sending a job run delay
       * notification.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-notificationproperty.html#cfn-glue-trigger-notificationproperty-notifydelayafter)
       */
      override fun notifyDelayAfter(): Number? = unwrap(this).getNotifyDelayAfter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NotificationPropertyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty):
          NotificationPropertyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationPropertyProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.NotificationPropertyProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface PredicateProperty {
    /**
     * A list of the conditions that determine when the trigger will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions)
     */
    public fun conditions(): Any? = unwrap(this).getConditions()

    /**
     * An optional field if only one condition is listed.
     *
     * If multiple conditions are listed, then this field is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical)
     */
    public fun logical(): String? = unwrap(this).getLogical()

    /**
     * A builder for [PredicateProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param conditions A list of the conditions that determine when the trigger will fire.
       */
      public fun conditions(conditions: IResolvable)

      /**
       * @param conditions A list of the conditions that determine when the trigger will fire.
       */
      public fun conditions(conditions: List<Any>)

      /**
       * @param conditions A list of the conditions that determine when the trigger will fire.
       */
      public fun conditions(vararg conditions: Any)

      /**
       * @param logical An optional field if only one condition is listed.
       * If multiple conditions are listed, then this field is required.
       */
      public fun logical(logical: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty.builder()

      /**
       * @param conditions A list of the conditions that determine when the trigger will fire.
       */
      override fun conditions(conditions: IResolvable) {
        cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
      }

      /**
       * @param conditions A list of the conditions that determine when the trigger will fire.
       */
      override fun conditions(conditions: List<Any>) {
        cdkBuilder.conditions(conditions)
      }

      /**
       * @param conditions A list of the conditions that determine when the trigger will fire.
       */
      override fun conditions(vararg conditions: Any): Unit = conditions(conditions.toList())

      /**
       * @param logical An optional field if only one condition is listed.
       * If multiple conditions are listed, then this field is required.
       */
      override fun logical(logical: String) {
        cdkBuilder.logical(logical)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty,
    ) : PredicateProperty {
      /**
       * A list of the conditions that determine when the trigger will fire.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-conditions)
       */
      override fun conditions(): Any? = unwrap(this).getConditions()

      /**
       * An optional field if only one condition is listed.
       *
       * If multiple conditions are listed, then this field is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-predicate.html#cfn-glue-trigger-predicate-logical)
       */
      override fun logical(): String? = unwrap(this).getLogical()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PredicateProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty):
          PredicateProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PredicateProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.PredicateProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ConditionProperty {
    /**
     * The state of the crawler to which this condition applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlstate)
     */
    public fun crawlState(): String? = unwrap(this).getCrawlState()

    /**
     * The name of the crawler to which this condition applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlername)
     */
    public fun crawlerName(): String? = unwrap(this).getCrawlerName()

    /**
     * The name of the job whose `JobRuns` this condition applies to, and on which this trigger
     * waits.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname)
     */
    public fun jobName(): String? = unwrap(this).getJobName()

    /**
     * A logical operator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator)
     */
    public fun logicalOperator(): String? = unwrap(this).getLogicalOperator()

    /**
     * The condition state.
     *
     * Currently, the values supported are `SUCCEEDED` , `STOPPED` , `TIMEOUT` , and `FAILED` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state)
     */
    public fun state(): String? = unwrap(this).getState()

    /**
     * A builder for [ConditionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param crawlState The state of the crawler to which this condition applies.
       */
      public fun crawlState(crawlState: String)

      /**
       * @param crawlerName The name of the crawler to which this condition applies.
       */
      public fun crawlerName(crawlerName: String)

      /**
       * @param jobName The name of the job whose `JobRuns` this condition applies to, and on which
       * this trigger waits.
       */
      public fun jobName(jobName: String)

      /**
       * @param logicalOperator A logical operator.
       */
      public fun logicalOperator(logicalOperator: String)

      /**
       * @param state The condition state.
       * Currently, the values supported are `SUCCEEDED` , `STOPPED` , `TIMEOUT` , and `FAILED` .
       */
      public fun state(state: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty.Builder =
          software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty.builder()

      /**
       * @param crawlState The state of the crawler to which this condition applies.
       */
      override fun crawlState(crawlState: String) {
        cdkBuilder.crawlState(crawlState)
      }

      /**
       * @param crawlerName The name of the crawler to which this condition applies.
       */
      override fun crawlerName(crawlerName: String) {
        cdkBuilder.crawlerName(crawlerName)
      }

      /**
       * @param jobName The name of the job whose `JobRuns` this condition applies to, and on which
       * this trigger waits.
       */
      override fun jobName(jobName: String) {
        cdkBuilder.jobName(jobName)
      }

      /**
       * @param logicalOperator A logical operator.
       */
      override fun logicalOperator(logicalOperator: String) {
        cdkBuilder.logicalOperator(logicalOperator)
      }

      /**
       * @param state The condition state.
       * Currently, the values supported are `SUCCEEDED` , `STOPPED` , `TIMEOUT` , and `FAILED` .
       */
      override fun state(state: String) {
        cdkBuilder.state(state)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty,
    ) : ConditionProperty {
      /**
       * The state of the crawler to which this condition applies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlstate)
       */
      override fun crawlState(): String? = unwrap(this).getCrawlState()

      /**
       * The name of the crawler to which this condition applies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-crawlername)
       */
      override fun crawlerName(): String? = unwrap(this).getCrawlerName()

      /**
       * The name of the job whose `JobRuns` this condition applies to, and on which this trigger
       * waits.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-jobname)
       */
      override fun jobName(): String? = unwrap(this).getJobName()

      /**
       * A logical operator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-logicaloperator)
       */
      override fun logicalOperator(): String? = unwrap(this).getLogicalOperator()

      /**
       * The condition state.
       *
       * Currently, the values supported are `SUCCEEDED` , `STOPPED` , `TIMEOUT` , and `FAILED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-trigger-condition.html#cfn-glue-trigger-condition-state)
       */
      override fun state(): String? = unwrap(this).getState()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.glue.CfnTrigger.ConditionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
