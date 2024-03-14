package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DatabaseClusterAttributes {
  public fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

  public fun clusterIdentifier(): String

  public fun clusterResourceIdentifier(): String? = unwrap(this).getClusterResourceIdentifier()

  public fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

  public fun instanceEndpointAddresses(): List<String> = unwrap(this).getInstanceEndpointAddresses()
      ?: emptyList()

  public fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
      emptyList()

  public fun port(): Number? = unwrap(this).getPort()

  public fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

  public interface Builder {
    public fun clusterEndpointAddress(clusterEndpointAddress: String)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun clusterResourceIdentifier(clusterResourceIdentifier: String)

    public fun engine(engine: IClusterEngine)

    public fun instanceEndpointAddresses(instanceEndpointAddresses: List<String>)

    public fun instanceIdentifiers(instanceIdentifiers: List<String>)

    public fun port(port: Number)

    public fun readerEndpointAddress(readerEndpointAddress: String)

    public fun securityGroups(securityGroups: List<ISecurityGroup>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseClusterAttributes.Builder =
        software.amazon.awscdk.services.rds.DatabaseClusterAttributes.builder()

    override fun clusterEndpointAddress(clusterEndpointAddress: String) {
      cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun clusterResourceIdentifier(clusterResourceIdentifier: String) {
      cdkBuilder.clusterResourceIdentifier(clusterResourceIdentifier)
    }

    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
    }

    override fun instanceEndpointAddresses(instanceEndpointAddresses: List<String>) {
      cdkBuilder.instanceEndpointAddresses(instanceEndpointAddresses)
    }

    override fun instanceIdentifiers(instanceIdentifiers: List<String>) {
      cdkBuilder.instanceIdentifiers(instanceIdentifiers)
    }

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun readerEndpointAddress(readerEndpointAddress: String) {
      cdkBuilder.readerEndpointAddress(readerEndpointAddress)
    }

    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.rds.DatabaseClusterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterAttributes,
  ) : DatabaseClusterAttributes {
    override fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    override fun clusterResourceIdentifier(): String? = unwrap(this).getClusterResourceIdentifier()

    override fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

    override fun instanceEndpointAddresses(): List<String> =
        unwrap(this).getInstanceEndpointAddresses() ?: emptyList()

    override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
        emptyList()

    override fun port(): Number? = unwrap(this).getPort()

    override fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterAttributes):
        DatabaseClusterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterAttributes):
        software.amazon.awscdk.services.rds.DatabaseClusterAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
