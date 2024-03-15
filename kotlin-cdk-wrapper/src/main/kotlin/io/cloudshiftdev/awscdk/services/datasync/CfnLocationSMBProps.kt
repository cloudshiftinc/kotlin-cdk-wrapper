@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnLocationSMBProps {
  public fun agentArns(): List<String>

  public fun domain(): String? = unwrap(this).getDomain()

  public fun mountOptions(): Any? = unwrap(this).getMountOptions()

  public fun password(): String? = unwrap(this).getPassword()

  public fun serverHostname(): String? = unwrap(this).getServerHostname()

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun user(): String

  @CdkDslMarker
  public interface Builder {
    public fun agentArns(agentArns: List<String>)

    public fun agentArns(vararg agentArns: String)

    public fun domain(domain: String)

    public fun mountOptions(mountOptions: IResolvable)

    public fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d02ea361984d38f99523348a1b0e8d6ff0e0801e47f14eb72005ef7c84d1c4")
    public fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty.Builder.() -> Unit)

    public fun password(password: String)

    public fun serverHostname(serverHostname: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun user(user: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationSMBProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationSMBProps.builder()

    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
    }

    override fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(CfnLocationSMB.MountOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("60d02ea361984d38f99523348a1b0e8d6ff0e0801e47f14eb72005ef7c84d1c4")
    override fun mountOptions(mountOptions: CfnLocationSMB.MountOptionsProperty.Builder.() -> Unit):
        Unit = mountOptions(CfnLocationSMB.MountOptionsProperty(mountOptions))

    override fun password(password: String) {
      cdkBuilder.password(password)
    }

    override fun serverHostname(serverHostname: String) {
      cdkBuilder.serverHostname(serverHostname)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun user(user: String) {
      cdkBuilder.user(user)
    }

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationSMBProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMBProps,
  ) : CdkObject(cdkObject), CfnLocationSMBProps {
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    override fun domain(): String? = unwrap(this).getDomain()

    override fun mountOptions(): Any? = unwrap(this).getMountOptions()

    override fun password(): String? = unwrap(this).getPassword()

    override fun serverHostname(): String? = unwrap(this).getServerHostname()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun user(): String = unwrap(this).getUser()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationSMBProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationSMBProps):
        CfnLocationSMBProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationSMBProps):
        software.amazon.awscdk.services.datasync.CfnLocationSMBProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationSMBProps
  }
}
