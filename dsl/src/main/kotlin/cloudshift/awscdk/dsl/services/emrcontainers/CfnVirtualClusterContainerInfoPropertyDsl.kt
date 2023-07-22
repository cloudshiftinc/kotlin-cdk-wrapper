@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emrcontainers

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrcontainers.CfnVirtualCluster

/**
 * The information about the container used for a job run or a managed endpoint.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrcontainers.*;
 * ContainerInfoProperty containerInfoProperty = ContainerInfoProperty.builder()
 * .eksInfo(EksInfoProperty.builder()
 * .namespace("namespace")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrcontainers-virtualcluster-containerinfo.html)
 */
@CdkDslMarker
public class CfnVirtualClusterContainerInfoPropertyDsl {
  private val cdkBuilder: CfnVirtualCluster.ContainerInfoProperty.Builder =
      CfnVirtualCluster.ContainerInfoProperty.builder()

  /**
   * @param eksInfo The information about the Amazon EKS cluster. 
   */
  public fun eksInfo(eksInfo: IResolvable) {
    cdkBuilder.eksInfo(eksInfo)
  }

  /**
   * @param eksInfo The information about the Amazon EKS cluster. 
   */
  public fun eksInfo(eksInfo: CfnVirtualCluster.EksInfoProperty) {
    cdkBuilder.eksInfo(eksInfo)
  }

  public fun build(): CfnVirtualCluster.ContainerInfoProperty = cdkBuilder.build()
}
