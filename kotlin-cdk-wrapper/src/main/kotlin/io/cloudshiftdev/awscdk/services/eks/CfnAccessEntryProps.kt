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
 * Properties for defining a `CfnAccessEntry`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnAccessEntryProps cfnAccessEntryProps = CfnAccessEntryProps.builder()
 * .clusterName("clusterName")
 * .principalArn("principalArn")
 * // the properties below are optional
 * .accessPolicies(List.of(AccessPolicyProperty.builder()
 * .accessScope(AccessScopeProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .namespaces(List.of("namespaces"))
 * .build())
 * .policyArn("policyArn")
 * .build()))
 * .kubernetesGroups(List.of("kubernetesGroups"))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .type("type")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html)
 */
public interface CfnAccessEntryProps {
  /**
   * The access policies to associate to the access entry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
   */
  public fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  /**
   * The name of your cluster.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-clustername)
   */
  public fun clusterName(): String

  /**
   * The value for `name` that you've specified for `kind: Group` as a `subject` in a Kubernetes
   * `RoleBinding` or `ClusterRoleBinding` object.
   *
   * Amazon EKS doesn't confirm that the value for `name` exists in any bindings on your cluster.
   * You can specify one or more names.
   *
   * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects that
   * you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified in a
   * binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
   * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see [Using RBAC Authorization in the
   * Kubernetes
   * documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
   * .
   *
   * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
   * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to the
   * access entry using `AssociateAccessPolicy` . If you associate any access policies, the
   * `principalARN` has all permissions assigned in the associated access policies and all permissions
   * in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound to.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-kubernetesgroups)
   */
  public fun kubernetesGroups(): List<String> = unwrap(this).getKubernetesGroups() ?: emptyList()

  /**
   * The ARN of the IAM principal for the `AccessEntry` .
   *
   * You can specify one ARN for each access entry. You can't specify the same ARN in more than one
   * access entry. This value can't be changed after access entry creation.
   *
   * The valid principals differ depending on the type of the access entry in the `type` field. The
   * only valid ARN is IAM roles for the types of access entries for nodes: ` ` . You can use every IAM
   * principal type for `STANDARD` access entries. You can't use the STS session principal type with
   * access entries because this is a temporary principal for each session and not a permanent identity
   * that can be assigned permissions.
   *
   * [IAM best
   * practices](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp)
   * recommend using IAM roles with temporary credentials, rather than IAM users with long-term
   * credentials.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-principalarn)
   */
  public fun principalArn(): String

  /**
   * Metadata that assists with categorization and organization.
   *
   * Each tag consists of a key and an optional value. You define both. Tags don't propagate to any
   * other cluster or AWS resources.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The type of the new access entry. Valid values are `Standard` , `FARGATE_LINUX` , `EC2_LINUX` ,
   * and `EC2_WINDOWS` .
   *
   * If the `principalArn` is for an IAM role that's used for self-managed Amazon EC2 nodes, specify
   * `EC2_LINUX` or `EC2_WINDOWS` . Amazon EKS grants the necessary permissions to the node for you. If
   * the `principalArn` is for any other purpose, specify `STANDARD` . If you don't specify a value,
   * Amazon EKS sets the value to `STANDARD` . It's unnecessary to create access entries for IAM roles
   * used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS creates entries in the
   * `aws-auth` `ConfigMap` for the roles. You can't change this value once you've created the access
   * entry.
   *
   * If you set the value to `EC2_LINUX` or `EC2_WINDOWS` , you can't specify values for
   * `kubernetesGroups` , or associate an `AccessPolicy` to the access entry.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-type)
   */
  public fun type(): String? = unwrap(this).getType()

  /**
   * The username to authenticate to Kubernetes with.
   *
   * We recommend not specifying a username and letting Amazon EKS specify it for you. For more
   * information about the value Amazon EKS specifies for you, or constraints before specifying your
   * own username, see [Creating access
   * entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries)
   * in the *Amazon EKS User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-username)
   */
  public fun username(): String? = unwrap(this).getUsername()

  /**
   * A builder for [CfnAccessEntryProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param accessPolicies The access policies to associate to the access entry.
     */
    public fun accessPolicies(accessPolicies: IResolvable)

    /**
     * @param accessPolicies The access policies to associate to the access entry.
     */
    public fun accessPolicies(accessPolicies: List<Any>)

    /**
     * @param accessPolicies The access policies to associate to the access entry.
     */
    public fun accessPolicies(vararg accessPolicies: Any)

    /**
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

    /**
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object.
     * Amazon EKS doesn't confirm that the value for `name` exists in any bindings on your cluster.
     * You can specify one or more names.
     *
     * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects
     * that you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified in a
     * binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
     * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see [Using RBAC Authorization in the
     * Kubernetes
     * documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * .
     *
     * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
     * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to
     * the access entry using `AssociateAccessPolicy` . If you associate any access policies, the
     * `principalARN` has all permissions assigned in the associated access policies and all
     * permissions in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound to.
     */
    public fun kubernetesGroups(kubernetesGroups: List<String>)

    /**
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object.
     * Amazon EKS doesn't confirm that the value for `name` exists in any bindings on your cluster.
     * You can specify one or more names.
     *
     * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects
     * that you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified in a
     * binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
     * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see [Using RBAC Authorization in the
     * Kubernetes
     * documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * .
     *
     * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
     * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to
     * the access entry using `AssociateAccessPolicy` . If you associate any access policies, the
     * `principalARN` has all permissions assigned in the associated access policies and all
     * permissions in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound to.
     */
    public fun kubernetesGroups(vararg kubernetesGroups: String)

    /**
     * @param principalArn The ARN of the IAM principal for the `AccessEntry` . 
     * You can specify one ARN for each access entry. You can't specify the same ARN in more than
     * one access entry. This value can't be changed after access entry creation.
     *
     * The valid principals differ depending on the type of the access entry in the `type` field.
     * The only valid ARN is IAM roles for the types of access entries for nodes: ` ` . You can use
     * every IAM principal type for `STANDARD` access entries. You can't use the STS session principal
     * type with access entries because this is a temporary principal for each session and not a
     * permanent identity that can be assigned permissions.
     *
     * [IAM best
     * practices](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp)
     * recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     */
    public fun principalArn(principalArn: String)

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

    /**
     * @param type The type of the new access entry. Valid values are `Standard` , `FARGATE_LINUX` ,
     * `EC2_LINUX` , and `EC2_WINDOWS` .
     * If the `principalArn` is for an IAM role that's used for self-managed Amazon EC2 nodes,
     * specify `EC2_LINUX` or `EC2_WINDOWS` . Amazon EKS grants the necessary permissions to the node
     * for you. If the `principalArn` is for any other purpose, specify `STANDARD` . If you don't
     * specify a value, Amazon EKS sets the value to `STANDARD` . It's unnecessary to create access
     * entries for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS
     * creates entries in the `aws-auth` `ConfigMap` for the roles. You can't change this value once
     * you've created the access entry.
     *
     * If you set the value to `EC2_LINUX` or `EC2_WINDOWS` , you can't specify values for
     * `kubernetesGroups` , or associate an `AccessPolicy` to the access entry.
     */
    public fun type(type: String)

    /**
     * @param username The username to authenticate to Kubernetes with.
     * We recommend not specifying a username and letting Amazon EKS specify it for you. For more
     * information about the value Amazon EKS specifies for you, or constraints before specifying your
     * own username, see [Creating access
     * entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries)
     * in the *Amazon EKS User Guide* .
     */
    public fun username(username: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAccessEntryProps.Builder =
        software.amazon.awscdk.services.eks.CfnAccessEntryProps.builder()

    /**
     * @param accessPolicies The access policies to associate to the access entry.
     */
    override fun accessPolicies(accessPolicies: IResolvable) {
      cdkBuilder.accessPolicies(accessPolicies.let(IResolvable::unwrap))
    }

    /**
     * @param accessPolicies The access policies to associate to the access entry.
     */
    override fun accessPolicies(accessPolicies: List<Any>) {
      cdkBuilder.accessPolicies(accessPolicies)
    }

    /**
     * @param accessPolicies The access policies to associate to the access entry.
     */
    override fun accessPolicies(vararg accessPolicies: Any): Unit =
        accessPolicies(accessPolicies.toList())

    /**
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object.
     * Amazon EKS doesn't confirm that the value for `name` exists in any bindings on your cluster.
     * You can specify one or more names.
     *
     * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects
     * that you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified in a
     * binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
     * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see [Using RBAC Authorization in the
     * Kubernetes
     * documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * .
     *
     * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
     * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to
     * the access entry using `AssociateAccessPolicy` . If you associate any access policies, the
     * `principalARN` has all permissions assigned in the associated access policies and all
     * permissions in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound to.
     */
    override fun kubernetesGroups(kubernetesGroups: List<String>) {
      cdkBuilder.kubernetesGroups(kubernetesGroups)
    }

    /**
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object.
     * Amazon EKS doesn't confirm that the value for `name` exists in any bindings on your cluster.
     * You can specify one or more names.
     *
     * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects
     * that you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified in a
     * binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
     * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see [Using RBAC Authorization in the
     * Kubernetes
     * documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * .
     *
     * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
     * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to
     * the access entry using `AssociateAccessPolicy` . If you associate any access policies, the
     * `principalARN` has all permissions assigned in the associated access policies and all
     * permissions in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound to.
     */
    override fun kubernetesGroups(vararg kubernetesGroups: String): Unit =
        kubernetesGroups(kubernetesGroups.toList())

    /**
     * @param principalArn The ARN of the IAM principal for the `AccessEntry` . 
     * You can specify one ARN for each access entry. You can't specify the same ARN in more than
     * one access entry. This value can't be changed after access entry creation.
     *
     * The valid principals differ depending on the type of the access entry in the `type` field.
     * The only valid ARN is IAM roles for the types of access entries for nodes: ` ` . You can use
     * every IAM principal type for `STANDARD` access entries. You can't use the STS session principal
     * type with access entries because this is a temporary principal for each session and not a
     * permanent identity that can be assigned permissions.
     *
     * [IAM best
     * practices](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp)
     * recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     */
    override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

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

    /**
     * @param type The type of the new access entry. Valid values are `Standard` , `FARGATE_LINUX` ,
     * `EC2_LINUX` , and `EC2_WINDOWS` .
     * If the `principalArn` is for an IAM role that's used for self-managed Amazon EC2 nodes,
     * specify `EC2_LINUX` or `EC2_WINDOWS` . Amazon EKS grants the necessary permissions to the node
     * for you. If the `principalArn` is for any other purpose, specify `STANDARD` . If you don't
     * specify a value, Amazon EKS sets the value to `STANDARD` . It's unnecessary to create access
     * entries for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS
     * creates entries in the `aws-auth` `ConfigMap` for the roles. You can't change this value once
     * you've created the access entry.
     *
     * If you set the value to `EC2_LINUX` or `EC2_WINDOWS` , you can't specify values for
     * `kubernetesGroups` , or associate an `AccessPolicy` to the access entry.
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * @param username The username to authenticate to Kubernetes with.
     * We recommend not specifying a username and letting Amazon EKS specify it for you. For more
     * information about the value Amazon EKS specifies for you, or constraints before specifying your
     * own username, see [Creating access
     * entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries)
     * in the *Amazon EKS User Guide* .
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntryProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntryProps,
  ) : CdkObject(cdkObject), CfnAccessEntryProps {
    /**
     * The access policies to associate to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
     */
    override fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-clustername)
     */
    override fun clusterName(): String = unwrap(this).getClusterName()

    /**
     * The value for `name` that you've specified for `kind: Group` as a `subject` in a Kubernetes
     * `RoleBinding` or `ClusterRoleBinding` object.
     *
     * Amazon EKS doesn't confirm that the value for `name` exists in any bindings on your cluster.
     * You can specify one or more names.
     *
     * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects
     * that you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified in a
     * binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
     * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see [Using RBAC Authorization in the
     * Kubernetes
     * documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * .
     *
     * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
     * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to
     * the access entry using `AssociateAccessPolicy` . If you associate any access policies, the
     * `principalARN` has all permissions assigned in the associated access policies and all
     * permissions in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-kubernetesgroups)
     */
    override fun kubernetesGroups(): List<String> = unwrap(this).getKubernetesGroups() ?:
        emptyList()

    /**
     * The ARN of the IAM principal for the `AccessEntry` .
     *
     * You can specify one ARN for each access entry. You can't specify the same ARN in more than
     * one access entry. This value can't be changed after access entry creation.
     *
     * The valid principals differ depending on the type of the access entry in the `type` field.
     * The only valid ARN is IAM roles for the types of access entries for nodes: ` ` . You can use
     * every IAM principal type for `STANDARD` access entries. You can't use the STS session principal
     * type with access entries because this is a temporary principal for each session and not a
     * permanent identity that can be assigned permissions.
     *
     * [IAM best
     * practices](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp)
     * recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-principalarn)
     */
    override fun principalArn(): String = unwrap(this).getPrincipalArn()

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The type of the new access entry. Valid values are `Standard` , `FARGATE_LINUX` , `EC2_LINUX`
     * , and `EC2_WINDOWS` .
     *
     * If the `principalArn` is for an IAM role that's used for self-managed Amazon EC2 nodes,
     * specify `EC2_LINUX` or `EC2_WINDOWS` . Amazon EKS grants the necessary permissions to the node
     * for you. If the `principalArn` is for any other purpose, specify `STANDARD` . If you don't
     * specify a value, Amazon EKS sets the value to `STANDARD` . It's unnecessary to create access
     * entries for IAM roles used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS
     * creates entries in the `aws-auth` `ConfigMap` for the roles. You can't change this value once
     * you've created the access entry.
     *
     * If you set the value to `EC2_LINUX` or `EC2_WINDOWS` , you can't specify values for
     * `kubernetesGroups` , or associate an `AccessPolicy` to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-type)
     */
    override fun type(): String? = unwrap(this).getType()

    /**
     * The username to authenticate to Kubernetes with.
     *
     * We recommend not specifying a username and letting Amazon EKS specify it for you. For more
     * information about the value Amazon EKS specifies for you, or constraints before specifying your
     * own username, see [Creating access
     * entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries)
     * in the *Amazon EKS User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-username)
     */
    override fun username(): String? = unwrap(this).getUsername()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessEntryProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntryProps):
        CfnAccessEntryProps = CdkObjectWrappers.wrap(cdkObject) as? CfnAccessEntryProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessEntryProps):
        software.amazon.awscdk.services.eks.CfnAccessEntryProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.eks.CfnAccessEntryProps
  }
}
