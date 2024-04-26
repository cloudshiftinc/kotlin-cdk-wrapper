@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.bcmdataexports

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggableV2
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a data export and specifies the data query, the delivery preference, and any optional
 * resource tags.
 *
 * A `DataQuery` consists of both a `QueryStatement` and `TableConfigurations` .
 *
 * The `QueryStatement` is an SQL statement. Data Exports only supports a limited subset of the SQL
 * syntax. For more information on the SQL syntax that is supported, see [Data
 * query](https://docs.aws.amazon.com/cur/latest/userguide/de-data-query.html) . To view the available
 * tables and columns, see the [Data Exports table
 * dictionary](https://docs.aws.amazon.com/cur/latest/userguide/de-table-dictionary.html) .
 *
 * The `TableConfigurations` is a collection of specified `TableProperties` for the table being
 * queried in the `QueryStatement` . TableProperties are additional configurations you can provide to
 * change the data and schema of a table. Each table can have different TableProperties. However,
 * tables are not required to have any TableProperties. Each table property has a default value that it
 * assumes if not specified. For more information on table configurations, see [Data
 * query](https://docs.aws.amazon.com/cur/latest/userguide/de-data-query.html) . To view the table
 * properties available for each table, see the [Data Exports table
 * dictionary](https://docs.aws.amazon.com/cur/latest/userguide/de-table-dictionary.html) or use the
 * `ListTables` API to get a response of all tables and their available properties.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
 * CfnExport cfnExport = CfnExport.Builder.create(this, "MyCfnExport")
 * .export(ExportProperty.builder()
 * .dataQuery(DataQueryProperty.builder()
 * .queryStatement("queryStatement")
 * // the properties below are optional
 * .tableConfigurations(Map.of(
 * "tableConfigurationsKey", Map.of(
 * "tableConfigurationsKey", "tableConfigurations")))
 * .build())
 * .destinationConfigurations(DestinationConfigurationsProperty.builder()
 * .s3Destination(S3DestinationProperty.builder()
 * .s3Bucket("s3Bucket")
 * .s3OutputConfigurations(S3OutputConfigurationsProperty.builder()
 * .compression("compression")
 * .format("format")
 * .outputType("outputType")
 * .overwrite("overwrite")
 * .build())
 * .s3Prefix("s3Prefix")
 * .s3Region("s3Region")
 * .build())
 * .build())
 * .name("name")
 * .refreshCadence(RefreshCadenceProperty.builder()
 * .frequency("frequency")
 * .build())
 * // the properties below are optional
 * .description("description")
 * .exportArn("exportArn")
 * .build())
 * // the properties below are optional
 * .tags(List.of(ResourceTagProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html)
 */
public open class CfnExport(
  cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnExportProps,
  ) :
      this(software.amazon.awscdk.services.bcmdataexports.CfnExport(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnExportProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnExportProps.Builder.() -> Unit,
  ) : this(scope, id, CfnExportProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) for this export.
   */
  public open fun attrExportArn(): String = unwrap(this).getAttrExportArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The details that are available for an export.
   */
  public open fun export(): Any = unwrap(this).getExport()

  /**
   * The details that are available for an export.
   */
  public open fun export(`value`: IResolvable) {
    unwrap(this).setExport(`value`.let(IResolvable::unwrap))
  }

  /**
   * The details that are available for an export.
   */
  public open fun export(`value`: ExportProperty) {
    unwrap(this).setExport(`value`.let(ExportProperty::unwrap))
  }

  /**
   * The details that are available for an export.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("64fa73e58837f4ddf9c3b3d3bcb8eb6bf002216e9bae531314c9aa2a6e011eee")
  public open fun export(`value`: ExportProperty.Builder.() -> Unit): Unit =
      export(ExportProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   *
   */
  public open fun tags(): List<ResourceTagProperty> =
      unwrap(this).getTags()?.map(ResourceTagProperty::wrap) ?: emptyList()

  /**
   *
   */
  public open fun tags(`value`: List<ResourceTagProperty>) {
    unwrap(this).setTags(`value`.map(ResourceTagProperty::unwrap))
  }

  /**
   *
   */
  public open fun tags(vararg `value`: ResourceTagProperty): Unit = tags(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.bcmdataexports.CfnExport].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The details that are available for an export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
     * @param export The details that are available for an export. 
     */
    public fun export(export: IResolvable)

    /**
     * The details that are available for an export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
     * @param export The details that are available for an export. 
     */
    public fun export(export: ExportProperty)

    /**
     * The details that are available for an export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
     * @param export The details that are available for an export. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b07bdc3ce8dd112805a2dee7f11a2c76e942e0e57a7892480ce50587dda2cc39")
    public fun export(export: ExportProperty.Builder.() -> Unit)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-tags)
     * @param tags 
     */
    public fun tags(tags: List<ResourceTagProperty>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-tags)
     * @param tags 
     */
    public fun tags(vararg tags: ResourceTagProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.bcmdataexports.CfnExport.Builder =
        software.amazon.awscdk.services.bcmdataexports.CfnExport.Builder.create(scope, id)

    /**
     * The details that are available for an export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
     * @param export The details that are available for an export. 
     */
    override fun export(export: IResolvable) {
      cdkBuilder.export(export.let(IResolvable::unwrap))
    }

    /**
     * The details that are available for an export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
     * @param export The details that are available for an export. 
     */
    override fun export(export: ExportProperty) {
      cdkBuilder.export(export.let(ExportProperty::unwrap))
    }

    /**
     * The details that are available for an export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-export)
     * @param export The details that are available for an export. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b07bdc3ce8dd112805a2dee7f11a2c76e942e0e57a7892480ce50587dda2cc39")
    override fun export(export: ExportProperty.Builder.() -> Unit): Unit =
        export(ExportProperty(export))

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-tags)
     * @param tags 
     */
    override fun tags(tags: List<ResourceTagProperty>) {
      cdkBuilder.tags(tags.map(ResourceTagProperty::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-bcmdataexports-export.html#cfn-bcmdataexports-export-tags)
     * @param tags 
     */
    override fun tags(vararg tags: ResourceTagProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.bcmdataexports.CfnExport =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.bcmdataexports.CfnExport.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnExport {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnExport(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport):
        CfnExport = CfnExport(cdkObject)

    internal fun unwrap(wrapped: CfnExport):
        software.amazon.awscdk.services.bcmdataexports.CfnExport = wrapped.cdkObject as
        software.amazon.awscdk.services.bcmdataexports.CfnExport
  }

  /**
   * The SQL query of column selections and row filters from the data table you want.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
   * DataQueryProperty dataQueryProperty = DataQueryProperty.builder()
   * .queryStatement("queryStatement")
   * // the properties below are optional
   * .tableConfigurations(Map.of(
   * "tableConfigurationsKey", Map.of(
   * "tableConfigurationsKey", "tableConfigurations")))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-dataquery.html)
   */
  public interface DataQueryProperty {
    /**
     * The query statement.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-dataquery.html#cfn-bcmdataexports-export-dataquery-querystatement)
     */
    public fun queryStatement(): String

    /**
     * The table configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-dataquery.html#cfn-bcmdataexports-export-dataquery-tableconfigurations)
     */
    public fun tableConfigurations(): Any? = unwrap(this).getTableConfigurations()

    /**
     * A builder for [DataQueryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param queryStatement The query statement. 
       */
      public fun queryStatement(queryStatement: String)

      /**
       * @param tableConfigurations The table configuration.
       */
      public fun tableConfigurations(tableConfigurations: IResolvable)

      /**
       * @param tableConfigurations The table configuration.
       */
      public fun tableConfigurations(tableConfigurations: Map<String, Any>)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DataQueryProperty.Builder =
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DataQueryProperty.builder()

      /**
       * @param queryStatement The query statement. 
       */
      override fun queryStatement(queryStatement: String) {
        cdkBuilder.queryStatement(queryStatement)
      }

      /**
       * @param tableConfigurations The table configuration.
       */
      override fun tableConfigurations(tableConfigurations: IResolvable) {
        cdkBuilder.tableConfigurations(tableConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param tableConfigurations The table configuration.
       */
      override fun tableConfigurations(tableConfigurations: Map<String, Any>) {
        cdkBuilder.tableConfigurations(tableConfigurations.mapValues{CdkObjectWrappers.unwrap(it.value)})
      }

      public fun build(): software.amazon.awscdk.services.bcmdataexports.CfnExport.DataQueryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.DataQueryProperty,
    ) : CdkObject(cdkObject), DataQueryProperty {
      /**
       * The query statement.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-dataquery.html#cfn-bcmdataexports-export-dataquery-querystatement)
       */
      override fun queryStatement(): String = unwrap(this).getQueryStatement()

      /**
       * The table configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-dataquery.html#cfn-bcmdataexports-export-dataquery-tableconfigurations)
       */
      override fun tableConfigurations(): Any? = unwrap(this).getTableConfigurations()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataQueryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.DataQueryProperty):
          DataQueryProperty = CdkObjectWrappers.wrap(cdkObject) as? DataQueryProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataQueryProperty):
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DataQueryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DataQueryProperty
    }
  }

  /**
   * The destinations used for data exports.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
   * DestinationConfigurationsProperty destinationConfigurationsProperty =
   * DestinationConfigurationsProperty.builder()
   * .s3Destination(S3DestinationProperty.builder()
   * .s3Bucket("s3Bucket")
   * .s3OutputConfigurations(S3OutputConfigurationsProperty.builder()
   * .compression("compression")
   * .format("format")
   * .outputType("outputType")
   * .overwrite("overwrite")
   * .build())
   * .s3Prefix("s3Prefix")
   * .s3Region("s3Region")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-destinationconfigurations.html)
   */
  public interface DestinationConfigurationsProperty {
    /**
     * An object that describes the destination of the data exports file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-destinationconfigurations.html#cfn-bcmdataexports-export-destinationconfigurations-s3destination)
     */
    public fun s3Destination(): Any

    /**
     * A builder for [DestinationConfigurationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Destination An object that describes the destination of the data exports file. 
       */
      public fun s3Destination(s3Destination: IResolvable)

      /**
       * @param s3Destination An object that describes the destination of the data exports file. 
       */
      public fun s3Destination(s3Destination: S3DestinationProperty)

      /**
       * @param s3Destination An object that describes the destination of the data exports file. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58aa8b5f0f947f867f11ebbeb89af9b81881d86f40357871a4c9bac631c5aeb5")
      public fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DestinationConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DestinationConfigurationsProperty.builder()

      /**
       * @param s3Destination An object that describes the destination of the data exports file. 
       */
      override fun s3Destination(s3Destination: IResolvable) {
        cdkBuilder.s3Destination(s3Destination.let(IResolvable::unwrap))
      }

      /**
       * @param s3Destination An object that describes the destination of the data exports file. 
       */
      override fun s3Destination(s3Destination: S3DestinationProperty) {
        cdkBuilder.s3Destination(s3Destination.let(S3DestinationProperty::unwrap))
      }

      /**
       * @param s3Destination An object that describes the destination of the data exports file. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("58aa8b5f0f947f867f11ebbeb89af9b81881d86f40357871a4c9bac631c5aeb5")
      override fun s3Destination(s3Destination: S3DestinationProperty.Builder.() -> Unit): Unit =
          s3Destination(S3DestinationProperty(s3Destination))

      public fun build():
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DestinationConfigurationsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.DestinationConfigurationsProperty,
    ) : CdkObject(cdkObject), DestinationConfigurationsProperty {
      /**
       * An object that describes the destination of the data exports file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-destinationconfigurations.html#cfn-bcmdataexports-export-destinationconfigurations-s3destination)
       */
      override fun s3Destination(): Any = unwrap(this).getS3Destination()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DestinationConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.DestinationConfigurationsProperty):
          DestinationConfigurationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DestinationConfigurationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DestinationConfigurationsProperty):
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DestinationConfigurationsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bcmdataexports.CfnExport.DestinationConfigurationsProperty
    }
  }

  /**
   * The details that are available for an export.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
   * ExportProperty exportProperty = ExportProperty.builder()
   * .dataQuery(DataQueryProperty.builder()
   * .queryStatement("queryStatement")
   * // the properties below are optional
   * .tableConfigurations(Map.of(
   * "tableConfigurationsKey", Map.of(
   * "tableConfigurationsKey", "tableConfigurations")))
   * .build())
   * .destinationConfigurations(DestinationConfigurationsProperty.builder()
   * .s3Destination(S3DestinationProperty.builder()
   * .s3Bucket("s3Bucket")
   * .s3OutputConfigurations(S3OutputConfigurationsProperty.builder()
   * .compression("compression")
   * .format("format")
   * .outputType("outputType")
   * .overwrite("overwrite")
   * .build())
   * .s3Prefix("s3Prefix")
   * .s3Region("s3Region")
   * .build())
   * .build())
   * .name("name")
   * .refreshCadence(RefreshCadenceProperty.builder()
   * .frequency("frequency")
   * .build())
   * // the properties below are optional
   * .description("description")
   * .exportArn("exportArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html)
   */
  public interface ExportProperty {
    /**
     * The data query for this specific data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-dataquery)
     */
    public fun dataQuery(): Any

    /**
     * The description for this specific data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The destination configuration for this specific data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-destinationconfigurations)
     */
    public fun destinationConfigurations(): Any

    /**
     * The Amazon Resource Name (ARN) for this export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-exportarn)
     */
    public fun exportArn(): String? = unwrap(this).getExportArn()

    /**
     * The name of this specific data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-name)
     */
    public fun name(): String

    /**
     * The cadence for AWS to update the export in your S3 bucket.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-refreshcadence)
     */
    public fun refreshCadence(): Any

    /**
     * A builder for [ExportProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataQuery The data query for this specific data export. 
       */
      public fun dataQuery(dataQuery: IResolvable)

      /**
       * @param dataQuery The data query for this specific data export. 
       */
      public fun dataQuery(dataQuery: DataQueryProperty)

      /**
       * @param dataQuery The data query for this specific data export. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37fd819f4775aea98062114c02ffc38dcc387847496df5b5bdee6087932125c1")
      public fun dataQuery(dataQuery: DataQueryProperty.Builder.() -> Unit)

      /**
       * @param description The description for this specific data export.
       */
      public fun description(description: String)

      /**
       * @param destinationConfigurations The destination configuration for this specific data
       * export. 
       */
      public fun destinationConfigurations(destinationConfigurations: IResolvable)

      /**
       * @param destinationConfigurations The destination configuration for this specific data
       * export. 
       */
      public
          fun destinationConfigurations(destinationConfigurations: DestinationConfigurationsProperty)

      /**
       * @param destinationConfigurations The destination configuration for this specific data
       * export. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43909252005d375776f6cdad98b9c792b723c428e584fd7cbafc68332aff4459")
      public
          fun destinationConfigurations(destinationConfigurations: DestinationConfigurationsProperty.Builder.() -> Unit)

      /**
       * @param exportArn The Amazon Resource Name (ARN) for this export.
       */
      public fun exportArn(exportArn: String)

      /**
       * @param name The name of this specific data export. 
       */
      public fun name(name: String)

      /**
       * @param refreshCadence The cadence for AWS to update the export in your S3 bucket. 
       */
      public fun refreshCadence(refreshCadence: IResolvable)

      /**
       * @param refreshCadence The cadence for AWS to update the export in your S3 bucket. 
       */
      public fun refreshCadence(refreshCadence: RefreshCadenceProperty)

      /**
       * @param refreshCadence The cadence for AWS to update the export in your S3 bucket. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2c8f10bdfc68bae47889a6cffbd12d62d0da314e0cb2d434eb4bc2cfda11486")
      public fun refreshCadence(refreshCadence: RefreshCadenceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ExportProperty.Builder =
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ExportProperty.builder()

      /**
       * @param dataQuery The data query for this specific data export. 
       */
      override fun dataQuery(dataQuery: IResolvable) {
        cdkBuilder.dataQuery(dataQuery.let(IResolvable::unwrap))
      }

      /**
       * @param dataQuery The data query for this specific data export. 
       */
      override fun dataQuery(dataQuery: DataQueryProperty) {
        cdkBuilder.dataQuery(dataQuery.let(DataQueryProperty::unwrap))
      }

      /**
       * @param dataQuery The data query for this specific data export. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("37fd819f4775aea98062114c02ffc38dcc387847496df5b5bdee6087932125c1")
      override fun dataQuery(dataQuery: DataQueryProperty.Builder.() -> Unit): Unit =
          dataQuery(DataQueryProperty(dataQuery))

      /**
       * @param description The description for this specific data export.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param destinationConfigurations The destination configuration for this specific data
       * export. 
       */
      override fun destinationConfigurations(destinationConfigurations: IResolvable) {
        cdkBuilder.destinationConfigurations(destinationConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param destinationConfigurations The destination configuration for this specific data
       * export. 
       */
      override
          fun destinationConfigurations(destinationConfigurations: DestinationConfigurationsProperty) {
        cdkBuilder.destinationConfigurations(destinationConfigurations.let(DestinationConfigurationsProperty::unwrap))
      }

      /**
       * @param destinationConfigurations The destination configuration for this specific data
       * export. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("43909252005d375776f6cdad98b9c792b723c428e584fd7cbafc68332aff4459")
      override
          fun destinationConfigurations(destinationConfigurations: DestinationConfigurationsProperty.Builder.() -> Unit):
          Unit =
          destinationConfigurations(DestinationConfigurationsProperty(destinationConfigurations))

      /**
       * @param exportArn The Amazon Resource Name (ARN) for this export.
       */
      override fun exportArn(exportArn: String) {
        cdkBuilder.exportArn(exportArn)
      }

      /**
       * @param name The name of this specific data export. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param refreshCadence The cadence for AWS to update the export in your S3 bucket. 
       */
      override fun refreshCadence(refreshCadence: IResolvable) {
        cdkBuilder.refreshCadence(refreshCadence.let(IResolvable::unwrap))
      }

      /**
       * @param refreshCadence The cadence for AWS to update the export in your S3 bucket. 
       */
      override fun refreshCadence(refreshCadence: RefreshCadenceProperty) {
        cdkBuilder.refreshCadence(refreshCadence.let(RefreshCadenceProperty::unwrap))
      }

      /**
       * @param refreshCadence The cadence for AWS to update the export in your S3 bucket. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b2c8f10bdfc68bae47889a6cffbd12d62d0da314e0cb2d434eb4bc2cfda11486")
      override fun refreshCadence(refreshCadence: RefreshCadenceProperty.Builder.() -> Unit): Unit =
          refreshCadence(RefreshCadenceProperty(refreshCadence))

      public fun build(): software.amazon.awscdk.services.bcmdataexports.CfnExport.ExportProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.ExportProperty,
    ) : CdkObject(cdkObject), ExportProperty {
      /**
       * The data query for this specific data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-dataquery)
       */
      override fun dataQuery(): Any = unwrap(this).getDataQuery()

      /**
       * The description for this specific data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The destination configuration for this specific data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-destinationconfigurations)
       */
      override fun destinationConfigurations(): Any = unwrap(this).getDestinationConfigurations()

      /**
       * The Amazon Resource Name (ARN) for this export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-exportarn)
       */
      override fun exportArn(): String? = unwrap(this).getExportArn()

      /**
       * The name of this specific data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The cadence for AWS to update the export in your S3 bucket.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-export.html#cfn-bcmdataexports-export-export-refreshcadence)
       */
      override fun refreshCadence(): Any = unwrap(this).getRefreshCadence()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ExportProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.ExportProperty):
          ExportProperty = CdkObjectWrappers.wrap(cdkObject) as? ExportProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ExportProperty):
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ExportProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ExportProperty
    }
  }

  /**
   * The cadence for AWS to update the data export in your S3 bucket.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
   * RefreshCadenceProperty refreshCadenceProperty = RefreshCadenceProperty.builder()
   * .frequency("frequency")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-refreshcadence.html)
   */
  public interface RefreshCadenceProperty {
    /**
     * The frequency that data exports are updated.
     *
     * The export refreshes each time the source data updates, up to three times daily.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-refreshcadence.html#cfn-bcmdataexports-export-refreshcadence-frequency)
     */
    public fun frequency(): String

    /**
     * A builder for [RefreshCadenceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param frequency The frequency that data exports are updated. 
       * The export refreshes each time the source data updates, up to three times daily.
       */
      public fun frequency(frequency: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bcmdataexports.CfnExport.RefreshCadenceProperty.Builder =
          software.amazon.awscdk.services.bcmdataexports.CfnExport.RefreshCadenceProperty.builder()

      /**
       * @param frequency The frequency that data exports are updated. 
       * The export refreshes each time the source data updates, up to three times daily.
       */
      override fun frequency(frequency: String) {
        cdkBuilder.frequency(frequency)
      }

      public fun build():
          software.amazon.awscdk.services.bcmdataexports.CfnExport.RefreshCadenceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.RefreshCadenceProperty,
    ) : CdkObject(cdkObject), RefreshCadenceProperty {
      /**
       * The frequency that data exports are updated.
       *
       * The export refreshes each time the source data updates, up to three times daily.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-refreshcadence.html#cfn-bcmdataexports-export-refreshcadence-frequency)
       */
      override fun frequency(): String = unwrap(this).getFrequency()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): RefreshCadenceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.RefreshCadenceProperty):
          RefreshCadenceProperty = CdkObjectWrappers.wrap(cdkObject) as? RefreshCadenceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: RefreshCadenceProperty):
          software.amazon.awscdk.services.bcmdataexports.CfnExport.RefreshCadenceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bcmdataexports.CfnExport.RefreshCadenceProperty
    }
  }

  /**
   * The tag structure that contains a tag key and value.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
   * ResourceTagProperty resourceTagProperty = ResourceTagProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-resourcetag.html)
   */
  public interface ResourceTagProperty {
    /**
     * The key that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-resourcetag.html#cfn-bcmdataexports-export-resourcetag-key)
     */
    public fun key(): String

    /**
     * The value that's associated with the tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-resourcetag.html#cfn-bcmdataexports-export-resourcetag-value)
     */
    public fun `value`(): String

    /**
     * A builder for [ResourceTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key that's associated with the tag. 
       */
      public fun key(key: String)

      /**
       * @param value The value that's associated with the tag. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ResourceTagProperty.Builder =
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ResourceTagProperty.builder()

      /**
       * @param key The key that's associated with the tag. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value that's associated with the tag. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ResourceTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.ResourceTagProperty,
    ) : CdkObject(cdkObject), ResourceTagProperty {
      /**
       * The key that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-resourcetag.html#cfn-bcmdataexports-export-resourcetag-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value that's associated with the tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-resourcetag.html#cfn-bcmdataexports-export-resourcetag-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.ResourceTagProperty):
          ResourceTagProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceTagProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceTagProperty):
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ResourceTagProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.bcmdataexports.CfnExport.ResourceTagProperty
    }
  }

  /**
   * Describes the destination Amazon Simple Storage Service (Amazon S3) bucket name and object keys
   * of a data exports file.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
   * S3DestinationProperty s3DestinationProperty = S3DestinationProperty.builder()
   * .s3Bucket("s3Bucket")
   * .s3OutputConfigurations(S3OutputConfigurationsProperty.builder()
   * .compression("compression")
   * .format("format")
   * .outputType("outputType")
   * .overwrite("overwrite")
   * .build())
   * .s3Prefix("s3Prefix")
   * .s3Region("s3Region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html)
   */
  public interface S3DestinationProperty {
    /**
     * The name of the Amazon S3 bucket used as the destination of a data export file.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3bucket)
     */
    public fun s3Bucket(): String

    /**
     * The output configuration for the data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3outputconfigurations)
     */
    public fun s3OutputConfigurations(): Any

    /**
     * The S3 path prefix you want prepended to the name of your data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3prefix)
     */
    public fun s3Prefix(): String

    /**
     * The S3 bucket Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3region)
     */
    public fun s3Region(): String

    /**
     * A builder for [S3DestinationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Bucket The name of the Amazon S3 bucket used as the destination of a data export
       * file. 
       */
      public fun s3Bucket(s3Bucket: String)

      /**
       * @param s3OutputConfigurations The output configuration for the data export. 
       */
      public fun s3OutputConfigurations(s3OutputConfigurations: IResolvable)

      /**
       * @param s3OutputConfigurations The output configuration for the data export. 
       */
      public fun s3OutputConfigurations(s3OutputConfigurations: S3OutputConfigurationsProperty)

      /**
       * @param s3OutputConfigurations The output configuration for the data export. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c38eeafbf61853827b2be8535fb69bd2ecbe5e2343d1bd03c39248969c22540d")
      public
          fun s3OutputConfigurations(s3OutputConfigurations: S3OutputConfigurationsProperty.Builder.() -> Unit)

      /**
       * @param s3Prefix The S3 path prefix you want prepended to the name of your data export. 
       */
      public fun s3Prefix(s3Prefix: String)

      /**
       * @param s3Region The S3 bucket Region. 
       */
      public fun s3Region(s3Region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3DestinationProperty.Builder =
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3DestinationProperty.builder()

      /**
       * @param s3Bucket The name of the Amazon S3 bucket used as the destination of a data export
       * file. 
       */
      override fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
      }

      /**
       * @param s3OutputConfigurations The output configuration for the data export. 
       */
      override fun s3OutputConfigurations(s3OutputConfigurations: IResolvable) {
        cdkBuilder.s3OutputConfigurations(s3OutputConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param s3OutputConfigurations The output configuration for the data export. 
       */
      override fun s3OutputConfigurations(s3OutputConfigurations: S3OutputConfigurationsProperty) {
        cdkBuilder.s3OutputConfigurations(s3OutputConfigurations.let(S3OutputConfigurationsProperty::unwrap))
      }

      /**
       * @param s3OutputConfigurations The output configuration for the data export. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c38eeafbf61853827b2be8535fb69bd2ecbe5e2343d1bd03c39248969c22540d")
      override
          fun s3OutputConfigurations(s3OutputConfigurations: S3OutputConfigurationsProperty.Builder.() -> Unit):
          Unit = s3OutputConfigurations(S3OutputConfigurationsProperty(s3OutputConfigurations))

      /**
       * @param s3Prefix The S3 path prefix you want prepended to the name of your data export. 
       */
      override fun s3Prefix(s3Prefix: String) {
        cdkBuilder.s3Prefix(s3Prefix)
      }

      /**
       * @param s3Region The S3 bucket Region. 
       */
      override fun s3Region(s3Region: String) {
        cdkBuilder.s3Region(s3Region)
      }

      public fun build():
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3DestinationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.S3DestinationProperty,
    ) : CdkObject(cdkObject), S3DestinationProperty {
      /**
       * The name of the Amazon S3 bucket used as the destination of a data export file.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3bucket)
       */
      override fun s3Bucket(): String = unwrap(this).getS3Bucket()

      /**
       * The output configuration for the data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3outputconfigurations)
       */
      override fun s3OutputConfigurations(): Any = unwrap(this).getS3OutputConfigurations()

      /**
       * The S3 path prefix you want prepended to the name of your data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3prefix)
       */
      override fun s3Prefix(): String = unwrap(this).getS3Prefix()

      /**
       * The S3 bucket Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3destination.html#cfn-bcmdataexports-export-s3destination-s3region)
       */
      override fun s3Region(): String = unwrap(this).getS3Region()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3DestinationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.S3DestinationProperty):
          S3DestinationProperty = CdkObjectWrappers.wrap(cdkObject) as? S3DestinationProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3DestinationProperty):
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3DestinationProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3DestinationProperty
    }
  }

  /**
   * The compression type, file format, and overwrite preference for the data export.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.bcmdataexports.*;
   * S3OutputConfigurationsProperty s3OutputConfigurationsProperty =
   * S3OutputConfigurationsProperty.builder()
   * .compression("compression")
   * .format("format")
   * .outputType("outputType")
   * .overwrite("overwrite")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html)
   */
  public interface S3OutputConfigurationsProperty {
    /**
     * The compression type for the data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-compression)
     */
    public fun compression(): String

    /**
     * The file format for the data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-format)
     */
    public fun format(): String

    /**
     * The output type for the data export.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-outputtype)
     */
    public fun outputType(): String

    /**
     * The rule to follow when generating a version of the data export file.
     *
     * You have the choice to overwrite the previous version or to be delivered in addition to the
     * previous versions. Overwriting exports can save on Amazon S3 storage costs. Creating new export
     * versions allows you to track the changes in cost and usage data over time.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-overwrite)
     */
    public fun overwrite(): String

    /**
     * A builder for [S3OutputConfigurationsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param compression The compression type for the data export. 
       */
      public fun compression(compression: String)

      /**
       * @param format The file format for the data export. 
       */
      public fun format(format: String)

      /**
       * @param outputType The output type for the data export. 
       */
      public fun outputType(outputType: String)

      /**
       * @param overwrite The rule to follow when generating a version of the data export file. 
       * You have the choice to overwrite the previous version or to be delivered in addition to the
       * previous versions. Overwriting exports can save on Amazon S3 storage costs. Creating new
       * export versions allows you to track the changes in cost and usage data over time.
       */
      public fun overwrite(overwrite: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3OutputConfigurationsProperty.Builder
          =
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3OutputConfigurationsProperty.builder()

      /**
       * @param compression The compression type for the data export. 
       */
      override fun compression(compression: String) {
        cdkBuilder.compression(compression)
      }

      /**
       * @param format The file format for the data export. 
       */
      override fun format(format: String) {
        cdkBuilder.format(format)
      }

      /**
       * @param outputType The output type for the data export. 
       */
      override fun outputType(outputType: String) {
        cdkBuilder.outputType(outputType)
      }

      /**
       * @param overwrite The rule to follow when generating a version of the data export file. 
       * You have the choice to overwrite the previous version or to be delivered in addition to the
       * previous versions. Overwriting exports can save on Amazon S3 storage costs. Creating new
       * export versions allows you to track the changes in cost and usage data over time.
       */
      override fun overwrite(overwrite: String) {
        cdkBuilder.overwrite(overwrite)
      }

      public fun build():
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3OutputConfigurationsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.S3OutputConfigurationsProperty,
    ) : CdkObject(cdkObject), S3OutputConfigurationsProperty {
      /**
       * The compression type for the data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-compression)
       */
      override fun compression(): String = unwrap(this).getCompression()

      /**
       * The file format for the data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-format)
       */
      override fun format(): String = unwrap(this).getFormat()

      /**
       * The output type for the data export.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-outputtype)
       */
      override fun outputType(): String = unwrap(this).getOutputType()

      /**
       * The rule to follow when generating a version of the data export file.
       *
       * You have the choice to overwrite the previous version or to be delivered in addition to the
       * previous versions. Overwriting exports can save on Amazon S3 storage costs. Creating new
       * export versions allows you to track the changes in cost and usage data over time.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-bcmdataexports-export-s3outputconfigurations.html#cfn-bcmdataexports-export-s3outputconfigurations-overwrite)
       */
      override fun overwrite(): String = unwrap(this).getOverwrite()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3OutputConfigurationsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.bcmdataexports.CfnExport.S3OutputConfigurationsProperty):
          S3OutputConfigurationsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3OutputConfigurationsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3OutputConfigurationsProperty):
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3OutputConfigurationsProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.bcmdataexports.CfnExport.S3OutputConfigurationsProperty
    }
  }
}
