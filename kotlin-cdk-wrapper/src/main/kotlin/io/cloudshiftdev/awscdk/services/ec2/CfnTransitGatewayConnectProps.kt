@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnTransitGatewayConnectProps {
  public fun options(): Any

  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public fun transportTransitGatewayAttachmentId(): String

  @CdkDslMarker
  public interface Builder {
    public fun options(options: IResolvable)

    public fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76987fcdbaf02be97ffe5677ac5175f015452920c7dc494414f663c321cf6797")
    public
        fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps.builder()

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty) {
      cdkBuilder.options(options.let(CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("76987fcdbaf02be97ffe5677ac5175f015452920c7dc494414f663c321cf6797")
    override
        fun options(options: CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder.() -> Unit):
        Unit = options(CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty(options))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
      cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps,
  ) : CdkObject(cdkObject), CfnTransitGatewayConnectProps {
    override fun options(): Any = unwrap(this).getOptions()

    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    override fun transportTransitGatewayAttachmentId(): String =
        unwrap(this).getTransportTransitGatewayAttachmentId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnTransitGatewayConnectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps):
        CfnTransitGatewayConnectProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayConnectProps):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.CfnTransitGatewayConnectProps
  }
}
