@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface CfnRoleProps {
  public fun assumeRolePolicyDocument(): Any

  public fun description(): String? = unwrap(this).getDescription()

  public fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?: emptyList()

  public fun maxSessionDuration(): Number? = unwrap(this).getMaxSessionDuration()

  public fun path(): String? = unwrap(this).getPath()

  public fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

  public fun policies(): Any? = unwrap(this).getPolicies()

  public fun roleName(): String? = unwrap(this).getRoleName()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any)

    public fun description(description: String)

    public fun managedPolicyArns(managedPolicyArns: List<String>)

    public fun managedPolicyArns(vararg managedPolicyArns: String)

    public fun maxSessionDuration(maxSessionDuration: Number)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: String)

    public fun policies(policies: IResolvable)

    public fun policies(policies: List<Any>)

    public fun policies(vararg policies: Any)

    public fun roleName(roleName: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.CfnRoleProps.Builder =
        software.amazon.awscdk.services.iam.CfnRoleProps.builder()

    override fun assumeRolePolicyDocument(assumeRolePolicyDocument: Any) {
      cdkBuilder.assumeRolePolicyDocument(assumeRolePolicyDocument)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun managedPolicyArns(managedPolicyArns: List<String>) {
      cdkBuilder.managedPolicyArns(managedPolicyArns)
    }

    override fun managedPolicyArns(vararg managedPolicyArns: String): Unit =
        managedPolicyArns(managedPolicyArns.toList())

    override fun maxSessionDuration(maxSessionDuration: Number) {
      cdkBuilder.maxSessionDuration(maxSessionDuration)
    }

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

    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iam.CfnRoleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.CfnRoleProps,
  ) : CdkObject(cdkObject), CfnRoleProps {
    override fun assumeRolePolicyDocument(): Any = unwrap(this).getAssumeRolePolicyDocument()

    override fun description(): String? = unwrap(this).getDescription()

    override fun managedPolicyArns(): List<String> = unwrap(this).getManagedPolicyArns() ?:
        emptyList()

    override fun maxSessionDuration(): Number? = unwrap(this).getMaxSessionDuration()

    override fun path(): String? = unwrap(this).getPath()

    override fun permissionsBoundary(): String? = unwrap(this).getPermissionsBoundary()

    override fun policies(): Any? = unwrap(this).getPolicies()

    override fun roleName(): String? = unwrap(this).getRoleName()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnRoleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.CfnRoleProps): CfnRoleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnRoleProps): software.amazon.awscdk.services.iam.CfnRoleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.CfnRoleProps
  }
}
