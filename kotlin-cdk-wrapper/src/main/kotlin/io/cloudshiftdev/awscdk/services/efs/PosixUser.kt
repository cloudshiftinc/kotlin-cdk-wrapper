@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PosixUser {
  public fun gid(): String

  public fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

  public fun uid(): String

  @CdkDslMarker
  public interface Builder {
    public fun gid(gid: String)

    public fun secondaryGids(secondaryGids: List<String>)

    public fun secondaryGids(vararg secondaryGids: String)

    public fun uid(uid: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.PosixUser.Builder =
        software.amazon.awscdk.services.efs.PosixUser.builder()

    override fun gid(gid: String) {
      cdkBuilder.gid(gid)
    }

    override fun secondaryGids(secondaryGids: List<String>) {
      cdkBuilder.secondaryGids(secondaryGids)
    }

    override fun secondaryGids(vararg secondaryGids: String): Unit =
        secondaryGids(secondaryGids.toList())

    override fun uid(uid: String) {
      cdkBuilder.uid(uid)
    }

    public fun build(): software.amazon.awscdk.services.efs.PosixUser = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.PosixUser,
  ) : CdkObject(cdkObject), PosixUser {
    override fun gid(): String = unwrap(this).getGid()

    override fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

    override fun uid(): String = unwrap(this).getUid()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PosixUser {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.PosixUser): PosixUser =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PosixUser): software.amazon.awscdk.services.efs.PosixUser =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.efs.PosixUser
  }
}
