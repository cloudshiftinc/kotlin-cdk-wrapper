@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.forecast

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates an Amazon Forecast dataset.
 *
 * The information about the dataset that you provide helps Forecast understand how to consume the
 * data for model training. This includes the following:
 *
 * * *`DataFrequency`* - How frequently your historical time-series data is collected.
 * * *`Domain`* and *`DatasetType`* - Each dataset has an associated dataset domain and a type
 * within the domain. Amazon Forecast provides a list of predefined domains and types within each
 * domain. For each unique dataset domain and type within the domain, Amazon Forecast requires your
 * data to include a minimum set of predefined fields.
 * * *`Schema`* - A schema specifies the fields in the dataset, including the field name and data
 * type.
 *
 * After creating a dataset, you import your training data into it and add the dataset to a dataset
 * group. You use the dataset group to create a predictor. For more information, see [Importing
 * datasets](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-datasets-groups.html) .
 *
 * To get a list of all your datasets, use the
 * [ListDatasets](https://docs.aws.amazon.com/forecast/latest/dg/API_ListDatasets.html) operation.
 *
 * For example Forecast datasets, see the [Amazon Forecast Sample GitHub
 * repository](https://docs.aws.amazon.com/https://github.com/aws-samples/amazon-forecast-samples) .
 *
 *
 * The `Status` of a dataset must be `ACTIVE` before you can import training data. Use the
 * [DescribeDataset](https://docs.aws.amazon.com/forecast/latest/dg/API_DescribeDataset.html) operation
 * to get the status.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.forecast.*;
 * Object encryptionConfig;
 * Object schema;
 * CfnDataset cfnDataset = CfnDataset.Builder.create(this, "MyCfnDataset")
 * .datasetName("datasetName")
 * .datasetType("datasetType")
 * .domain("domain")
 * .schema(schema)
 * // the properties below are optional
 * .dataFrequency("dataFrequency")
 * .encryptionConfig(encryptionConfig)
 * .tags(List.of(TagsItemsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html)
 */
public open class CfnDataset internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.forecast.CfnDataset,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatasetProps,
  ) :
      this(software.amazon.awscdk.services.forecast.CfnDataset(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDatasetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatasetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDatasetProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the dataset.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The frequency of data collection.
   *
   * This parameter is required for RELATED_TIME_SERIES datasets.
   */
  public open fun dataFrequency(): String? = unwrap(this).getDataFrequency()

  /**
   * The frequency of data collection.
   *
   * This parameter is required for RELATED_TIME_SERIES datasets.
   */
  public open fun dataFrequency(`value`: String) {
    unwrap(this).setDataFrequency(`value`)
  }

  /**
   * The name of the dataset.
   */
  public open fun datasetName(): String = unwrap(this).getDatasetName()

  /**
   * The name of the dataset.
   */
  public open fun datasetName(`value`: String) {
    unwrap(this).setDatasetName(`value`)
  }

  /**
   * The dataset type.
   */
  public open fun datasetType(): String = unwrap(this).getDatasetType()

  /**
   * The dataset type.
   */
  public open fun datasetType(`value`: String) {
    unwrap(this).setDatasetType(`value`)
  }

  /**
   * The domain associated with the dataset.
   */
  public open fun domain(): String = unwrap(this).getDomain()

  /**
   * The domain associated with the dataset.
   */
  public open fun domain(`value`: String) {
    unwrap(this).setDomain(`value`)
  }

  /**
   * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
   * Amazon Forecast can assume to access the key.
   */
  public open fun encryptionConfig(): Any? = unwrap(this).getEncryptionConfig()

  /**
   * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
   * Amazon Forecast can assume to access the key.
   */
  public open fun encryptionConfig(`value`: Any) {
    unwrap(this).setEncryptionConfig(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The schema for the dataset.
   */
  public open fun schema(): Any = unwrap(this).getSchema()

  /**
   * The schema for the dataset.
   */
  public open fun schema(`value`: Any) {
    unwrap(this).setSchema(`value`)
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(): List<TagsItemsProperty> =
      unwrap(this).getTags()?.map(TagsItemsProperty::wrap) ?: emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(`value`: List<TagsItemsProperty>) {
    unwrap(this).setTags(`value`.map(TagsItemsProperty::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tags(vararg `value`: TagsItemsProperty): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.forecast.CfnDataset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES
     * datasets.
     *
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour),
     * and min (Minute). For example, "1D" indicates every day and "15min" indicates every 15 minutes.
     * You cannot specify a value that would overlap with the next larger frequency. That means, for
     * example, you cannot specify a frequency of 60 minutes, because that is equivalent to 1 hour. The
     * valid values for each frequency are the following:
     *
     * * Minute - 1-59
     * * Hour - 1-23
     * * Day - 1-6
     * * Week - 1-4
     * * Month - 1-11
     * * Year - 1
     *
     * Thus, if you want every other week forecasts, specify "2W". Or, if you want quarterly
     * forecasts, you specify "3M".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datafrequency)
     * @param dataFrequency The frequency of data collection. This parameter is required for
     * RELATED_TIME_SERIES datasets. 
     */
    public fun dataFrequency(dataFrequency: String)

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasetname)
     * @param datasetName The name of the dataset. 
     */
    public fun datasetName(datasetName: String)

    /**
     * The dataset type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasettype)
     * @param datasetType The dataset type. 
     */
    public fun datasetType(datasetType: String)

    /**
     * The domain associated with the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-domain)
     * @param domain The domain associated with the dataset. 
     */
    public fun domain(domain: String)

    /**
     * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-encryptionconfig)
     * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the key. 
     */
    public fun encryptionConfig(encryptionConfig: Any)

    /**
     * The schema for the dataset.
     *
     * The schema attributes and their order must match the fields in your data. The dataset
     * `Domain` and `DatasetType` that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type,
     * see [Dataset Domains and Dataset
     * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-schema)
     * @param schema The schema for the dataset. 
     */
    public fun schema(schema: Any)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<TagsItemsProperty>)

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: TagsItemsProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.forecast.CfnDataset.Builder =
        software.amazon.awscdk.services.forecast.CfnDataset.Builder.create(scope, id)

    /**
     * The frequency of data collection. This parameter is required for RELATED_TIME_SERIES
     * datasets.
     *
     * Valid intervals are an integer followed by Y (Year), M (Month), W (Week), D (Day), H (Hour),
     * and min (Minute). For example, "1D" indicates every day and "15min" indicates every 15 minutes.
     * You cannot specify a value that would overlap with the next larger frequency. That means, for
     * example, you cannot specify a frequency of 60 minutes, because that is equivalent to 1 hour. The
     * valid values for each frequency are the following:
     *
     * * Minute - 1-59
     * * Hour - 1-23
     * * Day - 1-6
     * * Week - 1-4
     * * Month - 1-11
     * * Year - 1
     *
     * Thus, if you want every other week forecasts, specify "2W". Or, if you want quarterly
     * forecasts, you specify "3M".
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datafrequency)
     * @param dataFrequency The frequency of data collection. This parameter is required for
     * RELATED_TIME_SERIES datasets. 
     */
    override fun dataFrequency(dataFrequency: String) {
      cdkBuilder.dataFrequency(dataFrequency)
    }

    /**
     * The name of the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasetname)
     * @param datasetName The name of the dataset. 
     */
    override fun datasetName(datasetName: String) {
      cdkBuilder.datasetName(datasetName)
    }

    /**
     * The dataset type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-datasettype)
     * @param datasetType The dataset type. 
     */
    override fun datasetType(datasetType: String) {
      cdkBuilder.datasetType(datasetType)
    }

    /**
     * The domain associated with the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-domain)
     * @param domain The domain associated with the dataset. 
     */
    override fun domain(domain: String) {
      cdkBuilder.domain(domain)
    }

    /**
     * A Key Management Service (KMS) key and the Identity and Access Management (IAM) role that
     * Amazon Forecast can assume to access the key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-encryptionconfig)
     * @param encryptionConfig A Key Management Service (KMS) key and the Identity and Access
     * Management (IAM) role that Amazon Forecast can assume to access the key. 
     */
    override fun encryptionConfig(encryptionConfig: Any) {
      cdkBuilder.encryptionConfig(encryptionConfig)
    }

    /**
     * The schema for the dataset.
     *
     * The schema attributes and their order must match the fields in your data. The dataset
     * `Domain` and `DatasetType` that you choose determine the minimum required fields in your
     * training data. For information about the required fields for a specific dataset domain and type,
     * see [Dataset Domains and Dataset
     * Types](https://docs.aws.amazon.com/forecast/latest/dg/howitworks-domains-ds-types.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-schema)
     * @param schema The schema for the dataset. 
     */
    override fun schema(schema: Any) {
      cdkBuilder.schema(schema)
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<TagsItemsProperty>) {
      cdkBuilder.tags(tags.map(TagsItemsProperty::unwrap))
    }

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-forecast-dataset.html#cfn-forecast-dataset-tags)
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: TagsItemsProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.forecast.CfnDataset = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.forecast.CfnDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset): CfnDataset =
        CfnDataset(cdkObject)

    internal fun unwrap(wrapped: CfnDataset): software.amazon.awscdk.services.forecast.CfnDataset =
        wrapped.cdkObject
  }

  /**
   * An AWS Key Management Service (KMS) key and an AWS Identity and Access Management (IAM) role
   * that Amazon Forecast can assume to access the key.
   *
   * You can specify this optional object in the `CreateDataset` and `CreatePredictor` requests.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.forecast.*;
   * EncryptionConfigProperty encryptionConfigProperty = EncryptionConfigProperty.builder()
   * .kmsKeyArn("kmsKeyArn")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-encryptionconfig.html)
   */
  public interface EncryptionConfigProperty {
    /**
     * The Amazon Resource Name (ARN) of the KMS key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-encryptionconfig.html#cfn-forecast-dataset-encryptionconfig-kmskeyarn)
     */
    public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    /**
     * The ARN of the IAM role that Amazon Forecast can assume to access the AWS KMS key.
     *
     * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your
     * account, you get an `InvalidInputException` error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-encryptionconfig.html#cfn-forecast-dataset-encryptionconfig-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [EncryptionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key.
       */
      public fun kmsKeyArn(kmsKeyArn: String)

      /**
       * @param roleArn The ARN of the IAM role that Amazon Forecast can assume to access the AWS
       * KMS key.
       * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your
       * account, you get an `InvalidInputException` error.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty.builder()

      /**
       * @param kmsKeyArn The Amazon Resource Name (ARN) of the KMS key.
       */
      override fun kmsKeyArn(kmsKeyArn: String) {
        cdkBuilder.kmsKeyArn(kmsKeyArn)
      }

      /**
       * @param roleArn The ARN of the IAM role that Amazon Forecast can assume to access the AWS
       * KMS key.
       * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your
       * account, you get an `InvalidInputException` error.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty,
    ) : CdkObject(cdkObject), EncryptionConfigProperty {
      /**
       * The Amazon Resource Name (ARN) of the KMS key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-encryptionconfig.html#cfn-forecast-dataset-encryptionconfig-kmskeyarn)
       */
      override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

      /**
       * The ARN of the IAM role that Amazon Forecast can assume to access the AWS KMS key.
       *
       * Passing a role across AWS accounts is not allowed. If you pass a role that isn't in your
       * account, you get an `InvalidInputException` error.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-encryptionconfig.html#cfn-forecast-dataset-encryptionconfig-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EncryptionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty):
          EncryptionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? EncryptionConfigProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EncryptionConfigProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.forecast.CfnDataset.EncryptionConfigProperty
    }
  }

  /**
   * Defines the fields of a dataset.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.forecast.*;
   * SchemaProperty schemaProperty = SchemaProperty.builder()
   * .attributes(List.of(AttributesItemsProperty.builder()
   * .attributeName("attributeName")
   * .attributeType("attributeType")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-schema.html)
   */
  public interface SchemaProperty {
    /**
     * An array of attributes specifying the name and type of each field in a dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-schema.html#cfn-forecast-dataset-schema-attributes)
     */
    public fun attributes(): Any? = unwrap(this).getAttributes()

    /**
     * A builder for [SchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributes An array of attributes specifying the name and type of each field in a
       * dataset.
       */
      public fun attributes(attributes: IResolvable)

      /**
       * @param attributes An array of attributes specifying the name and type of each field in a
       * dataset.
       */
      public fun attributes(attributes: List<Any>)

      /**
       * @param attributes An array of attributes specifying the name and type of each field in a
       * dataset.
       */
      public fun attributes(vararg attributes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty.builder()

      /**
       * @param attributes An array of attributes specifying the name and type of each field in a
       * dataset.
       */
      override fun attributes(attributes: IResolvable) {
        cdkBuilder.attributes(attributes.let(IResolvable::unwrap))
      }

      /**
       * @param attributes An array of attributes specifying the name and type of each field in a
       * dataset.
       */
      override fun attributes(attributes: List<Any>) {
        cdkBuilder.attributes(attributes)
      }

      /**
       * @param attributes An array of attributes specifying the name and type of each field in a
       * dataset.
       */
      override fun attributes(vararg attributes: Any): Unit = attributes(attributes.toList())

      public fun build(): software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty,
    ) : CdkObject(cdkObject), SchemaProperty {
      /**
       * An array of attributes specifying the name and type of each field in a dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-schema.html#cfn-forecast-dataset-schema-attributes)
       */
      override fun attributes(): Any? = unwrap(this).getAttributes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty):
          SchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? SchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: SchemaProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty = (wrapped as
          CdkObject).cdkObject as software.amazon.awscdk.services.forecast.CfnDataset.SchemaProperty
    }
  }

  /**
   * A key-value pair to associate with a resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.forecast.*;
   * TagsItemsProperty tagsItemsProperty = TagsItemsProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-tagsitems.html)
   */
  public interface TagsItemsProperty {
    /**
     * The key name of the tag.
     *
     * You can specify a value that is 1 to 128 Unicode characters in length and cannot be prefixed
     * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
     * whitespace, _, ., /, =, +, and -.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-tagsitems.html#cfn-forecast-dataset-tagsitems-key)
     */
    public fun key(): String

    /**
     * The value for the tag.
     *
     * You can specify a value that is 0 to 256 Unicode characters in length and cannot be prefixed
     * with aws:. You can use any of the following characters: the set of Unicode letters, digits,
     * whitespace, _, ., /, =, +, and -.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-tagsitems.html#cfn-forecast-dataset-tagsitems-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagsItemsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key name of the tag. 
       * You can specify a value that is 1 to 128 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      public fun key(key: String)

      /**
       * @param value The value for the tag. 
       * You can specify a value that is 0 to 256 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty.builder()

      /**
       * @param key The key name of the tag. 
       * You can specify a value that is 1 to 128 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value for the tag. 
       * You can specify a value that is 0 to 256 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty,
    ) : CdkObject(cdkObject), TagsItemsProperty {
      /**
       * The key name of the tag.
       *
       * You can specify a value that is 1 to 128 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-tagsitems.html#cfn-forecast-dataset-tagsitems-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value for the tag.
       *
       * You can specify a value that is 0 to 256 Unicode characters in length and cannot be
       * prefixed with aws:. You can use any of the following characters: the set of Unicode letters,
       * digits, whitespace, _, ., /, =, +, and -.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-tagsitems.html#cfn-forecast-dataset-tagsitems-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty):
          TagsItemsProperty = CdkObjectWrappers.wrap(cdkObject) as? TagsItemsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TagsItemsProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.forecast.CfnDataset.TagsItemsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.forecast.*;
   * AttributesItemsProperty attributesItemsProperty = AttributesItemsProperty.builder()
   * .attributeName("attributeName")
   * .attributeType("attributeType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-attributesitems.html)
   */
  public interface AttributesItemsProperty {
    /**
     * Name of the dataset field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-attributesitems.html#cfn-forecast-dataset-attributesitems-attributename)
     */
    public fun attributeName(): String? = unwrap(this).getAttributeName()

    /**
     * Data type of the field.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-attributesitems.html#cfn-forecast-dataset-attributesitems-attributetype)
     */
    public fun attributeType(): String? = unwrap(this).getAttributeType()

    /**
     * A builder for [AttributesItemsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param attributeName Name of the dataset field.
       */
      public fun attributeName(attributeName: String)

      /**
       * @param attributeType Data type of the field.
       */
      public fun attributeType(attributeType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty.Builder =
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty.builder()

      /**
       * @param attributeName Name of the dataset field.
       */
      override fun attributeName(attributeName: String) {
        cdkBuilder.attributeName(attributeName)
      }

      /**
       * @param attributeType Data type of the field.
       */
      override fun attributeType(attributeType: String) {
        cdkBuilder.attributeType(attributeType)
      }

      public fun build():
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty,
    ) : CdkObject(cdkObject), AttributesItemsProperty {
      /**
       * Name of the dataset field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-attributesitems.html#cfn-forecast-dataset-attributesitems-attributename)
       */
      override fun attributeName(): String? = unwrap(this).getAttributeName()

      /**
       * Data type of the field.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-forecast-dataset-attributesitems.html#cfn-forecast-dataset-attributesitems-attributetype)
       */
      override fun attributeType(): String? = unwrap(this).getAttributeType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AttributesItemsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty):
          AttributesItemsProperty = CdkObjectWrappers.wrap(cdkObject) as? AttributesItemsProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: AttributesItemsProperty):
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.forecast.CfnDataset.AttributesItemsProperty
    }
  }
}
