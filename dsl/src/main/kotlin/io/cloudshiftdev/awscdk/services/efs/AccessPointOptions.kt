package io.cloudshiftdev.awscdk.services.efs

import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AccessPointOptions {
  public fun createAcl(): Acl? = unwrap(this).getCreateAcl()?.let(Acl::wrap)

  public fun path(): String? = unwrap(this).getPath()

  public fun posixUser(): PosixUser? = unwrap(this).getPosixUser()?.let(PosixUser::wrap)

  public interface Builder {
    public fun createAcl(createAcl: Acl) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6d86428783bb6f202c1d30da88da33a778387841d439037d314936f1bd1b5d1")
    public fun createAcl(createAcl: Acl.Builder.() -> Unit) {
    }

    public fun path(path: String) {
    }

    public fun posixUser(posixUser: PosixUser) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1a171fd0929f89ad36e16912a11a04345c7b4fd663c147256d30c27e755163")
    public fun posixUser(posixUser: PosixUser.Builder.() -> Unit) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointOptions.Builder =
        software.amazon.awscdk.services.efs.AccessPointOptions.builder()

    public override fun createAcl(createAcl: Acl) {
      cdkBuilder.createAcl(createAcl.let(Acl::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e6d86428783bb6f202c1d30da88da33a778387841d439037d314936f1bd1b5d1")
    public override fun createAcl(createAcl: Acl.Builder.() -> Unit): Unit =
        createAcl(Acl(createAcl))

    public override fun path(path: String) {
      cdkBuilder.path(path)
    }

    public override fun posixUser(posixUser: PosixUser) {
      cdkBuilder.posixUser(posixUser.let(PosixUser::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9b1a171fd0929f89ad36e16912a11a04345c7b4fd663c147256d30c27e755163")
    public override fun posixUser(posixUser: PosixUser.Builder.() -> Unit): Unit =
        posixUser(PosixUser(posixUser))

    public fun build(): software.amazon.awscdk.services.efs.AccessPointOptions = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.efs.AccessPointOptions,
  ) : AccessPointOptions {
    public override fun createAcl(): Acl? = unwrap(this).getCreateAcl()?.let(Acl::wrap)

    public override fun path(): String? = unwrap(this).getPath()

    public override fun posixUser(): PosixUser? = unwrap(this).getPosixUser()?.let(PosixUser::wrap)
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPointOptions):
        AccessPointOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPointOptions):
        software.amazon.awscdk.services.efs.AccessPointOptions = (wrapped as Wrapper).cdkObject
  }
}
