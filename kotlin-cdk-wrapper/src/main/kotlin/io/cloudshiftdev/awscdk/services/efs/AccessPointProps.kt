@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface AccessPointProps : AccessPointOptions {
  public fun fileSystem(): IFileSystem

  @CdkDslMarker
  public interface Builder {
    public fun createAcl(createAcl: Acl)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("409f29e3cb521f759c7e0156a0920e4b82797c6cbad7b867ab0796367c1731bf")
    public fun createAcl(createAcl: Acl.Builder.() -> Unit)

    public fun fileSystem(fileSystem: IFileSystem)

    public fun path(path: String)

    public fun posixUser(posixUser: PosixUser)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c25a7f2026d9708718e845d1db3e0bd2280f29365108de1a5363fb58e34c0737")
    public fun posixUser(posixUser: PosixUser.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPointProps.Builder =
        software.amazon.awscdk.services.efs.AccessPointProps.builder()

    override fun createAcl(createAcl: Acl) {
      cdkBuilder.createAcl(createAcl.let(Acl::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("409f29e3cb521f759c7e0156a0920e4b82797c6cbad7b867ab0796367c1731bf")
    override fun createAcl(createAcl: Acl.Builder.() -> Unit): Unit = createAcl(Acl(createAcl))

    override fun fileSystem(fileSystem: IFileSystem) {
      cdkBuilder.fileSystem(fileSystem.let(IFileSystem::unwrap))
    }

    override fun path(path: String) {
      cdkBuilder.path(path)
    }

    override fun posixUser(posixUser: PosixUser) {
      cdkBuilder.posixUser(posixUser.let(PosixUser::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c25a7f2026d9708718e845d1db3e0bd2280f29365108de1a5363fb58e34c0737")
    override fun posixUser(posixUser: PosixUser.Builder.() -> Unit): Unit =
        posixUser(PosixUser(posixUser))

    public fun build(): software.amazon.awscdk.services.efs.AccessPointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.AccessPointProps,
  ) : CdkObject(cdkObject), AccessPointProps {
    override fun createAcl(): Acl? = unwrap(this).getCreateAcl()?.let(Acl::wrap)

    override fun fileSystem(): IFileSystem = unwrap(this).getFileSystem().let(IFileSystem::wrap)

    override fun path(): String? = unwrap(this).getPath()

    override fun posixUser(): PosixUser? = unwrap(this).getPosixUser()?.let(PosixUser::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPointProps):
        AccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AccessPointProps):
        software.amazon.awscdk.services.efs.AccessPointProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.efs.AccessPointProps
  }
}
