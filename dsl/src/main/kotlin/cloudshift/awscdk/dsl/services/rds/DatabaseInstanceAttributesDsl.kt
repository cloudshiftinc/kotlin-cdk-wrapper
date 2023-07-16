@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.rds.DatabaseInstanceAttributes
import software.amazon.awscdk.services.rds.IInstanceEngine

@CdkDslMarker
public class DatabaseInstanceAttributesDsl {
  private val cdkBuilder: DatabaseInstanceAttributes.Builder = DatabaseInstanceAttributes.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun engine(engine: IInstanceEngine) {
    cdkBuilder.engine(engine)
  }

  public fun instanceEndpointAddress(instanceEndpointAddress: String) {
    cdkBuilder.instanceEndpointAddress(instanceEndpointAddress)
  }

  public fun instanceIdentifier(instanceIdentifier: String) {
    cdkBuilder.instanceIdentifier(instanceIdentifier)
  }

  public fun instanceResourceId(instanceResourceId: String) {
    cdkBuilder.instanceResourceId(instanceResourceId)
  }

  public fun port(port: Number) {
    cdkBuilder.port(port)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun build(): DatabaseInstanceAttributes {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
