@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnFargateProfile`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
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
public interface CfnFargateProfileProps {
  /**
   * The name of your cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-clustername)
   */
  public fun clusterName(): String

  /**
   * The name of the Fargate profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-fargateprofilename)
   */
  public fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

  /**
   * The Amazon Resource Name (ARN) of the `Pod` execution role to use for a `Pod` that matches the
   * selectors in the Fargate profile.
   *
   * The `Pod` execution role allows Fargate infrastructure to register with your cluster as a node,
   * and it provides read access to Amazon ECR image repositories. For more information, see [`Pod`
   * execution role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html) in the
   * *Amazon EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-podexecutionrolearn)
   */
  public fun podExecutionRoleArn(): String

  /**
   * The selectors to match for a `Pod` to use this Fargate profile.
   *
   * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also specify
   * `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
   */
  public fun selectors(): Any

  /**
   * The IDs of subnets to launch a `Pod` into.
   *
   * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with no
   * direct route to an Internet Gateway) are accepted for this parameter.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
   */
  public fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

  /**
   * Metadata that assists with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Tags don't propagate to any
   * other cluster or AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnFargateProfileProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param fargateProfileName The name of the Fargate profile.
     */
    public fun fargateProfileName(fargateProfileName: String)

    /**
     * @param podExecutionRoleArn The Amazon Resource Name (ARN) of the `Pod` execution role to use
     * for a `Pod` that matches the selectors in the Fargate profile. 
     * The `Pod` execution role allows Fargate infrastructure to register with your cluster as a
     * node, and it provides read access to Amazon ECR image repositories. For more information, see
     * [`Pod` execution role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * in the *Amazon EKS User Guide* .
     */
    public fun podExecutionRoleArn(podExecutionRoleArn: String)

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    public fun selectors(selectors: IResolvable)

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    public fun selectors(selectors: List<Any>)

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    public fun selectors(vararg selectors: Any)

    /**
     * @param subnets The IDs of subnets to launch a `Pod` into.
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     */
    public fun subnets(subnets: List<String>)

    /**
     * @param subnets The IDs of subnets to launch a `Pod` into.
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     */
    public fun subnets(vararg subnets: String)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnFargateProfileProps.Builder =
        software.amazon.awscdk.services.eks.CfnFargateProfileProps.builder()

    /**
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param fargateProfileName The name of the Fargate profile.
     */
    override fun fargateProfileName(fargateProfileName: String) {
      cdkBuilder.fargateProfileName(fargateProfileName)
    }

    /**
     * @param podExecutionRoleArn The Amazon Resource Name (ARN) of the `Pod` execution role to use
     * for a `Pod` that matches the selectors in the Fargate profile. 
     * The `Pod` execution role allows Fargate infrastructure to register with your cluster as a
     * node, and it provides read access to Amazon ECR image repositories. For more information, see
     * [`Pod` execution role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * in the *Amazon EKS User Guide* .
     */
    override fun podExecutionRoleArn(podExecutionRoleArn: String) {
      cdkBuilder.podExecutionRoleArn(podExecutionRoleArn)
    }

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    override fun selectors(selectors: IResolvable) {
      cdkBuilder.selectors(selectors.let(IResolvable::unwrap))
    }

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    override fun selectors(selectors: List<Any>) {
      cdkBuilder.selectors(selectors.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param selectors The selectors to match for a `Pod` to use this Fargate profile. 
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     */
    override fun selectors(vararg selectors: Any): Unit = selectors(selectors.toList())

    /**
     * @param subnets The IDs of subnets to launch a `Pod` into.
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     */
    override fun subnets(subnets: List<String>) {
      cdkBuilder.subnets(subnets)
    }

    /**
     * @param subnets The IDs of subnets to launch a `Pod` into.
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     */
    override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnFargateProfileProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfileProps,
  ) : CdkObject(cdkObject), CfnFargateProfileProps {
    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The name of the Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-fargateprofilename)
     */
    override fun fargateProfileName(): String? = unwrap(this).getFargateProfileName()

    /**
     * The Amazon Resource Name (ARN) of the `Pod` execution role to use for a `Pod` that matches
     * the selectors in the Fargate profile.
     *
     * The `Pod` execution role allows Fargate infrastructure to register with your cluster as a
     * node, and it provides read access to Amazon ECR image repositories. For more information, see
     * [`Pod` execution role](https://docs.aws.amazon.com/eks/latest/userguide/pod-execution-role.html)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-podexecutionrolearn)
     */
    override fun podExecutionRoleArn(): String = unwrap(this).getPodExecutionRoleArn()

    /**
     * The selectors to match for a `Pod` to use this Fargate profile.
     *
     * Each selector must have an associated Kubernetes `namespace` . Optionally, you can also
     * specify `labels` for a `namespace` . You may specify up to five selectors in a Fargate profile.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-selectors)
     */
    override fun selectors(): Any = unwrap(this).getSelectors()

    /**
     * The IDs of subnets to launch a `Pod` into.
     *
     * A `Pod` running on Fargate isn't assigned a public IP address, so only private subnets (with
     * no direct route to an Internet Gateway) are accepted for this parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-subnets)
     */
    override fun subnets(): List<String> = unwrap(this).getSubnets() ?: emptyList()

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-fargateprofile.html#cfn-eks-fargateprofile-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFargateProfileProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnFargateProfileProps):
        CfnFargateProfileProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFargateProfileProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFargateProfileProps):
        software.amazon.awscdk.services.eks.CfnFargateProfileProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnFargateProfileProps
  }
}
