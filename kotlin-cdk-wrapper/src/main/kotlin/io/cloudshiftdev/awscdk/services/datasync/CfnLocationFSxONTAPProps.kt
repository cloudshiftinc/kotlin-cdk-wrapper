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

public interface CfnLocationFSxONTAPProps {
  public fun protocol(): Any? = unwrap(this).getProtocol()

  public fun securityGroupArns(): List<String>

  public fun storageVirtualMachineArn(): String

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun protocol(protocol: IResolvable)

    public fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e26ef007f0005b9f71f98f8291591df6a8a99446b5645c8711ca11b9f640962")
    public fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty.Builder.() -> Unit)

    public fun securityGroupArns(securityGroupArns: List<String>)

    public fun securityGroupArns(vararg securityGroupArns: String)

    public fun storageVirtualMachineArn(storageVirtualMachineArn: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps.builder()

    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    override fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(CfnLocationFSxONTAP.ProtocolProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2e26ef007f0005b9f71f98f8291591df6a8a99446b5645c8711ca11b9f640962")
    override fun protocol(protocol: CfnLocationFSxONTAP.ProtocolProperty.Builder.() -> Unit): Unit =
        protocol(CfnLocationFSxONTAP.ProtocolProperty(protocol))

    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    override fun storageVirtualMachineArn(storageVirtualMachineArn: String) {
      cdkBuilder.storageVirtualMachineArn(storageVirtualMachineArn)
    }

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps,
  ) : CdkObject(cdkObject), CfnLocationFSxONTAPProps {
    override fun protocol(): Any? = unwrap(this).getProtocol()

    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

    override fun storageVirtualMachineArn(): String = unwrap(this).getStorageVirtualMachineArn()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationFSxONTAPProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps):
        CfnLocationFSxONTAPProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxONTAPProps):
        software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationFSxONTAPProps
  }
}
