@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface Acl {
  public fun ownerGid(): String

  public fun ownerUid(): String

  public fun permissions(): String

  @CdkDslMarker
  public interface Builder {
    public fun ownerGid(ownerGid: String)

    public fun ownerUid(ownerUid: String)

    public fun permissions(permissions: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.Acl.Builder =
        software.amazon.awscdk.services.efs.Acl.builder()

    override fun ownerGid(ownerGid: String) {
      cdkBuilder.ownerGid(ownerGid)
    }

    override fun ownerUid(ownerUid: String) {
      cdkBuilder.ownerUid(ownerUid)
    }

    override fun permissions(permissions: String) {
      cdkBuilder.permissions(permissions)
    }

    public fun build(): software.amazon.awscdk.services.efs.Acl = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.Acl,
  ) : CdkObject(cdkObject), Acl {
    override fun ownerGid(): String = unwrap(this).getOwnerGid()

    override fun ownerUid(): String = unwrap(this).getOwnerUid()

    override fun permissions(): String = unwrap(this).getPermissions()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): Acl {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.Acl): Acl = Wrapper(cdkObject)

    internal fun unwrap(wrapped: Acl): software.amazon.awscdk.services.efs.Acl = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.efs.Acl
  }
}
