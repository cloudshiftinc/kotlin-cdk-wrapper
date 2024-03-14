package io.cloudshiftdev.awscdk.services.events.targets

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.ITaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.LaunchType
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.IRule
import io.cloudshiftdev.awscdk.services.events.IRuleTarget
import io.cloudshiftdev.awscdk.services.events.RuleTargetConfig
import io.cloudshiftdev.awscdk.services.iam.IRole
import io.cloudshiftdev.awscdk.services.sqs.IQueue
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public open class EcsTask internal constructor(
  private val cdkObject: software.amazon.awscdk.services.events.targets.EcsTask,
) : IRuleTarget {
  public override fun bind(_rule: IRule): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap)).let(RuleTargetConfig::wrap)

  public override fun bind(_rule: IRule, _id: String): RuleTargetConfig =
      unwrap(this).bind(_rule.let(IRule::unwrap), _id).let(RuleTargetConfig::wrap)

  public open fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public interface Builder {
    public fun assignPublicIp(assignPublicIp: Boolean)

    public fun cluster(cluster: ICluster)

    public fun containerOverrides(containerOverrides: List<ContainerOverride>)

    public fun containerOverrides(vararg containerOverrides: ContainerOverride)

    public fun deadLetterQueue(deadLetterQueue: IQueue)

    public fun enableExecuteCommand(enableExecuteCommand: Boolean)

    public fun launchType(launchType: LaunchType)

    public fun maxEventAge(maxEventAge: Duration)

    public fun platformVersion(platformVersion: FargatePlatformVersion)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun retryAttempts(retryAttempts: Number)

    public fun role(role: IRole)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0054ca9d3ff7caa7352474696ceec73e2cbea31199c76ebc26b86fdc9cc0475b")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: List<Tag>)

    public fun tags(vararg tags: Tag)

    public fun taskCount(taskCount: Number)

    public fun taskDefinition(taskDefinition: ITaskDefinition)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.events.targets.EcsTask.Builder =
        software.amazon.awscdk.services.events.targets.EcsTask.Builder.create()

    override fun assignPublicIp(assignPublicIp: Boolean) {
      cdkBuilder.assignPublicIp(assignPublicIp)
    }

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun containerOverrides(containerOverrides: List<ContainerOverride>) {
      cdkBuilder.containerOverrides(containerOverrides.map(ContainerOverride::unwrap))
    }

    override fun containerOverrides(vararg containerOverrides: ContainerOverride): Unit =
        containerOverrides(containerOverrides.toList())

    override fun deadLetterQueue(deadLetterQueue: IQueue) {
      cdkBuilder.deadLetterQueue(deadLetterQueue.let(IQueue::unwrap))
    }

    override fun enableExecuteCommand(enableExecuteCommand: Boolean) {
      cdkBuilder.enableExecuteCommand(enableExecuteCommand)
    }

    override fun launchType(launchType: LaunchType) {
      cdkBuilder.launchType(launchType.let(LaunchType::unwrap))
    }

    override fun maxEventAge(maxEventAge: Duration) {
      cdkBuilder.maxEventAge(maxEventAge.let(Duration::unwrap))
    }

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun retryAttempts(retryAttempts: Number) {
      cdkBuilder.retryAttempts(retryAttempts)
    }

    override fun role(role: IRole) {
      cdkBuilder.role(role.let(IRole::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("0054ca9d3ff7caa7352474696ceec73e2cbea31199c76ebc26b86fdc9cc0475b")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    override fun taskCount(taskCount: Number) {
      cdkBuilder.taskCount(taskCount)
    }

    override fun taskDefinition(taskDefinition: ITaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(ITaskDefinition::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.events.targets.EcsTask = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): EcsTask {
      val builderImpl = BuilderImpl()
      return EcsTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.events.targets.EcsTask): EcsTask =
        EcsTask(cdkObject)

    internal fun unwrap(wrapped: EcsTask): software.amazon.awscdk.services.events.targets.EcsTask =
        wrapped.cdkObject
  }
}
