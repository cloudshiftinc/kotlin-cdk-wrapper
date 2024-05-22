@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
 * Creates an Amazon EKS add-on.
 *
 * Amazon EKS add-ons help to automate the provisioning and lifecycle management of common
 * operational software for Amazon EKS clusters. For more information, see [Amazon EKS
 * add-ons](https://docs.aws.amazon.com/eks/latest/userguide/eks-add-ons.html) in the *Amazon EKS User
 * Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnAddon cfnAddon = CfnAddon.Builder.create(this, "MyCfnAddon")
 * .addonName("addonName")
 * .clusterName("clusterName")
 * // the properties below are optional
 * .addonVersion("addonVersion")
 * .configurationValues("configurationValues")
 * .preserveOnDelete(false)
 * .resolveConflicts("resolveConflicts")
 * .serviceAccountRoleArn("serviceAccountRoleArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html)
 */
public open class CfnAddon(
  cdkObject: software.amazon.awscdk.services.eks.CfnAddon,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAddonProps,
  ) :
      this(software.amazon.awscdk.services.eks.CfnAddon(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAddonProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAddonProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAddonProps(props)
  )

  /**
   * The name of the add-on.
   */
  public open fun addonName(): String = unwrap(this).getAddonName()

  /**
   * The name of the add-on.
   */
  public open fun addonName(`value`: String) {
    unwrap(this).setAddonName(`value`)
  }

  /**
   * The version of the add-on.
   */
  public open fun addonVersion(): String? = unwrap(this).getAddonVersion()

  /**
   * The version of the add-on.
   */
  public open fun addonVersion(`value`: String) {
    unwrap(this).setAddonVersion(`value`)
  }

  /**
   * The ARN of the add-on, such as
   * `arn:aws:eks:us-west-2:111122223333:addon/1-19/vpc-cni/xxxxxxxx-xxxx-xxxx-xxxx-xxxxxxxxxxxx` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of your cluster.
   */
  public open fun clusterName(): String = unwrap(this).getClusterName()

  /**
   * The name of your cluster.
   */
  public open fun clusterName(`value`: String) {
    unwrap(this).setClusterName(`value`)
  }

  /**
   * The configuration values that you provided.
   */
  public open fun configurationValues(): String? = unwrap(this).getConfigurationValues()

  /**
   * The configuration values that you provided.
   */
  public open fun configurationValues(`value`: String) {
    unwrap(this).setConfigurationValues(`value`)
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
   * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
   * managing any settings for the add-on.
   */
  public open fun preserveOnDelete(): Any? = unwrap(this).getPreserveOnDelete()

  /**
   * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
   * managing any settings for the add-on.
   */
  public open fun preserveOnDelete(`value`: Boolean) {
    unwrap(this).setPreserveOnDelete(`value`)
  }

  /**
   * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
   * managing any settings for the add-on.
   */
  public open fun preserveOnDelete(`value`: IResolvable) {
    unwrap(this).setPreserveOnDelete(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * How to resolve field value conflicts for an Amazon EKS add-on.
   */
  public open fun resolveConflicts(): String? = unwrap(this).getResolveConflicts()

  /**
   * How to resolve field value conflicts for an Amazon EKS add-on.
   */
  public open fun resolveConflicts(`value`: String) {
    unwrap(this).setResolveConflicts(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account.
   */
  public open fun serviceAccountRoleArn(): String? = unwrap(this).getServiceAccountRoleArn()

  /**
   * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account.
   */
  public open fun serviceAccountRoleArn(`value`: String) {
    unwrap(this).setServiceAccountRoleArn(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The metadata that you apply to the add-on to assist with categorization and organization.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The metadata that you apply to the add-on to assist with categorization and organization.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The metadata that you apply to the add-on to assist with categorization and organization.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.CfnAddon].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the add-on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonname)
     * @param addonName The name of the add-on. 
     */
    public fun addonName(addonName: String)

    /**
     * The version of the add-on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonversion)
     * @param addonVersion The version of the add-on. 
     */
    public fun addonVersion(addonVersion: String)

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-clustername)
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * The configuration values that you provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-configurationvalues)
     * @param configurationValues The configuration values that you provided. 
     */
    public fun configurationValues(configurationValues: String)

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-preserveondelete)
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on. 
     */
    public fun preserveOnDelete(preserveOnDelete: Boolean)

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-preserveondelete)
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on. 
     */
    public fun preserveOnDelete(preserveOnDelete: IResolvable)

    /**
     * How to resolve field value conflicts for an Amazon EKS add-on.
     *
     * Conflicts are handled based on the value you choose:
     *
     * * *None* – If the self-managed version of the add-on is installed on your cluster, Amazon EKS
     * doesn't change the value. Creation of the add-on might fail.
     * * *Overwrite* – If the self-managed version of the add-on is installed on your cluster and
     * the Amazon EKS default value is different than the existing value, Amazon EKS changes the value
     * to the Amazon EKS default value.
     * * *Preserve* – This is similar to the NONE option. If the self-managed version of the add-on
     * is installed on your cluster Amazon EKS doesn't change the add-on resource properties. Creation
     * of the add-on might fail if conflicts are detected. This option works differently during the
     * update operation. For more information, see
     * [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) .
     *
     * If you don't currently have the self-managed version of the add-on installed on your cluster,
     * the Amazon EKS add-on is installed. Amazon EKS sets all values to default values, regardless of
     * the option that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-resolveconflicts)
     * @param resolveConflicts How to resolve field value conflicts for an Amazon EKS add-on. 
     */
    public fun resolveConflicts(resolveConflicts: String)

    /**
     * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service
     * account.
     *
     * The role must be assigned the IAM permissions required by the add-on. If you don't specify an
     * existing IAM role, then the add-on uses the permissions assigned to the node IAM role. For more
     * information, see [Amazon EKS node IAM
     * role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html) in the *Amazon EKS
     * User Guide* .
     *
     *
     * To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created
     * for your cluster. For more information, see [Enabling IAM roles for service accounts on your
     * cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the *Amazon EKS User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-serviceaccountrolearn)
     * @param serviceAccountRoleArn The Amazon Resource Name (ARN) of an existing IAM role to bind
     * to the add-on's service account. 
     */
    public fun serviceAccountRoleArn(serviceAccountRoleArn: String)

    /**
     * The metadata that you apply to the add-on to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-tags)
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The metadata that you apply to the add-on to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-tags)
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAddon.Builder =
        software.amazon.awscdk.services.eks.CfnAddon.Builder.create(scope, id)

    /**
     * The name of the add-on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonname)
     * @param addonName The name of the add-on. 
     */
    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    /**
     * The version of the add-on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonversion)
     * @param addonVersion The version of the add-on. 
     */
    override fun addonVersion(addonVersion: String) {
      cdkBuilder.addonVersion(addonVersion)
    }

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-clustername)
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * The configuration values that you provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-configurationvalues)
     * @param configurationValues The configuration values that you provided. 
     */
    override fun configurationValues(configurationValues: String) {
      cdkBuilder.configurationValues(configurationValues)
    }

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-preserveondelete)
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on. 
     */
    override fun preserveOnDelete(preserveOnDelete: Boolean) {
      cdkBuilder.preserveOnDelete(preserveOnDelete)
    }

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-preserveondelete)
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on. 
     */
    override fun preserveOnDelete(preserveOnDelete: IResolvable) {
      cdkBuilder.preserveOnDelete(preserveOnDelete.let(IResolvable.Companion::unwrap))
    }

    /**
     * How to resolve field value conflicts for an Amazon EKS add-on.
     *
     * Conflicts are handled based on the value you choose:
     *
     * * *None* – If the self-managed version of the add-on is installed on your cluster, Amazon EKS
     * doesn't change the value. Creation of the add-on might fail.
     * * *Overwrite* – If the self-managed version of the add-on is installed on your cluster and
     * the Amazon EKS default value is different than the existing value, Amazon EKS changes the value
     * to the Amazon EKS default value.
     * * *Preserve* – This is similar to the NONE option. If the self-managed version of the add-on
     * is installed on your cluster Amazon EKS doesn't change the add-on resource properties. Creation
     * of the add-on might fail if conflicts are detected. This option works differently during the
     * update operation. For more information, see
     * [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) .
     *
     * If you don't currently have the self-managed version of the add-on installed on your cluster,
     * the Amazon EKS add-on is installed. Amazon EKS sets all values to default values, regardless of
     * the option that you specify.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-resolveconflicts)
     * @param resolveConflicts How to resolve field value conflicts for an Amazon EKS add-on. 
     */
    override fun resolveConflicts(resolveConflicts: String) {
      cdkBuilder.resolveConflicts(resolveConflicts)
    }

    /**
     * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service
     * account.
     *
     * The role must be assigned the IAM permissions required by the add-on. If you don't specify an
     * existing IAM role, then the add-on uses the permissions assigned to the node IAM role. For more
     * information, see [Amazon EKS node IAM
     * role](https://docs.aws.amazon.com/eks/latest/userguide/create-node-role.html) in the *Amazon EKS
     * User Guide* .
     *
     *
     * To specify an existing IAM role, you must have an IAM OpenID Connect (OIDC) provider created
     * for your cluster. For more information, see [Enabling IAM roles for service accounts on your
     * cluster](https://docs.aws.amazon.com/eks/latest/userguide/enable-iam-roles-for-service-accounts.html)
     * in the *Amazon EKS User Guide* .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-serviceaccountrolearn)
     * @param serviceAccountRoleArn The Amazon Resource Name (ARN) of an existing IAM role to bind
     * to the add-on's service account. 
     */
    override fun serviceAccountRoleArn(serviceAccountRoleArn: String) {
      cdkBuilder.serviceAccountRoleArn(serviceAccountRoleArn)
    }

    /**
     * The metadata that you apply to the add-on to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-tags)
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The metadata that you apply to the add-on to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-tags)
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnAddon = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eks.CfnAddon.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAddon {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAddon(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAddon): CfnAddon =
        CfnAddon(cdkObject)

    internal fun unwrap(wrapped: CfnAddon): software.amazon.awscdk.services.eks.CfnAddon =
        wrapped.cdkObject as software.amazon.awscdk.services.eks.CfnAddon
  }
}
