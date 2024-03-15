@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnManagedPolicyProps {
  public fun description(): String? = unwrap(this).getDescription()

  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

  public fun path(): String? = unwrap(this).getPath()

  public fun policyDocument(): Any

  public fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

  public fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun groups(groups: List<String>)

    public fun groups(vararg groups: String)

    public fun managedPolicyName(managedPolicyName: String)

    public fun path(path: String)

    public fun policyDocument(policyDocument: Any)

    public fun roles(roles: List<String>)

    public fun roles(vararg roles: String)

    public fun users(users: List<String>)

    public fun users(vararg users: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnManagedPolicyProps.Builder =
        software.amazon.awscdk.services.iam.CfnManagedPolicyProps.builder()

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    override fun managedPolicyName(managedPolicyName: String) {
      cdkBuilder.managedPolicyName(managedPolicyName)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun policyDocument(policyDocument: Any) {
      cdkBuilder.policyDocument(policyDocument)
    }

    override fun roles(roles: List<String>) {
      cdkBuilder.roles(roles)
    }

    override fun roles(vararg roles: String): Unit = roles(roles.toList())

    override fun users(users: List<String>) {
      cdkBuilder.users(users)
    }

    override fun users(vararg users: String): Unit = users(users.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnManagedPolicyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicyProps,
  ) : CdkObject(cdkObject), CfnManagedPolicyProps {
    override fun description(): String? = unwrap(this).getDescription()

    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    override fun managedPolicyName(): String? = unwrap(this).getManagedPolicyName()

    override fun path(): String? = unwrap(this).getPath()

    override fun policyDocument(): Any = unwrap(this).getPolicyDocument()

    override fun roles(): List<String> = unwrap(this).getRoles() ?: emptyList()

    override fun users(): List<String> = unwrap(this).getUsers() ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnManagedPolicyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnManagedPolicyProps):
        CfnManagedPolicyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnManagedPolicyProps):
        software.amazon.awscdk.services.iam.CfnManagedPolicyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.CfnManagedPolicyProps
  }
}
