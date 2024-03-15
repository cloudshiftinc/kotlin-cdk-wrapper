@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnAccessPointProps {
  public fun accessPointTags(): List<CfnAccessPoint.AccessPointTagProperty> =
      unwrap(this).getAccessPointTags()?.map(CfnAccessPoint.AccessPointTagProperty::wrap) ?:
      emptyList()

  public fun clientToken(): String? = unwrap(this).getClientToken()

  public fun fileSystemId(): String

  public fun posixUser(): Any? = unwrap(this).getPosixUser()

  public fun rootDirectory(): Any? = unwrap(this).getRootDirectory()

  @CdkDslMarker
  public interface Builder {
    public fun accessPointTags(accessPointTags: List<CfnAccessPoint.AccessPointTagProperty>)

    public fun accessPointTags(vararg accessPointTags: CfnAccessPoint.AccessPointTagProperty)

    public fun clientToken(clientToken: String)

    public fun fileSystemId(fileSystemId: String)

    public fun posixUser(posixUser: IResolvable)

    public fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ac5a2d5cb45bd1c4b4e39c1944855ba746ab74da17459db95addc39a02eea6b")
    public fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty.Builder.() -> Unit)

    public fun rootDirectory(rootDirectory: IResolvable)

    public fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6511f1e3b2f592a4f771410fa2a366dafb6f613cee4a5faa1398363d7665cff9")
    public fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnAccessPointProps.Builder =
        software.amazon.awscdk.services.efs.CfnAccessPointProps.builder()

    override fun accessPointTags(accessPointTags: List<CfnAccessPoint.AccessPointTagProperty>) {
      cdkBuilder.accessPointTags(accessPointTags.map(CfnAccessPoint.AccessPointTagProperty::unwrap))
    }

    override fun accessPointTags(vararg accessPointTags: CfnAccessPoint.AccessPointTagProperty):
        Unit = accessPointTags(accessPointTags.toList())

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    override fun posixUser(posixUser: IResolvable) {
      cdkBuilder.posixUser(posixUser.let(IResolvable::unwrap))
    }

    override fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty) {
      cdkBuilder.posixUser(posixUser.let(CfnAccessPoint.PosixUserProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6ac5a2d5cb45bd1c4b4e39c1944855ba746ab74da17459db95addc39a02eea6b")
    override fun posixUser(posixUser: CfnAccessPoint.PosixUserProperty.Builder.() -> Unit): Unit =
        posixUser(CfnAccessPoint.PosixUserProperty(posixUser))

    override fun rootDirectory(rootDirectory: IResolvable) {
      cdkBuilder.rootDirectory(rootDirectory.let(IResolvable::unwrap))
    }

    override fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty) {
      cdkBuilder.rootDirectory(rootDirectory.let(CfnAccessPoint.RootDirectoryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6511f1e3b2f592a4f771410fa2a366dafb6f613cee4a5faa1398363d7665cff9")
    override
        fun rootDirectory(rootDirectory: CfnAccessPoint.RootDirectoryProperty.Builder.() -> Unit):
        Unit = rootDirectory(CfnAccessPoint.RootDirectoryProperty(rootDirectory))

    public fun build(): software.amazon.awscdk.services.efs.CfnAccessPointProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.efs.CfnAccessPointProps,
  ) : CdkObject(cdkObject), CfnAccessPointProps {
    override fun accessPointTags(): List<CfnAccessPoint.AccessPointTagProperty> =
        unwrap(this).getAccessPointTags()?.map(CfnAccessPoint.AccessPointTagProperty::wrap) ?:
        emptyList()

    override fun clientToken(): String? = unwrap(this).getClientToken()

    override fun fileSystemId(): String = unwrap(this).getFileSystemId()

    override fun posixUser(): Any? = unwrap(this).getPosixUser()

    override fun rootDirectory(): Any? = unwrap(this).getRootDirectory()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccessPointProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPointProps):
        CfnAccessPointProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPointProps):
        software.amazon.awscdk.services.efs.CfnAccessPointProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.efs.CfnAccessPointProps
  }
}
