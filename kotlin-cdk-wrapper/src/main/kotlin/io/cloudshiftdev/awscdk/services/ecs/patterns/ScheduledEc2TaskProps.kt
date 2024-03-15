@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs.patterns

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.applicationautoscaling.Schedule
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.ec2.SubnetSelection
import io.cloudshiftdev.awscdk.services.ecs.ICluster
import io.cloudshiftdev.awscdk.services.ecs.PropagatedTagSource
import io.cloudshiftdev.awscdk.services.events.targets.Tag
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ScheduledEc2TaskProps : ScheduledTaskBaseProps {
  public fun scheduledEc2TaskDefinitionOptions(): ScheduledEc2TaskDefinitionOptions? =
      unwrap(this).getScheduledEc2TaskDefinitionOptions()?.let(ScheduledEc2TaskDefinitionOptions::wrap)

  public fun scheduledEc2TaskImageOptions(): ScheduledEc2TaskImageOptions? =
      unwrap(this).getScheduledEc2TaskImageOptions()?.let(ScheduledEc2TaskImageOptions::wrap)

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
    @JvmName("394df8e1c8ae483a0f581448b4a3cfe8abe46404868e089be0b61895833c7928")
    public
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit)

    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31667dda61e845f0b3db35e0926c1b8d0b89885624a3af214315a493cbab1775")
    public
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions.Builder.() -> Unit)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    public fun securityGroups(vararg securityGroups: ISecurityGroup)

    public fun subnetSelection(subnetSelection: SubnetSelection)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3866c2d7ab96f4b4e2c33b311458bc2a3823ce39c78dc68525fb5f321b885486")
    public fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit)

    public fun tags(tags: List<Tag>)

    public fun tags(vararg tags: Tag)

    public fun vpc(vpc: IVpc)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps.Builder =
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps.builder()

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
    @JvmName("394df8e1c8ae483a0f581448b4a3cfe8abe46404868e089be0b61895833c7928")
    override
        fun scheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions: ScheduledEc2TaskDefinitionOptions.Builder.() -> Unit):
        Unit =
        scheduledEc2TaskDefinitionOptions(ScheduledEc2TaskDefinitionOptions(scheduledEc2TaskDefinitionOptions))

    override
        fun scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions: ScheduledEc2TaskImageOptions) {
      cdkBuilder.scheduledEc2TaskImageOptions(scheduledEc2TaskImageOptions.let(ScheduledEc2TaskImageOptions::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("31667dda61e845f0b3db35e0926c1b8d0b89885624a3af214315a493cbab1775")
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
    @JvmName("3866c2d7ab96f4b4e2c33b311458bc2a3823ce39c78dc68525fb5f321b885486")
    override fun subnetSelection(subnetSelection: SubnetSelection.Builder.() -> Unit): Unit =
        subnetSelection(SubnetSelection(subnetSelection))

    override fun tags(tags: List<Tag>) {
      cdkBuilder.tags(tags.map(Tag::unwrap))
    }

    override fun tags(vararg tags: Tag): Unit = tags(tags.toList())

    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps,
  ) : CdkObject(cdkObject), ScheduledEc2TaskProps {
    override fun cluster(): ICluster? = unwrap(this).getCluster()?.let(ICluster::wrap)

    override fun desiredTaskCount(): Number? = unwrap(this).getDesiredTaskCount()

    override fun enabled(): Boolean? = unwrap(this).getEnabled()

    override fun propagateTags(): PropagatedTagSource? =
        unwrap(this).getPropagateTags()?.let(PropagatedTagSource::wrap)

    override fun ruleName(): String? = unwrap(this).getRuleName()

    override fun schedule(): Schedule = unwrap(this).getSchedule().let(Schedule::wrap)

    override fun scheduledEc2TaskDefinitionOptions(): ScheduledEc2TaskDefinitionOptions? =
        unwrap(this).getScheduledEc2TaskDefinitionOptions()?.let(ScheduledEc2TaskDefinitionOptions::wrap)

    override fun scheduledEc2TaskImageOptions(): ScheduledEc2TaskImageOptions? =
        unwrap(this).getScheduledEc2TaskImageOptions()?.let(ScheduledEc2TaskImageOptions::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    override fun subnetSelection(): SubnetSelection? =
        unwrap(this).getSubnetSelection()?.let(SubnetSelection::wrap)

    override fun tags(): List<Tag> = unwrap(this).getTags()?.map(Tag::wrap) ?: emptyList()

    override fun vpc(): IVpc? = unwrap(this).getVpc()?.let(IVpc::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ScheduledEc2TaskProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps):
        ScheduledEc2TaskProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ScheduledEc2TaskProps):
        software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ecs.patterns.ScheduledEc2TaskProps
  }
}
