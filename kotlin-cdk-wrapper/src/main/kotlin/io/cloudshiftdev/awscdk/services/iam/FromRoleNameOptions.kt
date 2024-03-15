@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iam

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface FromRoleNameOptions : FromRoleArnOptions {
  @CdkDslMarker
  public interface Builder {
    public fun addGrantsToResources(addGrantsToResources: Boolean)

    public fun defaultPolicyName(defaultPolicyName: String)

    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.FromRoleNameOptions.Builder =
        software.amazon.awscdk.services.iam.FromRoleNameOptions.builder()

    override fun addGrantsToResources(addGrantsToResources: Boolean) {
      cdkBuilder.addGrantsToResources(addGrantsToResources)
    }

    override fun defaultPolicyName(defaultPolicyName: String) {
      cdkBuilder.defaultPolicyName(defaultPolicyName)
    }

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.iam.FromRoleNameOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iam.FromRoleNameOptions,
  ) : CdkObject(cdkObject), FromRoleNameOptions {
    override fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()

    override fun defaultPolicyName(): String? = unwrap(this).getDefaultPolicyName()

    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): FromRoleNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.FromRoleNameOptions):
        FromRoleNameOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FromRoleNameOptions):
        software.amazon.awscdk.services.iam.FromRoleNameOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.iam.FromRoleNameOptions
  }
}
