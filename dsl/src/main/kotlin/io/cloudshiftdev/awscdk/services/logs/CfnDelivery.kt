package io.cloudshiftdev.awscdk.services.logs

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDelivery internal constructor(
  private val cdkObject: software.amazon.awscdk.services.logs.CfnDelivery,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrDeliveryDestinationType(): String =
      unwrap(this).getAttrDeliveryDestinationType()

  public open fun attrDeliveryId(): String = unwrap(this).getAttrDeliveryId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun deliveryDestinationArn(): String = unwrap(this).getDeliveryDestinationArn()

  public open fun deliveryDestinationArn(`value`: String) {
    unwrap(this).setDeliveryDestinationArn(`value`)
  }

  public open fun deliverySourceName(): String = unwrap(this).getDeliverySourceName()

  public open fun deliverySourceName(`value`: String) {
    unwrap(this).setDeliverySourceName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun deliveryDestinationArn(deliveryDestinationArn: String) {
    }

    public fun deliverySourceName(deliverySourceName: String) {
    }

    public fun tags(tags: List<CfnTag>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.logs.CfnDelivery.Builder =
        software.amazon.awscdk.services.logs.CfnDelivery.Builder.create(scope, id)

    public override fun deliveryDestinationArn(deliveryDestinationArn: String) {
      cdkBuilder.deliveryDestinationArn(deliveryDestinationArn)
    }

    public override fun deliverySourceName(deliverySourceName: String) {
      cdkBuilder.deliverySourceName(deliverySourceName)
    }

    public override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.logs.CfnDelivery = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDelivery {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDelivery(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.CfnDelivery): CfnDelivery =
        CfnDelivery(cdkObject)

    internal fun unwrap(wrapped: CfnDelivery): software.amazon.awscdk.services.logs.CfnDelivery =
        wrapped.cdkObject
  }
}
