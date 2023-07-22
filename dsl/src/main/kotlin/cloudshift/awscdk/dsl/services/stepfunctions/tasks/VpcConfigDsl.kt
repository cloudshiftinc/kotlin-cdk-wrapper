@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig

@CdkDslMarker
public class VpcConfigDsl {
  private val cdkBuilder: VpcConfig.Builder = VpcConfig.builder()

  /**
   * @param subnets VPC subnets.
   */
  public fun subnets(subnets: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnets)
    cdkBuilder.subnets(builder.build())
  }

  /**
   * @param subnets VPC subnets.
   */
  public fun subnets(subnets: SubnetSelection) {
    cdkBuilder.subnets(subnets)
  }

  /**
   * @param vpc VPC. 
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): VpcConfig = cdkBuilder.build()
}
