package io.cloudshiftdev.awscdk.services.batch

import io.cloudshiftdev.awscdk.CfnResource
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
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnSchedulingPolicy internal constructor(
  private val cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun fairsharePolicy(): Any? = unwrap(this).getFairsharePolicy()

  public open fun fairsharePolicy(`value`: IResolvable) {
    unwrap(this).setFairsharePolicy(`value`.let(IResolvable::unwrap))
  }

  public open fun fairsharePolicy(`value`: FairsharePolicyProperty) {
    unwrap(this).setFairsharePolicy(`value`.let(FairsharePolicyProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a351e3ec9e4a92bd34a05454d73a1044d587269089d010ef3a12a679161e4dd8")
  public open fun fairsharePolicy(`value`: FairsharePolicyProperty.Builder.() -> Unit): Unit =
      fairsharePolicy(FairsharePolicyProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  public interface Builder {
    public fun fairsharePolicy(fairsharePolicy: IResolvable) {
    }

    public fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty) {
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06a0b5b52fb1318708cc740c9dcf623307c96501bdeface2fff8746888e96")
    public fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty.Builder.() -> Unit) {
    }

    public fun name(name: String) {
    }

    public fun tags(tags: Map<String, String>) {
    }
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.Builder =
        software.amazon.awscdk.services.batch.CfnSchedulingPolicy.Builder.create(scope, id)

    public override fun fairsharePolicy(fairsharePolicy: IResolvable) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(IResolvable::unwrap))
    }

    public override fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty) {
      cdkBuilder.fairsharePolicy(fairsharePolicy.let(FairsharePolicyProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("62f06a0b5b52fb1318708cc740c9dcf623307c96501bdeface2fff8746888e96")
    public override
        fun fairsharePolicy(fairsharePolicy: FairsharePolicyProperty.Builder.() -> Unit): Unit =
        fairsharePolicy(FairsharePolicyProperty(fairsharePolicy))

    public override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.batch.CfnSchedulingPolicy =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnSchedulingPolicy {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnSchedulingPolicy(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy):
        CfnSchedulingPolicy = CfnSchedulingPolicy(cdkObject)

    internal fun unwrap(wrapped: CfnSchedulingPolicy):
        software.amazon.awscdk.services.batch.CfnSchedulingPolicy = wrapped.cdkObject
  }

  public interface ShareAttributesProperty {
    public fun shareIdentifier(): String? = unwrap(this).getShareIdentifier()

    public fun weightFactor(): Number? = unwrap(this).getWeightFactor()

    public interface Builder {
      public fun shareIdentifier(shareIdentifier: String) {
      }

      public fun weightFactor(weightFactor: Number) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty.builder()

      public override fun shareIdentifier(shareIdentifier: String) {
        cdkBuilder.shareIdentifier(shareIdentifier)
      }

      public override fun weightFactor(weightFactor: Number) {
        cdkBuilder.weightFactor(weightFactor)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty,
    ) : ShareAttributesProperty {
      public override fun shareIdentifier(): String? = unwrap(this).getShareIdentifier()

      public override fun weightFactor(): Number? = unwrap(this).getWeightFactor()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ShareAttributesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty):
          ShareAttributesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ShareAttributesProperty):
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.ShareAttributesProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FairsharePolicyProperty {
    public fun computeReservation(): Number? = unwrap(this).getComputeReservation()

    public fun shareDecaySeconds(): Number? = unwrap(this).getShareDecaySeconds()

    public fun shareDistribution(): Any? = unwrap(this).getShareDistribution()

    public interface Builder {
      public fun computeReservation(computeReservation: Number) {
      }

      public fun shareDecaySeconds(shareDecaySeconds: Number) {
      }

      public fun shareDistribution(shareDistribution: IResolvable) {
      }

      public fun shareDistribution(shareDistribution: List<Any>) {
      }
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty.Builder
          =
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty.builder()

      public override fun computeReservation(computeReservation: Number) {
        cdkBuilder.computeReservation(computeReservation)
      }

      public override fun shareDecaySeconds(shareDecaySeconds: Number) {
        cdkBuilder.shareDecaySeconds(shareDecaySeconds)
      }

      public override fun shareDistribution(shareDistribution: IResolvable) {
        cdkBuilder.shareDistribution(shareDistribution.let(IResolvable::unwrap))
      }

      public override fun shareDistribution(shareDistribution: List<Any>) {
        cdkBuilder.shareDistribution(shareDistribution)
      }

      public fun build():
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty,
    ) : FairsharePolicyProperty {
      public override fun computeReservation(): Number? = unwrap(this).getComputeReservation()

      public override fun shareDecaySeconds(): Number? = unwrap(this).getShareDecaySeconds()

      public override fun shareDistribution(): Any? = unwrap(this).getShareDistribution()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FairsharePolicyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty):
          FairsharePolicyProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FairsharePolicyProperty):
          software.amazon.awscdk.services.batch.CfnSchedulingPolicy.FairsharePolicyProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
