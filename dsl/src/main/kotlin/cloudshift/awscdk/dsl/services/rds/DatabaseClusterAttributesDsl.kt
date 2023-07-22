@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.rds.DatabaseClusterAttributes
import software.amazon.awscdk.services.rds.IClusterEngine

/**
 * Properties that describe an existing cluster instance.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.rds.*;
 * IClusterEngine clusterEngine;
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
 * .securityGroups(List.of(securityGroup))
 * .build();
 * ```
 */
@CdkDslMarker
public class DatabaseClusterAttributesDsl {
  private val cdkBuilder: DatabaseClusterAttributes.Builder = DatabaseClusterAttributes.builder()

  private val _instanceEndpointAddresses: MutableList<String> = mutableListOf()

  private val _instanceIdentifiers: MutableList<String> = mutableListOf()

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
   * @param clusterResourceIdentifier The immutable identifier for the cluster; for example:
   * cluster-ABCD1234EFGH5678IJKL90MNOP.
   * This AWS Region-unique identifier is used to grant access to the cluster.
   */
  public fun clusterResourceIdentifier(clusterResourceIdentifier: String) {
    cdkBuilder.clusterResourceIdentifier(clusterResourceIdentifier)
  }

  /**
   * @param engine The engine of the existing Cluster.
   */
  public fun engine(engine: IClusterEngine) {
    cdkBuilder.engine(engine)
  }

  /**
   * @param instanceEndpointAddresses Endpoint addresses of individual instances.
   */
  public fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String) {
    _instanceEndpointAddresses.addAll(listOf(*instanceEndpointAddresses))
  }

  /**
   * @param instanceEndpointAddresses Endpoint addresses of individual instances.
   */
  public fun instanceEndpointAddresses(instanceEndpointAddresses: Collection<String>) {
    _instanceEndpointAddresses.addAll(instanceEndpointAddresses)
  }

  /**
   * @param instanceIdentifiers Identifier for the instances.
   */
  public fun instanceIdentifiers(vararg instanceIdentifiers: String) {
    _instanceIdentifiers.addAll(listOf(*instanceIdentifiers))
  }

  /**
   * @param instanceIdentifiers Identifier for the instances.
   */
  public fun instanceIdentifiers(instanceIdentifiers: Collection<String>) {
    _instanceIdentifiers.addAll(instanceIdentifiers)
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

  public fun build(): DatabaseClusterAttributes {
    if(_instanceEndpointAddresses.isNotEmpty())
        cdkBuilder.instanceEndpointAddresses(_instanceEndpointAddresses)
    if(_instanceIdentifiers.isNotEmpty()) cdkBuilder.instanceIdentifiers(_instanceIdentifiers)
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
