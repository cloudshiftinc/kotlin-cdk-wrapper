package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.IResource
import io.cloudshiftdev.awscdk.RemovalPolicy
import io.cloudshiftdev.awscdk.ResourceEnvironment
import io.cloudshiftdev.awscdk.Stack
import io.cloudshiftdev.awscdk.services.ec2.Connections
import io.cloudshiftdev.awscdk.services.ec2.IConnectable
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecretAttachmentTarget
import io.cloudshiftdev.awscdk.services.secretsmanager.SecretAttachmentTargetProps
import io.cloudshiftdev.constructs.Node
import kotlin.String
import kotlin.collections.List

public interface IDatabaseCluster : IResource, IConnectable, ISecretAttachmentTarget {
  public fun clusterEndpoint(): Endpoint

  public fun clusterIdentifier(): String

  public fun clusterReadEndpoint(): Endpoint

  public fun instanceEndpoints(): List<Endpoint>

  public fun instanceIdentifiers(): List<String>

  public fun securityGroupId(): String

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.docdb.IDatabaseCluster,
  ) : IDatabaseCluster {
    override fun applyRemovalPolicy(arg0: RemovalPolicy) {
      unwrap(this).applyRemovalPolicy(arg0.let(RemovalPolicy::unwrap))
    }

    override fun asSecretAttachmentTarget(): SecretAttachmentTargetProps =
        unwrap(this).asSecretAttachmentTarget().let(SecretAttachmentTargetProps::wrap)

    override fun clusterEndpoint(): Endpoint = unwrap(this).getClusterEndpoint().let(Endpoint::wrap)

    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    override fun clusterReadEndpoint(): Endpoint =
        unwrap(this).getClusterReadEndpoint().let(Endpoint::wrap)

    override fun connections(): Connections = unwrap(this).getConnections().let(Connections::wrap)

    override fun env(): ResourceEnvironment = unwrap(this).getEnv().let(ResourceEnvironment::wrap)

    override fun instanceEndpoints(): List<Endpoint> =
        unwrap(this).getInstanceEndpoints().map(Endpoint::wrap)

    override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers()

    override fun node(): Node = unwrap(this).getNode().let(Node::wrap)

    override fun securityGroupId(): String = unwrap(this).getSecurityGroupId()

    override fun stack(): Stack = unwrap(this).getStack().let(Stack::wrap)
  }

  public companion object {
    init {

    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.IDatabaseCluster):
        IDatabaseCluster = Wrapper(cdkObject)

    internal fun unwrap(wrapped: IDatabaseCluster):
        software.amazon.awscdk.services.docdb.IDatabaseCluster = (wrapped as Wrapper).cdkObject
  }
}
