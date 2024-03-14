package io.cloudshiftdev.awscdk.services.efs

import kotlin.String
import kotlin.Unit
import kotlin.collections.List

public interface PosixUser {
  public fun gid(): String

  public fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

  public fun uid(): String

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

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.efs.PosixUser,
  ) : PosixUser {
    override fun gid(): String = unwrap(this).getGid()

    override fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

    override fun uid(): String = unwrap(this).getUid()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): PosixUser {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.PosixUser): PosixUser =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: PosixUser): software.amazon.awscdk.services.efs.PosixUser =
        (wrapped as Wrapper).cdkObject
  }
}
