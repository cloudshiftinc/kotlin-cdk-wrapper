package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.autoscaling.IAutoScalingGroup
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.servicediscovery.INamespace
import io.cloudshiftdev.constructs.Node
import kotlin.Boolean
import kotlin.String

public interface ICluster : IResource {
  public fun autoscalingGroup(): IAutoScalingGroup? =
      unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

  public fun clusterArn(): String

  public fun clusterName(): String

  public fun connections(): Connections

  public fun defaultCloudMapNamespace(): INamespace? =
      unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

  public fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
      unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

  public fun hasEc2Capacity(): Boolean

  public fun vpc(): IVpc

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.ecs.ICluster,
  ) : ICluster {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun autoscalingGroup(): IAutoScalingGroup? =
        unwrap(this).getAutoscalingGroup()?.let(IAutoScalingGroup::wrap)

    override fun clusterArn(): String = unwrap(this).getClusterArn()

    override fun clusterName(): String = unwrap(this).getClusterName()

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun defaultCloudMapNamespace(): INamespace? =
        unwrap(this).getDefaultCloudMapNamespace()?.let(INamespace::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun executeCommandConfiguration(): ExecuteCommandConfiguration? =
        unwrap(this).getExecuteCommandConfiguration()?.let(ExecuteCommandConfiguration::wrap)

    override fun hasEc2Capacity(): Boolean = unwrap(this).getHasEc2Capacity()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)

    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.ICluster): ICluster =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: ICluster): software.amazon.awscdk.services.ecs.ICluster = (wrapped
        as Wrapper).cdkObject
  }
}
