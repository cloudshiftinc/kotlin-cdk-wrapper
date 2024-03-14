package io.cloudshiftdev.awscdk.services.docdb

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface DatabaseClusterAttributes {
  /**
   * Cluster endpoint address.
   *
   * Default: - no cluster endpoint address
   */
  public fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

  /**
   * Identifier for the cluster.
   */
  public fun clusterIdentifier(): String

  /**
   * Endpoint addresses of individual instances.
   *
   * Default: - no instance endpoint addresses
   */
  public fun instanceEndpointAddresses(): List<String> = unwrap(this).getInstanceEndpointAddresses()
      ?: emptyList()

  /**
   * Identifier for the instances.
   *
   * Default: - no instance identifiers
   */
  public fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
      emptyList()

  /**
   * The database port.
   *
   * Default: - none
   */
  public fun port(): Number? = unwrap(this).getPort()

  /**
   * Reader endpoint address.
   *
   * Default: - no reader endpoint address
   */
  public fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

  /**
   * The security group of the database cluster.
   *
   * Default: - no security groups
   */
  public fun securityGroup(): ISecurityGroup? =
      unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)

  /**
   * A builder for [DatabaseClusterAttributes]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterEndpointAddress Cluster endpoint address.
     */
    public fun clusterEndpointAddress(clusterEndpointAddress: String)

    /**
     * @param clusterIdentifier Identifier for the cluster. 
     */
    public fun clusterIdentifier(clusterIdentifier: String)

    /**
     * @param instanceEndpointAddresses Endpoint addresses of individual instances.
     */
    public fun instanceEndpointAddresses(instanceEndpointAddresses: List<String>)

    /**
     * @param instanceEndpointAddresses Endpoint addresses of individual instances.
     */
    public fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String)

    /**
     * @param instanceIdentifiers Identifier for the instances.
     */
    public fun instanceIdentifiers(instanceIdentifiers: List<String>)

    /**
     * @param instanceIdentifiers Identifier for the instances.
     */
    public fun instanceIdentifiers(vararg instanceIdentifiers: String)

    /**
     * @param port The database port.
     */
    public fun port(port: Number)

    /**
     * @param readerEndpointAddress Reader endpoint address.
     */
    public fun readerEndpointAddress(readerEndpointAddress: String)

    /**
     * @param securityGroup The security group of the database cluster.
     */
    public fun securityGroup(securityGroup: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.docdb.DatabaseClusterAttributes.Builder
        = software.amazon.awscdk.services.docdb.DatabaseClusterAttributes.builder()

    /**
     * @param clusterEndpointAddress Cluster endpoint address.
     */
    override fun clusterEndpointAddress(clusterEndpointAddress: String) {
      cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
    }

    /**
     * @param clusterIdentifier Identifier for the cluster. 
     */
    override fun clusterIdentifier(clusterIdentifier: String) {
      cdkBuilder.clusterIdentifier(clusterIdentifier)
    }

    /**
     * @param instanceEndpointAddresses Endpoint addresses of individual instances.
     */
    override fun instanceEndpointAddresses(instanceEndpointAddresses: List<String>) {
      cdkBuilder.instanceEndpointAddresses(instanceEndpointAddresses)
    }

    /**
     * @param instanceEndpointAddresses Endpoint addresses of individual instances.
     */
    override fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String): Unit =
        instanceEndpointAddresses(instanceEndpointAddresses.toList())

    /**
     * @param instanceIdentifiers Identifier for the instances.
     */
    override fun instanceIdentifiers(instanceIdentifiers: List<String>) {
      cdkBuilder.instanceIdentifiers(instanceIdentifiers)
    }

    /**
     * @param instanceIdentifiers Identifier for the instances.
     */
    override fun instanceIdentifiers(vararg instanceIdentifiers: String): Unit =
        instanceIdentifiers(instanceIdentifiers.toList())

    /**
     * @param port The database port.
     */
    override fun port(port: Number) {
      cdkBuilder.port(port)
    }

    /**
     * @param readerEndpointAddress Reader endpoint address.
     */
    override fun readerEndpointAddress(readerEndpointAddress: String) {
      cdkBuilder.readerEndpointAddress(readerEndpointAddress)
    }

    /**
     * @param securityGroup The security group of the database cluster.
     */
    override fun securityGroup(securityGroup: ISecurityGroup) {
      cdkBuilder.securityGroup(securityGroup.let(ISecurityGroup::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.docdb.DatabaseClusterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterAttributes,
  ) : DatabaseClusterAttributes {
    /**
     * Cluster endpoint address.
     *
     * Default: - no cluster endpoint address
     */
    override fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

    /**
     * Identifier for the cluster.
     */
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    /**
     * Endpoint addresses of individual instances.
     *
     * Default: - no instance endpoint addresses
     */
    override fun instanceEndpointAddresses(): List<String> =
        unwrap(this).getInstanceEndpointAddresses() ?: emptyList()

    /**
     * Identifier for the instances.
     *
     * Default: - no instance identifiers
     */
    override fun instanceIdentifiers(): List<String> = unwrap(this).getInstanceIdentifiers() ?:
        emptyList()

    /**
     * The database port.
     *
     * Default: - none
     */
    override fun port(): Number? = unwrap(this).getPort()

    /**
     * Reader endpoint address.
     *
     * Default: - no reader endpoint address
     */
    override fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

    /**
     * The security group of the database cluster.
     *
     * Default: - no security groups
     */
    override fun securityGroup(): ISecurityGroup? =
        unwrap(this).getSecurityGroup()?.let(ISecurityGroup::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.docdb.DatabaseClusterAttributes):
        DatabaseClusterAttributes = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterAttributes):
        software.amazon.awscdk.services.docdb.DatabaseClusterAttributes = (wrapped as
        Wrapper).cdkObject
  }
}
