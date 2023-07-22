@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnFargateProfile
import software.constructs.Construct

/**
 * Creates an AWS Fargate profile for your Amazon EKS cluster.
 *
 * You must have at least one Fargate profile in a cluster to be able to run pods on Fargate.
 *
 * The Fargate profile allows an administrator to declare which pods run on Fargate and specify
 * which pods run on which Fargate profile. This declaration is done through the profile’s selectors.
 * Each profile can have up to five selectors that contain a namespace and labels. A namespace is
 * required for every selector. The label field consists of multiple optional key-value pairs. Pods
 * that match the selectors are scheduled on Fargate. If a to-be-scheduled pod matches any of the
 * selectors in the Fargate profile, then that pod is run on Fargate.
 *
 * When you create a Fargate profile, you must specify a pod execution role to use with the pods
 * that are scheduled with the profile. This role is added to the cluster's Kubernetes [Role Based
 * Access
 * Control](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
 * (RBAC) for authorization so that the `kubelet` that is running on the Fargate infrastructure can
 * register with your Amazon EKS cluster so that it can appear in your cluster as a node. The pod
 * execution role also provides IAM permissions to the Fargate infrastructure to allow read access to
 * Amazon ECR image repositories. For more information, see [Pod Execution
 * Role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html) in the *Amazon EKS
 * User Guide* .
 *
 * Fargate profiles are immutable. However, you can create a new updated profile to replace an
 * existing profile and then delete the original after the updated profile has finished creating.
 *
 * If any Fargate profiles in a cluster are in the `DELETING` status, you must wait for that Fargate
 * profile to finish deleting before you can create any other profiles in that cluster.
 *
 * For more information, see [AWS Fargate
 * Profile](https://docs.aws.amazon.com/eks/latest/userguide/fargate-profile.html) in the *Amazon EKS
 * User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnFargateProfile cfnFargateProfile = CfnFargateProfile.Builder.create(this,
 * "MyCfnFargateProfile")
 * .clusterName("clusterName")
 * .podExecutionRoleArn("podExecutionRoleArn")
 * .selectors(List.of(SelectorProperty.builder()
 * .namespace("namespace")
 * // the properties below are optional
 * .labels(List.of(LabelProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build()))
 * // the properties below are optional
 * .fargateProfileName("fargateProfileName")
 * .subnets(List.of("subnets"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html)
 */
@CdkDslMarker
public class CfnFargateProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFargateProfile.Builder = CfnFargateProfile.Builder.create(scope, id)

  private val _selectors: MutableList<Any> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * The name of the Amazon EKS cluster to apply the Fargate profile to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-clustername)
   * @param clusterName The name of the Amazon EKS cluster to apply the Fargate profile to. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * The name of the Fargate profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-fargateprofilename)
   * @param fargateProfileName The name of the Fargate profile. 
   */
  public fun fargateProfileName(fargateProfileName: String) {
    cdkBuilder.fargateProfileName(fargateProfileName)
  }

  /**
   * The Amazon Resource Name (ARN) of the pod execution role to use for pods that match the
   * selectors in the Fargate profile.
   *
   * The pod execution role allows Fargate infrastructure to register with your cluster as a node,
   * and it provides read access to Amazon ECR image repositories. For more information, see [Pod
   * Execution Role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html) in the
   * *Amazon EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-podexecutionrolearn)
   * @param podExecutionRoleArn The Amazon Resource Name (ARN) of the pod execution role to use for
   * pods that match the selectors in the Fargate profile. 
   */
  public fun podExecutionRoleArn(podExecutionRoleArn: String) {
    cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
  }

  /**
   * The selectors to match for pods to use this Fargate profile.
   *
   * Each selector must have an associated namespace. Optionally, you can also specify labels for a
   * namespace. You may specify up to five selectors in a Fargate profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   */
  public fun selectors(vararg selectors: Any) {
    _selectors.addAll(listOf(*selectors))
  }

  /**
   * The selectors to match for pods to use this Fargate profile.
   *
   * Each selector must have an associated namespace. Optionally, you can also specify labels for a
   * namespace. You may specify up to five selectors in a Fargate profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   */
  public fun selectors(selectors: Collection<Any>) {
    _selectors.addAll(selectors)
  }

  /**
   * The selectors to match for pods to use this Fargate profile.
   *
   * Each selector must have an associated namespace. Optionally, you can also specify labels for a
   * namespace. You may specify up to five selectors in a Fargate profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   */
  public fun selectors(selectors: IResolvable) {
    cdkBuilder.selectors(selectors)
  }

  /**
   * The IDs of subnets to launch your pods into.
   *
   * At this time, pods running on Fargate are not assigned public IP addresses, so only private
   * subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
   * @param subnets The IDs of subnets to launch your pods into. 
   */
  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  /**
   * The IDs of subnets to launch your pods into.
   *
   * At this time, pods running on Fargate are not assigned public IP addresses, so only private
   * subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
   * @param subnets The IDs of subnets to launch your pods into. 
   */
  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  /**
   * The metadata to apply to the Fargate profile to assist with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Fargate profile tags do not
   * propagate to any other resources associated with the Fargate profile, such as the pods that are
   * scheduled with it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
   * @param tags The metadata to apply to the Fargate profile to assist with categorization and
   * organization. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * The metadata to apply to the Fargate profile to assist with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Fargate profile tags do not
   * propagate to any other resources associated with the Fargate profile, such as the pods that are
   * scheduled with it.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
   * @param tags The metadata to apply to the Fargate profile to assist with categorization and
   * organization. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFargateProfile {
    if(_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
