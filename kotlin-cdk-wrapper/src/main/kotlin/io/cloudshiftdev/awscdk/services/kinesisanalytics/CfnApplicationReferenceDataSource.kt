@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.kinesisanalytics

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
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Adds a reference data source to an existing application.
 *
 * Amazon Kinesis Analytics reads reference data (that is, an Amazon S3 object) and creates an
 * in-application table within your application. In the request, you provide the source (S3 bucket name
 * and object key name), name of the in-application table to create, and the necessary mapping
 * information that describes how data in Amazon S3 object maps to columns in the resulting
 * in-application table.
 *
 * For conceptual information, see [Configuring Application
 * Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html) . For the
 * limits on data sources you can add to your application, see
 * [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
 *
 * This operation requires permissions to perform the `kinesisanalytics:AddApplicationOutput`
 * action.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
 * CfnApplicationReferenceDataSource cfnApplicationReferenceDataSource =
 * CfnApplicationReferenceDataSource.Builder.create(this, "MyCfnApplicationReferenceDataSource")
 * .applicationName("applicationName")
 * .referenceDataSource(ReferenceDataSourceProperty.builder()
 * .referenceSchema(ReferenceSchemaProperty.builder()
 * .recordColumns(List.of(RecordColumnProperty.builder()
 * .name("name")
 * .sqlType("sqlType")
 * // the properties below are optional
 * .mapping("mapping")
 * .build()))
 * .recordFormat(RecordFormatProperty.builder()
 * .recordFormatType("recordFormatType")
 * // the properties below are optional
 * .mappingParameters(MappingParametersProperty.builder()
 * .csvMappingParameters(CSVMappingParametersProperty.builder()
 * .recordColumnDelimiter("recordColumnDelimiter")
 * .recordRowDelimiter("recordRowDelimiter")
 * .build())
 * .jsonMappingParameters(JSONMappingParametersProperty.builder()
 * .recordRowPath("recordRowPath")
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .recordEncoding("recordEncoding")
 * .build())
 * // the properties below are optional
 * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
 * .bucketArn("bucketArn")
 * .fileKey("fileKey")
 * .referenceRoleArn("referenceRoleArn")
 * .build())
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html)
 */
public open class CfnApplicationReferenceDataSource internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationReferenceDataSourceProps,
  ) :
      this(software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnApplicationReferenceDataSourceProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationReferenceDataSourceProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationReferenceDataSourceProps(props)
  )

  /**
   * Name of an existing application.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * Name of an existing application.
   */
  public open fun applicationName(`value`: String) {
    unwrap(this).setApplicationName(`value`)
  }

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The reference data source can be an object in your Amazon S3 bucket.
   */
  public open fun referenceDataSource(): Any = unwrap(this).getReferenceDataSource()

  /**
   * The reference data source can be an object in your Amazon S3 bucket.
   */
  public open fun referenceDataSource(`value`: IResolvable) {
    unwrap(this).setReferenceDataSource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The reference data source can be an object in your Amazon S3 bucket.
   */
  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty) {
    unwrap(this).setReferenceDataSource(`value`.let(ReferenceDataSourceProperty::unwrap))
  }

  /**
   * The reference data source can be an object in your Amazon S3 bucket.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8c476ed91471c1d059966a15199f628c4a44d3e33f37d239e8893f17f0d12276")
  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty.Builder.() -> Unit): Unit
      = referenceDataSource(ReferenceDataSourceProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Name of an existing application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
     * @param applicationName Name of an existing application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * The reference data source can be an object in your Amazon S3 bucket.
     *
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     */
    public fun referenceDataSource(referenceDataSource: IResolvable)

    /**
     * The reference data source can be an object in your Amazon S3 bucket.
     *
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     */
    public fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty)

    /**
     * The reference data source can be an object in your Amazon S3 bucket.
     *
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4ea4757f7639e52db201ca2f2fb00f0df5a0f3f285bc61d1489109895965cd7")
    public
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.Builder =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.Builder.create(scope,
        id)

    /**
     * Name of an existing application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-applicationname)
     * @param applicationName Name of an existing application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * The reference data source can be an object in your Amazon S3 bucket.
     *
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     */
    override fun referenceDataSource(referenceDataSource: IResolvable) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(IResolvable::unwrap))
    }

    /**
     * The reference data source can be an object in your Amazon S3 bucket.
     *
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     */
    override fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(ReferenceDataSourceProperty::unwrap))
    }

    /**
     * The reference data source can be an object in your Amazon S3 bucket.
     *
     * Amazon Kinesis Analytics reads the object and copies the data into the in-application table
     * that is created. You provide an S3 bucket, object key name, and the resulting in-application
     * table that is created. You must also provide an IAM role with the necessary permissions that
     * Amazon Kinesis Analytics can assume to read the object from your S3 bucket on your behalf.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalytics-applicationreferencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource The reference data source can be an object in your Amazon S3
     * bucket. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("e4ea4757f7639e52db201ca2f2fb00f0df5a0f3f285bc61d1489109895965cd7")
    override
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit):
        Unit = referenceDataSource(ReferenceDataSourceProperty(referenceDataSource))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationReferenceDataSource {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationReferenceDataSource(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource):
        CfnApplicationReferenceDataSource = CfnApplicationReferenceDataSource(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationReferenceDataSource):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource =
        wrapped.cdkObject
  }

  /**
   * Describes the mapping of each data element in the streaming source to the corresponding column
   * in the in-application stream.
   *
   * Also used to describe the format of the reference data source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * RecordColumnProperty recordColumnProperty = RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html)
   */
  public interface RecordColumnProperty {
    /**
     * Reference to the data element in the streaming input or the reference data source.
     *
     * This element is required if the
     * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
     * is `JSON` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-mapping)
     */
    public fun mapping(): String? = unwrap(this).getMapping()

    /**
     * Name of the column created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-name)
     */
    public fun name(): String

    /**
     * Type of column created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-sqltype)
     */
    public fun sqlType(): String

    /**
     * A builder for [RecordColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mapping Reference to the data element in the streaming input or the reference data
       * source.
       * This element is required if the
       * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
       * is `JSON` .
       */
      public fun mapping(mapping: String)

      /**
       * @param name Name of the column created in the in-application input stream or reference
       * table. 
       */
      public fun name(name: String)

      /**
       * @param sqlType Type of column created in the in-application input stream or reference
       * table. 
       */
      public fun sqlType(sqlType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty.builder()

      /**
       * @param mapping Reference to the data element in the streaming input or the reference data
       * source.
       * This element is required if the
       * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
       * is `JSON` .
       */
      override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      /**
       * @param name Name of the column created in the in-application input stream or reference
       * table. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sqlType Type of column created in the in-application input stream or reference
       * table. 
       */
      override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty,
    ) : CdkObject(cdkObject), RecordColumnProperty {
      /**
       * Reference to the data element in the streaming input or the reference data source.
       *
       * This element is required if the
       * [RecordFormatType](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_RecordFormat.html#analytics-Type-RecordFormat-RecordFormatTypel)
       * is `JSON` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-mapping)
       */
      override fun mapping(): String? = unwrap(this).getMapping()

      /**
       * Name of the column created in the in-application input stream or reference table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * Type of column created in the in-application input stream or reference table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalytics-applicationreferencedatasource-recordcolumn-sqltype)
       */
      override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty):
          RecordColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordColumnProperty
    }
  }

  /**
   * The ReferenceSchema property type specifies the format of the data in the reference source for
   * a SQL-based Amazon Kinesis Data Analytics application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * ReferenceSchemaProperty referenceSchemaProperty = ReferenceSchemaProperty.builder()
   * .recordColumns(List.of(RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build()))
   * .recordFormat(RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .recordEncoding("recordEncoding")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html)
   */
  public interface ReferenceSchemaProperty {
    /**
     * A list of RecordColumn objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns)
     */
    public fun recordColumns(): Any

    /**
     * Specifies the encoding of the records in the reference source.
     *
     * For example, UTF-8.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding)
     */
    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    /**
     * Specifies the format of the records on the reference source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordformat)
     */
    public fun recordFormat(): Any

    /**
     * A builder for [ReferenceSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumns A list of RecordColumn objects. 
       */
      public fun recordColumns(recordColumns: IResolvable)

      /**
       * @param recordColumns A list of RecordColumn objects. 
       */
      public fun recordColumns(recordColumns: List<Any>)

      /**
       * @param recordColumns A list of RecordColumn objects. 
       */
      public fun recordColumns(vararg recordColumns: Any)

      /**
       * @param recordEncoding Specifies the encoding of the records in the reference source.
       * For example, UTF-8.
       */
      public fun recordEncoding(recordEncoding: String)

      /**
       * @param recordFormat Specifies the format of the records on the reference source. 
       */
      public fun recordFormat(recordFormat: IResolvable)

      /**
       * @param recordFormat Specifies the format of the records on the reference source. 
       */
      public fun recordFormat(recordFormat: RecordFormatProperty)

      /**
       * @param recordFormat Specifies the format of the records on the reference source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f2bf430584a1a618caf47f007e3293b62326d4c342a23dbd233fb00f81b3abf")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty.builder()

      /**
       * @param recordColumns A list of RecordColumn objects. 
       */
      override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable::unwrap))
      }

      /**
       * @param recordColumns A list of RecordColumn objects. 
       */
      override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns)
      }

      /**
       * @param recordColumns A list of RecordColumn objects. 
       */
      override fun recordColumns(vararg recordColumns: Any): Unit =
          recordColumns(recordColumns.toList())

      /**
       * @param recordEncoding Specifies the encoding of the records in the reference source.
       * For example, UTF-8.
       */
      override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      /**
       * @param recordFormat Specifies the format of the records on the reference source. 
       */
      override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the reference source. 
       */
      override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the reference source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1f2bf430584a1a618caf47f007e3293b62326d4c342a23dbd233fb00f81b3abf")
      override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit =
          recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty,
    ) : CdkObject(cdkObject), ReferenceSchemaProperty {
      /**
       * A list of RecordColumn objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordcolumns)
       */
      override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      /**
       * Specifies the encoding of the records in the reference source.
       *
       * For example, UTF-8.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordencoding)
       */
      override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      /**
       * Specifies the format of the records on the reference source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalytics-applicationreferencedatasource-referenceschema-recordformat)
       */
      override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty):
          ReferenceSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? ReferenceSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceSchemaProperty
    }
  }

  /**
   * Identifies the S3 bucket and object that contains the reference data.
   *
   * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your
   * behalf.
   *
   * An Amazon Kinesis Analytics application loads reference data only once. If the data changes,
   * you call the
   * [UpdateApplication](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/API_UpdateApplication.html)
   * operation to trigger reloading of data into your application.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * S3ReferenceDataSourceProperty s3ReferenceDataSourceProperty =
   * S3ReferenceDataSourceProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * .referenceRoleArn("referenceRoleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html)
   */
  public interface S3ReferenceDataSourceProperty {
    /**
     * Amazon Resource Name (ARN) of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * Object key name containing reference data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey)
     */
    public fun fileKey(): String

    /**
     * ARN of the IAM role that the service can assume to read data on your behalf.
     *
     * This role must have permission for the `s3:GetObject` action on the object and trust policy
     * that allows Amazon Kinesis Analytics service principal to assume this role.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn)
     */
    public fun referenceRoleArn(): String

    /**
     * A builder for [S3ReferenceDataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn Amazon Resource Name (ARN) of the S3 bucket. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param fileKey Object key name containing reference data. 
       */
      public fun fileKey(fileKey: String)

      /**
       * @param referenceRoleArn ARN of the IAM role that the service can assume to read data on
       * your behalf. 
       * This role must have permission for the `s3:GetObject` action on the object and trust policy
       * that allows Amazon Kinesis Analytics service principal to assume this role.
       */
      public fun referenceRoleArn(referenceRoleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty.builder()

      /**
       * @param bucketArn Amazon Resource Name (ARN) of the S3 bucket. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param fileKey Object key name containing reference data. 
       */
      override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      /**
       * @param referenceRoleArn ARN of the IAM role that the service can assume to read data on
       * your behalf. 
       * This role must have permission for the `s3:GetObject` action on the object and trust policy
       * that allows Amazon Kinesis Analytics service principal to assume this role.
       */
      override fun referenceRoleArn(referenceRoleArn: String) {
        cdkBuilder.referenceRoleArn(referenceRoleArn)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty,
    ) : CdkObject(cdkObject), S3ReferenceDataSourceProperty {
      /**
       * Amazon Resource Name (ARN) of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * Object key name containing reference data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-filekey)
       */
      override fun fileKey(): String = unwrap(this).getFileKey()

      /**
       * ARN of the IAM role that the service can assume to read data on your behalf.
       *
       * This role must have permission for the `s3:GetObject` action on the object and trust policy
       * that allows Amazon Kinesis Analytics service principal to assume this role.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-s3referencedatasource-referencerolearn)
       */
      override fun referenceRoleArn(): String = unwrap(this).getReferenceRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty):
          S3ReferenceDataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3ReferenceDataSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.S3ReferenceDataSourceProperty
    }
  }

  /**
   * Describes the reference data source by providing the source information (S3 bucket name and
   * object key name), the resulting in-application table name that is created, and the necessary
   * schema to map the data elements in the Amazon S3 object to the in-application table.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * ReferenceDataSourceProperty referenceDataSourceProperty = ReferenceDataSourceProperty.builder()
   * .referenceSchema(ReferenceSchemaProperty.builder()
   * .recordColumns(List.of(RecordColumnProperty.builder()
   * .name("name")
   * .sqlType("sqlType")
   * // the properties below are optional
   * .mapping("mapping")
   * .build()))
   * .recordFormat(RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build())
   * // the properties below are optional
   * .recordEncoding("recordEncoding")
   * .build())
   * // the properties below are optional
   * .s3ReferenceDataSource(S3ReferenceDataSourceProperty.builder()
   * .bucketArn("bucketArn")
   * .fileKey("fileKey")
   * .referenceRoleArn("referenceRoleArn")
   * .build())
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html)
   */
  public interface ReferenceDataSourceProperty {
    /**
     * Describes the format of the data in the streaming source, and how each data element maps to
     * corresponding columns created in the in-application stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-referenceschema)
     */
    public fun referenceSchema(): Any

    /**
     * Identifies the S3 bucket and object that contains the reference data.
     *
     * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on your
     * behalf. An Amazon Kinesis Analytics application loads reference data only once. If the data
     * changes, you call the `UpdateApplication` operation to trigger reloading of data into your
     * application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-s3referencedatasource)
     */
    public fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

    /**
     * Name of the in-application table to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename)
     */
    public fun tableName(): String? = unwrap(this).getTableName()

    /**
     * A builder for [ReferenceDataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      public fun referenceSchema(referenceSchema: IResolvable)

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      public fun referenceSchema(referenceSchema: ReferenceSchemaProperty)

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e7d5ad4c7a8a6f1778176e5e40688ac4227a21d1062e9980b55a23759e9156c")
      public fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit)

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on
       * your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the
       * data changes, you call the `UpdateApplication` operation to trigger reloading of data into
       * your application.
       */
      public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable)

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on
       * your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the
       * data changes, you call the `UpdateApplication` operation to trigger reloading of data into
       * your application.
       */
      public fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty)

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on
       * your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the
       * data changes, you call the `UpdateApplication` operation to trigger reloading of data into
       * your application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3262d4545f58886169d4ffe22e71df755119aedf54784570b82e38146d9a3f46")
      public
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit)

      /**
       * @param tableName Name of the in-application table to create.
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty.builder()

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      override fun referenceSchema(referenceSchema: IResolvable) {
        cdkBuilder.referenceSchema(referenceSchema.let(IResolvable::unwrap))
      }

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      override fun referenceSchema(referenceSchema: ReferenceSchemaProperty) {
        cdkBuilder.referenceSchema(referenceSchema.let(ReferenceSchemaProperty::unwrap))
      }

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0e7d5ad4c7a8a6f1778176e5e40688ac4227a21d1062e9980b55a23759e9156c")
      override fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit):
          Unit = referenceSchema(ReferenceSchemaProperty(referenceSchema))

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on
       * your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the
       * data changes, you call the `UpdateApplication` operation to trigger reloading of data into
       * your application.
       */
      override fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(IResolvable::unwrap))
      }

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on
       * your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the
       * data changes, you call the `UpdateApplication` operation to trigger reloading of data into
       * your application.
       */
      override fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(S3ReferenceDataSourceProperty::unwrap))
      }

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on
       * your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the
       * data changes, you call the `UpdateApplication` operation to trigger reloading of data into
       * your application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3262d4545f58886169d4ffe22e71df755119aedf54784570b82e38146d9a3f46")
      override
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit):
          Unit = s3ReferenceDataSource(S3ReferenceDataSourceProperty(s3ReferenceDataSource))

      /**
       * @param tableName Name of the in-application table to create.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty,
    ) : CdkObject(cdkObject), ReferenceDataSourceProperty {
      /**
       * Describes the format of the data in the streaming source, and how each data element maps to
       * corresponding columns created in the in-application stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-referenceschema)
       */
      override fun referenceSchema(): Any = unwrap(this).getReferenceSchema()

      /**
       * Identifies the S3 bucket and object that contains the reference data.
       *
       * Also identifies the IAM role Amazon Kinesis Analytics can assume to read this object on
       * your behalf. An Amazon Kinesis Analytics application loads reference data only once. If the
       * data changes, you call the `UpdateApplication` operation to trigger reloading of data into
       * your application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-s3referencedatasource)
       */
      override fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

      /**
       * Name of the in-application table to create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalytics-applicationreferencedatasource-referencedatasource-tablename)
       */
      override fun tableName(): String? = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty):
          ReferenceDataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReferenceDataSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.ReferenceDataSourceProperty
    }
  }

  /**
   * Describes the record format and relevant mapping information that should be applied to
   * schematize the records on the stream.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * RecordFormatProperty recordFormatProperty = RecordFormatProperty.builder()
   * .recordFormatType("recordFormatType")
   * // the properties below are optional
   * .mappingParameters(MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html)
   */
  public interface RecordFormatProperty {
    /**
     * When configuring application input at the time of creating or updating an application,
     * provides additional mapping information specific to the record format (such as JSON, CSV, or
     * record fields delimited by some delimiter) on the streaming source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-mappingparameters)
     */
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    /**
     * The type of record format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype)
     */
    public fun recordFormatType(): String

    /**
     * A builder for [RecordFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: IResolvable)

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: MappingParametersProperty)

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2dabda88716349b678117ef0c4dce78dcc23d59ae01651fd6b7836b6d9ee22e")
      public fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit)

      /**
       * @param recordFormatType The type of record format. 
       */
      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty.builder()

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable::unwrap))
      }

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty::unwrap))
      }

      /**
       * @param mappingParameters When configuring application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e2dabda88716349b678117ef0c4dce78dcc23d59ae01651fd6b7836b6d9ee22e")
      override
          fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit):
          Unit = mappingParameters(MappingParametersProperty(mappingParameters))

      /**
       * @param recordFormatType The type of record format. 
       */
      override fun recordFormatType(recordFormatType: String) {
        cdkBuilder.recordFormatType(recordFormatType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty,
    ) : CdkObject(cdkObject), RecordFormatProperty {
      /**
       * When configuring application input at the time of creating or updating an application,
       * provides additional mapping information specific to the record format (such as JSON, CSV, or
       * record fields delimited by some delimiter) on the streaming source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-mappingparameters)
       */
      override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      /**
       * The type of record format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-recordformat.html#cfn-kinesisanalytics-applicationreferencedatasource-recordformat-recordformattype)
       */
      override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty):
          RecordFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.RecordFormatProperty
    }
  }

  /**
   * When configuring application input at the time of creating or updating an application, provides
   * additional mapping information specific to the record format (such as JSON, CSV, or record fields
   * delimited by some delimiter) on the streaming source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * MappingParametersProperty mappingParametersProperty = MappingParametersProperty.builder()
   * .csvMappingParameters(CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build())
   * .jsonMappingParameters(JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html)
   */
  public interface MappingParametersProperty {
    /**
     * Provides additional mapping information when the record format uses delimiters (for example,
     * CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-csvmappingparameters)
     */
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    /**
     * Provides additional mapping information when JSON is the record format on the streaming
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
     */
    public fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()

    /**
     * A builder for [MappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      public fun csvMappingParameters(csvMappingParameters: IResolvable)

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      public fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty)

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb8161310c7226cff0340736545e41c24ab1e4f73abad4514a23a6e7b4f127b0")
      public
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      public fun jsonMappingParameters(jsonMappingParameters: IResolvable)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      public fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty)

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("217b11c9e2dc0cbfd847ffe9ebaab26f12c8e3c42f92c42f3d31f9fffcd6c194")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty.builder()

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("bb8161310c7226cff0340736545e41c24ab1e4f73abad4514a23a6e7b4f127b0")
      override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("217b11c9e2dc0cbfd847ffe9ebaab26f12c8e3c42f92c42f3d31f9fffcd6c194")
      override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty,
    ) : CdkObject(cdkObject), MappingParametersProperty {
      /**
       * Provides additional mapping information when the record format uses delimiters (for
       * example, CSV).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-csvmappingparameters)
       */
      override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      /**
       * Provides additional mapping information when JSON is the record format on the streaming
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
       */
      override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty):
          MappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.MappingParametersProperty
    }
  }

  /**
   * Provides additional mapping information when JSON is the record format on the streaming source.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * JSONMappingParametersProperty jSONMappingParametersProperty =
   * JSONMappingParametersProperty.builder()
   * .recordRowPath("recordRowPath")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html)
   */
  public interface JSONMappingParametersProperty {
    /**
     * Path to the top-level parent that contains the records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
     */
    public fun recordRowPath(): String

    /**
     * A builder for [JSONMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordRowPath Path to the top-level parent that contains the records. 
       */
      public fun recordRowPath(recordRowPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty.builder()

      /**
       * @param recordRowPath Path to the top-level parent that contains the records. 
       */
      override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty,
    ) : CdkObject(cdkObject), JSONMappingParametersProperty {
      /**
       * Path to the top-level parent that contains the records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
       */
      override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty):
          JSONMappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JSONMappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.JSONMappingParametersProperty
    }
  }

  /**
   * Provides additional mapping information when the record format uses delimiters, such as CSV.
   *
   * For example, the following sample records use CSV format, where the records use the *'\n'* as
   * the row delimiter and a comma (",") as the column delimiter:
   *
   * `"name1", "address1"`
   *
   * `"name2", "address2"`
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
   * CSVMappingParametersProperty cSVMappingParametersProperty =
   * CSVMappingParametersProperty.builder()
   * .recordColumnDelimiter("recordColumnDelimiter")
   * .recordRowDelimiter("recordRowDelimiter")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html)
   */
  public interface CSVMappingParametersProperty {
    /**
     * Column delimiter.
     *
     * For example, in a CSV format, a comma (",") is the typical column delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
     */
    public fun recordColumnDelimiter(): String

    /**
     * Row delimiter.
     *
     * For example, in a CSV format, *'\n'* is the typical row delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
     */
    public fun recordRowDelimiter(): String

    /**
     * A builder for [CSVMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumnDelimiter Column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      public fun recordColumnDelimiter(recordColumnDelimiter: String)

      /**
       * @param recordRowDelimiter Row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      public fun recordRowDelimiter(recordRowDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty.builder()

      /**
       * @param recordColumnDelimiter Column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      /**
       * @param recordRowDelimiter Row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty,
    ) : CdkObject(cdkObject), CSVMappingParametersProperty {
      /**
       * Column delimiter.
       *
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
       */
      override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      /**
       * Row delimiter.
       *
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalytics-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
       */
      override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty):
          CSVMappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CSVMappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSource.CSVMappingParametersProperty
    }
  }
}
