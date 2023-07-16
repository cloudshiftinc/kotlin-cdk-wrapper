@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.rds.CfnDBSecurityGroup

@CdkDslMarker
public class CfnDBSecurityGroupIngressPropertyDsl {
  private val cdkBuilder: CfnDBSecurityGroup.IngressProperty.Builder =
      CfnDBSecurityGroup.IngressProperty.builder()

  public fun cidrip(cidrip: String) {
    cdkBuilder.cidrip(cidrip)
  }

  public fun ec2SecurityGroupId(ec2SecurityGroupId: String) {
    cdkBuilder.ec2SecurityGroupId(ec2SecurityGroupId)
  }

  public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
    cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
  }

  public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
    cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
  }

  public fun build(): CfnDBSecurityGroup.IngressProperty = cdkBuilder.build()
}
