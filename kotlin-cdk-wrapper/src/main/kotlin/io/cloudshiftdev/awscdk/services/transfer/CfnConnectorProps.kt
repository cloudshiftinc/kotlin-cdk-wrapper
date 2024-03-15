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

public interface CfnConnectorProps {
  public fun accessRole(): String

  public fun as2Config(): Any? = unwrap(this).getAs2Config()

  public fun loggingRole(): String? = unwrap(this).getLoggingRole()

  public fun sftpConfig(): Any? = unwrap(this).getSftpConfig()

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun url(): String

  @CdkDslMarker
  public interface Builder {
    public fun accessRole(accessRole: String)

    public fun as2Config(as2Config: Any)

    public fun loggingRole(loggingRole: String)

    public fun sftpConfig(sftpConfig: IResolvable)

    public fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7cefba7bac9e4e59575a37d5d88a936b7d6516616538da8411c1ce0bb2cfcb")
    public fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun url(url: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.transfer.CfnConnectorProps.Builder =
        software.amazon.awscdk.services.transfer.CfnConnectorProps.builder()

    override fun accessRole(accessRole: String) {
      cdkBuilder.accessRole(accessRole)
    }

    override fun as2Config(as2Config: Any) {
      cdkBuilder.as2Config(as2Config)
    }

    override fun loggingRole(loggingRole: String) {
      cdkBuilder.loggingRole(loggingRole)
    }

    override fun sftpConfig(sftpConfig: IResolvable) {
      cdkBuilder.sftpConfig(sftpConfig.let(IResolvable::unwrap))
    }

    override fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty) {
      cdkBuilder.sftpConfig(sftpConfig.let(CfnConnector.SftpConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3d7cefba7bac9e4e59575a37d5d88a936b7d6516616538da8411c1ce0bb2cfcb")
    override fun sftpConfig(sftpConfig: CfnConnector.SftpConfigProperty.Builder.() -> Unit): Unit =
        sftpConfig(CfnConnector.SftpConfigProperty(sftpConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun url(url: String) {
      cdkBuilder.url(url)
    }

    public fun build(): software.amazon.awscdk.services.transfer.CfnConnectorProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.transfer.CfnConnectorProps,
  ) : CdkObject(cdkObject), CfnConnectorProps {
    override fun accessRole(): String = unwrap(this).getAccessRole()

    override fun as2Config(): Any? = unwrap(this).getAs2Config()

    override fun loggingRole(): String? = unwrap(this).getLoggingRole()

    override fun sftpConfig(): Any? = unwrap(this).getSftpConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun url(): String = unwrap(this).getUrl()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConnectorProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.transfer.CfnConnectorProps):
        CfnConnectorProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConnectorProps):
        software.amazon.awscdk.services.transfer.CfnConnectorProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.transfer.CfnConnectorProps
  }
}
