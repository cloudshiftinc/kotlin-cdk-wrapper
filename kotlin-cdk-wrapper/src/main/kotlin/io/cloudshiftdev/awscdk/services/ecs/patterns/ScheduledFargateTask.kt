@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.events.targets.EcsTask
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class ScheduledFargateTask internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask,
) : ScheduledTaskBase(cdkObject) {
  public open fun task(): EcsTask = unwrap(this).getTask().let(EcsTask::wrap)

  public open fun taskDefinition(): FargateTaskDefinition =
      unwrap(this).getTaskDefinition().let(FargateTaskDefinition::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun cpu(cpu: Number)

    public fun desiredTaskCount(desiredTaskCount: Number)

    public fun enabled(enabled: Boolean)

    public fun ephemeralStorageGiB(ephemeralStorageGiB: Number)

    public fun memoryLimitMiB(memoryLimitMiB: Number)

    public fun platformVersion(platformVersion: FargatePlatformVersion)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun ruleName(ruleName: String)

    public fun runtimePlatform(runtimePlatform: RuntimePlatform)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b098b43d229d8c2df0e756ab55f1541cfe98de3beae8d737390d6182aaf447c7")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    public fun schedule(schedule: Schedule)

    public
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7151df2ca070e6cbad671c64a5bcba05af00515eae71a0f15cc3db0fe7308692")
    public
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit)

    public
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f80fd70647f97905513bf16e47224f8409b334224e87ed424380be8a5b9a227b")
    public
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions.Builder.() -> Unit)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a76d0f0225902f4fff257b6f9ac37d9c42d3fe22aae9d5222685488a6058927")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: List<Tag>)

    public fun tags(vararg tags: Tag)

    public fun taskDefinition(taskDefinition: FargateTaskDefinition)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask.Builder.create(scope, id)

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun cpu(cpu: Number) {
      cdkBuilder.cpu(cpu)
    }

    override fun desiredTaskCount(desiredTaskCount: Number) {
      cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun ephemeralStorageGiB(ephemeralStorageGiB: Number) {
      cdkBuilder.ephemeralStorageGiB(ephemeralStorageGiB)
    }

    override fun memoryLimitMiB(memoryLimitMiB: Number) {
      cdkBuilder.memoryLimitMiB(memoryLimitMiB)
    }

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun runtimePlatform(runtimePlatform: RuntimePlatform) {
      cdkBuilder.runtimePlatform(runtimePlatform.let(RuntimePlatform::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b098b43d229d8c2df0e756ab55f1541cfe98de3beae8d737390d6182aaf447c7")
    override fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit): Unit =
        runtimePlatform(RuntimePlatform(runtimePlatform))

    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    override
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions) {
      cdkBuilder.scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions.let(ScheduledFargateTaskDefinitionOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7151df2ca070e6cbad671c64a5bcba05af00515eae71a0f15cc3db0fe7308692")
    override
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit):
        Unit =
        scheduledFargateTaskDefinitionOptions(ScheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions))

    override
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions) {
      cdkBuilder.scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions.let(ScheduledFargateTaskImageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f80fd70647f97905513bf16e47224f8409b334224e87ed424380be8a5b9a227b")
    override
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions.Builder.() -> Unit):
        Unit =
        scheduledFargateTaskImageOptions(ScheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions))

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1a76d0f0225902f4fff257b6f9ac37d9c42d3fe22aae9d5222685488a6058927")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    override fun taskDefinition(taskDefinition: FargateTaskDefinition) {
      cdkBuilder.taskDefinition(taskDefinition.let(FargateTaskDefinition::unwrap))
    }

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScheduledFargateTask {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScheduledFargateTask(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask):
        ScheduledFargateTask = ScheduledFargateTask(cdkObject)

    internal fun unwrap(wrapped: ScheduledFargateTask):
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTask = wrapped.cdkObject
  }
}
