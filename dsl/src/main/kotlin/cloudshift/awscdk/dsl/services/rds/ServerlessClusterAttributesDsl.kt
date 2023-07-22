@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.rds.ServerlessClusterAttributes
import software.amazon.awscdk.services.secretsmanager.ISecret

@CdkDslMarker
public class ServerlessClusterAttributesDsl {
  private val cdkBuilder: ServerlessClusterAttributes.Builder =
      ServerlessClusterAttributes.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  /**
   * @param clusterEndpointAddress Cluster endpoint address.
   */
  public fun clusterEndpointAddress(clusterEndpointAddress: String) {
    cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
  }

  /**
   * @param clusterIdentifier Identifier for the cluster. 
   */
  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  /**
   * @param port The database port.
   */
  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  /**
   * @param readerEndpointAddress Reader endpoint address.
   */
  public fun readerEndpointAddress(readerEndpointAddress: String) {
    cdkBuilder.readerEndpointAddress(readerEndpointAddress)
  }

  /**
   * @param secret The secret attached to the database cluster.
   */
  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  /**
   * @param securityGroups The security groups of the database cluster.
   */
  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  /**
   * @param securityGroups The security groups of the database cluster.
   */
  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): ServerlessClusterAttributes {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
