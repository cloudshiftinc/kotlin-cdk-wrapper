@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUserProps {
  public fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

  public fun loginProfile(): Any? = unwrap(this).getLoginProfile()

  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  public fun path(): String? = unwrap(this).getPath()

  public fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  public fun policies(): Any? = unwrap(this).getPolicies()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userName(): String? = unwrap(this).getUserName()

  @CdkDslMarker
  public interface Builder {
    public fun groups(groups: List<String>)

    public fun groups(vararg groups: String)

    public fun loginProfile(loginProfile: IResolvable)

    public fun loginProfile(loginProfile: CfnUser.LoginProfileProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6ac569c97cfc1b49f653310b27872b98cb41f557a0e69f65cc702379ee6463")
    public fun loginProfile(loginProfile: CfnUser.LoginProfileProperty.Builder.() -> Unit)

    public fun managedPolicyArns(managedPolicyArns: List<String>)

    public fun managedPolicyArns(vararg managedPolicyArns: String)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnUserProps.Builder =
        software.amazon.awscdk.services.iam.CfnUserProps.builder()

    override fun groups(groups: List<String>) {
      cdkBuilder.groups(groups)
    }

    override fun groups(vararg groups: String): Unit = groups(groups.toList())

    override fun loginProfile(loginProfile: IResolvable) {
      cdkBuilder.loginProfile(loginProfile.let(IResolvable::unwrap))
    }

    override fun loginProfile(loginProfile: CfnUser.LoginProfileProperty) {
      cdkBuilder.loginProfile(loginProfile.let(CfnUser.LoginProfileProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7e6ac569c97cfc1b49f653310b27872b98cb41f557a0e69f65cc702379ee6463")
    override fun loginProfile(loginProfile: CfnUser.LoginProfileProperty.Builder.() -> Unit): Unit =
        loginProfile(CfnUser.LoginProfileProperty(loginProfile))

    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun permissionsBoundary(permissionsBoundary: String) {
      cdkBuilder.permissionsBoundary(permissionsBoundary)
    }

    override fun policies(policies: IResolvable) {
      cdkBuilder.policies(policies.let(IResolvable::unwrap))
    }

    override fun policies(policies: List<Any>) {
      cdkBuilder.policies(policies)
    }

    override fun policies(vararg policies: Any): Unit = policies(policies.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.iam.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    override fun groups(): List<String> = unwrap(this).getGroups() ?: emptyList()

    override fun loginProfile(): Any? = unwrap(this).getLoginProfile()

    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    override fun path(): String? = unwrap(this).getPath()

    override fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

    override fun policies(): Any? = unwrap(this).getPolicies()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userName(): String? = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnUserProps): CfnUserProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps): software.amazon.awscdk.services.iam.CfnUserProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnUserProps
  }
}
