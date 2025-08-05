@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.databrew

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Specifies a new DataBrew dataset.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.databrew.*;
 * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
 * .input(InputProperty.builder()
 * .databaseInputDefinition(DatabaseInputDefinitionProperty.builder()
 * .glueConnectionName("glueConnectionName")
 * // the properties below are optional
 * .databaseTableName("databaseTableName")
 * .queryString("queryString")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .tableName("tableName")
 * .tempDirectory(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .metadata(MetadataProperty.builder()
 * .sourceArn("sourceArn")
 * .build())
 * .s3InputDefinition(S3LocationProperty.builder()
 * .bucket("bucket")
 * // the properties below are optional
 * .bucketOwner("bucketOwner")
 * .key("key")
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .format("format")
 * .formatOptions(FormatOptionsProperty.builder()
 * .csv(CsvOptionsProperty.builder()
 * .delimiter("delimiter")
 * .headerRow(false)
 * .build())
 * .excel(ExcelOptionsProperty.builder()
 * .headerRow(false)
 * .sheetIndexes(List.of(123))
 * .sheetNames(List.of("sheetNames"))
 * .build())
 * .json(JsonOptionsProperty.builder()
 * .multiLine(false)
 * .build())
 * .build())
 * .pathOptions(PathOptionsProperty.builder()
 * .filesLimit(FilesLimitProperty.builder()
 * .maxFiles(123)
 * // the properties below are optional
 * .order("order")
 * .orderedBy("orderedBy")
 * .build())
 * .lastModifiedDateCondition(FilterExpressionProperty.builder()
 * .expression("expression")
 * .valuesMap(List.of(FilterValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build()))
 * .build())
 * .parameters(List.of(PathParameterProperty.builder()
 * .datasetParameter(DatasetParameterProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .createColumn(false)
 * .datetimeOptions(DatetimeOptionsProperty.builder()
 * .format("format")
 * // the properties below are optional
 * .localeCode("localeCode")
 * .timezoneOffset("timezoneOffset")
 * .build())
 * .filter(FilterExpressionProperty.builder()
 * .expression("expression")
 * .valuesMap(List.of(FilterValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build()))
 * .build())
 * .build())
 * .pathParameterName("pathParameterName")
 * .build()))
 * .build())
 * .source("source")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html)
 */
public open class CfnDataset(
  cdkObject: software.amazon.awscdk.services.databrew.CfnDataset,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatasetProps,
  ) :
      this(software.amazon.awscdk.services.databrew.CfnDataset(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnDatasetProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatasetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDatasetProps(props)
  )

  /**
   * The file format of a dataset that is created from an Amazon S3 file or folder.
   */
  public open fun format(): String? = unwrap(this).getFormat()

  /**
   * The file format of a dataset that is created from an Amazon S3 file or folder.
   */
  public open fun format(`value`: String) {
    unwrap(this).setFormat(`value`)
  }

  /**
   * A set of options that define how DataBrew interprets the data in the dataset.
   */
  public open fun formatOptions(): Any? = unwrap(this).getFormatOptions()

  /**
   * A set of options that define how DataBrew interprets the data in the dataset.
   */
  public open fun formatOptions(`value`: IResolvable) {
    unwrap(this).setFormatOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of options that define how DataBrew interprets the data in the dataset.
   */
  public open fun formatOptions(`value`: FormatOptionsProperty) {
    unwrap(this).setFormatOptions(`value`.let(FormatOptionsProperty.Companion::unwrap))
  }

  /**
   * A set of options that define how DataBrew interprets the data in the dataset.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("9856ead397ebcfc0daf8e83b03cfdbabebfe9591d1266ef8b00d0b5edb523426")
  public open fun formatOptions(`value`: FormatOptionsProperty.Builder.() -> Unit): Unit =
      formatOptions(FormatOptionsProperty(`value`))

  /**
   * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
   * S3 .
   */
  public open fun input(): Any = unwrap(this).getInput()

  /**
   * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
   * S3 .
   */
  public open fun input(`value`: IResolvable) {
    unwrap(this).setInput(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
   * S3 .
   */
  public open fun input(`value`: InputProperty) {
    unwrap(this).setInput(`value`.let(InputProperty.Companion::unwrap))
  }

  /**
   * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or Amazon
   * S3 .
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("3c30da00069ffc60c74e203893a6eebdc5bfc21690ef51ebd8970470d2c9464b")
  public open fun input(`value`: InputProperty.Builder.() -> Unit): Unit =
      input(InputProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * The unique name of the dataset.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The unique name of the dataset.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
   */
  public open fun pathOptions(): Any? = unwrap(this).getPathOptions()

  /**
   * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
   */
  public open fun pathOptions(`value`: IResolvable) {
    unwrap(this).setPathOptions(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
   */
  public open fun pathOptions(`value`: PathOptionsProperty) {
    unwrap(this).setPathOptions(`value`.let(PathOptionsProperty.Companion::unwrap))
  }

  /**
   * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a3356374cd5e60b3bc81c4b2bf08f3dded5b927e1f8137ec654c0bee90b88b55")
  public open fun pathOptions(`value`: PathOptionsProperty.Builder.() -> Unit): Unit =
      pathOptions(PathOptionsProperty(`value`))

  /**
   * The location of the data for the dataset, either Amazon S3 or the AWS Glue Data Catalog .
   */
  public open fun source(): String? = unwrap(this).getSource()

  /**
   * The location of the data for the dataset, either Amazon S3 or the AWS Glue Data Catalog .
   */
  public open fun source(`value`: String) {
    unwrap(this).setSource(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Metadata tags that have been applied to the dataset.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Metadata tags that have been applied to the dataset.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * Metadata tags that have been applied to the dataset.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.databrew.CfnDataset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-format)
     * @param format The file format of a dataset that is created from an Amazon S3 file or folder. 
     */
    public fun format(format: String)

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset. 
     */
    public fun formatOptions(formatOptions: IResolvable)

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset. 
     */
    public fun formatOptions(formatOptions: FormatOptionsProperty)

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("874cb260c136b29df923454625d2ac47f83ded0a0beb8f9a1850b1e04aa32710")
    public fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit)

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    public fun input(input: IResolvable)

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    public fun input(input: InputProperty)

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("108d2365f7c1682fc89f15b96a6c32ce2fc142101de56356163530b012e3dfcc")
    public fun input(input: InputProperty.Builder.() -> Unit)

    /**
     * The unique name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-name)
     * @param name The unique name of the dataset. 
     */
    public fun name(name: String)

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset. 
     */
    public fun pathOptions(pathOptions: IResolvable)

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset. 
     */
    public fun pathOptions(pathOptions: PathOptionsProperty)

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ee845b91bbaf56745c111be9c1c7fc34dd4099fd53d16d1a5ed80e500402178")
    public fun pathOptions(pathOptions: PathOptionsProperty.Builder.() -> Unit)

    /**
     * The location of the data for the dataset, either Amazon S3 or the AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-source)
     * @param source The location of the data for the dataset, either Amazon S3 or the AWS Glue Data
     * Catalog . 
     */
    public fun source(source: String)

    /**
     * Metadata tags that have been applied to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
     * @param tags Metadata tags that have been applied to the dataset. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Metadata tags that have been applied to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
     * @param tags Metadata tags that have been applied to the dataset. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.databrew.CfnDataset.Builder =
        software.amazon.awscdk.services.databrew.CfnDataset.Builder.create(scope, id)

    /**
     * The file format of a dataset that is created from an Amazon S3 file or folder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-format)
     * @param format The file format of a dataset that is created from an Amazon S3 file or folder. 
     */
    override fun format(format: String) {
      cdkBuilder.format(format)
    }

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset. 
     */
    override fun formatOptions(formatOptions: IResolvable) {
      cdkBuilder.formatOptions(formatOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset. 
     */
    override fun formatOptions(formatOptions: FormatOptionsProperty) {
      cdkBuilder.formatOptions(formatOptions.let(FormatOptionsProperty.Companion::unwrap))
    }

    /**
     * A set of options that define how DataBrew interprets the data in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-formatoptions)
     * @param formatOptions A set of options that define how DataBrew interprets the data in the
     * dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("874cb260c136b29df923454625d2ac47f83ded0a0beb8f9a1850b1e04aa32710")
    override fun formatOptions(formatOptions: FormatOptionsProperty.Builder.() -> Unit): Unit =
        formatOptions(FormatOptionsProperty(formatOptions))

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    override fun input(input: IResolvable) {
      cdkBuilder.input(input.let(IResolvable.Companion::unwrap))
    }

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    override fun input(input: InputProperty) {
      cdkBuilder.input(input.let(InputProperty.Companion::unwrap))
    }

    /**
     * Information on how DataBrew can find the dataset, in either the AWS Glue Data Catalog or
     * Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-input)
     * @param input Information on how DataBrew can find the dataset, in either the AWS Glue Data
     * Catalog or Amazon S3 . 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("108d2365f7c1682fc89f15b96a6c32ce2fc142101de56356163530b012e3dfcc")
    override fun input(input: InputProperty.Builder.() -> Unit): Unit = input(InputProperty(input))

    /**
     * The unique name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-name)
     * @param name The unique name of the dataset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset. 
     */
    override fun pathOptions(pathOptions: IResolvable) {
      cdkBuilder.pathOptions(pathOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset. 
     */
    override fun pathOptions(pathOptions: PathOptionsProperty) {
      cdkBuilder.pathOptions(pathOptions.let(PathOptionsProperty.Companion::unwrap))
    }

    /**
     * A set of options that defines how DataBrew interprets an Amazon S3 path of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-pathoptions)
     * @param pathOptions A set of options that defines how DataBrew interprets an Amazon S3 path of
     * the dataset. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3ee845b91bbaf56745c111be9c1c7fc34dd4099fd53d16d1a5ed80e500402178")
    override fun pathOptions(pathOptions: PathOptionsProperty.Builder.() -> Unit): Unit =
        pathOptions(PathOptionsProperty(pathOptions))

    /**
     * The location of the data for the dataset, either Amazon S3 or the AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-source)
     * @param source The location of the data for the dataset, either Amazon S3 or the AWS Glue Data
     * Catalog . 
     */
    override fun source(source: String) {
      cdkBuilder.source(source)
    }

    /**
     * Metadata tags that have been applied to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
     * @param tags Metadata tags that have been applied to the dataset. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * Metadata tags that have been applied to the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-databrew-dataset.html#cfn-databrew-dataset-tags)
     * @param tags Metadata tags that have been applied to the dataset. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.databrew.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.databrew.CfnDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset): CfnDataset =
        CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.databrew.CfnDataset =
        wrapped.cdkObject as software.amazon.awscdk.services.databrew.CfnDataset
  }

  /**
   * Represents a set of options that define how DataBrew will read a comma-separated value (CSV)
   * file when creating a dataset from that file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * CsvOptionsProperty csvOptionsProperty = CsvOptionsProperty.builder()
   * .delimiter("delimiter")
   * .headerRow(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-csvoptions.html)
   */
  public interface CsvOptionsProperty {
    /**
     * A single character that specifies the delimiter being used in the CSV file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-csvoptions.html#cfn-databrew-dataset-csvoptions-delimiter)
     */
    public fun delimiter(): String? = unwrap(this).getDelimiter()

    /**
     * A variable that specifies whether the first row in the file is parsed as the header.
     *
     * If this value is false, column names are auto-generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-csvoptions.html#cfn-databrew-dataset-csvoptions-headerrow)
     */
    public fun headerRow(): Any? = unwrap(this).getHeaderRow()

    /**
     * A builder for [CsvOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param delimiter A single character that specifies the delimiter being used in the CSV
       * file.
       */
      public fun delimiter(delimiter: String)

      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      public fun headerRow(headerRow: Boolean)

      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      public fun headerRow(headerRow: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty.builder()

      /**
       * @param delimiter A single character that specifies the delimiter being used in the CSV
       * file.
       */
      override fun delimiter(delimiter: String) {
        cdkBuilder.delimiter(delimiter)
      }

      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      override fun headerRow(headerRow: Boolean) {
        cdkBuilder.headerRow(headerRow)
      }

      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      override fun headerRow(headerRow: IResolvable) {
        cdkBuilder.headerRow(headerRow.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty,
    ) : CdkObject(cdkObject),
        CsvOptionsProperty {
      /**
       * A single character that specifies the delimiter being used in the CSV file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-csvoptions.html#cfn-databrew-dataset-csvoptions-delimiter)
       */
      override fun delimiter(): String? = unwrap(this).getDelimiter()

      /**
       * A variable that specifies whether the first row in the file is parsed as the header.
       *
       * If this value is false, column names are auto-generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-csvoptions.html#cfn-databrew-dataset-csvoptions-headerrow)
       */
      override fun headerRow(): Any? = unwrap(this).getHeaderRow()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CsvOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty):
          CsvOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? CsvOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: CsvOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.CsvOptionsProperty
    }
  }

  /**
   * Represents how metadata stored in the AWS Glue Data Catalog is defined in a DataBrew dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DataCatalogInputDefinitionProperty dataCatalogInputDefinitionProperty =
   * DataCatalogInputDefinitionProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html)
   */
  public interface DataCatalogInputDefinitionProperty {
    /**
     * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of a database in the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The name of a database table in the Data Catalog.
     *
     * This table corresponds to a DataBrew dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-tablename)
     */
    public fun tableName(): String? = unwrap(this).getTableName()

    /**
     * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-tempdirectory)
     */
    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    /**
     * A builder for [DataCatalogInputDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
       * stores the data.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName The name of a database in the Data Catalog.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param tableName The name of a database table in the Data Catalog.
       * This table corresponds to a DataBrew dataset.
       */
      public fun tableName(tableName: String)

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      public fun tempDirectory(tempDirectory: IResolvable)

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      public fun tempDirectory(tempDirectory: S3LocationProperty)

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db5116f34f01063a17d9e354c340b74563e60bf4041273549ecb5f743554a02")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty.builder()

      /**
       * @param catalogId The unique identifier of the AWS account that holds the Data Catalog that
       * stores the data.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName The name of a database in the Data Catalog.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param tableName The name of a database table in the Data Catalog.
       * This table corresponds to a DataBrew dataset.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7db5116f34f01063a17d9e354c340b74563e60bf4041273549ecb5f743554a02")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty,
    ) : CdkObject(cdkObject),
        DataCatalogInputDefinitionProperty {
      /**
       * The unique identifier of the AWS account that holds the Data Catalog that stores the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of a database in the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The name of a database table in the Data Catalog.
       *
       * This table corresponds to a DataBrew dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-tablename)
       */
      override fun tableName(): String? = unwrap(this).getTableName()

      /**
       * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datacataloginputdefinition.html#cfn-databrew-dataset-datacataloginputdefinition-tempdirectory)
       */
      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DataCatalogInputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty):
          DataCatalogInputDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataCatalogInputDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCatalogInputDefinitionProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.DataCatalogInputDefinitionProperty
    }
  }

  /**
   * Connection information for dataset input files stored in a database.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DatabaseInputDefinitionProperty databaseInputDefinitionProperty =
   * DatabaseInputDefinitionProperty.builder()
   * .glueConnectionName("glueConnectionName")
   * // the properties below are optional
   * .databaseTableName("databaseTableName")
   * .queryString("queryString")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html)
   */
  public interface DatabaseInputDefinitionProperty {
    /**
     * The table within the target database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-databasetablename)
     */
    public fun databaseTableName(): String? = unwrap(this).getDatabaseTableName()

    /**
     * The AWS Glue Connection that stores the connection information for the target database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-glueconnectionname)
     */
    public fun glueConnectionName(): String

    /**
     * Custom SQL to run against the provided AWS Glue connection.
     *
     * This SQL will be used as the input for DataBrew projects and jobs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-querystring)
     */
    public fun queryString(): String? = unwrap(this).getQueryString()

    /**
     * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-tempdirectory)
     */
    public fun tempDirectory(): Any? = unwrap(this).getTempDirectory()

    /**
     * A builder for [DatabaseInputDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseTableName The table within the target database.
       */
      public fun databaseTableName(databaseTableName: String)

      /**
       * @param glueConnectionName The AWS Glue Connection that stores the connection information
       * for the target database. 
       */
      public fun glueConnectionName(glueConnectionName: String)

      /**
       * @param queryString Custom SQL to run against the provided AWS Glue connection.
       * This SQL will be used as the input for DataBrew projects and jobs.
       */
      public fun queryString(queryString: String)

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      public fun tempDirectory(tempDirectory: IResolvable)

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      public fun tempDirectory(tempDirectory: S3LocationProperty)

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d380b9aa4c10bb6f287271ebf8c3dd1d2ab5523fbe21bf543e78c7f770fd5ec6")
      public fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty.builder()

      /**
       * @param databaseTableName The table within the target database.
       */
      override fun databaseTableName(databaseTableName: String) {
        cdkBuilder.databaseTableName(databaseTableName)
      }

      /**
       * @param glueConnectionName The AWS Glue Connection that stores the connection information
       * for the target database. 
       */
      override fun glueConnectionName(glueConnectionName: String) {
        cdkBuilder.glueConnectionName(glueConnectionName)
      }

      /**
       * @param queryString Custom SQL to run against the provided AWS Glue connection.
       * This SQL will be used as the input for DataBrew projects and jobs.
       */
      override fun queryString(queryString: String) {
        cdkBuilder.queryString(queryString)
      }

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      override fun tempDirectory(tempDirectory: IResolvable) {
        cdkBuilder.tempDirectory(tempDirectory.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      override fun tempDirectory(tempDirectory: S3LocationProperty) {
        cdkBuilder.tempDirectory(tempDirectory.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param tempDirectory An Amazon location that AWS Glue Data Catalog can use as a temporary
       * directory.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d380b9aa4c10bb6f287271ebf8c3dd1d2ab5523fbe21bf543e78c7f770fd5ec6")
      override fun tempDirectory(tempDirectory: S3LocationProperty.Builder.() -> Unit): Unit =
          tempDirectory(S3LocationProperty(tempDirectory))

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty,
    ) : CdkObject(cdkObject),
        DatabaseInputDefinitionProperty {
      /**
       * The table within the target database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-databasetablename)
       */
      override fun databaseTableName(): String? = unwrap(this).getDatabaseTableName()

      /**
       * The AWS Glue Connection that stores the connection information for the target database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-glueconnectionname)
       */
      override fun glueConnectionName(): String = unwrap(this).getGlueConnectionName()

      /**
       * Custom SQL to run against the provided AWS Glue connection.
       *
       * This SQL will be used as the input for DataBrew projects and jobs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-querystring)
       */
      override fun queryString(): String? = unwrap(this).getQueryString()

      /**
       * An Amazon location that AWS Glue Data Catalog can use as a temporary directory.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-databaseinputdefinition.html#cfn-databrew-dataset-databaseinputdefinition-tempdirectory)
       */
      override fun tempDirectory(): Any? = unwrap(this).getTempDirectory()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInputDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty):
          DatabaseInputDefinitionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DatabaseInputDefinitionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseInputDefinitionProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.DatabaseInputDefinitionProperty
    }
  }

  /**
   * Represents a dataset paramater that defines type and conditions for a parameter in the Amazon
   * S3 path of the dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DatasetParameterProperty datasetParameterProperty = DatasetParameterProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .createColumn(false)
   * .datetimeOptions(DatetimeOptionsProperty.builder()
   * .format("format")
   * // the properties below are optional
   * .localeCode("localeCode")
   * .timezoneOffset("timezoneOffset")
   * .build())
   * .filter(FilterExpressionProperty.builder()
   * .expression("expression")
   * .valuesMap(List.of(FilterValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build()))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html)
   */
  public interface DatasetParameterProperty {
    /**
     * Optional boolean value that defines whether the captured value of this parameter should be
     * loaded as an additional column in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-createcolumn)
     */
    public fun createColumn(): Any? = unwrap(this).getCreateColumn()

    /**
     * Additional parameter options such as a format and a timezone.
     *
     * Required for datetime parameters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-datetimeoptions)
     */
    public fun datetimeOptions(): Any? = unwrap(this).getDatetimeOptions()

    /**
     * The optional filter expression structure to apply additional matching criteria to the
     * parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-filter)
     */
    public fun filter(): Any? = unwrap(this).getFilter()

    /**
     * The name of the parameter that is used in the dataset's Amazon S3 path.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-name)
     */
    public fun name(): String

    /**
     * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-type)
     */
    public fun type(): String

    /**
     * A builder for [DatasetParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param createColumn Optional boolean value that defines whether the captured value of this
       * parameter should be loaded as an additional column in the dataset.
       */
      public fun createColumn(createColumn: Boolean)

      /**
       * @param createColumn Optional boolean value that defines whether the captured value of this
       * parameter should be loaded as an additional column in the dataset.
       */
      public fun createColumn(createColumn: IResolvable)

      /**
       * @param datetimeOptions Additional parameter options such as a format and a timezone.
       * Required for datetime parameters.
       */
      public fun datetimeOptions(datetimeOptions: IResolvable)

      /**
       * @param datetimeOptions Additional parameter options such as a format and a timezone.
       * Required for datetime parameters.
       */
      public fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty)

      /**
       * @param datetimeOptions Additional parameter options such as a format and a timezone.
       * Required for datetime parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65a6693a7649a5bea13eff57488531548e480e904d0e34b14bccc2e10bfe22a1")
      public fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty.Builder.() -> Unit)

      /**
       * @param filter The optional filter expression structure to apply additional matching
       * criteria to the parameter.
       */
      public fun filter(filter: IResolvable)

      /**
       * @param filter The optional filter expression structure to apply additional matching
       * criteria to the parameter.
       */
      public fun filter(filter: FilterExpressionProperty)

      /**
       * @param filter The optional filter expression structure to apply additional matching
       * criteria to the parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("060097b92684df8d43ad40538370f633df18b34aab4452e06dbe5e5f69c7955f")
      public fun filter(filter: FilterExpressionProperty.Builder.() -> Unit)

      /**
       * @param name The name of the parameter that is used in the dataset's Amazon S3 path. 
       */
      public fun name(name: String)

      /**
       * @param type The type of the dataset parameter, can be one of a 'String', 'Number' or
       * 'Datetime'. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty.builder()

      /**
       * @param createColumn Optional boolean value that defines whether the captured value of this
       * parameter should be loaded as an additional column in the dataset.
       */
      override fun createColumn(createColumn: Boolean) {
        cdkBuilder.createColumn(createColumn)
      }

      /**
       * @param createColumn Optional boolean value that defines whether the captured value of this
       * parameter should be loaded as an additional column in the dataset.
       */
      override fun createColumn(createColumn: IResolvable) {
        cdkBuilder.createColumn(createColumn.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param datetimeOptions Additional parameter options such as a format and a timezone.
       * Required for datetime parameters.
       */
      override fun datetimeOptions(datetimeOptions: IResolvable) {
        cdkBuilder.datetimeOptions(datetimeOptions.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param datetimeOptions Additional parameter options such as a format and a timezone.
       * Required for datetime parameters.
       */
      override fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty) {
        cdkBuilder.datetimeOptions(datetimeOptions.let(DatetimeOptionsProperty.Companion::unwrap))
      }

      /**
       * @param datetimeOptions Additional parameter options such as a format and a timezone.
       * Required for datetime parameters.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("65a6693a7649a5bea13eff57488531548e480e904d0e34b14bccc2e10bfe22a1")
      override fun datetimeOptions(datetimeOptions: DatetimeOptionsProperty.Builder.() -> Unit):
          Unit = datetimeOptions(DatetimeOptionsProperty(datetimeOptions))

      /**
       * @param filter The optional filter expression structure to apply additional matching
       * criteria to the parameter.
       */
      override fun filter(filter: IResolvable) {
        cdkBuilder.filter(filter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filter The optional filter expression structure to apply additional matching
       * criteria to the parameter.
       */
      override fun filter(filter: FilterExpressionProperty) {
        cdkBuilder.filter(filter.let(FilterExpressionProperty.Companion::unwrap))
      }

      /**
       * @param filter The optional filter expression structure to apply additional matching
       * criteria to the parameter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("060097b92684df8d43ad40538370f633df18b34aab4452e06dbe5e5f69c7955f")
      override fun filter(filter: FilterExpressionProperty.Builder.() -> Unit): Unit =
          filter(FilterExpressionProperty(filter))

      /**
       * @param name The name of the parameter that is used in the dataset's Amazon S3 path. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param type The type of the dataset parameter, can be one of a 'String', 'Number' or
       * 'Datetime'. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty,
    ) : CdkObject(cdkObject),
        DatasetParameterProperty {
      /**
       * Optional boolean value that defines whether the captured value of this parameter should be
       * loaded as an additional column in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-createcolumn)
       */
      override fun createColumn(): Any? = unwrap(this).getCreateColumn()

      /**
       * Additional parameter options such as a format and a timezone.
       *
       * Required for datetime parameters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-datetimeoptions)
       */
      override fun datetimeOptions(): Any? = unwrap(this).getDatetimeOptions()

      /**
       * The optional filter expression structure to apply additional matching criteria to the
       * parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-filter)
       */
      override fun filter(): Any? = unwrap(this).getFilter()

      /**
       * The name of the parameter that is used in the dataset's Amazon S3 path.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of the dataset parameter, can be one of a 'String', 'Number' or 'Datetime'.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datasetparameter.html#cfn-databrew-dataset-datasetparameter-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty):
          DatasetParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? DatasetParameterProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetParameterProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.DatasetParameterProperty
    }
  }

  /**
   * Represents additional options for correct interpretation of datetime parameters used in the
   * Amazon S3 path of a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * DatetimeOptionsProperty datetimeOptionsProperty = DatetimeOptionsProperty.builder()
   * .format("format")
   * // the properties below are optional
   * .localeCode("localeCode")
   * .timezoneOffset("timezoneOffset")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html)
   */
  public interface DatetimeOptionsProperty {
    /**
     * Required option, that defines the datetime format used for a date parameter in the Amazon S3
     * path.
     *
     * Should use only supported datetime specifiers and separation characters, all litera a-z or
     * A-Z character should be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html#cfn-databrew-dataset-datetimeoptions-format)
     */
    public fun format(): String

    /**
     * Optional value for a non-US locale code, needed for correct interpretation of some date
     * formats.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html#cfn-databrew-dataset-datetimeoptions-localecode)
     */
    public fun localeCode(): String? = unwrap(this).getLocaleCode()

    /**
     * Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path.
     *
     * Shouldn't be used if Format for this parameter includes timezone fields. If no offset
     * specified, UTC is assumed.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html#cfn-databrew-dataset-datetimeoptions-timezoneoffset)
     */
    public fun timezoneOffset(): String? = unwrap(this).getTimezoneOffset()

    /**
     * A builder for [DatetimeOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param format Required option, that defines the datetime format used for a date parameter
       * in the Amazon S3 path. 
       * Should use only supported datetime specifiers and separation characters, all litera a-z or
       * A-Z character should be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
       */
      public fun format(format: String)

      /**
       * @param localeCode Optional value for a non-US locale code, needed for correct
       * interpretation of some date formats.
       */
      public fun localeCode(localeCode: String)

      /**
       * @param timezoneOffset Optional value for a timezone offset of the datetime parameter value
       * in the Amazon S3 path.
       * Shouldn't be used if Format for this parameter includes timezone fields. If no offset
       * specified, UTC is assumed.
       */
      public fun timezoneOffset(timezoneOffset: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty.builder()

      /**
       * @param format Required option, that defines the datetime format used for a date parameter
       * in the Amazon S3 path. 
       * Should use only supported datetime specifiers and separation characters, all litera a-z or
       * A-Z character should be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param localeCode Optional value for a non-US locale code, needed for correct
       * interpretation of some date formats.
       */
      override fun localeCode(localeCode: String) {
        cdkBuilder.localeCode(localeCode)
      }

      /**
       * @param timezoneOffset Optional value for a timezone offset of the datetime parameter value
       * in the Amazon S3 path.
       * Shouldn't be used if Format for this parameter includes timezone fields. If no offset
       * specified, UTC is assumed.
       */
      override fun timezoneOffset(timezoneOffset: String) {
        cdkBuilder.timezoneOffset(timezoneOffset)
      }

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty,
    ) : CdkObject(cdkObject),
        DatetimeOptionsProperty {
      /**
       * Required option, that defines the datetime format used for a date parameter in the Amazon
       * S3 path.
       *
       * Should use only supported datetime specifiers and separation characters, all litera a-z or
       * A-Z character should be escaped with single quotes. E.g. "MM.dd.yyyy-'at'-HH:mm".
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html#cfn-databrew-dataset-datetimeoptions-format)
       */
      override fun format(): String = unwrap(this).getFormat()

      /**
       * Optional value for a non-US locale code, needed for correct interpretation of some date
       * formats.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html#cfn-databrew-dataset-datetimeoptions-localecode)
       */
      override fun localeCode(): String? = unwrap(this).getLocaleCode()

      /**
       * Optional value for a timezone offset of the datetime parameter value in the Amazon S3 path.
       *
       * Shouldn't be used if Format for this parameter includes timezone fields. If no offset
       * specified, UTC is assumed.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-datetimeoptions.html#cfn-databrew-dataset-datetimeoptions-timezoneoffset)
       */
      override fun timezoneOffset(): String? = unwrap(this).getTimezoneOffset()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatetimeOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty):
          DatetimeOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? DatetimeOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatetimeOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.DatetimeOptionsProperty
    }
  }

  /**
   * Represents a set of options that define how DataBrew will interpret a Microsoft Excel file when
   * creating a dataset from that file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * ExcelOptionsProperty excelOptionsProperty = ExcelOptionsProperty.builder()
   * .headerRow(false)
   * .sheetIndexes(List.of(123))
   * .sheetNames(List.of("sheetNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html)
   */
  public interface ExcelOptionsProperty {
    /**
     * A variable that specifies whether the first row in the file is parsed as the header.
     *
     * If this value is false, column names are auto-generated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html#cfn-databrew-dataset-exceloptions-headerrow)
     */
    public fun headerRow(): Any? = unwrap(this).getHeaderRow()

    /**
     * One or more sheet numbers in the Excel file that will be included in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html#cfn-databrew-dataset-exceloptions-sheetindexes)
     */
    public fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

    /**
     * One or more named sheets in the Excel file that will be included in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html#cfn-databrew-dataset-exceloptions-sheetnames)
     */
    public fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()

    /**
     * A builder for [ExcelOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      public fun headerRow(headerRow: Boolean)

      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      public fun headerRow(headerRow: IResolvable)

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in
       * the dataset.
       */
      public fun sheetIndexes(sheetIndexes: List<Number>)

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in
       * the dataset.
       */
      public fun sheetIndexes(vararg sheetIndexes: Number)

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in
       * the dataset.
       */
      public fun sheetIndexes(sheetIndexes: IResolvable)

      /**
       * @param sheetNames One or more named sheets in the Excel file that will be included in the
       * dataset.
       */
      public fun sheetNames(sheetNames: List<String>)

      /**
       * @param sheetNames One or more named sheets in the Excel file that will be included in the
       * dataset.
       */
      public fun sheetNames(vararg sheetNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty.builder()

      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      override fun headerRow(headerRow: Boolean) {
        cdkBuilder.headerRow(headerRow)
      }

      /**
       * @param headerRow A variable that specifies whether the first row in the file is parsed as
       * the header.
       * If this value is false, column names are auto-generated.
       */
      override fun headerRow(headerRow: IResolvable) {
        cdkBuilder.headerRow(headerRow.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in
       * the dataset.
       */
      override fun sheetIndexes(sheetIndexes: List<Number>) {
        cdkBuilder.sheetIndexes(sheetIndexes)
      }

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in
       * the dataset.
       */
      override fun sheetIndexes(vararg sheetIndexes: Number): Unit =
          sheetIndexes(sheetIndexes.toList())

      /**
       * @param sheetIndexes One or more sheet numbers in the Excel file that will be included in
       * the dataset.
       */
      override fun sheetIndexes(sheetIndexes: IResolvable) {
        cdkBuilder.sheetIndexes(sheetIndexes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sheetNames One or more named sheets in the Excel file that will be included in the
       * dataset.
       */
      override fun sheetNames(sheetNames: List<String>) {
        cdkBuilder.sheetNames(sheetNames)
      }

      /**
       * @param sheetNames One or more named sheets in the Excel file that will be included in the
       * dataset.
       */
      override fun sheetNames(vararg sheetNames: String): Unit = sheetNames(sheetNames.toList())

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty,
    ) : CdkObject(cdkObject),
        ExcelOptionsProperty {
      /**
       * A variable that specifies whether the first row in the file is parsed as the header.
       *
       * If this value is false, column names are auto-generated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html#cfn-databrew-dataset-exceloptions-headerrow)
       */
      override fun headerRow(): Any? = unwrap(this).getHeaderRow()

      /**
       * One or more sheet numbers in the Excel file that will be included in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html#cfn-databrew-dataset-exceloptions-sheetindexes)
       */
      override fun sheetIndexes(): Any? = unwrap(this).getSheetIndexes()

      /**
       * One or more named sheets in the Excel file that will be included in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-exceloptions.html#cfn-databrew-dataset-exceloptions-sheetnames)
       */
      override fun sheetNames(): List<String> = unwrap(this).getSheetNames() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExcelOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty):
          ExcelOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? ExcelOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExcelOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.ExcelOptionsProperty
    }
  }

  /**
   * Represents a limit imposed on number of Amazon S3 files that should be selected for a dataset
   * from a connected Amazon S3 path.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * FilesLimitProperty filesLimitProperty = FilesLimitProperty.builder()
   * .maxFiles(123)
   * // the properties below are optional
   * .order("order")
   * .orderedBy("orderedBy")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html)
   */
  public interface FilesLimitProperty {
    /**
     * The number of Amazon S3 files to select.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html#cfn-databrew-dataset-fileslimit-maxfiles)
     */
    public fun maxFiles(): Number

    /**
     * A criteria to use for Amazon S3 files sorting before their selection.
     *
     * By default uses DESCENDING order, i.e. most recent files are selected first. Anotherpossible
     * value is ASCENDING.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html#cfn-databrew-dataset-fileslimit-order)
     */
    public fun order(): String? = unwrap(this).getOrder()

    /**
     * A criteria to use for Amazon S3 files sorting before their selection.
     *
     * By default uses LAST_MODIFIED_DATE as a sorting criteria. Currently it's the only allowed
     * value.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html#cfn-databrew-dataset-fileslimit-orderedby)
     */
    public fun orderedBy(): String? = unwrap(this).getOrderedBy()

    /**
     * A builder for [FilesLimitProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param maxFiles The number of Amazon S3 files to select. 
       */
      public fun maxFiles(maxFiles: Number)

      /**
       * @param order A criteria to use for Amazon S3 files sorting before their selection.
       * By default uses DESCENDING order, i.e. most recent files are selected first.
       * Anotherpossible value is ASCENDING.
       */
      public fun order(order: String)

      /**
       * @param orderedBy A criteria to use for Amazon S3 files sorting before their selection.
       * By default uses LAST_MODIFIED_DATE as a sorting criteria. Currently it's the only allowed
       * value.
       */
      public fun orderedBy(orderedBy: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty.builder()

      /**
       * @param maxFiles The number of Amazon S3 files to select. 
       */
      override fun maxFiles(maxFiles: Number) {
        cdkBuilder.maxFiles(maxFiles)
      }

      /**
       * @param order A criteria to use for Amazon S3 files sorting before their selection.
       * By default uses DESCENDING order, i.e. most recent files are selected first.
       * Anotherpossible value is ASCENDING.
       */
      override fun order(order: String) {
        cdkBuilder.order(order)
      }

      /**
       * @param orderedBy A criteria to use for Amazon S3 files sorting before their selection.
       * By default uses LAST_MODIFIED_DATE as a sorting criteria. Currently it's the only allowed
       * value.
       */
      override fun orderedBy(orderedBy: String) {
        cdkBuilder.orderedBy(orderedBy)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty,
    ) : CdkObject(cdkObject),
        FilesLimitProperty {
      /**
       * The number of Amazon S3 files to select.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html#cfn-databrew-dataset-fileslimit-maxfiles)
       */
      override fun maxFiles(): Number = unwrap(this).getMaxFiles()

      /**
       * A criteria to use for Amazon S3 files sorting before their selection.
       *
       * By default uses DESCENDING order, i.e. most recent files are selected first.
       * Anotherpossible value is ASCENDING.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html#cfn-databrew-dataset-fileslimit-order)
       */
      override fun order(): String? = unwrap(this).getOrder()

      /**
       * A criteria to use for Amazon S3 files sorting before their selection.
       *
       * By default uses LAST_MODIFIED_DATE as a sorting criteria. Currently it's the only allowed
       * value.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-fileslimit.html#cfn-databrew-dataset-fileslimit-orderedby)
       */
      override fun orderedBy(): String? = unwrap(this).getOrderedBy()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilesLimitProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty):
          FilesLimitProperty = CdkObjectWrappers.wrap(cdkObject) as? FilesLimitProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilesLimitProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.FilesLimitProperty
    }
  }

  /**
   * Represents a structure for defining parameter conditions.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * FilterExpressionProperty filterExpressionProperty = FilterExpressionProperty.builder()
   * .expression("expression")
   * .valuesMap(List.of(FilterValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filterexpression.html)
   */
  public interface FilterExpressionProperty {
    /**
     * The expression which includes condition names followed by substitution variables, possibly
     * grouped and combined with other conditions.
     *
     * For example, "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or
     * ends_with :suffix2)". Substitution variables should start with ':' symbol.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filterexpression.html#cfn-databrew-dataset-filterexpression-expression)
     */
    public fun expression(): String

    /**
     * The map of substitution variable names to their values used in this filter expression.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filterexpression.html#cfn-databrew-dataset-filterexpression-valuesmap)
     */
    public fun valuesMap(): Any

    /**
     * A builder for [FilterExpressionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param expression The expression which includes condition names followed by substitution
       * variables, possibly grouped and combined with other conditions. 
       * For example, "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or
       * ends_with :suffix2)". Substitution variables should start with ':' symbol.
       */
      public fun expression(expression: String)

      /**
       * @param valuesMap The map of substitution variable names to their values used in this filter
       * expression. 
       */
      public fun valuesMap(valuesMap: IResolvable)

      /**
       * @param valuesMap The map of substitution variable names to their values used in this filter
       * expression. 
       */
      public fun valuesMap(valuesMap: List<Any>)

      /**
       * @param valuesMap The map of substitution variable names to their values used in this filter
       * expression. 
       */
      public fun valuesMap(vararg valuesMap: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty.builder()

      /**
       * @param expression The expression which includes condition names followed by substitution
       * variables, possibly grouped and combined with other conditions. 
       * For example, "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or
       * ends_with :suffix2)". Substitution variables should start with ':' symbol.
       */
      override fun expression(expression: String) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param valuesMap The map of substitution variable names to their values used in this filter
       * expression. 
       */
      override fun valuesMap(valuesMap: IResolvable) {
        cdkBuilder.valuesMap(valuesMap.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param valuesMap The map of substitution variable names to their values used in this filter
       * expression. 
       */
      override fun valuesMap(valuesMap: List<Any>) {
        cdkBuilder.valuesMap(valuesMap.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param valuesMap The map of substitution variable names to their values used in this filter
       * expression. 
       */
      override fun valuesMap(vararg valuesMap: Any): Unit = valuesMap(valuesMap.toList())

      public fun build():
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty,
    ) : CdkObject(cdkObject),
        FilterExpressionProperty {
      /**
       * The expression which includes condition names followed by substitution variables, possibly
       * grouped and combined with other conditions.
       *
       * For example, "(starts_with :prefix1 or starts_with :prefix2) and (ends_with :suffix1 or
       * ends_with :suffix2)". Substitution variables should start with ':' symbol.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filterexpression.html#cfn-databrew-dataset-filterexpression-expression)
       */
      override fun expression(): String = unwrap(this).getExpression()

      /**
       * The map of substitution variable names to their values used in this filter expression.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filterexpression.html#cfn-databrew-dataset-filterexpression-valuesmap)
       */
      override fun valuesMap(): Any = unwrap(this).getValuesMap()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterExpressionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty):
          FilterExpressionProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterExpressionProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterExpressionProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.FilterExpressionProperty
    }
  }

  /**
   * Represents a single entry in the `ValuesMap` of a `FilterExpression` .
   *
   * A `FilterValue` associates the name of a substitution variable in an expression to its value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * FilterValueProperty filterValueProperty = FilterValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filtervalue.html)
   */
  public interface FilterValueProperty {
    /**
     * The value to be associated with the substitution variable.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filtervalue.html#cfn-databrew-dataset-filtervalue-value)
     */
    public fun `value`(): String

    /**
     * The substitution variable reference.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filtervalue.html#cfn-databrew-dataset-filtervalue-valuereference)
     */
    public fun valueReference(): String

    /**
     * A builder for [FilterValueProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param value The value to be associated with the substitution variable. 
       */
      public fun `value`(`value`: String)

      /**
       * @param valueReference The substitution variable reference. 
       */
      public fun valueReference(valueReference: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty.builder()

      /**
       * @param value The value to be associated with the substitution variable. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      /**
       * @param valueReference The substitution variable reference. 
       */
      override fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty,
    ) : CdkObject(cdkObject),
        FilterValueProperty {
      /**
       * The value to be associated with the substitution variable.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filtervalue.html#cfn-databrew-dataset-filtervalue-value)
       */
      override fun `value`(): String = unwrap(this).getValue()

      /**
       * The substitution variable reference.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filtervalue.html#cfn-databrew-dataset-filtervalue-valuereference)
       */
      override fun valueReference(): String = unwrap(this).getValueReference()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FilterValueProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty):
          FilterValueProperty = CdkObjectWrappers.wrap(cdkObject) as? FilterValueProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FilterValueProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.FilterValueProperty
    }
  }

  /**
   * Represents a set of options that define the structure of either comma-separated value (CSV),
   * Excel, or JSON input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * FormatOptionsProperty formatOptionsProperty = FormatOptionsProperty.builder()
   * .csv(CsvOptionsProperty.builder()
   * .delimiter("delimiter")
   * .headerRow(false)
   * .build())
   * .excel(ExcelOptionsProperty.builder()
   * .headerRow(false)
   * .sheetIndexes(List.of(123))
   * .sheetNames(List.of("sheetNames"))
   * .build())
   * .json(JsonOptionsProperty.builder()
   * .multiLine(false)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html)
   */
  public interface FormatOptionsProperty {
    /**
     * Options that define how CSV input is to be interpreted by DataBrew.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html#cfn-databrew-dataset-formatoptions-csv)
     */
    public fun csv(): Any? = unwrap(this).getCsv()

    /**
     * Options that define how Excel input is to be interpreted by DataBrew.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html#cfn-databrew-dataset-formatoptions-excel)
     */
    public fun excel(): Any? = unwrap(this).getExcel()

    /**
     * Options that define how JSON input is to be interpreted by DataBrew.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html#cfn-databrew-dataset-formatoptions-json)
     */
    public fun json(): Any? = unwrap(this).getJson()

    /**
     * A builder for [FormatOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csv Options that define how CSV input is to be interpreted by DataBrew.
       */
      public fun csv(csv: IResolvable)

      /**
       * @param csv Options that define how CSV input is to be interpreted by DataBrew.
       */
      public fun csv(csv: CsvOptionsProperty)

      /**
       * @param csv Options that define how CSV input is to be interpreted by DataBrew.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72b3633abe2138ad63e36be41f14b939d47953e017b72e053a3b74b20d72ca92")
      public fun csv(csv: CsvOptionsProperty.Builder.() -> Unit)

      /**
       * @param excel Options that define how Excel input is to be interpreted by DataBrew.
       */
      public fun excel(excel: IResolvable)

      /**
       * @param excel Options that define how Excel input is to be interpreted by DataBrew.
       */
      public fun excel(excel: ExcelOptionsProperty)

      /**
       * @param excel Options that define how Excel input is to be interpreted by DataBrew.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb615763391f8fb8cae4015adbeda24c1f2cf9f35c8f2ac4125a7b27823d3e8")
      public fun excel(excel: ExcelOptionsProperty.Builder.() -> Unit)

      /**
       * @param json Options that define how JSON input is to be interpreted by DataBrew.
       */
      public fun json(json: IResolvable)

      /**
       * @param json Options that define how JSON input is to be interpreted by DataBrew.
       */
      public fun json(json: JsonOptionsProperty)

      /**
       * @param json Options that define how JSON input is to be interpreted by DataBrew.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef95b3f0a6f8caccf791e87fb75cb078b786aca315950647c7fea8ca0e1b0e9")
      public fun json(json: JsonOptionsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty.builder()

      /**
       * @param csv Options that define how CSV input is to be interpreted by DataBrew.
       */
      override fun csv(csv: IResolvable) {
        cdkBuilder.csv(csv.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param csv Options that define how CSV input is to be interpreted by DataBrew.
       */
      override fun csv(csv: CsvOptionsProperty) {
        cdkBuilder.csv(csv.let(CsvOptionsProperty.Companion::unwrap))
      }

      /**
       * @param csv Options that define how CSV input is to be interpreted by DataBrew.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("72b3633abe2138ad63e36be41f14b939d47953e017b72e053a3b74b20d72ca92")
      override fun csv(csv: CsvOptionsProperty.Builder.() -> Unit): Unit =
          csv(CsvOptionsProperty(csv))

      /**
       * @param excel Options that define how Excel input is to be interpreted by DataBrew.
       */
      override fun excel(excel: IResolvable) {
        cdkBuilder.excel(excel.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param excel Options that define how Excel input is to be interpreted by DataBrew.
       */
      override fun excel(excel: ExcelOptionsProperty) {
        cdkBuilder.excel(excel.let(ExcelOptionsProperty.Companion::unwrap))
      }

      /**
       * @param excel Options that define how Excel input is to be interpreted by DataBrew.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb615763391f8fb8cae4015adbeda24c1f2cf9f35c8f2ac4125a7b27823d3e8")
      override fun excel(excel: ExcelOptionsProperty.Builder.() -> Unit): Unit =
          excel(ExcelOptionsProperty(excel))

      /**
       * @param json Options that define how JSON input is to be interpreted by DataBrew.
       */
      override fun json(json: IResolvable) {
        cdkBuilder.json(json.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param json Options that define how JSON input is to be interpreted by DataBrew.
       */
      override fun json(json: JsonOptionsProperty) {
        cdkBuilder.json(json.let(JsonOptionsProperty.Companion::unwrap))
      }

      /**
       * @param json Options that define how JSON input is to be interpreted by DataBrew.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("cef95b3f0a6f8caccf791e87fb75cb078b786aca315950647c7fea8ca0e1b0e9")
      override fun json(json: JsonOptionsProperty.Builder.() -> Unit): Unit =
          json(JsonOptionsProperty(json))

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty,
    ) : CdkObject(cdkObject),
        FormatOptionsProperty {
      /**
       * Options that define how CSV input is to be interpreted by DataBrew.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html#cfn-databrew-dataset-formatoptions-csv)
       */
      override fun csv(): Any? = unwrap(this).getCsv()

      /**
       * Options that define how Excel input is to be interpreted by DataBrew.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html#cfn-databrew-dataset-formatoptions-excel)
       */
      override fun excel(): Any? = unwrap(this).getExcel()

      /**
       * Options that define how JSON input is to be interpreted by DataBrew.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-formatoptions.html#cfn-databrew-dataset-formatoptions-json)
       */
      override fun json(): Any? = unwrap(this).getJson()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FormatOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty):
          FormatOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? FormatOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: FormatOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.FormatOptionsProperty
    }
  }

  /**
   * Represents information on how DataBrew can find data, in either the AWS Glue Data Catalog or
   * Amazon S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * InputProperty inputProperty = InputProperty.builder()
   * .databaseInputDefinition(DatabaseInputDefinitionProperty.builder()
   * .glueConnectionName("glueConnectionName")
   * // the properties below are optional
   * .databaseTableName("databaseTableName")
   * .queryString("queryString")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build())
   * .dataCatalogInputDefinition(DataCatalogInputDefinitionProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .tableName("tableName")
   * .tempDirectory(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build())
   * .metadata(MetadataProperty.builder()
   * .sourceArn("sourceArn")
   * .build())
   * .s3InputDefinition(S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html)
   */
  public interface InputProperty {
    /**
     * The AWS Glue Data Catalog parameters for the data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-datacataloginputdefinition)
     */
    public fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

    /**
     * Connection information for dataset input files stored in a database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-databaseinputdefinition)
     */
    public fun databaseInputDefinition(): Any? = unwrap(this).getDatabaseInputDefinition()

    /**
     * Contains additional resource information needed for specific datasets.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-metadata)
     */
    public fun metadata(): Any? = unwrap(this).getMetadata()

    /**
     * The Amazon S3 location where the data is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-s3inputdefinition)
     */
    public fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()

    /**
     * A builder for [InputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      public fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable)

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty)

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8566d49d0da6d5e3c7dae41867fa0417df919b5a9a9cbe8fb3e02dd69f77448")
      public
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit)

      /**
       * @param databaseInputDefinition Connection information for dataset input files stored in a
       * database.
       */
      public fun databaseInputDefinition(databaseInputDefinition: IResolvable)

      /**
       * @param databaseInputDefinition Connection information for dataset input files stored in a
       * database.
       */
      public fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty)

      /**
       * @param databaseInputDefinition Connection information for dataset input files stored in a
       * database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20cc6c2cb67cf12e5153173813edf5a1f135894874e3ec92e723e02fa5999d7b")
      public
          fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty.Builder.() -> Unit)

      /**
       * @param metadata Contains additional resource information needed for specific datasets.
       */
      public fun metadata(metadata: IResolvable)

      /**
       * @param metadata Contains additional resource information needed for specific datasets.
       */
      public fun metadata(metadata: MetadataProperty)

      /**
       * @param metadata Contains additional resource information needed for specific datasets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc2eecbbafc42972874374b2ff846e2fdf8dc1e0ebd9e1fa459c63dc026f334")
      public fun metadata(metadata: MetadataProperty.Builder.() -> Unit)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      public fun s3InputDefinition(s3InputDefinition: IResolvable)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty)

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941083a48d82f5dc84d462af94aa87336a198a841d72148455b37296db306422")
      public fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.InputProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.InputProperty.builder()

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      override fun dataCatalogInputDefinition(dataCatalogInputDefinition: IResolvable) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty) {
        cdkBuilder.dataCatalogInputDefinition(dataCatalogInputDefinition.let(DataCatalogInputDefinitionProperty.Companion::unwrap))
      }

      /**
       * @param dataCatalogInputDefinition The AWS Glue Data Catalog parameters for the data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e8566d49d0da6d5e3c7dae41867fa0417df919b5a9a9cbe8fb3e02dd69f77448")
      override
          fun dataCatalogInputDefinition(dataCatalogInputDefinition: DataCatalogInputDefinitionProperty.Builder.() -> Unit):
          Unit =
          dataCatalogInputDefinition(DataCatalogInputDefinitionProperty(dataCatalogInputDefinition))

      /**
       * @param databaseInputDefinition Connection information for dataset input files stored in a
       * database.
       */
      override fun databaseInputDefinition(databaseInputDefinition: IResolvable) {
        cdkBuilder.databaseInputDefinition(databaseInputDefinition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param databaseInputDefinition Connection information for dataset input files stored in a
       * database.
       */
      override
          fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty) {
        cdkBuilder.databaseInputDefinition(databaseInputDefinition.let(DatabaseInputDefinitionProperty.Companion::unwrap))
      }

      /**
       * @param databaseInputDefinition Connection information for dataset input files stored in a
       * database.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("20cc6c2cb67cf12e5153173813edf5a1f135894874e3ec92e723e02fa5999d7b")
      override
          fun databaseInputDefinition(databaseInputDefinition: DatabaseInputDefinitionProperty.Builder.() -> Unit):
          Unit = databaseInputDefinition(DatabaseInputDefinitionProperty(databaseInputDefinition))

      /**
       * @param metadata Contains additional resource information needed for specific datasets.
       */
      override fun metadata(metadata: IResolvable) {
        cdkBuilder.metadata(metadata.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param metadata Contains additional resource information needed for specific datasets.
       */
      override fun metadata(metadata: MetadataProperty) {
        cdkBuilder.metadata(metadata.let(MetadataProperty.Companion::unwrap))
      }

      /**
       * @param metadata Contains additional resource information needed for specific datasets.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ebc2eecbbafc42972874374b2ff846e2fdf8dc1e0ebd9e1fa459c63dc026f334")
      override fun metadata(metadata: MetadataProperty.Builder.() -> Unit): Unit =
          metadata(MetadataProperty(metadata))

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      override fun s3InputDefinition(s3InputDefinition: IResolvable) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty) {
        cdkBuilder.s3InputDefinition(s3InputDefinition.let(S3LocationProperty.Companion::unwrap))
      }

      /**
       * @param s3InputDefinition The Amazon S3 location where the data is stored.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("941083a48d82f5dc84d462af94aa87336a198a841d72148455b37296db306422")
      override fun s3InputDefinition(s3InputDefinition: S3LocationProperty.Builder.() -> Unit): Unit
          = s3InputDefinition(S3LocationProperty(s3InputDefinition))

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.InputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.InputProperty,
    ) : CdkObject(cdkObject),
        InputProperty {
      /**
       * The AWS Glue Data Catalog parameters for the data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-datacataloginputdefinition)
       */
      override fun dataCatalogInputDefinition(): Any? = unwrap(this).getDataCatalogInputDefinition()

      /**
       * Connection information for dataset input files stored in a database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-databaseinputdefinition)
       */
      override fun databaseInputDefinition(): Any? = unwrap(this).getDatabaseInputDefinition()

      /**
       * Contains additional resource information needed for specific datasets.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-metadata)
       */
      override fun metadata(): Any? = unwrap(this).getMetadata()

      /**
       * The Amazon S3 location where the data is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-input.html#cfn-databrew-dataset-input-s3inputdefinition)
       */
      override fun s3InputDefinition(): Any? = unwrap(this).getS3InputDefinition()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.InputProperty):
          InputProperty = CdkObjectWrappers.wrap(cdkObject) as? InputProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.InputProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.databrew.CfnDataset.InputProperty
    }
  }

  /**
   * Represents the JSON-specific options that define how input is to be interpreted by AWS Glue
   * DataBrew .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * JsonOptionsProperty jsonOptionsProperty = JsonOptionsProperty.builder()
   * .multiLine(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-jsonoptions.html)
   */
  public interface JsonOptionsProperty {
    /**
     * A value that specifies whether JSON input contains embedded new line characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-jsonoptions.html#cfn-databrew-dataset-jsonoptions-multiline)
     */
    public fun multiLine(): Any? = unwrap(this).getMultiLine()

    /**
     * A builder for [JsonOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param multiLine A value that specifies whether JSON input contains embedded new line
       * characters.
       */
      public fun multiLine(multiLine: Boolean)

      /**
       * @param multiLine A value that specifies whether JSON input contains embedded new line
       * characters.
       */
      public fun multiLine(multiLine: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty.builder()

      /**
       * @param multiLine A value that specifies whether JSON input contains embedded new line
       * characters.
       */
      override fun multiLine(multiLine: Boolean) {
        cdkBuilder.multiLine(multiLine)
      }

      /**
       * @param multiLine A value that specifies whether JSON input contains embedded new line
       * characters.
       */
      override fun multiLine(multiLine: IResolvable) {
        cdkBuilder.multiLine(multiLine.let(IResolvable.Companion::unwrap))
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty,
    ) : CdkObject(cdkObject),
        JsonOptionsProperty {
      /**
       * A value that specifies whether JSON input contains embedded new line characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-jsonoptions.html#cfn-databrew-dataset-jsonoptions-multiline)
       */
      override fun multiLine(): Any? = unwrap(this).getMultiLine()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JsonOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty):
          JsonOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? JsonOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: JsonOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.JsonOptionsProperty
    }
  }

  /**
   * Contains additional resource information needed for specific datasets.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * MetadataProperty metadataProperty = MetadataProperty.builder()
   * .sourceArn("sourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-metadata.html)
   */
  public interface MetadataProperty {
    /**
     * The Amazon Resource Name (ARN) associated with the dataset.
     *
     * Currently, DataBrew only supports ARNs from Amazon AppFlow.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-metadata.html#cfn-databrew-dataset-metadata-sourcearn)
     */
    public fun sourceArn(): String? = unwrap(this).getSourceArn()

    /**
     * A builder for [MetadataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceArn The Amazon Resource Name (ARN) associated with the dataset.
       * Currently, DataBrew only supports ARNs from Amazon AppFlow.
       */
      public fun sourceArn(sourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty.builder()

      /**
       * @param sourceArn The Amazon Resource Name (ARN) associated with the dataset.
       * Currently, DataBrew only supports ARNs from Amazon AppFlow.
       */
      override fun sourceArn(sourceArn: String) {
        cdkBuilder.sourceArn(sourceArn)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty,
    ) : CdkObject(cdkObject),
        MetadataProperty {
      /**
       * The Amazon Resource Name (ARN) associated with the dataset.
       *
       * Currently, DataBrew only supports ARNs from Amazon AppFlow.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-metadata.html#cfn-databrew-dataset-metadata-sourcearn)
       */
      override fun sourceArn(): String? = unwrap(this).getSourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MetadataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty):
          MetadataProperty = CdkObjectWrappers.wrap(cdkObject) as? MetadataProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: MetadataProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.MetadataProperty
    }
  }

  /**
   * Represents a set of options that define how DataBrew selects files for a given Amazon S3 path
   * in a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * PathOptionsProperty pathOptionsProperty = PathOptionsProperty.builder()
   * .filesLimit(FilesLimitProperty.builder()
   * .maxFiles(123)
   * // the properties below are optional
   * .order("order")
   * .orderedBy("orderedBy")
   * .build())
   * .lastModifiedDateCondition(FilterExpressionProperty.builder()
   * .expression("expression")
   * .valuesMap(List.of(FilterValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build()))
   * .build())
   * .parameters(List.of(PathParameterProperty.builder()
   * .datasetParameter(DatasetParameterProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .createColumn(false)
   * .datetimeOptions(DatetimeOptionsProperty.builder()
   * .format("format")
   * // the properties below are optional
   * .localeCode("localeCode")
   * .timezoneOffset("timezoneOffset")
   * .build())
   * .filter(FilterExpressionProperty.builder()
   * .expression("expression")
   * .valuesMap(List.of(FilterValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build()))
   * .build())
   * .build())
   * .pathParameterName("pathParameterName")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html)
   */
  public interface PathOptionsProperty {
    /**
     * If provided, this structure imposes a limit on a number of files that should be selected.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html#cfn-databrew-dataset-pathoptions-fileslimit)
     */
    public fun filesLimit(): Any? = unwrap(this).getFilesLimit()

    /**
     * If provided, this structure defines a date range for matching Amazon S3 objects based on
     * their LastModifiedDate attribute in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html#cfn-databrew-dataset-pathoptions-lastmodifieddatecondition)
     */
    public fun lastModifiedDateCondition(): Any? = unwrap(this).getLastModifiedDateCondition()

    /**
     * A structure that maps names of parameters used in the Amazon S3 path of a dataset to their
     * definitions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html#cfn-databrew-dataset-pathoptions-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A builder for [PathOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param filesLimit If provided, this structure imposes a limit on a number of files that
       * should be selected.
       */
      public fun filesLimit(filesLimit: IResolvable)

      /**
       * @param filesLimit If provided, this structure imposes a limit on a number of files that
       * should be selected.
       */
      public fun filesLimit(filesLimit: FilesLimitProperty)

      /**
       * @param filesLimit If provided, this structure imposes a limit on a number of files that
       * should be selected.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4786e8c86d4e79328ebc2fc4d2d315293199a3eebf60b0b821010811952d269")
      public fun filesLimit(filesLimit: FilesLimitProperty.Builder.() -> Unit)

      /**
       * @param lastModifiedDateCondition If provided, this structure defines a date range for
       * matching Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
       */
      public fun lastModifiedDateCondition(lastModifiedDateCondition: IResolvable)

      /**
       * @param lastModifiedDateCondition If provided, this structure defines a date range for
       * matching Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
       */
      public fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty)

      /**
       * @param lastModifiedDateCondition If provided, this structure defines a date range for
       * matching Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def082e8c0d710e215ee5d01b6afe8a975bcffa87410f4de1ae5b32e1813922b")
      public
          fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty.Builder.() -> Unit)

      /**
       * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
       * dataset to their definitions.
       */
      public fun parameters(parameters: IResolvable)

      /**
       * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
       * dataset to their definitions.
       */
      public fun parameters(parameters: List<Any>)

      /**
       * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
       * dataset to their definitions.
       */
      public fun parameters(vararg parameters: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty.builder()

      /**
       * @param filesLimit If provided, this structure imposes a limit on a number of files that
       * should be selected.
       */
      override fun filesLimit(filesLimit: IResolvable) {
        cdkBuilder.filesLimit(filesLimit.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param filesLimit If provided, this structure imposes a limit on a number of files that
       * should be selected.
       */
      override fun filesLimit(filesLimit: FilesLimitProperty) {
        cdkBuilder.filesLimit(filesLimit.let(FilesLimitProperty.Companion::unwrap))
      }

      /**
       * @param filesLimit If provided, this structure imposes a limit on a number of files that
       * should be selected.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d4786e8c86d4e79328ebc2fc4d2d315293199a3eebf60b0b821010811952d269")
      override fun filesLimit(filesLimit: FilesLimitProperty.Builder.() -> Unit): Unit =
          filesLimit(FilesLimitProperty(filesLimit))

      /**
       * @param lastModifiedDateCondition If provided, this structure defines a date range for
       * matching Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
       */
      override fun lastModifiedDateCondition(lastModifiedDateCondition: IResolvable) {
        cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param lastModifiedDateCondition If provided, this structure defines a date range for
       * matching Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
       */
      override fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty) {
        cdkBuilder.lastModifiedDateCondition(lastModifiedDateCondition.let(FilterExpressionProperty.Companion::unwrap))
      }

      /**
       * @param lastModifiedDateCondition If provided, this structure defines a date range for
       * matching Amazon S3 objects based on their LastModifiedDate attribute in Amazon S3 .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("def082e8c0d710e215ee5d01b6afe8a975bcffa87410f4de1ae5b32e1813922b")
      override
          fun lastModifiedDateCondition(lastModifiedDateCondition: FilterExpressionProperty.Builder.() -> Unit):
          Unit = lastModifiedDateCondition(FilterExpressionProperty(lastModifiedDateCondition))

      /**
       * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
       * dataset to their definitions.
       */
      override fun parameters(parameters: IResolvable) {
        cdkBuilder.parameters(parameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
       * dataset to their definitions.
       */
      override fun parameters(parameters: List<Any>) {
        cdkBuilder.parameters(parameters.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param parameters A structure that maps names of parameters used in the Amazon S3 path of a
       * dataset to their definitions.
       */
      override fun parameters(vararg parameters: Any): Unit = parameters(parameters.toList())

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty,
    ) : CdkObject(cdkObject),
        PathOptionsProperty {
      /**
       * If provided, this structure imposes a limit on a number of files that should be selected.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html#cfn-databrew-dataset-pathoptions-fileslimit)
       */
      override fun filesLimit(): Any? = unwrap(this).getFilesLimit()

      /**
       * If provided, this structure defines a date range for matching Amazon S3 objects based on
       * their LastModifiedDate attribute in Amazon S3 .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html#cfn-databrew-dataset-pathoptions-lastmodifieddatecondition)
       */
      override fun lastModifiedDateCondition(): Any? = unwrap(this).getLastModifiedDateCondition()

      /**
       * A structure that maps names of parameters used in the Amazon S3 path of a dataset to their
       * definitions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathoptions.html#cfn-databrew-dataset-pathoptions-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty):
          PathOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as? PathOptionsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathOptionsProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.PathOptionsProperty
    }
  }

  /**
   * Represents a single entry in the path parameters of a dataset.
   *
   * Each `PathParameter` consists of a name and a parameter definition.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * PathParameterProperty pathParameterProperty = PathParameterProperty.builder()
   * .datasetParameter(DatasetParameterProperty.builder()
   * .name("name")
   * .type("type")
   * // the properties below are optional
   * .createColumn(false)
   * .datetimeOptions(DatetimeOptionsProperty.builder()
   * .format("format")
   * // the properties below are optional
   * .localeCode("localeCode")
   * .timezoneOffset("timezoneOffset")
   * .build())
   * .filter(FilterExpressionProperty.builder()
   * .expression("expression")
   * .valuesMap(List.of(FilterValueProperty.builder()
   * .value("value")
   * .valueReference("valueReference")
   * .build()))
   * .build())
   * .build())
   * .pathParameterName("pathParameterName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathparameter.html)
   */
  public interface PathParameterProperty {
    /**
     * The path parameter definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathparameter.html#cfn-databrew-dataset-pathparameter-datasetparameter)
     */
    public fun datasetParameter(): Any

    /**
     * The name of the path parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathparameter.html#cfn-databrew-dataset-pathparameter-pathparametername)
     */
    public fun pathParameterName(): String

    /**
     * A builder for [PathParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param datasetParameter The path parameter definition. 
       */
      public fun datasetParameter(datasetParameter: IResolvable)

      /**
       * @param datasetParameter The path parameter definition. 
       */
      public fun datasetParameter(datasetParameter: DatasetParameterProperty)

      /**
       * @param datasetParameter The path parameter definition. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdfac5b4cc586d6a7701f0d1802143d360bccc8f10a61da5e4922fb28f109a1a")
      public fun datasetParameter(datasetParameter: DatasetParameterProperty.Builder.() -> Unit)

      /**
       * @param pathParameterName The name of the path parameter. 
       */
      public fun pathParameterName(pathParameterName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty.builder()

      /**
       * @param datasetParameter The path parameter definition. 
       */
      override fun datasetParameter(datasetParameter: IResolvable) {
        cdkBuilder.datasetParameter(datasetParameter.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param datasetParameter The path parameter definition. 
       */
      override fun datasetParameter(datasetParameter: DatasetParameterProperty) {
        cdkBuilder.datasetParameter(datasetParameter.let(DatasetParameterProperty.Companion::unwrap))
      }

      /**
       * @param datasetParameter The path parameter definition. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bdfac5b4cc586d6a7701f0d1802143d360bccc8f10a61da5e4922fb28f109a1a")
      override fun datasetParameter(datasetParameter: DatasetParameterProperty.Builder.() -> Unit):
          Unit = datasetParameter(DatasetParameterProperty(datasetParameter))

      /**
       * @param pathParameterName The name of the path parameter. 
       */
      override fun pathParameterName(pathParameterName: String) {
        cdkBuilder.pathParameterName(pathParameterName)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty,
    ) : CdkObject(cdkObject),
        PathParameterProperty {
      /**
       * The path parameter definition.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathparameter.html#cfn-databrew-dataset-pathparameter-datasetparameter)
       */
      override fun datasetParameter(): Any = unwrap(this).getDatasetParameter()

      /**
       * The name of the path parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-pathparameter.html#cfn-databrew-dataset-pathparameter-pathparametername)
       */
      override fun pathParameterName(): String = unwrap(this).getPathParameterName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PathParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty):
          PathParameterProperty = CdkObjectWrappers.wrap(cdkObject) as? PathParameterProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: PathParameterProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.PathParameterProperty
    }
  }

  /**
   * Represents an Amazon S3 location (bucket name, bucket owner, and object key) where DataBrew can
   * read input data, or write output from a job.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.databrew.*;
   * S3LocationProperty s3LocationProperty = S3LocationProperty.builder()
   * .bucket("bucket")
   * // the properties below are optional
   * .bucketOwner("bucketOwner")
   * .key("key")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html)
   */
  public interface S3LocationProperty {
    /**
     * The Amazon S3 bucket name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html#cfn-databrew-dataset-s3location-bucket)
     */
    public fun bucket(): String

    /**
     * The AWS account ID of the bucket owner.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html#cfn-databrew-dataset-s3location-bucketowner)
     */
    public fun bucketOwner(): String? = unwrap(this).getBucketOwner()

    /**
     * The unique name of the object in the bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html#cfn-databrew-dataset-s3location-key)
     */
    public fun key(): String? = unwrap(this).getKey()

    /**
     * A builder for [S3LocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      public fun bucket(bucket: String)

      /**
       * @param bucketOwner The AWS account ID of the bucket owner.
       */
      public fun bucketOwner(bucketOwner: String)

      /**
       * @param key The unique name of the object in the bucket.
       */
      public fun key(key: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty.Builder =
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty.builder()

      /**
       * @param bucket The Amazon S3 bucket name. 
       */
      override fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
      }

      /**
       * @param bucketOwner The AWS account ID of the bucket owner.
       */
      override fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
      }

      /**
       * @param key The unique name of the object in the bucket.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      public fun build(): software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty,
    ) : CdkObject(cdkObject),
        S3LocationProperty {
      /**
       * The Amazon S3 bucket name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html#cfn-databrew-dataset-s3location-bucket)
       */
      override fun bucket(): String = unwrap(this).getBucket()

      /**
       * The AWS account ID of the bucket owner.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html#cfn-databrew-dataset-s3location-bucketowner)
       */
      override fun bucketOwner(): String? = unwrap(this).getBucketOwner()

      /**
       * The unique name of the object in the bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-s3location.html#cfn-databrew-dataset-s3location-key)
       */
      override fun key(): String? = unwrap(this).getKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty):
          S3LocationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3LocationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3LocationProperty):
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.databrew.CfnDataset.S3LocationProperty
    }
  }
}
