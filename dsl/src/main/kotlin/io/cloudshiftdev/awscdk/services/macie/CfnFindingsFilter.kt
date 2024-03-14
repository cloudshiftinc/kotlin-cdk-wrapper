package io.cloudshiftdev.awscdk.services.macie

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
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

public open class CfnFindingsFilter internal constructor(
  private val cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun action(): String? = unwrap(this).getAction()

  public open fun action(`value`: String) {
    unwrap(this).setAction(`value`)
  }

  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun attrFindingsFilterListItems(): IResolvable =
      unwrap(this).getAttrFindingsFilterListItems().let(IResolvable::wrap)

  public open fun attrId(): String = unwrap(this).getAttrId()

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun findingCriteria(): Any = unwrap(this).getFindingCriteria()

  public open fun findingCriteria(`value`: IResolvable) {
    unwrap(this).setFindingCriteria(`value`.let(IResolvable::unwrap))
  }

  public open fun findingCriteria(`value`: FindingCriteriaProperty) {
    unwrap(this).setFindingCriteria(`value`.let(FindingCriteriaProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("860b409189e0a2757df7e355f6540bfcede45cad69dd01fedbe25164f1158b05")
  public open fun findingCriteria(`value`: FindingCriteriaProperty.Builder.() -> Unit): Unit =
      findingCriteria(FindingCriteriaProperty(`value`))

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun name(): String = unwrap(this).getName()

  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  public open fun position(): Number? = unwrap(this).getPosition()

  public open fun position(`value`: Number) {
    unwrap(this).setPosition(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public interface Builder {
    public fun action(action: String)

    public fun description(description: String)

    public fun findingCriteria(findingCriteria: IResolvable)

    public fun findingCriteria(findingCriteria: FindingCriteriaProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("767dc9bf15d13dd8584a0157137877d33d45f5684d3bb57911a95e3f545fedbe")
    public fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit)

    public fun name(name: String)

    public fun position(position: Number)

    public fun tags(tags: List<CfnTag>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.macie.CfnFindingsFilter.Builder =
        software.amazon.awscdk.services.macie.CfnFindingsFilter.Builder.create(scope, id)

    override fun action(action: String) {
      cdkBuilder.action(action)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun findingCriteria(findingCriteria: IResolvable) {
      cdkBuilder.findingCriteria(findingCriteria.let(IResolvable::unwrap))
    }

    override fun findingCriteria(findingCriteria: FindingCriteriaProperty) {
      cdkBuilder.findingCriteria(findingCriteria.let(FindingCriteriaProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("767dc9bf15d13dd8584a0157137877d33d45f5684d3bb57911a95e3f545fedbe")
    override fun findingCriteria(findingCriteria: FindingCriteriaProperty.Builder.() -> Unit): Unit
        = findingCriteria(FindingCriteriaProperty(findingCriteria))

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun position(position: Number) {
      cdkBuilder.position(position)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.macie.CfnFindingsFilter = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFindingsFilter {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFindingsFilter(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter):
        CfnFindingsFilter = CfnFindingsFilter(cdkObject)

    internal fun unwrap(wrapped: CfnFindingsFilter):
        software.amazon.awscdk.services.macie.CfnFindingsFilter = wrapped.cdkObject
  }

  public interface FindingsFilterListItemProperty {
    public fun id(): String? = unwrap(this).getId()

    public fun name(): String? = unwrap(this).getName()

    public interface Builder {
      public fun id(id: String)

      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty.Builder
          =
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty.builder()

      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty,
    ) : FindingsFilterListItemProperty {
      override fun id(): String? = unwrap(this).getId()

      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FindingsFilterListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty):
          FindingsFilterListItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FindingsFilterListItemProperty):
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingsFilterListItemProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface FindingCriteriaProperty {
    public fun criterion(): Any? = unwrap(this).getCriterion()

    public interface Builder {
      public fun criterion(criterion: IResolvable)

      public fun criterion(criterion: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty.Builder =
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty.builder()

      override fun criterion(criterion: IResolvable) {
        cdkBuilder.criterion(criterion.let(IResolvable::unwrap))
      }

      override fun criterion(criterion: Map<String, Any>) {
        cdkBuilder.criterion(criterion)
      }

      public fun build():
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty,
    ) : FindingCriteriaProperty {
      override fun criterion(): Any? = unwrap(this).getCriterion()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): FindingCriteriaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty):
          FindingCriteriaProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: FindingCriteriaProperty):
          software.amazon.awscdk.services.macie.CfnFindingsFilter.FindingCriteriaProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CriterionAdditionalPropertiesProperty {
    public fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

    public fun gt(): Number? = unwrap(this).getGt()

    public fun gte(): Number? = unwrap(this).getGte()

    public fun lt(): Number? = unwrap(this).getLt()

    public fun lte(): Number? = unwrap(this).getLte()

    public fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()

    public interface Builder {
      public fun eq(eq: List<String>)

      public fun gt(gt: Number)

      public fun gte(gte: Number)

      public fun lt(lt: Number)

      public fun lte(lte: Number)

      public fun neq(neq: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty.Builder
          =
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty.builder()

      override fun eq(eq: List<String>) {
        cdkBuilder.eq(eq)
      }

      override fun gt(gt: Number) {
        cdkBuilder.gt(gt)
      }

      override fun gte(gte: Number) {
        cdkBuilder.gte(gte)
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

      public fun build():
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty,
    ) : CriterionAdditionalPropertiesProperty {
      override fun eq(): List<String> = unwrap(this).getEq() ?: emptyList()

      override fun gt(): Number? = unwrap(this).getGt()

      override fun gte(): Number? = unwrap(this).getGte()

      override fun lt(): Number? = unwrap(this).getLt()

      override fun lte(): Number? = unwrap(this).getLte()

      override fun neq(): List<String> = unwrap(this).getNeq() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          CriterionAdditionalPropertiesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty):
          CriterionAdditionalPropertiesProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CriterionAdditionalPropertiesProperty):
          software.amazon.awscdk.services.macie.CfnFindingsFilter.CriterionAdditionalPropertiesProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
