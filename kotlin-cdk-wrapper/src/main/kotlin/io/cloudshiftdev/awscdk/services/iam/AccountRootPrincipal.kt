@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

/**
 * Use the AWS account into which a stack is deployed as the principal entity in a policy.
 *
 * Example:
 *
 * ```
 * Bucket bucket = new Bucket(this, "MyBucket");
 * AddToResourcePolicyResult result = bucket.addToResourcePolicy(
 * PolicyStatement.Builder.create()
 * .actions(List.of("s3:GetObject"))
 * .resources(List.of(bucket.arnForObjects("file.txt")))
 * .principals(List.of(new AccountRootPrincipal()))
 * .build());
 * ```
 */
public open class AccountRootPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.AccountRootPrincipal,
) : AccountPrincipal(cdkObject) {
  public constructor() : this(software.amazon.awscdk.services.iam.AccountRootPrincipal()
  )

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccountRootPrincipal):
        AccountRootPrincipal = AccountRootPrincipal(cdkObject)

    internal fun unwrap(wrapped: AccountRootPrincipal):
        software.amazon.awscdk.services.iam.AccountRootPrincipal = wrapped.cdkObject
  }
}
