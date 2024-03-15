@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String

public open class AccountPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.AccountPrincipal,
) : ArnPrincipal(cdkObject) {
  public open fun accountId(): Any = unwrap(this).getAccountId()

  public override fun principalAccount(): String? = unwrap(this).getPrincipalAccount()

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccountPrincipal):
        AccountPrincipal = AccountPrincipal(cdkObject)

    internal fun unwrap(wrapped: AccountPrincipal):
        software.amazon.awscdk.services.iam.AccountPrincipal = wrapped.cdkObject
  }
}
