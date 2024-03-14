package io.cloudshiftdev.awscdk.services.guardduty

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

public open class CfnFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public open fun action(): String? = unwrap(this).getAction()

  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun detectorId(): String? = unwrap(this).getDetectorId()

  public open fun detectorId(`value`: String) {
    unwrap(this).setDetectorId(`value`)
  }

  public open fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

  public open fun findingCriteria(`value`: IResolvable) {
    unwrap(this).setFindingCriteria(`value`.let(IResolvable::unwrap))
  }

  public open fun findingCriteria(`value`: FindingCriteriaProperty) {
    unwrap(this).setFindingCriteria(`value`.let(FindingCriteriaProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("982bc10b504450b13bb6cf50a6b7527c70a0e43fb18969a87a89bfabe1e69df6")
  public open fun findingCriteria(`value`: FindingCriteriaProperty.Builder.() -> Unit): Unit =
      findingCriteria(FindingCriteriaProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String? = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun rank(): Number? = unwrap(this).getRank()

  public open fun rank(`value`: Number) {
    unwrap(this).setRank(`value`)
  }

  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun action(action: String)

    public fun description(description: String)

    public fun detectorId(detectorId: String)

    public fun findingCriteria(findingCriteria: IResolvable)

    public fun findingCriteria(findingCriteria: FindingCriteriaProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("931a05aefa29d36a8fd2cb68df3a2abeaf89aabac29d1179200ca079a5c9fc6f")
    public fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun rank(rank: Number)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.guardduty.CfnFilter.Builder =
        software.amazon.awscdk.services.guardduty.CfnFilter.Builder.create(scope, id)

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun detectorId(detectorId: String) {
      cdkBuilder.detectorId(detectorId)
    }

    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    override fun findingCriteria(findingCriteria: FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(FindingCriteriaProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("931a05aefa29d36a8fd2cb68df3a2abeaf89aabac29d1179200ca079a5c9fc6f")
    override fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit): Unit
        = findingCriteria(FindingCriteriaProperty(findingCriteria))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun rank(rank: Number) {
      cdkBuilder.rank(rank)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.guardduty.CfnFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter): CfnFilter =
        CfnFilter(cdkObject)

    internal fun unwrap(wrapped: CfnFilter): software.amazon.awscdk.services.guardduty.CfnFilter =
        wrapped.cdkObject
  }

  public interface ConditionProperty {
    public fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

    public fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

    public fun greaterThan(): Number? = unwrap(this).getGreaterThan()

    public fun greaterThanOrEqual(): Number? = unwrap(this).getGreaterThanOrEqual()

    public fun gt(): Number? = unwrap(this).getGt()

    public fun gte(): Number? = unwrap(this).getGte()

    public fun lessThan(): Number? = unwrap(this).getLessThan()

    public fun lessThanOrEqual(): Number? = unwrap(this).getLessThanOrEqual()

    public fun lt(): Number? = unwrap(this).getLt()

    public fun lte(): Number? = unwrap(this).getLte()

    public fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

    public fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()

    public interface Builder {
      public fun eq(eq: List<String>)

      public fun equalTo(equalTo: List<String>)

      public fun greaterThan(greaterThan: Number)

      public fun greaterThanOrEqual(greaterThanOrEqual: Number)

      public fun gt(gt: Number)

      public fun gte(gte: Number)

      public fun lessThan(lessThan: Number)

      public fun lessThanOrEqual(lessThanOrEqual: Number)

      public fun lt(lt: Number)

      public fun lte(lte: Number)

      public fun neq(neq: List<String>)

      public fun notEquals(notEquals: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.Builder =
          software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty.builder()

      override fun eq(eq: List<String>) {
        cdkBuilder.eq(eq)
      }

      override fun equalTo(equalTo: List<String>) {
        cdkBuilder.equalTo(equalTo)
      }

      override fun greaterThan(greaterThan: Number) {
        cdkBuilder.greaterThan(greaterThan)
      }

      override fun greaterThanOrEqual(greaterThanOrEqual: Number) {
        cdkBuilder.greaterThanOrEqual(greaterThanOrEqual)
      }

      override fun gt(gt: Number) {
        cdkBuilder.gt(gt)
      }

      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
      }

      override fun lessThan(lessThan: Number) {
        cdkBuilder.lessThan(lessThan)
      }

      override fun lessThanOrEqual(lessThanOrEqual: Number) {
        cdkBuilder.lessThanOrEqual(lessThanOrEqual)
      }

      override fun lt(lt: Number) {
        cdkBuilder.lt(lt)
      }

      override fun lte(lte: Number) {
        cdkBuilder.lte(lte)
      }

      override fun neq(neq: List<String>) {
        cdkBuilder.neq(neq)
      }

      override fun notEquals(notEquals: List<String>) {
        cdkBuilder.notEquals(notEquals)
      }

      public fun build(): software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty,
    ) : ConditionProperty {
      override fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

      override fun equalTo(): List<String> = unwrap(this).getEqualTo() ?: emptyList()

      override fun greaterThan(): Number? = unwrap(this).getGreaterThan()

      override fun greaterThanOrEqual(): Number? = unwrap(this).getGreaterThanOrEqual()

      override fun gt(): Number? = unwrap(this).getGt()

      override fun gte(): Number? = unwrap(this).getGte()

      override fun lessThan(): Number? = unwrap(this).getLessThan()

      override fun lessThanOrEqual(): Number? = unwrap(this).getLessThanOrEqual()

      override fun lt(): Number? = unwrap(this).getLt()

      override fun lte(): Number? = unwrap(this).getLte()

      override fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

      override fun notEquals(): List<String> = unwrap(this).getNotEquals() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty):
          ConditionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionProperty):
          software.amazon.awscdk.services.guardduty.CfnFilter.ConditionProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface FindingCriteriaProperty {
    public fun criterion(): Any? = unwrap(this).getCriterion()

    public fun itemType(): Any? = unwrap(this).getItemType()

    public interface Builder {
      public fun criterion(criterion: Any)

      public fun itemType(itemType: IResolvable)

      public fun itemType(itemType: ConditionProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("897a74b3e78942542e7d1b032849a233ae4e0ba8dddd14fdf896c74ee82093a8")
      public fun itemType(itemType: ConditionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.Builder =
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty.builder()

      override fun criterion(criterion: Any) {
        cdkBuilder.criterion(criterion)
      }

      override fun itemType(itemType: IResolvable) {
        cdkBuilder.itemType(itemType.let(IResolvable::unwrap))
      }

      override fun itemType(itemType: ConditionProperty) {
        cdkBuilder.itemType(itemType.let(ConditionProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("897a74b3e78942542e7d1b032849a233ae4e0ba8dddd14fdf896c74ee82093a8")
      override fun itemType(itemType: ConditionProperty.Builder.() -> Unit): Unit =
          itemType(ConditionProperty(itemType))

      public fun build():
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty,
    ) : FindingCriteriaProperty {
      override fun criterion(): Any? = unwrap(this).getCriterion()

      override fun itemType(): Any? = unwrap(this).getItemType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FindingCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty):
          FindingCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FindingCriteriaProperty):
          software.amazon.awscdk.services.guardduty.CfnFilter.FindingCriteriaProperty = (wrapped as
          Wrapper).cdkObject
    }
  }
}
