@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.SecretValue
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface UserProps {
  public fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

  public fun managedPolicies(): List<IManagedPolicy> =
      unwrap(this).getManagedPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

  public fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

  public fun passwordResetRequired(): Boolean? = unwrap(this).getPasswordResetRequired()

  public fun path(): String? = unwrap(this).getPath()

  public fun permissionsBoundary(): IManagedPolicy? =
      unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

  public fun userName(): String? = unwrap(this).getUserName()

  @CdkDslMarker
  public interface Builder {
    public fun groups(groups: List<IGroup>)

    public fun groups(vararg groups: IGroup)

    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    public fun password(password: SecretValue)

    public fun passwordResetRequired(passwordResetRequired: Boolean)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.UserProps.Builder =
        software.amazon.awscdk.services.iam.UserProps.builder()

    override fun groups(groups: List<IGroup>) {
      cdkBuilder.groups(groups.map(IGroup::unwrap))
    }

    override fun groups(vararg groups: IGroup): Unit = groups(groups.toList())

    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    override fun password(password: SecretValue) {
      cdkBuilder.password(password.let(SecretValue::unwrap))
    }

    override fun passwordResetRequired(passwordResetRequired: Boolean) {
      cdkBuilder.passwordResetRequired(passwordResetRequired)
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.UserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.UserProps,
  ) : CdkObject(cdkObject), UserProps {
    override fun groups(): List<IGroup> = unwrap(this).getGroups()?.map(IGroup::wrap) ?: emptyList()

    override fun managedPolicies(): List<IManagedPolicy> =
        unwrap(this).getManagedPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

    override fun password(): SecretValue? = unwrap(this).getPassword()?.let(SecretValue::wrap)

    override fun passwordResetRequired(): Boolean? = unwrap(this).getPasswordResetRequired()

    override fun path(): String? = unwrap(this).getPath()

    override fun permissionsBoundary(): IManagedPolicy? =
        unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

    override fun userName(): String? = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): UserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.UserProps): UserProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: UserProps): software.amazon.awscdk.services.iam.UserProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.UserProps
  }
}
