@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eks

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.services.ec2.SubnetSelectionDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.ec2.SubnetSelection
import software.amazon.awscdk.services.eks.FargateProfileOptions
import software.amazon.awscdk.services.eks.Selector
import software.amazon.awscdk.services.iam.IRole

/**
 * Options for defining EKS Fargate Profiles.
 *
 * Example:
 *
 * ```
 * Cluster cluster;
 * cluster.addFargateProfile("MyProfile", FargateProfileOptions.builder()
 * .selectors(List.of(Selector.builder().namespace("default").build()))
 * .build());
 * ```
 */
@CdkDslMarker
public class FargateProfileOptionsDsl {
  private val cdkBuilder: FargateProfileOptions.Builder = FargateProfileOptions.builder()

  private val _selectors: MutableList<Selector> = mutableListOf()

  /**
   * @param fargateProfileName The name of the Fargate profile.
   */
  public fun fargateProfileName(fargateProfileName: String) {
    cdkBuilder.fargateProfileName(fargateProfileName)
  }

  /**
   * @param podExecutionRole The pod execution role to use for pods that match the selectors in the
   * Fargate profile.
   * The pod execution role allows Fargate infrastructure to
   * register with your cluster as a node, and it provides read access to Amazon
   * ECR image repositories.
   */
  public fun podExecutionRole(podExecutionRole: IRole) {
    cdkBuilder.podExecutionRole(podExecutionRole)
  }

  /**
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   * Each selector
   * must have an associated namespace. Optionally, you can also specify labels
   * for a namespace.
   *
   * At least one selector is required and you may specify up to five selectors.
   */
  public fun selectors(selectors: SelectorDsl.() -> Unit) {
    _selectors.add(SelectorDsl().apply(selectors).build())
  }

  /**
   * @param selectors The selectors to match for pods to use this Fargate profile. 
   * Each selector
   * must have an associated namespace. Optionally, you can also specify labels
   * for a namespace.
   *
   * At least one selector is required and you may specify up to five selectors.
   */
  public fun selectors(selectors: Collection<Selector>) {
    _selectors.addAll(selectors)
  }

  /**
   * @param subnetSelection Select which subnets to launch your pods into.
   * At this time, pods running
   * on Fargate are not assigned public IP addresses, so only private subnets
   * (with no direct route to an Internet Gateway) are allowed.
   *
   * You must specify the VPC to customize the subnet selection
   */
  public fun subnetSelection(subnetSelection: SubnetSelectionDsl.() -> Unit = {}) {
    val builder = SubnetSelectionDsl()
    builder.apply(subnetSelection)
    cdkBuilder.subnetSelection(builder.build())
  }

  /**
   * @param subnetSelection Select which subnets to launch your pods into.
   * At this time, pods running
   * on Fargate are not assigned public IP addresses, so only private subnets
   * (with no direct route to an Internet Gateway) are allowed.
   *
   * You must specify the VPC to customize the subnet selection
   */
  public fun subnetSelection(subnetSelection: SubnetSelection) {
    cdkBuilder.subnetSelection(subnetSelection)
  }

  /**
   * @param vpc The VPC from which to select subnets to launch your pods into.
   * By default, all private subnets are selected. You can customize this using
   * `subnetSelection`.
   */
  public fun vpc(vpc: IVpc) {
    cdkBuilder.vpc(vpc)
  }

  public fun build(): FargateProfileOptions {
    if(_selectors.isNotEmpty()) cdkBuilder.selectors(_selectors)
    return cdkBuilder.build()
  }
}
