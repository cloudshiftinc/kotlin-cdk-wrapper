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
 * Secret secret;
 * SecurityGroup securityGroup;
 * ServerlessClusterAttributes serverlessClusterAttributes = ServerlessClusterAttributes.builder()
 * .clusterIdentifier("clusterIdentifier")
 * // the properties below are optional
 * .clusterEndpointAddress("clusterEndpointAddress")
 * .port(123)
 * .readerEndpointAddress("readerEndpointAddress")
 * .secret(secret)
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
public interface ServerlessClusterAttributes {
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
   * Default: - no secret
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
   * A builder for [ServerlessClusterAttributes]
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
    private val cdkBuilder: software.amazon.awscdk.services.rds.ServerlessClusterAttributes.Builder
        = software.amazon.awscdk.services.rds.ServerlessClusterAttributes.builder()

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
      cdkBuilder.secret(secret.let(ISecret.Companion::unwrap))
    }

    /**
     * @param securityGroups The security groups of the database cluster.
     */
    override fun securityGroups(securityGroups: List<ISecurityGroup>) {
      cdkBuilder.securityGroups(securityGroups.map(ISecurityGroup.Companion::unwrap))
    }

    /**
     * @param securityGroups The security groups of the database cluster.
     */
    override fun securityGroups(vararg securityGroups: ISecurityGroup): Unit =
        securityGroups(securityGroups.toList())

    public fun build(): software.amazon.awscdk.services.rds.ServerlessClusterAttributes =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterAttributes,
  ) : CdkObject(cdkObject),
      ServerlessClusterAttributes {
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
     * Default: - no secret
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
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerlessClusterAttributes {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ServerlessClusterAttributes):
        ServerlessClusterAttributes = CdkObjectWrappers.wrap(cdkObject) as?
        ServerlessClusterAttributes ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerlessClusterAttributes):
        software.amazon.awscdk.services.rds.ServerlessClusterAttributes = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.ServerlessClusterAttributes
  }
}
