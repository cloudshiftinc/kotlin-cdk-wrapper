package io.cloudshiftdev.awscdk.services.customerprofiles

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnCalculatedAttributeDefinition internal constructor(
  private val cdkObject:
      software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public open fun attrCreatedAt(): String = unwrap(this).getAttrCreatedAt()

  public open fun attrLastUpdatedAt(): String = unwrap(this).getAttrLastUpdatedAt()

  public open fun attributeDetails(): Any = unwrap(this).getAttributeDetails()

  public open fun attributeDetails(`value`: IResolvable) {
    unwrap(this).setAttributeDetails(`value`.let(IResolvable::unwrap))
  }

  public open fun attributeDetails(`value`: AttributeDetailsProperty) {
    unwrap(this).setAttributeDetails(`value`.let(AttributeDetailsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("bbeea23a756d12a9e5f4da473d384c1fb47bc48a0c25eeaa5e91ba1470b5fea3")
  public open fun attributeDetails(`value`: AttributeDetailsProperty.Builder.() -> Unit): Unit =
      attributeDetails(AttributeDetailsProperty(`value`))

  public open fun calculatedAttributeName(): String = unwrap(this).getCalculatedAttributeName()

  public open fun calculatedAttributeName(`value`: String) {
    unwrap(this).setCalculatedAttributeName(`value`)
  }

  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  public open fun conditions(): Any? = unwrap(this).getConditions()

  public open fun conditions(`value`: IResolvable) {
    unwrap(this).setConditions(`value`.let(IResolvable::unwrap))
  }

  public open fun conditions(`value`: ConditionsProperty) {
    unwrap(this).setConditions(`value`.let(ConditionsProperty::unwrap))
  }

  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("f171d0da38a61a4d883bc3a88ee1e720c34e50bfa77ced87795b6b13154ee3f3")
  public open fun conditions(`value`: ConditionsProperty.Builder.() -> Unit): Unit =
      conditions(ConditionsProperty(`value`))

  public open fun description(): String? = unwrap(this).getDescription()

  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  public open fun displayName(): String? = unwrap(this).getDisplayName()

  public open fun displayName(`value`: String) {
    unwrap(this).setDisplayName(`value`)
  }

  public open fun domainName(): String = unwrap(this).getDomainName()

  public open fun domainName(`value`: String) {
    unwrap(this).setDomainName(`value`)
  }

  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  public open fun statistic(): String = unwrap(this).getStatistic()

  public open fun statistic(`value`: String) {
    unwrap(this).setStatistic(`value`)
  }

  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  public interface Builder {
    public fun attributeDetails(attributeDetails: IResolvable)

    public fun attributeDetails(attributeDetails: AttributeDetailsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3881dc042b395f90daa320a565b09de633274397edc76dc644a9b702387a2365")
    public fun attributeDetails(attributeDetails: AttributeDetailsProperty.Builder.() -> Unit)

    public fun calculatedAttributeName(calculatedAttributeName: String)

    public fun conditions(conditions: IResolvable)

    public fun conditions(conditions: ConditionsProperty)

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1da2b4b405c95db816b62c6348222ef8731f68daed8a2e7f42b9d0246d9ed16b")
    public fun conditions(conditions: ConditionsProperty.Builder.() -> Unit)

    public fun description(description: String)

    public fun displayName(displayName: String)

    public fun domainName(domainName: String)

    public fun statistic(statistic: String)

    public fun tags(tags: List<CfnTag>)

    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.Builder =
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.Builder.create(scope,
        id)

    override fun attributeDetails(attributeDetails: IResolvable) {
      cdkBuilder.attributeDetails(attributeDetails.let(IResolvable::unwrap))
    }

    override fun attributeDetails(attributeDetails: AttributeDetailsProperty) {
      cdkBuilder.attributeDetails(attributeDetails.let(AttributeDetailsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3881dc042b395f90daa320a565b09de633274397edc76dc644a9b702387a2365")
    override fun attributeDetails(attributeDetails: AttributeDetailsProperty.Builder.() -> Unit):
        Unit = attributeDetails(AttributeDetailsProperty(attributeDetails))

    override fun calculatedAttributeName(calculatedAttributeName: String) {
      cdkBuilder.calculatedAttributeName(calculatedAttributeName)
    }

    override fun conditions(conditions: IResolvable) {
      cdkBuilder.conditions(conditions.let(IResolvable::unwrap))
    }

    override fun conditions(conditions: ConditionsProperty) {
      cdkBuilder.conditions(conditions.let(ConditionsProperty::unwrap))
    }

    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1da2b4b405c95db816b62c6348222ef8731f68daed8a2e7f42b9d0246d9ed16b")
    override fun conditions(conditions: ConditionsProperty.Builder.() -> Unit): Unit =
        conditions(ConditionsProperty(conditions))

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun displayName(displayName: String) {
      cdkBuilder.displayName(displayName)
    }

    override fun domainName(domainName: String) {
      cdkBuilder.domainName(domainName)
    }

    override fun statistic(statistic: String) {
      cdkBuilder.statistic(statistic)
    }

    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build():
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnCalculatedAttributeDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnCalculatedAttributeDefinition(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition):
        CfnCalculatedAttributeDefinition = CfnCalculatedAttributeDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnCalculatedAttributeDefinition):
        software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition =
        wrapped.cdkObject
  }

  public interface AttributeItemProperty {
    public fun name(): String

    public interface Builder {
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty.builder()

      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty,
    ) : AttributeItemProperty {
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty):
          AttributeItemProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeItemProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeItemProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface AttributeDetailsProperty {
    public fun attributes(): Any

    public fun expression(): String

    public interface Builder {
      public fun attributes(attributes: IResolvable)

      public fun attributes(attributes: List<Any>)

      public fun attributes(vararg attributes: Any)

      public fun expression(expression: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty.builder()

      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty,
    ) : AttributeDetailsProperty {
      override fun attributes(): Any = unwrap(this).getAttributes()

      override fun expression(): String = unwrap(this).getExpression()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): AttributeDetailsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty):
          AttributeDetailsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributeDetailsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.AttributeDetailsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ThresholdProperty {
    public fun `operator`(): String

    public fun `value`(): String

    public interface Builder {
      public fun `operator`(`operator`: String)

      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty.builder()

      override fun `operator`(`operator`: String) {
        cdkBuilder.`operator`(`operator`)
      }

      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty,
    ) : ThresholdProperty {
      override fun `operator`(): String = unwrap(this).getOperator()

      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ThresholdProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty):
          ThresholdProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ThresholdProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ThresholdProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface RangeProperty {
    public fun unit(): String

    public fun `value`(): Number

    public interface Builder {
      public fun unit(unit: String)

      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty.builder()

      override fun unit(unit: String) {
        cdkBuilder.unit(unit)
      }

      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty,
    ) : RangeProperty {
      override fun unit(): String = unwrap(this).getUnit()

      override fun `value`(): Number = unwrap(this).getValue()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RangeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty):
          RangeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangeProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.RangeProperty
          = (wrapped as Wrapper).cdkObject
    }
  }

  public interface ConditionsProperty {
    public fun objectCount(): Number? = unwrap(this).getObjectCount()

    public fun range(): Any? = unwrap(this).getRange()

    public fun threshold(): Any? = unwrap(this).getThreshold()

    public interface Builder {
      public fun objectCount(objectCount: Number)

      public fun range(range: IResolvable)

      public fun range(range: RangeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55433c8f447ab8b0e9916c26120b3417412b55218e46749e7beedf62954673d1")
      public fun range(range: RangeProperty.Builder.() -> Unit)

      public fun threshold(threshold: IResolvable)

      public fun threshold(threshold: ThresholdProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e1bfbdeaf682a3af64a7f2a45474eb98c3958538da1667abe412e099856ce96")
      public fun threshold(threshold: ThresholdProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty.Builder
          =
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty.builder()

      override fun objectCount(objectCount: Number) {
        cdkBuilder.objectCount(objectCount)
      }

      override fun range(range: IResolvable) {
        cdkBuilder.range(range.let(IResolvable::unwrap))
      }

      override fun range(range: RangeProperty) {
        cdkBuilder.range(range.let(RangeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("55433c8f447ab8b0e9916c26120b3417412b55218e46749e7beedf62954673d1")
      override fun range(range: RangeProperty.Builder.() -> Unit): Unit =
          range(RangeProperty(range))

      override fun threshold(threshold: IResolvable) {
        cdkBuilder.threshold(threshold.let(IResolvable::unwrap))
      }

      override fun threshold(threshold: ThresholdProperty) {
        cdkBuilder.threshold(threshold.let(ThresholdProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6e1bfbdeaf682a3af64a7f2a45474eb98c3958538da1667abe412e099856ce96")
      override fun threshold(threshold: ThresholdProperty.Builder.() -> Unit): Unit =
          threshold(ThresholdProperty(threshold))

      public fun build():
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty,
    ) : ConditionsProperty {
      override fun objectCount(): Number? = unwrap(this).getObjectCount()

      override fun range(): Any? = unwrap(this).getRange()

      override fun threshold(): Any? = unwrap(this).getThreshold()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ConditionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty):
          ConditionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ConditionsProperty):
          software.amazon.awscdk.services.customerprofiles.CfnCalculatedAttributeDefinition.ConditionsProperty
          = (wrapped as Wrapper).cdkObject
    }
  }
}
