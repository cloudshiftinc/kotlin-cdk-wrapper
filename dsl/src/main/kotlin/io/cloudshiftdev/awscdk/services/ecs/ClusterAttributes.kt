package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface ClusterAttributes {
  public fun autoscalingGroup(): IAutoScalingGroup? =
      unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

  public fun clusterArn(): String? = unwrap(this).getClusterArn()

  public fun clusterName(): String

  public fun defaultCloudMapNamespace(): INamespace? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

  public fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  public fun hasEc2Capacity(): Boolean? = unwrap(this).getHasEc2Capacity()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public fun vpc(): IVpc

  public interface Builder {
    public fun autoscalingGroup(autoscalingGroup: IAutoScalingGroup) {
    }

    public fun clusterArn(clusterArn: String) {
    }

    public fun clusterName(clusterName: String) {
    }

    public fun defaultCloudMapNamespace(defaultCloudMapNamespace: INamespace) {
    }

    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a88dfe25a9142021f2b4dc760e103f545a1f678448f8b00a7516fa7ca1c5aee")
    public
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit) {
    }

    public fun hasEc2Capacity(hasEc2Capacity: Boolean) {
    }

    public fun securityGroups(securityGroups: List<ISecurityGroup>) {
    }

    public fun vpc(vpc: IVpc) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.ClusterAttributes.Builder =
        software.amazon.awscdk.services.ecs.ClusterAttributes.builder()

    public override fun autoscalingGroup(autoscalingGroup: IAutoScalingGroup) {
      cdkBuilder.autoscalingGroup(autoscalingGroup.let(IAutoScalingGroup::unwrap))
    }

    public override fun clusterArn(clusterArn: String) {
      cdkBuilder.clusterArn(clusterArn)
    }

    public override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    public override fun defaultCloudMapNamespace(defaultCloudMapNamespace: INamespace) {
      cdkBuilder.defaultCloudMapNamespace(defaultCloudMapNamespace.let(INamespace::unwrap))
    }

    public override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration) {
      cdkBuilder.executeCommandConfiguration(executeCommandConfiguration.let(ExecuteCommandConfiguration::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6a88dfe25a9142021f2b4dc760e103f545a1f678448f8b00a7516fa7ca1c5aee")
    public override
        fun executeCommandConfiguration(executeCommandConfiguration: ExecuteCommandConfiguration.Builder.() -> Unit):
        Unit = executeCommandConfiguration(ExecuteCommandConfiguration(executeCommandConfiguration))

    public override fun hasEc2Capacity(hasEc2Capacity: Boolean) {
      cdkBuilder.hasEc2Capacity(hasEc2Capacity)
    }

    public override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.ecs.ClusterAttributes = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ClusterAttributes,
  ) : ClusterAttributes {
    public override fun autoscalingGroup(): IAutoScalingGroup? =
        unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

    public override fun clusterArn(): String? = unwrap(this).getClusterArn()

    public override fun clusterName(): String = unwrap(this).getClusterName()

    public override fun defaultCloudMapNamespace(): INamespace? =
        unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

    public override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
        unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

    public override fun hasEc2Capacity(): Boolean? = unwrap(this).getHasEc2Capacity()

    public override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

    public override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ClusterAttributes):
        ClusterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterAttributes):
        software.amazon.awscdk.services.ecs.ClusterAttributes = (wrapped as Wrapper).cdkObject
  }
}
