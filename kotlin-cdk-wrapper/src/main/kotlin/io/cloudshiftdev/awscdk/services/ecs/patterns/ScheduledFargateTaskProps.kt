@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import io.cloudshiftdev.awscdk.services.ecs.FargateTaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.ecs.RuntimePlatform
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ScheduledFargateTaskProps : ScheduledTaskBaseProps, FargateServiceBaseProps {
  public fun scheduledFargateTaskDefinitionOptions(): ScheduledFargateTaskDefinitionOptions? =
      unwrap(this).getScheduledFargateTaskDefinitionOptions()?.let(ScheduledFargateTaskDefinitionOptions::wrap)

  public fun scheduledFargateTaskImageOptions(): ScheduledFargateTaskImageOptions? =
      unwrap(this).getScheduledFargateTaskImageOptions()?.let(ScheduledFargateTaskImageOptions::wrap)

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
    @JvmName("fb9b409e094cc338c0855db34fd67d330cf5e428d2097c75b5162f1203f757ed")
    public fun runtimePlatform(runtimePlatform: RuntimePlatform.Builder.() -> Unit)

    public fun schedule(schedule: Schedule)

    public
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4b8368d7d1c43424a650d75c3b0b29013d2af0ecbff56a097ce3c399cbcfb75")
    public
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit)

    public
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81b1fdd27a1fea7ef778bd75eee825e6f095c18b725b6956bc6eb92aa9100b8")
    public
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions.Builder.() -> Unit)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cd45beba25bf56f80e402e71ad1a40d6c13aa72038afa762d6f2a147b9710b8")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: List<Tag>)

    public fun tags(vararg tags: Tag)

    public fun taskDefinition(taskDefinition: FargateTaskDefinition)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps.builder()

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
    @JvmName("fb9b409e094cc338c0855db34fd67d330cf5e428d2097c75b5162f1203f757ed")
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
    @JvmName("e4b8368d7d1c43424a650d75c3b0b29013d2af0ecbff56a097ce3c399cbcfb75")
    override
        fun scheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions: ScheduledFargateTaskDefinitionOptions.Builder.() -> Unit):
        Unit =
        scheduledFargateTaskDefinitionOptions(ScheduledFargateTaskDefinitionOptions(scheduledFargateTaskDefinitionOptions))

    override
        fun scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions: ScheduledFargateTaskImageOptions) {
      cdkBuilder.scheduledFargateTaskImageOptions(scheduledFargateTaskImageOptions.let(ScheduledFargateTaskImageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c81b1fdd27a1fea7ef778bd75eee825e6f095c18b725b6956bc6eb92aa9100b8")
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
    @JvmName("9cd45beba25bf56f80e402e71ad1a40d6c13aa72038afa762d6f2a147b9710b8")
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

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps,
  ) : CdkObject(cdkObject), ScheduledFargateTaskProps {
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    override fun cpu(): Number? = unwrap(this).getCpu()

    override fun desiredTaskCount(): Number? = unwrap(this).getDesiredTaskCount()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun ephemeralStorageGiB(): Number? = unwrap(this).getEphemeralStorageGiB()

    override fun memoryLimitMiB(): Number? = unwrap(this).getMemoryLimitMiB()

    override fun platformVersion(): FargatePlatformVersion? =
        unwrap(this).getPlatformVersion()?.let(FargatePlatformVersion::wrap)

    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun runtimePlatform(): RuntimePlatform? =
        unwrap(this).getRuntimePlatform()?.let(RuntimePlatform::wrap)

    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    override fun scheduledFargateTaskDefinitionOptions(): ScheduledFargateTaskDefinitionOptions? =
        unwrap(this).getScheduledFargateTaskDefinitionOptions()?.let(ScheduledFargateTaskDefinitionOptions::wrap)

    override fun scheduledFargateTaskImageOptions(): ScheduledFargateTaskImageOptions? =
        unwrap(this).getScheduledFargateTaskImageOptions()?.let(ScheduledFargateTaskImageOptions::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    override fun taskDefinition(): FargateTaskDefinition? =
        unwrap(this).getTaskDefinition()?.let(FargateTaskDefinition::wrap)

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledFargateTaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps):
        ScheduledFargateTaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledFargateTaskProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.patterns.ScheduledFargateTaskProps
  }
}
