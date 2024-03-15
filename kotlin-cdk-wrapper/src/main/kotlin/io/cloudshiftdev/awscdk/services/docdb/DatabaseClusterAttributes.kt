@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DatabaseClusterAttributes {
  public fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

  public fun clusterIdentifier(): String

  public fun instanceEndpointAddresses(): List<String> = unwrap(this).getInstanceEndpointAddresses()
      ?: emptyList()

  public fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
      emptyList()

  public fun port(): Number? = unwrap(this).getPort()

  public fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun clusterEndpointAddress(clusterEndpointAddress: String)

    public fun clusterIdentifier(clusterIdentifier: String)

    public fun instanceEndpointAddresses(instanceEndpointAddresses: List<String>)

    public fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String)

    public fun instanceIdentifiers(instanceIdentifiers: List<String>)

    public fun instanceIdentifiers(vararg instanceIdentifiers: String)

    public fun port(port: Number)

    public fun readerEndpointAddress(readerEndpointAddress: String)

    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseClusterAttributes.Builder
        = software.amazon.awscdk.services.docdb.DatabaseClusterAttributes.builder()

    override fun clusterEndpointAddress(clusterEndpointAddress: String) {
      cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
    }

    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    override fun instanceEndpointAddresses(instanceEndpointAddresses: List<String>) {
      cdkBuilder.instanceEndpointAddresses(instanceEndpointAddresses)
    }

    override fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String): Unit =
        instanceEndpointAddresses(instanceEndpointAddresses.toList())

    override fun instanceIdentifiers(instanceIdentifiers: List<String>) {
      cdkBuilder.instanceIdentifiers(instanceIdentifiers)
    }

    override fun instanceIdentifiers(vararg instanceIdentifiers: String): Unit =
        instanceIdentifiers(instanceIdentifiers.toList())

    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    override fun readerEndpointAddress(readerEndpointAddress: String) {
      cdkBuilder.readerEndpointAddress(readerEndpointAddress)
    }

    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseClusterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterAttributes,
  ) : CdkObject(cdkObject), DatabaseClusterAttributes {
    override fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    override fun instanceEndpointAddresses(): List<String> =
        unwrap(this).getInstanceEndpointAddresses() ?: emptyList()

    override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
        emptyList()

    override fun port(): Number? = unwrap(this).getPort()

    override fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterAttributes):
        DatabaseClusterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterAttributes):
        software.amazon.awscdk.services.docdb.DatabaseClusterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.docdb.DatabaseClusterAttributes
  }
}
