@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rds

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.rds.SubnetGroupProps

@CdkDslMarker
public class SubnetGroupPropsDsl {
  private val cdkBuilder: SubnetGroupProps.Builder = SubnetGroupProps.builder()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun subnetGroupName(subnetGroupName: String) {
    cdkBuilder.subnetGroupName(subnetGroupName)
  }

  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun vpcSubnets(block: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(block)
    cdkBuilder.vpcSubnets(builder.build())
  }

  public fun vpcSubnets(vpcSubnets: SubnetSelection) {
    cdkBuilder.vpcSubnets(vpcSubnets)
  }

  public fun build(): SubnetGroupProps = cdkBuilder.build()
}
