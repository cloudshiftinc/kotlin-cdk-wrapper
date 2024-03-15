@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connectcampaigns

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnCampaignProps {
  public fun connectInstanceArn(): String

  public fun dialerConfig(): Any

  public fun name(): String

  public fun outboundCallConfig(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  @CdkDslMarker
  public interface Builder {
    public fun connectInstanceArn(connectInstanceArn: String)

    public fun dialerConfig(dialerConfig: IResolvable)

    public fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea2ed3d759a6402c6b344a468723967fe9f0dc2111c066c3041f7812590e86")
    public fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun outboundCallConfig(outboundCallConfig: IResolvable)

    public fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07a85f65c144ed1d964ce497a6816dda38a1110328749768df09b37aea80ebb9")
    public
        fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps.Builder =
        software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps.builder()

    override fun connectInstanceArn(connectInstanceArn: String) {
      cdkBuilder.connectInstanceArn(connectInstanceArn)
    }

    override fun dialerConfig(dialerConfig: IResolvable) {
      cdkBuilder.dialerConfig(dialerConfig.let(IResolvable::unwrap))
    }

    override fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty) {
      cdkBuilder.dialerConfig(dialerConfig.let(CfnCampaign.DialerConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("63ea2ed3d759a6402c6b344a468723967fe9f0dc2111c066c3041f7812590e86")
    override fun dialerConfig(dialerConfig: CfnCampaign.DialerConfigProperty.Builder.() -> Unit):
        Unit = dialerConfig(CfnCampaign.DialerConfigProperty(dialerConfig))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun outboundCallConfig(outboundCallConfig: IResolvable) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(IResolvable::unwrap))
    }

    override fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty) {
      cdkBuilder.outboundCallConfig(outboundCallConfig.let(CfnCampaign.OutboundCallConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("07a85f65c144ed1d964ce497a6816dda38a1110328749768df09b37aea80ebb9")
    override
        fun outboundCallConfig(outboundCallConfig: CfnCampaign.OutboundCallConfigProperty.Builder.() -> Unit):
        Unit = outboundCallConfig(CfnCampaign.OutboundCallConfigProperty(outboundCallConfig))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps,
  ) : CdkObject(cdkObject), CfnCampaignProps {
    override fun connectInstanceArn(): String = unwrap(this).getConnectInstanceArn()

    override fun dialerConfig(): Any = unwrap(this).getDialerConfig()

    override fun name(): String = unwrap(this).getName()

    override fun outboundCallConfig(): Any = unwrap(this).getOutboundCallConfig()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnCampaignProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps):
        CfnCampaignProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnCampaignProps):
        software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connectcampaigns.CfnCampaignProps
  }
}
