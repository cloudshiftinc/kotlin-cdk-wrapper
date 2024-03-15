@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class AccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.efs.AccessPoint,
) : Resource(cdkObject), IAccessPoint {
  public override fun accessPointArn(): String = unwrap(this).getAccessPointArn()

  public override fun accessPointId(): String = unwrap(this).getAccessPointId()

  public override fun fileSystem(): IFileSystem =
      unwrap(this).getFileSystem().let(IFileSystem::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun createAcl(createAcl: Acl)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a479721a4dbf0a31026115d0afb2531beac62afe6bd95cef7af539766a1ad838")
    public fun createAcl(createAcl: Acl.Builder.() -> Unit)

    public fun fileSystem(fileSystem: IFileSystem)

    public fun path(path: String)

    public fun posixUser(posixUser: PosixUser)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3411fc0775754d830ec49cde548af994953884e96ae0a273fb45ceaa8c2ca6b4")
    public fun posixUser(posixUser: PosixUser.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.AccessPoint.Builder =
        software.amazon.awscdk.services.efs.AccessPoint.Builder.create(scope, id)

    override fun createAcl(createAcl: Acl) {
      cdkBuilder.createAcl(createAcl.let(Acl::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a479721a4dbf0a31026115d0afb2531beac62afe6bd95cef7af539766a1ad838")
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
    @JvmName("3411fc0775754d830ec49cde548af994953884e96ae0a273fb45ceaa8c2ca6b4")
    override fun posixUser(posixUser: PosixUser.Builder.() -> Unit): Unit =
        posixUser(PosixUser(posixUser))

    public fun build(): software.amazon.awscdk.services.efs.AccessPoint = cdkBuilder.build()
  }

  public companion object {
    public fun fromAccessPointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AccessPointAttributes,
    ): IAccessPoint =
        software.amazon.awscdk.services.efs.AccessPoint.fromAccessPointAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(AccessPointAttributes::unwrap)).let(IAccessPoint::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("fdc24fd29d0d7d80090cf1ae8cde4702127ddffb6a4bc6cc5398f4fed3557f2d")
    public fun fromAccessPointAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: AccessPointAttributes.Builder.() -> Unit,
    ): IAccessPoint = fromAccessPointAttributes(scope, id, AccessPointAttributes(attrs))

    public fun fromAccessPointId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      accessPointId: String,
    ): IAccessPoint =
        software.amazon.awscdk.services.efs.AccessPoint.fromAccessPointId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, accessPointId).let(IAccessPoint::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): AccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return AccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.AccessPoint): AccessPoint =
        AccessPoint(cdkObject)

    internal fun unwrap(wrapped: AccessPoint): software.amazon.awscdk.services.efs.AccessPoint =
        wrapped.cdkObject
  }
}
