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

public interface CfnLocationNFSProps {
  public fun mountOptions(): Any? = unwrap(this).getMountOptions()

  public fun onPremConfig(): Any

  public fun serverHostname(): String? = unwrap(this).getServerHostname()

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun mountOptions(mountOptions: IResolvable)

    public fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af2ade05506e8da744ab6e04cee81561c74cfcea080d6befd6556fb2cadfc3e7")
    public fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty.Builder.() -> Unit)

    public fun onPremConfig(onPremConfig: IResolvable)

    public fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf5703597528879642bf94644d82f6db8aa573618543415d79049ad5e417fa05")
    public fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty.Builder.() -> Unit)

    public fun serverHostname(serverHostname: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnLocationNFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationNFSProps.builder()

    override fun mountOptions(mountOptions: IResolvable) {
      cdkBuilder.mountOptions(mountOptions.let(IResolvable::unwrap))
    }

    override fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty) {
      cdkBuilder.mountOptions(mountOptions.let(CfnLocationNFS.MountOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("af2ade05506e8da744ab6e04cee81561c74cfcea080d6befd6556fb2cadfc3e7")
    override fun mountOptions(mountOptions: CfnLocationNFS.MountOptionsProperty.Builder.() -> Unit):
        Unit = mountOptions(CfnLocationNFS.MountOptionsProperty(mountOptions))

    override fun onPremConfig(onPremConfig: IResolvable) {
      cdkBuilder.onPremConfig(onPremConfig.let(IResolvable::unwrap))
    }

    override fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty) {
      cdkBuilder.onPremConfig(onPremConfig.let(CfnLocationNFS.OnPremConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("cf5703597528879642bf94644d82f6db8aa573618543415d79049ad5e417fa05")
    override fun onPremConfig(onPremConfig: CfnLocationNFS.OnPremConfigProperty.Builder.() -> Unit):
        Unit = onPremConfig(CfnLocationNFS.OnPremConfigProperty(onPremConfig))

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

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationNFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFSProps,
  ) : CdkObject(cdkObject), CfnLocationNFSProps {
    override fun mountOptions(): Any? = unwrap(this).getMountOptions()

    override fun onPremConfig(): Any = unwrap(this).getOnPremConfig()

    override fun serverHostname(): String? = unwrap(this).getServerHostname()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationNFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationNFSProps):
        CfnLocationNFSProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationNFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationNFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationNFSProps
  }
}
