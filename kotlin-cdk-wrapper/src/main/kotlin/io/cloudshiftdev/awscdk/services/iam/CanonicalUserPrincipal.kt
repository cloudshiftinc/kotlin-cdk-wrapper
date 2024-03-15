@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.String

/**
 * A policy principal for canonicalUserIds - useful for S3 bucket policies that use Origin Access
 * identities.
 *
 * See https://docs.aws.amazon.com/general/latest/gr/acct-identifiers.html
 *
 * and
 *
 * https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html
 *
 * for more details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iam.*;
 * CanonicalUserPrincipal canonicalUserPrincipal = new CanonicalUserPrincipal("canonicalUserId");
 * ```
 */
public open class CanonicalUserPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.CanonicalUserPrincipal,
) : PrincipalBase(cdkObject) {
  public constructor(canonicalUserId: String) :
      this(software.amazon.awscdk.services.iam.CanonicalUserPrincipal(canonicalUserId)
  )

  /**
   * unique identifier assigned by AWS for every account.
   *
   * root user and IAM users for an account all see the same ID.
   * (i.e. 79a59df900b949e55d96a1e698fbacedfd6e09d98eacf8f8d5218e7cd47ef2be)
   */
  public open fun canonicalUserId(): String = unwrap(this).getCanonicalUserId()

  /**
   * Return whether or not this principal is equal to the given principal.
   */
  public override fun dedupeString(): String? = unwrap(this).dedupeString()

  /**
   * Return the policy fragment that identifies this principal in a Policy.
   */
  public override fun policyFragment(): PrincipalPolicyFragment =
      unwrap(this).getPolicyFragment().let(PrincipalPolicyFragment::wrap)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CanonicalUserPrincipal):
        CanonicalUserPrincipal = CanonicalUserPrincipal(cdkObject)

    internal fun unwrap(wrapped: CanonicalUserPrincipal):
        software.amazon.awscdk.services.iam.CanonicalUserPrincipal = wrapped.cdkObject
  }
}
