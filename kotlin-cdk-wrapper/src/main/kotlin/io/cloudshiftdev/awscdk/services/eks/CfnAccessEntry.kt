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
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an access entry.
 *
 * An access entry allows an IAM principal to access your cluster. Access entries can replace the
 * need to maintain entries in the `aws-auth` `ConfigMap` for authentication. You have the following
 * options for authorizing an IAM principal to access Kubernetes objects on your cluster: Kubernetes
 * role-based access control (RBAC), Amazon EKS, or both. Kubernetes RBAC authorization requires you to
 * create and manage Kubernetes `Role` , `ClusterRole` , `RoleBinding` , and `ClusterRoleBinding`
 * objects, in addition to managing access entries. If you use Amazon EKS authorization exclusively,
 * you don't need to create and manage Kubernetes `Role` , `ClusterRole` , `RoleBinding` , and
 * `ClusterRoleBinding` objects.
 *
 * For more information about access entries, see [Access
 * entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html) in the *Amazon EKS
 * User Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * CfnAccessEntry cfnAccessEntry = CfnAccessEntry.Builder.create(this, "MyCfnAccessEntry")
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
public open class CfnAccessEntry(
  cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessEntryProps,
  ) :
      this(software.amazon.awscdk.services.eks.CfnAccessEntry(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnAccessEntryProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnAccessEntryProps.Builder.() -> Unit,
  ) : this(scope, id, CfnAccessEntryProps(props)
  )

  /**
   * The access policies to associate to the access entry.
   */
  public open fun accessPolicies(): Any? = unwrap(this).getAccessPolicies()

  /**
   * The access policies to associate to the access entry.
   */
  public open fun accessPolicies(`value`: IResolvable) {
    unwrap(this).setAccessPolicies(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The access policies to associate to the access entry.
   */
  public open fun accessPolicies(`value`: List<Any>) {
    unwrap(this).setAccessPolicies(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The access policies to associate to the access entry.
   */
  public open fun accessPolicies(vararg `value`: Any): Unit = accessPolicies(`value`.toList())

  /**
   * The ARN of the access entry.
   */
  public open fun attrAccessEntryArn(): String = unwrap(this).getAttrAccessEntryArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

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
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The value for `name` that you've specified for `kind: Group` as a `subject` in a Kubernetes
   * `RoleBinding` or `ClusterRoleBinding` object.
   */
  public open fun kubernetesGroups(): List<String> = unwrap(this).getKubernetesGroups() ?:
      emptyList()

  /**
   * The value for `name` that you've specified for `kind: Group` as a `subject` in a Kubernetes
   * `RoleBinding` or `ClusterRoleBinding` object.
   */
  public open fun kubernetesGroups(`value`: List<String>) {
    unwrap(this).setKubernetesGroups(`value`)
  }

  /**
   * The value for `name` that you've specified for `kind: Group` as a `subject` in a Kubernetes
   * `RoleBinding` or `ClusterRoleBinding` object.
   */
  public open fun kubernetesGroups(vararg `value`: String): Unit =
      kubernetesGroups(`value`.toList())

  /**
   * The ARN of the IAM principal for the `AccessEntry` .
   */
  public open fun principalArn(): String = unwrap(this).getPrincipalArn()

  /**
   * The ARN of the IAM principal for the `AccessEntry` .
   */
  public open fun principalArn(`value`: String) {
    unwrap(this).setPrincipalArn(`value`)
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
   * The type of the new access entry.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type of the new access entry.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * The username to authenticate to Kubernetes with.
   */
  public open fun username(): String? = unwrap(this).getUsername()

  /**
   * The username to authenticate to Kubernetes with.
   */
  public open fun username(`value`: String) {
    unwrap(this).setUsername(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.eks.CfnAccessEntry].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The access policies to associate to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
     * @param accessPolicies The access policies to associate to the access entry. 
     */
    public fun accessPolicies(accessPolicies: IResolvable)

    /**
     * The access policies to associate to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
     * @param accessPolicies The access policies to associate to the access entry. 
     */
    public fun accessPolicies(accessPolicies: List<Any>)

    /**
     * The access policies to associate to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
     * @param accessPolicies The access policies to associate to the access entry. 
     */
    public fun accessPolicies(vararg accessPolicies: Any)

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-clustername)
     * @param clusterName The name of your cluster. 
     */
    public fun clusterName(clusterName: String)

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
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object. 
     */
    public fun kubernetesGroups(kubernetesGroups: List<String>)

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
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object. 
     */
    public fun kubernetesGroups(vararg kubernetesGroups: String)

    /**
     * The ARN of the IAM principal for the `AccessEntry` .
     *
     * You can specify one ARN for each access entry. You can't specify the same ARN in more than
     * one access entry. This value can't be changed after access entry creation.
     *
     * The valid principals differ depending on the type of the access entry in the `type` field.
     * For `STANDARD` access entries, you can use every IAM principal type. For nodes ( `EC2` (for EKS
     * Auto Mode), `EC2_LINUX` , `EC2_WINDOWS` , `FARGATE_LINUX` , and `HYBRID_LINUX` ), the only valid
     * ARN is IAM roles. You can't use the STS session principal type with access entries because this
     * is a temporary principal for each session and not a permanent identity that can be assigned
     * permissions.
     *
     * [IAM best
     * practices](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp)
     * recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-principalarn)
     * @param principalArn The ARN of the IAM principal for the `AccessEntry` . 
     */
    public fun principalArn(principalArn: String)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The type of the new access entry.
     *
     * Valid values are `STANDARD` , `FARGATE_LINUX` , `EC2_LINUX` , `EC2_WINDOWS` , `EC2` (for EKS
     * Auto Mode), `HYBRID_LINUX` , and `HYPERPOD_LINUX` .
     *
     * If the `principalArn` is for an IAM role that's used for self-managed Amazon EC2 nodes,
     * specify `EC2_LINUX` or `EC2_WINDOWS` . Amazon EKS grants the necessary permissions to the node
     * for you. If the `principalArn` is for any other purpose, specify `STANDARD` . If you don't
     * specify a value, Amazon EKS sets the value to `STANDARD` . If you have the access mode of the
     * cluster set to `API_AND_CONFIG_MAP` , it's unnecessary to create access entries for IAM roles
     * used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS creates entries in
     * the `aws-auth` `ConfigMap` for the roles. You can't change this value once you've created the
     * access entry.
     *
     * If you set the value to `EC2_LINUX` or `EC2_WINDOWS` , you can't specify values for
     * `kubernetesGroups` , or associate an `AccessPolicy` to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-type)
     * @param type The type of the new access entry. 
     */
    public fun type(type: String)

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
     * @param username The username to authenticate to Kubernetes with. 
     */
    public fun username(username: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.eks.CfnAccessEntry.Builder =
        software.amazon.awscdk.services.eks.CfnAccessEntry.Builder.create(scope, id)

    /**
     * The access policies to associate to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
     * @param accessPolicies The access policies to associate to the access entry. 
     */
    override fun accessPolicies(accessPolicies: IResolvable) {
      cdkBuilder.accessPolicies(accessPolicies.let(IResolvable.Companion::unwrap))
    }

    /**
     * The access policies to associate to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
     * @param accessPolicies The access policies to associate to the access entry. 
     */
    override fun accessPolicies(accessPolicies: List<Any>) {
      cdkBuilder.accessPolicies(accessPolicies.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The access policies to associate to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-accesspolicies)
     * @param accessPolicies The access policies to associate to the access entry. 
     */
    override fun accessPolicies(vararg accessPolicies: Any): Unit =
        accessPolicies(accessPolicies.toList())

    /**
     * The name of your cluster.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-clustername)
     * @param clusterName The name of your cluster. 
     */
    override fun clusterName(clusterName: String) {
      cdkBuilder.clusterName(clusterName)
    }

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
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object. 
     */
    override fun kubernetesGroups(kubernetesGroups: List<String>) {
      cdkBuilder.kubernetesGroups(kubernetesGroups)
    }

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
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     * `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object. 
     */
    override fun kubernetesGroups(vararg kubernetesGroups: String): Unit =
        kubernetesGroups(kubernetesGroups.toList())

    /**
     * The ARN of the IAM principal for the `AccessEntry` .
     *
     * You can specify one ARN for each access entry. You can't specify the same ARN in more than
     * one access entry. This value can't be changed after access entry creation.
     *
     * The valid principals differ depending on the type of the access entry in the `type` field.
     * For `STANDARD` access entries, you can use every IAM principal type. For nodes ( `EC2` (for EKS
     * Auto Mode), `EC2_LINUX` , `EC2_WINDOWS` , `FARGATE_LINUX` , and `HYBRID_LINUX` ), the only valid
     * ARN is IAM roles. You can't use the STS session principal type with access entries because this
     * is a temporary principal for each session and not a permanent identity that can be assigned
     * permissions.
     *
     * [IAM best
     * practices](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp)
     * recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-principalarn)
     * @param principalArn The ARN of the IAM principal for the `AccessEntry` . 
     */
    override fun principalArn(principalArn: String) {
      cdkBuilder.principalArn(principalArn)
    }

    /**
     * Metadata that assists with categorization and organization.
     *
     * Each tag consists of a key and an optional value. You define both. Tags don't propagate to
     * any other cluster or AWS resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-tags)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-tags)
     * @param tags Metadata that assists with categorization and organization. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The type of the new access entry.
     *
     * Valid values are `STANDARD` , `FARGATE_LINUX` , `EC2_LINUX` , `EC2_WINDOWS` , `EC2` (for EKS
     * Auto Mode), `HYBRID_LINUX` , and `HYPERPOD_LINUX` .
     *
     * If the `principalArn` is for an IAM role that's used for self-managed Amazon EC2 nodes,
     * specify `EC2_LINUX` or `EC2_WINDOWS` . Amazon EKS grants the necessary permissions to the node
     * for you. If the `principalArn` is for any other purpose, specify `STANDARD` . If you don't
     * specify a value, Amazon EKS sets the value to `STANDARD` . If you have the access mode of the
     * cluster set to `API_AND_CONFIG_MAP` , it's unnecessary to create access entries for IAM roles
     * used with Fargate profiles or managed Amazon EC2 nodes, because Amazon EKS creates entries in
     * the `aws-auth` `ConfigMap` for the roles. You can't change this value once you've created the
     * access entry.
     *
     * If you set the value to `EC2_LINUX` or `EC2_WINDOWS` , you can't specify values for
     * `kubernetesGroups` , or associate an `AccessPolicy` to the access entry.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eks-accessentry.html#cfn-eks-accessentry-type)
     * @param type The type of the new access entry. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

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
     * @param username The username to authenticate to Kubernetes with. 
     */
    override fun username(username: String) {
      cdkBuilder.username(username)
    }

    public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntry = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.eks.CfnAccessEntry.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessEntry {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessEntry(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry): CfnAccessEntry
        = CfnAccessEntry(cdkObject)

    internal fun unwrap(wrapped: CfnAccessEntry): software.amazon.awscdk.services.eks.CfnAccessEntry
        = wrapped.cdkObject as software.amazon.awscdk.services.eks.CfnAccessEntry
  }

  /**
   * An access policy includes permissions that allow Amazon EKS to authorize an IAM principal to
   * work with Kubernetes objects on your cluster.
   *
   * The policies are managed by Amazon EKS, but they're not IAM policies. You can't view the
   * permissions in the policies using the API. The permissions for many of the policies are similar to
   * the Kubernetes `cluster-admin` , `admin` , `edit` , and `view` cluster roles. For more information
   * about these cluster roles, see [User-facing
   * roles](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles)
   * in the Kubernetes documentation. To view the contents of the policies, see [Access policy
   * permissions](https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html#access-policy-permissions)
   * in the *Amazon EKS User Guide* .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * AccessPolicyProperty accessPolicyProperty = AccessPolicyProperty.builder()
   * .accessScope(AccessScopeProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .namespaces(List.of("namespaces"))
   * .build())
   * .policyArn("policyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accesspolicy.html)
   */
  public interface AccessPolicyProperty {
    /**
     * The scope of an `AccessPolicy` that's associated to an `AccessEntry` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accesspolicy.html#cfn-eks-accessentry-accesspolicy-accessscope)
     */
    public fun accessScope(): Any

    /**
     * The ARN of the access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accesspolicy.html#cfn-eks-accessentry-accesspolicy-policyarn)
     */
    public fun policyArn(): String

    /**
     * A builder for [AccessPolicyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . 
       */
      public fun accessScope(accessScope: IResolvable)

      /**
       * @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . 
       */
      public fun accessScope(accessScope: AccessScopeProperty)

      /**
       * @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5d63cbcdfb4374595a500769eefa1674960e340dae629f9832bd17cb4ba4480")
      public fun accessScope(accessScope: AccessScopeProperty.Builder.() -> Unit)

      /**
       * @param policyArn The ARN of the access policy. 
       */
      public fun policyArn(policyArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty.Builder =
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty.builder()

      /**
       * @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . 
       */
      override fun accessScope(accessScope: IResolvable) {
        cdkBuilder.accessScope(accessScope.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . 
       */
      override fun accessScope(accessScope: AccessScopeProperty) {
        cdkBuilder.accessScope(accessScope.let(AccessScopeProperty.Companion::unwrap))
      }

      /**
       * @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b5d63cbcdfb4374595a500769eefa1674960e340dae629f9832bd17cb4ba4480")
      override fun accessScope(accessScope: AccessScopeProperty.Builder.() -> Unit): Unit =
          accessScope(AccessScopeProperty(accessScope))

      /**
       * @param policyArn The ARN of the access policy. 
       */
      override fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty,
    ) : CdkObject(cdkObject),
        AccessPolicyProperty {
      /**
       * The scope of an `AccessPolicy` that's associated to an `AccessEntry` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accesspolicy.html#cfn-eks-accessentry-accesspolicy-accessscope)
       */
      override fun accessScope(): Any = unwrap(this).getAccessScope()

      /**
       * The ARN of the access policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accesspolicy.html#cfn-eks-accessentry-accesspolicy-policyarn)
       */
      override fun policyArn(): String = unwrap(this).getPolicyArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty):
          AccessPolicyProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessPolicyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPolicyProperty):
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessPolicyProperty
    }
  }

  /**
   * The scope of an `AccessPolicy` that's associated to an `AccessEntry` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.eks.*;
   * AccessScopeProperty accessScopeProperty = AccessScopeProperty.builder()
   * .type("type")
   * // the properties below are optional
   * .namespaces(List.of("namespaces"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accessscope.html)
   */
  public interface AccessScopeProperty {
    /**
     * A Kubernetes `namespace` that an access policy is scoped to.
     *
     * A value is required if you specified `namespace` for `Type` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accessscope.html#cfn-eks-accessentry-accessscope-namespaces)
     */
    public fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()

    /**
     * The scope type of an access policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accessscope.html#cfn-eks-accessentry-accessscope-type)
     */
    public fun type(): String

    /**
     * A builder for [AccessScopeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param namespaces A Kubernetes `namespace` that an access policy is scoped to.
       * A value is required if you specified `namespace` for `Type` .
       */
      public fun namespaces(namespaces: List<String>)

      /**
       * @param namespaces A Kubernetes `namespace` that an access policy is scoped to.
       * A value is required if you specified `namespace` for `Type` .
       */
      public fun namespaces(vararg namespaces: String)

      /**
       * @param type The scope type of an access policy. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty.Builder =
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty.builder()

      /**
       * @param namespaces A Kubernetes `namespace` that an access policy is scoped to.
       * A value is required if you specified `namespace` for `Type` .
       */
      override fun namespaces(namespaces: List<String>) {
        cdkBuilder.namespaces(namespaces)
      }

      /**
       * @param namespaces A Kubernetes `namespace` that an access policy is scoped to.
       * A value is required if you specified `namespace` for `Type` .
       */
      override fun namespaces(vararg namespaces: String): Unit = namespaces(namespaces.toList())

      /**
       * @param type The scope type of an access policy. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build(): software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty,
    ) : CdkObject(cdkObject),
        AccessScopeProperty {
      /**
       * A Kubernetes `namespace` that an access policy is scoped to.
       *
       * A value is required if you specified `namespace` for `Type` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accessscope.html#cfn-eks-accessentry-accessscope-namespaces)
       */
      override fun namespaces(): List<String> = unwrap(this).getNamespaces() ?: emptyList()

      /**
       * The scope type of an access policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-eks-accessentry-accessscope.html#cfn-eks-accessentry-accessscope-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessScopeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty):
          AccessScopeProperty = CdkObjectWrappers.wrap(cdkObject) as? AccessScopeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessScopeProperty):
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.eks.CfnAccessEntry.AccessScopeProperty
    }
  }
}
