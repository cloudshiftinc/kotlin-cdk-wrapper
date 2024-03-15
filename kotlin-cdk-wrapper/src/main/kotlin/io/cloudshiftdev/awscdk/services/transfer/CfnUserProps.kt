@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.transfer

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnUserProps {
  public fun homeDirectory(): String? = unwrap(this).getHomeDirectory()

  public fun homeDirectoryMappings(): Any? = unwrap(this).getHomeDirectoryMappings()

  public fun homeDirectoryType(): String? = unwrap(this).getHomeDirectoryType()

  public fun policy(): String? = unwrap(this).getPolicy()

  public fun posixProfile(): Any? = unwrap(this).getPosixProfile()

  public fun role(): String

  public fun serverId(): String

  public fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun userName(): String

  @CdkDslMarker
  public interface Builder {
    public fun homeDirectory(homeDirectory: String)

    public fun homeDirectoryMappings(homeDirectoryMappings: IResolvable)

    public fun homeDirectoryMappings(homeDirectoryMappings: List<Any>)

    public fun homeDirectoryMappings(vararg homeDirectoryMappings: Any)

    public fun homeDirectoryType(homeDirectoryType: String)

    public fun policy(policy: String)

    public fun posixProfile(posixProfile: IResolvable)

    public fun posixProfile(posixProfile: CfnUser.PosixProfileProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("727a4e60b21450c81f954f6c7ee847833f2a30081c313382cb7a44f1be76fbfd")
    public fun posixProfile(posixProfile: CfnUser.PosixProfileProperty.Builder.() -> Unit)

    public fun role(role: String)

    public fun serverId(serverId: String)

    public fun sshPublicKeys(sshPublicKeys: List<String>)

    public fun sshPublicKeys(vararg sshPublicKeys: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun userName(userName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnUserProps.Builder =
        software.amazon.awscdk.services.transfer.CfnUserProps.builder()

    override fun homeDirectory(homeDirectory: String) {
      cdkBuilder.homeDirectory(homeDirectory)
    }

    override fun homeDirectoryMappings(homeDirectoryMappings: IResolvable) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings.let(IResolvable::unwrap))
    }

    override fun homeDirectoryMappings(homeDirectoryMappings: List<Any>) {
      cdkBuilder.homeDirectoryMappings(homeDirectoryMappings)
    }

    override fun homeDirectoryMappings(vararg homeDirectoryMappings: Any): Unit =
        homeDirectoryMappings(homeDirectoryMappings.toList())

    override fun homeDirectoryType(homeDirectoryType: String) {
      cdkBuilder.homeDirectoryType(homeDirectoryType)
    }

    override fun policy(policy: String) {
      cdkBuilder.policy(policy)
    }

    override fun posixProfile(posixProfile: IResolvable) {
      cdkBuilder.posixProfile(posixProfile.let(IResolvable::unwrap))
    }

    override fun posixProfile(posixProfile: CfnUser.PosixProfileProperty) {
      cdkBuilder.posixProfile(posixProfile.let(CfnUser.PosixProfileProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("727a4e60b21450c81f954f6c7ee847833f2a30081c313382cb7a44f1be76fbfd")
    override fun posixProfile(posixProfile: CfnUser.PosixProfileProperty.Builder.() -> Unit): Unit =
        posixProfile(CfnUser.PosixProfileProperty(posixProfile))

    override fun role(role: String) {
      cdkBuilder.role(role)
    }

    override fun serverId(serverId: String) {
      cdkBuilder.serverId(serverId)
    }

    override fun sshPublicKeys(sshPublicKeys: List<String>) {
      cdkBuilder.sshPublicKeys(sshPublicKeys)
    }

    override fun sshPublicKeys(vararg sshPublicKeys: String): Unit =
        sshPublicKeys(sshPublicKeys.toList())

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun userName(userName: String) {
      cdkBuilder.userName(userName)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnUserProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnUserProps,
  ) : CdkObject(cdkObject), CfnUserProps {
    override fun homeDirectory(): String? = unwrap(this).getHomeDirectory()

    override fun homeDirectoryMappings(): Any? = unwrap(this).getHomeDirectoryMappings()

    override fun homeDirectoryType(): String? = unwrap(this).getHomeDirectoryType()

    override fun policy(): String? = unwrap(this).getPolicy()

    override fun posixProfile(): Any? = unwrap(this).getPosixProfile()

    override fun role(): String = unwrap(this).getRole()

    override fun serverId(): String = unwrap(this).getServerId()

    override fun sshPublicKeys(): List<String> = unwrap(this).getSshPublicKeys() ?: emptyList()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun userName(): String = unwrap(this).getUserName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnUserProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnUserProps):
        CfnUserProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserProps):
        software.amazon.awscdk.services.transfer.CfnUserProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.transfer.CfnUserProps
  }
}
