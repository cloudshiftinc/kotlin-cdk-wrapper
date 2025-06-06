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
 * Adds a reference data source to an existing SQL-based Kinesis Data Analytics application.
 *
 * Kinesis Data Analytics reads reference data (that is, an Amazon S3 object) and creates an
 * in-application table within your application. In the request, you provide the source (S3 bucket name
 * and object key name), name of the in-application table to create, and the necessary mapping
 * information that describes how data in an Amazon S3 object maps to columns in the resulting
 * in-application table.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.kinesisanalytics.*;
 * CfnApplicationReferenceDataSourceV2 cfnApplicationReferenceDataSourceV2 =
 * CfnApplicationReferenceDataSourceV2.Builder.create(this, "MyCfnApplicationReferenceDataSourceV2")
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
 * .build())
 * .tableName("tableName")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html)
 */
public open class CfnApplicationReferenceDataSourceV2(
  cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2,
) : CfnResource(cdkObject),
    IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationReferenceDataSourceV2Props,
  ) :
      this(software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApplicationReferenceDataSourceV2Props.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApplicationReferenceDataSourceV2Props.Builder.() -> Unit,
  ) : this(scope, id, CfnApplicationReferenceDataSourceV2Props(props)
  )

  /**
   * The name of the application.
   */
  public open fun applicationName(): String = unwrap(this).getApplicationName()

  /**
   * The name of the application.
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
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
   * providing the source information (Amazon S3 bucket name and object key name), the resulting
   * in-application table name that is created, and the necessary schema to map the data elements in
   * the Amazon S3 object to the in-application table.
   */
  public open fun referenceDataSource(): Any = unwrap(this).getReferenceDataSource()

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
   * providing the source information (Amazon S3 bucket name and object key name), the resulting
   * in-application table name that is created, and the necessary schema to map the data elements in
   * the Amazon S3 object to the in-application table.
   */
  public open fun referenceDataSource(`value`: IResolvable) {
    unwrap(this).setReferenceDataSource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
   * providing the source information (Amazon S3 bucket name and object key name), the resulting
   * in-application table name that is created, and the necessary schema to map the data elements in
   * the Amazon S3 object to the in-application table.
   */
  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty) {
    unwrap(this).setReferenceDataSource(`value`.let(ReferenceDataSourceProperty.Companion::unwrap))
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
   * providing the source information (Amazon S3 bucket name and object key name), the resulting
   * in-application table name that is created, and the necessary schema to map the data elements in
   * the Amazon S3 object to the in-application table.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d1c998c97750f5e2de757179b682d329c914a5f64e2ec0e381647a2841cc6c25")
  public open fun referenceDataSource(`value`: ReferenceDataSourceProperty.Builder.() -> Unit): Unit
      = referenceDataSource(ReferenceDataSourceProperty(`value`))

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname)
     * @param applicationName The name of the application. 
     */
    public fun applicationName(applicationName: String)

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements in
     * the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     * reference data source by providing the source information (Amazon S3 bucket name and object key
     * name), the resulting in-application table name that is created, and the necessary schema to map
     * the data elements in the Amazon S3 object to the in-application table. 
     */
    public fun referenceDataSource(referenceDataSource: IResolvable)

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements in
     * the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     * reference data source by providing the source information (Amazon S3 bucket name and object key
     * name), the resulting in-application table name that is created, and the necessary schema to map
     * the data elements in the Amazon S3 object to the in-application table. 
     */
    public fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty)

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements in
     * the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     * reference data source by providing the source information (Amazon S3 bucket name and object key
     * name), the resulting in-application table name that is created, and the necessary schema to map
     * the data elements in the Amazon S3 object to the in-application table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d3cd708ed3508a9898619a52e0df1b1ae1c31cb02154951c4c82ed6a11e562")
    public
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.Builder
        =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.Builder.create(scope,
        id)

    /**
     * The name of the application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-applicationname)
     * @param applicationName The name of the application. 
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements in
     * the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     * reference data source by providing the source information (Amazon S3 bucket name and object key
     * name), the resulting in-application table name that is created, and the necessary schema to map
     * the data elements in the Amazon S3 object to the in-application table. 
     */
    override fun referenceDataSource(referenceDataSource: IResolvable) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(IResolvable.Companion::unwrap))
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements in
     * the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     * reference data source by providing the source information (Amazon S3 bucket name and object key
     * name), the resulting in-application table name that is created, and the necessary schema to map
     * the data elements in the Amazon S3 object to the in-application table. 
     */
    override fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty) {
      cdkBuilder.referenceDataSource(referenceDataSource.let(ReferenceDataSourceProperty.Companion::unwrap))
    }

    /**
     * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
     * providing the source information (Amazon S3 bucket name and object key name), the resulting
     * in-application table name that is created, and the necessary schema to map the data elements in
     * the Amazon S3 object to the in-application table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-kinesisanalyticsv2-applicationreferencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource)
     * @param referenceDataSource For a SQL-based Kinesis Data Analytics application, describes the
     * reference data source by providing the source information (Amazon S3 bucket name and object key
     * name), the resulting in-application table name that is created, and the necessary schema to map
     * the data elements in the Amazon S3 object to the in-application table. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c4d3cd708ed3508a9898619a52e0df1b1ae1c31cb02154951c4c82ed6a11e562")
    override
        fun referenceDataSource(referenceDataSource: ReferenceDataSourceProperty.Builder.() -> Unit):
        Unit = referenceDataSource(ReferenceDataSourceProperty(referenceDataSource))

    public fun build():
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApplicationReferenceDataSourceV2 {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApplicationReferenceDataSourceV2(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2):
        CfnApplicationReferenceDataSourceV2 = CfnApplicationReferenceDataSourceV2(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationReferenceDataSourceV2):
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2 =
        wrapped.cdkObject as
        software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
   * when the record format uses delimiters, such as CSV.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html)
   */
  public interface CSVMappingParametersProperty {
    /**
     * The column delimiter.
     *
     * For example, in a CSV format, a comma (",") is the typical column delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
     */
    public fun recordColumnDelimiter(): String

    /**
     * The row delimiter.
     *
     * For example, in a CSV format, *'\n'* is the typical row delimiter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
     */
    public fun recordRowDelimiter(): String

    /**
     * A builder for [CSVMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumnDelimiter The column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      public fun recordColumnDelimiter(recordColumnDelimiter: String)

      /**
       * @param recordRowDelimiter The row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      public fun recordRowDelimiter(recordRowDelimiter: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty.builder()

      /**
       * @param recordColumnDelimiter The column delimiter. 
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       */
      override fun recordColumnDelimiter(recordColumnDelimiter: String) {
        cdkBuilder.recordColumnDelimiter(recordColumnDelimiter)
      }

      /**
       * @param recordRowDelimiter The row delimiter. 
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       */
      override fun recordRowDelimiter(recordRowDelimiter: String) {
        cdkBuilder.recordRowDelimiter(recordRowDelimiter)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty,
    ) : CdkObject(cdkObject),
        CSVMappingParametersProperty {
      /**
       * The column delimiter.
       *
       * For example, in a CSV format, a comma (",") is the typical column delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordcolumndelimiter)
       */
      override fun recordColumnDelimiter(): String = unwrap(this).getRecordColumnDelimiter()

      /**
       * The row delimiter.
       *
       * For example, in a CSV format, *'\n'* is the typical row delimiter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-csvmappingparameters-recordrowdelimiter)
       */
      override fun recordRowDelimiter(): String = unwrap(this).getRecordRowDelimiter()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): CSVMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty):
          CSVMappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          CSVMappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: CSVMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.CSVMappingParametersProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, provides additional mapping information
   * when JSON is the record format on the streaming source.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html)
   */
  public interface JSONMappingParametersProperty {
    /**
     * The path to the top-level parent that contains the records.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
     */
    public fun recordRowPath(): String

    /**
     * A builder for [JSONMappingParametersProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordRowPath The path to the top-level parent that contains the records. 
       */
      public fun recordRowPath(recordRowPath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty.builder()

      /**
       * @param recordRowPath The path to the top-level parent that contains the records. 
       */
      override fun recordRowPath(recordRowPath: String) {
        cdkBuilder.recordRowPath(recordRowPath)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty,
    ) : CdkObject(cdkObject),
        JSONMappingParametersProperty {
      /**
       * The path to the top-level parent that contains the records.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-jsonmappingparameters-recordrowpath)
       */
      override fun recordRowPath(): String = unwrap(this).getRecordRowPath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): JSONMappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty):
          JSONMappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          JSONMappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: JSONMappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.JSONMappingParametersProperty
    }
  }

  /**
   * When you configure a SQL-based Kinesis Data Analytics application's input at the time of
   * creating or updating an application, provides additional mapping information specific to the
   * record format (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming
   * source.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html)
   */
  public interface MappingParametersProperty {
    /**
     * Provides additional mapping information when the record format uses delimiters (for example,
     * CSV).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters-csvmappingparameters)
     */
    public fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

    /**
     * Provides additional mapping information when JSON is the record format on the streaming
     * source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
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
      @JvmName("925d695c2fe01427163b2c300c24fcc668c27e71a5c3f6d287630e5fb1477594")
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
      @JvmName("2d4fdf5c4a50f602ccf3d8f3d812889594e2d6b1fa5f37e30afb96e6876f2016")
      public
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty.builder()

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: IResolvable) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      override fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty) {
        cdkBuilder.csvMappingParameters(csvMappingParameters.let(CSVMappingParametersProperty.Companion::unwrap))
      }

      /**
       * @param csvMappingParameters Provides additional mapping information when the record format
       * uses delimiters (for example, CSV).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("925d695c2fe01427163b2c300c24fcc668c27e71a5c3f6d287630e5fb1477594")
      override
          fun csvMappingParameters(csvMappingParameters: CSVMappingParametersProperty.Builder.() -> Unit):
          Unit = csvMappingParameters(CSVMappingParametersProperty(csvMappingParameters))

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: IResolvable) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      override fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty) {
        cdkBuilder.jsonMappingParameters(jsonMappingParameters.let(JSONMappingParametersProperty.Companion::unwrap))
      }

      /**
       * @param jsonMappingParameters Provides additional mapping information when JSON is the
       * record format on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("2d4fdf5c4a50f602ccf3d8f3d812889594e2d6b1fa5f37e30afb96e6876f2016")
      override
          fun jsonMappingParameters(jsonMappingParameters: JSONMappingParametersProperty.Builder.() -> Unit):
          Unit = jsonMappingParameters(JSONMappingParametersProperty(jsonMappingParameters))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty,
    ) : CdkObject(cdkObject),
        MappingParametersProperty {
      /**
       * Provides additional mapping information when the record format uses delimiters (for
       * example, CSV).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters-csvmappingparameters)
       */
      override fun csvMappingParameters(): Any? = unwrap(this).getCsvMappingParameters()

      /**
       * Provides additional mapping information when JSON is the record format on the streaming
       * source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-mappingparameters-jsonmappingparameters)
       */
      override fun jsonMappingParameters(): Any? = unwrap(this).getJsonMappingParameters()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MappingParametersProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty):
          MappingParametersProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MappingParametersProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MappingParametersProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.MappingParametersProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the mapping of each data element
   * in the streaming source to the corresponding column in the in-application stream.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html)
   */
  public interface RecordColumnProperty {
    /**
     * A reference to the data element in the streaming input or the reference data source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn-mapping)
     */
    public fun mapping(): String? = unwrap(this).getMapping()

    /**
     * The name of the column that is created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn-name)
     */
    public fun name(): String

    /**
     * The type of column created in the in-application input stream or reference table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn-sqltype)
     */
    public fun sqlType(): String

    /**
     * A builder for [RecordColumnProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mapping A reference to the data element in the streaming input or the reference data
       * source.
       */
      public fun mapping(mapping: String)

      /**
       * @param name The name of the column that is created in the in-application input stream or
       * reference table. 
       */
      public fun name(name: String)

      /**
       * @param sqlType The type of column created in the in-application input stream or reference
       * table. 
       */
      public fun sqlType(sqlType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty.builder()

      /**
       * @param mapping A reference to the data element in the streaming input or the reference data
       * source.
       */
      override fun mapping(mapping: String) {
        cdkBuilder.mapping(mapping)
      }

      /**
       * @param name The name of the column that is created in the in-application input stream or
       * reference table. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param sqlType The type of column created in the in-application input stream or reference
       * table. 
       */
      override fun sqlType(sqlType: String) {
        cdkBuilder.sqlType(sqlType)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty,
    ) : CdkObject(cdkObject),
        RecordColumnProperty {
      /**
       * A reference to the data element in the streaming input or the reference data source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn-mapping)
       */
      override fun mapping(): String? = unwrap(this).getMapping()

      /**
       * The name of the column that is created in the in-application input stream or reference
       * table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The type of column created in the in-application input stream or reference table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordcolumn-sqltype)
       */
      override fun sqlType(): String = unwrap(this).getSqlType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordColumnProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty):
          RecordColumnProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordColumnProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordColumnProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordColumnProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the record format and relevant
   * mapping information that should be applied to schematize the records on the stream.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html)
   */
  public interface RecordFormatProperty {
    /**
     * When you configure application input at the time of creating or updating an application,
     * provides additional mapping information specific to the record format (such as JSON, CSV, or
     * record fields delimited by some delimiter) on the streaming source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordformat-mappingparameters)
     */
    public fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

    /**
     * The type of record format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordformat-recordformattype)
     */
    public fun recordFormatType(): String

    /**
     * A builder for [RecordFormatProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: IResolvable)

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      public fun mappingParameters(mappingParameters: MappingParametersProperty)

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9355f01168aa04c8b14aaddc97622ba12495bb03768ec9fc390df24b14aef14a")
      public fun mappingParameters(mappingParameters: MappingParametersProperty.Builder.() -> Unit)

      /**
       * @param recordFormatType The type of record format. 
       */
      public fun recordFormatType(recordFormatType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty.builder()

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: IResolvable) {
        cdkBuilder.mappingParameters(mappingParameters.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      override fun mappingParameters(mappingParameters: MappingParametersProperty) {
        cdkBuilder.mappingParameters(mappingParameters.let(MappingParametersProperty.Companion::unwrap))
      }

      /**
       * @param mappingParameters When you configure application input at the time of creating or
       * updating an application, provides additional mapping information specific to the record format
       * (such as JSON, CSV, or record fields delimited by some delimiter) on the streaming source.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9355f01168aa04c8b14aaddc97622ba12495bb03768ec9fc390df24b14aef14a")
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
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty,
    ) : CdkObject(cdkObject),
        RecordFormatProperty {
      /**
       * When you configure application input at the time of creating or updating an application,
       * provides additional mapping information specific to the record format (such as JSON, CSV, or
       * record fields delimited by some delimiter) on the streaming source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordformat-mappingparameters)
       */
      override fun mappingParameters(): Any? = unwrap(this).getMappingParameters()

      /**
       * The type of record format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-recordformat.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-recordformat-recordformattype)
       */
      override fun recordFormatType(): String = unwrap(this).getRecordFormatType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RecordFormatProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty):
          RecordFormatProperty = CdkObjectWrappers.wrap(cdkObject) as? RecordFormatProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RecordFormatProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.RecordFormatProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the reference data source by
   * providing the source information (Amazon S3 bucket name and object key name), the resulting
   * in-application table name that is created, and the necessary schema to map the data elements in
   * the Amazon S3 object to the in-application table.
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
   * .build())
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html)
   */
  public interface ReferenceDataSourceProperty {
    /**
     * Describes the format of the data in the streaming source, and how each data element maps to
     * corresponding columns created in the in-application stream.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-referenceschema)
     */
    public fun referenceSchema(): Any

    /**
     * Identifies the S3 bucket and object that contains the reference data.
     *
     * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
     * call the
     * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
     * operation to trigger reloading of data into your application.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-s3referencedatasource)
     */
    public fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

    /**
     * The name of the in-application table to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-tablename)
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
      @JvmName("4e005b0c8ced29c3853d670709c7e4289adc0ca163eb47ca8a50835e6cfef344")
      public fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit)

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * A Kinesis Data Analytics application loads reference data only once. If the data changes,
       * you call the
       * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
       * operation to trigger reloading of data into your application.
       */
      public fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable)

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * A Kinesis Data Analytics application loads reference data only once. If the data changes,
       * you call the
       * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
       * operation to trigger reloading of data into your application.
       */
      public fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty)

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * A Kinesis Data Analytics application loads reference data only once. If the data changes,
       * you call the
       * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
       * operation to trigger reloading of data into your application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67c2f5ac9cbcd62e0a00fdeaecc7ac564b1438977587ec098dd438aef8293556")
      public
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit)

      /**
       * @param tableName The name of the in-application table to create.
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty.builder()

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      override fun referenceSchema(referenceSchema: IResolvable) {
        cdkBuilder.referenceSchema(referenceSchema.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      override fun referenceSchema(referenceSchema: ReferenceSchemaProperty) {
        cdkBuilder.referenceSchema(referenceSchema.let(ReferenceSchemaProperty.Companion::unwrap))
      }

      /**
       * @param referenceSchema Describes the format of the data in the streaming source, and how
       * each data element maps to corresponding columns created in the in-application stream. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4e005b0c8ced29c3853d670709c7e4289adc0ca163eb47ca8a50835e6cfef344")
      override fun referenceSchema(referenceSchema: ReferenceSchemaProperty.Builder.() -> Unit):
          Unit = referenceSchema(ReferenceSchemaProperty(referenceSchema))

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * A Kinesis Data Analytics application loads reference data only once. If the data changes,
       * you call the
       * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
       * operation to trigger reloading of data into your application.
       */
      override fun s3ReferenceDataSource(s3ReferenceDataSource: IResolvable) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * A Kinesis Data Analytics application loads reference data only once. If the data changes,
       * you call the
       * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
       * operation to trigger reloading of data into your application.
       */
      override fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty) {
        cdkBuilder.s3ReferenceDataSource(s3ReferenceDataSource.let(S3ReferenceDataSourceProperty.Companion::unwrap))
      }

      /**
       * @param s3ReferenceDataSource Identifies the S3 bucket and object that contains the
       * reference data.
       * A Kinesis Data Analytics application loads reference data only once. If the data changes,
       * you call the
       * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
       * operation to trigger reloading of data into your application.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("67c2f5ac9cbcd62e0a00fdeaecc7ac564b1438977587ec098dd438aef8293556")
      override
          fun s3ReferenceDataSource(s3ReferenceDataSource: S3ReferenceDataSourceProperty.Builder.() -> Unit):
          Unit = s3ReferenceDataSource(S3ReferenceDataSourceProperty(s3ReferenceDataSource))

      /**
       * @param tableName The name of the in-application table to create.
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty,
    ) : CdkObject(cdkObject),
        ReferenceDataSourceProperty {
      /**
       * Describes the format of the data in the streaming source, and how each data element maps to
       * corresponding columns created in the in-application stream.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-referenceschema)
       */
      override fun referenceSchema(): Any = unwrap(this).getReferenceSchema()

      /**
       * Identifies the S3 bucket and object that contains the reference data.
       *
       * A Kinesis Data Analytics application loads reference data only once. If the data changes,
       * you call the
       * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
       * operation to trigger reloading of data into your application.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-s3referencedatasource)
       */
      override fun s3ReferenceDataSource(): Any? = unwrap(this).getS3ReferenceDataSource()

      /**
       * The name of the in-application table to create.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referencedatasource-tablename)
       */
      override fun tableName(): String? = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty):
          ReferenceDataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ReferenceDataSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceDataSourceProperty
    }
  }

  /**
   * For a SQL-based Kinesis Data Analytics application, describes the format of the data in the
   * streaming source, and how each data element maps to corresponding columns created in the
   * in-application stream.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html)
   */
  public interface ReferenceSchemaProperty {
    /**
     * A list of `RecordColumn` objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referenceschema-recordcolumns)
     */
    public fun recordColumns(): Any

    /**
     * Specifies the encoding of the records in the streaming source.
     *
     * For example, UTF-8.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referenceschema-recordencoding)
     */
    public fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

    /**
     * Specifies the format of the records on the streaming source.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referenceschema-recordformat)
     */
    public fun recordFormat(): Any

    /**
     * A builder for [ReferenceSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(recordColumns: IResolvable)

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(recordColumns: List<Any>)

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      public fun recordColumns(vararg recordColumns: Any)

      /**
       * @param recordEncoding Specifies the encoding of the records in the streaming source.
       * For example, UTF-8.
       */
      public fun recordEncoding(recordEncoding: String)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      public fun recordFormat(recordFormat: IResolvable)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      public fun recordFormat(recordFormat: RecordFormatProperty)

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde604734a23a49df990e10c9bee2231c25e647050edeb6e8abcb6f6b01b38c0")
      public fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty.builder()

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(recordColumns: IResolvable) {
        cdkBuilder.recordColumns(recordColumns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(recordColumns: List<Any>) {
        cdkBuilder.recordColumns(recordColumns.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param recordColumns A list of `RecordColumn` objects. 
       */
      override fun recordColumns(vararg recordColumns: Any): Unit =
          recordColumns(recordColumns.toList())

      /**
       * @param recordEncoding Specifies the encoding of the records in the streaming source.
       * For example, UTF-8.
       */
      override fun recordEncoding(recordEncoding: String) {
        cdkBuilder.recordEncoding(recordEncoding)
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      override fun recordFormat(recordFormat: IResolvable) {
        cdkBuilder.recordFormat(recordFormat.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      override fun recordFormat(recordFormat: RecordFormatProperty) {
        cdkBuilder.recordFormat(recordFormat.let(RecordFormatProperty.Companion::unwrap))
      }

      /**
       * @param recordFormat Specifies the format of the records on the streaming source. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dde604734a23a49df990e10c9bee2231c25e647050edeb6e8abcb6f6b01b38c0")
      override fun recordFormat(recordFormat: RecordFormatProperty.Builder.() -> Unit): Unit =
          recordFormat(RecordFormatProperty(recordFormat))

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty,
    ) : CdkObject(cdkObject),
        ReferenceSchemaProperty {
      /**
       * A list of `RecordColumn` objects.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referenceschema-recordcolumns)
       */
      override fun recordColumns(): Any = unwrap(this).getRecordColumns()

      /**
       * Specifies the encoding of the records in the streaming source.
       *
       * For example, UTF-8.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referenceschema-recordencoding)
       */
      override fun recordEncoding(): String? = unwrap(this).getRecordEncoding()

      /**
       * Specifies the format of the records on the streaming source.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-referenceschema.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-referenceschema-recordformat)
       */
      override fun recordFormat(): Any = unwrap(this).getRecordFormat()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ReferenceSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty):
          ReferenceSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? ReferenceSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ReferenceSchemaProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.ReferenceSchemaProperty
    }
  }

  /**
   * For an SQL-based Amazon Kinesis Data Analytics application, identifies the Amazon S3 bucket and
   * object that contains the reference data.
   *
   * A Kinesis Data Analytics application loads reference data only once. If the data changes, you
   * call the
   * [UpdateApplication](https://docs.aws.amazon.com/managed-flink/latest/apiv2/API_UpdateApplication.html)
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html)
   */
  public interface S3ReferenceDataSourceProperty {
    /**
     * The Amazon Resource Name (ARN) of the S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource-bucketarn)
     */
    public fun bucketArn(): String

    /**
     * The object key name containing the reference data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource-filekey)
     */
    public fun fileKey(): String

    /**
     * A builder for [S3ReferenceDataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. 
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param fileKey The object key name containing the reference data. 
       */
      public fun fileKey(fileKey: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty.builder()

      /**
       * @param bucketArn The Amazon Resource Name (ARN) of the S3 bucket. 
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param fileKey The object key name containing the reference data. 
       */
      override fun fileKey(fileKey: String) {
        cdkBuilder.fileKey(fileKey)
      }

      public fun build():
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty,
    ) : CdkObject(cdkObject),
        S3ReferenceDataSourceProperty {
      /**
       * The Amazon Resource Name (ARN) of the S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource-bucketarn)
       */
      override fun bucketArn(): String = unwrap(this).getBucketArn()

      /**
       * The object key name containing the reference data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource.html#cfn-kinesisanalyticsv2-applicationreferencedatasource-s3referencedatasource-filekey)
       */
      override fun fileKey(): String = unwrap(this).getFileKey()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3ReferenceDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty):
          S3ReferenceDataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3ReferenceDataSourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3ReferenceDataSourceProperty):
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.kinesisanalytics.CfnApplicationReferenceDataSourceV2.S3ReferenceDataSourceProperty
    }
  }
}
