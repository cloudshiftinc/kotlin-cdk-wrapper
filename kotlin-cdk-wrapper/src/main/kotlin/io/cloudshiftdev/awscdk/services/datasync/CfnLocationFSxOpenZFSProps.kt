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

public interface CfnLocationFSxOpenZFSProps {
  public fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

  public fun protocol(): Any

  public fun securityGroupArns(): List<String>

  public fun subdirectory(): String? = unwrap(this).getSubdirectory()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun fsxFilesystemArn(fsxFilesystemArn: String)

    public fun protocol(protocol: IResolvable)

    public fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f98830f77b704d60632afbec3c06d164bddba080e917dac6e8c19711206b353")
    public fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty.Builder.() -> Unit)

    public fun securityGroupArns(securityGroupArns: List<String>)

    public fun securityGroupArns(vararg securityGroupArns: String)

    public fun subdirectory(subdirectory: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps.Builder =
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps.builder()

    override fun fsxFilesystemArn(fsxFilesystemArn: String) {
      cdkBuilder.fsxFilesystemArn(fsxFilesystemArn)
    }

    override fun protocol(protocol: IResolvable) {
      cdkBuilder.protocol(protocol.let(IResolvable::unwrap))
    }

    override fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty) {
      cdkBuilder.protocol(protocol.let(CfnLocationFSxOpenZFS.ProtocolProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8f98830f77b704d60632afbec3c06d164bddba080e917dac6e8c19711206b353")
    override fun protocol(protocol: CfnLocationFSxOpenZFS.ProtocolProperty.Builder.() -> Unit): Unit
        = protocol(CfnLocationFSxOpenZFS.ProtocolProperty(protocol))

    override fun securityGroupArns(securityGroupArns: List<String>) {
      cdkBuilder.securityGroupArns(securityGroupArns)
    }

    override fun securityGroupArns(vararg securityGroupArns: String): Unit =
        securityGroupArns(securityGroupArns.toList())

    override fun subdirectory(subdirectory: String) {
      cdkBuilder.subdirectory(subdirectory)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps,
  ) : CdkObject(cdkObject), CfnLocationFSxOpenZFSProps {
    override fun fsxFilesystemArn(): String? = unwrap(this).getFsxFilesystemArn()

    override fun protocol(): Any = unwrap(this).getProtocol()

    override fun securityGroupArns(): List<String> = unwrap(this).getSecurityGroupArns()

    override fun subdirectory(): String? = unwrap(this).getSubdirectory()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnLocationFSxOpenZFSProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps):
        CfnLocationFSxOpenZFSProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnLocationFSxOpenZFSProps):
        software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnLocationFSxOpenZFSProps
  }
}
