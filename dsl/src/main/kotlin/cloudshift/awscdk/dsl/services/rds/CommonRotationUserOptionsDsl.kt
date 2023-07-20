@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.ec2.IInterfaceVpcEndpoint
import software.amazon.awscdk.services.ec2.ISecurityGroup
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.rds.CommonRotationUserOptions

@CdkDslMarker
public class CommonRotationUserOptionsDsl {
  private val cdkBuilder: CommonRotationUserOptions.Builder = CommonRotationUserOptions.builder()

  public fun automaticallyAfter(automaticallyAfter: Duration) {
    cdkBuilder.automaticallyAfter(automaticallyAfter)
  }

  public fun endpoint(endpoint: IInterfaceVpcEndpoint) {
    cdkBuilder.endpoint(endpoint)
  }

  public fun excludeCharacters(excludeCharacters: String) {
    cdkBuilder.excludeCharacters(excludeCharacters)
  }

  public fun rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate: Boolean) {
    cdkBuilder.rotateImmediatelyOnUpdate(rotateImmediatelyOnUpdate)
  }

  public fun securityGroup(securityGroup: ISecurityGroup) {
    cdkBuilder.securityGroup(securityGroup)
  }

  public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.vpcSubnets(builder.build())
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): CommonRotationUserOptions = cdkBuilder.build()
}
