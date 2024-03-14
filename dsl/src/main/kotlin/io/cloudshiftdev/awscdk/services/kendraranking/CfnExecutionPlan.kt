package io.cloudshiftdev.awscdk.services.kendraranking

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnExecutionPlan internal constructor(
  private val cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrId(): String = unwrap(this).getAttrId()

  public open fun capacityUnits(): Any? = unwrap(this).getCapacityUnits()

  public open fun capacityUnits(`value`: IResolvable) {
    unwrap(this).setCapacityUnits(`value`.let(IResolvable::unwrap))
  }

  public open fun capacityUnits(`value`: CapacityUnitsConfigurationProperty) {
    unwrap(this).setCapacityUnits(`value`.let(CapacityUnitsConfigurationProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("570b14833c90f2501a4684db2a2bea10f73daeaaa583d3eb54249322b156a911")
  public open fun capacityUnits(`value`: CapacityUnitsConfigurationProperty.Builder.() -> Unit):
      Unit = capacityUnits(CapacityUnitsConfigurationProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  public interface Builder {
    public fun capacityUnits(capacityUnits: IResolvable)

    public fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f0487232fc9542eb49e50bc9ac7b57ac3f877147a4709a33d881524d6dd2607")
    public fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun name(name: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.Builder =
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.Builder.create(scope, id)

    override fun capacityUnits(capacityUnits: IResolvable) {
      cdkBuilder.capacityUnits(capacityUnits.let(IResolvable::unwrap))
    }

    override fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty) {
      cdkBuilder.capacityUnits(capacityUnits.let(CapacityUnitsConfigurationProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5f0487232fc9542eb49e50bc9ac7b57ac3f877147a4709a33d881524d6dd2607")
    override
        fun capacityUnits(capacityUnits: CapacityUnitsConfigurationProperty.Builder.() -> Unit):
        Unit = capacityUnits(CapacityUnitsConfigurationProperty(capacityUnits))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.kendraranking.CfnExecutionPlan =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExecutionPlan {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExecutionPlan(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan):
        CfnExecutionPlan = CfnExecutionPlan(cdkObject)

    internal fun unwrap(wrapped: CfnExecutionPlan):
        software.amazon.awscdk.services.kendraranking.CfnExecutionPlan = wrapped.cdkObject
  }

  public interface CapacityUnitsConfigurationProperty {
    public fun rescoreCapacityUnits(): Number

    public interface Builder {
      public fun rescoreCapacityUnits(rescoreCapacityUnits: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty.builder()

      override fun rescoreCapacityUnits(rescoreCapacityUnits: Number) {
        cdkBuilder.rescoreCapacityUnits(rescoreCapacityUnits)
      }

      public fun build():
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty,
    ) : CapacityUnitsConfigurationProperty {
      override fun rescoreCapacityUnits(): Number = unwrap(this).getRescoreCapacityUnits()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CapacityUnitsConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty):
          CapacityUnitsConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CapacityUnitsConfigurationProperty):
          software.amazon.awscdk.services.kendraranking.CfnExecutionPlan.CapacityUnitsConfigurationProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
