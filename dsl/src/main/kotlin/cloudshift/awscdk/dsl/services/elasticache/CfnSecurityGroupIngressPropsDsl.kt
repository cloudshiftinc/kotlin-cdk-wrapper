@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.elasticache

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.elasticache.CfnSecurityGroupIngressProps

@CdkDslMarker
public class CfnSecurityGroupIngressPropsDsl {
  private val cdkBuilder: CfnSecurityGroupIngressProps.Builder =
      CfnSecurityGroupIngressProps.builder()

  public fun cacheSecurityGroupName(cacheSecurityGroupName: String) {
    cdkBuilder.cacheSecurityGroupName(cacheSecurityGroupName)
  }

  public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
    cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
  }

  public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
    cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
  }

  public fun build(): CfnSecurityGroupIngressProps = cdkBuilder.build()
}
