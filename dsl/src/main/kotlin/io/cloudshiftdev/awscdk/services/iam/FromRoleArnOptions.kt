package io.cloudshiftdev.awscdk.services.iam

import kotlin.Boolean
import kotlin.String
import kotlin.Unit

public interface FromRoleArnOptions {
  public fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()

  public fun defaultPolicyName(): String? = unwrap(this).getDefaultPolicyName()

  public fun mutable(): Boolean? = unwrap(this).getMutable()

  public interface Builder {
    public fun addGrantsToResources(addGrantsToResources: Boolean)

    public fun defaultPolicyName(defaultPolicyName: String)

    public fun mutable(mutable: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iam.FromRoleArnOptions.Builder =
        software.amazon.awscdk.services.iam.FromRoleArnOptions.builder()

    override fun addGrantsToResources(addGrantsToResources: Boolean) {
      cdkBuilder.addGrantsToResources(addGrantsToResources)
    }

    override fun defaultPolicyName(defaultPolicyName: String) {
      cdkBuilder.defaultPolicyName(defaultPolicyName)
    }

    override fun mutable(mutable: Boolean) {
      cdkBuilder.mutable(mutable)
    }

    public fun build(): software.amazon.awscdk.services.iam.FromRoleArnOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.iam.FromRoleArnOptions,
  ) : FromRoleArnOptions {
    override fun addGrantsToResources(): Boolean? = unwrap(this).getAddGrantsToResources()

    override fun defaultPolicyName(): String? = unwrap(this).getDefaultPolicyName()

    override fun mutable(): Boolean? = unwrap(this).getMutable()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): FromRoleArnOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iam.FromRoleArnOptions):
        FromRoleArnOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: FromRoleArnOptions):
        software.amazon.awscdk.services.iam.FromRoleArnOptions = (wrapped as Wrapper).cdkObject
  }
}
