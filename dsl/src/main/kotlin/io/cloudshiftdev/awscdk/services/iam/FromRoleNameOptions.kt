package io.cloudshiftdev.awscdk.services.iam

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface FromRoleNameOptions : FromRoleArnOptions {
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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.FromRoleNameOptions,
  ) : FromRoleNameOptions {
    override fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()

    override fun defaultPolicyName(): String? = unwrap(this).getDefaultPolicyName()

    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FromRoleNameOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.FromRoleNameOptions):
        FromRoleNameOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FromRoleNameOptions):
        software.amazon.awscdk.services.iam.FromRoleNameOptions = (wrapped as Wrapper).cdkObject
  }
}
