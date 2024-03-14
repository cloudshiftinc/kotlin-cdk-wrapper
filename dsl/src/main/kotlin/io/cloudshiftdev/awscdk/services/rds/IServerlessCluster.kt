package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.constructs.Node
import kotlin.String

public interface IServerlessCluster : IResource, IConnectable, ISecretAttachmentTarget {
  public fun clusterArn(): String

  public fun clusterEndpoint(): Endpoint

  public fun clusterIdentifier(): String

  public fun clusterReadEndpoint(): Endpoint

  public fun grantDataApiAccess(arg0: IGrantable): Grant

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.IServerlessCluster,
  ) : IServerlessCluster {
    public override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    public override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    public override fun clusterArn(): String = unwrap(this).getClusterArn()

    public override fun clusterEndpoint(): Endpoint =
        unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

    public override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    public override fun clusterReadEndpoint(): Endpoint =
        unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

    public override fun connections(): Connections =
        unwrap(this).getConnections().let(Connections::wrap)

    public override fun env(): ResourceEnvironment =
        unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    public override fun grantDataApiAccess(arg0: IGrantable): Grant =
        unwrap(this).grantDataApiAccess(arg0.let(IGrantable::unwrap)).let(Grant::wrap)

    public override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    public override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.IServerlessCluster):
        IServerlessCluster = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IServerlessCluster):
        software.amazon.awscdk.services.rds.IServerlessCluster = (wrapped as Wrapper).cdkObject
  }
}
