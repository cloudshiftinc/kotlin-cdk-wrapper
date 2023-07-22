@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.NetworkAclProps
import software.amazon.awscdk.services.ec2.SubnetSelection

@CdkDslMarker
public class NetworkAclPropsDsl {
  private val cdkBuilder: NetworkAclProps.Builder = NetworkAclProps.builder()

  /**
   * @param networkAclName The name of the NetworkAcl.
   * It is not recommended to use an explicit name.
   */
  public fun networkAclName(networkAclName: String) {
    cdkBuilder.networkAclName(networkAclName)
  }

  /**
   * @param subnetSelection Subnets in the given VPC to associate the ACL with.
   * More subnets can always be added later by calling
   * `associateWithSubnets()`.
   */
  public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnetSelection)
    cdkBuilder.subnetSelection(builder.build())
  }

  /**
   * @param subnetSelection Subnets in the given VPC to associate the ACL with.
   * More subnets can always be added later by calling
   * `associateWithSubnets()`.
   */
  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  /**
   * @param vpc The VPC in which to create the NetworkACL. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): NetworkAclProps = cdkBuilder.build()
}
