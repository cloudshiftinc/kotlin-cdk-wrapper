@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.eks

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String

/**
 * Represents an Amazon EKS Access Policy ARN.
 *
 * Amazon EKS Access Policies are used to control access to Amazon EKS clusters.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.eks.*;
 * AccessPolicyArn accessPolicyArn = AccessPolicyArn.AMAZON_EKS_ADMIN_POLICY;
 * ```
 *
 * [Documentation](https://docs.aws.amazon.com/eks/latest/userguide/access-policies.html)
 */
public open class AccessPolicyArn(
  cdkObject: software.amazon.awscdk.services.eks.AccessPolicyArn,
) : CdkObject(cdkObject) {
  public constructor(policyName: String) :
      this(software.amazon.awscdk.services.eks.AccessPolicyArn(policyName)
  )

  /**
   * The Amazon Resource Name (ARN) of the access policy.
   */
  public open fun policyArn(): String = unwrap(this).getPolicyArn()

  /**
   * * The name of the Amazon EKS access policy.
   *
   * This is used to construct the policy ARN.
   */
  public open fun policyName(): String = unwrap(this).getPolicyName()

  public companion object {
    public val AMAZON_EKS_ADMIN_POLICY: AccessPolicyArn =
        AccessPolicyArn.wrap(software.amazon.awscdk.services.eks.AccessPolicyArn.AMAZON_EKS_ADMIN_POLICY)

    public val AMAZON_EKS_ADMIN_VIEW_POLICY: AccessPolicyArn =
        AccessPolicyArn.wrap(software.amazon.awscdk.services.eks.AccessPolicyArn.AMAZON_EKS_ADMIN_VIEW_POLICY)

    public val AMAZON_EKS_CLUSTER_ADMIN_POLICY: AccessPolicyArn =
        AccessPolicyArn.wrap(software.amazon.awscdk.services.eks.AccessPolicyArn.AMAZON_EKS_CLUSTER_ADMIN_POLICY)

    public val AMAZON_EKS_EDIT_POLICY: AccessPolicyArn =
        AccessPolicyArn.wrap(software.amazon.awscdk.services.eks.AccessPolicyArn.AMAZON_EKS_EDIT_POLICY)

    public val AMAZON_EKS_VIEW_POLICY: AccessPolicyArn =
        AccessPolicyArn.wrap(software.amazon.awscdk.services.eks.AccessPolicyArn.AMAZON_EKS_VIEW_POLICY)

    public fun of(policyName: String): AccessPolicyArn =
        software.amazon.awscdk.services.eks.AccessPolicyArn.of(policyName).let(AccessPolicyArn::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.eks.AccessPolicyArn):
        AccessPolicyArn = AccessPolicyArn(cdkObject)

    internal fun unwrap(wrapped: AccessPolicyArn):
        software.amazon.awscdk.services.eks.AccessPolicyArn = wrapped.cdkObject as
        software.amazon.awscdk.services.eks.AccessPolicyArn
  }
}
