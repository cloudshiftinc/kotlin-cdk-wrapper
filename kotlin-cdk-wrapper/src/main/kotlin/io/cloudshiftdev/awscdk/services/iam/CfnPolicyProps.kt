@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnPolicyProps {
  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public fun policyDocument(): Any

  public fun policyName(): String

  public fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  public fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun groups(groups: List<String>)

    public fun groups(vararg groups: String)

    public fun policyDocument(policyDocument: Any)

    public fun policyName(policyName: String)

    public fun roles(roles: List<String>)

    public fun roles(vararg roles: String)

    public fun users(users: List<String>)

    public fun users(vararg users: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnPolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnPolicyProps.builder()

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun policyName(policyName: String) {
      cdkBuilder.policyName(policyName)
    }

    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnPolicyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnPolicyProps,
  ) : CdkObject(cdkObject), CfnPolicyProps {
    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    override fun policyName(): String = unwrap(this).getPolicyName()

    override fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

    override fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnPolicyProps): CfnPolicyProps
        = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPolicyProps): software.amazon.awscdk.services.iam.CfnPolicyProps
        = (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnPolicyProps
  }
}
