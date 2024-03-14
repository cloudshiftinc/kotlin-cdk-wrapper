package io.cloudshiftdev.awscdk.services.codepipeline

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRule
import io.cloudshiftdev.awscdk.services.codestarnotifications.INotificationRuleTarget
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleOptions
import io.cloudshiftdev.awscdk.services.codestarnotifications.NotificationRuleSourceConfig
import io.cloudshiftdev.awscdk.services.events.OnEventOptions
import io.cloudshiftdev.awscdk.services.events.Rule
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.iam.PolicyStatement
import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class Pipeline internal constructor(
  private val cdkObject: software.amazon.awscdk.services.codepipeline.Pipeline,
) : Resource(cdkObject), IPipeline {
  public open fun addStage(props: StageOptions): IStage =
      unwrap(this).addStage(props.let(StageOptions::unwrap)).let(IStage::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d746d7793c10e92694911ff00b31e983ce4a71b3e189225ee06635618e54ee99")
  public open fun addStage(props: StageOptions.Builder.() -> Unit): IStage =
      addStage(StageOptions(props))

  public open fun addToRolePolicy(statement: PolicyStatement) {
    unwrap(this).addToRolePolicy(statement.let(PolicyStatement::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ccef0414b9292b425848f90820fb8748386b8cf1c85b1012acc59056410c2329")
  public open fun addToRolePolicy(statement: PolicyStatement.Builder.() -> Unit): Unit =
      addToRolePolicy(PolicyStatement(statement))

  public open fun addTrigger(props: TriggerProps): Trigger =
      unwrap(this).addTrigger(props.let(TriggerProps::unwrap)).let(Trigger::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("90c387d98e77db28e68b17d9c53833e02abe9083fd650da6af68cc487f096e43")
  public open fun addTrigger(props: TriggerProps.Builder.() -> Unit): Trigger =
      addTrigger(TriggerProps(props))

  public open fun addVariable(variable: Variable): Variable =
      unwrap(this).addVariable(variable.let(Variable::unwrap)).let(Variable::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2d89729de9fe01a92c214a6f435ad98428130e77943cbe1c6ef54a2c762b8c62")
  public open fun addVariable(variable: Variable.Builder.() -> Unit): Variable =
      addVariable(Variable(variable))

  public open fun artifactBucket(): IBucket = unwrap(this).getArtifactBucket().let(IBucket::wrap)

  public override fun bindAsNotificationRuleSource(_scope: CloudshiftdevConstructsConstruct):
      NotificationRuleSourceConfig =
      unwrap(this).bindAsNotificationRuleSource(_scope.let(CloudshiftdevConstructsConstruct::unwrap)).let(NotificationRuleSourceConfig::wrap)

  public open fun crossRegionSupport(): Map<String, CrossRegionSupport> =
      unwrap(this).getCrossRegionSupport().mapValues { CrossRegionSupport.wrap(it.value)} ?:
      emptyMap()

  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: PipelineNotifyOnOptions,
  ): INotificationRule = unwrap(this).notifyOn(id, target.let(INotificationRuleTarget::unwrap),
      options.let(PipelineNotifyOnOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("802e79d0a19fb60a123ba5d2a95f474d31780c23201b1ff29c431fd17d6a7d12")
  public override fun notifyOn(
    id: String,
    target: INotificationRuleTarget,
    options: PipelineNotifyOnOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOn(id, target, PipelineNotifyOnOptions(options))

  public override fun notifyOnAnyActionStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnAnyActionStateChange(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnAnyActionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnAnyActionStateChange(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("11ac33b7899456d98c0e8413c5ecfbb4f8332d6e26cd7827148420c235e95215")
  public override fun notifyOnAnyActionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnAnyActionStateChange(id, target, NotificationRuleOptions(options))

  public override fun notifyOnAnyManualApprovalStateChange(id: String,
      target: INotificationRuleTarget): INotificationRule =
      unwrap(this).notifyOnAnyManualApprovalStateChange(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnAnyManualApprovalStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnAnyManualApprovalStateChange(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("10713caf6597b23ffa1ea821ac0383066a8adc80d9d8673c7888936bd6188ae9")
  public override fun notifyOnAnyManualApprovalStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnAnyManualApprovalStateChange(id, target,
      NotificationRuleOptions(options))

  public override fun notifyOnAnyStageStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnAnyStageStateChange(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnAnyStageStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnAnyStageStateChange(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("95ca28a7a850434fd61ebbdf04c624d6be0ced4e688a3beab746211fa10c0e4c")
  public override fun notifyOnAnyStageStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnAnyStageStateChange(id, target, NotificationRuleOptions(options))

  public override fun notifyOnExecutionStateChange(id: String, target: INotificationRuleTarget):
      INotificationRule = unwrap(this).notifyOnExecutionStateChange(id,
      target.let(INotificationRuleTarget::unwrap)).let(INotificationRule::wrap)

  public override fun notifyOnExecutionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions,
  ): INotificationRule = unwrap(this).notifyOnExecutionStateChange(id,
      target.let(INotificationRuleTarget::unwrap),
      options.let(NotificationRuleOptions::unwrap)).let(INotificationRule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("29f3724b89990617eca228394912da43fc34ad8f0843b7e906964ad64fdd522c")
  public override fun notifyOnExecutionStateChange(
    id: String,
    target: INotificationRuleTarget,
    options: NotificationRuleOptions.Builder.() -> Unit,
  ): INotificationRule = notifyOnExecutionStateChange(id, target, NotificationRuleOptions(options))

  public override fun onEvent(id: String): Rule = unwrap(this).onEvent(id).let(Rule::wrap)

  public override fun onEvent(id: String, options: OnEventOptions): Rule = unwrap(this).onEvent(id,
      options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dc6b56ca17cf70d5df4c4cb59d88b17086787e6d21187ab337b8006053ced50b")
  public override fun onEvent(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onEvent(id, OnEventOptions(options))

  public override fun onStateChange(id: String): Rule =
      unwrap(this).onStateChange(id).let(Rule::wrap)

  public override fun onStateChange(id: String, options: OnEventOptions): Rule =
      unwrap(this).onStateChange(id, options.let(OnEventOptions::unwrap)).let(Rule::wrap)

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0c69fabe5fddba46daf5b555fe60da991e1b493c6809b40e0e9a1e19ce52aea1")
  public override fun onStateChange(id: String, options: OnEventOptions.Builder.() -> Unit): Rule =
      onStateChange(id, OnEventOptions(options))

  public override fun pipelineArn(): String = unwrap(this).getPipelineArn()

  public override fun pipelineName(): String = unwrap(this).getPipelineName()

  public open fun pipelineVersion(): String = unwrap(this).getPipelineVersion()

  public open fun role(): IRole = unwrap(this).getRole().let(IRole::wrap)

  public open fun stage(stageName: String): IStage = unwrap(this).stage(stageName).let(IStage::wrap)

  public open fun stageCount(): Number = unwrap(this).getStageCount()

  public open fun stages(): List<IStage> = unwrap(this).getStages().map(IStage::wrap)

  public interface Builder {
    public fun artifactBucket(artifactBucket: IBucket) {
    }

    public fun crossAccountKeys(crossAccountKeys: Boolean) {
    }

    public fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
    }

    public fun enableKeyRotation(enableKeyRotation: Boolean) {
    }

    public fun executionMode(executionMode: ExecutionMode) {
    }

    public fun pipelineName(pipelineName: String) {
    }

    public fun pipelineType(pipelineType: PipelineType) {
    }

    public fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
    }

    public fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
    }

    public fun role(role: IRole) {
    }

    public fun stages(stages: List<StageProps>) {
    }

    public fun triggers(triggers: List<TriggerProps>) {
    }

    public fun variables(variables: List<Variable>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codepipeline.Pipeline.Builder =
        software.amazon.awscdk.services.codepipeline.Pipeline.Builder.create(scope, id)

    public override fun artifactBucket(artifactBucket: IBucket) {
      cdkBuilder.artifactBucket(artifactBucket.let(IBucket::unwrap))
    }

    public override fun crossAccountKeys(crossAccountKeys: Boolean) {
      cdkBuilder.crossAccountKeys(crossAccountKeys)
    }

    public override
        fun crossRegionReplicationBuckets(crossRegionReplicationBuckets: Map<String, IBucket>) {
      cdkBuilder.crossRegionReplicationBuckets(crossRegionReplicationBuckets.mapValues {
          IBucket.unwrap(it.value)})
    }

    public override fun enableKeyRotation(enableKeyRotation: Boolean) {
      cdkBuilder.enableKeyRotation(enableKeyRotation)
    }

    public override fun executionMode(executionMode: ExecutionMode) {
      cdkBuilder.executionMode(executionMode.let(ExecutionMode::unwrap))
    }

    public override fun pipelineName(pipelineName: String) {
      cdkBuilder.pipelineName(pipelineName)
    }

    public override fun pipelineType(pipelineType: PipelineType) {
      cdkBuilder.pipelineType(pipelineType.let(PipelineType::unwrap))
    }

    public override fun restartExecutionOnUpdate(restartExecutionOnUpdate: Boolean) {
      cdkBuilder.restartExecutionOnUpdate(restartExecutionOnUpdate)
    }

    public override fun reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks: Boolean) {
      cdkBuilder.reuseCrossRegionSupportStacks(reuseCrossRegionSupportStacks)
    }

    public override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    public override fun stages(stages: List<StageProps>) {
      cdkBuilder.stages(stages.map(StageProps::unwrap))
    }

    public override fun triggers(triggers: List<TriggerProps>) {
      cdkBuilder.triggers(triggers.map(TriggerProps::unwrap))
    }

    public override fun variables(variables: List<Variable>) {
      cdkBuilder.variables(variables.map(Variable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.codepipeline.Pipeline = cdkBuilder.build()
  }

  public companion object {
    public open fun fromPipelineArn(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      pipelineArn: String,
    ): IPipeline =
        software.amazon.awscdk.services.codepipeline.Pipeline.fromPipelineArn(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, pipelineArn).let(IPipeline::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): Pipeline {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return Pipeline(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codepipeline.Pipeline): Pipeline =
        Pipeline(cdkObject)

    internal fun unwrap(wrapped: Pipeline): software.amazon.awscdk.services.codepipeline.Pipeline =
        wrapped.cdkObject
  }
}
