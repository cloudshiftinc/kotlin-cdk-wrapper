@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnPodIdentityAssociation`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnPodIdentityAssociationProps cfnPodIdentityAssociationProps =
 * CfnPodIdentityAssociationProps.builder()
 * .clusterName("clusterName")
 * .namespace("namespace")
 * .roleArn("roleArn")
 * .serviceAccount("serviceAccount")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html)
 */
public interface CfnPodIdentityAssociationProps {
  /**
   * The name of the cluster that the association is in.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-clustername)
   */
  public fun clusterName(): String

  /**
   * The name of the Kubernetes namespace inside the cluster to create the association in.
   *
   * The service account and the pods that use the service account must be in this namespace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-namespace)
   */
  public fun namespace(): String

  /**
   * The Amazon Resource Name (ARN) of the IAM role to associate with the service account.
   *
   * The EKS Pod Identity agent manages credentials to assume this role for applications in the
   * containers in the pods that use this service account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-rolearn)
   */
  public fun roleArn(): String

  /**
   * The name of the Kubernetes service account inside the cluster to associate the IAM credentials
   * with.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-serviceaccount)
   */
  public fun serviceAccount(): String

  /**
   * Metadata that assists with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Tags don't propagate to any
   * other cluster or AWS resources.
   *
   * The following basic restrictions apply to tags:
   *
   * * Maximum number of tags per resource – 50
   * * For each resource, each tag key must be unique, and each tag key can have only one value.
   * * Maximum key length – 128 Unicode characters in UTF-8
   * * Maximum value length – 256 Unicode characters in UTF-8
   * * If your tagging schema is used across multiple services and resources, remember that other
   * services may have restrictions on allowed characters. Generally allowed characters are: letters,
   * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnPodIdentityAssociationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param clusterName The name of the cluster that the association is in. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param namespace The name of the Kubernetes namespace inside the cluster to create the
     * association in. 
     * The service account and the pods that use the service account must be in this namespace.
     */
    public fun namespace(namespace: String)

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to associate with the service
     * account. 
     * The EKS Pod Identity agent manages credentials to assume this role for applications in the
     * containers in the pods that use this service account.
     */
    public fun roleArn(roleArn: String)

    /**
     * @param serviceAccount The name of the Kubernetes service account inside the cluster to
     * associate the IAM credentials with. 
     */
    public fun serviceAccount(serviceAccount: String)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource – 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length – 128 Unicode characters in UTF-8
     * * Maximum value length – 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource – 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length – 128 Unicode characters in UTF-8
     * * Maximum value length – 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps.Builder =
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps.builder()

    /**
     * @param clusterName The name of the cluster that the association is in. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param namespace The name of the Kubernetes namespace inside the cluster to create the
     * association in. 
     * The service account and the pods that use the service account must be in this namespace.
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to associate with the service
     * account. 
     * The EKS Pod Identity agent manages credentials to assume this role for applications in the
     * containers in the pods that use this service account.
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * @param serviceAccount The name of the Kubernetes service account inside the cluster to
     * associate the IAM credentials with. 
     */
    override fun serviceAccount(serviceAccount: String) {
      cdkBuilder.serviceAccount(serviceAccount)
    }

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource – 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length – 128 Unicode characters in UTF-8
     * * Maximum value length – 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Metadata that assists with categorization and organization.
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource – 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length – 128 Unicode characters in UTF-8
     * * Maximum value length – 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps,
  ) : CdkObject(cdkObject), CfnPodIdentityAssociationProps {
    /**
     * The name of the cluster that the association is in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The name of the Kubernetes namespace inside the cluster to create the association in.
     *
     * The service account and the pods that use the service account must be in this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-namespace)
     */
    override fun namespace(): String = unwrap(this).getNamespace()

    /**
     * The Amazon Resource Name (ARN) of the IAM role to associate with the service account.
     *
     * The EKS Pod Identity agent manages credentials to assume this role for applications in the
     * containers in the pods that use this service account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-rolearn)
     */
    override fun roleArn(): String = unwrap(this).getRoleArn()

    /**
     * The name of the Kubernetes service account inside the cluster to associate the IAM
     * credentials with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-serviceaccount)
     */
    override fun serviceAccount(): String = unwrap(this).getServiceAccount()

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource – 50
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length – 128 Unicode characters in UTF-8
     * * Maximum value length – 256 Unicode characters in UTF-8
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPodIdentityAssociationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps):
        CfnPodIdentityAssociationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnPodIdentityAssociationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPodIdentityAssociationProps):
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnPodIdentityAssociationProps
  }
}
