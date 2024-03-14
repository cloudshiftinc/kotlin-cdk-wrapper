package io.cloudshiftdev.awscdk.services.iam

public open class AccountRootPrincipal internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.iam.AccountRootPrincipal,
) : AccountPrincipal(cdkObject) {
  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.AccountRootPrincipal):
        AccountRootPrincipal = AccountRootPrincipal(cdkObject)

    internal fun unwrap(wrapped: AccountRootPrincipal):
        software.amazon.awscdk.services.iam.AccountRootPrincipal = wrapped.cdkObject
  }
}
