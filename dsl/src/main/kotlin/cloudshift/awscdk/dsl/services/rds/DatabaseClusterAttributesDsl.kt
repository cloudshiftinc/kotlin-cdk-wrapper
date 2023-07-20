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

@CdkDslMarker
public class DatabaseClusterAttributesDsl {
  private val cdkBuilder: DatabaseClusterAttributes.Builder = DatabaseClusterAttributes.builder()

  private val _instanceEndpointAddresses: MutableList<String> = mutableListOf()

  private val _instanceIdentifiers: MutableList<String> = mutableListOf()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun clusterEndpointAddress(clusterEndpointAddress: String) {
    cdkBuilder.clusterEndpointAddress(clusterEndpointAddress)
  }

  public fun clusterIdentifier(clusterIdentifier: String) {
    cdkBuilder.clusterIdentifier(clusterIdentifier)
  }

  public fun clusterResourceIdentifier(clusterResourceIdentifier: String) {
    cdkBuilder.clusterResourceIdentifier(clusterResourceIdentifier)
  }

  public fun engine(engine: IClusterEngine) {
    cdkBuilder.engine(engine)
  }

  public fun instanceEndpointAddresses(vararg instanceEndpointAddresses: String) {
    _instanceEndpointAddresses.addAll(listOf(*instanceEndpointAddresses))
  }

  public fun instanceEndpointAddresses(instanceEndpointAddresses: Collection<String>) {
    _instanceEndpointAddresses.addAll(instanceEndpointAddresses)
  }

  public fun instanceIdentifiers(vararg instanceIdentifiers: String) {
    _instanceIdentifiers.addAll(listOf(*instanceIdentifiers))
  }

  public fun instanceIdentifiers(instanceIdentifiers: Collection<String>) {
    _instanceIdentifiers.addAll(instanceIdentifiers)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun readerEndpointAddress(readerEndpointAddress: String) {
    cdkBuilder.readerEndpointAddress(readerEndpointAddress)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

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
