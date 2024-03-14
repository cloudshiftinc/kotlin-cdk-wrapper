package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnUser internal constructor(
  private val cdkObject: software.amazon.awscdk.services.transfer.CfnUser,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrServerId(): String = unwrap(this).getAttrServerId()

  public open fun attrUserName(): String = unwrap(this).getAttrUserName()

  public open fun homeDirectory(): String? = unwrap(this).getHomeDirectory()

  public open fun homeDirectory(`value`: String) {
    unwrap(this).setHomeDirectory(`value`)
  }

  public open fun homeDirectoryMappings(): Any? = unwrap(this).getHomeDirectoryMappings()

  public open fun homeDirectoryMappings(`value`: IResolvable) {
    unwrap(this).setHomeDirectoryMappings(`value`.let(IResolvable::unwrap))
  }

  public open fun homeDirectoryMappings(__idx_ac66f0: List<Any>) {
    unwrap(this).setHomeDirectoryMappings(__idx_ac66f0)
  }

  public open fun homeDirectoryType(): String? = unwrap(this).getHomeDirectoryType()

  public open fun homeDirectoryType(`value`: String) {
    unwrap(this).setHomeDirectoryType(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun policy(): String? = unwrap(this).getPolicy()

  public open fun policy(`value`: String) {
    unwrap(this).setPolicy(`value`)
  }

  public open fun posixProfile(): Any? = unwrap(this).getPosixProfile()

  public open fun posixProfile(`value`: IResolvable) {
    unwrap(this).setPosixProfile(`value`.let(IResolvable::unwrap))
  }

  public open fun posixProfile(`value`: PosixProfileProperty) {
    unwrap(this).setPosixProfile(`value`.let(PosixProfileProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9acbc61c138bcd43bae61b7caeebe7f56ffa1b4768a4a4dd26b111394137ea5e")
  public open fun posixProfile(`value`: PosixProfileProperty.Builder.() -> Unit): Unit =
      posixProfile(PosixProfileProperty(`value`))

  public open fun role(): String = unwrap(this).getRole()

  public open fun role(`value`: String) {
    unwrap(this).setRole(`value`)
  }

  public open fun serverId(): String = unwrap(this).getServerId()

  public open fun serverId(`value`: String) {
    unwrap(this).setServerId(`value`)
  }

  public open fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

  public open fun sshPublicKeys(`value`: List<String>) {
    unwrap(this).setSshPublicKeys(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun userName(): String = unwrap(this).getUserName()

  public open fun userName(`value`: String) {
    unwrap(this).setUserName(`value`)
  }

  public interface Builder {
    public fun homeDirectory(homeDirectory: String) {
    }

    public fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
    }

    public fun homeDirectoryMappings(homeDirectoryMappings: List<Any>) {
    }

    public fun homeDirectoryType(homeDirectoryType: String) {
    }

    public fun policy(policy: String) {
    }

    public fun posixProfile(posixProfile: IResolvable) {
    }

    public fun posixProfile(posixProfile: PosixProfileProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5007726d81f440483919b487ad7f5f371e433e8973771f56d69ef691dc88b486")
    public fun posixProfile(posixProfile: PosixProfileProperty.Builder.() -> Unit) {
    }

    public fun role(role: String) {
    }

    public fun serverId(serverId: String) {
    }

    public fun sshPublicKeys(sshPublicKeys: List<String>) {
    }

    public fun tags(tags: List<CfnTag>) {
    }

    public fun userName(userName: String) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnUser.Builder =
        software.amazon.awscdk.services.transfer.CfnUser.Builder.create(scope, id)

    public override fun homeDirectory(homeDirectory: String) {
      cdkBuilder.homeDirectory(homeDirectory)
    }

    public override fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings.let(IResolvable::unwrap))
    }

    public override fun homeDirectoryMappings(homeDirectoryMappings: List<Any>) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings)
    }

    public override fun homeDirectoryType(homeDirectoryType: String) {
      cdkBuilder.homeDirectoryType(homeDirectoryType)
    }

    public override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    public override fun posixProfile(posixProfile: IResolvable) {
      cdkBuilder.posixProfile(posixProfile.let(IResolvable::unwrap))
    }

    public override fun posixProfile(posixProfile: PosixProfileProperty) {
      cdkBuilder.posixProfile(posixProfile.let(PosixProfileProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5007726d81f440483919b487ad7f5f371e433e8973771f56d69ef691dc88b486")
    public override fun posixProfile(posixProfile: PosixProfileProperty.Builder.() -> Unit): Unit =
        posixProfile(PosixProfileProperty(posixProfile))

    public override fun role(role: String) {
      cdkBuilder.role(role)
    }

    public override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    public override fun sshPublicKeys(sshPublicKeys: List<String>) {
      cdkBuilder.sshPublicKeys(sshPublicKeys)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnUser = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnUser {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnUser(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUser): CfnUser =
        CfnUser(cdkObject)

    internal fun unwrap(wrapped: CfnUser): software.amazon.awscdk.services.transfer.CfnUser =
        wrapped.cdkObject
  }

  public interface PosixProfileProperty {
    public fun gid(): Number

    public fun secondaryGids(): Any? = unwrap(this).getSecondaryGids()

    public fun uid(): Number

    public interface Builder {
      public fun gid(gid: Number) {
      }

      public fun secondaryGids(secondaryGids: IResolvable) {
      }

      public fun secondaryGids(secondaryGids: List<Number>) {
      }

      public fun uid(uid: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty.builder()

      public override fun gid(gid: Number) {
        cdkBuilder.gid(gid)
      }

      public override fun secondaryGids(secondaryGids: IResolvable) {
        cdkBuilder.secondaryGids(secondaryGids.let(IResolvable::unwrap))
      }

      public override fun secondaryGids(secondaryGids: List<Number>) {
        cdkBuilder.secondaryGids(secondaryGids)
      }

      public override fun uid(uid: Number) {
        cdkBuilder.uid(uid)
      }

      public fun build(): software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty,
    ) : PosixProfileProperty {
      public override fun gid(): Number = unwrap(this).getGid()

      public override fun secondaryGids(): Any? = unwrap(this).getSecondaryGids()

      public override fun uid(): Number = unwrap(this).getUid()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): PosixProfileProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty):
          PosixProfileProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: PosixProfileProperty):
          software.amazon.awscdk.services.transfer.CfnUser.PosixProfileProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface HomeDirectoryMapEntryProperty {
    public fun entry(): String

    public fun target(): String

    public fun type(): String? = unwrap(this).getType()

    public interface Builder {
      public fun entry(entry: String) {
      }

      public fun target(target: String) {
      }

      public fun type(type: String) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty.Builder =
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty.builder()

      public override fun entry(entry: String) {
        cdkBuilder.entry(entry)
      }

      public override fun target(target: String) {
        cdkBuilder.target(target)
      }

      public override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty,
    ) : HomeDirectoryMapEntryProperty {
      public override fun entry(): String = unwrap(this).getEntry()

      public override fun target(): String = unwrap(this).getTarget()

      public override fun type(): String? = unwrap(this).getType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): HomeDirectoryMapEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty):
          HomeDirectoryMapEntryProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: HomeDirectoryMapEntryProperty):
          software.amazon.awscdk.services.transfer.CfnUser.HomeDirectoryMapEntryProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
