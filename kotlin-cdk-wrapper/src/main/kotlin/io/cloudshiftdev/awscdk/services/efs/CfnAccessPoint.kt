@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.efs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnAccessPoint internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun accessPointTagsRaw(): List<AccessPointTagProperty> =
      unwrap(this).getAccessPointTagsRaw()?.map(AccessPointTagProperty::wrap) ?: emptyList()

  public open fun accessPointTagsRaw(`value`: List<AccessPointTagProperty>) {
    unwrap(this).setAccessPointTagsRaw(`value`.map(AccessPointTagProperty::unwrap))
  }

  public open fun accessPointTagsRaw(vararg `value`: AccessPointTagProperty): Unit =
      accessPointTagsRaw(`value`.toList())

  public open fun attrAccessPointId(): String = unwrap(this).getAttrAccessPointId()

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun clientToken(): String? = unwrap(this).getClientToken()

  public open fun clientToken(`value`: String) {
    unwrap(this).setClientToken(`value`)
  }

  public open fun fileSystemId(): String = unwrap(this).getFileSystemId()

  public open fun fileSystemId(`value`: String) {
    unwrap(this).setFileSystemId(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun posixUser(): Any? = unwrap(this).getPosixUser()

  public open fun posixUser(`value`: IResolvable) {
    unwrap(this).setPosixUser(`value`.let(IResolvable::unwrap))
  }

  public open fun posixUser(`value`: PosixUserProperty) {
    unwrap(this).setPosixUser(`value`.let(PosixUserProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("329ec2fc6394934ffef387e7729df843f1b9bf53cf48124926a4cd835d9c64ae")
  public open fun posixUser(`value`: PosixUserProperty.Builder.() -> Unit): Unit =
      posixUser(PosixUserProperty(`value`))

  public open fun rootDirectory(): Any? = unwrap(this).getRootDirectory()

  public open fun rootDirectory(`value`: IResolvable) {
    unwrap(this).setRootDirectory(`value`.let(IResolvable::unwrap))
  }

  public open fun rootDirectory(`value`: RootDirectoryProperty) {
    unwrap(this).setRootDirectory(`value`.let(RootDirectoryProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6ef8258b148a11d4faef82921b1736ab20771a65d4dc0107d31e3b69d5a055fd")
  public open fun rootDirectory(`value`: RootDirectoryProperty.Builder.() -> Unit): Unit =
      rootDirectory(RootDirectoryProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  @CdkDslMarker
  public interface Builder {
    public fun accessPointTags(accessPointTags: List<AccessPointTagProperty>)

    public fun accessPointTags(vararg accessPointTags: AccessPointTagProperty)

    public fun clientToken(clientToken: String)

    public fun fileSystemId(fileSystemId: String)

    public fun posixUser(posixUser: IResolvable)

    public fun posixUser(posixUser: PosixUserProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fee7216d59d6314a6fcae17cbc03dad344c68f3cf3ab2460e766204dbf6b8c0")
    public fun posixUser(posixUser: PosixUserProperty.Builder.() -> Unit)

    public fun rootDirectory(rootDirectory: IResolvable)

    public fun rootDirectory(rootDirectory: RootDirectoryProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400b9ce47bd6ce7f9764d451902b3926a5c9c8a268421895da866638da931b79")
    public fun rootDirectory(rootDirectory: RootDirectoryProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.efs.CfnAccessPoint.Builder =
        software.amazon.awscdk.services.efs.CfnAccessPoint.Builder.create(scope, id)

    override fun accessPointTags(accessPointTags: List<AccessPointTagProperty>) {
      cdkBuilder.accessPointTags(accessPointTags.map(AccessPointTagProperty::unwrap))
    }

    override fun accessPointTags(vararg accessPointTags: AccessPointTagProperty): Unit =
        accessPointTags(accessPointTags.toList())

    override fun clientToken(clientToken: String) {
      cdkBuilder.clientToken(clientToken)
    }

    override fun fileSystemId(fileSystemId: String) {
      cdkBuilder.fileSystemId(fileSystemId)
    }

    override fun posixUser(posixUser: IResolvable) {
      cdkBuilder.posixUser(posixUser.let(IResolvable::unwrap))
    }

    override fun posixUser(posixUser: PosixUserProperty) {
      cdkBuilder.posixUser(posixUser.let(PosixUserProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2fee7216d59d6314a6fcae17cbc03dad344c68f3cf3ab2460e766204dbf6b8c0")
    override fun posixUser(posixUser: PosixUserProperty.Builder.() -> Unit): Unit =
        posixUser(PosixUserProperty(posixUser))

    override fun rootDirectory(rootDirectory: IResolvable) {
      cdkBuilder.rootDirectory(rootDirectory.let(IResolvable::unwrap))
    }

    override fun rootDirectory(rootDirectory: RootDirectoryProperty) {
      cdkBuilder.rootDirectory(rootDirectory.let(RootDirectoryProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("400b9ce47bd6ce7f9764d451902b3926a5c9c8a268421895da866638da931b79")
    override fun rootDirectory(rootDirectory: RootDirectoryProperty.Builder.() -> Unit): Unit =
        rootDirectory(RootDirectoryProperty(rootDirectory))

    public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.efs.CfnAccessPoint.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnAccessPoint {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnAccessPoint(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint): CfnAccessPoint
        = CfnAccessPoint(cdkObject)

    internal fun unwrap(wrapped: CfnAccessPoint): software.amazon.awscdk.services.efs.CfnAccessPoint
        = wrapped.cdkObject
  }

  public interface RootDirectoryProperty {
    public fun creationInfo(): Any? = unwrap(this).getCreationInfo()

    public fun path(): String? = unwrap(this).getPath()

    @CdkDslMarker
    public interface Builder {
      public fun creationInfo(creationInfo: IResolvable)

      public fun creationInfo(creationInfo: CreationInfoProperty)

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f09715ddaf55a736c58a579888cb8e3718cb5e0640ebf826af3c9dbf3e3ff06")
      public fun creationInfo(creationInfo: CreationInfoProperty.Builder.() -> Unit)

      public fun path(path: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty.builder()

      override fun creationInfo(creationInfo: IResolvable) {
        cdkBuilder.creationInfo(creationInfo.let(IResolvable::unwrap))
      }

      override fun creationInfo(creationInfo: CreationInfoProperty) {
        cdkBuilder.creationInfo(creationInfo.let(CreationInfoProperty::unwrap))
      }

      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0f09715ddaf55a736c58a579888cb8e3718cb5e0640ebf826af3c9dbf3e3ff06")
      override fun creationInfo(creationInfo: CreationInfoProperty.Builder.() -> Unit): Unit =
          creationInfo(CreationInfoProperty(creationInfo))

      override fun path(path: String) {
        cdkBuilder.path(path)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty,
    ) : CdkObject(cdkObject), RootDirectoryProperty {
      override fun creationInfo(): Any? = unwrap(this).getCreationInfo()

      override fun path(): String? = unwrap(this).getPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RootDirectoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty):
          RootDirectoryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RootDirectoryProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.RootDirectoryProperty
    }
  }

  public interface AccessPointTagProperty {
    public fun key(): String? = unwrap(this).getKey()

    public fun `value`(): String? = unwrap(this).getValue()

    @CdkDslMarker
    public interface Builder {
      public fun key(key: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty.builder()

      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty,
    ) : CdkObject(cdkObject), AccessPointTagProperty {
      override fun key(): String? = unwrap(this).getKey()

      override fun `value`(): String? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AccessPointTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty):
          AccessPointTagProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AccessPointTagProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.AccessPointTagProperty
    }
  }

  public interface CreationInfoProperty {
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
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty.builder()

      override fun ownerGid(ownerGid: String) {
        cdkBuilder.ownerGid(ownerGid)
      }

      override fun ownerUid(ownerUid: String) {
        cdkBuilder.ownerUid(ownerUid)
      }

      override fun permissions(permissions: String) {
        cdkBuilder.permissions(permissions)
      }

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty,
    ) : CdkObject(cdkObject), CreationInfoProperty {
      override fun ownerGid(): String = unwrap(this).getOwnerGid()

      override fun ownerUid(): String = unwrap(this).getOwnerUid()

      override fun permissions(): String = unwrap(this).getPermissions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CreationInfoProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty):
          CreationInfoProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CreationInfoProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.CreationInfoProperty
    }
  }

  public interface PosixUserProperty {
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
      private val cdkBuilder:
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty.Builder =
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty.builder()

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

      public fun build(): software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty,
    ) : CdkObject(cdkObject), PosixUserProperty {
      override fun gid(): String = unwrap(this).getGid()

      override fun secondaryGids(): List<String> = unwrap(this).getSecondaryGids() ?: emptyList()

      override fun uid(): String = unwrap(this).getUid()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PosixUserProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty):
          PosixUserProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PosixUserProperty):
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.efs.CfnAccessPoint.PosixUserProperty
    }
  }
}
