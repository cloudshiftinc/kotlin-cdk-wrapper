@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions.tasks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.Unit
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.stepfunctions.tasks.VpcConfig

/**
 * Specifies the VPC that you want your Amazon SageMaker training job to connect to.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * Subnet subnet;
 * SubnetFilter subnetFilter;
 * Vpc vpc;
 * VpcConfig vpcConfig = VpcConfig.builder()
 * .vpc(vpc)
 * // the properties below are optional
 * .subnets(SubnetSelection.builder()
 * .availabilityZones(List.of("availabilityZones"))
 * .onePerAz(false)
 * .subnetFilters(List.of(subnetFilter))
 * .subnetGroupName("subnetGroupName")
 * .subnets(List.of(subnet))
 * .subnetType(SubnetType.PRIVATE_ISOLATED)
 * .build())
 * .build();
 * ```
 */
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
