@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.quicksight

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new Q topic.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.quicksight.*;
 * CfnTopic cfnTopic = CfnTopic.Builder.create(this, "MyCfnTopic")
 * .awsAccountId("awsAccountId")
 * .configOptions(TopicConfigOptionsProperty.builder()
 * .qBusinessInsightsEnabled(false)
 * .build())
 * .dataSets(List.of(DatasetMetadataProperty.builder()
 * .datasetArn("datasetArn")
 * // the properties below are optional
 * .calculatedFields(List.of(TopicCalculatedFieldProperty.builder()
 * .calculatedFieldName("calculatedFieldName")
 * .expression("expression")
 * // the properties below are optional
 * .aggregation("aggregation")
 * .allowedAggregations(List.of("allowedAggregations"))
 * .calculatedFieldDescription("calculatedFieldDescription")
 * .calculatedFieldSynonyms(List.of("calculatedFieldSynonyms"))
 * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
 * .cellValue("cellValue")
 * .synonyms(List.of("synonyms"))
 * .build()))
 * .columnDataRole("columnDataRole")
 * .comparativeOrder(ComparativeOrderProperty.builder()
 * .specifedOrder(List.of("specifedOrder"))
 * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
 * .useOrdering("useOrdering")
 * .build())
 * .defaultFormatting(DefaultFormattingProperty.builder()
 * .displayFormat("displayFormat")
 * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
 * .blankCellFormat("blankCellFormat")
 * .currencySymbol("currencySymbol")
 * .dateFormat("dateFormat")
 * .decimalSeparator("decimalSeparator")
 * .fractionDigits(123)
 * .groupingSeparator("groupingSeparator")
 * .negativeFormat(NegativeFormatProperty.builder()
 * .prefix("prefix")
 * .suffix("suffix")
 * .build())
 * .prefix("prefix")
 * .suffix("suffix")
 * .unitScaler("unitScaler")
 * .useBlankCellFormat(false)
 * .useGrouping(false)
 * .build())
 * .build())
 * .disableIndexing(false)
 * .isIncludedInTopic(false)
 * .neverAggregateInFilter(false)
 * .nonAdditive(false)
 * .notAllowedAggregations(List.of("notAllowedAggregations"))
 * .semanticType(SemanticTypeProperty.builder()
 * .falseyCellValue("falseyCellValue")
 * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
 * .subTypeName("subTypeName")
 * .truthyCellValue("truthyCellValue")
 * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
 * .typeName("typeName")
 * .typeParameters(Map.of(
 * "typeParametersKey", "typeParameters"))
 * .build())
 * .timeGranularity("timeGranularity")
 * .build()))
 * .columns(List.of(TopicColumnProperty.builder()
 * .columnName("columnName")
 * // the properties below are optional
 * .aggregation("aggregation")
 * .allowedAggregations(List.of("allowedAggregations"))
 * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
 * .cellValue("cellValue")
 * .synonyms(List.of("synonyms"))
 * .build()))
 * .columnDataRole("columnDataRole")
 * .columnDescription("columnDescription")
 * .columnFriendlyName("columnFriendlyName")
 * .columnSynonyms(List.of("columnSynonyms"))
 * .comparativeOrder(ComparativeOrderProperty.builder()
 * .specifedOrder(List.of("specifedOrder"))
 * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
 * .useOrdering("useOrdering")
 * .build())
 * .defaultFormatting(DefaultFormattingProperty.builder()
 * .displayFormat("displayFormat")
 * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
 * .blankCellFormat("blankCellFormat")
 * .currencySymbol("currencySymbol")
 * .dateFormat("dateFormat")
 * .decimalSeparator("decimalSeparator")
 * .fractionDigits(123)
 * .groupingSeparator("groupingSeparator")
 * .negativeFormat(NegativeFormatProperty.builder()
 * .prefix("prefix")
 * .suffix("suffix")
 * .build())
 * .prefix("prefix")
 * .suffix("suffix")
 * .unitScaler("unitScaler")
 * .useBlankCellFormat(false)
 * .useGrouping(false)
 * .build())
 * .build())
 * .disableIndexing(false)
 * .isIncludedInTopic(false)
 * .neverAggregateInFilter(false)
 * .nonAdditive(false)
 * .notAllowedAggregations(List.of("notAllowedAggregations"))
 * .semanticType(SemanticTypeProperty.builder()
 * .falseyCellValue("falseyCellValue")
 * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
 * .subTypeName("subTypeName")
 * .truthyCellValue("truthyCellValue")
 * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
 * .typeName("typeName")
 * .typeParameters(Map.of(
 * "typeParametersKey", "typeParameters"))
 * .build())
 * .timeGranularity("timeGranularity")
 * .build()))
 * .dataAggregation(DataAggregationProperty.builder()
 * .datasetRowDateGranularity("datasetRowDateGranularity")
 * .defaultDateColumnName("defaultDateColumnName")
 * .build())
 * .datasetDescription("datasetDescription")
 * .datasetName("datasetName")
 * .filters(List.of(TopicFilterProperty.builder()
 * .filterName("filterName")
 * .operandFieldName("operandFieldName")
 * // the properties below are optional
 * .categoryFilter(TopicCategoryFilterProperty.builder()
 * .categoryFilterFunction("categoryFilterFunction")
 * .categoryFilterType("categoryFilterType")
 * .constant(TopicCategoryFilterConstantProperty.builder()
 * .collectiveConstant(CollectiveConstantProperty.builder()
 * .valueList(List.of("valueList"))
 * .build())
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build())
 * .inverse(false)
 * .build())
 * .dateRangeFilter(TopicDateRangeFilterProperty.builder()
 * .constant(TopicRangeFilterConstantProperty.builder()
 * .constantType("constantType")
 * .rangeConstant(RangeConstantProperty.builder()
 * .maximum("maximum")
 * .minimum("minimum")
 * .build())
 * .build())
 * .inclusive(false)
 * .build())
 * .filterClass("filterClass")
 * .filterDescription("filterDescription")
 * .filterSynonyms(List.of("filterSynonyms"))
 * .filterType("filterType")
 * .numericEqualityFilter(TopicNumericEqualityFilterProperty.builder()
 * .aggregation("aggregation")
 * .constant(TopicSingularFilterConstantProperty.builder()
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build())
 * .build())
 * .numericRangeFilter(TopicNumericRangeFilterProperty.builder()
 * .aggregation("aggregation")
 * .constant(TopicRangeFilterConstantProperty.builder()
 * .constantType("constantType")
 * .rangeConstant(RangeConstantProperty.builder()
 * .maximum("maximum")
 * .minimum("minimum")
 * .build())
 * .build())
 * .inclusive(false)
 * .build())
 * .relativeDateFilter(TopicRelativeDateFilterProperty.builder()
 * .constant(TopicSingularFilterConstantProperty.builder()
 * .constantType("constantType")
 * .singularConstant("singularConstant")
 * .build())
 * .relativeDateFilterFunction("relativeDateFilterFunction")
 * .timeGranularity("timeGranularity")
 * .build())
 * .build()))
 * .namedEntities(List.of(TopicNamedEntityProperty.builder()
 * .entityName("entityName")
 * // the properties below are optional
 * .definition(List.of(NamedEntityDefinitionProperty.builder()
 * .fieldName("fieldName")
 * .metric(NamedEntityDefinitionMetricProperty.builder()
 * .aggregation("aggregation")
 * .aggregationFunctionParameters(Map.of(
 * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
 * .build())
 * .propertyName("propertyName")
 * .propertyRole("propertyRole")
 * .propertyUsage("propertyUsage")
 * .build()))
 * .entityDescription("entityDescription")
 * .entitySynonyms(List.of("entitySynonyms"))
 * .semanticEntityType(SemanticEntityTypeProperty.builder()
 * .subTypeName("subTypeName")
 * .typeName("typeName")
 * .typeParameters(Map.of(
 * "typeParametersKey", "typeParameters"))
 * .build())
 * .build()))
 * .build()))
 * .description("description")
 * .folderArns(List.of("folderArns"))
 * .name("name")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .topicId("topicId")
 * .userExperienceVersion("userExperienceVersion")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html)
 */
public open class CfnTopic(
  cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggableV2 {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.quicksight.CfnTopic(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicProps,
  ) :
      this(software.amazon.awscdk.services.quicksight.CfnTopic(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTopicProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTopicProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTopicProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the topic.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the AWS account that you want to create a topic in.
   */
  public open fun awsAccountId(): String? = unwrap(this).getAwsAccountId()

  /**
   * The ID of the AWS account that you want to create a topic in.
   */
  public open fun awsAccountId(`value`: String) {
    unwrap(this).setAwsAccountId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * Configuration options for a `Topic` .
   */
  public open fun configOptions(): Any? = unwrap(this).getConfigOptions()

  /**
   * Configuration options for a `Topic` .
   */
  public open fun configOptions(`value`: IResolvable) {
    unwrap(this).setConfigOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Configuration options for a `Topic` .
   */
  public open fun configOptions(`value`: TopicConfigOptionsProperty) {
    unwrap(this).setConfigOptions(`value`.let(TopicConfigOptionsProperty.Companion::unwrap))
  }

  /**
   * Configuration options for a `Topic` .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60f3fb03142b3bcf6767dc0ed5622eec715637b160c2548361cd78b5ba22c025")
  public open fun configOptions(`value`: TopicConfigOptionsProperty.Builder.() -> Unit): Unit =
      configOptions(TopicConfigOptionsProperty(`value`))

  /**
   * The data sets that the topic is associated with.
   */
  public open fun dataSets(): Any? = unwrap(this).getDataSets()

  /**
   * The data sets that the topic is associated with.
   */
  public open fun dataSets(`value`: IResolvable) {
    unwrap(this).setDataSets(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * The data sets that the topic is associated with.
   */
  public open fun dataSets(`value`: List<Any>) {
    unwrap(this).setDataSets(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * The data sets that the topic is associated with.
   */
  public open fun dataSets(vararg `value`: Any): Unit = dataSets(`value`.toList())

  /**
   * The description of the topic.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the topic.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   *
   */
  public open fun folderArns(): List<String> = unwrap(this).getFolderArns() ?: emptyList()

  /**
   *
   */
  public open fun folderArns(`value`: List<String>) {
    unwrap(this).setFolderArns(`value`)
  }

  /**
   *
   */
  public open fun folderArns(vararg `value`: String): Unit = folderArns(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The name of the topic.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * The name of the topic.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   *
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * The ID for the topic.
   */
  public open fun topicId(): String? = unwrap(this).getTopicId()

  /**
   * The ID for the topic.
   */
  public open fun topicId(`value`: String) {
    unwrap(this).setTopicId(`value`)
  }

  /**
   * The user experience version of the topic.
   */
  public open fun userExperienceVersion(): String? = unwrap(this).getUserExperienceVersion()

  /**
   * The user experience version of the topic.
   */
  public open fun userExperienceVersion(`value`: String) {
    unwrap(this).setUserExperienceVersion(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.quicksight.CfnTopic].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the AWS account that you want to create a topic in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-awsaccountid)
     * @param awsAccountId The ID of the AWS account that you want to create a topic in. 
     */
    public fun awsAccountId(awsAccountId: String)

    /**
     * Configuration options for a `Topic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-configoptions)
     * @param configOptions Configuration options for a `Topic` . 
     */
    public fun configOptions(configOptions: IResolvable)

    /**
     * Configuration options for a `Topic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-configoptions)
     * @param configOptions Configuration options for a `Topic` . 
     */
    public fun configOptions(configOptions: TopicConfigOptionsProperty)

    /**
     * Configuration options for a `Topic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-configoptions)
     * @param configOptions Configuration options for a `Topic` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18f772a3ba7d9ca793287d0d07c852915f02a02a78eabe284903c730937d4e8e")
    public fun configOptions(configOptions: TopicConfigOptionsProperty.Builder.() -> Unit)

    /**
     * The data sets that the topic is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
     * @param dataSets The data sets that the topic is associated with. 
     */
    public fun dataSets(dataSets: IResolvable)

    /**
     * The data sets that the topic is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
     * @param dataSets The data sets that the topic is associated with. 
     */
    public fun dataSets(dataSets: List<Any>)

    /**
     * The data sets that the topic is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
     * @param dataSets The data sets that the topic is associated with. 
     */
    public fun dataSets(vararg dataSets: Any)

    /**
     * The description of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-description)
     * @param description The description of the topic. 
     */
    public fun description(description: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-folderarns)
     * @param folderArns 
     */
    public fun folderArns(folderArns: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-folderarns)
     * @param folderArns 
     */
    public fun folderArns(vararg folderArns: String)

    /**
     * The name of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-name)
     * @param name The name of the topic. 
     */
    public fun name(name: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-tags)
     * @param tags 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-tags)
     * @param tags 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The ID for the topic.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-topicid)
     * @param topicId The ID for the topic. 
     */
    public fun topicId(topicId: String)

    /**
     * The user experience version of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-userexperienceversion)
     * @param userExperienceVersion The user experience version of the topic. 
     */
    public fun userExperienceVersion(userExperienceVersion: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.quicksight.CfnTopic.Builder =
        software.amazon.awscdk.services.quicksight.CfnTopic.Builder.create(scope, id)

    /**
     * The ID of the AWS account that you want to create a topic in.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-awsaccountid)
     * @param awsAccountId The ID of the AWS account that you want to create a topic in. 
     */
    override fun awsAccountId(awsAccountId: String) {
      cdkBuilder.awsAccountId(awsAccountId)
    }

    /**
     * Configuration options for a `Topic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-configoptions)
     * @param configOptions Configuration options for a `Topic` . 
     */
    override fun configOptions(configOptions: IResolvable) {
      cdkBuilder.configOptions(configOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * Configuration options for a `Topic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-configoptions)
     * @param configOptions Configuration options for a `Topic` . 
     */
    override fun configOptions(configOptions: TopicConfigOptionsProperty) {
      cdkBuilder.configOptions(configOptions.let(TopicConfigOptionsProperty.Companion::unwrap))
    }

    /**
     * Configuration options for a `Topic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-configoptions)
     * @param configOptions Configuration options for a `Topic` . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("18f772a3ba7d9ca793287d0d07c852915f02a02a78eabe284903c730937d4e8e")
    override fun configOptions(configOptions: TopicConfigOptionsProperty.Builder.() -> Unit): Unit =
        configOptions(TopicConfigOptionsProperty(configOptions))

    /**
     * The data sets that the topic is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
     * @param dataSets The data sets that the topic is associated with. 
     */
    override fun dataSets(dataSets: IResolvable) {
      cdkBuilder.dataSets(dataSets.let(IResolvable.Companion::unwrap))
    }

    /**
     * The data sets that the topic is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
     * @param dataSets The data sets that the topic is associated with. 
     */
    override fun dataSets(dataSets: List<Any>) {
      cdkBuilder.dataSets(dataSets.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * The data sets that the topic is associated with.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-datasets)
     * @param dataSets The data sets that the topic is associated with. 
     */
    override fun dataSets(vararg dataSets: Any): Unit = dataSets(dataSets.toList())

    /**
     * The description of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-description)
     * @param description The description of the topic. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-folderarns)
     * @param folderArns 
     */
    override fun folderArns(folderArns: List<String>) {
      cdkBuilder.folderArns(folderArns)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-folderarns)
     * @param folderArns 
     */
    override fun folderArns(vararg folderArns: String): Unit = folderArns(folderArns.toList())

    /**
     * The name of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-name)
     * @param name The name of the topic. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-tags)
     * @param tags 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-tags)
     * @param tags 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The ID for the topic.
     *
     * This ID is unique per AWS Region for each AWS account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-topicid)
     * @param topicId The ID for the topic. 
     */
    override fun topicId(topicId: String) {
      cdkBuilder.topicId(topicId)
    }

    /**
     * The user experience version of the topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-quicksight-topic.html#cfn-quicksight-topic-userexperienceversion)
     * @param userExperienceVersion The user experience version of the topic. 
     */
    override fun userExperienceVersion(userExperienceVersion: String) {
      cdkBuilder.userExperienceVersion(userExperienceVersion)
    }

    public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.quicksight.CfnTopic.CFN_RESOURCE_TYPE_NAME

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
        wrapped.cdkObject as software.amazon.awscdk.services.quicksight.CfnTopic
  }

  /**
   * A structure that represents the cell value synonym.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * CellValueSynonymProperty cellValueSynonymProperty = CellValueSynonymProperty.builder()
   * .cellValue("cellValue")
   * .synonyms(List.of("synonyms"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-cellvaluesynonym.html)
   */
  public interface CellValueSynonymProperty {
    /**
     * The cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-cellvaluesynonym.html#cfn-quicksight-topic-cellvaluesynonym-cellvalue)
     */
    public fun cellValue(): String? = unwrap(this).getCellValue()

    /**
     * Other names or aliases for the cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-cellvaluesynonym.html#cfn-quicksight-topic-cellvaluesynonym-synonyms)
     */
    public fun synonyms(): List<String> = unwrap(this).getSynonyms() ?: emptyList()

    /**
     * A builder for [CellValueSynonymProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cellValue The cell value.
       */
      public fun cellValue(cellValue: String)

      /**
       * @param synonyms Other names or aliases for the cell value.
       */
      public fun synonyms(synonyms: List<String>)

      /**
       * @param synonyms Other names or aliases for the cell value.
       */
      public fun synonyms(vararg synonyms: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty.builder()

      /**
       * @param cellValue The cell value.
       */
      override fun cellValue(cellValue: String) {
        cdkBuilder.cellValue(cellValue)
      }

      /**
       * @param synonyms Other names or aliases for the cell value.
       */
      override fun synonyms(synonyms: List<String>) {
        cdkBuilder.synonyms(synonyms)
      }

      /**
       * @param synonyms Other names or aliases for the cell value.
       */
      override fun synonyms(vararg synonyms: String): Unit = synonyms(synonyms.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty,
    ) : CdkObject(cdkObject),
        CellValueSynonymProperty {
      /**
       * The cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-cellvaluesynonym.html#cfn-quicksight-topic-cellvaluesynonym-cellvalue)
       */
      override fun cellValue(): String? = unwrap(this).getCellValue()

      /**
       * Other names or aliases for the cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-cellvaluesynonym.html#cfn-quicksight-topic-cellvaluesynonym-synonyms)
       */
      override fun synonyms(): List<String> = unwrap(this).getSynonyms() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CellValueSynonymProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty):
          CellValueSynonymProperty = CdkObjectWrappers.wrap(cdkObject) as? CellValueSynonymProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CellValueSynonymProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.CellValueSynonymProperty
    }
  }

  /**
   * A structure that represents a collective constant.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * CollectiveConstantProperty collectiveConstantProperty = CollectiveConstantProperty.builder()
   * .valueList(List.of("valueList"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-collectiveconstant.html)
   */
  public interface CollectiveConstantProperty {
    /**
     * A list of values for the collective constant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-collectiveconstant.html#cfn-quicksight-topic-collectiveconstant-valuelist)
     */
    public fun valueList(): List<String> = unwrap(this).getValueList() ?: emptyList()

    /**
     * A builder for [CollectiveConstantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param valueList A list of values for the collective constant.
       */
      public fun valueList(valueList: List<String>)

      /**
       * @param valueList A list of values for the collective constant.
       */
      public fun valueList(vararg valueList: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty.builder()

      /**
       * @param valueList A list of values for the collective constant.
       */
      override fun valueList(valueList: List<String>) {
        cdkBuilder.valueList(valueList)
      }

      /**
       * @param valueList A list of values for the collective constant.
       */
      override fun valueList(vararg valueList: String): Unit = valueList(valueList.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty,
    ) : CdkObject(cdkObject),
        CollectiveConstantProperty {
      /**
       * A list of values for the collective constant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-collectiveconstant.html#cfn-quicksight-topic-collectiveconstant-valuelist)
       */
      override fun valueList(): List<String> = unwrap(this).getValueList() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CollectiveConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty):
          CollectiveConstantProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CollectiveConstantProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CollectiveConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.CollectiveConstantProperty
    }
  }

  /**
   * The order in which data is displayed for the column when it's used in a comparative context.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * ComparativeOrderProperty comparativeOrderProperty = ComparativeOrderProperty.builder()
   * .specifedOrder(List.of("specifedOrder"))
   * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
   * .useOrdering("useOrdering")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html)
   */
  public interface ComparativeOrderProperty {
    /**
     * The list of columns to be used in the ordering.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html#cfn-quicksight-topic-comparativeorder-specifedorder)
     */
    public fun specifedOrder(): List<String> = unwrap(this).getSpecifedOrder() ?: emptyList()

    /**
     * The treat of undefined specified values.
     *
     * Valid values for this structure are `LEAST` and `MOST` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html#cfn-quicksight-topic-comparativeorder-treatundefinedspecifiedvalues)
     */
    public fun treatUndefinedSpecifiedValues(): String? =
        unwrap(this).getTreatUndefinedSpecifiedValues()

    /**
     * The ordering type for a column.
     *
     * Valid values for this structure are `GREATER_IS_BETTER` , `LESSER_IS_BETTER` and `SPECIFIED`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html#cfn-quicksight-topic-comparativeorder-useordering)
     */
    public fun useOrdering(): String? = unwrap(this).getUseOrdering()

    /**
     * A builder for [ComparativeOrderProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param specifedOrder The list of columns to be used in the ordering.
       */
      public fun specifedOrder(specifedOrder: List<String>)

      /**
       * @param specifedOrder The list of columns to be used in the ordering.
       */
      public fun specifedOrder(vararg specifedOrder: String)

      /**
       * @param treatUndefinedSpecifiedValues The treat of undefined specified values.
       * Valid values for this structure are `LEAST` and `MOST` .
       */
      public fun treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues: String)

      /**
       * @param useOrdering The ordering type for a column.
       * Valid values for this structure are `GREATER_IS_BETTER` , `LESSER_IS_BETTER` and
       * `SPECIFIED` .
       */
      public fun useOrdering(useOrdering: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty.builder()

      /**
       * @param specifedOrder The list of columns to be used in the ordering.
       */
      override fun specifedOrder(specifedOrder: List<String>) {
        cdkBuilder.specifedOrder(specifedOrder)
      }

      /**
       * @param specifedOrder The list of columns to be used in the ordering.
       */
      override fun specifedOrder(vararg specifedOrder: String): Unit =
          specifedOrder(specifedOrder.toList())

      /**
       * @param treatUndefinedSpecifiedValues The treat of undefined specified values.
       * Valid values for this structure are `LEAST` and `MOST` .
       */
      override fun treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues: String) {
        cdkBuilder.treatUndefinedSpecifiedValues(treatUndefinedSpecifiedValues)
      }

      /**
       * @param useOrdering The ordering type for a column.
       * Valid values for this structure are `GREATER_IS_BETTER` , `LESSER_IS_BETTER` and
       * `SPECIFIED` .
       */
      override fun useOrdering(useOrdering: String) {
        cdkBuilder.useOrdering(useOrdering)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty,
    ) : CdkObject(cdkObject),
        ComparativeOrderProperty {
      /**
       * The list of columns to be used in the ordering.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html#cfn-quicksight-topic-comparativeorder-specifedorder)
       */
      override fun specifedOrder(): List<String> = unwrap(this).getSpecifedOrder() ?: emptyList()

      /**
       * The treat of undefined specified values.
       *
       * Valid values for this structure are `LEAST` and `MOST` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html#cfn-quicksight-topic-comparativeorder-treatundefinedspecifiedvalues)
       */
      override fun treatUndefinedSpecifiedValues(): String? =
          unwrap(this).getTreatUndefinedSpecifiedValues()

      /**
       * The ordering type for a column.
       *
       * Valid values for this structure are `GREATER_IS_BETTER` , `LESSER_IS_BETTER` and
       * `SPECIFIED` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-comparativeorder.html#cfn-quicksight-topic-comparativeorder-useordering)
       */
      override fun useOrdering(): String? = unwrap(this).getUseOrdering()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ComparativeOrderProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty):
          ComparativeOrderProperty = CdkObjectWrappers.wrap(cdkObject) as? ComparativeOrderProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ComparativeOrderProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.ComparativeOrderProperty
    }
  }

  /**
   * The definition of a data aggregation.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DataAggregationProperty dataAggregationProperty = DataAggregationProperty.builder()
   * .datasetRowDateGranularity("datasetRowDateGranularity")
   * .defaultDateColumnName("defaultDateColumnName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-dataaggregation.html)
   */
  public interface DataAggregationProperty {
    /**
     * The level of time precision that is used to aggregate `DateTime` values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-dataaggregation.html#cfn-quicksight-topic-dataaggregation-datasetrowdategranularity)
     */
    public fun datasetRowDateGranularity(): String? = unwrap(this).getDatasetRowDateGranularity()

    /**
     * The column name for the default date.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-dataaggregation.html#cfn-quicksight-topic-dataaggregation-defaultdatecolumnname)
     */
    public fun defaultDateColumnName(): String? = unwrap(this).getDefaultDateColumnName()

    /**
     * A builder for [DataAggregationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datasetRowDateGranularity The level of time precision that is used to aggregate
       * `DateTime` values.
       */
      public fun datasetRowDateGranularity(datasetRowDateGranularity: String)

      /**
       * @param defaultDateColumnName The column name for the default date.
       */
      public fun defaultDateColumnName(defaultDateColumnName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty.builder()

      /**
       * @param datasetRowDateGranularity The level of time precision that is used to aggregate
       * `DateTime` values.
       */
      override fun datasetRowDateGranularity(datasetRowDateGranularity: String) {
        cdkBuilder.datasetRowDateGranularity(datasetRowDateGranularity)
      }

      /**
       * @param defaultDateColumnName The column name for the default date.
       */
      override fun defaultDateColumnName(defaultDateColumnName: String) {
        cdkBuilder.defaultDateColumnName(defaultDateColumnName)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty,
    ) : CdkObject(cdkObject),
        DataAggregationProperty {
      /**
       * The level of time precision that is used to aggregate `DateTime` values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-dataaggregation.html#cfn-quicksight-topic-dataaggregation-datasetrowdategranularity)
       */
      override fun datasetRowDateGranularity(): String? =
          unwrap(this).getDatasetRowDateGranularity()

      /**
       * The column name for the default date.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-dataaggregation.html#cfn-quicksight-topic-dataaggregation-defaultdatecolumnname)
       */
      override fun defaultDateColumnName(): String? = unwrap(this).getDefaultDateColumnName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataAggregationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty):
          DataAggregationProperty = CdkObjectWrappers.wrap(cdkObject) as? DataAggregationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataAggregationProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.DataAggregationProperty
    }
  }

  /**
   * A structure that represents a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DatasetMetadataProperty datasetMetadataProperty = DatasetMetadataProperty.builder()
   * .datasetArn("datasetArn")
   * // the properties below are optional
   * .calculatedFields(List.of(TopicCalculatedFieldProperty.builder()
   * .calculatedFieldName("calculatedFieldName")
   * .expression("expression")
   * // the properties below are optional
   * .aggregation("aggregation")
   * .allowedAggregations(List.of("allowedAggregations"))
   * .calculatedFieldDescription("calculatedFieldDescription")
   * .calculatedFieldSynonyms(List.of("calculatedFieldSynonyms"))
   * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
   * .cellValue("cellValue")
   * .synonyms(List.of("synonyms"))
   * .build()))
   * .columnDataRole("columnDataRole")
   * .comparativeOrder(ComparativeOrderProperty.builder()
   * .specifedOrder(List.of("specifedOrder"))
   * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
   * .useOrdering("useOrdering")
   * .build())
   * .defaultFormatting(DefaultFormattingProperty.builder()
   * .displayFormat("displayFormat")
   * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
   * .blankCellFormat("blankCellFormat")
   * .currencySymbol("currencySymbol")
   * .dateFormat("dateFormat")
   * .decimalSeparator("decimalSeparator")
   * .fractionDigits(123)
   * .groupingSeparator("groupingSeparator")
   * .negativeFormat(NegativeFormatProperty.builder()
   * .prefix("prefix")
   * .suffix("suffix")
   * .build())
   * .prefix("prefix")
   * .suffix("suffix")
   * .unitScaler("unitScaler")
   * .useBlankCellFormat(false)
   * .useGrouping(false)
   * .build())
   * .build())
   * .disableIndexing(false)
   * .isIncludedInTopic(false)
   * .neverAggregateInFilter(false)
   * .nonAdditive(false)
   * .notAllowedAggregations(List.of("notAllowedAggregations"))
   * .semanticType(SemanticTypeProperty.builder()
   * .falseyCellValue("falseyCellValue")
   * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
   * .subTypeName("subTypeName")
   * .truthyCellValue("truthyCellValue")
   * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build())
   * .timeGranularity("timeGranularity")
   * .build()))
   * .columns(List.of(TopicColumnProperty.builder()
   * .columnName("columnName")
   * // the properties below are optional
   * .aggregation("aggregation")
   * .allowedAggregations(List.of("allowedAggregations"))
   * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
   * .cellValue("cellValue")
   * .synonyms(List.of("synonyms"))
   * .build()))
   * .columnDataRole("columnDataRole")
   * .columnDescription("columnDescription")
   * .columnFriendlyName("columnFriendlyName")
   * .columnSynonyms(List.of("columnSynonyms"))
   * .comparativeOrder(ComparativeOrderProperty.builder()
   * .specifedOrder(List.of("specifedOrder"))
   * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
   * .useOrdering("useOrdering")
   * .build())
   * .defaultFormatting(DefaultFormattingProperty.builder()
   * .displayFormat("displayFormat")
   * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
   * .blankCellFormat("blankCellFormat")
   * .currencySymbol("currencySymbol")
   * .dateFormat("dateFormat")
   * .decimalSeparator("decimalSeparator")
   * .fractionDigits(123)
   * .groupingSeparator("groupingSeparator")
   * .negativeFormat(NegativeFormatProperty.builder()
   * .prefix("prefix")
   * .suffix("suffix")
   * .build())
   * .prefix("prefix")
   * .suffix("suffix")
   * .unitScaler("unitScaler")
   * .useBlankCellFormat(false)
   * .useGrouping(false)
   * .build())
   * .build())
   * .disableIndexing(false)
   * .isIncludedInTopic(false)
   * .neverAggregateInFilter(false)
   * .nonAdditive(false)
   * .notAllowedAggregations(List.of("notAllowedAggregations"))
   * .semanticType(SemanticTypeProperty.builder()
   * .falseyCellValue("falseyCellValue")
   * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
   * .subTypeName("subTypeName")
   * .truthyCellValue("truthyCellValue")
   * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build())
   * .timeGranularity("timeGranularity")
   * .build()))
   * .dataAggregation(DataAggregationProperty.builder()
   * .datasetRowDateGranularity("datasetRowDateGranularity")
   * .defaultDateColumnName("defaultDateColumnName")
   * .build())
   * .datasetDescription("datasetDescription")
   * .datasetName("datasetName")
   * .filters(List.of(TopicFilterProperty.builder()
   * .filterName("filterName")
   * .operandFieldName("operandFieldName")
   * // the properties below are optional
   * .categoryFilter(TopicCategoryFilterProperty.builder()
   * .categoryFilterFunction("categoryFilterFunction")
   * .categoryFilterType("categoryFilterType")
   * .constant(TopicCategoryFilterConstantProperty.builder()
   * .collectiveConstant(CollectiveConstantProperty.builder()
   * .valueList(List.of("valueList"))
   * .build())
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .inverse(false)
   * .build())
   * .dateRangeFilter(TopicDateRangeFilterProperty.builder()
   * .constant(TopicRangeFilterConstantProperty.builder()
   * .constantType("constantType")
   * .rangeConstant(RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build())
   * .build())
   * .inclusive(false)
   * .build())
   * .filterClass("filterClass")
   * .filterDescription("filterDescription")
   * .filterSynonyms(List.of("filterSynonyms"))
   * .filterType("filterType")
   * .numericEqualityFilter(TopicNumericEqualityFilterProperty.builder()
   * .aggregation("aggregation")
   * .constant(TopicSingularFilterConstantProperty.builder()
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .build())
   * .numericRangeFilter(TopicNumericRangeFilterProperty.builder()
   * .aggregation("aggregation")
   * .constant(TopicRangeFilterConstantProperty.builder()
   * .constantType("constantType")
   * .rangeConstant(RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build())
   * .build())
   * .inclusive(false)
   * .build())
   * .relativeDateFilter(TopicRelativeDateFilterProperty.builder()
   * .constant(TopicSingularFilterConstantProperty.builder()
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .relativeDateFilterFunction("relativeDateFilterFunction")
   * .timeGranularity("timeGranularity")
   * .build())
   * .build()))
   * .namedEntities(List.of(TopicNamedEntityProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .definition(List.of(NamedEntityDefinitionProperty.builder()
   * .fieldName("fieldName")
   * .metric(NamedEntityDefinitionMetricProperty.builder()
   * .aggregation("aggregation")
   * .aggregationFunctionParameters(Map.of(
   * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
   * .build())
   * .propertyName("propertyName")
   * .propertyRole("propertyRole")
   * .propertyUsage("propertyUsage")
   * .build()))
   * .entityDescription("entityDescription")
   * .entitySynonyms(List.of("entitySynonyms"))
   * .semanticEntityType(SemanticEntityTypeProperty.builder()
   * .subTypeName("subTypeName")
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html)
   */
  public interface DatasetMetadataProperty {
    /**
     * The list of calculated field definitions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-calculatedfields)
     */
    public fun calculatedFields(): Any? = unwrap(this).getCalculatedFields()

    /**
     * The list of column definitions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-columns)
     */
    public fun columns(): Any? = unwrap(this).getColumns()

    /**
     * The definition of a data aggregation.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-dataaggregation)
     */
    public fun dataAggregation(): Any? = unwrap(this).getDataAggregation()

    /**
     * The Amazon Resource Name (ARN) of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-datasetarn)
     */
    public fun datasetArn(): String

    /**
     * The description of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-datasetdescription)
     */
    public fun datasetDescription(): String? = unwrap(this).getDatasetDescription()

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-datasetname)
     */
    public fun datasetName(): String? = unwrap(this).getDatasetName()

    /**
     * The list of filter definitions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-filters)
     */
    public fun filters(): Any? = unwrap(this).getFilters()

    /**
     * The list of named entities definitions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-namedentities)
     */
    public fun namedEntities(): Any? = unwrap(this).getNamedEntities()

    /**
     * A builder for [DatasetMetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param calculatedFields The list of calculated field definitions.
       */
      public fun calculatedFields(calculatedFields: IResolvable)

      /**
       * @param calculatedFields The list of calculated field definitions.
       */
      public fun calculatedFields(calculatedFields: List<Any>)

      /**
       * @param calculatedFields The list of calculated field definitions.
       */
      public fun calculatedFields(vararg calculatedFields: Any)

      /**
       * @param columns The list of column definitions.
       */
      public fun columns(columns: IResolvable)

      /**
       * @param columns The list of column definitions.
       */
      public fun columns(columns: List<Any>)

      /**
       * @param columns The list of column definitions.
       */
      public fun columns(vararg columns: Any)

      /**
       * @param dataAggregation The definition of a data aggregation.
       */
      public fun dataAggregation(dataAggregation: IResolvable)

      /**
       * @param dataAggregation The definition of a data aggregation.
       */
      public fun dataAggregation(dataAggregation: DataAggregationProperty)

      /**
       * @param dataAggregation The definition of a data aggregation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fa0a109bb35bb7e5676eca3ee8be52e6363c0cf17be69739e46bb0edf598f47")
      public fun dataAggregation(dataAggregation: DataAggregationProperty.Builder.() -> Unit)

      /**
       * @param datasetArn The Amazon Resource Name (ARN) of the dataset. 
       */
      public fun datasetArn(datasetArn: String)

      /**
       * @param datasetDescription The description of the dataset.
       */
      public fun datasetDescription(datasetDescription: String)

      /**
       * @param datasetName The name of the dataset.
       */
      public fun datasetName(datasetName: String)

      /**
       * @param filters The list of filter definitions.
       */
      public fun filters(filters: IResolvable)

      /**
       * @param filters The list of filter definitions.
       */
      public fun filters(filters: List<Any>)

      /**
       * @param filters The list of filter definitions.
       */
      public fun filters(vararg filters: Any)

      /**
       * @param namedEntities The list of named entities definitions.
       */
      public fun namedEntities(namedEntities: IResolvable)

      /**
       * @param namedEntities The list of named entities definitions.
       */
      public fun namedEntities(namedEntities: List<Any>)

      /**
       * @param namedEntities The list of named entities definitions.
       */
      public fun namedEntities(vararg namedEntities: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty.builder()

      /**
       * @param calculatedFields The list of calculated field definitions.
       */
      override fun calculatedFields(calculatedFields: IResolvable) {
        cdkBuilder.calculatedFields(calculatedFields.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param calculatedFields The list of calculated field definitions.
       */
      override fun calculatedFields(calculatedFields: List<Any>) {
        cdkBuilder.calculatedFields(calculatedFields.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param calculatedFields The list of calculated field definitions.
       */
      override fun calculatedFields(vararg calculatedFields: Any): Unit =
          calculatedFields(calculatedFields.toList())

      /**
       * @param columns The list of column definitions.
       */
      override fun columns(columns: IResolvable) {
        cdkBuilder.columns(columns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param columns The list of column definitions.
       */
      override fun columns(columns: List<Any>) {
        cdkBuilder.columns(columns.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param columns The list of column definitions.
       */
      override fun columns(vararg columns: Any): Unit = columns(columns.toList())

      /**
       * @param dataAggregation The definition of a data aggregation.
       */
      override fun dataAggregation(dataAggregation: IResolvable) {
        cdkBuilder.dataAggregation(dataAggregation.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dataAggregation The definition of a data aggregation.
       */
      override fun dataAggregation(dataAggregation: DataAggregationProperty) {
        cdkBuilder.dataAggregation(dataAggregation.let(DataAggregationProperty.Companion::unwrap))
      }

      /**
       * @param dataAggregation The definition of a data aggregation.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9fa0a109bb35bb7e5676eca3ee8be52e6363c0cf17be69739e46bb0edf598f47")
      override fun dataAggregation(dataAggregation: DataAggregationProperty.Builder.() -> Unit):
          Unit = dataAggregation(DataAggregationProperty(dataAggregation))

      /**
       * @param datasetArn The Amazon Resource Name (ARN) of the dataset. 
       */
      override fun datasetArn(datasetArn: String) {
        cdkBuilder.datasetArn(datasetArn)
      }

      /**
       * @param datasetDescription The description of the dataset.
       */
      override fun datasetDescription(datasetDescription: String) {
        cdkBuilder.datasetDescription(datasetDescription)
      }

      /**
       * @param datasetName The name of the dataset.
       */
      override fun datasetName(datasetName: String) {
        cdkBuilder.datasetName(datasetName)
      }

      /**
       * @param filters The list of filter definitions.
       */
      override fun filters(filters: IResolvable) {
        cdkBuilder.filters(filters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filters The list of filter definitions.
       */
      override fun filters(filters: List<Any>) {
        cdkBuilder.filters(filters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param filters The list of filter definitions.
       */
      override fun filters(vararg filters: Any): Unit = filters(filters.toList())

      /**
       * @param namedEntities The list of named entities definitions.
       */
      override fun namedEntities(namedEntities: IResolvable) {
        cdkBuilder.namedEntities(namedEntities.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param namedEntities The list of named entities definitions.
       */
      override fun namedEntities(namedEntities: List<Any>) {
        cdkBuilder.namedEntities(namedEntities.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param namedEntities The list of named entities definitions.
       */
      override fun namedEntities(vararg namedEntities: Any): Unit =
          namedEntities(namedEntities.toList())

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty,
    ) : CdkObject(cdkObject),
        DatasetMetadataProperty {
      /**
       * The list of calculated field definitions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-calculatedfields)
       */
      override fun calculatedFields(): Any? = unwrap(this).getCalculatedFields()

      /**
       * The list of column definitions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-columns)
       */
      override fun columns(): Any? = unwrap(this).getColumns()

      /**
       * The definition of a data aggregation.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-dataaggregation)
       */
      override fun dataAggregation(): Any? = unwrap(this).getDataAggregation()

      /**
       * The Amazon Resource Name (ARN) of the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-datasetarn)
       */
      override fun datasetArn(): String = unwrap(this).getDatasetArn()

      /**
       * The description of the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-datasetdescription)
       */
      override fun datasetDescription(): String? = unwrap(this).getDatasetDescription()

      /**
       * The name of the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-datasetname)
       */
      override fun datasetName(): String? = unwrap(this).getDatasetName()

      /**
       * The list of filter definitions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-filters)
       */
      override fun filters(): Any? = unwrap(this).getFilters()

      /**
       * The list of named entities definitions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-datasetmetadata.html#cfn-quicksight-topic-datasetmetadata-namedentities)
       */
      override fun namedEntities(): Any? = unwrap(this).getNamedEntities()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetMetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty):
          DatasetMetadataProperty = CdkObjectWrappers.wrap(cdkObject) as? DatasetMetadataProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetMetadataProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.DatasetMetadataProperty
    }
  }

  /**
   * A structure that represents a default formatting definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DefaultFormattingProperty defaultFormattingProperty = DefaultFormattingProperty.builder()
   * .displayFormat("displayFormat")
   * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
   * .blankCellFormat("blankCellFormat")
   * .currencySymbol("currencySymbol")
   * .dateFormat("dateFormat")
   * .decimalSeparator("decimalSeparator")
   * .fractionDigits(123)
   * .groupingSeparator("groupingSeparator")
   * .negativeFormat(NegativeFormatProperty.builder()
   * .prefix("prefix")
   * .suffix("suffix")
   * .build())
   * .prefix("prefix")
   * .suffix("suffix")
   * .unitScaler("unitScaler")
   * .useBlankCellFormat(false)
   * .useGrouping(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-defaultformatting.html)
   */
  public interface DefaultFormattingProperty {
    /**
     * The display format.
     *
     * Valid values for this structure are `AUTO` , `PERCENT` , `CURRENCY` , `NUMBER` , `DATE` , and
     * `STRING` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-defaultformatting.html#cfn-quicksight-topic-defaultformatting-displayformat)
     */
    public fun displayFormat(): String? = unwrap(this).getDisplayFormat()

    /**
     * The additional options for display formatting.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-defaultformatting.html#cfn-quicksight-topic-defaultformatting-displayformatoptions)
     */
    public fun displayFormatOptions(): Any? = unwrap(this).getDisplayFormatOptions()

    /**
     * A builder for [DefaultFormattingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param displayFormat The display format.
       * Valid values for this structure are `AUTO` , `PERCENT` , `CURRENCY` , `NUMBER` , `DATE` ,
       * and `STRING` .
       */
      public fun displayFormat(displayFormat: String)

      /**
       * @param displayFormatOptions The additional options for display formatting.
       */
      public fun displayFormatOptions(displayFormatOptions: IResolvable)

      /**
       * @param displayFormatOptions The additional options for display formatting.
       */
      public fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty)

      /**
       * @param displayFormatOptions The additional options for display formatting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b52fc3d054d547b5d44c1c4b356f7a3a8129363d5996867fa4f22ba6626135")
      public
          fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty.builder()

      /**
       * @param displayFormat The display format.
       * Valid values for this structure are `AUTO` , `PERCENT` , `CURRENCY` , `NUMBER` , `DATE` ,
       * and `STRING` .
       */
      override fun displayFormat(displayFormat: String) {
        cdkBuilder.displayFormat(displayFormat)
      }

      /**
       * @param displayFormatOptions The additional options for display formatting.
       */
      override fun displayFormatOptions(displayFormatOptions: IResolvable) {
        cdkBuilder.displayFormatOptions(displayFormatOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param displayFormatOptions The additional options for display formatting.
       */
      override fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty) {
        cdkBuilder.displayFormatOptions(displayFormatOptions.let(DisplayFormatOptionsProperty.Companion::unwrap))
      }

      /**
       * @param displayFormatOptions The additional options for display formatting.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c8b52fc3d054d547b5d44c1c4b356f7a3a8129363d5996867fa4f22ba6626135")
      override
          fun displayFormatOptions(displayFormatOptions: DisplayFormatOptionsProperty.Builder.() -> Unit):
          Unit = displayFormatOptions(DisplayFormatOptionsProperty(displayFormatOptions))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty,
    ) : CdkObject(cdkObject),
        DefaultFormattingProperty {
      /**
       * The display format.
       *
       * Valid values for this structure are `AUTO` , `PERCENT` , `CURRENCY` , `NUMBER` , `DATE` ,
       * and `STRING` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-defaultformatting.html#cfn-quicksight-topic-defaultformatting-displayformat)
       */
      override fun displayFormat(): String? = unwrap(this).getDisplayFormat()

      /**
       * The additional options for display formatting.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-defaultformatting.html#cfn-quicksight-topic-defaultformatting-displayformatoptions)
       */
      override fun displayFormatOptions(): Any? = unwrap(this).getDisplayFormatOptions()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DefaultFormattingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty):
          DefaultFormattingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DefaultFormattingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DefaultFormattingProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.DefaultFormattingProperty
    }
  }

  /**
   * A structure that represents additional options for display formatting.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * DisplayFormatOptionsProperty displayFormatOptionsProperty =
   * DisplayFormatOptionsProperty.builder()
   * .blankCellFormat("blankCellFormat")
   * .currencySymbol("currencySymbol")
   * .dateFormat("dateFormat")
   * .decimalSeparator("decimalSeparator")
   * .fractionDigits(123)
   * .groupingSeparator("groupingSeparator")
   * .negativeFormat(NegativeFormatProperty.builder()
   * .prefix("prefix")
   * .suffix("suffix")
   * .build())
   * .prefix("prefix")
   * .suffix("suffix")
   * .unitScaler("unitScaler")
   * .useBlankCellFormat(false)
   * .useGrouping(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html)
   */
  public interface DisplayFormatOptionsProperty {
    /**
     * Determines the blank cell format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-blankcellformat)
     */
    public fun blankCellFormat(): String? = unwrap(this).getBlankCellFormat()

    /**
     * The currency symbol, such as `USD` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-currencysymbol)
     */
    public fun currencySymbol(): String? = unwrap(this).getCurrencySymbol()

    /**
     * Determines the `DateTime` format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-dateformat)
     */
    public fun dateFormat(): String? = unwrap(this).getDateFormat()

    /**
     * Determines the decimal separator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-decimalseparator)
     */
    public fun decimalSeparator(): String? = unwrap(this).getDecimalSeparator()

    /**
     * Determines the number of fraction digits.
     *
     * Default: - 0
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-fractiondigits)
     */
    public fun fractionDigits(): Number? = unwrap(this).getFractionDigits()

    /**
     * Determines the grouping separator.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-groupingseparator)
     */
    public fun groupingSeparator(): String? = unwrap(this).getGroupingSeparator()

    /**
     * The negative format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-negativeformat)
     */
    public fun negativeFormat(): Any? = unwrap(this).getNegativeFormat()

    /**
     * The prefix value for a display format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The suffix value for a display format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-suffix)
     */
    public fun suffix(): String? = unwrap(this).getSuffix()

    /**
     * The unit scaler.
     *
     * Valid values for this structure are: `NONE` , `AUTO` , `THOUSANDS` , `MILLIONS` , `BILLIONS`
     * , and `TRILLIONS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-unitscaler)
     */
    public fun unitScaler(): String? = unwrap(this).getUnitScaler()

    /**
     * A Boolean value that indicates whether to use blank cell format.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-useblankcellformat)
     */
    public fun useBlankCellFormat(): Any? = unwrap(this).getUseBlankCellFormat()

    /**
     * A Boolean value that indicates whether to use grouping.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-usegrouping)
     */
    public fun useGrouping(): Any? = unwrap(this).getUseGrouping()

    /**
     * A builder for [DisplayFormatOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param blankCellFormat Determines the blank cell format.
       */
      public fun blankCellFormat(blankCellFormat: String)

      /**
       * @param currencySymbol The currency symbol, such as `USD` .
       */
      public fun currencySymbol(currencySymbol: String)

      /**
       * @param dateFormat Determines the `DateTime` format.
       */
      public fun dateFormat(dateFormat: String)

      /**
       * @param decimalSeparator Determines the decimal separator.
       */
      public fun decimalSeparator(decimalSeparator: String)

      /**
       * @param fractionDigits Determines the number of fraction digits.
       */
      public fun fractionDigits(fractionDigits: Number)

      /**
       * @param groupingSeparator Determines the grouping separator.
       */
      public fun groupingSeparator(groupingSeparator: String)

      /**
       * @param negativeFormat The negative format.
       */
      public fun negativeFormat(negativeFormat: IResolvable)

      /**
       * @param negativeFormat The negative format.
       */
      public fun negativeFormat(negativeFormat: NegativeFormatProperty)

      /**
       * @param negativeFormat The negative format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00292db3df80c8de047fc466856a329c98a053e86ede160f3b9863d06eb8e7b5")
      public fun negativeFormat(negativeFormat: NegativeFormatProperty.Builder.() -> Unit)

      /**
       * @param prefix The prefix value for a display format.
       */
      public fun prefix(prefix: String)

      /**
       * @param suffix The suffix value for a display format.
       */
      public fun suffix(suffix: String)

      /**
       * @param unitScaler The unit scaler.
       * Valid values for this structure are: `NONE` , `AUTO` , `THOUSANDS` , `MILLIONS` ,
       * `BILLIONS` , and `TRILLIONS` .
       */
      public fun unitScaler(unitScaler: String)

      /**
       * @param useBlankCellFormat A Boolean value that indicates whether to use blank cell format.
       */
      public fun useBlankCellFormat(useBlankCellFormat: Boolean)

      /**
       * @param useBlankCellFormat A Boolean value that indicates whether to use blank cell format.
       */
      public fun useBlankCellFormat(useBlankCellFormat: IResolvable)

      /**
       * @param useGrouping A Boolean value that indicates whether to use grouping.
       */
      public fun useGrouping(useGrouping: Boolean)

      /**
       * @param useGrouping A Boolean value that indicates whether to use grouping.
       */
      public fun useGrouping(useGrouping: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty.builder()

      /**
       * @param blankCellFormat Determines the blank cell format.
       */
      override fun blankCellFormat(blankCellFormat: String) {
        cdkBuilder.blankCellFormat(blankCellFormat)
      }

      /**
       * @param currencySymbol The currency symbol, such as `USD` .
       */
      override fun currencySymbol(currencySymbol: String) {
        cdkBuilder.currencySymbol(currencySymbol)
      }

      /**
       * @param dateFormat Determines the `DateTime` format.
       */
      override fun dateFormat(dateFormat: String) {
        cdkBuilder.dateFormat(dateFormat)
      }

      /**
       * @param decimalSeparator Determines the decimal separator.
       */
      override fun decimalSeparator(decimalSeparator: String) {
        cdkBuilder.decimalSeparator(decimalSeparator)
      }

      /**
       * @param fractionDigits Determines the number of fraction digits.
       */
      override fun fractionDigits(fractionDigits: Number) {
        cdkBuilder.fractionDigits(fractionDigits)
      }

      /**
       * @param groupingSeparator Determines the grouping separator.
       */
      override fun groupingSeparator(groupingSeparator: String) {
        cdkBuilder.groupingSeparator(groupingSeparator)
      }

      /**
       * @param negativeFormat The negative format.
       */
      override fun negativeFormat(negativeFormat: IResolvable) {
        cdkBuilder.negativeFormat(negativeFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param negativeFormat The negative format.
       */
      override fun negativeFormat(negativeFormat: NegativeFormatProperty) {
        cdkBuilder.negativeFormat(negativeFormat.let(NegativeFormatProperty.Companion::unwrap))
      }

      /**
       * @param negativeFormat The negative format.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00292db3df80c8de047fc466856a329c98a053e86ede160f3b9863d06eb8e7b5")
      override fun negativeFormat(negativeFormat: NegativeFormatProperty.Builder.() -> Unit): Unit =
          negativeFormat(NegativeFormatProperty(negativeFormat))

      /**
       * @param prefix The prefix value for a display format.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param suffix The suffix value for a display format.
       */
      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      /**
       * @param unitScaler The unit scaler.
       * Valid values for this structure are: `NONE` , `AUTO` , `THOUSANDS` , `MILLIONS` ,
       * `BILLIONS` , and `TRILLIONS` .
       */
      override fun unitScaler(unitScaler: String) {
        cdkBuilder.unitScaler(unitScaler)
      }

      /**
       * @param useBlankCellFormat A Boolean value that indicates whether to use blank cell format.
       */
      override fun useBlankCellFormat(useBlankCellFormat: Boolean) {
        cdkBuilder.useBlankCellFormat(useBlankCellFormat)
      }

      /**
       * @param useBlankCellFormat A Boolean value that indicates whether to use blank cell format.
       */
      override fun useBlankCellFormat(useBlankCellFormat: IResolvable) {
        cdkBuilder.useBlankCellFormat(useBlankCellFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param useGrouping A Boolean value that indicates whether to use grouping.
       */
      override fun useGrouping(useGrouping: Boolean) {
        cdkBuilder.useGrouping(useGrouping)
      }

      /**
       * @param useGrouping A Boolean value that indicates whether to use grouping.
       */
      override fun useGrouping(useGrouping: IResolvable) {
        cdkBuilder.useGrouping(useGrouping.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty,
    ) : CdkObject(cdkObject),
        DisplayFormatOptionsProperty {
      /**
       * Determines the blank cell format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-blankcellformat)
       */
      override fun blankCellFormat(): String? = unwrap(this).getBlankCellFormat()

      /**
       * The currency symbol, such as `USD` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-currencysymbol)
       */
      override fun currencySymbol(): String? = unwrap(this).getCurrencySymbol()

      /**
       * Determines the `DateTime` format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-dateformat)
       */
      override fun dateFormat(): String? = unwrap(this).getDateFormat()

      /**
       * Determines the decimal separator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-decimalseparator)
       */
      override fun decimalSeparator(): String? = unwrap(this).getDecimalSeparator()

      /**
       * Determines the number of fraction digits.
       *
       * Default: - 0
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-fractiondigits)
       */
      override fun fractionDigits(): Number? = unwrap(this).getFractionDigits()

      /**
       * Determines the grouping separator.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-groupingseparator)
       */
      override fun groupingSeparator(): String? = unwrap(this).getGroupingSeparator()

      /**
       * The negative format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-negativeformat)
       */
      override fun negativeFormat(): Any? = unwrap(this).getNegativeFormat()

      /**
       * The prefix value for a display format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * The suffix value for a display format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-suffix)
       */
      override fun suffix(): String? = unwrap(this).getSuffix()

      /**
       * The unit scaler.
       *
       * Valid values for this structure are: `NONE` , `AUTO` , `THOUSANDS` , `MILLIONS` ,
       * `BILLIONS` , and `TRILLIONS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-unitscaler)
       */
      override fun unitScaler(): String? = unwrap(this).getUnitScaler()

      /**
       * A Boolean value that indicates whether to use blank cell format.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-useblankcellformat)
       */
      override fun useBlankCellFormat(): Any? = unwrap(this).getUseBlankCellFormat()

      /**
       * A Boolean value that indicates whether to use grouping.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-displayformatoptions.html#cfn-quicksight-topic-displayformatoptions-usegrouping)
       */
      override fun useGrouping(): Any? = unwrap(this).getUseGrouping()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DisplayFormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty):
          DisplayFormatOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DisplayFormatOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DisplayFormatOptionsProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.DisplayFormatOptionsProperty
    }
  }

  /**
   * A structure that represents a metric.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * NamedEntityDefinitionMetricProperty namedEntityDefinitionMetricProperty =
   * NamedEntityDefinitionMetricProperty.builder()
   * .aggregation("aggregation")
   * .aggregationFunctionParameters(Map.of(
   * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinitionmetric.html)
   */
  public interface NamedEntityDefinitionMetricProperty {
    /**
     * The aggregation of a named entity.
     *
     * Valid values for this structure are `SUM` , `MIN` , `MAX` , `COUNT` , `AVERAGE` ,
     * `DISTINCT_COUNT` , `STDEV` , `STDEVP` , `VAR` , `VARP` , `PERCENTILE` , `MEDIAN` , and `CUSTOM`
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinitionmetric.html#cfn-quicksight-topic-namedentitydefinitionmetric-aggregation)
     */
    public fun aggregation(): String? = unwrap(this).getAggregation()

    /**
     * The additional parameters for an aggregation function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinitionmetric.html#cfn-quicksight-topic-namedentitydefinitionmetric-aggregationfunctionparameters)
     */
    public fun aggregationFunctionParameters(): Any? =
        unwrap(this).getAggregationFunctionParameters()

    /**
     * A builder for [NamedEntityDefinitionMetricProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregation The aggregation of a named entity.
       * Valid values for this structure are `SUM` , `MIN` , `MAX` , `COUNT` , `AVERAGE` ,
       * `DISTINCT_COUNT` , `STDEV` , `STDEVP` , `VAR` , `VARP` , `PERCENTILE` , `MEDIAN` , and
       * `CUSTOM` .
       */
      public fun aggregation(aggregation: String)

      /**
       * @param aggregationFunctionParameters The additional parameters for an aggregation function.
       */
      public fun aggregationFunctionParameters(aggregationFunctionParameters: Map<String, String>)

      /**
       * @param aggregationFunctionParameters The additional parameters for an aggregation function.
       */
      public fun aggregationFunctionParameters(aggregationFunctionParameters: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty.builder()

      /**
       * @param aggregation The aggregation of a named entity.
       * Valid values for this structure are `SUM` , `MIN` , `MAX` , `COUNT` , `AVERAGE` ,
       * `DISTINCT_COUNT` , `STDEV` , `STDEVP` , `VAR` , `VARP` , `PERCENTILE` , `MEDIAN` , and
       * `CUSTOM` .
       */
      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      /**
       * @param aggregationFunctionParameters The additional parameters for an aggregation function.
       */
      override
          fun aggregationFunctionParameters(aggregationFunctionParameters: Map<String, String>) {
        cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters)
      }

      /**
       * @param aggregationFunctionParameters The additional parameters for an aggregation function.
       */
      override fun aggregationFunctionParameters(aggregationFunctionParameters: IResolvable) {
        cdkBuilder.aggregationFunctionParameters(aggregationFunctionParameters.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty,
    ) : CdkObject(cdkObject),
        NamedEntityDefinitionMetricProperty {
      /**
       * The aggregation of a named entity.
       *
       * Valid values for this structure are `SUM` , `MIN` , `MAX` , `COUNT` , `AVERAGE` ,
       * `DISTINCT_COUNT` , `STDEV` , `STDEVP` , `VAR` , `VARP` , `PERCENTILE` , `MEDIAN` , and
       * `CUSTOM` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinitionmetric.html#cfn-quicksight-topic-namedentitydefinitionmetric-aggregation)
       */
      override fun aggregation(): String? = unwrap(this).getAggregation()

      /**
       * The additional parameters for an aggregation function.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinitionmetric.html#cfn-quicksight-topic-namedentitydefinitionmetric-aggregationfunctionparameters)
       */
      override fun aggregationFunctionParameters(): Any? =
          unwrap(this).getAggregationFunctionParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          NamedEntityDefinitionMetricProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty):
          NamedEntityDefinitionMetricProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NamedEntityDefinitionMetricProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamedEntityDefinitionMetricProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionMetricProperty
    }
  }

  /**
   * A structure that represents a named entity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * NamedEntityDefinitionProperty namedEntityDefinitionProperty =
   * NamedEntityDefinitionProperty.builder()
   * .fieldName("fieldName")
   * .metric(NamedEntityDefinitionMetricProperty.builder()
   * .aggregation("aggregation")
   * .aggregationFunctionParameters(Map.of(
   * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
   * .build())
   * .propertyName("propertyName")
   * .propertyRole("propertyRole")
   * .propertyUsage("propertyUsage")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html)
   */
  public interface NamedEntityDefinitionProperty {
    /**
     * The name of the entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-fieldname)
     */
    public fun fieldName(): String? = unwrap(this).getFieldName()

    /**
     * The definition of a metric.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-metric)
     */
    public fun metric(): Any? = unwrap(this).getMetric()

    /**
     * The property name to be used for the named entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-propertyname)
     */
    public fun propertyName(): String? = unwrap(this).getPropertyName()

    /**
     * The property role.
     *
     * Valid values for this structure are `PRIMARY` and `ID` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-propertyrole)
     */
    public fun propertyRole(): String? = unwrap(this).getPropertyRole()

    /**
     * The property usage.
     *
     * Valid values for this structure are `INHERIT` , `DIMENSION` , and `MEASURE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-propertyusage)
     */
    public fun propertyUsage(): String? = unwrap(this).getPropertyUsage()

    /**
     * A builder for [NamedEntityDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param fieldName The name of the entity.
       */
      public fun fieldName(fieldName: String)

      /**
       * @param metric The definition of a metric.
       */
      public fun metric(metric: IResolvable)

      /**
       * @param metric The definition of a metric.
       */
      public fun metric(metric: NamedEntityDefinitionMetricProperty)

      /**
       * @param metric The definition of a metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e41b38c93693347a3564c25a7db1caafa2331db88848136186b58a6501d6e8")
      public fun metric(metric: NamedEntityDefinitionMetricProperty.Builder.() -> Unit)

      /**
       * @param propertyName The property name to be used for the named entity.
       */
      public fun propertyName(propertyName: String)

      /**
       * @param propertyRole The property role.
       * Valid values for this structure are `PRIMARY` and `ID` .
       */
      public fun propertyRole(propertyRole: String)

      /**
       * @param propertyUsage The property usage.
       * Valid values for this structure are `INHERIT` , `DIMENSION` , and `MEASURE` .
       */
      public fun propertyUsage(propertyUsage: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty.builder()

      /**
       * @param fieldName The name of the entity.
       */
      override fun fieldName(fieldName: String) {
        cdkBuilder.fieldName(fieldName)
      }

      /**
       * @param metric The definition of a metric.
       */
      override fun metric(metric: IResolvable) {
        cdkBuilder.metric(metric.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metric The definition of a metric.
       */
      override fun metric(metric: NamedEntityDefinitionMetricProperty) {
        cdkBuilder.metric(metric.let(NamedEntityDefinitionMetricProperty.Companion::unwrap))
      }

      /**
       * @param metric The definition of a metric.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6e41b38c93693347a3564c25a7db1caafa2331db88848136186b58a6501d6e8")
      override fun metric(metric: NamedEntityDefinitionMetricProperty.Builder.() -> Unit): Unit =
          metric(NamedEntityDefinitionMetricProperty(metric))

      /**
       * @param propertyName The property name to be used for the named entity.
       */
      override fun propertyName(propertyName: String) {
        cdkBuilder.propertyName(propertyName)
      }

      /**
       * @param propertyRole The property role.
       * Valid values for this structure are `PRIMARY` and `ID` .
       */
      override fun propertyRole(propertyRole: String) {
        cdkBuilder.propertyRole(propertyRole)
      }

      /**
       * @param propertyUsage The property usage.
       * Valid values for this structure are `INHERIT` , `DIMENSION` , and `MEASURE` .
       */
      override fun propertyUsage(propertyUsage: String) {
        cdkBuilder.propertyUsage(propertyUsage)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty,
    ) : CdkObject(cdkObject),
        NamedEntityDefinitionProperty {
      /**
       * The name of the entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-fieldname)
       */
      override fun fieldName(): String? = unwrap(this).getFieldName()

      /**
       * The definition of a metric.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-metric)
       */
      override fun metric(): Any? = unwrap(this).getMetric()

      /**
       * The property name to be used for the named entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-propertyname)
       */
      override fun propertyName(): String? = unwrap(this).getPropertyName()

      /**
       * The property role.
       *
       * Valid values for this structure are `PRIMARY` and `ID` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-propertyrole)
       */
      override fun propertyRole(): String? = unwrap(this).getPropertyRole()

      /**
       * The property usage.
       *
       * Valid values for this structure are `INHERIT` , `DIMENSION` , and `MEASURE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-namedentitydefinition.html#cfn-quicksight-topic-namedentitydefinition-propertyusage)
       */
      override fun propertyUsage(): String? = unwrap(this).getPropertyUsage()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NamedEntityDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty):
          NamedEntityDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          NamedEntityDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: NamedEntityDefinitionProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.NamedEntityDefinitionProperty
    }
  }

  /**
   * A structure that represents a negative format.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * NegativeFormatProperty negativeFormatProperty = NegativeFormatProperty.builder()
   * .prefix("prefix")
   * .suffix("suffix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-negativeformat.html)
   */
  public interface NegativeFormatProperty {
    /**
     * The prefix for a negative format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-negativeformat.html#cfn-quicksight-topic-negativeformat-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * The suffix for a negative format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-negativeformat.html#cfn-quicksight-topic-negativeformat-suffix)
     */
    public fun suffix(): String? = unwrap(this).getSuffix()

    /**
     * A builder for [NegativeFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param prefix The prefix for a negative format.
       */
      public fun prefix(prefix: String)

      /**
       * @param suffix The suffix for a negative format.
       */
      public fun suffix(suffix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty.builder()

      /**
       * @param prefix The prefix for a negative format.
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param suffix The suffix for a negative format.
       */
      override fun suffix(suffix: String) {
        cdkBuilder.suffix(suffix)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty,
    ) : CdkObject(cdkObject),
        NegativeFormatProperty {
      /**
       * The prefix for a negative format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-negativeformat.html#cfn-quicksight-topic-negativeformat-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * The suffix for a negative format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-negativeformat.html#cfn-quicksight-topic-negativeformat-suffix)
       */
      override fun suffix(): String? = unwrap(this).getSuffix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): NegativeFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty):
          NegativeFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? NegativeFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: NegativeFormatProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.NegativeFormatProperty
    }
  }

  /**
   * The value of the constant that is used to specify the endpoints of a range filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * RangeConstantProperty rangeConstantProperty = RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-rangeconstant.html)
   */
  public interface RangeConstantProperty {
    /**
     * The maximum value for a range constant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-rangeconstant.html#cfn-quicksight-topic-rangeconstant-maximum)
     */
    public fun maximum(): String? = unwrap(this).getMaximum()

    /**
     * The minimum value for a range constant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-rangeconstant.html#cfn-quicksight-topic-rangeconstant-minimum)
     */
    public fun minimum(): String? = unwrap(this).getMinimum()

    /**
     * A builder for [RangeConstantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maximum The maximum value for a range constant.
       */
      public fun maximum(maximum: String)

      /**
       * @param minimum The minimum value for a range constant.
       */
      public fun minimum(minimum: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty.builder()

      /**
       * @param maximum The maximum value for a range constant.
       */
      override fun maximum(maximum: String) {
        cdkBuilder.maximum(maximum)
      }

      /**
       * @param minimum The minimum value for a range constant.
       */
      override fun minimum(minimum: String) {
        cdkBuilder.minimum(minimum)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty,
    ) : CdkObject(cdkObject),
        RangeConstantProperty {
      /**
       * The maximum value for a range constant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-rangeconstant.html#cfn-quicksight-topic-rangeconstant-maximum)
       */
      override fun maximum(): String? = unwrap(this).getMaximum()

      /**
       * The minimum value for a range constant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-rangeconstant.html#cfn-quicksight-topic-rangeconstant-minimum)
       */
      override fun minimum(): String? = unwrap(this).getMinimum()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RangeConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty):
          RangeConstantProperty = CdkObjectWrappers.wrap(cdkObject) as? RangeConstantProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RangeConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.RangeConstantProperty
    }
  }

  /**
   * A structure that represents a semantic entity type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * SemanticEntityTypeProperty semanticEntityTypeProperty = SemanticEntityTypeProperty.builder()
   * .subTypeName("subTypeName")
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html)
   */
  public interface SemanticEntityTypeProperty {
    /**
     * The semantic entity sub type name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html#cfn-quicksight-topic-semanticentitytype-subtypename)
     */
    public fun subTypeName(): String? = unwrap(this).getSubTypeName()

    /**
     * The semantic entity type name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html#cfn-quicksight-topic-semanticentitytype-typename)
     */
    public fun typeName(): String? = unwrap(this).getTypeName()

    /**
     * The semantic entity type parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html#cfn-quicksight-topic-semanticentitytype-typeparameters)
     */
    public fun typeParameters(): Any? = unwrap(this).getTypeParameters()

    /**
     * A builder for [SemanticEntityTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param subTypeName The semantic entity sub type name.
       */
      public fun subTypeName(subTypeName: String)

      /**
       * @param typeName The semantic entity type name.
       */
      public fun typeName(typeName: String)

      /**
       * @param typeParameters The semantic entity type parameters.
       */
      public fun typeParameters(typeParameters: Map<String, String>)

      /**
       * @param typeParameters The semantic entity type parameters.
       */
      public fun typeParameters(typeParameters: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty.builder()

      /**
       * @param subTypeName The semantic entity sub type name.
       */
      override fun subTypeName(subTypeName: String) {
        cdkBuilder.subTypeName(subTypeName)
      }

      /**
       * @param typeName The semantic entity type name.
       */
      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      /**
       * @param typeParameters The semantic entity type parameters.
       */
      override fun typeParameters(typeParameters: Map<String, String>) {
        cdkBuilder.typeParameters(typeParameters)
      }

      /**
       * @param typeParameters The semantic entity type parameters.
       */
      override fun typeParameters(typeParameters: IResolvable) {
        cdkBuilder.typeParameters(typeParameters.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty,
    ) : CdkObject(cdkObject),
        SemanticEntityTypeProperty {
      /**
       * The semantic entity sub type name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html#cfn-quicksight-topic-semanticentitytype-subtypename)
       */
      override fun subTypeName(): String? = unwrap(this).getSubTypeName()

      /**
       * The semantic entity type name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html#cfn-quicksight-topic-semanticentitytype-typename)
       */
      override fun typeName(): String? = unwrap(this).getTypeName()

      /**
       * The semantic entity type parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semanticentitytype.html#cfn-quicksight-topic-semanticentitytype-typeparameters)
       */
      override fun typeParameters(): Any? = unwrap(this).getTypeParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SemanticEntityTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty):
          SemanticEntityTypeProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SemanticEntityTypeProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SemanticEntityTypeProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticEntityTypeProperty
    }
  }

  /**
   * A structure that represents a semantic type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * SemanticTypeProperty semanticTypeProperty = SemanticTypeProperty.builder()
   * .falseyCellValue("falseyCellValue")
   * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
   * .subTypeName("subTypeName")
   * .truthyCellValue("truthyCellValue")
   * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html)
   */
  public interface SemanticTypeProperty {
    /**
     * The semantic type falsey cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-falseycellvalue)
     */
    public fun falseyCellValue(): String? = unwrap(this).getFalseyCellValue()

    /**
     * The other names or aliases for the false cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-falseycellvaluesynonyms)
     */
    public fun falseyCellValueSynonyms(): List<String> = unwrap(this).getFalseyCellValueSynonyms()
        ?: emptyList()

    /**
     * The semantic type sub type name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-subtypename)
     */
    public fun subTypeName(): String? = unwrap(this).getSubTypeName()

    /**
     * The semantic type truthy cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-truthycellvalue)
     */
    public fun truthyCellValue(): String? = unwrap(this).getTruthyCellValue()

    /**
     * The other names or aliases for the true cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-truthycellvaluesynonyms)
     */
    public fun truthyCellValueSynonyms(): List<String> = unwrap(this).getTruthyCellValueSynonyms()
        ?: emptyList()

    /**
     * The semantic type name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-typename)
     */
    public fun typeName(): String? = unwrap(this).getTypeName()

    /**
     * The semantic type parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-typeparameters)
     */
    public fun typeParameters(): Any? = unwrap(this).getTypeParameters()

    /**
     * A builder for [SemanticTypeProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param falseyCellValue The semantic type falsey cell value.
       */
      public fun falseyCellValue(falseyCellValue: String)

      /**
       * @param falseyCellValueSynonyms The other names or aliases for the false cell value.
       */
      public fun falseyCellValueSynonyms(falseyCellValueSynonyms: List<String>)

      /**
       * @param falseyCellValueSynonyms The other names or aliases for the false cell value.
       */
      public fun falseyCellValueSynonyms(vararg falseyCellValueSynonyms: String)

      /**
       * @param subTypeName The semantic type sub type name.
       */
      public fun subTypeName(subTypeName: String)

      /**
       * @param truthyCellValue The semantic type truthy cell value.
       */
      public fun truthyCellValue(truthyCellValue: String)

      /**
       * @param truthyCellValueSynonyms The other names or aliases for the true cell value.
       */
      public fun truthyCellValueSynonyms(truthyCellValueSynonyms: List<String>)

      /**
       * @param truthyCellValueSynonyms The other names or aliases for the true cell value.
       */
      public fun truthyCellValueSynonyms(vararg truthyCellValueSynonyms: String)

      /**
       * @param typeName The semantic type name.
       */
      public fun typeName(typeName: String)

      /**
       * @param typeParameters The semantic type parameters.
       */
      public fun typeParameters(typeParameters: Map<String, String>)

      /**
       * @param typeParameters The semantic type parameters.
       */
      public fun typeParameters(typeParameters: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty.builder()

      /**
       * @param falseyCellValue The semantic type falsey cell value.
       */
      override fun falseyCellValue(falseyCellValue: String) {
        cdkBuilder.falseyCellValue(falseyCellValue)
      }

      /**
       * @param falseyCellValueSynonyms The other names or aliases for the false cell value.
       */
      override fun falseyCellValueSynonyms(falseyCellValueSynonyms: List<String>) {
        cdkBuilder.falseyCellValueSynonyms(falseyCellValueSynonyms)
      }

      /**
       * @param falseyCellValueSynonyms The other names or aliases for the false cell value.
       */
      override fun falseyCellValueSynonyms(vararg falseyCellValueSynonyms: String): Unit =
          falseyCellValueSynonyms(falseyCellValueSynonyms.toList())

      /**
       * @param subTypeName The semantic type sub type name.
       */
      override fun subTypeName(subTypeName: String) {
        cdkBuilder.subTypeName(subTypeName)
      }

      /**
       * @param truthyCellValue The semantic type truthy cell value.
       */
      override fun truthyCellValue(truthyCellValue: String) {
        cdkBuilder.truthyCellValue(truthyCellValue)
      }

      /**
       * @param truthyCellValueSynonyms The other names or aliases for the true cell value.
       */
      override fun truthyCellValueSynonyms(truthyCellValueSynonyms: List<String>) {
        cdkBuilder.truthyCellValueSynonyms(truthyCellValueSynonyms)
      }

      /**
       * @param truthyCellValueSynonyms The other names or aliases for the true cell value.
       */
      override fun truthyCellValueSynonyms(vararg truthyCellValueSynonyms: String): Unit =
          truthyCellValueSynonyms(truthyCellValueSynonyms.toList())

      /**
       * @param typeName The semantic type name.
       */
      override fun typeName(typeName: String) {
        cdkBuilder.typeName(typeName)
      }

      /**
       * @param typeParameters The semantic type parameters.
       */
      override fun typeParameters(typeParameters: Map<String, String>) {
        cdkBuilder.typeParameters(typeParameters)
      }

      /**
       * @param typeParameters The semantic type parameters.
       */
      override fun typeParameters(typeParameters: IResolvable) {
        cdkBuilder.typeParameters(typeParameters.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty,
    ) : CdkObject(cdkObject),
        SemanticTypeProperty {
      /**
       * The semantic type falsey cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-falseycellvalue)
       */
      override fun falseyCellValue(): String? = unwrap(this).getFalseyCellValue()

      /**
       * The other names or aliases for the false cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-falseycellvaluesynonyms)
       */
      override fun falseyCellValueSynonyms(): List<String> =
          unwrap(this).getFalseyCellValueSynonyms() ?: emptyList()

      /**
       * The semantic type sub type name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-subtypename)
       */
      override fun subTypeName(): String? = unwrap(this).getSubTypeName()

      /**
       * The semantic type truthy cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-truthycellvalue)
       */
      override fun truthyCellValue(): String? = unwrap(this).getTruthyCellValue()

      /**
       * The other names or aliases for the true cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-truthycellvaluesynonyms)
       */
      override fun truthyCellValueSynonyms(): List<String> =
          unwrap(this).getTruthyCellValueSynonyms() ?: emptyList()

      /**
       * The semantic type name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-typename)
       */
      override fun typeName(): String? = unwrap(this).getTypeName()

      /**
       * The semantic type parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-semantictype.html#cfn-quicksight-topic-semantictype-typeparameters)
       */
      override fun typeParameters(): Any? = unwrap(this).getTypeParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SemanticTypeProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty):
          SemanticTypeProperty = CdkObjectWrappers.wrap(cdkObject) as? SemanticTypeProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SemanticTypeProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.SemanticTypeProperty
    }
  }

  /**
   * A structure that represents a calculated field.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicCalculatedFieldProperty topicCalculatedFieldProperty =
   * TopicCalculatedFieldProperty.builder()
   * .calculatedFieldName("calculatedFieldName")
   * .expression("expression")
   * // the properties below are optional
   * .aggregation("aggregation")
   * .allowedAggregations(List.of("allowedAggregations"))
   * .calculatedFieldDescription("calculatedFieldDescription")
   * .calculatedFieldSynonyms(List.of("calculatedFieldSynonyms"))
   * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
   * .cellValue("cellValue")
   * .synonyms(List.of("synonyms"))
   * .build()))
   * .columnDataRole("columnDataRole")
   * .comparativeOrder(ComparativeOrderProperty.builder()
   * .specifedOrder(List.of("specifedOrder"))
   * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
   * .useOrdering("useOrdering")
   * .build())
   * .defaultFormatting(DefaultFormattingProperty.builder()
   * .displayFormat("displayFormat")
   * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
   * .blankCellFormat("blankCellFormat")
   * .currencySymbol("currencySymbol")
   * .dateFormat("dateFormat")
   * .decimalSeparator("decimalSeparator")
   * .fractionDigits(123)
   * .groupingSeparator("groupingSeparator")
   * .negativeFormat(NegativeFormatProperty.builder()
   * .prefix("prefix")
   * .suffix("suffix")
   * .build())
   * .prefix("prefix")
   * .suffix("suffix")
   * .unitScaler("unitScaler")
   * .useBlankCellFormat(false)
   * .useGrouping(false)
   * .build())
   * .build())
   * .disableIndexing(false)
   * .isIncludedInTopic(false)
   * .neverAggregateInFilter(false)
   * .nonAdditive(false)
   * .notAllowedAggregations(List.of("notAllowedAggregations"))
   * .semanticType(SemanticTypeProperty.builder()
   * .falseyCellValue("falseyCellValue")
   * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
   * .subTypeName("subTypeName")
   * .truthyCellValue("truthyCellValue")
   * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build())
   * .timeGranularity("timeGranularity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html)
   */
  public interface TopicCalculatedFieldProperty {
    /**
     * The default aggregation.
     *
     * Valid values for this structure are `SUM` , `MAX` , `MIN` , `COUNT` , `DISTINCT_COUNT` , and
     * `AVERAGE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-aggregation)
     */
    public fun aggregation(): String? = unwrap(this).getAggregation()

    /**
     * The list of aggregation types that are allowed for the calculated field.
     *
     * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
     * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-allowedaggregations)
     */
    public fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
        emptyList()

    /**
     * The calculated field description.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-calculatedfielddescription)
     */
    public fun calculatedFieldDescription(): String? = unwrap(this).getCalculatedFieldDescription()

    /**
     * The calculated field name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-calculatedfieldname)
     */
    public fun calculatedFieldName(): String

    /**
     * The other names or aliases for the calculated field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-calculatedfieldsynonyms)
     */
    public fun calculatedFieldSynonyms(): List<String> = unwrap(this).getCalculatedFieldSynonyms()
        ?: emptyList()

    /**
     * The other names or aliases for the calculated field cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-cellvaluesynonyms)
     */
    public fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

    /**
     * The column data role for a calculated field.
     *
     * Valid values for this structure are `DIMENSION` and `MEASURE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-columndatarole)
     */
    public fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

    /**
     * The order in which data is displayed for the calculated field when it's used in a comparative
     * context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-comparativeorder)
     */
    public fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

    /**
     * The default formatting definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-defaultformatting)
     */
    public fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

    /**
     * A Boolean value that indicates if a calculated field is visible in the autocomplete.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-disableindexing)
     */
    public fun disableIndexing(): Any? = unwrap(this).getDisableIndexing()

    /**
     * The calculated field expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-expression)
     */
    public fun expression(): String

    /**
     * A boolean value that indicates if a calculated field is included in the topic.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-isincludedintopic)
     */
    public fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

    /**
     * A Boolean value that indicates whether to never aggregate calculated field in filters.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-neveraggregateinfilter)
     */
    public fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

    /**
     * The non additive for the table style target.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-nonadditive)
     */
    public fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

    /**
     * The list of aggregation types that are not allowed for the calculated field.
     *
     * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
     * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-notallowedaggregations)
     */
    public fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations() ?:
        emptyList()

    /**
     * The semantic type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-semantictype)
     */
    public fun semanticType(): Any? = unwrap(this).getSemanticType()

    /**
     * The level of time precision that is used to aggregate `DateTime` values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-timegranularity)
     */
    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    /**
     * A builder for [TopicCalculatedFieldProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregation The default aggregation.
       * Valid values for this structure are `SUM` , `MAX` , `MIN` , `COUNT` , `DISTINCT_COUNT` ,
       * and `AVERAGE` .
       */
      public fun aggregation(aggregation: String)

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun allowedAggregations(allowedAggregations: List<String>)

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun allowedAggregations(vararg allowedAggregations: String)

      /**
       * @param calculatedFieldDescription The calculated field description.
       */
      public fun calculatedFieldDescription(calculatedFieldDescription: String)

      /**
       * @param calculatedFieldName The calculated field name. 
       */
      public fun calculatedFieldName(calculatedFieldName: String)

      /**
       * @param calculatedFieldSynonyms The other names or aliases for the calculated field.
       */
      public fun calculatedFieldSynonyms(calculatedFieldSynonyms: List<String>)

      /**
       * @param calculatedFieldSynonyms The other names or aliases for the calculated field.
       */
      public fun calculatedFieldSynonyms(vararg calculatedFieldSynonyms: String)

      /**
       * @param cellValueSynonyms The other names or aliases for the calculated field cell value.
       */
      public fun cellValueSynonyms(cellValueSynonyms: IResolvable)

      /**
       * @param cellValueSynonyms The other names or aliases for the calculated field cell value.
       */
      public fun cellValueSynonyms(cellValueSynonyms: List<Any>)

      /**
       * @param cellValueSynonyms The other names or aliases for the calculated field cell value.
       */
      public fun cellValueSynonyms(vararg cellValueSynonyms: Any)

      /**
       * @param columnDataRole The column data role for a calculated field.
       * Valid values for this structure are `DIMENSION` and `MEASURE` .
       */
      public fun columnDataRole(columnDataRole: String)

      /**
       * @param comparativeOrder The order in which data is displayed for the calculated field when
       * it's used in a comparative context.
       */
      public fun comparativeOrder(comparativeOrder: IResolvable)

      /**
       * @param comparativeOrder The order in which data is displayed for the calculated field when
       * it's used in a comparative context.
       */
      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty)

      /**
       * @param comparativeOrder The order in which data is displayed for the calculated field when
       * it's used in a comparative context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7752dc72d1d7a3072515b81d9cff60d54909413989b678a310b1f03038eb8cf2")
      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit)

      /**
       * @param defaultFormatting The default formatting definition.
       */
      public fun defaultFormatting(defaultFormatting: IResolvable)

      /**
       * @param defaultFormatting The default formatting definition.
       */
      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty)

      /**
       * @param defaultFormatting The default formatting definition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02c51762a3b14223e555dd61f5427568c1ce1d75f597e379476840dd4503d4db")
      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit)

      /**
       * @param disableIndexing A Boolean value that indicates if a calculated field is visible in
       * the autocomplete.
       */
      public fun disableIndexing(disableIndexing: Boolean)

      /**
       * @param disableIndexing A Boolean value that indicates if a calculated field is visible in
       * the autocomplete.
       */
      public fun disableIndexing(disableIndexing: IResolvable)

      /**
       * @param expression The calculated field expression. 
       */
      public fun expression(expression: String)

      /**
       * @param isIncludedInTopic A boolean value that indicates if a calculated field is included
       * in the topic.
       */
      public fun isIncludedInTopic(isIncludedInTopic: Boolean)

      /**
       * @param isIncludedInTopic A boolean value that indicates if a calculated field is included
       * in the topic.
       */
      public fun isIncludedInTopic(isIncludedInTopic: IResolvable)

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to never aggregate
       * calculated field in filters.
       */
      public fun neverAggregateInFilter(neverAggregateInFilter: Boolean)

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to never aggregate
       * calculated field in filters.
       */
      public fun neverAggregateInFilter(neverAggregateInFilter: IResolvable)

      /**
       * @param nonAdditive The non additive for the table style target.
       */
      public fun nonAdditive(nonAdditive: Boolean)

      /**
       * @param nonAdditive The non additive for the table style target.
       */
      public fun nonAdditive(nonAdditive: IResolvable)

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun notAllowedAggregations(notAllowedAggregations: List<String>)

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun notAllowedAggregations(vararg notAllowedAggregations: String)

      /**
       * @param semanticType The semantic type.
       */
      public fun semanticType(semanticType: IResolvable)

      /**
       * @param semanticType The semantic type.
       */
      public fun semanticType(semanticType: SemanticTypeProperty)

      /**
       * @param semanticType The semantic type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84dbc251380b8dd16489510407730e1338f48c69105772b32cbf064776c34557")
      public fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit)

      /**
       * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
       * values.
       */
      public fun timeGranularity(timeGranularity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty.builder()

      /**
       * @param aggregation The default aggregation.
       * Valid values for this structure are `SUM` , `MAX` , `MIN` , `COUNT` , `DISTINCT_COUNT` ,
       * and `AVERAGE` .
       */
      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun allowedAggregations(allowedAggregations: List<String>) {
        cdkBuilder.allowedAggregations(allowedAggregations)
      }

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun allowedAggregations(vararg allowedAggregations: String): Unit =
          allowedAggregations(allowedAggregations.toList())

      /**
       * @param calculatedFieldDescription The calculated field description.
       */
      override fun calculatedFieldDescription(calculatedFieldDescription: String) {
        cdkBuilder.calculatedFieldDescription(calculatedFieldDescription)
      }

      /**
       * @param calculatedFieldName The calculated field name. 
       */
      override fun calculatedFieldName(calculatedFieldName: String) {
        cdkBuilder.calculatedFieldName(calculatedFieldName)
      }

      /**
       * @param calculatedFieldSynonyms The other names or aliases for the calculated field.
       */
      override fun calculatedFieldSynonyms(calculatedFieldSynonyms: List<String>) {
        cdkBuilder.calculatedFieldSynonyms(calculatedFieldSynonyms)
      }

      /**
       * @param calculatedFieldSynonyms The other names or aliases for the calculated field.
       */
      override fun calculatedFieldSynonyms(vararg calculatedFieldSynonyms: String): Unit =
          calculatedFieldSynonyms(calculatedFieldSynonyms.toList())

      /**
       * @param cellValueSynonyms The other names or aliases for the calculated field cell value.
       */
      override fun cellValueSynonyms(cellValueSynonyms: IResolvable) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cellValueSynonyms The other names or aliases for the calculated field cell value.
       */
      override fun cellValueSynonyms(cellValueSynonyms: List<Any>) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param cellValueSynonyms The other names or aliases for the calculated field cell value.
       */
      override fun cellValueSynonyms(vararg cellValueSynonyms: Any): Unit =
          cellValueSynonyms(cellValueSynonyms.toList())

      /**
       * @param columnDataRole The column data role for a calculated field.
       * Valid values for this structure are `DIMENSION` and `MEASURE` .
       */
      override fun columnDataRole(columnDataRole: String) {
        cdkBuilder.columnDataRole(columnDataRole)
      }

      /**
       * @param comparativeOrder The order in which data is displayed for the calculated field when
       * it's used in a comparative context.
       */
      override fun comparativeOrder(comparativeOrder: IResolvable) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param comparativeOrder The order in which data is displayed for the calculated field when
       * it's used in a comparative context.
       */
      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(ComparativeOrderProperty.Companion::unwrap))
      }

      /**
       * @param comparativeOrder The order in which data is displayed for the calculated field when
       * it's used in a comparative context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7752dc72d1d7a3072515b81d9cff60d54909413989b678a310b1f03038eb8cf2")
      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit):
          Unit = comparativeOrder(ComparativeOrderProperty(comparativeOrder))

      /**
       * @param defaultFormatting The default formatting definition.
       */
      override fun defaultFormatting(defaultFormatting: IResolvable) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultFormatting The default formatting definition.
       */
      override fun defaultFormatting(defaultFormatting: DefaultFormattingProperty) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(DefaultFormattingProperty.Companion::unwrap))
      }

      /**
       * @param defaultFormatting The default formatting definition.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("02c51762a3b14223e555dd61f5427568c1ce1d75f597e379476840dd4503d4db")
      override
          fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit):
          Unit = defaultFormatting(DefaultFormattingProperty(defaultFormatting))

      /**
       * @param disableIndexing A Boolean value that indicates if a calculated field is visible in
       * the autocomplete.
       */
      override fun disableIndexing(disableIndexing: Boolean) {
        cdkBuilder.disableIndexing(disableIndexing)
      }

      /**
       * @param disableIndexing A Boolean value that indicates if a calculated field is visible in
       * the autocomplete.
       */
      override fun disableIndexing(disableIndexing: IResolvable) {
        cdkBuilder.disableIndexing(disableIndexing.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param expression The calculated field expression. 
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param isIncludedInTopic A boolean value that indicates if a calculated field is included
       * in the topic.
       */
      override fun isIncludedInTopic(isIncludedInTopic: Boolean) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
      }

      /**
       * @param isIncludedInTopic A boolean value that indicates if a calculated field is included
       * in the topic.
       */
      override fun isIncludedInTopic(isIncludedInTopic: IResolvable) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to never aggregate
       * calculated field in filters.
       */
      override fun neverAggregateInFilter(neverAggregateInFilter: Boolean) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
      }

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to never aggregate
       * calculated field in filters.
       */
      override fun neverAggregateInFilter(neverAggregateInFilter: IResolvable) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nonAdditive The non additive for the table style target.
       */
      override fun nonAdditive(nonAdditive: Boolean) {
        cdkBuilder.nonAdditive(nonAdditive)
      }

      /**
       * @param nonAdditive The non additive for the table style target.
       */
      override fun nonAdditive(nonAdditive: IResolvable) {
        cdkBuilder.nonAdditive(nonAdditive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun notAllowedAggregations(notAllowedAggregations: List<String>) {
        cdkBuilder.notAllowedAggregations(notAllowedAggregations)
      }

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * calculated field.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun notAllowedAggregations(vararg notAllowedAggregations: String): Unit =
          notAllowedAggregations(notAllowedAggregations.toList())

      /**
       * @param semanticType The semantic type.
       */
      override fun semanticType(semanticType: IResolvable) {
        cdkBuilder.semanticType(semanticType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param semanticType The semantic type.
       */
      override fun semanticType(semanticType: SemanticTypeProperty) {
        cdkBuilder.semanticType(semanticType.let(SemanticTypeProperty.Companion::unwrap))
      }

      /**
       * @param semanticType The semantic type.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("84dbc251380b8dd16489510407730e1338f48c69105772b32cbf064776c34557")
      override fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit): Unit =
          semanticType(SemanticTypeProperty(semanticType))

      /**
       * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
       * values.
       */
      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty,
    ) : CdkObject(cdkObject),
        TopicCalculatedFieldProperty {
      /**
       * The default aggregation.
       *
       * Valid values for this structure are `SUM` , `MAX` , `MIN` , `COUNT` , `DISTINCT_COUNT` ,
       * and `AVERAGE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-aggregation)
       */
      override fun aggregation(): String? = unwrap(this).getAggregation()

      /**
       * The list of aggregation types that are allowed for the calculated field.
       *
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-allowedaggregations)
       */
      override fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
          emptyList()

      /**
       * The calculated field description.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-calculatedfielddescription)
       */
      override fun calculatedFieldDescription(): String? =
          unwrap(this).getCalculatedFieldDescription()

      /**
       * The calculated field name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-calculatedfieldname)
       */
      override fun calculatedFieldName(): String = unwrap(this).getCalculatedFieldName()

      /**
       * The other names or aliases for the calculated field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-calculatedfieldsynonyms)
       */
      override fun calculatedFieldSynonyms(): List<String> =
          unwrap(this).getCalculatedFieldSynonyms() ?: emptyList()

      /**
       * The other names or aliases for the calculated field cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-cellvaluesynonyms)
       */
      override fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

      /**
       * The column data role for a calculated field.
       *
       * Valid values for this structure are `DIMENSION` and `MEASURE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-columndatarole)
       */
      override fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

      /**
       * The order in which data is displayed for the calculated field when it's used in a
       * comparative context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-comparativeorder)
       */
      override fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

      /**
       * The default formatting definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-defaultformatting)
       */
      override fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

      /**
       * A Boolean value that indicates if a calculated field is visible in the autocomplete.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-disableindexing)
       */
      override fun disableIndexing(): Any? = unwrap(this).getDisableIndexing()

      /**
       * The calculated field expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * A boolean value that indicates if a calculated field is included in the topic.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-isincludedintopic)
       */
      override fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

      /**
       * A Boolean value that indicates whether to never aggregate calculated field in filters.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-neveraggregateinfilter)
       */
      override fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

      /**
       * The non additive for the table style target.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-nonadditive)
       */
      override fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

      /**
       * The list of aggregation types that are not allowed for the calculated field.
       *
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-notallowedaggregations)
       */
      override fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations()
          ?: emptyList()

      /**
       * The semantic type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-semantictype)
       */
      override fun semanticType(): Any? = unwrap(this).getSemanticType()

      /**
       * The level of time precision that is used to aggregate `DateTime` values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccalculatedfield.html#cfn-quicksight-topic-topiccalculatedfield-timegranularity)
       */
      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicCalculatedFieldProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty):
          TopicCalculatedFieldProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicCalculatedFieldProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicCalculatedFieldProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCalculatedFieldProperty
    }
  }

  /**
   * A constant used in a category filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicCategoryFilterConstantProperty topicCategoryFilterConstantProperty =
   * TopicCategoryFilterConstantProperty.builder()
   * .collectiveConstant(CollectiveConstantProperty.builder()
   * .valueList(List.of("valueList"))
   * .build())
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html)
   */
  public interface TopicCategoryFilterConstantProperty {
    /**
     * A collective constant used in a category filter.
     *
     * This element is used to specify a list of values for the constant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html#cfn-quicksight-topic-topiccategoryfilterconstant-collectiveconstant)
     */
    public fun collectiveConstant(): Any? = unwrap(this).getCollectiveConstant()

    /**
     * The type of category filter constant.
     *
     * This element is used to specify whether a constant is a singular or collective. Valid values
     * are `SINGULAR` and `COLLECTIVE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html#cfn-quicksight-topic-topiccategoryfilterconstant-constanttype)
     */
    public fun constantType(): String? = unwrap(this).getConstantType()

    /**
     * A singular constant used in a category filter.
     *
     * This element is used to specify a single value for the constant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html#cfn-quicksight-topic-topiccategoryfilterconstant-singularconstant)
     */
    public fun singularConstant(): String? = unwrap(this).getSingularConstant()

    /**
     * A builder for [TopicCategoryFilterConstantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param collectiveConstant A collective constant used in a category filter.
       * This element is used to specify a list of values for the constant.
       */
      public fun collectiveConstant(collectiveConstant: IResolvable)

      /**
       * @param collectiveConstant A collective constant used in a category filter.
       * This element is used to specify a list of values for the constant.
       */
      public fun collectiveConstant(collectiveConstant: CollectiveConstantProperty)

      /**
       * @param collectiveConstant A collective constant used in a category filter.
       * This element is used to specify a list of values for the constant.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f35ebbc647c37c743bf329340e1847a28b170a9519ef88c42ece316db9e896b")
      public
          fun collectiveConstant(collectiveConstant: CollectiveConstantProperty.Builder.() -> Unit)

      /**
       * @param constantType The type of category filter constant.
       * This element is used to specify whether a constant is a singular or collective. Valid
       * values are `SINGULAR` and `COLLECTIVE` .
       */
      public fun constantType(constantType: String)

      /**
       * @param singularConstant A singular constant used in a category filter.
       * This element is used to specify a single value for the constant.
       */
      public fun singularConstant(singularConstant: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty.builder()

      /**
       * @param collectiveConstant A collective constant used in a category filter.
       * This element is used to specify a list of values for the constant.
       */
      override fun collectiveConstant(collectiveConstant: IResolvable) {
        cdkBuilder.collectiveConstant(collectiveConstant.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param collectiveConstant A collective constant used in a category filter.
       * This element is used to specify a list of values for the constant.
       */
      override fun collectiveConstant(collectiveConstant: CollectiveConstantProperty) {
        cdkBuilder.collectiveConstant(collectiveConstant.let(CollectiveConstantProperty.Companion::unwrap))
      }

      /**
       * @param collectiveConstant A collective constant used in a category filter.
       * This element is used to specify a list of values for the constant.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8f35ebbc647c37c743bf329340e1847a28b170a9519ef88c42ece316db9e896b")
      override
          fun collectiveConstant(collectiveConstant: CollectiveConstantProperty.Builder.() -> Unit):
          Unit = collectiveConstant(CollectiveConstantProperty(collectiveConstant))

      /**
       * @param constantType The type of category filter constant.
       * This element is used to specify whether a constant is a singular or collective. Valid
       * values are `SINGULAR` and `COLLECTIVE` .
       */
      override fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
      }

      /**
       * @param singularConstant A singular constant used in a category filter.
       * This element is used to specify a single value for the constant.
       */
      override fun singularConstant(singularConstant: String) {
        cdkBuilder.singularConstant(singularConstant)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty,
    ) : CdkObject(cdkObject),
        TopicCategoryFilterConstantProperty {
      /**
       * A collective constant used in a category filter.
       *
       * This element is used to specify a list of values for the constant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html#cfn-quicksight-topic-topiccategoryfilterconstant-collectiveconstant)
       */
      override fun collectiveConstant(): Any? = unwrap(this).getCollectiveConstant()

      /**
       * The type of category filter constant.
       *
       * This element is used to specify whether a constant is a singular or collective. Valid
       * values are `SINGULAR` and `COLLECTIVE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html#cfn-quicksight-topic-topiccategoryfilterconstant-constanttype)
       */
      override fun constantType(): String? = unwrap(this).getConstantType()

      /**
       * A singular constant used in a category filter.
       *
       * This element is used to specify a single value for the constant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilterconstant.html#cfn-quicksight-topic-topiccategoryfilterconstant-singularconstant)
       */
      override fun singularConstant(): String? = unwrap(this).getSingularConstant()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TopicCategoryFilterConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty):
          TopicCategoryFilterConstantProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicCategoryFilterConstantProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicCategoryFilterConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterConstantProperty
    }
  }

  /**
   * A structure that represents a category filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicCategoryFilterProperty topicCategoryFilterProperty = TopicCategoryFilterProperty.builder()
   * .categoryFilterFunction("categoryFilterFunction")
   * .categoryFilterType("categoryFilterType")
   * .constant(TopicCategoryFilterConstantProperty.builder()
   * .collectiveConstant(CollectiveConstantProperty.builder()
   * .valueList(List.of("valueList"))
   * .build())
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .inverse(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html)
   */
  public interface TopicCategoryFilterProperty {
    /**
     * The category filter function.
     *
     * Valid values for this structure are `EXACT` and `CONTAINS` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-categoryfilterfunction)
     */
    public fun categoryFilterFunction(): String? = unwrap(this).getCategoryFilterFunction()

    /**
     * The category filter type.
     *
     * This element is used to specify whether a filter is a simple category filter or an inverse
     * category filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-categoryfiltertype)
     */
    public fun categoryFilterType(): String? = unwrap(this).getCategoryFilterType()

    /**
     * The constant used in a category filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-constant)
     */
    public fun constant(): Any? = unwrap(this).getConstant()

    /**
     * A Boolean value that indicates if the filter is inverse.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-inverse)
     */
    public fun inverse(): Any? = unwrap(this).getInverse()

    /**
     * A builder for [TopicCategoryFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param categoryFilterFunction The category filter function.
       * Valid values for this structure are `EXACT` and `CONTAINS` .
       */
      public fun categoryFilterFunction(categoryFilterFunction: String)

      /**
       * @param categoryFilterType The category filter type.
       * This element is used to specify whether a filter is a simple category filter or an inverse
       * category filter.
       */
      public fun categoryFilterType(categoryFilterType: String)

      /**
       * @param constant The constant used in a category filter.
       */
      public fun constant(constant: IResolvable)

      /**
       * @param constant The constant used in a category filter.
       */
      public fun constant(constant: TopicCategoryFilterConstantProperty)

      /**
       * @param constant The constant used in a category filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b8f62d6a6372d6957e55640376ef1f0459f2ef8e1a31870e4c69591dea6fe8")
      public fun constant(constant: TopicCategoryFilterConstantProperty.Builder.() -> Unit)

      /**
       * @param inverse A Boolean value that indicates if the filter is inverse.
       */
      public fun inverse(inverse: Boolean)

      /**
       * @param inverse A Boolean value that indicates if the filter is inverse.
       */
      public fun inverse(inverse: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty.builder()

      /**
       * @param categoryFilterFunction The category filter function.
       * Valid values for this structure are `EXACT` and `CONTAINS` .
       */
      override fun categoryFilterFunction(categoryFilterFunction: String) {
        cdkBuilder.categoryFilterFunction(categoryFilterFunction)
      }

      /**
       * @param categoryFilterType The category filter type.
       * This element is used to specify whether a filter is a simple category filter or an inverse
       * category filter.
       */
      override fun categoryFilterType(categoryFilterType: String) {
        cdkBuilder.categoryFilterType(categoryFilterType)
      }

      /**
       * @param constant The constant used in a category filter.
       */
      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a category filter.
       */
      override fun constant(constant: TopicCategoryFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicCategoryFilterConstantProperty.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a category filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b8f62d6a6372d6957e55640376ef1f0459f2ef8e1a31870e4c69591dea6fe8")
      override fun constant(constant: TopicCategoryFilterConstantProperty.Builder.() -> Unit): Unit
          = constant(TopicCategoryFilterConstantProperty(constant))

      /**
       * @param inverse A Boolean value that indicates if the filter is inverse.
       */
      override fun inverse(inverse: Boolean) {
        cdkBuilder.inverse(inverse)
      }

      /**
       * @param inverse A Boolean value that indicates if the filter is inverse.
       */
      override fun inverse(inverse: IResolvable) {
        cdkBuilder.inverse(inverse.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty,
    ) : CdkObject(cdkObject),
        TopicCategoryFilterProperty {
      /**
       * The category filter function.
       *
       * Valid values for this structure are `EXACT` and `CONTAINS` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-categoryfilterfunction)
       */
      override fun categoryFilterFunction(): String? = unwrap(this).getCategoryFilterFunction()

      /**
       * The category filter type.
       *
       * This element is used to specify whether a filter is a simple category filter or an inverse
       * category filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-categoryfiltertype)
       */
      override fun categoryFilterType(): String? = unwrap(this).getCategoryFilterType()

      /**
       * The constant used in a category filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-constant)
       */
      override fun constant(): Any? = unwrap(this).getConstant()

      /**
       * A Boolean value that indicates if the filter is inverse.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccategoryfilter.html#cfn-quicksight-topic-topiccategoryfilter-inverse)
       */
      override fun inverse(): Any? = unwrap(this).getInverse()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicCategoryFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty):
          TopicCategoryFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicCategoryFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicCategoryFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicCategoryFilterProperty
    }
  }

  /**
   * Represents a column in a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicColumnProperty topicColumnProperty = TopicColumnProperty.builder()
   * .columnName("columnName")
   * // the properties below are optional
   * .aggregation("aggregation")
   * .allowedAggregations(List.of("allowedAggregations"))
   * .cellValueSynonyms(List.of(CellValueSynonymProperty.builder()
   * .cellValue("cellValue")
   * .synonyms(List.of("synonyms"))
   * .build()))
   * .columnDataRole("columnDataRole")
   * .columnDescription("columnDescription")
   * .columnFriendlyName("columnFriendlyName")
   * .columnSynonyms(List.of("columnSynonyms"))
   * .comparativeOrder(ComparativeOrderProperty.builder()
   * .specifedOrder(List.of("specifedOrder"))
   * .treatUndefinedSpecifiedValues("treatUndefinedSpecifiedValues")
   * .useOrdering("useOrdering")
   * .build())
   * .defaultFormatting(DefaultFormattingProperty.builder()
   * .displayFormat("displayFormat")
   * .displayFormatOptions(DisplayFormatOptionsProperty.builder()
   * .blankCellFormat("blankCellFormat")
   * .currencySymbol("currencySymbol")
   * .dateFormat("dateFormat")
   * .decimalSeparator("decimalSeparator")
   * .fractionDigits(123)
   * .groupingSeparator("groupingSeparator")
   * .negativeFormat(NegativeFormatProperty.builder()
   * .prefix("prefix")
   * .suffix("suffix")
   * .build())
   * .prefix("prefix")
   * .suffix("suffix")
   * .unitScaler("unitScaler")
   * .useBlankCellFormat(false)
   * .useGrouping(false)
   * .build())
   * .build())
   * .disableIndexing(false)
   * .isIncludedInTopic(false)
   * .neverAggregateInFilter(false)
   * .nonAdditive(false)
   * .notAllowedAggregations(List.of("notAllowedAggregations"))
   * .semanticType(SemanticTypeProperty.builder()
   * .falseyCellValue("falseyCellValue")
   * .falseyCellValueSynonyms(List.of("falseyCellValueSynonyms"))
   * .subTypeName("subTypeName")
   * .truthyCellValue("truthyCellValue")
   * .truthyCellValueSynonyms(List.of("truthyCellValueSynonyms"))
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build())
   * .timeGranularity("timeGranularity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html)
   */
  public interface TopicColumnProperty {
    /**
     * The type of aggregation that is performed on the column data when it's queried.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-aggregation)
     */
    public fun aggregation(): String? = unwrap(this).getAggregation()

    /**
     * The list of aggregation types that are allowed for the column.
     *
     * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
     * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-allowedaggregations)
     */
    public fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
        emptyList()

    /**
     * The other names or aliases for the column cell value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-cellvaluesynonyms)
     */
    public fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

    /**
     * The role of the column in the data.
     *
     * Valid values are `DIMENSION` and `MEASURE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columndatarole)
     */
    public fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

    /**
     * A description of the column and its contents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columndescription)
     */
    public fun columnDescription(): String? = unwrap(this).getColumnDescription()

    /**
     * A user-friendly name for the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columnfriendlyname)
     */
    public fun columnFriendlyName(): String? = unwrap(this).getColumnFriendlyName()

    /**
     * The name of the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columnname)
     */
    public fun columnName(): String

    /**
     * The other names or aliases for the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columnsynonyms)
     */
    public fun columnSynonyms(): List<String> = unwrap(this).getColumnSynonyms() ?: emptyList()

    /**
     * The order in which data is displayed for the column when it's used in a comparative context.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-comparativeorder)
     */
    public fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

    /**
     * The default formatting used for values in the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-defaultformatting)
     */
    public fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

    /**
     * A Boolean value that indicates whether the column shows in the autocomplete functionality.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-disableindexing)
     */
    public fun disableIndexing(): Any? = unwrap(this).getDisableIndexing()

    /**
     * A Boolean value that indicates whether the column is included in the query results.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-isincludedintopic)
     */
    public fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

    /**
     * A Boolean value that indicates whether to aggregate the column data when it's used in a
     * filter context.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-neveraggregateinfilter)
     */
    public fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

    /**
     * The non additive value for the column.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-nonadditive)
     */
    public fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

    /**
     * The list of aggregation types that are not allowed for the column.
     *
     * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
     * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-notallowedaggregations)
     */
    public fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations() ?:
        emptyList()

    /**
     * The semantic type of data contained in the column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-semantictype)
     */
    public fun semanticType(): Any? = unwrap(this).getSemanticType()

    /**
     * The level of time precision that is used to aggregate `DateTime` values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-timegranularity)
     */
    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    /**
     * A builder for [TopicColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregation The type of aggregation that is performed on the column data when it's
       * queried.
       */
      public fun aggregation(aggregation: String)

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun allowedAggregations(allowedAggregations: List<String>)

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun allowedAggregations(vararg allowedAggregations: String)

      /**
       * @param cellValueSynonyms The other names or aliases for the column cell value.
       */
      public fun cellValueSynonyms(cellValueSynonyms: IResolvable)

      /**
       * @param cellValueSynonyms The other names or aliases for the column cell value.
       */
      public fun cellValueSynonyms(cellValueSynonyms: List<Any>)

      /**
       * @param cellValueSynonyms The other names or aliases for the column cell value.
       */
      public fun cellValueSynonyms(vararg cellValueSynonyms: Any)

      /**
       * @param columnDataRole The role of the column in the data.
       * Valid values are `DIMENSION` and `MEASURE` .
       */
      public fun columnDataRole(columnDataRole: String)

      /**
       * @param columnDescription A description of the column and its contents.
       */
      public fun columnDescription(columnDescription: String)

      /**
       * @param columnFriendlyName A user-friendly name for the column.
       */
      public fun columnFriendlyName(columnFriendlyName: String)

      /**
       * @param columnName The name of the column. 
       */
      public fun columnName(columnName: String)

      /**
       * @param columnSynonyms The other names or aliases for the column.
       */
      public fun columnSynonyms(columnSynonyms: List<String>)

      /**
       * @param columnSynonyms The other names or aliases for the column.
       */
      public fun columnSynonyms(vararg columnSynonyms: String)

      /**
       * @param comparativeOrder The order in which data is displayed for the column when it's used
       * in a comparative context.
       */
      public fun comparativeOrder(comparativeOrder: IResolvable)

      /**
       * @param comparativeOrder The order in which data is displayed for the column when it's used
       * in a comparative context.
       */
      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty)

      /**
       * @param comparativeOrder The order in which data is displayed for the column when it's used
       * in a comparative context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ad92c1d298291ba891ddf5b0ec59ad79e19bffd5d2ebd8c197394e39f648e9f")
      public fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit)

      /**
       * @param defaultFormatting The default formatting used for values in the column.
       */
      public fun defaultFormatting(defaultFormatting: IResolvable)

      /**
       * @param defaultFormatting The default formatting used for values in the column.
       */
      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty)

      /**
       * @param defaultFormatting The default formatting used for values in the column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf22ca6915fc59cae32f1331daaa003dcc5dc1cc3113e283fb23558c1b14366")
      public fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit)

      /**
       * @param disableIndexing A Boolean value that indicates whether the column shows in the
       * autocomplete functionality.
       */
      public fun disableIndexing(disableIndexing: Boolean)

      /**
       * @param disableIndexing A Boolean value that indicates whether the column shows in the
       * autocomplete functionality.
       */
      public fun disableIndexing(disableIndexing: IResolvable)

      /**
       * @param isIncludedInTopic A Boolean value that indicates whether the column is included in
       * the query results.
       */
      public fun isIncludedInTopic(isIncludedInTopic: Boolean)

      /**
       * @param isIncludedInTopic A Boolean value that indicates whether the column is included in
       * the query results.
       */
      public fun isIncludedInTopic(isIncludedInTopic: IResolvable)

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to aggregate the
       * column data when it's used in a filter context.
       */
      public fun neverAggregateInFilter(neverAggregateInFilter: Boolean)

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to aggregate the
       * column data when it's used in a filter context.
       */
      public fun neverAggregateInFilter(neverAggregateInFilter: IResolvable)

      /**
       * @param nonAdditive The non additive value for the column.
       */
      public fun nonAdditive(nonAdditive: Boolean)

      /**
       * @param nonAdditive The non additive value for the column.
       */
      public fun nonAdditive(nonAdditive: IResolvable)

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun notAllowedAggregations(notAllowedAggregations: List<String>)

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      public fun notAllowedAggregations(vararg notAllowedAggregations: String)

      /**
       * @param semanticType The semantic type of data contained in the column.
       */
      public fun semanticType(semanticType: IResolvable)

      /**
       * @param semanticType The semantic type of data contained in the column.
       */
      public fun semanticType(semanticType: SemanticTypeProperty)

      /**
       * @param semanticType The semantic type of data contained in the column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7f86e62630d165cd8fa100f27a17008a6c8c2ad9e42a89a72d586f6a460c21")
      public fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit)

      /**
       * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
       * values.
       */
      public fun timeGranularity(timeGranularity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty.builder()

      /**
       * @param aggregation The type of aggregation that is performed on the column data when it's
       * queried.
       */
      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun allowedAggregations(allowedAggregations: List<String>) {
        cdkBuilder.allowedAggregations(allowedAggregations)
      }

      /**
       * @param allowedAggregations The list of aggregation types that are allowed for the column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun allowedAggregations(vararg allowedAggregations: String): Unit =
          allowedAggregations(allowedAggregations.toList())

      /**
       * @param cellValueSynonyms The other names or aliases for the column cell value.
       */
      override fun cellValueSynonyms(cellValueSynonyms: IResolvable) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param cellValueSynonyms The other names or aliases for the column cell value.
       */
      override fun cellValueSynonyms(cellValueSynonyms: List<Any>) {
        cdkBuilder.cellValueSynonyms(cellValueSynonyms.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param cellValueSynonyms The other names or aliases for the column cell value.
       */
      override fun cellValueSynonyms(vararg cellValueSynonyms: Any): Unit =
          cellValueSynonyms(cellValueSynonyms.toList())

      /**
       * @param columnDataRole The role of the column in the data.
       * Valid values are `DIMENSION` and `MEASURE` .
       */
      override fun columnDataRole(columnDataRole: String) {
        cdkBuilder.columnDataRole(columnDataRole)
      }

      /**
       * @param columnDescription A description of the column and its contents.
       */
      override fun columnDescription(columnDescription: String) {
        cdkBuilder.columnDescription(columnDescription)
      }

      /**
       * @param columnFriendlyName A user-friendly name for the column.
       */
      override fun columnFriendlyName(columnFriendlyName: String) {
        cdkBuilder.columnFriendlyName(columnFriendlyName)
      }

      /**
       * @param columnName The name of the column. 
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param columnSynonyms The other names or aliases for the column.
       */
      override fun columnSynonyms(columnSynonyms: List<String>) {
        cdkBuilder.columnSynonyms(columnSynonyms)
      }

      /**
       * @param columnSynonyms The other names or aliases for the column.
       */
      override fun columnSynonyms(vararg columnSynonyms: String): Unit =
          columnSynonyms(columnSynonyms.toList())

      /**
       * @param comparativeOrder The order in which data is displayed for the column when it's used
       * in a comparative context.
       */
      override fun comparativeOrder(comparativeOrder: IResolvable) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param comparativeOrder The order in which data is displayed for the column when it's used
       * in a comparative context.
       */
      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty) {
        cdkBuilder.comparativeOrder(comparativeOrder.let(ComparativeOrderProperty.Companion::unwrap))
      }

      /**
       * @param comparativeOrder The order in which data is displayed for the column when it's used
       * in a comparative context.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6ad92c1d298291ba891ddf5b0ec59ad79e19bffd5d2ebd8c197394e39f648e9f")
      override fun comparativeOrder(comparativeOrder: ComparativeOrderProperty.Builder.() -> Unit):
          Unit = comparativeOrder(ComparativeOrderProperty(comparativeOrder))

      /**
       * @param defaultFormatting The default formatting used for values in the column.
       */
      override fun defaultFormatting(defaultFormatting: IResolvable) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param defaultFormatting The default formatting used for values in the column.
       */
      override fun defaultFormatting(defaultFormatting: DefaultFormattingProperty) {
        cdkBuilder.defaultFormatting(defaultFormatting.let(DefaultFormattingProperty.Companion::unwrap))
      }

      /**
       * @param defaultFormatting The default formatting used for values in the column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fbf22ca6915fc59cae32f1331daaa003dcc5dc1cc3113e283fb23558c1b14366")
      override
          fun defaultFormatting(defaultFormatting: DefaultFormattingProperty.Builder.() -> Unit):
          Unit = defaultFormatting(DefaultFormattingProperty(defaultFormatting))

      /**
       * @param disableIndexing A Boolean value that indicates whether the column shows in the
       * autocomplete functionality.
       */
      override fun disableIndexing(disableIndexing: Boolean) {
        cdkBuilder.disableIndexing(disableIndexing)
      }

      /**
       * @param disableIndexing A Boolean value that indicates whether the column shows in the
       * autocomplete functionality.
       */
      override fun disableIndexing(disableIndexing: IResolvable) {
        cdkBuilder.disableIndexing(disableIndexing.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param isIncludedInTopic A Boolean value that indicates whether the column is included in
       * the query results.
       */
      override fun isIncludedInTopic(isIncludedInTopic: Boolean) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic)
      }

      /**
       * @param isIncludedInTopic A Boolean value that indicates whether the column is included in
       * the query results.
       */
      override fun isIncludedInTopic(isIncludedInTopic: IResolvable) {
        cdkBuilder.isIncludedInTopic(isIncludedInTopic.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to aggregate the
       * column data when it's used in a filter context.
       */
      override fun neverAggregateInFilter(neverAggregateInFilter: Boolean) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter)
      }

      /**
       * @param neverAggregateInFilter A Boolean value that indicates whether to aggregate the
       * column data when it's used in a filter context.
       */
      override fun neverAggregateInFilter(neverAggregateInFilter: IResolvable) {
        cdkBuilder.neverAggregateInFilter(neverAggregateInFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param nonAdditive The non additive value for the column.
       */
      override fun nonAdditive(nonAdditive: Boolean) {
        cdkBuilder.nonAdditive(nonAdditive)
      }

      /**
       * @param nonAdditive The non additive value for the column.
       */
      override fun nonAdditive(nonAdditive: IResolvable) {
        cdkBuilder.nonAdditive(nonAdditive.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun notAllowedAggregations(notAllowedAggregations: List<String>) {
        cdkBuilder.notAllowedAggregations(notAllowedAggregations)
      }

      /**
       * @param notAllowedAggregations The list of aggregation types that are not allowed for the
       * column.
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       */
      override fun notAllowedAggregations(vararg notAllowedAggregations: String): Unit =
          notAllowedAggregations(notAllowedAggregations.toList())

      /**
       * @param semanticType The semantic type of data contained in the column.
       */
      override fun semanticType(semanticType: IResolvable) {
        cdkBuilder.semanticType(semanticType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param semanticType The semantic type of data contained in the column.
       */
      override fun semanticType(semanticType: SemanticTypeProperty) {
        cdkBuilder.semanticType(semanticType.let(SemanticTypeProperty.Companion::unwrap))
      }

      /**
       * @param semanticType The semantic type of data contained in the column.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9b7f86e62630d165cd8fa100f27a17008a6c8c2ad9e42a89a72d586f6a460c21")
      override fun semanticType(semanticType: SemanticTypeProperty.Builder.() -> Unit): Unit =
          semanticType(SemanticTypeProperty(semanticType))

      /**
       * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
       * values.
       */
      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty,
    ) : CdkObject(cdkObject),
        TopicColumnProperty {
      /**
       * The type of aggregation that is performed on the column data when it's queried.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-aggregation)
       */
      override fun aggregation(): String? = unwrap(this).getAggregation()

      /**
       * The list of aggregation types that are allowed for the column.
       *
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-allowedaggregations)
       */
      override fun allowedAggregations(): List<String> = unwrap(this).getAllowedAggregations() ?:
          emptyList()

      /**
       * The other names or aliases for the column cell value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-cellvaluesynonyms)
       */
      override fun cellValueSynonyms(): Any? = unwrap(this).getCellValueSynonyms()

      /**
       * The role of the column in the data.
       *
       * Valid values are `DIMENSION` and `MEASURE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columndatarole)
       */
      override fun columnDataRole(): String? = unwrap(this).getColumnDataRole()

      /**
       * A description of the column and its contents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columndescription)
       */
      override fun columnDescription(): String? = unwrap(this).getColumnDescription()

      /**
       * A user-friendly name for the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columnfriendlyname)
       */
      override fun columnFriendlyName(): String? = unwrap(this).getColumnFriendlyName()

      /**
       * The name of the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * The other names or aliases for the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-columnsynonyms)
       */
      override fun columnSynonyms(): List<String> = unwrap(this).getColumnSynonyms() ?: emptyList()

      /**
       * The order in which data is displayed for the column when it's used in a comparative
       * context.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-comparativeorder)
       */
      override fun comparativeOrder(): Any? = unwrap(this).getComparativeOrder()

      /**
       * The default formatting used for values in the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-defaultformatting)
       */
      override fun defaultFormatting(): Any? = unwrap(this).getDefaultFormatting()

      /**
       * A Boolean value that indicates whether the column shows in the autocomplete functionality.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-disableindexing)
       */
      override fun disableIndexing(): Any? = unwrap(this).getDisableIndexing()

      /**
       * A Boolean value that indicates whether the column is included in the query results.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-isincludedintopic)
       */
      override fun isIncludedInTopic(): Any? = unwrap(this).getIsIncludedInTopic()

      /**
       * A Boolean value that indicates whether to aggregate the column data when it's used in a
       * filter context.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-neveraggregateinfilter)
       */
      override fun neverAggregateInFilter(): Any? = unwrap(this).getNeverAggregateInFilter()

      /**
       * The non additive value for the column.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-nonadditive)
       */
      override fun nonAdditive(): Any? = unwrap(this).getNonAdditive()

      /**
       * The list of aggregation types that are not allowed for the column.
       *
       * Valid values for this structure are `COUNT` , `DISTINCT_COUNT` , `MIN` , `MAX` , `MEDIAN` ,
       * `SUM` , `AVERAGE` , `STDEV` , `STDEVP` , `VAR` , `VARP` , and `PERCENTILE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-notallowedaggregations)
       */
      override fun notAllowedAggregations(): List<String> = unwrap(this).getNotAllowedAggregations()
          ?: emptyList()

      /**
       * The semantic type of data contained in the column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-semantictype)
       */
      override fun semanticType(): Any? = unwrap(this).getSemanticType()

      /**
       * The level of time precision that is used to aggregate `DateTime` values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topiccolumn.html#cfn-quicksight-topic-topiccolumn-timegranularity)
       */
      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty):
          TopicColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicColumnProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicColumnProperty
    }
  }

  /**
   * Configuration options for a `Topic` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicConfigOptionsProperty topicConfigOptionsProperty = TopicConfigOptionsProperty.builder()
   * .qBusinessInsightsEnabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicconfigoptions.html)
   */
  public interface TopicConfigOptionsProperty {
    /**
     * Enables Amazon Q Business Insights for a `Topic` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicconfigoptions.html#cfn-quicksight-topic-topicconfigoptions-qbusinessinsightsenabled)
     */
    public fun qBusinessInsightsEnabled(): Any? = unwrap(this).getQBusinessInsightsEnabled()

    /**
     * A builder for [TopicConfigOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param qBusinessInsightsEnabled Enables Amazon Q Business Insights for a `Topic` .
       */
      public fun qBusinessInsightsEnabled(qBusinessInsightsEnabled: Boolean)

      /**
       * @param qBusinessInsightsEnabled Enables Amazon Q Business Insights for a `Topic` .
       */
      public fun qBusinessInsightsEnabled(qBusinessInsightsEnabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicConfigOptionsProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicConfigOptionsProperty.builder()

      /**
       * @param qBusinessInsightsEnabled Enables Amazon Q Business Insights for a `Topic` .
       */
      override fun qBusinessInsightsEnabled(qBusinessInsightsEnabled: Boolean) {
        cdkBuilder.qBusinessInsightsEnabled(qBusinessInsightsEnabled)
      }

      /**
       * @param qBusinessInsightsEnabled Enables Amazon Q Business Insights for a `Topic` .
       */
      override fun qBusinessInsightsEnabled(qBusinessInsightsEnabled: IResolvable) {
        cdkBuilder.qBusinessInsightsEnabled(qBusinessInsightsEnabled.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicConfigOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicConfigOptionsProperty,
    ) : CdkObject(cdkObject),
        TopicConfigOptionsProperty {
      /**
       * Enables Amazon Q Business Insights for a `Topic` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicconfigoptions.html#cfn-quicksight-topic-topicconfigoptions-qbusinessinsightsenabled)
       */
      override fun qBusinessInsightsEnabled(): Any? = unwrap(this).getQBusinessInsightsEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicConfigOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicConfigOptionsProperty):
          TopicConfigOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicConfigOptionsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicConfigOptionsProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicConfigOptionsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicConfigOptionsProperty
    }
  }

  /**
   * A filter used to restrict data based on a range of dates or times.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicDateRangeFilterProperty topicDateRangeFilterProperty =
   * TopicDateRangeFilterProperty.builder()
   * .constant(TopicRangeFilterConstantProperty.builder()
   * .constantType("constantType")
   * .rangeConstant(RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build())
   * .build())
   * .inclusive(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicdaterangefilter.html)
   */
  public interface TopicDateRangeFilterProperty {
    /**
     * The constant used in a date range filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicdaterangefilter.html#cfn-quicksight-topic-topicdaterangefilter-constant)
     */
    public fun constant(): Any? = unwrap(this).getConstant()

    /**
     * A Boolean value that indicates whether the date range filter should include the boundary
     * values.
     *
     * If set to true, the filter includes the start and end dates. If set to false, the filter
     * excludes them.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicdaterangefilter.html#cfn-quicksight-topic-topicdaterangefilter-inclusive)
     */
    public fun inclusive(): Any? = unwrap(this).getInclusive()

    /**
     * A builder for [TopicDateRangeFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constant The constant used in a date range filter.
       */
      public fun constant(constant: IResolvable)

      /**
       * @param constant The constant used in a date range filter.
       */
      public fun constant(constant: TopicRangeFilterConstantProperty)

      /**
       * @param constant The constant used in a date range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e78d041a922a4b2c0cb82de073d73468de33269f877f54f0610549dd6da02f")
      public fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit)

      /**
       * @param inclusive A Boolean value that indicates whether the date range filter should
       * include the boundary values.
       * If set to true, the filter includes the start and end dates. If set to false, the filter
       * excludes them.
       */
      public fun inclusive(inclusive: Boolean)

      /**
       * @param inclusive A Boolean value that indicates whether the date range filter should
       * include the boundary values.
       * If set to true, the filter includes the start and end dates. If set to false, the filter
       * excludes them.
       */
      public fun inclusive(inclusive: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty.builder()

      /**
       * @param constant The constant used in a date range filter.
       */
      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a date range filter.
       */
      override fun constant(constant: TopicRangeFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicRangeFilterConstantProperty.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a date range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("51e78d041a922a4b2c0cb82de073d73468de33269f877f54f0610549dd6da02f")
      override fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit): Unit =
          constant(TopicRangeFilterConstantProperty(constant))

      /**
       * @param inclusive A Boolean value that indicates whether the date range filter should
       * include the boundary values.
       * If set to true, the filter includes the start and end dates. If set to false, the filter
       * excludes them.
       */
      override fun inclusive(inclusive: Boolean) {
        cdkBuilder.inclusive(inclusive)
      }

      /**
       * @param inclusive A Boolean value that indicates whether the date range filter should
       * include the boundary values.
       * If set to true, the filter includes the start and end dates. If set to false, the filter
       * excludes them.
       */
      override fun inclusive(inclusive: IResolvable) {
        cdkBuilder.inclusive(inclusive.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty,
    ) : CdkObject(cdkObject),
        TopicDateRangeFilterProperty {
      /**
       * The constant used in a date range filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicdaterangefilter.html#cfn-quicksight-topic-topicdaterangefilter-constant)
       */
      override fun constant(): Any? = unwrap(this).getConstant()

      /**
       * A Boolean value that indicates whether the date range filter should include the boundary
       * values.
       *
       * If set to true, the filter includes the start and end dates. If set to false, the filter
       * excludes them.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicdaterangefilter.html#cfn-quicksight-topic-topicdaterangefilter-inclusive)
       */
      override fun inclusive(): Any? = unwrap(this).getInclusive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicDateRangeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty):
          TopicDateRangeFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicDateRangeFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicDateRangeFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicDateRangeFilterProperty
    }
  }

  /**
   * A structure that represents a filter used to select items for a topic.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicFilterProperty topicFilterProperty = TopicFilterProperty.builder()
   * .filterName("filterName")
   * .operandFieldName("operandFieldName")
   * // the properties below are optional
   * .categoryFilter(TopicCategoryFilterProperty.builder()
   * .categoryFilterFunction("categoryFilterFunction")
   * .categoryFilterType("categoryFilterType")
   * .constant(TopicCategoryFilterConstantProperty.builder()
   * .collectiveConstant(CollectiveConstantProperty.builder()
   * .valueList(List.of("valueList"))
   * .build())
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .inverse(false)
   * .build())
   * .dateRangeFilter(TopicDateRangeFilterProperty.builder()
   * .constant(TopicRangeFilterConstantProperty.builder()
   * .constantType("constantType")
   * .rangeConstant(RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build())
   * .build())
   * .inclusive(false)
   * .build())
   * .filterClass("filterClass")
   * .filterDescription("filterDescription")
   * .filterSynonyms(List.of("filterSynonyms"))
   * .filterType("filterType")
   * .numericEqualityFilter(TopicNumericEqualityFilterProperty.builder()
   * .aggregation("aggregation")
   * .constant(TopicSingularFilterConstantProperty.builder()
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .build())
   * .numericRangeFilter(TopicNumericRangeFilterProperty.builder()
   * .aggregation("aggregation")
   * .constant(TopicRangeFilterConstantProperty.builder()
   * .constantType("constantType")
   * .rangeConstant(RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build())
   * .build())
   * .inclusive(false)
   * .build())
   * .relativeDateFilter(TopicRelativeDateFilterProperty.builder()
   * .constant(TopicSingularFilterConstantProperty.builder()
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .relativeDateFilterFunction("relativeDateFilterFunction")
   * .timeGranularity("timeGranularity")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html)
   */
  public interface TopicFilterProperty {
    /**
     * The category filter that is associated with this filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-categoryfilter)
     */
    public fun categoryFilter(): Any? = unwrap(this).getCategoryFilter()

    /**
     * The date range filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-daterangefilter)
     */
    public fun dateRangeFilter(): Any? = unwrap(this).getDateRangeFilter()

    /**
     * The class of the filter.
     *
     * Valid values for this structure are `ENFORCED_VALUE_FILTER` , `CONDITIONAL_VALUE_FILTER` ,
     * and `NAMED_VALUE_FILTER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filterclass)
     */
    public fun filterClass(): String? = unwrap(this).getFilterClass()

    /**
     * A description of the filter used to select items for a topic.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filterdescription)
     */
    public fun filterDescription(): String? = unwrap(this).getFilterDescription()

    /**
     * The name of the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filtername)
     */
    public fun filterName(): String

    /**
     * The other names or aliases for the filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filtersynonyms)
     */
    public fun filterSynonyms(): List<String> = unwrap(this).getFilterSynonyms() ?: emptyList()

    /**
     * The type of the filter.
     *
     * Valid values for this structure are `CATEGORY_FILTER` , `NUMERIC_EQUALITY_FILTER` ,
     * `NUMERIC_RANGE_FILTER` , `DATE_RANGE_FILTER` , and `RELATIVE_DATE_FILTER` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filtertype)
     */
    public fun filterType(): String? = unwrap(this).getFilterType()

    /**
     * The numeric equality filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-numericequalityfilter)
     */
    public fun numericEqualityFilter(): Any? = unwrap(this).getNumericEqualityFilter()

    /**
     * The numeric range filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-numericrangefilter)
     */
    public fun numericRangeFilter(): Any? = unwrap(this).getNumericRangeFilter()

    /**
     * The name of the field that the filter operates on.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-operandfieldname)
     */
    public fun operandFieldName(): String

    /**
     * The relative date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-relativedatefilter)
     */
    public fun relativeDateFilter(): Any? = unwrap(this).getRelativeDateFilter()

    /**
     * A builder for [TopicFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param categoryFilter The category filter that is associated with this filter.
       */
      public fun categoryFilter(categoryFilter: IResolvable)

      /**
       * @param categoryFilter The category filter that is associated with this filter.
       */
      public fun categoryFilter(categoryFilter: TopicCategoryFilterProperty)

      /**
       * @param categoryFilter The category filter that is associated with this filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("405f8ec202b0a715bfd41c59d2ee7094951cb87599ba83e471e739b4114a25da")
      public fun categoryFilter(categoryFilter: TopicCategoryFilterProperty.Builder.() -> Unit)

      /**
       * @param dateRangeFilter The date range filter.
       */
      public fun dateRangeFilter(dateRangeFilter: IResolvable)

      /**
       * @param dateRangeFilter The date range filter.
       */
      public fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty)

      /**
       * @param dateRangeFilter The date range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4780726af276343d5218cb0a6dfa48fbf9be7a059bb622dbdd901eea2fdf85")
      public fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty.Builder.() -> Unit)

      /**
       * @param filterClass The class of the filter.
       * Valid values for this structure are `ENFORCED_VALUE_FILTER` , `CONDITIONAL_VALUE_FILTER` ,
       * and `NAMED_VALUE_FILTER` .
       */
      public fun filterClass(filterClass: String)

      /**
       * @param filterDescription A description of the filter used to select items for a topic.
       */
      public fun filterDescription(filterDescription: String)

      /**
       * @param filterName The name of the filter. 
       */
      public fun filterName(filterName: String)

      /**
       * @param filterSynonyms The other names or aliases for the filter.
       */
      public fun filterSynonyms(filterSynonyms: List<String>)

      /**
       * @param filterSynonyms The other names or aliases for the filter.
       */
      public fun filterSynonyms(vararg filterSynonyms: String)

      /**
       * @param filterType The type of the filter.
       * Valid values for this structure are `CATEGORY_FILTER` , `NUMERIC_EQUALITY_FILTER` ,
       * `NUMERIC_RANGE_FILTER` , `DATE_RANGE_FILTER` , and `RELATIVE_DATE_FILTER` .
       */
      public fun filterType(filterType: String)

      /**
       * @param numericEqualityFilter The numeric equality filter.
       */
      public fun numericEqualityFilter(numericEqualityFilter: IResolvable)

      /**
       * @param numericEqualityFilter The numeric equality filter.
       */
      public fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty)

      /**
       * @param numericEqualityFilter The numeric equality filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d3f9936c377c4ff14fca630dc7cdebae69d80712e566269817c7462b03b333")
      public
          fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty.Builder.() -> Unit)

      /**
       * @param numericRangeFilter The numeric range filter.
       */
      public fun numericRangeFilter(numericRangeFilter: IResolvable)

      /**
       * @param numericRangeFilter The numeric range filter.
       */
      public fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty)

      /**
       * @param numericRangeFilter The numeric range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00a1a708b331dd414c9bfa719d5c1f304dc4ed84a72c3f0b5fef5787469245a6")
      public
          fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty.Builder.() -> Unit)

      /**
       * @param operandFieldName The name of the field that the filter operates on. 
       */
      public fun operandFieldName(operandFieldName: String)

      /**
       * @param relativeDateFilter The relative date filter.
       */
      public fun relativeDateFilter(relativeDateFilter: IResolvable)

      /**
       * @param relativeDateFilter The relative date filter.
       */
      public fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty)

      /**
       * @param relativeDateFilter The relative date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbac18e6d3083682cef12a6f06fd86288e22ba3c865ed39b20a802aa9cd61764")
      public
          fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty.builder()

      /**
       * @param categoryFilter The category filter that is associated with this filter.
       */
      override fun categoryFilter(categoryFilter: IResolvable) {
        cdkBuilder.categoryFilter(categoryFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param categoryFilter The category filter that is associated with this filter.
       */
      override fun categoryFilter(categoryFilter: TopicCategoryFilterProperty) {
        cdkBuilder.categoryFilter(categoryFilter.let(TopicCategoryFilterProperty.Companion::unwrap))
      }

      /**
       * @param categoryFilter The category filter that is associated with this filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("405f8ec202b0a715bfd41c59d2ee7094951cb87599ba83e471e739b4114a25da")
      override fun categoryFilter(categoryFilter: TopicCategoryFilterProperty.Builder.() -> Unit):
          Unit = categoryFilter(TopicCategoryFilterProperty(categoryFilter))

      /**
       * @param dateRangeFilter The date range filter.
       */
      override fun dateRangeFilter(dateRangeFilter: IResolvable) {
        cdkBuilder.dateRangeFilter(dateRangeFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dateRangeFilter The date range filter.
       */
      override fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty) {
        cdkBuilder.dateRangeFilter(dateRangeFilter.let(TopicDateRangeFilterProperty.Companion::unwrap))
      }

      /**
       * @param dateRangeFilter The date range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4c4780726af276343d5218cb0a6dfa48fbf9be7a059bb622dbdd901eea2fdf85")
      override
          fun dateRangeFilter(dateRangeFilter: TopicDateRangeFilterProperty.Builder.() -> Unit):
          Unit = dateRangeFilter(TopicDateRangeFilterProperty(dateRangeFilter))

      /**
       * @param filterClass The class of the filter.
       * Valid values for this structure are `ENFORCED_VALUE_FILTER` , `CONDITIONAL_VALUE_FILTER` ,
       * and `NAMED_VALUE_FILTER` .
       */
      override fun filterClass(filterClass: String) {
        cdkBuilder.filterClass(filterClass)
      }

      /**
       * @param filterDescription A description of the filter used to select items for a topic.
       */
      override fun filterDescription(filterDescription: String) {
        cdkBuilder.filterDescription(filterDescription)
      }

      /**
       * @param filterName The name of the filter. 
       */
      override fun filterName(filterName: String) {
        cdkBuilder.filterName(filterName)
      }

      /**
       * @param filterSynonyms The other names or aliases for the filter.
       */
      override fun filterSynonyms(filterSynonyms: List<String>) {
        cdkBuilder.filterSynonyms(filterSynonyms)
      }

      /**
       * @param filterSynonyms The other names or aliases for the filter.
       */
      override fun filterSynonyms(vararg filterSynonyms: String): Unit =
          filterSynonyms(filterSynonyms.toList())

      /**
       * @param filterType The type of the filter.
       * Valid values for this structure are `CATEGORY_FILTER` , `NUMERIC_EQUALITY_FILTER` ,
       * `NUMERIC_RANGE_FILTER` , `DATE_RANGE_FILTER` , and `RELATIVE_DATE_FILTER` .
       */
      override fun filterType(filterType: String) {
        cdkBuilder.filterType(filterType)
      }

      /**
       * @param numericEqualityFilter The numeric equality filter.
       */
      override fun numericEqualityFilter(numericEqualityFilter: IResolvable) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param numericEqualityFilter The numeric equality filter.
       */
      override
          fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty) {
        cdkBuilder.numericEqualityFilter(numericEqualityFilter.let(TopicNumericEqualityFilterProperty.Companion::unwrap))
      }

      /**
       * @param numericEqualityFilter The numeric equality filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("11d3f9936c377c4ff14fca630dc7cdebae69d80712e566269817c7462b03b333")
      override
          fun numericEqualityFilter(numericEqualityFilter: TopicNumericEqualityFilterProperty.Builder.() -> Unit):
          Unit = numericEqualityFilter(TopicNumericEqualityFilterProperty(numericEqualityFilter))

      /**
       * @param numericRangeFilter The numeric range filter.
       */
      override fun numericRangeFilter(numericRangeFilter: IResolvable) {
        cdkBuilder.numericRangeFilter(numericRangeFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param numericRangeFilter The numeric range filter.
       */
      override fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty) {
        cdkBuilder.numericRangeFilter(numericRangeFilter.let(TopicNumericRangeFilterProperty.Companion::unwrap))
      }

      /**
       * @param numericRangeFilter The numeric range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("00a1a708b331dd414c9bfa719d5c1f304dc4ed84a72c3f0b5fef5787469245a6")
      override
          fun numericRangeFilter(numericRangeFilter: TopicNumericRangeFilterProperty.Builder.() -> Unit):
          Unit = numericRangeFilter(TopicNumericRangeFilterProperty(numericRangeFilter))

      /**
       * @param operandFieldName The name of the field that the filter operates on. 
       */
      override fun operandFieldName(operandFieldName: String) {
        cdkBuilder.operandFieldName(operandFieldName)
      }

      /**
       * @param relativeDateFilter The relative date filter.
       */
      override fun relativeDateFilter(relativeDateFilter: IResolvable) {
        cdkBuilder.relativeDateFilter(relativeDateFilter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param relativeDateFilter The relative date filter.
       */
      override fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty) {
        cdkBuilder.relativeDateFilter(relativeDateFilter.let(TopicRelativeDateFilterProperty.Companion::unwrap))
      }

      /**
       * @param relativeDateFilter The relative date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bbac18e6d3083682cef12a6f06fd86288e22ba3c865ed39b20a802aa9cd61764")
      override
          fun relativeDateFilter(relativeDateFilter: TopicRelativeDateFilterProperty.Builder.() -> Unit):
          Unit = relativeDateFilter(TopicRelativeDateFilterProperty(relativeDateFilter))

      public fun build(): software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty,
    ) : CdkObject(cdkObject),
        TopicFilterProperty {
      /**
       * The category filter that is associated with this filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-categoryfilter)
       */
      override fun categoryFilter(): Any? = unwrap(this).getCategoryFilter()

      /**
       * The date range filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-daterangefilter)
       */
      override fun dateRangeFilter(): Any? = unwrap(this).getDateRangeFilter()

      /**
       * The class of the filter.
       *
       * Valid values for this structure are `ENFORCED_VALUE_FILTER` , `CONDITIONAL_VALUE_FILTER` ,
       * and `NAMED_VALUE_FILTER` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filterclass)
       */
      override fun filterClass(): String? = unwrap(this).getFilterClass()

      /**
       * A description of the filter used to select items for a topic.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filterdescription)
       */
      override fun filterDescription(): String? = unwrap(this).getFilterDescription()

      /**
       * The name of the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filtername)
       */
      override fun filterName(): String = unwrap(this).getFilterName()

      /**
       * The other names or aliases for the filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filtersynonyms)
       */
      override fun filterSynonyms(): List<String> = unwrap(this).getFilterSynonyms() ?: emptyList()

      /**
       * The type of the filter.
       *
       * Valid values for this structure are `CATEGORY_FILTER` , `NUMERIC_EQUALITY_FILTER` ,
       * `NUMERIC_RANGE_FILTER` , `DATE_RANGE_FILTER` , and `RELATIVE_DATE_FILTER` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-filtertype)
       */
      override fun filterType(): String? = unwrap(this).getFilterType()

      /**
       * The numeric equality filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-numericequalityfilter)
       */
      override fun numericEqualityFilter(): Any? = unwrap(this).getNumericEqualityFilter()

      /**
       * The numeric range filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-numericrangefilter)
       */
      override fun numericRangeFilter(): Any? = unwrap(this).getNumericRangeFilter()

      /**
       * The name of the field that the filter operates on.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-operandfieldname)
       */
      override fun operandFieldName(): String = unwrap(this).getOperandFieldName()

      /**
       * The relative date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicfilter.html#cfn-quicksight-topic-topicfilter-relativedatefilter)
       */
      override fun relativeDateFilter(): Any? = unwrap(this).getRelativeDateFilter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty):
          TopicFilterProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicFilterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicFilterProperty
    }
  }

  /**
   * A structure that represents a named entity.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicNamedEntityProperty topicNamedEntityProperty = TopicNamedEntityProperty.builder()
   * .entityName("entityName")
   * // the properties below are optional
   * .definition(List.of(NamedEntityDefinitionProperty.builder()
   * .fieldName("fieldName")
   * .metric(NamedEntityDefinitionMetricProperty.builder()
   * .aggregation("aggregation")
   * .aggregationFunctionParameters(Map.of(
   * "aggregationFunctionParametersKey", "aggregationFunctionParameters"))
   * .build())
   * .propertyName("propertyName")
   * .propertyRole("propertyRole")
   * .propertyUsage("propertyUsage")
   * .build()))
   * .entityDescription("entityDescription")
   * .entitySynonyms(List.of("entitySynonyms"))
   * .semanticEntityType(SemanticEntityTypeProperty.builder()
   * .subTypeName("subTypeName")
   * .typeName("typeName")
   * .typeParameters(Map.of(
   * "typeParametersKey", "typeParameters"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html)
   */
  public interface TopicNamedEntityProperty {
    /**
     * The definition of a named entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-definition)
     */
    public fun definition(): Any? = unwrap(this).getDefinition()

    /**
     * The description of the named entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-entitydescription)
     */
    public fun entityDescription(): String? = unwrap(this).getEntityDescription()

    /**
     * The name of the named entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-entityname)
     */
    public fun entityName(): String

    /**
     * The other names or aliases for the named entity.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-entitysynonyms)
     */
    public fun entitySynonyms(): List<String> = unwrap(this).getEntitySynonyms() ?: emptyList()

    /**
     * The type of named entity that a topic represents.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-semanticentitytype)
     */
    public fun semanticEntityType(): Any? = unwrap(this).getSemanticEntityType()

    /**
     * A builder for [TopicNamedEntityProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param definition The definition of a named entity.
       */
      public fun definition(definition: IResolvable)

      /**
       * @param definition The definition of a named entity.
       */
      public fun definition(definition: List<Any>)

      /**
       * @param definition The definition of a named entity.
       */
      public fun definition(vararg definition: Any)

      /**
       * @param entityDescription The description of the named entity.
       */
      public fun entityDescription(entityDescription: String)

      /**
       * @param entityName The name of the named entity. 
       */
      public fun entityName(entityName: String)

      /**
       * @param entitySynonyms The other names or aliases for the named entity.
       */
      public fun entitySynonyms(entitySynonyms: List<String>)

      /**
       * @param entitySynonyms The other names or aliases for the named entity.
       */
      public fun entitySynonyms(vararg entitySynonyms: String)

      /**
       * @param semanticEntityType The type of named entity that a topic represents.
       */
      public fun semanticEntityType(semanticEntityType: IResolvable)

      /**
       * @param semanticEntityType The type of named entity that a topic represents.
       */
      public fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty)

      /**
       * @param semanticEntityType The type of named entity that a topic represents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("237f7fc40c441778ee40745b5608f4130d7bd7bd0f0c343c89657f8020cffee7")
      public
          fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty.Builder =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty.builder()

      /**
       * @param definition The definition of a named entity.
       */
      override fun definition(definition: IResolvable) {
        cdkBuilder.definition(definition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param definition The definition of a named entity.
       */
      override fun definition(definition: List<Any>) {
        cdkBuilder.definition(definition.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param definition The definition of a named entity.
       */
      override fun definition(vararg definition: Any): Unit = definition(definition.toList())

      /**
       * @param entityDescription The description of the named entity.
       */
      override fun entityDescription(entityDescription: String) {
        cdkBuilder.entityDescription(entityDescription)
      }

      /**
       * @param entityName The name of the named entity. 
       */
      override fun entityName(entityName: String) {
        cdkBuilder.entityName(entityName)
      }

      /**
       * @param entitySynonyms The other names or aliases for the named entity.
       */
      override fun entitySynonyms(entitySynonyms: List<String>) {
        cdkBuilder.entitySynonyms(entitySynonyms)
      }

      /**
       * @param entitySynonyms The other names or aliases for the named entity.
       */
      override fun entitySynonyms(vararg entitySynonyms: String): Unit =
          entitySynonyms(entitySynonyms.toList())

      /**
       * @param semanticEntityType The type of named entity that a topic represents.
       */
      override fun semanticEntityType(semanticEntityType: IResolvable) {
        cdkBuilder.semanticEntityType(semanticEntityType.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param semanticEntityType The type of named entity that a topic represents.
       */
      override fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty) {
        cdkBuilder.semanticEntityType(semanticEntityType.let(SemanticEntityTypeProperty.Companion::unwrap))
      }

      /**
       * @param semanticEntityType The type of named entity that a topic represents.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("237f7fc40c441778ee40745b5608f4130d7bd7bd0f0c343c89657f8020cffee7")
      override
          fun semanticEntityType(semanticEntityType: SemanticEntityTypeProperty.Builder.() -> Unit):
          Unit = semanticEntityType(SemanticEntityTypeProperty(semanticEntityType))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty,
    ) : CdkObject(cdkObject),
        TopicNamedEntityProperty {
      /**
       * The definition of a named entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-definition)
       */
      override fun definition(): Any? = unwrap(this).getDefinition()

      /**
       * The description of the named entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-entitydescription)
       */
      override fun entityDescription(): String? = unwrap(this).getEntityDescription()

      /**
       * The name of the named entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-entityname)
       */
      override fun entityName(): String = unwrap(this).getEntityName()

      /**
       * The other names or aliases for the named entity.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-entitysynonyms)
       */
      override fun entitySynonyms(): List<String> = unwrap(this).getEntitySynonyms() ?: emptyList()

      /**
       * The type of named entity that a topic represents.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnamedentity.html#cfn-quicksight-topic-topicnamedentity-semanticentitytype)
       */
      override fun semanticEntityType(): Any? = unwrap(this).getSemanticEntityType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicNamedEntityProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty):
          TopicNamedEntityProperty = CdkObjectWrappers.wrap(cdkObject) as? TopicNamedEntityProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicNamedEntityProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNamedEntityProperty
    }
  }

  /**
   * A filter that filters topics based on the value of a numeric field.
   *
   * The filter includes only topics whose numeric field value matches the specified value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicNumericEqualityFilterProperty topicNumericEqualityFilterProperty =
   * TopicNumericEqualityFilterProperty.builder()
   * .aggregation("aggregation")
   * .constant(TopicSingularFilterConstantProperty.builder()
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericequalityfilter.html)
   */
  public interface TopicNumericEqualityFilterProperty {
    /**
     * An aggregation function that specifies how to calculate the value of a numeric field for a
     * topic.
     *
     * Valid values for this structure are `NO_AGGREGATION` , `SUM` , `AVERAGE` , `COUNT` ,
     * `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR` , and `VARP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericequalityfilter.html#cfn-quicksight-topic-topicnumericequalityfilter-aggregation)
     */
    public fun aggregation(): String? = unwrap(this).getAggregation()

    /**
     * The constant used in a numeric equality filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericequalityfilter.html#cfn-quicksight-topic-topicnumericequalityfilter-constant)
     */
    public fun constant(): Any? = unwrap(this).getConstant()

    /**
     * A builder for [TopicNumericEqualityFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregation An aggregation function that specifies how to calculate the value of a
       * numeric field for a topic.
       * Valid values for this structure are `NO_AGGREGATION` , `SUM` , `AVERAGE` , `COUNT` ,
       * `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR` , and `VARP` .
       */
      public fun aggregation(aggregation: String)

      /**
       * @param constant The constant used in a numeric equality filter.
       */
      public fun constant(constant: IResolvable)

      /**
       * @param constant The constant used in a numeric equality filter.
       */
      public fun constant(constant: TopicSingularFilterConstantProperty)

      /**
       * @param constant The constant used in a numeric equality filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7f41e4db3de4d7e641c35b55695083fa389e907ff7323c3edf14dee67c0711d")
      public fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty.builder()

      /**
       * @param aggregation An aggregation function that specifies how to calculate the value of a
       * numeric field for a topic.
       * Valid values for this structure are `NO_AGGREGATION` , `SUM` , `AVERAGE` , `COUNT` ,
       * `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR` , and `VARP` .
       */
      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      /**
       * @param constant The constant used in a numeric equality filter.
       */
      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a numeric equality filter.
       */
      override fun constant(constant: TopicSingularFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicSingularFilterConstantProperty.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a numeric equality filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c7f41e4db3de4d7e641c35b55695083fa389e907ff7323c3edf14dee67c0711d")
      override fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit): Unit
          = constant(TopicSingularFilterConstantProperty(constant))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty,
    ) : CdkObject(cdkObject),
        TopicNumericEqualityFilterProperty {
      /**
       * An aggregation function that specifies how to calculate the value of a numeric field for a
       * topic.
       *
       * Valid values for this structure are `NO_AGGREGATION` , `SUM` , `AVERAGE` , `COUNT` ,
       * `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR` , and `VARP` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericequalityfilter.html#cfn-quicksight-topic-topicnumericequalityfilter-aggregation)
       */
      override fun aggregation(): String? = unwrap(this).getAggregation()

      /**
       * The constant used in a numeric equality filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericequalityfilter.html#cfn-quicksight-topic-topicnumericequalityfilter-constant)
       */
      override fun constant(): Any? = unwrap(this).getConstant()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TopicNumericEqualityFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty):
          TopicNumericEqualityFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicNumericEqualityFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicNumericEqualityFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericEqualityFilterProperty
    }
  }

  /**
   * A filter that filters topics based on the value of a numeric field.
   *
   * The filter includes only topics whose numeric field value falls within the specified range.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicNumericRangeFilterProperty topicNumericRangeFilterProperty =
   * TopicNumericRangeFilterProperty.builder()
   * .aggregation("aggregation")
   * .constant(TopicRangeFilterConstantProperty.builder()
   * .constantType("constantType")
   * .rangeConstant(RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build())
   * .build())
   * .inclusive(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html)
   */
  public interface TopicNumericRangeFilterProperty {
    /**
     * An aggregation function that specifies how to calculate the value of a numeric field for a
     * topic, Valid values for this structure are `NO_AGGREGATION` , `SUM` , `AVERAGE` , `COUNT` ,
     * `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR` , and `VARP` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html#cfn-quicksight-topic-topicnumericrangefilter-aggregation)
     */
    public fun aggregation(): String? = unwrap(this).getAggregation()

    /**
     * The constant used in a numeric range filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html#cfn-quicksight-topic-topicnumericrangefilter-constant)
     */
    public fun constant(): Any? = unwrap(this).getConstant()

    /**
     * A Boolean value that indicates whether the endpoints of the numeric range are included in the
     * filter.
     *
     * If set to true, topics whose numeric field value is equal to the endpoint values will be
     * included in the filter. If set to false, topics whose numeric field value is equal to the
     * endpoint values will be excluded from the filter.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html#cfn-quicksight-topic-topicnumericrangefilter-inclusive)
     */
    public fun inclusive(): Any? = unwrap(this).getInclusive()

    /**
     * A builder for [TopicNumericRangeFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param aggregation An aggregation function that specifies how to calculate the value of a
       * numeric field for a topic, Valid values for this structure are `NO_AGGREGATION` , `SUM` ,
       * `AVERAGE` , `COUNT` , `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR`
       * , and `VARP` .
       */
      public fun aggregation(aggregation: String)

      /**
       * @param constant The constant used in a numeric range filter.
       */
      public fun constant(constant: IResolvable)

      /**
       * @param constant The constant used in a numeric range filter.
       */
      public fun constant(constant: TopicRangeFilterConstantProperty)

      /**
       * @param constant The constant used in a numeric range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e5ac0e2e3f48f707d07ad3b14a3c9eb9f6cf5479184c9a21794ea425b30f0bd")
      public fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit)

      /**
       * @param inclusive A Boolean value that indicates whether the endpoints of the numeric range
       * are included in the filter.
       * If set to true, topics whose numeric field value is equal to the endpoint values will be
       * included in the filter. If set to false, topics whose numeric field value is equal to the
       * endpoint values will be excluded from the filter.
       */
      public fun inclusive(inclusive: Boolean)

      /**
       * @param inclusive A Boolean value that indicates whether the endpoints of the numeric range
       * are included in the filter.
       * If set to true, topics whose numeric field value is equal to the endpoint values will be
       * included in the filter. If set to false, topics whose numeric field value is equal to the
       * endpoint values will be excluded from the filter.
       */
      public fun inclusive(inclusive: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty.builder()

      /**
       * @param aggregation An aggregation function that specifies how to calculate the value of a
       * numeric field for a topic, Valid values for this structure are `NO_AGGREGATION` , `SUM` ,
       * `AVERAGE` , `COUNT` , `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR`
       * , and `VARP` .
       */
      override fun aggregation(aggregation: String) {
        cdkBuilder.aggregation(aggregation)
      }

      /**
       * @param constant The constant used in a numeric range filter.
       */
      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a numeric range filter.
       */
      override fun constant(constant: TopicRangeFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicRangeFilterConstantProperty.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a numeric range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e5ac0e2e3f48f707d07ad3b14a3c9eb9f6cf5479184c9a21794ea425b30f0bd")
      override fun constant(constant: TopicRangeFilterConstantProperty.Builder.() -> Unit): Unit =
          constant(TopicRangeFilterConstantProperty(constant))

      /**
       * @param inclusive A Boolean value that indicates whether the endpoints of the numeric range
       * are included in the filter.
       * If set to true, topics whose numeric field value is equal to the endpoint values will be
       * included in the filter. If set to false, topics whose numeric field value is equal to the
       * endpoint values will be excluded from the filter.
       */
      override fun inclusive(inclusive: Boolean) {
        cdkBuilder.inclusive(inclusive)
      }

      /**
       * @param inclusive A Boolean value that indicates whether the endpoints of the numeric range
       * are included in the filter.
       * If set to true, topics whose numeric field value is equal to the endpoint values will be
       * included in the filter. If set to false, topics whose numeric field value is equal to the
       * endpoint values will be excluded from the filter.
       */
      override fun inclusive(inclusive: IResolvable) {
        cdkBuilder.inclusive(inclusive.let(IResolvable.Companion::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty,
    ) : CdkObject(cdkObject),
        TopicNumericRangeFilterProperty {
      /**
       * An aggregation function that specifies how to calculate the value of a numeric field for a
       * topic, Valid values for this structure are `NO_AGGREGATION` , `SUM` , `AVERAGE` , `COUNT` ,
       * `DISTINCT_COUNT` , `MAX` , `MEDIAN` , `MIN` , `STDEV` , `STDEVP` , `VAR` , and `VARP` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html#cfn-quicksight-topic-topicnumericrangefilter-aggregation)
       */
      override fun aggregation(): String? = unwrap(this).getAggregation()

      /**
       * The constant used in a numeric range filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html#cfn-quicksight-topic-topicnumericrangefilter-constant)
       */
      override fun constant(): Any? = unwrap(this).getConstant()

      /**
       * A Boolean value that indicates whether the endpoints of the numeric range are included in
       * the filter.
       *
       * If set to true, topics whose numeric field value is equal to the endpoint values will be
       * included in the filter. If set to false, topics whose numeric field value is equal to the
       * endpoint values will be excluded from the filter.
       *
       * Default: - false
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicnumericrangefilter.html#cfn-quicksight-topic-topicnumericrangefilter-inclusive)
       */
      override fun inclusive(): Any? = unwrap(this).getInclusive()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicNumericRangeFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty):
          TopicNumericRangeFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicNumericRangeFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicNumericRangeFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicNumericRangeFilterProperty
    }
  }

  /**
   * A constant value that is used in a range filter to specify the endpoints of the range.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicRangeFilterConstantProperty topicRangeFilterConstantProperty =
   * TopicRangeFilterConstantProperty.builder()
   * .constantType("constantType")
   * .rangeConstant(RangeConstantProperty.builder()
   * .maximum("maximum")
   * .minimum("minimum")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrangefilterconstant.html)
   */
  public interface TopicRangeFilterConstantProperty {
    /**
     * The data type of the constant value that is used in a range filter.
     *
     * Valid values for this structure are `RANGE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrangefilterconstant.html#cfn-quicksight-topic-topicrangefilterconstant-constanttype)
     */
    public fun constantType(): String? = unwrap(this).getConstantType()

    /**
     * The value of the constant that is used to specify the endpoints of a range filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrangefilterconstant.html#cfn-quicksight-topic-topicrangefilterconstant-rangeconstant)
     */
    public fun rangeConstant(): Any? = unwrap(this).getRangeConstant()

    /**
     * A builder for [TopicRangeFilterConstantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constantType The data type of the constant value that is used in a range filter.
       * Valid values for this structure are `RANGE` .
       */
      public fun constantType(constantType: String)

      /**
       * @param rangeConstant The value of the constant that is used to specify the endpoints of a
       * range filter.
       */
      public fun rangeConstant(rangeConstant: IResolvable)

      /**
       * @param rangeConstant The value of the constant that is used to specify the endpoints of a
       * range filter.
       */
      public fun rangeConstant(rangeConstant: RangeConstantProperty)

      /**
       * @param rangeConstant The value of the constant that is used to specify the endpoints of a
       * range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97cf8ccdda65102ae5018ee30183a928aba864c43c8f9919394add036487c283")
      public fun rangeConstant(rangeConstant: RangeConstantProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty.builder()

      /**
       * @param constantType The data type of the constant value that is used in a range filter.
       * Valid values for this structure are `RANGE` .
       */
      override fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
      }

      /**
       * @param rangeConstant The value of the constant that is used to specify the endpoints of a
       * range filter.
       */
      override fun rangeConstant(rangeConstant: IResolvable) {
        cdkBuilder.rangeConstant(rangeConstant.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param rangeConstant The value of the constant that is used to specify the endpoints of a
       * range filter.
       */
      override fun rangeConstant(rangeConstant: RangeConstantProperty) {
        cdkBuilder.rangeConstant(rangeConstant.let(RangeConstantProperty.Companion::unwrap))
      }

      /**
       * @param rangeConstant The value of the constant that is used to specify the endpoints of a
       * range filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97cf8ccdda65102ae5018ee30183a928aba864c43c8f9919394add036487c283")
      override fun rangeConstant(rangeConstant: RangeConstantProperty.Builder.() -> Unit): Unit =
          rangeConstant(RangeConstantProperty(rangeConstant))

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty,
    ) : CdkObject(cdkObject),
        TopicRangeFilterConstantProperty {
      /**
       * The data type of the constant value that is used in a range filter.
       *
       * Valid values for this structure are `RANGE` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrangefilterconstant.html#cfn-quicksight-topic-topicrangefilterconstant-constanttype)
       */
      override fun constantType(): String? = unwrap(this).getConstantType()

      /**
       * The value of the constant that is used to specify the endpoints of a range filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrangefilterconstant.html#cfn-quicksight-topic-topicrangefilterconstant-rangeconstant)
       */
      override fun rangeConstant(): Any? = unwrap(this).getRangeConstant()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicRangeFilterConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty):
          TopicRangeFilterConstantProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicRangeFilterConstantProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicRangeFilterConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRangeFilterConstantProperty
    }
  }

  /**
   * A structure that represents a relative date filter.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicRelativeDateFilterProperty topicRelativeDateFilterProperty =
   * TopicRelativeDateFilterProperty.builder()
   * .constant(TopicSingularFilterConstantProperty.builder()
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build())
   * .relativeDateFilterFunction("relativeDateFilterFunction")
   * .timeGranularity("timeGranularity")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrelativedatefilter.html)
   */
  public interface TopicRelativeDateFilterProperty {
    /**
     * The constant used in a relative date filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrelativedatefilter.html#cfn-quicksight-topic-topicrelativedatefilter-constant)
     */
    public fun constant(): Any? = unwrap(this).getConstant()

    /**
     * The function to be used in a relative date filter to determine the range of dates to include
     * in the results.
     *
     * Valid values for this structure are `BEFORE` , `AFTER` , and `BETWEEN` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrelativedatefilter.html#cfn-quicksight-topic-topicrelativedatefilter-relativedatefilterfunction)
     */
    public fun relativeDateFilterFunction(): String? = unwrap(this).getRelativeDateFilterFunction()

    /**
     * The level of time precision that is used to aggregate `DateTime` values.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrelativedatefilter.html#cfn-quicksight-topic-topicrelativedatefilter-timegranularity)
     */
    public fun timeGranularity(): String? = unwrap(this).getTimeGranularity()

    /**
     * A builder for [TopicRelativeDateFilterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constant The constant used in a relative date filter.
       */
      public fun constant(constant: IResolvable)

      /**
       * @param constant The constant used in a relative date filter.
       */
      public fun constant(constant: TopicSingularFilterConstantProperty)

      /**
       * @param constant The constant used in a relative date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05289c4088c7296a59d5b7d53ab352f30003725c9b06b4bb4adf6e6249d8afeb")
      public fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit)

      /**
       * @param relativeDateFilterFunction The function to be used in a relative date filter to
       * determine the range of dates to include in the results.
       * Valid values for this structure are `BEFORE` , `AFTER` , and `BETWEEN` .
       */
      public fun relativeDateFilterFunction(relativeDateFilterFunction: String)

      /**
       * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
       * values.
       */
      public fun timeGranularity(timeGranularity: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty.builder()

      /**
       * @param constant The constant used in a relative date filter.
       */
      override fun constant(constant: IResolvable) {
        cdkBuilder.constant(constant.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a relative date filter.
       */
      override fun constant(constant: TopicSingularFilterConstantProperty) {
        cdkBuilder.constant(constant.let(TopicSingularFilterConstantProperty.Companion::unwrap))
      }

      /**
       * @param constant The constant used in a relative date filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("05289c4088c7296a59d5b7d53ab352f30003725c9b06b4bb4adf6e6249d8afeb")
      override fun constant(constant: TopicSingularFilterConstantProperty.Builder.() -> Unit): Unit
          = constant(TopicSingularFilterConstantProperty(constant))

      /**
       * @param relativeDateFilterFunction The function to be used in a relative date filter to
       * determine the range of dates to include in the results.
       * Valid values for this structure are `BEFORE` , `AFTER` , and `BETWEEN` .
       */
      override fun relativeDateFilterFunction(relativeDateFilterFunction: String) {
        cdkBuilder.relativeDateFilterFunction(relativeDateFilterFunction)
      }

      /**
       * @param timeGranularity The level of time precision that is used to aggregate `DateTime`
       * values.
       */
      override fun timeGranularity(timeGranularity: String) {
        cdkBuilder.timeGranularity(timeGranularity)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty,
    ) : CdkObject(cdkObject),
        TopicRelativeDateFilterProperty {
      /**
       * The constant used in a relative date filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrelativedatefilter.html#cfn-quicksight-topic-topicrelativedatefilter-constant)
       */
      override fun constant(): Any? = unwrap(this).getConstant()

      /**
       * The function to be used in a relative date filter to determine the range of dates to
       * include in the results.
       *
       * Valid values for this structure are `BEFORE` , `AFTER` , and `BETWEEN` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrelativedatefilter.html#cfn-quicksight-topic-topicrelativedatefilter-relativedatefilterfunction)
       */
      override fun relativeDateFilterFunction(): String? =
          unwrap(this).getRelativeDateFilterFunction()

      /**
       * The level of time precision that is used to aggregate `DateTime` values.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicrelativedatefilter.html#cfn-quicksight-topic-topicrelativedatefilter-timegranularity)
       */
      override fun timeGranularity(): String? = unwrap(this).getTimeGranularity()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TopicRelativeDateFilterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty):
          TopicRelativeDateFilterProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicRelativeDateFilterProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicRelativeDateFilterProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicRelativeDateFilterProperty
    }
  }

  /**
   * A structure that represents a singular filter constant, used in filters to specify a single
   * value to match against.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.quicksight.*;
   * TopicSingularFilterConstantProperty topicSingularFilterConstantProperty =
   * TopicSingularFilterConstantProperty.builder()
   * .constantType("constantType")
   * .singularConstant("singularConstant")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicsingularfilterconstant.html)
   */
  public interface TopicSingularFilterConstantProperty {
    /**
     * The type of the singular filter constant.
     *
     * Valid values for this structure are `SINGULAR` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicsingularfilterconstant.html#cfn-quicksight-topic-topicsingularfilterconstant-constanttype)
     */
    public fun constantType(): String? = unwrap(this).getConstantType()

    /**
     * The value of the singular filter constant.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicsingularfilterconstant.html#cfn-quicksight-topic-topicsingularfilterconstant-singularconstant)
     */
    public fun singularConstant(): String? = unwrap(this).getSingularConstant()

    /**
     * A builder for [TopicSingularFilterConstantProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param constantType The type of the singular filter constant.
       * Valid values for this structure are `SINGULAR` .
       */
      public fun constantType(constantType: String)

      /**
       * @param singularConstant The value of the singular filter constant.
       */
      public fun singularConstant(singularConstant: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty.Builder
          =
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty.builder()

      /**
       * @param constantType The type of the singular filter constant.
       * Valid values for this structure are `SINGULAR` .
       */
      override fun constantType(constantType: String) {
        cdkBuilder.constantType(constantType)
      }

      /**
       * @param singularConstant The value of the singular filter constant.
       */
      override fun singularConstant(singularConstant: String) {
        cdkBuilder.singularConstant(singularConstant)
      }

      public fun build():
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty,
    ) : CdkObject(cdkObject),
        TopicSingularFilterConstantProperty {
      /**
       * The type of the singular filter constant.
       *
       * Valid values for this structure are `SINGULAR` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicsingularfilterconstant.html#cfn-quicksight-topic-topicsingularfilterconstant-constanttype)
       */
      override fun constantType(): String? = unwrap(this).getConstantType()

      /**
       * The value of the singular filter constant.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-topic-topicsingularfilterconstant.html#cfn-quicksight-topic-topicsingularfilterconstant-singularconstant)
       */
      override fun singularConstant(): String? = unwrap(this).getSingularConstant()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TopicSingularFilterConstantProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty):
          TopicSingularFilterConstantProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TopicSingularFilterConstantProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TopicSingularFilterConstantProperty):
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.quicksight.CfnTopic.TopicSingularFilterConstantProperty
    }
  }
}
