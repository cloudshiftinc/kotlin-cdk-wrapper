@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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

public open class CfnTransitGatewayConnect internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrCreationTime(): String = unwrap(this).getAttrCreationTime()

  public open fun attrState(): String = unwrap(this).getAttrState()

  public open fun attrTransitGatewayAttachmentId(): String =
      unwrap(this).getAttrTransitGatewayAttachmentId()

  public open fun attrTransitGatewayId(): String = unwrap(this).getAttrTransitGatewayId()

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun options(): Any = unwrap(this).getOptions()

  public open fun options(`value`: IResolvable) {
    unwrap(this).setOptions(`value`.let(IResolvable::unwrap))
  }

  public open fun options(`value`: TransitGatewayConnectOptionsProperty) {
    unwrap(this).setOptions(`value`.let(TransitGatewayConnectOptionsProperty::unwrap))
  }

  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("77935793ebec9bdf3b5c82feda60f560ee5efcd38fb8e99bdd22e505308b704f")
  public open fun options(`value`: TransitGatewayConnectOptionsProperty.Builder.() -> Unit): Unit =
      options(TransitGatewayConnectOptionsProperty(`value`))

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun transportTransitGatewayAttachmentId(): String =
      unwrap(this).getTransportTransitGatewayAttachmentId()

  public open fun transportTransitGatewayAttachmentId(`value`: String) {
    unwrap(this).setTransportTransitGatewayAttachmentId(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun options(options: IResolvable)

    public fun options(options: TransitGatewayConnectOptionsProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21b92d09de996ca5f42748c09084837f9a531a7edcfeaebde1daee4f1162274d")
    public fun options(options: TransitGatewayConnectOptionsProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.Builder =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.Builder.create(scope, id)

    override fun options(options: IResolvable) {
      cdkBuilder.options(options.let(IResolvable::unwrap))
    }

    override fun options(options: TransitGatewayConnectOptionsProperty) {
      cdkBuilder.options(options.let(TransitGatewayConnectOptionsProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("21b92d09de996ca5f42748c09084837f9a531a7edcfeaebde1daee4f1162274d")
    override fun options(options: TransitGatewayConnectOptionsProperty.Builder.() -> Unit): Unit =
        options(TransitGatewayConnectOptionsProperty(options))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId: String) {
      cdkBuilder.transportTransitGatewayAttachmentId(transportTransitGatewayAttachmentId)
    }

    public fun build(): software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTransitGatewayConnect {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTransitGatewayConnect(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect):
        CfnTransitGatewayConnect = CfnTransitGatewayConnect(cdkObject)

    internal fun unwrap(wrapped: CfnTransitGatewayConnect):
        software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect = wrapped.cdkObject
  }

  public interface TransitGatewayConnectOptionsProperty {
    public fun protocol(): String? = unwrap(this).getProtocol()

    @CdkDslMarker
    public interface Builder {
      public fun protocol(protocol: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.Builder
          =
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty.builder()

      override fun protocol(protocol: String) {
        cdkBuilder.protocol(protocol)
      }

      public fun build():
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty,
    ) : CdkObject(cdkObject), TransitGatewayConnectOptionsProperty {
      override fun protocol(): String? = unwrap(this).getProtocol()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TransitGatewayConnectOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty):
          TransitGatewayConnectOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TransitGatewayConnectOptionsProperty):
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.ec2.CfnTransitGatewayConnect.TransitGatewayConnectOptionsProperty
    }
  }
}
