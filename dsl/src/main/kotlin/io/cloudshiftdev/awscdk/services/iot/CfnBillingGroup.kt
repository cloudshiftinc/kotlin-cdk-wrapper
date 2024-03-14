package io.cloudshiftdev.awscdk.services.iot

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnBillingGroup internal constructor(
  private val cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroup,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun billingGroupName(): String? = unwrap(this).getBillingGroupName()

  public open fun billingGroupName(`value`: String) {
    unwrap(this).setBillingGroupName(`value`)
  }

  public open fun billingGroupProperties(): Any? = unwrap(this).getBillingGroupProperties()

  public open fun billingGroupProperties(`value`: IResolvable) {
    unwrap(this).setBillingGroupProperties(`value`.let(IResolvable::unwrap))
  }

  public open fun billingGroupProperties(`value`: BillingGroupPropertiesProperty) {
    unwrap(this).setBillingGroupProperties(`value`.let(BillingGroupPropertiesProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("6f753c76abb0cd325eaa77a57504c7a71292cbc706237c037ada087bec85ff17")
  public open
      fun billingGroupProperties(`value`: BillingGroupPropertiesProperty.Builder.() -> Unit): Unit =
      billingGroupProperties(BillingGroupPropertiesProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun billingGroupName(billingGroupName: String)

    public fun billingGroupProperties(billingGroupProperties: IResolvable)

    public fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55dbff1410458bd4eef08c70df11ab68af290157f142e2f6921fd29524062fd5")
    public
        fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty.Builder.() -> Unit)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iot.CfnBillingGroup.Builder =
        software.amazon.awscdk.services.iot.CfnBillingGroup.Builder.create(scope, id)

    override fun billingGroupName(billingGroupName: String) {
      cdkBuilder.billingGroupName(billingGroupName)
    }

    override fun billingGroupProperties(billingGroupProperties: IResolvable) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(IResolvable::unwrap))
    }

    override fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty) {
      cdkBuilder.billingGroupProperties(billingGroupProperties.let(BillingGroupPropertiesProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("55dbff1410458bd4eef08c70df11ab68af290157f142e2f6921fd29524062fd5")
    override
        fun billingGroupProperties(billingGroupProperties: BillingGroupPropertiesProperty.Builder.() -> Unit):
        Unit = billingGroupProperties(BillingGroupPropertiesProperty(billingGroupProperties))

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iot.CfnBillingGroup = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnBillingGroup {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnBillingGroup(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroup):
        CfnBillingGroup = CfnBillingGroup(cdkObject)

    internal fun unwrap(wrapped: CfnBillingGroup):
        software.amazon.awscdk.services.iot.CfnBillingGroup = wrapped.cdkObject
  }

  public interface BillingGroupPropertiesProperty {
    public fun billingGroupDescription(): String? = unwrap(this).getBillingGroupDescription()

    public interface Builder {
      public fun billingGroupDescription(billingGroupDescription: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty.builder()

      override fun billingGroupDescription(billingGroupDescription: String) {
        cdkBuilder.billingGroupDescription(billingGroupDescription)
      }

      public fun build():
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty,
    ) : BillingGroupPropertiesProperty {
      override fun billingGroupDescription(): String? = unwrap(this).getBillingGroupDescription()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): BillingGroupPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty):
          BillingGroupPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: BillingGroupPropertiesProperty):
          software.amazon.awscdk.services.iot.CfnBillingGroup.BillingGroupPropertiesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
