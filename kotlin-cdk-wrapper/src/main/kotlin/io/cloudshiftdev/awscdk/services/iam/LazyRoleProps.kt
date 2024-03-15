@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.Duration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map

public interface LazyRoleProps : RoleProps {
  @CdkDslMarker
  public interface Builder {
    public fun assumedBy(assumedBy: IPrincipal)

    public fun description(description: String)

    public fun externalIds(externalIds: List<String>)

    public fun externalIds(vararg externalIds: String)

    public fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>)

    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    public fun maxSessionDuration(maxSessionDuration: Duration)

    public fun path(path: String)

    public fun permissionsBoundary(permissionsBoundary: IManagedPolicy)

    public fun roleName(roleName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.LazyRoleProps.Builder =
        software.amazon.awscdk.services.iam.LazyRoleProps.builder()

    override fun assumedBy(assumedBy: IPrincipal) {
      cdkBuilder.assumedBy(assumedBy.let(IPrincipal::unwrap))
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun externalIds(externalIds: List<String>) {
      cdkBuilder.externalIds(externalIds)
    }

    override fun externalIds(vararg externalIds: String): Unit = externalIds(externalIds.toList())

    override fun inlinePolicies(inlinePolicies: Map<String, PolicyDocument>) {
      cdkBuilder.inlinePolicies(inlinePolicies.mapValues{PolicyDocument.unwrap(it.value)})
    }

    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    override fun maxSessionDuration(maxSessionDuration: Duration) {
      cdkBuilder.maxSessionDuration(maxSessionDuration.let(Duration::unwrap))
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun permissionsBoundary(permissionsBoundary: IManagedPolicy) {
      cdkBuilder.permissionsBoundary(permissionsBoundary.let(IManagedPolicy::unwrap))
    }

    override fun roleName(roleName: String) {
      cdkBuilder.roleName(roleName)
    }

    public fun build(): software.amazon.awscdk.services.iam.LazyRoleProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.LazyRoleProps,
  ) : CdkObject(cdkObject), LazyRoleProps {
    override fun assumedBy(): IPrincipal = unwrap(this).getAssumedBy().let(IPrincipal::wrap)

    override fun description(): String? = unwrap(this).getDescription()

    override fun externalIds(): List<String> = unwrap(this).getExternalIds() ?: emptyList()

    override fun inlinePolicies(): Map<String, PolicyDocument> =
        unwrap(this).getInlinePolicies()?.mapValues{PolicyDocument.wrap(it.value)} ?: emptyMap()

    override fun managedPolicies(): List<IManagedPolicy> =
        unwrap(this).getManagedPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

    override fun maxSessionDuration(): Duration? =
        unwrap(this).getMaxSessionDuration()?.let(Duration::wrap)

    override fun path(): String? = unwrap(this).getPath()

    override fun permissionsBoundary(): IManagedPolicy? =
        unwrap(this).getPermissionsBoundary()?.let(IManagedPolicy::wrap)

    override fun roleName(): String? = unwrap(this).getRoleName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LazyRoleProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.LazyRoleProps): LazyRoleProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: LazyRoleProps): software.amazon.awscdk.services.iam.LazyRoleProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.LazyRoleProps
  }
}
