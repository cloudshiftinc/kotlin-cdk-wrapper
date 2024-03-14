package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnAddonProps {
  /**
   * The name of the add-on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonname)
   */
  public fun addonName(): String

  /**
   * The version of the add-on.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonversion)
   */
  public fun addonVersion(): String? = unwrap(this).getAddonVersion()

  /**
   * The name of your cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-clustername)
   */
  public fun clusterName(): String

  /**
   * The configuration values that you provided.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-configurationvalues)
   */
  public fun configurationValues(): String? = unwrap(this).getConfigurationValues()

  /**
   * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
   * managing any settings for the add-on.
   *
   * If an IAM account is associated with the add-on, it isn't removed.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-preserveondelete)
   */
  public fun preserveOnDelete(): Any? = unwrap(this).getPreserveOnDelete()

  /**
   * How to resolve field value conflicts for an Amazon EKS add-on.
   *
   * Conflicts are handled based on the value you choose:
   *
   * * *None* – If the self-managed version of the add-on is installed on your cluster, Amazon EKS
   * doesn't change the value. Creation of the add-on might fail.
   * * *Overwrite* – If the self-managed version of the add-on is installed on your cluster and the
   * Amazon EKS default value is different than the existing value, Amazon EKS changes the value to the
   * Amazon EKS default value.
   * * *Preserve* – This is similar to the NONE option. If the self-managed version of the add-on is
   * installed on your cluster Amazon EKS doesn't change the add-on resource properties. Creation of
   * the add-on might fail if conflicts are detected. This option works differently during the update
   * operation. For more information, see
   * [UpdateAddon](https://docs.aws.amazon.com/eks/latest/APIReference/API_UpdateAddon.html) .
   *
   * If you don't currently have the self-managed version of the add-on installed on your cluster,
   * the Amazon EKS add-on is installed. Amazon EKS sets all values to default values, regardless of
   * the option that you specify.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-resolveconflicts)
   */
  public fun resolveConflicts(): String? = unwrap(this).getResolveConflicts()

  /**
   * The Amazon Resource Name (ARN) of an existing IAM role to bind to the add-on's service account.
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
   */
  public fun serviceAccountRoleArn(): String? = unwrap(this).getServiceAccountRoleArn()

  /**
   * The metadata that you apply to the add-on to assist with categorization and organization.
   *
   * Each tag consists of a key and an optional value, both of which you define. Add-on tags do not
   * propagate to any other resources associated with the cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnAddonProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addonName The name of the add-on. 
     */
    public fun addonName(addonName: String)

    /**
     * @param addonVersion The version of the add-on.
     */
    public fun addonVersion(addonVersion: String)

    /**
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param configurationValues The configuration values that you provided.
     */
    public fun configurationValues(configurationValues: String)

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on.
     * If an IAM account is associated with the add-on, it isn't removed.
     */
    public fun preserveOnDelete(preserveOnDelete: Boolean)

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on.
     * If an IAM account is associated with the add-on, it isn't removed.
     */
    public fun preserveOnDelete(preserveOnDelete: IResolvable)

    /**
     * @param resolveConflicts How to resolve field value conflicts for an Amazon EKS add-on.
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
     */
    public fun resolveConflicts(resolveConflicts: String)

    /**
     * @param serviceAccountRoleArn The Amazon Resource Name (ARN) of an existing IAM role to bind
     * to the add-on's service account.
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
     */
    public fun serviceAccountRoleArn(serviceAccountRoleArn: String)

    /**
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAddonProps.Builder =
        software.amazon.awscdk.services.eks.CfnAddonProps.builder()

    /**
     * @param addonName The name of the add-on. 
     */
    override fun addonName(addonName: String) {
      cdkBuilder.addonName(addonName)
    }

    /**
     * @param addonVersion The version of the add-on.
     */
    override fun addonVersion(addonVersion: String) {
      cdkBuilder.addonVersion(addonVersion)
    }

    /**
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param configurationValues The configuration values that you provided.
     */
    override fun configurationValues(configurationValues: String) {
      cdkBuilder.configurationValues(configurationValues)
    }

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on.
     * If an IAM account is associated with the add-on, it isn't removed.
     */
    override fun preserveOnDelete(preserveOnDelete: Boolean) {
      cdkBuilder.preserveOnDelete(preserveOnDelete)
    }

    /**
     * @param preserveOnDelete Specifying this option preserves the add-on software on your cluster
     * but Amazon EKS stops managing any settings for the add-on.
     * If an IAM account is associated with the add-on, it isn't removed.
     */
    override fun preserveOnDelete(preserveOnDelete: IResolvable) {
      cdkBuilder.preserveOnDelete(preserveOnDelete.let(IResolvable::unwrap))
    }

    /**
     * @param resolveConflicts How to resolve field value conflicts for an Amazon EKS add-on.
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
     */
    override fun resolveConflicts(resolveConflicts: String) {
      cdkBuilder.resolveConflicts(resolveConflicts)
    }

    /**
     * @param serviceAccountRoleArn The Amazon Resource Name (ARN) of an existing IAM role to bind
     * to the add-on's service account.
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
     */
    override fun serviceAccountRoleArn(serviceAccountRoleArn: String) {
      cdkBuilder.serviceAccountRoleArn(serviceAccountRoleArn)
    }

    /**
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The metadata that you apply to the add-on to assist with categorization and
     * organization.
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.eks.CfnAddonProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnAddonProps,
  ) : CdkObject(cdkObject), CfnAddonProps {
    /**
     * The name of the add-on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonname)
     */
    override fun addonName(): String = unwrap(this).getAddonName()

    /**
     * The version of the add-on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-addonversion)
     */
    override fun addonVersion(): String? = unwrap(this).getAddonVersion()

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The configuration values that you provided.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-configurationvalues)
     */
    override fun configurationValues(): String? = unwrap(this).getConfigurationValues()

    /**
     * Specifying this option preserves the add-on software on your cluster but Amazon EKS stops
     * managing any settings for the add-on.
     *
     * If an IAM account is associated with the add-on, it isn't removed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-preserveondelete)
     */
    override fun preserveOnDelete(): Any? = unwrap(this).getPreserveOnDelete()

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
     */
    override fun resolveConflicts(): String? = unwrap(this).getResolveConflicts()

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
     */
    override fun serviceAccountRoleArn(): String? = unwrap(this).getServiceAccountRoleArn()

    /**
     * The metadata that you apply to the add-on to assist with categorization and organization.
     *
     * Each tag consists of a key and an optional value, both of which you define. Add-on tags do
     * not propagate to any other resources associated with the cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-addon.html#cfn-eks-addon-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAddonProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAddonProps): CfnAddonProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAddonProps): software.amazon.awscdk.services.eks.CfnAddonProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.eks.CfnAddonProps
  }
}
