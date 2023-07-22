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
import software.amazon.awscdk.services.eks.CfnFargateProfileProps

/**
 * Properties for defining a `CfnFargateProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
 * CfnFargateProfileProps cfnFargateProfileProps = CfnFargateProfileProps.builder()
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
public class CfnFargateProfilePropsDsl {
  private val cdkBuilder: CfnFargateProfileProps.Builder = CfnFargateProfileProps.builder()

  private val _selectors: MutableList<Any> = mutableListOf()

  private val _subnets: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param clusterName The name of the Amazon EKS cluster to apply the Fargate profile to. 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * @param fargateProfileName The name of the Fargate profile.
   */
  public fun fargateProfileName(fargateProfileName: String) {
    cdkBuilder.fargateProfileName(fargateProfileName)
  }

  /**
   * @param podExecutionRoleArn The Amazon Resource Name (ARN) of the pod execution role to use for
   * pods that match the selectors in the Fargate profile. 
   * The pod execution role allows Fargate infrastructure to register with your cluster as a node,
   * and it provides read access to Amazon ECR image repositories. For more information, see [Pod
   * Execution Role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html) in the
   * *Amazon EKS User Guide* .
   */
  public fun podExecutionRoleArn(podExecutionRoleArn: String) {
    cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
  }

  /**
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   * Each selector must have an associated namespace. Optionally, you can also specify labels for a
   * namespace. You may specify up to five selectors in a Fargate profile.
   */
  public fun selectors(vararg selectors: Any) {
    _selectors.addAll(listOf(*selectors))
  }

  /**
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   * Each selector must have an associated namespace. Optionally, you can also specify labels for a
   * namespace. You may specify up to five selectors in a Fargate profile.
   */
  public fun selectors(selectors: Collection<Any>) {
    _selectors.addAll(selectors)
  }

  /**
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   * Each selector must have an associated namespace. Optionally, you can also specify labels for a
   * namespace. You may specify up to five selectors in a Fargate profile.
   */
  public fun selectors(selectors: IResolvable) {
    cdkBuilder.selectors(selectors)
  }

  /**
   * @param subnets The IDs of subnets to launch your pods into.
   * At this time, pods running on Fargate are not assigned public IP addresses, so only private
   * subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
   */
  public fun subnets(vararg subnets: String) {
    _subnets.addAll(listOf(*subnets))
  }

  /**
   * @param subnets The IDs of subnets to launch your pods into.
   * At this time, pods running on Fargate are not assigned public IP addresses, so only private
   * subnets (with no direct route to an Internet Gateway) are accepted for this parameter.
   */
  public fun subnets(subnets: Collection<String>) {
    _subnets.addAll(subnets)
  }

  /**
   * @param tags The metadata to apply to the Fargate profile to assist with categorization and
   * organization.
   * Each tag consists of a key and an optional value. You define both. Fargate profile tags do not
   * propagate to any other resources associated with the Fargate profile, such as the pods that are
   * scheduled with it.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The metadata to apply to the Fargate profile to assist with categorization and
   * organization.
   * Each tag consists of a key and an optional value. You define both. Fargate profile tags do not
   * propagate to any other resources associated with the Fargate profile, such as the pods that are
   * scheduled with it.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnFargateProfileProps {
    if(_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
    if(_subnets.isNotEmpty()) cdkBuilder.subnets(_subnets)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
