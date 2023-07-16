@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpointService
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.InterfaceVpcEndpointProps
import software.amazon.awscdk.services.ec2.SubnetSelection

@CdkDslMarker
public class InterfaceVpcEndpointPropsDsl {
  private val cdkBuilder: InterfaceVpcEndpointProps.Builder = InterfaceVpcEndpointProps.builder()

  private val _securityGroups: MutableList<ISecurityGroup> = mutableListOf()

  public fun lookupSupportedAzs(lookupSupportedAzs: Boolean) {
    cdkBuilder.lookupSupportedAzs(lookupSupportedAzs)
  }

  public fun `open`(`open`: Boolean) {
    cdkBuilder.`open`(`open`)
  }

  public fun privateDnsEnabled(privateDnsEnabled: Boolean) {
    cdkBuilder.privateDnsEnabled(privateDnsEnabled)
  }

  public fun securityGroups(vararg securityGroups: ISecurityGroup) {
    _securityGroups.addAll(listOf(*securityGroups))
  }

  public fun securityGroups(securityGroups: Collection<ISecurityGroup>) {
    _securityGroups.addAll(securityGroups)
  }

  public fun service(service: IInterfaceVpcEndpointService) {
    cdkBuilder.service(service)
  }

  public fun subnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.subnets(builder.build())
  }

  public fun subnets(subnets: SubnetSelection) {
    cdkBuilder.subnets(subnets)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): InterfaceVpcEndpointProps {
    if(_securityGroups.isNotEmpty()) cdkBuilder.securityGroups(_securityGroups)
    return cdkBuilder.build()
  }
}
