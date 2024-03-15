@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface GroupProps {
  public fun groupName(): String? = unwrap(this).getGroupName()

  public fun managedPolicies(): List<IManagedPolicy> =
      unwrap(this).getManagedPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

  public fun path(): String? = unwrap(this).getPath()

  @CdkDslMarker
  public interface Builder {
    public fun groupName(groupName: String)

    public fun managedPolicies(managedPolicies: List<IManagedPolicy>)

    public fun managedPolicies(vararg managedPolicies: IManagedPolicy)

    public fun path(path: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.GroupProps.Builder =
        software.amazon.awscdk.services.iam.GroupProps.builder()

    override fun groupName(groupName: String) {
      cdkBuilder.groupName(groupName)
    }

    override fun managedPolicies(managedPolicies: List<IManagedPolicy>) {
      cdkBuilder.managedPolicies(managedPolicies.map(IManagedPolicy::unwrap))
    }

    override fun managedPolicies(vararg managedPolicies: IManagedPolicy): Unit =
        managedPolicies(managedPolicies.toList())

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public fun build(): software.amazon.awscdk.services.iam.GroupProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.GroupProps,
  ) : CdkObject(cdkObject), GroupProps {
    override fun groupName(): String? = unwrap(this).getGroupName()

    override fun managedPolicies(): List<IManagedPolicy> =
        unwrap(this).getManagedPolicies()?.map(IManagedPolicy::wrap) ?: emptyList()

    override fun path(): String? = unwrap(this).getPath()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): GroupProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.GroupProps): GroupProps =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: GroupProps): software.amazon.awscdk.services.iam.GroupProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.iam.GroupProps
  }
}
