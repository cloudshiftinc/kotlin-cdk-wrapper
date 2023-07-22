@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnTrigger
import software.constructs.Construct

/**
 * The `AWS::Glue::Trigger` resource specifies triggers that run AWS Glue jobs.
 *
 * For more information, see [Triggering Jobs in AWS
 * Glue](https://docs.aws.amazon.com/glue/latest/dg/trigger-job.html) and [Trigger
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-jobs-trigger.html#aws-glue-api-jobs-trigger-Trigger)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
 * Object arguments_;
 * Object tags;
 * CfnTrigger cfnTrigger = CfnTrigger.Builder.create(this, "MyCfnTrigger")
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
@CdkDslMarker
public class CfnTriggerDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnTrigger.Builder = CfnTrigger.Builder.create(scope, id)

  private val _actions: MutableList<Any> = mutableListOf()

  /**
   * The actions initiated by this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
   * @param actions The actions initiated by this trigger. 
   */
  public fun actions(vararg actions: Any) {
    _actions.addAll(listOf(*actions))
  }

  /**
   * The actions initiated by this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
   * @param actions The actions initiated by this trigger. 
   */
  public fun actions(actions: Collection<Any>) {
    _actions.addAll(actions)
  }

  /**
   * The actions initiated by this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-actions)
   * @param actions The actions initiated by this trigger. 
   */
  public fun actions(actions: IResolvable) {
    cdkBuilder.actions(actions)
  }

  /**
   * A description of this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-description)
   * @param description A description of this trigger. 
   */
  public fun description(description: String) {
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
  public fun eventBatchingCondition(eventBatchingCondition: IResolvable) {
    cdkBuilder.eventBatchingCondition(eventBatchingCondition)
  }

  /**
   * Batch condition that must be met (specified number of events received or batch time window
   * expired) before EventBridge event trigger fires.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-eventbatchingcondition)
   * @param eventBatchingCondition Batch condition that must be met (specified number of events
   * received or batch time window expired) before EventBridge event trigger fires. 
   */
  public
      fun eventBatchingCondition(eventBatchingCondition: CfnTrigger.EventBatchingConditionProperty) {
    cdkBuilder.eventBatchingCondition(eventBatchingCondition)
  }

  /**
   * The name of the trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-name)
   * @param name The name of the trigger. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The predicate of this trigger, which defines when it will fire.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
   * @param predicate The predicate of this trigger, which defines when it will fire. 
   */
  public fun predicate(predicate: IResolvable) {
    cdkBuilder.predicate(predicate)
  }

  /**
   * The predicate of this trigger, which defines when it will fire.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-predicate)
   * @param predicate The predicate of this trigger, which defines when it will fire. 
   */
  public fun predicate(predicate: CfnTrigger.PredicateProperty) {
    cdkBuilder.predicate(predicate)
  }

  /**
   * A `cron` expression used to specify the schedule.
   *
   * For more information, see [Time-Based Schedules for Jobs and
   * Crawlers](https://docs.aws.amazon.com/glue/latest/dg/monitor-data-warehouse-schedule.html) in the
   * *AWS Glue Developer Guide* . For example, to run something every day at 12:15 UTC, specify
   * `cron(15 12 * * ? *)` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-schedule)
   * @param schedule A `cron` expression used to specify the schedule. 
   */
  public fun schedule(schedule: String) {
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
  public fun startOnCreation(startOnCreation: Boolean) {
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
  public fun startOnCreation(startOnCreation: IResolvable) {
    cdkBuilder.startOnCreation(startOnCreation)
  }

  /**
   * The tags to use with this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags)
   * @param tags The tags to use with this trigger. 
   */
  public fun tags(tags: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(tags)
    cdkBuilder.tags(builder.map)
  }

  /**
   * The tags to use with this trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-tags)
   * @param tags The tags to use with this trigger. 
   */
  public fun tags(tags: Any) {
    cdkBuilder.tags(tags)
  }

  /**
   * The type of trigger that this is.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-type)
   * @param type The type of trigger that this is. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  /**
   * The name of the workflow associated with the trigger.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-trigger.html#cfn-glue-trigger-workflowname)
   * @param workflowName The name of the workflow associated with the trigger. 
   */
  public fun workflowName(workflowName: String) {
    cdkBuilder.workflowName(workflowName)
  }

  public fun build(): CfnTrigger {
    if(_actions.isNotEmpty()) cdkBuilder.actions(_actions)
    return cdkBuilder.build()
  }
}
