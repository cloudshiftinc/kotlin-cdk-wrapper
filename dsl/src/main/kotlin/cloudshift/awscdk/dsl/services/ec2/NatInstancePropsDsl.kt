@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.NatInstanceProps
import software.amazon.awscdk.services.ec2.NatTrafficDirection

@CdkDslMarker
public class NatInstancePropsDsl {
  private val cdkBuilder: NatInstanceProps.Builder = NatInstanceProps.builder()

  public fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
    cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic)
  }

  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  public fun machineImage(machineImage: IMachineImage) {
    cdkBuilder.machineImage(machineImage)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun build(): NatInstanceProps = cdkBuilder.build()
}
