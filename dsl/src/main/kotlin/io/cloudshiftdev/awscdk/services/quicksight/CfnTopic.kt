package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnTopic internal constructor(
  private val cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic,
) : CfnResource(cdkObject), IInspectable {
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  public open fun dataSets(): Any? = unwrap(this).getDataSets()

  public open fun dataSets(`value`: IResolvable) {
    unwrap(this).setDataSets(`value`.let(IResolvable::unwrap))
  }

  public open fun dataSets(__idx_ac66f0: List<Any>) {
    unwrap(this).setDataSets(__idx_ac66f0)
  }

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

  public open fun topicId(): String? = unwrap(this).getTopicId()

  public open fun topicId(`value`: String) {
    unwrap(this).setTopicId(`value`)
  }

  public open fun userExperienceVersion(): String? = unwrap(this).getUserExperienceVersion()

  public open fun userExperienceVersion(`value`: String) {
    unwrap(this).setUserExperienceVersion(`value`)
  }

  public interface Builder {
    public fun awsAccountId(awsAccountId: String)

    public fun dataSets(dataSets: IResolvable)

    public fun dataSets(dataSets: List<Any>)

    public fun description(description: String)

    public fun name(name: String)

    public fun topicId(topicId: String)

    public fun userExperienceVersion(userExperienceVersion: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTopic.Builder =
        software.amazon.awscdk.services.quicksight.CfnTopic.Builder.create(scope, id)

    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    override fun dataSets(dataSets: IResolvable) {
      cdkBuilder.dataSets(dataSets.let(IResolvable::unwrap))
    }

    override fun dataSets(dataSets: List<Any>) {
      cdkBuilder.dataSets(dataSets)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    override fun topicId(topicId: String) {
      cdkBuilder.topicId(topicId)
    }

    override fun userExperienceVersion(userExperienceVersion: String) {
      cdkBuilder.userExperienceVersion(userExperienceVersion)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTopic {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTopic(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic): CfnTopic =
        CfnTopic(cdkObject)

    internal fun unwrap(wrapped: CfnTopic): software.amazon.awscdk.services.quicksight.CfnTopic =
        wrapped.cdkObject
  }

  public interface SemanticTypeProperty {
    public fun falseyCellValue(): String? = unwrap(this).getFalseyCellValue()

    public fun falseyCellValueSynonyms(): List<String> = unwrap(this).getFalseyCellValueSynonyms()
        ?: emptyList()

    public fun subTypeName(): String? = unwrap(this).getSubTypeName()

    public fun truthyCellValue(): String? = unwrap(this).getTruthyCellValue()

    public fun truthyCellValueSynonyms(): List<String> = unwrap(this).getTruthyCellValueSynonyms()
        ?: emptyList()

    public fun typeName(): String? = unwrap(this).getTypeName()

    public fun typeParameters(): Any? = unwrap(this).getTypeParameters()

    public interface Builder {
      public fun falseyCellValue(falseyCellValue: String)

      public fun falseyCellValueSynonyms(falseyCellValueSynonyms: List<String>)

      public fun subTypeName(subTypeName: String)

      public fun truthyCellValue(truthyCellValue: String)

      public fun truthyCellValueSynonyms(truthyCellValueSynonyms: List<String>)

      public fun typeName(typeName: String)

      public fun typeParameters(typeParameters: IResolvable)

      public fun typeParameters(typeParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty.builder()

      override fun falseyCellValue(falseyCellValue: String) {
        cdkBuilder.falseyCellValue(falseyCellValue)
      }

      override fun falseyCellValueSynonyms(falseyCellValueSynonyms: List<String>) {
        cdkBuilder.falseyCellValueSynonyms(falseyCellValueSynonyms)
      }

      override fun subTypeName(subTypeName: String) {
        cdkBuilder.subTypeName(subTypeName)
      }

      override fun truthyCellValue(truthyCellValue: String) {
        cdkBuilder.truthyCellValue(truthyCellValue)
      }

      override fun truthyCellValueSynonyms(truthyCellValueSynonyms: List<String>) {
        cdkBuilder.truthyCellValueSynonyms(truthyCellValueSynonyms)
      }

      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      override fun typeParameters(typeParameters: IResolvable) {
        cdkBuilder.typeParameters(typeParameters.let(IResolvable::unwrap))
      }

      override fun typeParameters(typeParameters: Map<String, String>) {
        cdkBuilder.typeParameters(typeParameters)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty,
    ) : SemanticTypeProperty {
      override fun falseyCellValue(): String? = unwrap(this).getFalseyCellValue()

      override fun falseyCellValueSynonyms(): List<String> =
          unwrap(this).getFalseyCellValueSynonyms() ?: emptyList()

      override fun subTypeName(): String? = unwrap(this).getSubTypeName()

      override fun truthyCellValue(): String? = unwrap(this).getTruthyCellValue()

      override fun truthyCellValueSynonyms(): List<String> =
          unwrap(this).getTruthyCellValueSynonyms() ?: emptyList()

      override fun typeName(): String? = unwrap(this).getTypeName()

      override fun typeParameters(): Any? = unwrap(this).getTypeParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SemanticTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty):
          SemanticTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SemanticTypeProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicRelativeDateFilterProperty {
    public fun constant(): Any? = unwrap(this).getConstant()

    public fun relativeDateFilterFunction(): String? = unwrap(this).getRelativeDateFilterFunction()

    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    public interface Builder {
      public fun constant(constant: IResolvable)

      public fun constant(constant: TopicSingularFilterConstantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05289c4088c7296a59d5b7d53ab352f30003725c9b06b4bb4adf6e6249d8afeb")
      public fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit)

      public fun relativeDateFilterFunction(relativeDateFilterFunction: String)

      public fun timeGranularity(timeGranularity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty.builder()

      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable::unwrap))
      }

      override fun constant(constant: TopicSingularFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicSingularFilterConstantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05289c4088c7296a59d5b7d53ab352f30003725c9b06b4bb4adf6e6249d8afeb")
      override fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit): Unit
          = constant(TopicSingularFilterConstantProperty(constant))

      override fun relativeDateFilterFunction(relativeDateFilterFunction: String) {
        cdkBuilder.relativeDateFilterFunction(relativeDateFilterFunction)
      }

      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty,
    ) : TopicRelativeDateFilterProperty {
      override fun constant(): Any? = unwrap(this).getConstant()

      override fun relativeDateFilterFunction(): String? =
          unwrap(this).getRelativeDateFilterFunction()

      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicRelativeDateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty):
          TopicRelativeDateFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicRelativeDateFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CellValueSynonymProperty {
    public fun cellValue(): String? = unwrap(this).getCellValue()

    public fun synonyms(): List<String> = unwrap(this).getSynonyms() ?: emptyList()

    public interface Builder {
      public fun cellValue(cellValue: String)

      public fun synonyms(synonyms: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty.builder()

      override fun cellValue(cellValue: String) {
        cdkBuilder.cellValue(cellValue)
      }

      override fun synonyms(synonyms: List<String>) {
        cdkBuilder.synonyms(synonyms)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty,
    ) : CellValueSynonymProperty {
      override fun cellValue(): String? = unwrap(this).getCellValue()

      override fun synonyms(): List<String> = unwrap(this).getSynonyms() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CellValueSynonymProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty):
          CellValueSynonymProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CellValueSynonymProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NamedEntityDefinitionMetricProperty {
    public fun aggregation(): String? = unwrap(this).getAggregation()

    public fun aggregationFunctionParameters(): Any? =
        unwrap(this).getAggregationFunctionParameters()

    public interface Builder {
      public fun aggregation(aggregation: String)

      public fun aggregationFunctionParameters(aggregationFunctionParameters: IResolvable)

      public fun aggregationFunctionParameters(aggregationFunctionParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty.builder()

      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      override fun aggregationFunctionParameters(aggregationFunctionParameters: IResolvable) {
        cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters.let(IResolvable::unwrap))
      }

      override
          fun aggregationFunctionParameters(aggregationFunctionParameters: Map<String, String>) {
        cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty,
    ) : NamedEntityDefinitionMetricProperty {
      override fun aggregation(): String? = unwrap(this).getAggregation()

      override fun aggregationFunctionParameters(): Any? =
          unwrap(this).getAggregationFunctionParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NamedEntityDefinitionMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty):
          NamedEntityDefinitionMetricProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamedEntityDefinitionMetricProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TopicFilterProperty {
    public fun categoryFilter(): Any? = unwrap(this).getCategoryFilter()

    public fun dateRangeFilter(): Any? = unwrap(this).getDateRangeFilter()

    public fun filterClass(): String? = unwrap(this).getFilterClass()

    public fun filterDescription(): String? = unwrap(this).getFilterDescription()

    public fun filterName(): String

    public fun filterSynonyms(): List<String> = unwrap(this).getFilterSynonyms() ?: emptyList()

    public fun filterType(): String? = unwrap(this).getFilterType()

    public fun numericEqualityFilter(): Any? = unwrap(this).getNumericEqualityFilter()

    public fun numericRangeFilter(): Any? = unwrap(this).getNumericRangeFilter()

    public fun operandFieldName(): String

    public fun relativeDateFilter(): Any? = unwrap(this).getRelativeDateFilter()

    public interface Builder {
      public fun categoryFilter(categoryFilter: IResolvable)

      public fun categoryFilter(categoryFilter: TopicCategoryFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("405f8ec202b0a715bfd41c59d2ee7094951cb87599ba83e471e739b4114a25da")
      public fun categoryFilter(categoryFilter: TopicCategoryFilterProperty.Builder.() -> Unit)

      public fun dateRangeFilter(dateRangeFilter: IResolvable)

      public fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4780726af276343d5218cb0a6dfa48fbf9be7a059bb622dbdd901eea2fdf85")
      public fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty.Builder.() -> Unit)

      public fun filterClass(filterClass: String)

      public fun filterDescription(filterDescription: String)

      public fun filterName(filterName: String)

      public fun filterSynonyms(filterSynonyms: List<String>)

      public fun filterType(filterType: String)

      public fun numericEqualityFilter(numericEqualityFilter: IResolvable)

      public fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d3f9936c377c4ff14fca630dc7cdebae69d80712e566269817c7462b03b333")
      public
          fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty.Builder.() -> Unit)

      public fun numericRangeFilter(numericRangeFilter: IResolvable)

      public fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00a1a708b331dd414c9bfa719d5c1f304dc4ed84a72c3f0b5fef5787469245a6")
      public
          fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty.Builder.() -> Unit)

      public fun operandFieldName(operandFieldName: String)

      public fun relativeDateFilter(relativeDateFilter: IResolvable)

      public fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbac18e6d3083682cef12a6f06fd86288e22ba3c865ed39b20a802aa9cd61764")
      public
          fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty.builder()

      override fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter.let(IResolvable::unwrap))
      }

      override fun categoryFilter(categoryFilter: TopicCategoryFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter.let(TopicCategoryFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("405f8ec202b0a715bfd41c59d2ee7094951cb87599ba83e471e739b4114a25da")
      override fun categoryFilter(categoryFilter: TopicCategoryFilterProperty.Builder.() -> Unit):
          Unit = categoryFilter(TopicCategoryFilterProperty(categoryFilter))

      override fun dateRangeFilter(dateRangeFilter: IResolvable) {
        cdkBuilder.dateRangeFilter(dateRangeFilter.let(IResolvable::unwrap))
      }

      override fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty) {
        cdkBuilder.dateRangeFilter(dateRangeFilter.let(TopicDateRangeFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4780726af276343d5218cb0a6dfa48fbf9be7a059bb622dbdd901eea2fdf85")
      override
          fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty.Builder.() -> Unit):
          Unit = dateRangeFilter(TopicDateRangeFilterProperty(dateRangeFilter))

      override fun filterClass(filterClass: String) {
        cdkBuilder.filterClass(filterClass)
      }

      override fun filterDescription(filterDescription: String) {
        cdkBuilder.filterDescription(filterDescription)
      }

      override fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
      }

      override fun filterSynonyms(filterSynonyms: List<String>) {
        cdkBuilder.filterSynonyms(filterSynonyms)
      }

      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      override fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter.let(IResolvable::unwrap))
      }

      override
          fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter.let(TopicNumericEqualityFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d3f9936c377c4ff14fca630dc7cdebae69d80712e566269817c7462b03b333")
      override
          fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty.Builder.() -> Unit):
          Unit = numericEqualityFilter(TopicNumericEqualityFilterProperty(numericEqualityFilter))

      override fun numericRangeFilter(numericRangeFilter: IResolvable) {
        cdkBuilder.numericRangeFilter(numericRangeFilter.let(IResolvable::unwrap))
      }

      override fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty) {
        cdkBuilder.numericRangeFilter(numericRangeFilter.let(TopicNumericRangeFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00a1a708b331dd414c9bfa719d5c1f304dc4ed84a72c3f0b5fef5787469245a6")
      override
          fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty.Builder.() -> Unit):
          Unit = numericRangeFilter(TopicNumericRangeFilterProperty(numericRangeFilter))

      override fun operandFieldName(operandFieldName: String) {
        cdkBuilder.operandFieldName(operandFieldName)
      }

      override fun relativeDateFilter(relativeDateFilter: IResolvable) {
        cdkBuilder.relativeDateFilter(relativeDateFilter.let(IResolvable::unwrap))
      }

      override fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty) {
        cdkBuilder.relativeDateFilter(relativeDateFilter.let(TopicRelativeDateFilterProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbac18e6d3083682cef12a6f06fd86288e22ba3c865ed39b20a802aa9cd61764")
      override
          fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty.Builder.() -> Unit):
          Unit = relativeDateFilter(TopicRelativeDateFilterProperty(relativeDateFilter))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty,
    ) : TopicFilterProperty {
      override fun categoryFilter(): Any? = unwrap(this).getCategoryFilter()

      override fun dateRangeFilter(): Any? = unwrap(this).getDateRangeFilter()

      override fun filterClass(): String? = unwrap(this).getFilterClass()

      override fun filterDescription(): String? = unwrap(this).getFilterDescription()

      override fun filterName(): String = unwrap(this).getFilterName()

      override fun filterSynonyms(): List<String> = unwrap(this).getFilterSynonyms() ?: emptyList()

      override fun filterType(): String? = unwrap(this).getFilterType()

      override fun numericEqualityFilter(): Any? = unwrap(this).getNumericEqualityFilter()

      override fun numericRangeFilter(): Any? = unwrap(this).getNumericRangeFilter()

      override fun operandFieldName(): String = unwrap(this).getOperandFieldName()

      override fun relativeDateFilter(): Any? = unwrap(this).getRelativeDateFilter()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty):
          TopicFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicSingularFilterConstantProperty {
    public fun constantType(): String? = unwrap(this).getConstantType()

    public fun singularConstant(): String? = unwrap(this).getSingularConstant()

    public interface Builder {
      public fun constantType(constantType: String)

      public fun singularConstant(singularConstant: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty.builder()

      override fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
      }

      override fun singularConstant(singularConstant: String) {
        cdkBuilder.singularConstant(singularConstant)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty,
    ) : TopicSingularFilterConstantProperty {
      override fun constantType(): String? = unwrap(this).getConstantType()

      override fun singularConstant(): String? = unwrap(this).getSingularConstant()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TopicSingularFilterConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty):
          TopicSingularFilterConstantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicSingularFilterConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DataAggregationProperty {
    public fun datasetRowDateGranularity(): String? = unwrap(this).getDatasetRowDateGranularity()

    public fun defaultDateColumnName(): String? = unwrap(this).getDefaultDateColumnName()

    public interface Builder {
      public fun datasetRowDateGranularity(datasetRowDateGranularity: String)

      public fun defaultDateColumnName(defaultDateColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty.builder()

      override fun datasetRowDateGranularity(datasetRowDateGranularity: String) {
        cdkBuilder.datasetRowDateGranularity(datasetRowDateGranularity)
      }

      override fun defaultDateColumnName(defaultDateColumnName: String) {
        cdkBuilder.defaultDateColumnName(defaultDateColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty,
    ) : DataAggregationProperty {
      override fun datasetRowDateGranularity(): String? =
          unwrap(this).getDatasetRowDateGranularity()

      override fun defaultDateColumnName(): String? = unwrap(this).getDefaultDateColumnName()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DataAggregationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty):
          DataAggregationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataAggregationProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface ComparativeOrderProperty {
    public fun specifedOrder(): List<String> = unwrap(this).getSpecifedOrder() ?: emptyList()

    public fun treatUndefinedSpecifiedValues(): String? =
        unwrap(this).getTreatUndefinedSpecifiedValues()

    public fun useOrdering(): String? = unwrap(this).getUseOrdering()

    public interface Builder {
      public fun specifedOrder(specifedOrder: List<String>)

      public fun treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues: String)

      public fun useOrdering(useOrdering: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty.builder()

      override fun specifedOrder(specifedOrder: List<String>) {
        cdkBuilder.specifedOrder(specifedOrder)
      }

      override fun treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues: String) {
        cdkBuilder.treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues)
      }

      override fun useOrdering(useOrdering: String) {
        cdkBuilder.useOrdering(useOrdering)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty,
    ) : ComparativeOrderProperty {
      override fun specifedOrder(): List<String> = unwrap(this).getSpecifedOrder() ?: emptyList()

      override fun treatUndefinedSpecifiedValues(): String? =
          unwrap(this).getTreatUndefinedSpecifiedValues()

      override fun useOrdering(): String? = unwrap(this).getUseOrdering()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ComparativeOrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty):
          ComparativeOrderProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComparativeOrderProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicColumnProperty {
    public fun aggregation(): String? = unwrap(this).getAggregation()

    public fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
        emptyList()

    public fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

    public fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

    public fun columnDescription(): String? = unwrap(this).getColumnDescription()

    public fun columnFriendlyName(): String? = unwrap(this).getColumnFriendlyName()

    public fun columnName(): String

    public fun columnSynonyms(): List<String> = unwrap(this).getColumnSynonyms() ?: emptyList()

    public fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

    public fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

    public fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

    public fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

    public fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

    public fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations() ?:
        emptyList()

    public fun semanticType(): Any? = unwrap(this).getSemanticType()

    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    public interface Builder {
      public fun aggregation(aggregation: String)

      public fun allowedAggregations(allowedAggregations: List<String>)

      public fun cellValueSynonyms(cellValueSynonyms: IResolvable)

      public fun cellValueSynonyms(cellValueSynonyms: List<Any>)

      public fun columnDataRole(columnDataRole: String)

      public fun columnDescription(columnDescription: String)

      public fun columnFriendlyName(columnFriendlyName: String)

      public fun columnName(columnName: String)

      public fun columnSynonyms(columnSynonyms: List<String>)

      public fun comparativeOrder(comparativeOrder: IResolvable)

      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ad92c1d298291ba891ddf5b0ec59ad79e19bffd5d2ebd8c197394e39f648e9f")
      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit)

      public fun defaultFormatting(defaultFormatting: IResolvable)

      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf22ca6915fc59cae32f1331daaa003dcc5dc1cc3113e283fb23558c1b14366")
      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit)

      public fun isIncludedInTopic(isIncludedInTopic: Boolean)

      public fun isIncludedInTopic(isIncludedInTopic: IResolvable)

      public fun neverAggregateInFilter(neverAggregateInFilter: Boolean)

      public fun neverAggregateInFilter(neverAggregateInFilter: IResolvable)

      public fun nonAdditive(nonAdditive: Boolean)

      public fun nonAdditive(nonAdditive: IResolvable)

      public fun notAllowedAggregations(notAllowedAggregations: List<String>)

      public fun semanticType(semanticType: IResolvable)

      public fun semanticType(semanticType: SemanticTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7f86e62630d165cd8fa100f27a17008a6c8c2ad9e42a89a72d586f6a460c21")
      public fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit)

      public fun timeGranularity(timeGranularity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty.builder()

      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      override fun allowedAggregations(allowedAggregations: List<String>) {
        cdkBuilder.allowedAggregations(allowedAggregations)
      }

      override fun cellValueSynonyms(cellValueSynonyms: IResolvable) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms.let(IResolvable::unwrap))
      }

      override fun cellValueSynonyms(cellValueSynonyms: List<Any>) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms)
      }

      override fun columnDataRole(columnDataRole: String) {
        cdkBuilder.columnDataRole(columnDataRole)
      }

      override fun columnDescription(columnDescription: String) {
        cdkBuilder.columnDescription(columnDescription)
      }

      override fun columnFriendlyName(columnFriendlyName: String) {
        cdkBuilder.columnFriendlyName(columnFriendlyName)
      }

      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      override fun columnSynonyms(columnSynonyms: List<String>) {
        cdkBuilder.columnSynonyms(columnSynonyms)
      }

      override fun comparativeOrder(comparativeOrder: IResolvable) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(IResolvable::unwrap))
      }

      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(ComparativeOrderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ad92c1d298291ba891ddf5b0ec59ad79e19bffd5d2ebd8c197394e39f648e9f")
      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit):
          Unit = comparativeOrder(ComparativeOrderProperty(comparativeOrder))

      override fun defaultFormatting(defaultFormatting: IResolvable) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(IResolvable::unwrap))
      }

      override fun defaultFormatting(defaultFormatting: DefaultFormattingProperty) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(DefaultFormattingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf22ca6915fc59cae32f1331daaa003dcc5dc1cc3113e283fb23558c1b14366")
      override
          fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit):
          Unit = defaultFormatting(DefaultFormattingProperty(defaultFormatting))

      override fun isIncludedInTopic(isIncludedInTopic: Boolean) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
      }

      override fun isIncludedInTopic(isIncludedInTopic: IResolvable) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic.let(IResolvable::unwrap))
      }

      override fun neverAggregateInFilter(neverAggregateInFilter: Boolean) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
      }

      override fun neverAggregateInFilter(neverAggregateInFilter: IResolvable) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter.let(IResolvable::unwrap))
      }

      override fun nonAdditive(nonAdditive: Boolean) {
        cdkBuilder.nonAdditive(nonAdditive)
      }

      override fun nonAdditive(nonAdditive: IResolvable) {
        cdkBuilder.nonAdditive(nonAdditive.let(IResolvable::unwrap))
      }

      override fun notAllowedAggregations(notAllowedAggregations: List<String>) {
        cdkBuilder.notAllowedAggregations(notAllowedAggregations)
      }

      override fun semanticType(semanticType: IResolvable) {
        cdkBuilder.semanticType(semanticType.let(IResolvable::unwrap))
      }

      override fun semanticType(semanticType: SemanticTypeProperty) {
        cdkBuilder.semanticType(semanticType.let(SemanticTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7f86e62630d165cd8fa100f27a17008a6c8c2ad9e42a89a72d586f6a460c21")
      override fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit): Unit =
          semanticType(SemanticTypeProperty(semanticType))

      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty,
    ) : TopicColumnProperty {
      override fun aggregation(): String? = unwrap(this).getAggregation()

      override fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
          emptyList()

      override fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

      override fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

      override fun columnDescription(): String? = unwrap(this).getColumnDescription()

      override fun columnFriendlyName(): String? = unwrap(this).getColumnFriendlyName()

      override fun columnName(): String = unwrap(this).getColumnName()

      override fun columnSynonyms(): List<String> = unwrap(this).getColumnSynonyms() ?: emptyList()

      override fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

      override fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

      override fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

      override fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

      override fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

      override fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations()
          ?: emptyList()

      override fun semanticType(): Any? = unwrap(this).getSemanticType()

      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty):
          TopicColumnProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface NegativeFormatProperty {
    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun suffix(): String? = unwrap(this).getSuffix()

    public interface Builder {
      public fun prefix(prefix: String)

      public fun suffix(suffix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty.builder()

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty,
    ) : NegativeFormatProperty {
      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NegativeFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty):
          NegativeFormatProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NegativeFormatProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicCategoryFilterConstantProperty {
    public fun collectiveConstant(): Any? = unwrap(this).getCollectiveConstant()

    public fun constantType(): String? = unwrap(this).getConstantType()

    public fun singularConstant(): String? = unwrap(this).getSingularConstant()

    public interface Builder {
      public fun collectiveConstant(collectiveConstant: IResolvable)

      public fun collectiveConstant(collectiveConstant: CollectiveConstantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f35ebbc647c37c743bf329340e1847a28b170a9519ef88c42ece316db9e896b")
      public
          fun collectiveConstant(collectiveConstant: CollectiveConstantProperty.Builder.() -> Unit)

      public fun constantType(constantType: String)

      public fun singularConstant(singularConstant: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty.builder()

      override fun collectiveConstant(collectiveConstant: IResolvable) {
        cdkBuilder.collectiveConstant(collectiveConstant.let(IResolvable::unwrap))
      }

      override fun collectiveConstant(collectiveConstant: CollectiveConstantProperty) {
        cdkBuilder.collectiveConstant(collectiveConstant.let(CollectiveConstantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f35ebbc647c37c743bf329340e1847a28b170a9519ef88c42ece316db9e896b")
      override
          fun collectiveConstant(collectiveConstant: CollectiveConstantProperty.Builder.() -> Unit):
          Unit = collectiveConstant(CollectiveConstantProperty(collectiveConstant))

      override fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
      }

      override fun singularConstant(singularConstant: String) {
        cdkBuilder.singularConstant(singularConstant)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty,
    ) : TopicCategoryFilterConstantProperty {
      override fun collectiveConstant(): Any? = unwrap(this).getCollectiveConstant()

      override fun constantType(): String? = unwrap(this).getConstantType()

      override fun singularConstant(): String? = unwrap(this).getSingularConstant()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TopicCategoryFilterConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty):
          TopicCategoryFilterConstantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicCategoryFilterConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface RangeConstantProperty {
    public fun maximum(): String? = unwrap(this).getMaximum()

    public fun minimum(): String? = unwrap(this).getMinimum()

    public interface Builder {
      public fun maximum(maximum: String)

      public fun minimum(minimum: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty.builder()

      override fun maximum(maximum: String) {
        cdkBuilder.maximum(maximum)
      }

      override fun minimum(minimum: String) {
        cdkBuilder.minimum(minimum)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty
          = cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty,
    ) : RangeConstantProperty {
      override fun maximum(): String? = unwrap(this).getMaximum()

      override fun minimum(): String? = unwrap(this).getMinimum()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): RangeConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty):
          RangeConstantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangeConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DisplayFormatOptionsProperty {
    public fun blankCellFormat(): String? = unwrap(this).getBlankCellFormat()

    public fun currencySymbol(): String? = unwrap(this).getCurrencySymbol()

    public fun dateFormat(): String? = unwrap(this).getDateFormat()

    public fun decimalSeparator(): String? = unwrap(this).getDecimalSeparator()

    public fun fractionDigits(): Number? = unwrap(this).getFractionDigits()

    public fun groupingSeparator(): String? = unwrap(this).getGroupingSeparator()

    public fun negativeFormat(): Any? = unwrap(this).getNegativeFormat()

    public fun prefix(): String? = unwrap(this).getPrefix()

    public fun suffix(): String? = unwrap(this).getSuffix()

    public fun unitScaler(): String? = unwrap(this).getUnitScaler()

    public fun useBlankCellFormat(): Any? = unwrap(this).getUseBlankCellFormat()

    public fun useGrouping(): Any? = unwrap(this).getUseGrouping()

    public interface Builder {
      public fun blankCellFormat(blankCellFormat: String)

      public fun currencySymbol(currencySymbol: String)

      public fun dateFormat(dateFormat: String)

      public fun decimalSeparator(decimalSeparator: String)

      public fun fractionDigits(fractionDigits: Number)

      public fun groupingSeparator(groupingSeparator: String)

      public fun negativeFormat(negativeFormat: IResolvable)

      public fun negativeFormat(negativeFormat: NegativeFormatProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00292db3df80c8de047fc466856a329c98a053e86ede160f3b9863d06eb8e7b5")
      public fun negativeFormat(negativeFormat: NegativeFormatProperty.Builder.() -> Unit)

      public fun prefix(prefix: String)

      public fun suffix(suffix: String)

      public fun unitScaler(unitScaler: String)

      public fun useBlankCellFormat(useBlankCellFormat: Boolean)

      public fun useBlankCellFormat(useBlankCellFormat: IResolvable)

      public fun useGrouping(useGrouping: Boolean)

      public fun useGrouping(useGrouping: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty.builder()

      override fun blankCellFormat(blankCellFormat: String) {
        cdkBuilder.blankCellFormat(blankCellFormat)
      }

      override fun currencySymbol(currencySymbol: String) {
        cdkBuilder.currencySymbol(currencySymbol)
      }

      override fun dateFormat(dateFormat: String) {
        cdkBuilder.dateFormat(dateFormat)
      }

      override fun decimalSeparator(decimalSeparator: String) {
        cdkBuilder.decimalSeparator(decimalSeparator)
      }

      override fun fractionDigits(fractionDigits: Number) {
        cdkBuilder.fractionDigits(fractionDigits)
      }

      override fun groupingSeparator(groupingSeparator: String) {
        cdkBuilder.groupingSeparator(groupingSeparator)
      }

      override fun negativeFormat(negativeFormat: IResolvable) {
        cdkBuilder.negativeFormat(negativeFormat.let(IResolvable::unwrap))
      }

      override fun negativeFormat(negativeFormat: NegativeFormatProperty) {
        cdkBuilder.negativeFormat(negativeFormat.let(NegativeFormatProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00292db3df80c8de047fc466856a329c98a053e86ede160f3b9863d06eb8e7b5")
      override fun negativeFormat(negativeFormat: NegativeFormatProperty.Builder.() -> Unit): Unit =
          negativeFormat(NegativeFormatProperty(negativeFormat))

      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      override fun unitScaler(unitScaler: String) {
        cdkBuilder.unitScaler(unitScaler)
      }

      override fun useBlankCellFormat(useBlankCellFormat: Boolean) {
        cdkBuilder.useBlankCellFormat(useBlankCellFormat)
      }

      override fun useBlankCellFormat(useBlankCellFormat: IResolvable) {
        cdkBuilder.useBlankCellFormat(useBlankCellFormat.let(IResolvable::unwrap))
      }

      override fun useGrouping(useGrouping: Boolean) {
        cdkBuilder.useGrouping(useGrouping)
      }

      override fun useGrouping(useGrouping: IResolvable) {
        cdkBuilder.useGrouping(useGrouping.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty,
    ) : DisplayFormatOptionsProperty {
      override fun blankCellFormat(): String? = unwrap(this).getBlankCellFormat()

      override fun currencySymbol(): String? = unwrap(this).getCurrencySymbol()

      override fun dateFormat(): String? = unwrap(this).getDateFormat()

      override fun decimalSeparator(): String? = unwrap(this).getDecimalSeparator()

      override fun fractionDigits(): Number? = unwrap(this).getFractionDigits()

      override fun groupingSeparator(): String? = unwrap(this).getGroupingSeparator()

      override fun negativeFormat(): Any? = unwrap(this).getNegativeFormat()

      override fun prefix(): String? = unwrap(this).getPrefix()

      override fun suffix(): String? = unwrap(this).getSuffix()

      override fun unitScaler(): String? = unwrap(this).getUnitScaler()

      override fun useBlankCellFormat(): Any? = unwrap(this).getUseBlankCellFormat()

      override fun useGrouping(): Any? = unwrap(this).getUseGrouping()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DisplayFormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty):
          DisplayFormatOptionsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DisplayFormatOptionsProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TopicDateRangeFilterProperty {
    public fun constant(): Any? = unwrap(this).getConstant()

    public fun inclusive(): Any? = unwrap(this).getInclusive()

    public interface Builder {
      public fun constant(constant: IResolvable)

      public fun constant(constant: TopicRangeFilterConstantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e78d041a922a4b2c0cb82de073d73468de33269f877f54f0610549dd6da02f")
      public fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit)

      public fun inclusive(inclusive: Boolean)

      public fun inclusive(inclusive: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty.builder()

      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable::unwrap))
      }

      override fun constant(constant: TopicRangeFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicRangeFilterConstantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e78d041a922a4b2c0cb82de073d73468de33269f877f54f0610549dd6da02f")
      override fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit): Unit =
          constant(TopicRangeFilterConstantProperty(constant))

      override fun inclusive(inclusive: Boolean) {
        cdkBuilder.inclusive(inclusive)
      }

      override fun inclusive(inclusive: IResolvable) {
        cdkBuilder.inclusive(inclusive.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty,
    ) : TopicDateRangeFilterProperty {
      override fun constant(): Any? = unwrap(this).getConstant()

      override fun inclusive(): Any? = unwrap(this).getInclusive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicDateRangeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty):
          TopicDateRangeFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicDateRangeFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TopicRangeFilterConstantProperty {
    public fun constantType(): String? = unwrap(this).getConstantType()

    public fun rangeConstant(): Any? = unwrap(this).getRangeConstant()

    public interface Builder {
      public fun constantType(constantType: String)

      public fun rangeConstant(rangeConstant: IResolvable)

      public fun rangeConstant(rangeConstant: RangeConstantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97cf8ccdda65102ae5018ee30183a928aba864c43c8f9919394add036487c283")
      public fun rangeConstant(rangeConstant: RangeConstantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty.builder()

      override fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
      }

      override fun rangeConstant(rangeConstant: IResolvable) {
        cdkBuilder.rangeConstant(rangeConstant.let(IResolvable::unwrap))
      }

      override fun rangeConstant(rangeConstant: RangeConstantProperty) {
        cdkBuilder.rangeConstant(rangeConstant.let(RangeConstantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97cf8ccdda65102ae5018ee30183a928aba864c43c8f9919394add036487c283")
      override fun rangeConstant(rangeConstant: RangeConstantProperty.Builder.() -> Unit): Unit =
          rangeConstant(RangeConstantProperty(rangeConstant))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty,
    ) : TopicRangeFilterConstantProperty {
      override fun constantType(): String? = unwrap(this).getConstantType()

      override fun rangeConstant(): Any? = unwrap(this).getRangeConstant()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicRangeFilterConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty):
          TopicRangeFilterConstantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicRangeFilterConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface DatasetMetadataProperty {
    public fun calculatedFields(): Any? = unwrap(this).getCalculatedFields()

    public fun columns(): Any? = unwrap(this).getColumns()

    public fun dataAggregation(): Any? = unwrap(this).getDataAggregation()

    public fun datasetArn(): String

    public fun datasetDescription(): String? = unwrap(this).getDatasetDescription()

    public fun datasetName(): String? = unwrap(this).getDatasetName()

    public fun filters(): Any? = unwrap(this).getFilters()

    public fun namedEntities(): Any? = unwrap(this).getNamedEntities()

    public interface Builder {
      public fun calculatedFields(calculatedFields: IResolvable)

      public fun calculatedFields(calculatedFields: List<Any>)

      public fun columns(columns: IResolvable)

      public fun columns(columns: List<Any>)

      public fun dataAggregation(dataAggregation: IResolvable)

      public fun dataAggregation(dataAggregation: DataAggregationProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fa0a109bb35bb7e5676eca3ee8be52e6363c0cf17be69739e46bb0edf598f47")
      public fun dataAggregation(dataAggregation: DataAggregationProperty.Builder.() -> Unit)

      public fun datasetArn(datasetArn: String)

      public fun datasetDescription(datasetDescription: String)

      public fun datasetName(datasetName: String)

      public fun filters(filters: IResolvable)

      public fun filters(filters: List<Any>)

      public fun namedEntities(namedEntities: IResolvable)

      public fun namedEntities(namedEntities: List<Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty.builder()

      override fun calculatedFields(calculatedFields: IResolvable) {
        cdkBuilder.calculatedFields(calculatedFields.let(IResolvable::unwrap))
      }

      override fun calculatedFields(calculatedFields: List<Any>) {
        cdkBuilder.calculatedFields(calculatedFields)
      }

      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable::unwrap))
      }

      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns)
      }

      override fun dataAggregation(dataAggregation: IResolvable) {
        cdkBuilder.dataAggregation(dataAggregation.let(IResolvable::unwrap))
      }

      override fun dataAggregation(dataAggregation: DataAggregationProperty) {
        cdkBuilder.dataAggregation(dataAggregation.let(DataAggregationProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fa0a109bb35bb7e5676eca3ee8be52e6363c0cf17be69739e46bb0edf598f47")
      override fun dataAggregation(dataAggregation: DataAggregationProperty.Builder.() -> Unit):
          Unit = dataAggregation(DataAggregationProperty(dataAggregation))

      override fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
      }

      override fun datasetDescription(datasetDescription: String) {
        cdkBuilder.datasetDescription(datasetDescription)
      }

      override fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
      }

      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable::unwrap))
      }

      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters)
      }

      override fun namedEntities(namedEntities: IResolvable) {
        cdkBuilder.namedEntities(namedEntities.let(IResolvable::unwrap))
      }

      override fun namedEntities(namedEntities: List<Any>) {
        cdkBuilder.namedEntities(namedEntities)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty,
    ) : DatasetMetadataProperty {
      override fun calculatedFields(): Any? = unwrap(this).getCalculatedFields()

      override fun columns(): Any? = unwrap(this).getColumns()

      override fun dataAggregation(): Any? = unwrap(this).getDataAggregation()

      override fun datasetArn(): String = unwrap(this).getDatasetArn()

      override fun datasetDescription(): String? = unwrap(this).getDatasetDescription()

      override fun datasetName(): String? = unwrap(this).getDatasetName()

      override fun filters(): Any? = unwrap(this).getFilters()

      override fun namedEntities(): Any? = unwrap(this).getNamedEntities()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty):
          DatasetMetadataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetMetadataProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface TopicNumericEqualityFilterProperty {
    public fun aggregation(): String? = unwrap(this).getAggregation()

    public fun constant(): Any? = unwrap(this).getConstant()

    public interface Builder {
      public fun aggregation(aggregation: String)

      public fun constant(constant: IResolvable)

      public fun constant(constant: TopicSingularFilterConstantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7f41e4db3de4d7e641c35b55695083fa389e907ff7323c3edf14dee67c0711d")
      public fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty.builder()

      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable::unwrap))
      }

      override fun constant(constant: TopicSingularFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicSingularFilterConstantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7f41e4db3de4d7e641c35b55695083fa389e907ff7323c3edf14dee67c0711d")
      override fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit): Unit
          = constant(TopicSingularFilterConstantProperty(constant))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty,
    ) : TopicNumericEqualityFilterProperty {
      override fun aggregation(): String? = unwrap(this).getAggregation()

      override fun constant(): Any? = unwrap(this).getConstant()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          TopicNumericEqualityFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty):
          TopicNumericEqualityFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicNumericEqualityFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TopicCategoryFilterProperty {
    public fun categoryFilterFunction(): String? = unwrap(this).getCategoryFilterFunction()

    public fun categoryFilterType(): String? = unwrap(this).getCategoryFilterType()

    public fun constant(): Any? = unwrap(this).getConstant()

    public fun inverse(): Any? = unwrap(this).getInverse()

    public interface Builder {
      public fun categoryFilterFunction(categoryFilterFunction: String)

      public fun categoryFilterType(categoryFilterType: String)

      public fun constant(constant: IResolvable)

      public fun constant(constant: TopicCategoryFilterConstantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b8f62d6a6372d6957e55640376ef1f0459f2ef8e1a31870e4c69591dea6fe8")
      public fun constant(constant: TopicCategoryFilterConstantProperty.Builder.() -> Unit)

      public fun inverse(inverse: Boolean)

      public fun inverse(inverse: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty.builder()

      override fun categoryFilterFunction(categoryFilterFunction: String) {
        cdkBuilder.categoryFilterFunction(categoryFilterFunction)
      }

      override fun categoryFilterType(categoryFilterType: String) {
        cdkBuilder.categoryFilterType(categoryFilterType)
      }

      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable::unwrap))
      }

      override fun constant(constant: TopicCategoryFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicCategoryFilterConstantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b8f62d6a6372d6957e55640376ef1f0459f2ef8e1a31870e4c69591dea6fe8")
      override fun constant(constant: TopicCategoryFilterConstantProperty.Builder.() -> Unit): Unit
          = constant(TopicCategoryFilterConstantProperty(constant))

      override fun inverse(inverse: Boolean) {
        cdkBuilder.inverse(inverse)
      }

      override fun inverse(inverse: IResolvable) {
        cdkBuilder.inverse(inverse.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty,
    ) : TopicCategoryFilterProperty {
      override fun categoryFilterFunction(): String? = unwrap(this).getCategoryFilterFunction()

      override fun categoryFilterType(): String? = unwrap(this).getCategoryFilterType()

      override fun constant(): Any? = unwrap(this).getConstant()

      override fun inverse(): Any? = unwrap(this).getInverse()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicCategoryFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty):
          TopicCategoryFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicCategoryFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TopicCalculatedFieldProperty {
    public fun aggregation(): String? = unwrap(this).getAggregation()

    public fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
        emptyList()

    public fun calculatedFieldDescription(): String? = unwrap(this).getCalculatedFieldDescription()

    public fun calculatedFieldName(): String

    public fun calculatedFieldSynonyms(): List<String> = unwrap(this).getCalculatedFieldSynonyms()
        ?: emptyList()

    public fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

    public fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

    public fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

    public fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

    public fun expression(): String

    public fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

    public fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

    public fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

    public fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations() ?:
        emptyList()

    public fun semanticType(): Any? = unwrap(this).getSemanticType()

    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    public interface Builder {
      public fun aggregation(aggregation: String)

      public fun allowedAggregations(allowedAggregations: List<String>)

      public fun calculatedFieldDescription(calculatedFieldDescription: String)

      public fun calculatedFieldName(calculatedFieldName: String)

      public fun calculatedFieldSynonyms(calculatedFieldSynonyms: List<String>)

      public fun cellValueSynonyms(cellValueSynonyms: IResolvable)

      public fun cellValueSynonyms(cellValueSynonyms: List<Any>)

      public fun columnDataRole(columnDataRole: String)

      public fun comparativeOrder(comparativeOrder: IResolvable)

      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7752dc72d1d7a3072515b81d9cff60d54909413989b678a310b1f03038eb8cf2")
      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit)

      public fun defaultFormatting(defaultFormatting: IResolvable)

      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02c51762a3b14223e555dd61f5427568c1ce1d75f597e379476840dd4503d4db")
      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit)

      public fun expression(expression: String)

      public fun isIncludedInTopic(isIncludedInTopic: Boolean)

      public fun isIncludedInTopic(isIncludedInTopic: IResolvable)

      public fun neverAggregateInFilter(neverAggregateInFilter: Boolean)

      public fun neverAggregateInFilter(neverAggregateInFilter: IResolvable)

      public fun nonAdditive(nonAdditive: Boolean)

      public fun nonAdditive(nonAdditive: IResolvable)

      public fun notAllowedAggregations(notAllowedAggregations: List<String>)

      public fun semanticType(semanticType: IResolvable)

      public fun semanticType(semanticType: SemanticTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84dbc251380b8dd16489510407730e1338f48c69105772b32cbf064776c34557")
      public fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit)

      public fun timeGranularity(timeGranularity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty.builder()

      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      override fun allowedAggregations(allowedAggregations: List<String>) {
        cdkBuilder.allowedAggregations(allowedAggregations)
      }

      override fun calculatedFieldDescription(calculatedFieldDescription: String) {
        cdkBuilder.calculatedFieldDescription(calculatedFieldDescription)
      }

      override fun calculatedFieldName(calculatedFieldName: String) {
        cdkBuilder.calculatedFieldName(calculatedFieldName)
      }

      override fun calculatedFieldSynonyms(calculatedFieldSynonyms: List<String>) {
        cdkBuilder.calculatedFieldSynonyms(calculatedFieldSynonyms)
      }

      override fun cellValueSynonyms(cellValueSynonyms: IResolvable) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms.let(IResolvable::unwrap))
      }

      override fun cellValueSynonyms(cellValueSynonyms: List<Any>) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms)
      }

      override fun columnDataRole(columnDataRole: String) {
        cdkBuilder.columnDataRole(columnDataRole)
      }

      override fun comparativeOrder(comparativeOrder: IResolvable) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(IResolvable::unwrap))
      }

      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(ComparativeOrderProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7752dc72d1d7a3072515b81d9cff60d54909413989b678a310b1f03038eb8cf2")
      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit):
          Unit = comparativeOrder(ComparativeOrderProperty(comparativeOrder))

      override fun defaultFormatting(defaultFormatting: IResolvable) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(IResolvable::unwrap))
      }

      override fun defaultFormatting(defaultFormatting: DefaultFormattingProperty) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(DefaultFormattingProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02c51762a3b14223e555dd61f5427568c1ce1d75f597e379476840dd4503d4db")
      override
          fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit):
          Unit = defaultFormatting(DefaultFormattingProperty(defaultFormatting))

      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      override fun isIncludedInTopic(isIncludedInTopic: Boolean) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
      }

      override fun isIncludedInTopic(isIncludedInTopic: IResolvable) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic.let(IResolvable::unwrap))
      }

      override fun neverAggregateInFilter(neverAggregateInFilter: Boolean) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
      }

      override fun neverAggregateInFilter(neverAggregateInFilter: IResolvable) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter.let(IResolvable::unwrap))
      }

      override fun nonAdditive(nonAdditive: Boolean) {
        cdkBuilder.nonAdditive(nonAdditive)
      }

      override fun nonAdditive(nonAdditive: IResolvable) {
        cdkBuilder.nonAdditive(nonAdditive.let(IResolvable::unwrap))
      }

      override fun notAllowedAggregations(notAllowedAggregations: List<String>) {
        cdkBuilder.notAllowedAggregations(notAllowedAggregations)
      }

      override fun semanticType(semanticType: IResolvable) {
        cdkBuilder.semanticType(semanticType.let(IResolvable::unwrap))
      }

      override fun semanticType(semanticType: SemanticTypeProperty) {
        cdkBuilder.semanticType(semanticType.let(SemanticTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84dbc251380b8dd16489510407730e1338f48c69105772b32cbf064776c34557")
      override fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit): Unit =
          semanticType(SemanticTypeProperty(semanticType))

      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty,
    ) : TopicCalculatedFieldProperty {
      override fun aggregation(): String? = unwrap(this).getAggregation()

      override fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
          emptyList()

      override fun calculatedFieldDescription(): String? =
          unwrap(this).getCalculatedFieldDescription()

      override fun calculatedFieldName(): String = unwrap(this).getCalculatedFieldName()

      override fun calculatedFieldSynonyms(): List<String> =
          unwrap(this).getCalculatedFieldSynonyms() ?: emptyList()

      override fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

      override fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

      override fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

      override fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

      override fun expression(): String = unwrap(this).getExpression()

      override fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

      override fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

      override fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

      override fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations()
          ?: emptyList()

      override fun semanticType(): Any? = unwrap(this).getSemanticType()

      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicCalculatedFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty):
          TopicCalculatedFieldProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicCalculatedFieldProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface NamedEntityDefinitionProperty {
    public fun fieldName(): String? = unwrap(this).getFieldName()

    public fun metric(): Any? = unwrap(this).getMetric()

    public fun propertyName(): String? = unwrap(this).getPropertyName()

    public fun propertyRole(): String? = unwrap(this).getPropertyRole()

    public fun propertyUsage(): String? = unwrap(this).getPropertyUsage()

    public interface Builder {
      public fun fieldName(fieldName: String)

      public fun metric(metric: IResolvable)

      public fun metric(metric: NamedEntityDefinitionMetricProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e41b38c93693347a3564c25a7db1caafa2331db88848136186b58a6501d6e8")
      public fun metric(metric: NamedEntityDefinitionMetricProperty.Builder.() -> Unit)

      public fun propertyName(propertyName: String)

      public fun propertyRole(propertyRole: String)

      public fun propertyUsage(propertyUsage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty.builder()

      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable::unwrap))
      }

      override fun metric(metric: NamedEntityDefinitionMetricProperty) {
        cdkBuilder.metric(metric.let(NamedEntityDefinitionMetricProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e41b38c93693347a3564c25a7db1caafa2331db88848136186b58a6501d6e8")
      override fun metric(metric: NamedEntityDefinitionMetricProperty.Builder.() -> Unit): Unit =
          metric(NamedEntityDefinitionMetricProperty(metric))

      override fun propertyName(propertyName: String) {
        cdkBuilder.propertyName(propertyName)
      }

      override fun propertyRole(propertyRole: String) {
        cdkBuilder.propertyRole(propertyRole)
      }

      override fun propertyUsage(propertyUsage: String) {
        cdkBuilder.propertyUsage(propertyUsage)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty,
    ) : NamedEntityDefinitionProperty {
      override fun fieldName(): String? = unwrap(this).getFieldName()

      override fun metric(): Any? = unwrap(this).getMetric()

      override fun propertyName(): String? = unwrap(this).getPropertyName()

      override fun propertyRole(): String? = unwrap(this).getPropertyRole()

      override fun propertyUsage(): String? = unwrap(this).getPropertyUsage()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): NamedEntityDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty):
          NamedEntityDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamedEntityDefinitionProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface TopicNamedEntityProperty {
    public fun definition(): Any? = unwrap(this).getDefinition()

    public fun entityDescription(): String? = unwrap(this).getEntityDescription()

    public fun entityName(): String

    public fun entitySynonyms(): List<String> = unwrap(this).getEntitySynonyms() ?: emptyList()

    public fun semanticEntityType(): Any? = unwrap(this).getSemanticEntityType()

    public interface Builder {
      public fun definition(definition: IResolvable)

      public fun definition(definition: List<Any>)

      public fun entityDescription(entityDescription: String)

      public fun entityName(entityName: String)

      public fun entitySynonyms(entitySynonyms: List<String>)

      public fun semanticEntityType(semanticEntityType: IResolvable)

      public fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("237f7fc40c441778ee40745b5608f4130d7bd7bd0f0c343c89657f8020cffee7")
      public
          fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty.builder()

      override fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition.let(IResolvable::unwrap))
      }

      override fun definition(definition: List<Any>) {
        cdkBuilder.definition(definition)
      }

      override fun entityDescription(entityDescription: String) {
        cdkBuilder.entityDescription(entityDescription)
      }

      override fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
      }

      override fun entitySynonyms(entitySynonyms: List<String>) {
        cdkBuilder.entitySynonyms(entitySynonyms)
      }

      override fun semanticEntityType(semanticEntityType: IResolvable) {
        cdkBuilder.semanticEntityType(semanticEntityType.let(IResolvable::unwrap))
      }

      override fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty) {
        cdkBuilder.semanticEntityType(semanticEntityType.let(SemanticEntityTypeProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("237f7fc40c441778ee40745b5608f4130d7bd7bd0f0c343c89657f8020cffee7")
      override
          fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty.Builder.() -> Unit):
          Unit = semanticEntityType(SemanticEntityTypeProperty(semanticEntityType))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty,
    ) : TopicNamedEntityProperty {
      override fun definition(): Any? = unwrap(this).getDefinition()

      override fun entityDescription(): String? = unwrap(this).getEntityDescription()

      override fun entityName(): String = unwrap(this).getEntityName()

      override fun entitySynonyms(): List<String> = unwrap(this).getEntitySynonyms() ?: emptyList()

      override fun semanticEntityType(): Any? = unwrap(this).getSemanticEntityType()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicNamedEntityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty):
          TopicNamedEntityProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicNamedEntityProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty = (wrapped as
          Wrapper).cdkObject
    }
  }

  public interface DefaultFormattingProperty {
    public fun displayFormat(): String? = unwrap(this).getDisplayFormat()

    public fun displayFormatOptions(): Any? = unwrap(this).getDisplayFormatOptions()

    public interface Builder {
      public fun displayFormat(displayFormat: String)

      public fun displayFormatOptions(displayFormatOptions: IResolvable)

      public fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b52fc3d054d547b5d44c1c4b356f7a3a8129363d5996867fa4f22ba6626135")
      public
          fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty.builder()

      override fun displayFormat(displayFormat: String) {
        cdkBuilder.displayFormat(displayFormat)
      }

      override fun displayFormatOptions(displayFormatOptions: IResolvable) {
        cdkBuilder.displayFormatOptions(displayFormatOptions.let(IResolvable::unwrap))
      }

      override fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty) {
        cdkBuilder.displayFormatOptions(displayFormatOptions.let(DisplayFormatOptionsProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b52fc3d054d547b5d44c1c4b356f7a3a8129363d5996867fa4f22ba6626135")
      override
          fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty.Builder.() -> Unit):
          Unit = displayFormatOptions(DisplayFormatOptionsProperty(displayFormatOptions))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty,
    ) : DefaultFormattingProperty {
      override fun displayFormat(): String? = unwrap(this).getDisplayFormat()

      override fun displayFormatOptions(): Any? = unwrap(this).getDisplayFormatOptions()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultFormattingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty):
          DefaultFormattingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultFormattingProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface TopicNumericRangeFilterProperty {
    public fun aggregation(): String? = unwrap(this).getAggregation()

    public fun constant(): Any? = unwrap(this).getConstant()

    public fun inclusive(): Any? = unwrap(this).getInclusive()

    public interface Builder {
      public fun aggregation(aggregation: String)

      public fun constant(constant: IResolvable)

      public fun constant(constant: TopicRangeFilterConstantProperty)

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e5ac0e2e3f48f707d07ad3b14a3c9eb9f6cf5479184c9a21794ea425b30f0bd")
      public fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit)

      public fun inclusive(inclusive: Boolean)

      public fun inclusive(inclusive: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty.builder()

      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable::unwrap))
      }

      override fun constant(constant: TopicRangeFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicRangeFilterConstantProperty::unwrap))
      }

      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e5ac0e2e3f48f707d07ad3b14a3c9eb9f6cf5479184c9a21794ea425b30f0bd")
      override fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit): Unit =
          constant(TopicRangeFilterConstantProperty(constant))

      override fun inclusive(inclusive: Boolean) {
        cdkBuilder.inclusive(inclusive)
      }

      override fun inclusive(inclusive: IResolvable) {
        cdkBuilder.inclusive(inclusive.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty,
    ) : TopicNumericRangeFilterProperty {
      override fun aggregation(): String? = unwrap(this).getAggregation()

      override fun constant(): Any? = unwrap(this).getConstant()

      override fun inclusive(): Any? = unwrap(this).getInclusive()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): TopicNumericRangeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty):
          TopicNumericRangeFilterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicNumericRangeFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface SemanticEntityTypeProperty {
    public fun subTypeName(): String? = unwrap(this).getSubTypeName()

    public fun typeName(): String? = unwrap(this).getTypeName()

    public fun typeParameters(): Any? = unwrap(this).getTypeParameters()

    public interface Builder {
      public fun subTypeName(subTypeName: String)

      public fun typeName(typeName: String)

      public fun typeParameters(typeParameters: IResolvable)

      public fun typeParameters(typeParameters: Map<String, String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty.builder()

      override fun subTypeName(subTypeName: String) {
        cdkBuilder.subTypeName(subTypeName)
      }

      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      override fun typeParameters(typeParameters: IResolvable) {
        cdkBuilder.typeParameters(typeParameters.let(IResolvable::unwrap))
      }

      override fun typeParameters(typeParameters: Map<String, String>) {
        cdkBuilder.typeParameters(typeParameters)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty,
    ) : SemanticEntityTypeProperty {
      override fun subTypeName(): String? = unwrap(this).getSubTypeName()

      override fun typeName(): String? = unwrap(this).getTypeName()

      override fun typeParameters(): Any? = unwrap(this).getTypeParameters()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): SemanticEntityTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty):
          SemanticEntityTypeProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SemanticEntityTypeProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty = (wrapped
          as Wrapper).cdkObject
    }
  }

  public interface CollectiveConstantProperty {
    public fun valueList(): List<String> = unwrap(this).getValueList() ?: emptyList()

    public interface Builder {
      public fun valueList(valueList: List<String>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty.builder()

      override fun valueList(valueList: List<String>) {
        cdkBuilder.valueList(valueList)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty,
    ) : CollectiveConstantProperty {
      override fun valueList(): List<String> = unwrap(this).getValueList() ?: emptyList()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CollectiveConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty):
          CollectiveConstantProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CollectiveConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
