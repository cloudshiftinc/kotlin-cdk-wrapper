package io.cloudshiftdev.awscdk.services.efs

import kotlin.String
import kotlin.Unit

public interface Acl {
  public fun ownerGid(): String

  public fun ownerUid(): String

  public fun permissions(): String

  public interface Builder {
    public fun ownerGid(ownerGid: String) {
    }

    public fun ownerUid(ownerUid: String) {
    }

    public fun permissions(permissions: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.Acl.Builder =
        software.amazon.awscdk.services.efs.Acl.builder()

    public override fun ownerGid(ownerGid: String) {
      cdkBuilder.ownerGid(ownerGid)
    }

    public override fun ownerUid(ownerUid: String) {
      cdkBuilder.ownerUid(ownerUid)
    }

    public override fun permissions(permissions: String) {
      cdkBuilder.permissions(permissions)
    }

    public fun build(): software.amazon.awscdk.services.efs.Acl = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.efs.Acl,
  ) : Acl {
    public override fun ownerGid(): String = unwrap(this).getOwnerGid()

    public override fun ownerUid(): String = unwrap(this).getOwnerUid()

    public override fun permissions(): String = unwrap(this).getPermissions()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Acl {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.Acl): Acl = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Acl): software.amazon.awscdk.services.efs.Acl = (wrapped as
        Wrapper).cdkObject
  }
}
