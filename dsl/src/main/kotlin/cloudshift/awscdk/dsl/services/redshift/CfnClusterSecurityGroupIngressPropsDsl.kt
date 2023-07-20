@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupIngressProps

@CdkDslMarker
public class CfnClusterSecurityGroupIngressPropsDsl {
  private val cdkBuilder: CfnClusterSecurityGroupIngressProps.Builder =
      CfnClusterSecurityGroupIngressProps.builder()

  public fun cidrip(cidrip: String) {
    cdkBuilder.cidrip(cidrip)
  }

  public fun clusterSecurityGroupName(clusterSecurityGroupName: String) {
    cdkBuilder.clusterSecurityGroupName(clusterSecurityGroupName)
  }

  public fun ec2SecurityGroupName(ec2SecurityGroupName: String) {
    cdkBuilder.ec2SecurityGroupName(ec2SecurityGroupName)
  }

  public fun ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId: String) {
    cdkBuilder.ec2SecurityGroupOwnerId(ec2SecurityGroupOwnerId)
  }

  public fun build(): CfnClusterSecurityGroupIngressProps = cdkBuilder.build()
}
