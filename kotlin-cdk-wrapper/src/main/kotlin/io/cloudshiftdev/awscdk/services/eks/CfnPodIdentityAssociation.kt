@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Amazon EKS Pod Identity associations provide the ability to manage credentials for your
 * applications, similar to the way that Amazon EC2 instance profiles provide credentials to Amazon EC2
 * instances.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnPodIdentityAssociation cfnPodIdentityAssociation =
 * CfnPodIdentityAssociation.Builder.create(this, "MyCfnPodIdentityAssociation")
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
public open class CfnPodIdentityAssociation internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.eks.CfnPodIdentityAssociation,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  /**
   * The Amazon Resource Name (ARN) of the association.
   */
  public open fun attrAssociationArn(): String = unwrap(this).getAttrAssociationArn()

  /**
   * The ID of the association.
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The name of the cluster that the association is in.
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of the cluster that the association is in.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the Kubernetes namespace inside the cluster to create the association in.
   */
  public open fun namespace(): String = unwrap(this).getNamespace()

  /**
   * The name of the Kubernetes namespace inside the cluster to create the association in.
   */
  public open fun namespace(`value`: String) {
    unwrap(this).setNamespace(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the IAM role to associate with the service account.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role to associate with the service account.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The name of the Kubernetes service account inside the cluster to associate the IAM credentials
   * with.
   */
  public open fun serviceAccount(): String = unwrap(this).getServiceAccount()

  /**
   * The name of the Kubernetes service account inside the cluster to associate the IAM credentials
   * with.
   */
  public open fun serviceAccount(`value`: String) {
    unwrap(this).setServiceAccount(`value`)
  }

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.CfnPodIdentityAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the cluster that the association is in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-clustername)
     * @param clusterName The name of the cluster that the association is in. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The name of the Kubernetes namespace inside the cluster to create the association in.
     *
     * The service account and the pods that use the service account must be in this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-namespace)
     * @param namespace The name of the Kubernetes namespace inside the cluster to create the
     * association in. 
     */
    public fun namespace(namespace: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role to associate with the service account.
     *
     * The EKS Pod Identity agent manages credentials to assume this role for applications in the
     * containers in the pods that use this service account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to associate with the service
     * account. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The name of the Kubernetes service account inside the cluster to associate the IAM
     * credentials with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-serviceaccount)
     * @param serviceAccount The name of the Kubernetes service account inside the cluster to
     * associate the IAM credentials with. 
     */
    public fun serviceAccount(serviceAccount: String)

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
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnPodIdentityAssociation.Builder =
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociation.Builder.create(scope, id)

    /**
     * The name of the cluster that the association is in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-clustername)
     * @param clusterName The name of the cluster that the association is in. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The name of the Kubernetes namespace inside the cluster to create the association in.
     *
     * The service account and the pods that use the service account must be in this namespace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-namespace)
     * @param namespace The name of the Kubernetes namespace inside the cluster to create the
     * association in. 
     */
    override fun namespace(namespace: String) {
      cdkBuilder.namespace(namespace)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role to associate with the service account.
     *
     * The EKS Pod Identity agent manages credentials to assume this role for applications in the
     * containers in the pods that use this service account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-rolearn)
     * @param roleArn The Amazon Resource Name (ARN) of the IAM role to associate with the service
     * account. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The name of the Kubernetes service account inside the cluster to associate the IAM
     * credentials with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-serviceaccount)
     * @param serviceAccount The name of the Kubernetes service account inside the cluster to
     * associate the IAM credentials with. 
     */
    override fun serviceAccount(serviceAccount: String) {
      cdkBuilder.serviceAccount(serviceAccount)
    }

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
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnPodIdentityAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPodIdentityAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPodIdentityAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnPodIdentityAssociation):
        CfnPodIdentityAssociation = CfnPodIdentityAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnPodIdentityAssociation):
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociation = wrapped.cdkObject
  }
}
