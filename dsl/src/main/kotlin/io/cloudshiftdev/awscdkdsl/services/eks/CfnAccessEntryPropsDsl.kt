@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.eks

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnAccessEntryProps

/**
 * Properties for defining a `CfnAccessEntry`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
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
@CdkDslMarker
public class CfnAccessEntryPropsDsl {
    private val cdkBuilder: CfnAccessEntryProps.Builder = CfnAccessEntryProps.builder()

    private val _accessPolicies: MutableList<Any> = mutableListOf()

    private val _kubernetesGroups: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param accessPolicies The access policies to associate to the access entry. */
    public fun accessPolicies(vararg accessPolicies: Any) {
        _accessPolicies.addAll(listOf(*accessPolicies))
    }

    /** @param accessPolicies The access policies to associate to the access entry. */
    public fun accessPolicies(accessPolicies: Collection<Any>) {
        _accessPolicies.addAll(accessPolicies)
    }

    /** @param accessPolicies The access policies to associate to the access entry. */
    public fun accessPolicies(accessPolicies: IResolvable) {
        cdkBuilder.accessPolicies(accessPolicies)
    }

    /** @param clusterName The name of your cluster. */
    public fun clusterName(clusterName: String) {
        cdkBuilder.clusterName(clusterName)
    }

    /**
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     *   `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object. Amazon EKS doesn't
     *   confirm that the value for `name` exists in any bindings on your cluster. You can specify
     *   one or more names.
     *
     * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects
     * that you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified
     * in a binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
     * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see
     * [Using RBAC Authorization in the Kubernetes documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * .
     *
     * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
     * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to
     * the access entry using `AssociateAccessPolicy` . If you associate any access policies, the
     * `principalARN` has all permissions assigned in the associated access policies and all
     * permissions in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound
     * to.
     */
    public fun kubernetesGroups(vararg kubernetesGroups: String) {
        _kubernetesGroups.addAll(listOf(*kubernetesGroups))
    }

    /**
     * @param kubernetesGroups The value for `name` that you've specified for `kind: Group` as a
     *   `subject` in a Kubernetes `RoleBinding` or `ClusterRoleBinding` object. Amazon EKS doesn't
     *   confirm that the value for `name` exists in any bindings on your cluster. You can specify
     *   one or more names.
     *
     * Kubernetes authorizes the `principalArn` of the access entry to access any cluster objects
     * that you've specified in a Kubernetes `Role` or `ClusterRole` object that is also specified
     * in a binding's `roleRef` . For more information about creating Kubernetes `RoleBinding` ,
     * `ClusterRoleBinding` , `Role` , or `ClusterRole` objects, see
     * [Using RBAC Authorization in the Kubernetes documentation](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/)
     * .
     *
     * If you want Amazon EKS to authorize the `principalArn` (instead of, or in addition to
     * Kubernetes authorizing the `principalArn` ), you can associate one or more access policies to
     * the access entry using `AssociateAccessPolicy` . If you associate any access policies, the
     * `principalARN` has all permissions assigned in the associated access policies and all
     * permissions in any Kubernetes `Role` or `ClusterRole` objects that the group names are bound
     * to.
     */
    public fun kubernetesGroups(kubernetesGroups: Collection<String>) {
        _kubernetesGroups.addAll(kubernetesGroups)
    }

    /**
     * @param principalArn The ARN of the IAM principal for the `AccessEntry` . You can specify one
     *   ARN for each access entry. You can't specify the same ARN in more than one access entry.
     *   This value can't be changed after access entry creation.
     *
     * The valid principals differ depending on the type of the access entry in the `type` field.
     * The only valid ARN is IAM roles for the types of access entries for nodes: ` ` . You can use
     * every IAM principal type for `STANDARD` access entries. You can't use the STS session
     * principal type with access entries because this is a temporary principal for each session and
     * not a permanent identity that can be assigned permissions.
     *
     * [IAM best
     * practices](https://docs.aws.amazon.com/IAM/latest/UserGuide/best-practices.html#bp-users-federation-idp)
     * recommend using IAM roles with temporary credentials, rather than IAM users with long-term
     * credentials.
     */
    public fun principalArn(principalArn: String) {
        cdkBuilder.principalArn(principalArn)
    }

    /**
     * @param tags Metadata that assists with categorization and organization. Each tag consists of
     *   a key and an optional value. You define both. Tags don't propagate to any other cluster or
     *   AWS resources.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Metadata that assists with categorization and organization. Each tag consists of
     *   a key and an optional value. You define both. Tags don't propagate to any other cluster or
     *   AWS resources.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * @param type The type of the new access entry. Valid values are `Standard` , `FARGATE_LINUX` ,
     *   `EC2_LINUX` , and `EC2_WINDOWS` . If the `principalArn` is for an IAM role that's used for
     *   self-managed Amazon EC2 nodes, specify `EC2_LINUX` or `EC2_WINDOWS` . Amazon EKS grants the
     *   necessary permissions to the node for you. If the `principalArn` is for any other purpose,
     *   specify `STANDARD` . If you don't specify a value, Amazon EKS sets the value to `STANDARD`
     *   . It's unnecessary to create access entries for IAM roles used with Fargate profiles or
     *   managed Amazon EC2 nodes, because Amazon EKS creates entries in the `aws-auth` `ConfigMap`
     *   for the roles. You can't change this value once you've created the access entry.
     *
     * If you set the value to `EC2_LINUX` or `EC2_WINDOWS` , you can't specify values for
     * `kubernetesGroups` , or associate an `AccessPolicy` to the access entry.
     */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    /**
     * @param username The username to authenticate to Kubernetes with. We recommend not specifying
     *   a username and letting Amazon EKS specify it for you. For more information about the value
     *   Amazon EKS specifies for you, or constraints before specifying your own username, see
     *   [Creating access entries](https://docs.aws.amazon.com/eks/latest/userguide/access-entries.html#creating-access-entries)
     *   in the *Amazon EKS User Guide* .
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnAccessEntryProps {
        if (_accessPolicies.isNotEmpty()) cdkBuilder.accessPolicies(_accessPolicies)
        if (_kubernetesGroups.isNotEmpty()) cdkBuilder.kubernetesGroups(_kubernetesGroups)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
