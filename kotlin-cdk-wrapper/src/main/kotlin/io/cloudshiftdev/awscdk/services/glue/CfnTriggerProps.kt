@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnTrigger`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object arguments_;
 * Object tags;
 * CfnTriggerProps cfnTriggerProps = CfnTriggerProps.builder()
 * .actions(List.of(ActionProperty.builder()
 * .arguments(arguments_)
 * .crawlerName("crawlerName")
 * .jobName("jobName")
 * .notificationProperty(NotificationPropertyProperty.builder()
 * .notifyDelayAfter(123)
 * .build())
 * .securityConfiguration("securityConfiguration")
 * .timeout(123)
 * .build()))
 * .type("type")
 * // the properties below are optional
 * .description("description")
 * .eventBatchingCondition(EventBatchingConditionProperty.builder()
 * .batchSize(123)
 * // the properties below are optional
 * .batchWindow(123)
 * .build())
 * .name("name")
 * .predicate(PredicateProperty.builder()
 * .conditions(List.of(ConditionProperty.builder()
 * .crawlerName("crawlerName")
 * .crawlState("crawlState")
 * .jobName("jobName")
 * .logicalOperator("logicalOperator")
 * .state("state")
 * .build()))
 * .logical("logical")
 * .build())
 * .schedule("schedule")
 * .startOnCreation(false)
 * .tags(tags)
 * .workflowName("workflowName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html)
 */
public interface CfnTriggerProps {
  /**
   * The actions initiated by this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
   */
  public fun actions(): Any

  /**
   * A description of this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Batch condition that must be met (specified number of events received or batch time window
   * expired) before EventBridge event trigger fires.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
   */
  public fun eventBatchingCondition(): Any? = unwrap(this).getEventBatchingCondition()

  /**
   * The name of the trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * The predicate of this trigger, which defines when it will fire.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
   */
  public fun predicate(): Any? = unwrap(this).getPredicate()

  /**
   * A `cron` expression used to specify the schedule.
   *
   * For more information, see [Time-Based Schedules for Jobs and
   * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) in the
   * *AWS Glue Developer Guide* . For example, to run something every day at 12:15 UTC, specify
   * `cron(15 12 * * ? *)` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
   */
  public fun schedule(): String? = unwrap(this).getSchedule()

  /**
   * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
   *
   * True is not supported for `ON_DEMAND` triggers.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation)
   */
  public fun startOnCreation(): Any? = unwrap(this).getStartOnCreation()

  /**
   * The tags to use with this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags)
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * The type of trigger that this is.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
   */
  public fun type(): String

  /**
   * The name of the workflow associated with the trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname)
   */
  public fun workflowName(): String? = unwrap(this).getWorkflowName()

  /**
   * A builder for [CfnTriggerProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param actions The actions initiated by this trigger. 
     */
    public fun actions(actions: IResolvable)

    /**
     * @param actions The actions initiated by this trigger. 
     */
    public fun actions(actions: List<Any>)

    /**
     * @param actions The actions initiated by this trigger. 
     */
    public fun actions(vararg actions: Any)

    /**
     * @param description A description of this trigger.
     */
    public fun description(description: String)

    /**
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires.
     */
    public fun eventBatchingCondition(eventBatchingCondition: IResolvable)

    /**
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires.
     */
    public
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty)

    /**
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02e560aac5c407e456caac23c669aa9834fb2e25630d05ebed6dda10988385c6")
    public
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the trigger.
     */
    public fun name(name: String)

    /**
     * @param predicate The predicate of this trigger, which defines when it will fire.
     */
    public fun predicate(predicate: IResolvable)

    /**
     * @param predicate The predicate of this trigger, which defines when it will fire.
     */
    public fun predicate(predicate: CfnTrigger.PredicateProperty)

    /**
     * @param predicate The predicate of this trigger, which defines when it will fire.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6d6adc057a35bac1c43cc52cced224ec25554ec2afcf0f7415fccf2cbb18cf0")
    public fun predicate(predicate: CfnTrigger.PredicateProperty.Builder.() -> Unit)

    /**
     * @param schedule A `cron` expression used to specify the schedule.
     * For more information, see [Time-Based Schedules for Jobs and
     * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) in
     * the *AWS Glue Developer Guide* . For example, to run something every day at 12:15 UTC, specify
     * `cron(15 12 * * ? *)` .
     */
    public fun schedule(schedule: String)

    /**
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created.
     * True is not supported for `ON_DEMAND` triggers.
     */
    public fun startOnCreation(startOnCreation: Boolean)

    /**
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created.
     * True is not supported for `ON_DEMAND` triggers.
     */
    public fun startOnCreation(startOnCreation: IResolvable)

    /**
     * @param tags The tags to use with this trigger.
     */
    public fun tags(tags: Any)

    /**
     * @param type The type of trigger that this is. 
     */
    public fun type(type: String)

    /**
     * @param workflowName The name of the workflow associated with the trigger.
     */
    public fun workflowName(workflowName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnTriggerProps.Builder =
        software.amazon.awscdk.services.glue.CfnTriggerProps.builder()

    /**
     * @param actions The actions initiated by this trigger. 
     */
    override fun actions(actions: IResolvable) {
      cdkBuilder.actions(actions.let(IResolvable::unwrap))
    }

    /**
     * @param actions The actions initiated by this trigger. 
     */
    override fun actions(actions: List<Any>) {
      cdkBuilder.actions(actions)
    }

    /**
     * @param actions The actions initiated by this trigger. 
     */
    override fun actions(vararg actions: Any): Unit = actions(actions.toList())

    /**
     * @param description A description of this trigger.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires.
     */
    override fun eventBatchingCondition(eventBatchingCondition: IResolvable) {
      cdkBuilder.eventBatchingCondition(eventBatchingCondition.let(IResolvable::unwrap))
    }

    /**
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires.
     */
    override
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty) {
      cdkBuilder.eventBatchingCondition(eventBatchingCondition.let(CfnTrigger.EventBatchingConditionProperty::unwrap))
    }

    /**
     * @param eventBatchingCondition Batch condition that must be met (specified number of events
     * received or batch time window expired) before EventBridge event trigger fires.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("02e560aac5c407e456caac23c669aa9834fb2e25630d05ebed6dda10988385c6")
    override
        fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty.Builder.() -> Unit):
        Unit =
        eventBatchingCondition(CfnTrigger.EventBatchingConditionProperty(eventBatchingCondition))

    /**
     * @param name The name of the trigger.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param predicate The predicate of this trigger, which defines when it will fire.
     */
    override fun predicate(predicate: IResolvable) {
      cdkBuilder.predicate(predicate.let(IResolvable::unwrap))
    }

    /**
     * @param predicate The predicate of this trigger, which defines when it will fire.
     */
    override fun predicate(predicate: CfnTrigger.PredicateProperty) {
      cdkBuilder.predicate(predicate.let(CfnTrigger.PredicateProperty::unwrap))
    }

    /**
     * @param predicate The predicate of this trigger, which defines when it will fire.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f6d6adc057a35bac1c43cc52cced224ec25554ec2afcf0f7415fccf2cbb18cf0")
    override fun predicate(predicate: CfnTrigger.PredicateProperty.Builder.() -> Unit): Unit =
        predicate(CfnTrigger.PredicateProperty(predicate))

    /**
     * @param schedule A `cron` expression used to specify the schedule.
     * For more information, see [Time-Based Schedules for Jobs and
     * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) in
     * the *AWS Glue Developer Guide* . For example, to run something every day at 12:15 UTC, specify
     * `cron(15 12 * * ? *)` .
     */
    override fun schedule(schedule: String) {
      cdkBuilder.schedule(schedule)
    }

    /**
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created.
     * True is not supported for `ON_DEMAND` triggers.
     */
    override fun startOnCreation(startOnCreation: Boolean) {
      cdkBuilder.startOnCreation(startOnCreation)
    }

    /**
     * @param startOnCreation Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when
     * created.
     * True is not supported for `ON_DEMAND` triggers.
     */
    override fun startOnCreation(startOnCreation: IResolvable) {
      cdkBuilder.startOnCreation(startOnCreation.let(IResolvable::unwrap))
    }

    /**
     * @param tags The tags to use with this trigger.
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param type The type of trigger that this is. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param workflowName The name of the workflow associated with the trigger.
     */
    override fun workflowName(workflowName: String) {
      cdkBuilder.workflowName(workflowName)
    }

    public fun build(): software.amazon.awscdk.services.glue.CfnTriggerProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.glue.CfnTriggerProps,
  ) : CdkObject(cdkObject), CfnTriggerProps {
    /**
     * The actions initiated by this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
     */
    override fun actions(): Any = unwrap(this).getActions()

    /**
     * A description of this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Batch condition that must be met (specified number of events received or batch time window
     * expired) before EventBridge event trigger fires.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
     */
    override fun eventBatchingCondition(): Any? = unwrap(this).getEventBatchingCondition()

    /**
     * The name of the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * The predicate of this trigger, which defines when it will fire.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
     */
    override fun predicate(): Any? = unwrap(this).getPredicate()

    /**
     * A `cron` expression used to specify the schedule.
     *
     * For more information, see [Time-Based Schedules for Jobs and
     * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) in
     * the *AWS Glue Developer Guide* . For example, to run something every day at 12:15 UTC, specify
     * `cron(15 12 * * ? *)` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
     */
    override fun schedule(): String? = unwrap(this).getSchedule()

    /**
     * Set to true to start `SCHEDULED` and `CONDITIONAL` triggers when created.
     *
     * True is not supported for `ON_DEMAND` triggers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-startoncreation)
     */
    override fun startOnCreation(): Any? = unwrap(this).getStartOnCreation()

    /**
     * The tags to use with this trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags)
     */
    override fun tags(): Any? = unwrap(this).getTags()

    /**
     * The type of trigger that this is.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
     */
    override fun type(): String = unwrap(this).getType()

    /**
     * The name of the workflow associated with the trigger.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname)
     */
    override fun workflowName(): String? = unwrap(this).getWorkflowName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTriggerProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnTriggerProps):
        CfnTriggerProps = CdkObjectWrappers.wrap(cdkObject) as? CfnTriggerProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTriggerProps):
        software.amazon.awscdk.services.glue.CfnTriggerProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.glue.CfnTriggerProps
  }
}
