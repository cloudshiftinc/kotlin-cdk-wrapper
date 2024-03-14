package io.cloudshiftdev.awscdk.services.mediaconvert

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnQueue internal constructor(
  private val cdkObject: software.amazon.awscdk.services.mediaconvert.CfnQueue,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun attrName(): String = unwrap(this).getAttrName()

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun pricingPlan(): String? = unwrap(this).getPricingPlan()

  public open fun pricingPlan(`value`: String) {
    unwrap(this).setPricingPlan(`value`)
  }

  public open fun status(): String? = unwrap(this).getStatus()

  public open fun status(`value`: String) {
    unwrap(this).setStatus(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun description(description: String)

    public fun name(name: String)

    public fun pricingPlan(pricingPlan: String)

    public fun status(status: String)

    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.mediaconvert.CfnQueue.Builder =
        software.amazon.awscdk.services.mediaconvert.CfnQueue.Builder.create(scope, id)

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun pricingPlan(pricingPlan: String) {
      cdkBuilder.pricingPlan(pricingPlan)
    }

    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.mediaconvert.CfnQueue = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnQueue {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnQueue(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.mediaconvert.CfnQueue): CfnQueue =
        CfnQueue(cdkObject)

    internal fun unwrap(wrapped: CfnQueue): software.amazon.awscdk.services.mediaconvert.CfnQueue =
        wrapped.cdkObject
  }
}
