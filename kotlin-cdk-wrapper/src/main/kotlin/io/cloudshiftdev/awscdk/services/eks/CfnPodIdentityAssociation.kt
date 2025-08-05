@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
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
 * .disableSessionTags(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .targetRoleArn("targetRoleArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html)
 */
public open class CfnPodIdentityAssociation(
  cdkObject: software.amazon.awscdk.services.eks.CfnPodIdentityAssociation,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPodIdentityAssociationProps,
  ) :
      this(software.amazon.awscdk.services.eks.CfnPodIdentityAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnPodIdentityAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPodIdentityAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPodIdentityAssociationProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the association.
   */
  public open fun attrAssociationArn(): String = unwrap(this).getAttrAssociationArn()

  /**
   * The ID of the association.
   */
  public open fun attrAssociationId(): String = unwrap(this).getAttrAssociationId()

  /**
   * The unique identifier for this EKS Pod Identity association for a target IAM role.
   *
   * You put this value in the trust policy of the target role, in a `Condition` to match the
   * `sts.ExternalId` . This ensures that the target role can only be assumed by this association. This
   * prevents the *confused deputy problem* . For more information about the confused deputy problem,
   * see [The confused deputy
   * problem](https://docs.aws.amazon.com/IAM/latest/UserGuide/confused-deputy.html) in the *IAM User
   * Guide* .
   *
   * If you want to use the same target role with multiple associations or other roles, use
   * independent statements in the trust policy to allow `sts:AssumeRole` access from each role.
   */
  public open fun attrExternalId(): String = unwrap(this).getAttrExternalId()

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
   * The state of the automatic sessions tags.
   *
   * The value of *true* disables these tags.
   */
  public open fun disableSessionTags(): Any? = unwrap(this).getDisableSessionTags()

  /**
   * The state of the automatic sessions tags.
   *
   * The value of *true* disables these tags.
   */
  public open fun disableSessionTags(`value`: Boolean) {
    unwrap(this).setDisableSessionTags(`value`)
  }

  /**
   * The state of the automatic sessions tags.
   *
   * The value of *true* disables these tags.
   */
  public open fun disableSessionTags(`value`: IResolvable) {
    unwrap(this).setDisableSessionTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
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
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata that assists with categorization and organization.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the target IAM role to associate with the service account.
   */
  public open fun targetRoleArn(): String? = unwrap(this).getTargetRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the target IAM role to associate with the service account.
   */
  public open fun targetRoleArn(`value`: String) {
    unwrap(this).setTargetRoleArn(`value`)
  }

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
     * The state of the automatic sessions tags. The value of *true* disables these tags.
     *
     * EKS Pod Identity adds a pre-defined set of session tags when it assumes the role. You can use
     * these tags to author a single role that can work across resources by allowing access to AWS
     * resources based on matching tags. By default, EKS Pod Identity attaches six tags, including tags
     * for cluster name, namespace, and service account name. For the list of tags added by EKS Pod
     * Identity, see [List of session tags added by EKS Pod
     * Identity](https://docs.aws.amazon.com/eks/latest/userguide/pod-id-abac.html#pod-id-abac-tags) in
     * the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-disablesessiontags)
     * @param disableSessionTags The state of the automatic sessions tags. The value of *true*
     * disables these tags. 
     */
    public fun disableSessionTags(disableSessionTags: Boolean)

    /**
     * The state of the automatic sessions tags. The value of *true* disables these tags.
     *
     * EKS Pod Identity adds a pre-defined set of session tags when it assumes the role. You can use
     * these tags to author a single role that can work across resources by allowing access to AWS
     * resources based on matching tags. By default, EKS Pod Identity attaches six tags, including tags
     * for cluster name, namespace, and service account name. For the list of tags added by EKS Pod
     * Identity, see [List of session tags added by EKS Pod
     * Identity](https://docs.aws.amazon.com/eks/latest/userguide/pod-id-abac.html#pod-id-abac-tags) in
     * the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-disablesessiontags)
     * @param disableSessionTags The state of the automatic sessions tags. The value of *true*
     * disables these tags. 
     */
    public fun disableSessionTags(disableSessionTags: IResolvable)

    /**
     * The name of the Kubernetes namespace inside the cluster to create the association in.
     *
     * The service account and the Pods that use the service account must be in this namespace.
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
     * containers in the Pods that use this service account.
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

    /**
     * The Amazon Resource Name (ARN) of the target IAM role to associate with the service account.
     *
     * This role is assumed by using the EKS Pod Identity association role, then the credentials for
     * this role are injected into the Pod.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-targetrolearn)
     * @param targetRoleArn The Amazon Resource Name (ARN) of the target IAM role to associate with
     * the service account. 
     */
    public fun targetRoleArn(targetRoleArn: String)
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
     * The state of the automatic sessions tags. The value of *true* disables these tags.
     *
     * EKS Pod Identity adds a pre-defined set of session tags when it assumes the role. You can use
     * these tags to author a single role that can work across resources by allowing access to AWS
     * resources based on matching tags. By default, EKS Pod Identity attaches six tags, including tags
     * for cluster name, namespace, and service account name. For the list of tags added by EKS Pod
     * Identity, see [List of session tags added by EKS Pod
     * Identity](https://docs.aws.amazon.com/eks/latest/userguide/pod-id-abac.html#pod-id-abac-tags) in
     * the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-disablesessiontags)
     * @param disableSessionTags The state of the automatic sessions tags. The value of *true*
     * disables these tags. 
     */
    override fun disableSessionTags(disableSessionTags: Boolean) {
      cdkBuilder.disableSessionTags(disableSessionTags)
    }

    /**
     * The state of the automatic sessions tags. The value of *true* disables these tags.
     *
     * EKS Pod Identity adds a pre-defined set of session tags when it assumes the role. You can use
     * these tags to author a single role that can work across resources by allowing access to AWS
     * resources based on matching tags. By default, EKS Pod Identity attaches six tags, including tags
     * for cluster name, namespace, and service account name. For the list of tags added by EKS Pod
     * Identity, see [List of session tags added by EKS Pod
     * Identity](https://docs.aws.amazon.com/eks/latest/userguide/pod-id-abac.html#pod-id-abac-tags) in
     * the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-disablesessiontags)
     * @param disableSessionTags The state of the automatic sessions tags. The value of *true*
     * disables these tags. 
     */
    override fun disableSessionTags(disableSessionTags: IResolvable) {
      cdkBuilder.disableSessionTags(disableSessionTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * The name of the Kubernetes namespace inside the cluster to create the association in.
     *
     * The service account and the Pods that use the service account must be in this namespace.
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
     * containers in the Pods that use this service account.
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
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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

    /**
     * The Amazon Resource Name (ARN) of the target IAM role to associate with the service account.
     *
     * This role is assumed by using the EKS Pod Identity association role, then the credentials for
     * this role are injected into the Pod.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-podidentityassociation.html#cfn-eks-podidentityassociation-targetrolearn)
     * @param targetRoleArn The Amazon Resource Name (ARN) of the target IAM role to associate with
     * the service account. 
     */
    override fun targetRoleArn(targetRoleArn: String) {
      cdkBuilder.targetRoleArn(targetRoleArn)
    }

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
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.eks.CfnPodIdentityAssociation
  }
}
