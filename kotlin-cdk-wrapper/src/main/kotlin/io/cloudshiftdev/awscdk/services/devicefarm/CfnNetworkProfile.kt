@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.devicefarm

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnNetworkProfile internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfile,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun downlinkBandwidthBits(): Number? = unwrap(this).getDownlinkBandwidthBits()

  public open fun downlinkBandwidthBits(`value`: Number) {
    unwrap(this).setDownlinkBandwidthBits(`value`)
  }

  public open fun downlinkDelayMs(): Number? = unwrap(this).getDownlinkDelayMs()

  public open fun downlinkDelayMs(`value`: Number) {
    unwrap(this).setDownlinkDelayMs(`value`)
  }

  public open fun downlinkJitterMs(): Number? = unwrap(this).getDownlinkJitterMs()

  public open fun downlinkJitterMs(`value`: Number) {
    unwrap(this).setDownlinkJitterMs(`value`)
  }

  public open fun downlinkLossPercent(): Number? = unwrap(this).getDownlinkLossPercent()

  public open fun downlinkLossPercent(`value`: Number) {
    unwrap(this).setDownlinkLossPercent(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun projectArn(): String = unwrap(this).getProjectArn()

  public open fun projectArn(`value`: String) {
    unwrap(this).setProjectArn(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public open fun uplinkBandwidthBits(): Number? = unwrap(this).getUplinkBandwidthBits()

  public open fun uplinkBandwidthBits(`value`: Number) {
    unwrap(this).setUplinkBandwidthBits(`value`)
  }

  public open fun uplinkDelayMs(): Number? = unwrap(this).getUplinkDelayMs()

  public open fun uplinkDelayMs(`value`: Number) {
    unwrap(this).setUplinkDelayMs(`value`)
  }

  public open fun uplinkJitterMs(): Number? = unwrap(this).getUplinkJitterMs()

  public open fun uplinkJitterMs(`value`: Number) {
    unwrap(this).setUplinkJitterMs(`value`)
  }

  public open fun uplinkLossPercent(): Number? = unwrap(this).getUplinkLossPercent()

  public open fun uplinkLossPercent(`value`: Number) {
    unwrap(this).setUplinkLossPercent(`value`)
  }

  @CdkDslMarker
  public interface Builder {
    public fun description(description: String)

    public fun downlinkBandwidthBits(downlinkBandwidthBits: Number)

    public fun downlinkDelayMs(downlinkDelayMs: Number)

    public fun downlinkJitterMs(downlinkJitterMs: Number)

    public fun downlinkLossPercent(downlinkLossPercent: Number)

    public fun name(name: String)

    public fun projectArn(projectArn: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)

    public fun uplinkBandwidthBits(uplinkBandwidthBits: Number)

    public fun uplinkDelayMs(uplinkDelayMs: Number)

    public fun uplinkJitterMs(uplinkJitterMs: Number)

    public fun uplinkLossPercent(uplinkLossPercent: Number)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.devicefarm.CfnNetworkProfile.Builder =
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfile.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun downlinkBandwidthBits(downlinkBandwidthBits: Number) {
      cdkBuilder.downlinkBandwidthBits(downlinkBandwidthBits)
    }

    override fun downlinkDelayMs(downlinkDelayMs: Number) {
      cdkBuilder.downlinkDelayMs(downlinkDelayMs)
    }

    override fun downlinkJitterMs(downlinkJitterMs: Number) {
      cdkBuilder.downlinkJitterMs(downlinkJitterMs)
    }

    override fun downlinkLossPercent(downlinkLossPercent: Number) {
      cdkBuilder.downlinkLossPercent(downlinkLossPercent)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun projectArn(projectArn: String) {
      cdkBuilder.projectArn(projectArn)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    override fun uplinkBandwidthBits(uplinkBandwidthBits: Number) {
      cdkBuilder.uplinkBandwidthBits(uplinkBandwidthBits)
    }

    override fun uplinkDelayMs(uplinkDelayMs: Number) {
      cdkBuilder.uplinkDelayMs(uplinkDelayMs)
    }

    override fun uplinkJitterMs(uplinkJitterMs: Number) {
      cdkBuilder.uplinkJitterMs(uplinkJitterMs)
    }

    override fun uplinkLossPercent(uplinkLossPercent: Number) {
      cdkBuilder.uplinkLossPercent(uplinkLossPercent)
    }

    public fun build(): software.amazon.awscdk.services.devicefarm.CfnNetworkProfile =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfile.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnNetworkProfile {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnNetworkProfile(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.devicefarm.CfnNetworkProfile):
        CfnNetworkProfile = CfnNetworkProfile(cdkObject)

    internal fun unwrap(wrapped: CfnNetworkProfile):
        software.amazon.awscdk.services.devicefarm.CfnNetworkProfile = wrapped.cdkObject
  }
}
