@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnCluster

/**
 * The configuration of your local Amazon EKS cluster on an AWS Outpost.
 *
 * Before creating a cluster on an Outpost, review [Creating a local cluster on an
 * Outpost](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-local-cluster-create.html) in
 * the *Amazon EKS User Guide* . This API isn't available for Amazon EKS clusters on the AWS cloud.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * OutpostConfigProperty outpostConfigProperty = OutpostConfigProperty.builder()
 * .controlPlaneInstanceType("controlPlaneInstanceType")
 * .outpostArns(List.of("outpostArns"))
 * // the properties below are optional
 * .controlPlanePlacement(ControlPlanePlacementProperty.builder()
 * .groupName("groupName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-cluster-outpostconfig.html)
 */
@CdkDslMarker
public class CfnClusterOutpostConfigPropertyDsl {
  private val cdkBuilder: CfnCluster.OutpostConfigProperty.Builder =
      CfnCluster.OutpostConfigProperty.builder()

  private val _outpostArns: MutableList<String> = mutableListOf()

  /**
   * @param controlPlaneInstanceType The Amazon EC2 instance type that you want to use for your
   * local Amazon EKS cluster on Outposts. 
   * Choose an instance type based on the number of nodes that your cluster will have. For more
   * information, see [Capacity
   * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
   * in the *Amazon EKS User Guide* .
   *
   * The instance type that you specify is used for all Kubernetes control plane instances. The
   * instance type can't be changed after cluster creation. The control plane is not automatically
   * scaled by Amazon EKS.
   */
  public fun controlPlaneInstanceType(controlPlaneInstanceType: String) {
    cdkBuilder.controlPlaneInstanceType(controlPlaneInstanceType)
  }

  /**
   * @param controlPlanePlacement An object representing the placement configuration for all the
   * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
   * For more information, see [Capacity
   * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
   * in the *Amazon EKS User Guide* .
   */
  public fun controlPlanePlacement(controlPlanePlacement: IResolvable) {
    cdkBuilder.controlPlanePlacement(controlPlanePlacement)
  }

  /**
   * @param controlPlanePlacement An object representing the placement configuration for all the
   * control plane instances of your local Amazon EKS cluster on an AWS Outpost.
   * For more information, see [Capacity
   * considerations](https://docs.aws.amazon.com/eks/latest/userguide/eks-outposts-capacity-considerations.html)
   * in the *Amazon EKS User Guide* .
   */
  public
      fun controlPlanePlacement(controlPlanePlacement: CfnCluster.ControlPlanePlacementProperty) {
    cdkBuilder.controlPlanePlacement(controlPlanePlacement)
  }

  /**
   * @param outpostArns The ARN of the Outpost that you want to use for your local Amazon EKS
   * cluster on Outposts. 
   * Only a single Outpost ARN is supported.
   */
  public fun outpostArns(vararg outpostArns: String) {
    _outpostArns.addAll(listOf(*outpostArns))
  }

  /**
   * @param outpostArns The ARN of the Outpost that you want to use for your local Amazon EKS
   * cluster on Outposts. 
   * Only a single Outpost ARN is supported.
   */
  public fun outpostArns(outpostArns: Collection<String>) {
    _outpostArns.addAll(outpostArns)
  }

  public fun build(): CfnCluster.OutpostConfigProperty {
    if(_outpostArns.isNotEmpty()) cdkBuilder.outpostArns(_outpostArns)
    return cdkBuilder.build()
  }
}
