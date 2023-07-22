@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.CfnHostProps

/**
 * Properties for defining a `CfnHost`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * CfnHostProps cfnHostProps = CfnHostProps.builder()
 * .availabilityZone("availabilityZone")
 * // the properties below are optional
 * .autoPlacement("autoPlacement")
 * .hostMaintenance("hostMaintenance")
 * .hostRecovery("hostRecovery")
 * .instanceFamily("instanceFamily")
 * .instanceType("instanceType")
 * .outpostArn("outpostArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-ec2-host.html)
 */
@CdkDslMarker
public class CfnHostPropsDsl {
  private val cdkBuilder: CfnHostProps.Builder = CfnHostProps.builder()

  /**
   * @param autoPlacement Indicates whether the host accepts any untargeted instance launches that
   * match its instance type configuration, or if it only accepts Host tenancy instance launches that
   * specify its unique host ID.
   * For more information, see [Understanding auto-placement and
   * affinity](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/how-dedicated-hosts-work.html#dedicated-hosts-understanding)
   * in the *Amazon EC2 User Guide* .
   *
   * Default: `on`
   */
  public fun autoPlacement(autoPlacement: String) {
    cdkBuilder.autoPlacement(autoPlacement)
  }

  /**
   * @param availabilityZone The Availability Zone in which to allocate the Dedicated Host. 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param hostMaintenance Indicates whether host maintenance is enabled or disabled for the
   * Dedicated Host.
   */
  public fun hostMaintenance(hostMaintenance: String) {
    cdkBuilder.hostMaintenance(hostMaintenance)
  }

  /**
   * @param hostRecovery Indicates whether to enable or disable host recovery for the Dedicated
   * Host.
   * Host recovery is disabled by default. For more information, see [Host
   * recovery](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/dedicated-hosts-recovery.html) in
   * the *Amazon EC2 User Guide* .
   *
   * Default: `off`
   */
  public fun hostRecovery(hostRecovery: String) {
    cdkBuilder.hostRecovery(hostRecovery)
  }

  /**
   * @param instanceFamily The instance family supported by the Dedicated Host.
   * For example, `m5` .
   */
  public fun instanceFamily(instanceFamily: String) {
    cdkBuilder.instanceFamily(instanceFamily)
  }

  /**
   * @param instanceType Specifies the instance type to be supported by the Dedicated Hosts.
   * If you specify an instance type, the Dedicated Hosts support instances of the specified
   * instance type only.
   */
  public fun instanceType(instanceType: String) {
    cdkBuilder.instanceType(instanceType)
  }

  /**
   * @param outpostArn The Amazon Resource Name (ARN) of the AWS Outpost on which the Dedicated Host
   * is allocated.
   */
  public fun outpostArn(outpostArn: String) {
    cdkBuilder.outpostArn(outpostArn)
  }

  public fun build(): CfnHostProps = cdkBuilder.build()
}
