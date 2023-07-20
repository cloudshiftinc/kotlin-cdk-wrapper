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

  public fun networkAclName(networkAclName: String) {
    cdkBuilder.networkAclName(networkAclName)
  }

  public fun subnetSelection(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.subnetSelection(builder.build())
  }

  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): NetworkAclProps = cdkBuilder.build()
}
