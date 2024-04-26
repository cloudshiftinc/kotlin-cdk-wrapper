@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.ISecurityGroup
import io.cloudshiftdev.awscdk.services.secretsmanager.ISecret
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties that describe an existing cluster instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * import io.cloudshiftdev.awscdk.services.rds.*;
 * import io.cloudshiftdev.awscdk.services.secretsmanager.*;
 * IClusterEngine clusterEngine;
 * Secret secret;
 * SecurityGroup securityGroup;
 * DatabaseClusterAttributes databaseClusterAttributes = DatabaseClusterAttributes.builder()
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .clusterEndpointAddress("clusterEndpointAddress")
 * .clusterResourceIdentifier("clusterResourceIdentifier")
 * .engine(clusterEngine)
 * .instanceEndpointAddresses(List.of("instanceEndpointAddresses"))
 * .instanceIdentifiers(List.of("instanceIdentifiers"))
 * .port(123)
 * .readerEndpointAddress("readerEndpointAddress")
 * .secret(secret)
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
public interface DatabaseClusterAttributes {
  /**
   * Cluster endpoint address.
   *
   * Default: - no endpoint address
   */
  public fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

  /**
   * Identifier for the cluster.
   */
  public fun clusterIdentifier(): String

  /**
   * The immutable identifier for the cluster; for example: cluster-ABCD1234EFGH5678IJKL90MNOP.
   *
   * This AWS Region-unique identifier is used to grant access to the cluster.
   *
   * Default: none
   */
  public fun clusterResourceIdentifier(): String? = unwrap(this).getClusterResourceIdentifier()

  /**
   * The engine of the existing Cluster.
   *
   * Default: - the imported Cluster's engine is unknown
   */
  public fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

  /**
   * Endpoint addresses of individual instances.
   *
   * Default: - no instance endpoints
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
   * Default: - no reader address
   */
  public fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

  /**
   * The secret attached to the database cluster.
   *
   * Default: - the imported Cluster's secret is unknown
   */
  public fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

  /**
   * The security groups of the database cluster.
   *
   * Default: - no security groups
   */
  public fun securityGroups(): List<ISecurityGroup> =
      unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()

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
     * @param clusterResourceIdentifier The immutable identifier for the cluster; for example:
     * cluster-ABCD1234EFGH5678IJKL90MNOP.
     * This AWS Region-unique identifier is used to grant access to the cluster.
     */
    public fun clusterResourceIdentifier(clusterResourceIdentifier: String)

    /**
     * @param engine The engine of the existing Cluster.
     */
    public fun engine(engine: IClusterEngine)

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
     * @param secret The secret attached to the database cluster.
     */
    public fun secret(secret: ISecret)

    /**
     * @param securityGroups The security groups of the database cluster.
     */
    public fun securityGroups(securityGroups: List<ISecurityGroup>)

    /**
     * @param securityGroups The security groups of the database cluster.
     */
    public fun securityGroups(vararg securityGroups: ISecurityGroup)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.DatabaseClusterAttributes.Builder =
        software.amazon.awscdk.services.rds.DatabaseClusterAttributes.builder()

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
     * @param clusterResourceIdentifier The immutable identifier for the cluster; for example:
     * cluster-ABCD1234EFGH5678IJKL90MNOP.
     * This AWS Region-unique identifier is used to grant access to the cluster.
     */
    override fun clusterResourceIdentifier(clusterResourceIdentifier: String) {
      cdkBuilder.clusterResourceIdentifier(clusterResourceIdentifier)
    }

    /**
     * @param engine The engine of the existing Cluster.
     */
    override fun engine(engine: IClusterEngine) {
      cdkBuilder.engine(engine.let(IClusterEngine::unwrap))
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
     * @param secret The secret attached to the database cluster.
     */
    override fun secret(secret: ISecret) {
      cdkBuilder.secret(secret.let(ISecret::unwrap))
    }

    /**
     * @param securityGroups The security groups of the database cluster.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup::unwrap))
    }

    /**
     * @param securityGroups The security groups of the database cluster.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.rds.DatabaseClusterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterAttributes,
  ) : CdkObject(cdkObject), DatabaseClusterAttributes {
    /**
     * Cluster endpoint address.
     *
     * Default: - no endpoint address
     */
    override fun clusterEndpointAddress(): String? = unwrap(this).getClusterEndpointAddress()

    /**
     * Identifier for the cluster.
     */
    override fun clusterIdentifier(): String = unwrap(this).getClusterIdentifier()

    /**
     * The immutable identifier for the cluster; for example: cluster-ABCD1234EFGH5678IJKL90MNOP.
     *
     * This AWS Region-unique identifier is used to grant access to the cluster.
     *
     * Default: none
     */
    override fun clusterResourceIdentifier(): String? = unwrap(this).getClusterResourceIdentifier()

    /**
     * The engine of the existing Cluster.
     *
     * Default: - the imported Cluster's engine is unknown
     */
    override fun engine(): IClusterEngine? = unwrap(this).getEngine()?.let(IClusterEngine::wrap)

    /**
     * Endpoint addresses of individual instances.
     *
     * Default: - no instance endpoints
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
     * Default: - no reader address
     */
    override fun readerEndpointAddress(): String? = unwrap(this).getReaderEndpointAddress()

    /**
     * The secret attached to the database cluster.
     *
     * Default: - the imported Cluster's secret is unknown
     */
    override fun secret(): ISecret? = unwrap(this).getSecret()?.let(ISecret::wrap)

    /**
     * The security groups of the database cluster.
     *
     * Default: - no security groups
     */
    override fun securityGroups(): List<ISecurityGroup> =
        unwrap(this).getSecurityGroups()?.map(ISecurityGroup::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.DatabaseClusterAttributes):
        DatabaseClusterAttributes = CdkObjectWrappers.wrap(cdkObject) as? DatabaseClusterAttributes
        ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: DatabaseClusterAttributes):
        software.amazon.awscdk.services.rds.DatabaseClusterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.DatabaseClusterAttributes
  }
}
