@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleSource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.constructs.Construct
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * The abstract view of an AWS CodePipeline as required and used by Actions.
 *
 * It extends `events.IRuleTarget`,
 * so this interface can be used as a Target for CloudWatch Events.
 */
public interface IPipeline : IResource, INotificationRuleSource {
  /**
   * Defines a CodeStar notification rule triggered when the pipeline events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
   * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange`
   * to define rules for these specific event emitted.
   *
   * @return CodeStar notification rule associated with this build project.
   * @param id The id of the CodeStar notification rule. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Customization options for CodeStar notification rule. 
   */
  public fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: PipelineNotifyOnOptions,
  ): INotificationRule

  /**
   * Defines a CodeStar notification rule triggered when the pipeline events emitted by you
   * specified, it very similar to `onEvent` API.
   *
   * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
   * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange`
   * to define rules for these specific event emitted.
   *
   * @return CodeStar notification rule associated with this build project.
   * @param id The id of the CodeStar notification rule. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Customization options for CodeStar notification rule. 
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("802e79d0a19fb60a123ba5d2a95f474d31780c23201b1ff29c431fd17d6a7d12")
  public fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: PipelineNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Action execution" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnAnyActionStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Action execution" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnAnyActionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Action execution" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11ac33b7899456d98c0e8413c5ecfbb4f8332d6e26cd7827148420c235e95215")
  public fun notifyOnAnyActionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Manual approval" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnAnyManualApprovalStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Manual approval" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnAnyManualApprovalStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Manual approval" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10713caf6597b23ffa1ea821ac0383066a8adc80d9d8673c7888936bd6188ae9")
  public fun notifyOnAnyManualApprovalStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Stage execution" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnAnyStageStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Stage execution" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnAnyStageStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Stage execution" events emitted from
   * this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95ca28a7a850434fd61ebbdf04c624d6be0ced4e688a3beab746211fa10c0e4c")
  public fun notifyOnAnyStageStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
   * from this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnExecutionStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
   * from this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  public fun notifyOnExecutionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule

  /**
   * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
   * from this pipeline.
   *
   * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
   * @param id Identifier for this notification handler. 
   * @param target The target to register for the CodeStar Notifications destination. 
   * @param options Additional options to pass to the notification rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29f3724b89990617eca228394912da43fc34ad8f0843b7e906964ad64fdd522c")
  public fun notifyOnExecutionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule

  /**
   * Define an event rule triggered by this CodePipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public fun onEvent(id: String): Rule

  /**
   * Define an event rule triggered by this CodePipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public fun onEvent(id: String, options: OnEventOptions): Rule

  /**
   * Define an event rule triggered by this CodePipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * Define an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
   * emitted from this pipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public fun onStateChange(id: String): Rule

  /**
   * Define an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
   * emitted from this pipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  public fun onStateChange(id: String, options: OnEventOptions): Rule

  /**
   * Define an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
   * emitted from this pipeline.
   *
   * @param id Identifier for this event handler. 
   * @param options Additional options to pass to the event rule.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule

  /**
   * The ARN of the Pipeline.
   */
  public fun pipelineArn(): String

  /**
   * The name of the Pipeline.
   */
  public fun pipelineName(): String

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codepipeline.IPipeline,
  ) : CdkObject(cdkObject), IPipeline {
    /**
     * Apply the given removal policy to this resource.
     *
     * The Removal Policy controls what happens to this resource when it stops
     * being managed by CloudFormation, either because you've removed it from the
     * CDK application or because you've made a change that requires the resource
     * to be replaced.
     *
     * The resource can be deleted (`RemovalPolicy.DESTROY`), or left in your AWS
     * account for data recovery and cleanup later (`RemovalPolicy.RETAIN`).
     *
     * @param policy 
     */
    override fun applyRemovalPolicy(policy: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(policy.let(RemovalPolicy.Companion::unwrap))
    }

    /**
     * Returns a source configuration for notification rule.
     *
     * @param scope 
     */
    override fun bindAsNotificationRuleSource(scope: Construct): NotificationRuleSourceConfig =
        unwrap(this).bindAsNotificationRuleSource(scope.let(Construct.Companion::unwrap)).let(NotificationRuleSourceConfig::wrap)

    /**
     * The environment this resource belongs to.
     *
     * For resources that are created and managed by the CDK
     * (generally, those created by creating new class instances like Role, Bucket, etc.),
     * this is always the same as the environment of the stack they belong to;
     * however, for imported resources
     * (those obtained from static methods like fromRoleArn, fromBucketName, etc.),
     * that might be different than the stack they were imported into.
     */
    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    /**
     * Defines a CodeStar notification rule triggered when the pipeline events emitted by you
     * specified, it very similar to `onEvent` API.
     *
     * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
     * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange`
     * to define rules for these specific event emitted.
     *
     * @return CodeStar notification rule associated with this build project.
     * @param id The id of the CodeStar notification rule. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Customization options for CodeStar notification rule. 
     */
    override fun notifyOn(
      id: String,
      target: INotificationRuleTarget,
      options: PipelineNotifyOnOptions,
    ): INotificationRule = unwrap(this).notifyOn(id,
        target.let(INotificationRuleTarget.Companion::unwrap),
        options.let(PipelineNotifyOnOptions.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Defines a CodeStar notification rule triggered when the pipeline events emitted by you
     * specified, it very similar to `onEvent` API.
     *
     * You can also use the methods `notifyOnExecutionStateChange`, `notifyOnAnyStageStateChange`,
     * `notifyOnAnyActionStateChange` and `notifyOnAnyManualApprovalStateChange`
     * to define rules for these specific event emitted.
     *
     * @return CodeStar notification rule associated with this build project.
     * @param id The id of the CodeStar notification rule. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Customization options for CodeStar notification rule. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("802e79d0a19fb60a123ba5d2a95f474d31780c23201b1ff29c431fd17d6a7d12")
    override fun notifyOn(
      id: String,
      target: INotificationRuleTarget,
      options: PipelineNotifyOnOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOn(id, target, PipelineNotifyOnOptions(options))

    /**
     * Define an notification rule triggered by the set of the "Action execution" events emitted
     * from this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnAnyActionStateChange(id: String, target: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnAnyActionStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Action execution" events emitted
     * from this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnAnyActionStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnAnyActionStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap),
        options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Action execution" events emitted
     * from this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("11ac33b7899456d98c0e8413c5ecfbb4f8332d6e26cd7827148420c235e95215")
    override fun notifyOnAnyActionStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnAnyActionStateChange(id, target,
        NotificationRuleOptions(options))

    /**
     * Define an notification rule triggered by the set of the "Manual approval" events emitted from
     * this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnAnyManualApprovalStateChange(id: String, target: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnAnyManualApprovalStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Manual approval" events emitted from
     * this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnAnyManualApprovalStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnAnyManualApprovalStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap),
        options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Manual approval" events emitted from
     * this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("10713caf6597b23ffa1ea821ac0383066a8adc80d9d8673c7888936bd6188ae9")
    override fun notifyOnAnyManualApprovalStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnAnyManualApprovalStateChange(id, target,
        NotificationRuleOptions(options))

    /**
     * Define an notification rule triggered by the set of the "Stage execution" events emitted from
     * this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnAnyStageStateChange(id: String, target: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnAnyStageStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Stage execution" events emitted from
     * this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnAnyStageStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnAnyStageStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap),
        options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Stage execution" events emitted from
     * this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("95ca28a7a850434fd61ebbdf04c624d6be0ced4e688a3beab746211fa10c0e4c")
    override fun notifyOnAnyStageStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnAnyStageStateChange(id, target, NotificationRuleOptions(options))

    /**
     * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
     * from this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnExecutionStateChange(id: String, target: INotificationRuleTarget):
        INotificationRule = unwrap(this).notifyOnExecutionStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
     * from this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    override fun notifyOnExecutionStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions,
    ): INotificationRule = unwrap(this).notifyOnExecutionStateChange(id,
        target.let(INotificationRuleTarget.Companion::unwrap),
        options.let(NotificationRuleOptions.Companion::unwrap)).let(INotificationRule::wrap)

    /**
     * Define an notification rule triggered by the set of the "Pipeline execution" events emitted
     * from this pipeline.
     *
     * [Documentation](https://docs.aws.amazon.com/dtconsole/latest/userguide/concepts.html#events-ref-pipeline)
     * @param id Identifier for this notification handler. 
     * @param target The target to register for the CodeStar Notifications destination. 
     * @param options Additional options to pass to the notification rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("29f3724b89990617eca228394912da43fc34ad8f0843b7e906964ad64fdd522c")
    override fun notifyOnExecutionStateChange(
      id: String,
      target: INotificationRuleTarget,
      options: NotificationRuleOptions.Builder.() -> Unit,
    ): INotificationRule = notifyOnExecutionStateChange(id, target,
        NotificationRuleOptions(options))

    /**
     * Define an event rule triggered by this CodePipeline.
     *
     * @param id Identifier for this event handler. 
     * @param options Additional options to pass to the event rule.
     */
    override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

    /**
     * Define an event rule triggered by this CodePipeline.
     *
     * @param id Identifier for this event handler. 
     * @param options Additional options to pass to the event rule.
     */
    override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
        options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

    /**
     * Define an event rule triggered by this CodePipeline.
     *
     * @param id Identifier for this event handler. 
     * @param options Additional options to pass to the event rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
    override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule = onEvent(id,
        OnEventOptions(options))

    /**
     * Define an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
     * emitted from this pipeline.
     *
     * @param id Identifier for this event handler. 
     * @param options Additional options to pass to the event rule.
     */
    override fun onStateChange(id: String): Rule = unwrap(this).onStateChange(id).let(Rule::wrap)

    /**
     * Define an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
     * emitted from this pipeline.
     *
     * @param id Identifier for this event handler. 
     * @param options Additional options to pass to the event rule.
     */
    override fun onStateChange(id: String, options: OnEventOptions): Rule =
        unwrap(this).onStateChange(id,
        options.let(OnEventOptions.Companion::unwrap)).let(Rule::wrap)

    /**
     * Define an event rule triggered by the "CodePipeline Pipeline Execution State Change" event
     * emitted from this pipeline.
     *
     * @param id Identifier for this event handler. 
     * @param options Additional options to pass to the event rule.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
    override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
        onStateChange(id, OnEventOptions(options))

    /**
     * The ARN of the Pipeline.
     */
    override fun pipelineArn(): String = unwrap(this).getPipelineArn()

    /**
     * The name of the Pipeline.
     */
    override fun pipelineName(): String = unwrap(this).getPipelineName()

    /**
     * The stack in which this resource is defined.
     */
    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.IPipeline): IPipeline
        = CdkObjectWrappers.wrap(cdkObject) as? IPipeline ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: IPipeline): software.amazon.awscdk.services.codepipeline.IPipeline
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.codepipeline.IPipeline
  }
}
