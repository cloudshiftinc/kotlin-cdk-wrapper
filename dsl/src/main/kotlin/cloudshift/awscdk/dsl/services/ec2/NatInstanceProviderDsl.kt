@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.IMachineImage
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.InstanceType
import software.amazon.awscdk.services.ec2.NatInstanceProvider
import software.amazon.awscdk.services.ec2.NatTrafficDirection

@CdkDslMarker
public class NatInstanceProviderDsl {
  private val cdkBuilder: NatInstanceProvider.Builder = NatInstanceProvider.Builder.create()

  /**
   * Direction to allow all traffic through the NAT instance by default.
   *
   * By default, inbound and outbound traffic is allowed.
   *
   * If you set this to another value than INBOUND_AND_OUTBOUND, you must
   * configure the NAT instance's security groups in another way, either by
   * passing in a fully configured Security Group using the `securityGroup`
   * property, or by configuring it using the `.securityGroup` or
   * `.connections` members after passing the NAT Instance Provider to a Vpc.
   *
   * Default: NatTrafficDirection.INBOUND_AND_OUTBOUND
   *
   * @param defaultAllowedTraffic Direction to allow all traffic through the NAT instance by
   * default. 
   */
  public fun defaultAllowedTraffic(defaultAllowedTraffic: NatTrafficDirection) {
    cdkBuilder.defaultAllowedTraffic(defaultAllowedTraffic)
  }

  /**
   * Instance type of the NAT instance.
   *
   * @param instanceType Instance type of the NAT instance. 
   */
  public fun instanceType(instanceType: InstanceType) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * Name of SSH keypair to grant access to instance.
   *
   * Default: - No SSH access will be possible.
   *
   * @param keyName Name of SSH keypair to grant access to instance. 
   */
  public fun keyName(keyName: String) {
    cdkBuilder.keyName(keyName)
  }

  /**
   * The machine image (AMI) to use.
   *
   * By default, will do an AMI lookup for the latest NAT instance image.
   *
   * If you have a specific AMI ID you want to use, pass a `GenericLinuxImage`. For example:
   *
   * ```
   * NatProvider.instance(NatInstanceProps.builder()
   * .instanceType(new InstanceType("t3.micro"))
   * .machineImage(new GenericLinuxImage(Map.of(
   * "us-east-2", "ami-0f9c61b5a562a16af")))
   * .build());
   * ```
   *
   * Default: - Latest NAT instance image
   *
   * @param machineImage The machine image (AMI) to use. 
   */
  public fun machineImage(machineImage: IMachineImage) {
    cdkBuilder.machineImage(machineImage)
  }

  /**
   * Security Group for NAT instances.
   *
   * Default: - A new security group will be created
   *
   * @param securityGroup Security Group for NAT instances. 
   */
  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun build(): NatInstanceProvider = cdkBuilder.build()
}
