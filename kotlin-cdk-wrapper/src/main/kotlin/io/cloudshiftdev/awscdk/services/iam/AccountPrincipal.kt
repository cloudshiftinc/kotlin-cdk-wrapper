@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import kotlin.Any
import kotlin.String

/**
 * Specify AWS account ID as the principal entity in a policy to delegate authority to the account.
 *
 * Example:
 *
 * ```
 * DatabaseCluster cluster = DatabaseCluster.Builder.create(this, "Cluster")
 * .vpc(vpc)
 * .instanceType(InstanceType.R5_LARGE)
 * .iamAuthentication(true)
 * .build();
 * Role role = Role.Builder.create(this, "DBRole").assumedBy(new
 * AccountPrincipal(this.account)).build();
 * // Use one of the following statements to grant the role the necessary permissions
 * cluster.grantConnect(role); // Grant the role neptune-db:* access to the DB
 * cluster.grant(role, "neptune-db:ReadDataViaQuery", "neptune-db:WriteDataViaQuery");
 * ```
 */
public open class AccountPrincipal(
  cdkObject: software.amazon.awscdk.services.iam.AccountPrincipal,
) : ArnPrincipal(cdkObject) {
  public constructor(accountId: Any) :
      this(software.amazon.awscdk.services.iam.AccountPrincipal(accountId)
  )

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
        software.amazon.awscdk.services.iam.AccountPrincipal = wrapped.cdkObject as
        software.amazon.awscdk.services.iam.AccountPrincipal
  }
}
