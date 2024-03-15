@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.Ec2TaskDefinition
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
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

public open class ScheduledEc2Task internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task,
) : ScheduledTaskBase(cdkObject) {
  public open fun task(): EcsTask = unwrap(this).getTask().let(EcsTask::wrap)

  public open fun taskDefinition(): Ec2TaskDefinition =
      unwrap(this).getTaskDefinition().let(Ec2TaskDefinition::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun cluster(cluster: ICluster)

    public fun desiredTaskCount(desiredTaskCount: Number)

    public fun enabled(enabled: Boolean)

    public fun propagateTags(propagateTags: PropagatedTagSource)

    public fun ruleName(ruleName: String)

    public fun schedule(schedule: Schedule)

    public
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19234eeeeaf7c92d99fae6056ff1bdc8334d09f4d97bc9e71c4afbb743f228c1")
    public
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit)

    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6797958a33bd73206192c65a1051a6979562a3f816de1fa50dd6a37376513cbf")
    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions.Builder.() -> Unit)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6c095d78f456ca3c66fb168570b1caef9e29f550f04efbedb8ac8ca8704675b")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: List<Tag>)

    public fun tags(vararg tags: Tag)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task.Builder.create(scope, id)

    override fun cluster(cluster: ICluster) {
      cdkBuilder.cluster(cluster.let(ICluster::unwrap))
    }

    override fun desiredTaskCount(desiredTaskCount: Number) {
      cdkBuilder.desiredTaskCount(desiredTaskCount)
    }

    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    override fun propagateTags(propagateTags: PropagatedTagSource) {
      cdkBuilder.propagateTags(propagateTags.let(PropagatedTagSource::unwrap))
    }

    override fun ruleName(ruleName: String) {
      cdkBuilder.ruleName(ruleName)
    }

    override fun schedule(schedule: Schedule) {
      cdkBuilder.schedule(schedule.let(Schedule::unwrap))
    }

    override
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions) {
      cdkBuilder.scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions.let(ScheduledEc2TaskDefinitionOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("19234eeeeaf7c92d99fae6056ff1bdc8334d09f4d97bc9e71c4afbb743f228c1")
    override
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit):
        Unit =
        scheduledEc2TaskDefinitionOptions(ScheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions))

    override
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions) {
      cdkBuilder.scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions.let(ScheduledEc2TaskImageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6797958a33bd73206192c65a1051a6979562a3f816de1fa50dd6a37376513cbf")
    override
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions.Builder.() -> Unit):
        Unit =
        scheduledEc2TaskImageOptions(ScheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions))

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    override fun subnetSelection(subnetSelection: SubnetSelection) {
      cdkBuilder.subnetSelection(subnetSelection.let(SubnetSelection::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a6c095d78f456ca3c66fb168570b1caef9e29f550f04efbedb8ac8ca8704675b")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task =
        cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): ScheduledEc2Task {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return ScheduledEc2Task(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task):
        ScheduledEc2Task = ScheduledEc2Task(cdkObject)

    internal fun unwrap(wrapped: ScheduledEc2Task):
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2Task = wrapped.cdkObject
  }
}
