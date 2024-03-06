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

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eks.CfnAccessEntry

/**
 * An access policy includes permissions that allow Amazon EKS to authorize an IAM principal to work
 * with Kubernetes objects on your cluster.
 *
 * The policies are managed by Amazon EKS, but they're not IAM policies. You can't view the
 * permissions in the policies using the API. The permissions for many of the policies are similar
 * to the Kubernetes `cluster-admin` , `admin` , `edit` , and `view` cluster roles. For more
 * information about these cluster roles, see
 * [User-facing roles](https://docs.aws.amazon.com/https://kubernetes.io/docs/reference/access-authn-authz/rbac/#user-facing-roles)
 * in the Kubernetes documentation. To view the contents of the policies, see
 * [Access policy permissions](https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html#access-policy-permissions)
 * in the *Amazon EKS User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.eks.*;
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
@CdkDslMarker
public class CfnAccessEntryAccessPolicyPropertyDsl {
    private val cdkBuilder: CfnAccessEntry.AccessPolicyProperty.Builder =
        CfnAccessEntry.AccessPolicyProperty.builder()

    /** @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . */
    public fun accessScope(accessScope: IResolvable) {
        cdkBuilder.accessScope(accessScope)
    }

    /** @param accessScope The scope of an `AccessPolicy` that's associated to an `AccessEntry` . */
    public fun accessScope(accessScope: CfnAccessEntry.AccessScopeProperty) {
        cdkBuilder.accessScope(accessScope)
    }

    /** @param policyArn The ARN of the access policy. */
    public fun policyArn(policyArn: String) {
        cdkBuilder.policyArn(policyArn)
    }

    public fun build(): CfnAccessEntry.AccessPolicyProperty = cdkBuilder.build()
}
