package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String

public open class AccountPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.AccountPrincipal,
) : ArnPrincipal(cdkObject) {
  /**
   * AWS account ID (i.e. '123456789012').
   */
  public open fun accountId(): Any = unwrap(this).getAccountId()

  /**
   * The AWS account ID of this principal.
   *
   * Can be undefined when the account is not known
   * (for example, for service principals).
   * Can be a Token - in that case,
   * it's assumed to be AWS::AccountId.
   */
  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccountPrincipal):
        AccountPrincipal = AccountPrincipal(cdkObject)

    internal fun unwrap(wrapped: AccountPrincipal):
        software.amazon.awscdk.services.iam.AccountPrincipal = wrapped.cdkObject
  }
}
