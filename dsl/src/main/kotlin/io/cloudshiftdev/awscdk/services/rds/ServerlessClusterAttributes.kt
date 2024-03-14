package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface ServerlessClusterAttributes {
  public fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

  public fun clusterIdentifier(): String

  public fun port(): Number? = unwrap(this).getPort()

  public fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

  public fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public interface Builder {
    public fun clusterEndpointAddress(clusterEndpointAddress: String)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun port(port: Number)

    public fun readerEndpointAddress(readerEndpointAddress: String)

    public fun secret(secret: ISecret)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ServerlessClusterAttributes.Builder
        = software.amazon.awscdk.services.rds.ServerlessClusterAttributes.builder()

    override fun clusterEndpointAddress(clusterEndpointAddress: String) {
      cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun readerEndpointAddress(readerEndpointAddress: String) {
      cdkBuilder.readerEndpointAddress(readerEndpointAddress)
    }

    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.ServerlessClusterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterAttributes,
  ) : ServerlessClusterAttributes {
    override fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    override fun port(): Number? = unwrap(this).getPort()

    override fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

    override fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterAttributes):
        ServerlessClusterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerlessClusterAttributes):
        software.amazon.awscdk.services.rds.ServerlessClusterAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
