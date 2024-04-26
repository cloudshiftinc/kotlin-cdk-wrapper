@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cleanroomsml

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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Defines the information necessary to create a training dataset.
 *
 * In Clean Rooms ML, the `TrainingDataset` is metadata that points to a Glue table, which is read
 * only during `AudienceModel` creation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.cleanroomsml.*;
 * CfnTrainingDataset cfnTrainingDataset = CfnTrainingDataset.Builder.create(this,
 * "MyCfnTrainingDataset")
 * .name("name")
 * .roleArn("roleArn")
 * .trainingData(List.of(DatasetProperty.builder()
 * .inputConfig(DatasetInputConfigProperty.builder()
 * .dataSource(DataSourceProperty.builder()
 * .glueDataSource(GlueDataSourceProperty.builder()
 * .databaseName("databaseName")
 * .tableName("tableName")
 * // the properties below are optional
 * .catalogId("catalogId")
 * .build())
 * .build())
 * .schema(List.of(ColumnSchemaProperty.builder()
 * .columnName("columnName")
 * .columnTypes(List.of("columnTypes"))
 * .build()))
 * .build())
 * .type("type")
 * .build()))
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html)
 */
public open class CfnTrainingDataset(
  cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset,
) : CfnResource(cdkObject), IInspectable, ITaggableV2 {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrainingDatasetProps,
  ) :
      this(software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnTrainingDatasetProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTrainingDatasetProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTrainingDatasetProps(props)
  )

  /**
   * The status of the training dataset.
   */
  public open fun attrStatus(): String = unwrap(this).getAttrStatus()

  /**
   * The Amazon Resource Name (ARN) of the training dataset.
   */
  public open fun attrTrainingDatasetArn(): String = unwrap(this).getAttrTrainingDatasetArn()

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun cdkTagManager(): TagManager =
      unwrap(this).getCdkTagManager().let(TagManager::wrap)

  /**
   * The description of the training dataset.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the training dataset.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The name of the training dataset.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the training dataset.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
   * `dataSource` field of each dataset.
   */
  public open fun roleArn(): String = unwrap(this).getRoleArn()

  /**
   * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
   * `dataSource` field of each dataset.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   * The optional metadata that you apply to the resource to help you categorize and organize them.
   */
  public open fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The optional metadata that you apply to the resource to help you categorize and organize them.
   */
  public open fun tags(`value`: List<CfnTag>) {
    unwrap(this).setTags(`value`.map(CfnTag::unwrap))
  }

  /**
   * The optional metadata that you apply to the resource to help you categorize and organize them.
   */
  public open fun tags(vararg `value`: CfnTag): Unit = tags(`value`.toList())

  /**
   * An array of information that lists the Dataset objects, which specifies the dataset type and
   * details on its location and schema.
   */
  public open fun trainingData(): Any = unwrap(this).getTrainingData()

  /**
   * An array of information that lists the Dataset objects, which specifies the dataset type and
   * details on its location and schema.
   */
  public open fun trainingData(`value`: IResolvable) {
    unwrap(this).setTrainingData(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of information that lists the Dataset objects, which specifies the dataset type and
   * details on its location and schema.
   */
  public open fun trainingData(`value`: List<Any>) {
    unwrap(this).setTrainingData(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * An array of information that lists the Dataset objects, which specifies the dataset type and
   * details on its location and schema.
   */
  public open fun trainingData(vararg `value`: Any): Unit = trainingData(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.cleanroomsml.CfnTrainingDataset].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the training dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-description)
     * @param description The description of the training dataset. 
     */
    public fun description(description: String)

    /**
     * The name of the training dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-name)
     * @param name The name of the training dataset. 
     */
    public fun name(name: String)

    /**
     * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     * `dataSource` field of each dataset.
     *
     * Passing a role across accounts is not allowed. If you pass a role that isn't in your account,
     * you get an `AccessDeniedException` error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-rolearn)
     * @param roleArn The ARN of the IAM role that Clean Rooms ML can assume to read the data
     * referred to in the `dataSource` field of each dataset. 
     */
    public fun roleArn(roleArn: String)

    /**
     * The optional metadata that you apply to the resource to help you categorize and organize
     * them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-tags)
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The optional metadata that you apply to the resource to help you categorize and organize
     * them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-tags)
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * An array of information that lists the Dataset objects, which specifies the dataset type and
     * details on its location and schema.
     *
     * You must provide a role that has read access to these tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     */
    public fun trainingData(trainingData: IResolvable)

    /**
     * An array of information that lists the Dataset objects, which specifies the dataset type and
     * details on its location and schema.
     *
     * You must provide a role that has read access to these tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     */
    public fun trainingData(trainingData: List<Any>)

    /**
     * An array of information that lists the Dataset objects, which specifies the dataset type and
     * details on its location and schema.
     *
     * You must provide a role that has read access to these tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     */
    public fun trainingData(vararg trainingData: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.Builder
        = software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.Builder.create(scope, id)

    /**
     * The description of the training dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-description)
     * @param description The description of the training dataset. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The name of the training dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-name)
     * @param name The name of the training dataset. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The ARN of the IAM role that Clean Rooms ML can assume to read the data referred to in the
     * `dataSource` field of each dataset.
     *
     * Passing a role across accounts is not allowed. If you pass a role that isn't in your account,
     * you get an `AccessDeniedException` error.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-rolearn)
     * @param roleArn The ARN of the IAM role that Clean Rooms ML can assume to read the data
     * referred to in the `dataSource` field of each dataset. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * The optional metadata that you apply to the resource to help you categorize and organize
     * them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-tags)
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * The optional metadata that you apply to the resource to help you categorize and organize
     * them.
     *
     * Each tag consists of a key and an optional value, both of which you define.
     *
     * The following basic restrictions apply to tags:
     *
     * * Maximum number of tags per resource - 50.
     * * For each resource, each tag key must be unique, and each tag key can have only one value.
     * * Maximum key length - 128 Unicode characters in UTF-8.
     * * Maximum value length - 256 Unicode characters in UTF-8.
     * * If your tagging schema is used across multiple services and resources, remember that other
     * services may have restrictions on allowed characters. Generally allowed characters are: letters,
     * numbers, and spaces representable in UTF-8, and the following characters: + - = . _ : /
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-tags)
     * @param tags The optional metadata that you apply to the resource to help you categorize and
     * organize them. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * An array of information that lists the Dataset objects, which specifies the dataset type and
     * details on its location and schema.
     *
     * You must provide a role that has read access to these tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     */
    override fun trainingData(trainingData: IResolvable) {
      cdkBuilder.trainingData(trainingData.let(IResolvable::unwrap))
    }

    /**
     * An array of information that lists the Dataset objects, which specifies the dataset type and
     * details on its location and schema.
     *
     * You must provide a role that has read access to these tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     */
    override fun trainingData(trainingData: List<Any>) {
      cdkBuilder.trainingData(trainingData.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * An array of information that lists the Dataset objects, which specifies the dataset type and
     * details on its location and schema.
     *
     * You must provide a role that has read access to these tables.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cleanroomsml-trainingdataset.html#cfn-cleanroomsml-trainingdataset-trainingdata)
     * @param trainingData An array of information that lists the Dataset objects, which specifies
     * the dataset type and details on its location and schema. 
     */
    override fun trainingData(vararg trainingData: Any): Unit = trainingData(trainingData.toList())

    public fun build(): software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTrainingDataset {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTrainingDataset(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset):
        CfnTrainingDataset = CfnTrainingDataset(cdkObject)

    internal fun unwrap(wrapped: CfnTrainingDataset):
        software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset = wrapped.cdkObject as
        software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset
  }

  /**
   * Metadata for a column.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanroomsml.*;
   * ColumnSchemaProperty columnSchemaProperty = ColumnSchemaProperty.builder()
   * .columnName("columnName")
   * .columnTypes(List.of("columnTypes"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-columnschema.html)
   */
  public interface ColumnSchemaProperty {
    /**
     * The name of a column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-columnschema.html#cfn-cleanroomsml-trainingdataset-columnschema-columnname)
     */
    public fun columnName(): String

    /**
     * The data type of column.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-columnschema.html#cfn-cleanroomsml-trainingdataset-columnschema-columntypes)
     */
    public fun columnTypes(): List<String>

    /**
     * A builder for [ColumnSchemaProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param columnName The name of a column. 
       */
      public fun columnName(columnName: String)

      /**
       * @param columnTypes The data type of column. 
       */
      public fun columnTypes(columnTypes: List<String>)

      /**
       * @param columnTypes The data type of column. 
       */
      public fun columnTypes(vararg columnTypes: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.ColumnSchemaProperty.Builder
          =
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.ColumnSchemaProperty.builder()

      /**
       * @param columnName The name of a column. 
       */
      override fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
      }

      /**
       * @param columnTypes The data type of column. 
       */
      override fun columnTypes(columnTypes: List<String>) {
        cdkBuilder.columnTypes(columnTypes)
      }

      /**
       * @param columnTypes The data type of column. 
       */
      override fun columnTypes(vararg columnTypes: String): Unit = columnTypes(columnTypes.toList())

      public fun build():
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.ColumnSchemaProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.ColumnSchemaProperty,
    ) : CdkObject(cdkObject), ColumnSchemaProperty {
      /**
       * The name of a column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-columnschema.html#cfn-cleanroomsml-trainingdataset-columnschema-columnname)
       */
      override fun columnName(): String = unwrap(this).getColumnName()

      /**
       * The data type of column.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-columnschema.html#cfn-cleanroomsml-trainingdataset-columnschema-columntypes)
       */
      override fun columnTypes(): List<String> = unwrap(this).getColumnTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnSchemaProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.ColumnSchemaProperty):
          ColumnSchemaProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnSchemaProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnSchemaProperty):
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.ColumnSchemaProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.ColumnSchemaProperty
    }
  }

  /**
   * Defines information about the Glue data source that contains the training data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanroomsml.*;
   * DataSourceProperty dataSourceProperty = DataSourceProperty.builder()
   * .glueDataSource(GlueDataSourceProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * // the properties below are optional
   * .catalogId("catalogId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasource.html)
   */
  public interface DataSourceProperty {
    /**
     * A GlueDataSource object that defines the catalog ID, database name, and table name for the
     * training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasource.html#cfn-cleanroomsml-trainingdataset-datasource-gluedatasource)
     */
    public fun glueDataSource(): Any

    /**
     * A builder for [DataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param glueDataSource A GlueDataSource object that defines the catalog ID, database name,
       * and table name for the training data. 
       */
      public fun glueDataSource(glueDataSource: IResolvable)

      /**
       * @param glueDataSource A GlueDataSource object that defines the catalog ID, database name,
       * and table name for the training data. 
       */
      public fun glueDataSource(glueDataSource: GlueDataSourceProperty)

      /**
       * @param glueDataSource A GlueDataSource object that defines the catalog ID, database name,
       * and table name for the training data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb2be06c262f0b4baa0748ea9a651d39ef4b204794901ed301ad0830cc44542")
      public fun glueDataSource(glueDataSource: GlueDataSourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DataSourceProperty.Builder
          =
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DataSourceProperty.builder()

      /**
       * @param glueDataSource A GlueDataSource object that defines the catalog ID, database name,
       * and table name for the training data. 
       */
      override fun glueDataSource(glueDataSource: IResolvable) {
        cdkBuilder.glueDataSource(glueDataSource.let(IResolvable::unwrap))
      }

      /**
       * @param glueDataSource A GlueDataSource object that defines the catalog ID, database name,
       * and table name for the training data. 
       */
      override fun glueDataSource(glueDataSource: GlueDataSourceProperty) {
        cdkBuilder.glueDataSource(glueDataSource.let(GlueDataSourceProperty::unwrap))
      }

      /**
       * @param glueDataSource A GlueDataSource object that defines the catalog ID, database name,
       * and table name for the training data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ddb2be06c262f0b4baa0748ea9a651d39ef4b204794901ed301ad0830cc44542")
      override fun glueDataSource(glueDataSource: GlueDataSourceProperty.Builder.() -> Unit): Unit =
          glueDataSource(GlueDataSourceProperty(glueDataSource))

      public fun build():
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DataSourceProperty,
    ) : CdkObject(cdkObject), DataSourceProperty {
      /**
       * A GlueDataSource object that defines the catalog ID, database name, and table name for the
       * training data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasource.html#cfn-cleanroomsml-trainingdataset-datasource-gluedatasource)
       */
      override fun glueDataSource(): Any = unwrap(this).getGlueDataSource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DataSourceProperty):
          DataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DataSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSourceProperty):
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DataSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DataSourceProperty
    }
  }

  /**
   * Defines the Glue data source and schema mapping information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanroomsml.*;
   * DatasetInputConfigProperty datasetInputConfigProperty = DatasetInputConfigProperty.builder()
   * .dataSource(DataSourceProperty.builder()
   * .glueDataSource(GlueDataSourceProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * // the properties below are optional
   * .catalogId("catalogId")
   * .build())
   * .build())
   * .schema(List.of(ColumnSchemaProperty.builder()
   * .columnName("columnName")
   * .columnTypes(List.of("columnTypes"))
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasetinputconfig.html)
   */
  public interface DatasetInputConfigProperty {
    /**
     * A DataSource object that specifies the Glue data source for the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasetinputconfig.html#cfn-cleanroomsml-trainingdataset-datasetinputconfig-datasource)
     */
    public fun dataSource(): Any

    /**
     * The schema information for the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasetinputconfig.html#cfn-cleanroomsml-trainingdataset-datasetinputconfig-schema)
     */
    public fun schema(): Any

    /**
     * A builder for [DatasetInputConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataSource A DataSource object that specifies the Glue data source for the training
       * data. 
       */
      public fun dataSource(dataSource: IResolvable)

      /**
       * @param dataSource A DataSource object that specifies the Glue data source for the training
       * data. 
       */
      public fun dataSource(dataSource: DataSourceProperty)

      /**
       * @param dataSource A DataSource object that specifies the Glue data source for the training
       * data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d17fc4efee505daf86a3547b601eecc12389762a954b2d518ada94514659fce8")
      public fun dataSource(dataSource: DataSourceProperty.Builder.() -> Unit)

      /**
       * @param schema The schema information for the training data. 
       */
      public fun schema(schema: IResolvable)

      /**
       * @param schema The schema information for the training data. 
       */
      public fun schema(schema: List<Any>)

      /**
       * @param schema The schema information for the training data. 
       */
      public fun schema(vararg schema: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetInputConfigProperty.Builder
          =
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetInputConfigProperty.builder()

      /**
       * @param dataSource A DataSource object that specifies the Glue data source for the training
       * data. 
       */
      override fun dataSource(dataSource: IResolvable) {
        cdkBuilder.dataSource(dataSource.let(IResolvable::unwrap))
      }

      /**
       * @param dataSource A DataSource object that specifies the Glue data source for the training
       * data. 
       */
      override fun dataSource(dataSource: DataSourceProperty) {
        cdkBuilder.dataSource(dataSource.let(DataSourceProperty::unwrap))
      }

      /**
       * @param dataSource A DataSource object that specifies the Glue data source for the training
       * data. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d17fc4efee505daf86a3547b601eecc12389762a954b2d518ada94514659fce8")
      override fun dataSource(dataSource: DataSourceProperty.Builder.() -> Unit): Unit =
          dataSource(DataSourceProperty(dataSource))

      /**
       * @param schema The schema information for the training data. 
       */
      override fun schema(schema: IResolvable) {
        cdkBuilder.schema(schema.let(IResolvable::unwrap))
      }

      /**
       * @param schema The schema information for the training data. 
       */
      override fun schema(schema: List<Any>) {
        cdkBuilder.schema(schema.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param schema The schema information for the training data. 
       */
      override fun schema(vararg schema: Any): Unit = schema(schema.toList())

      public fun build():
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetInputConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetInputConfigProperty,
    ) : CdkObject(cdkObject), DatasetInputConfigProperty {
      /**
       * A DataSource object that specifies the Glue data source for the training data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasetinputconfig.html#cfn-cleanroomsml-trainingdataset-datasetinputconfig-datasource)
       */
      override fun dataSource(): Any = unwrap(this).getDataSource()

      /**
       * The schema information for the training data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-datasetinputconfig.html#cfn-cleanroomsml-trainingdataset-datasetinputconfig-schema)
       */
      override fun schema(): Any = unwrap(this).getSchema()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetInputConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetInputConfigProperty):
          DatasetInputConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DatasetInputConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetInputConfigProperty):
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetInputConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetInputConfigProperty
    }
  }

  /**
   * Defines where the training dataset is located, what type of data it contains, and how to access
   * the data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanroomsml.*;
   * DatasetProperty datasetProperty = DatasetProperty.builder()
   * .inputConfig(DatasetInputConfigProperty.builder()
   * .dataSource(DataSourceProperty.builder()
   * .glueDataSource(GlueDataSourceProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * // the properties below are optional
   * .catalogId("catalogId")
   * .build())
   * .build())
   * .schema(List.of(ColumnSchemaProperty.builder()
   * .columnName("columnName")
   * .columnTypes(List.of("columnTypes"))
   * .build()))
   * .build())
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-dataset.html)
   */
  public interface DatasetProperty {
    /**
     * A DatasetInputConfig object that defines the data source and schema mapping.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-dataset.html#cfn-cleanroomsml-trainingdataset-dataset-inputconfig)
     */
    public fun inputConfig(): Any

    /**
     * What type of information is found in the dataset.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-dataset.html#cfn-cleanroomsml-trainingdataset-dataset-type)
     */
    public fun type(): String

    /**
     * A builder for [DatasetProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param inputConfig A DatasetInputConfig object that defines the data source and schema
       * mapping. 
       */
      public fun inputConfig(inputConfig: IResolvable)

      /**
       * @param inputConfig A DatasetInputConfig object that defines the data source and schema
       * mapping. 
       */
      public fun inputConfig(inputConfig: DatasetInputConfigProperty)

      /**
       * @param inputConfig A DatasetInputConfig object that defines the data source and schema
       * mapping. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75dd0a95d341b66f02f97c49f5b3941e87d7f2afc1d94bb3c15d6f14e945f1fd")
      public fun inputConfig(inputConfig: DatasetInputConfigProperty.Builder.() -> Unit)

      /**
       * @param type What type of information is found in the dataset. 
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetProperty.Builder =
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetProperty.builder()

      /**
       * @param inputConfig A DatasetInputConfig object that defines the data source and schema
       * mapping. 
       */
      override fun inputConfig(inputConfig: IResolvable) {
        cdkBuilder.inputConfig(inputConfig.let(IResolvable::unwrap))
      }

      /**
       * @param inputConfig A DatasetInputConfig object that defines the data source and schema
       * mapping. 
       */
      override fun inputConfig(inputConfig: DatasetInputConfigProperty) {
        cdkBuilder.inputConfig(inputConfig.let(DatasetInputConfigProperty::unwrap))
      }

      /**
       * @param inputConfig A DatasetInputConfig object that defines the data source and schema
       * mapping. 
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("75dd0a95d341b66f02f97c49f5b3941e87d7f2afc1d94bb3c15d6f14e945f1fd")
      override fun inputConfig(inputConfig: DatasetInputConfigProperty.Builder.() -> Unit): Unit =
          inputConfig(DatasetInputConfigProperty(inputConfig))

      /**
       * @param type What type of information is found in the dataset. 
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetProperty,
    ) : CdkObject(cdkObject), DatasetProperty {
      /**
       * A DatasetInputConfig object that defines the data source and schema mapping.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-dataset.html#cfn-cleanroomsml-trainingdataset-dataset-inputconfig)
       */
      override fun inputConfig(): Any = unwrap(this).getInputConfig()

      /**
       * What type of information is found in the dataset.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-dataset.html#cfn-cleanroomsml-trainingdataset-dataset-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatasetProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetProperty):
          DatasetProperty = CdkObjectWrappers.wrap(cdkObject) as? DatasetProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatasetProperty):
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.DatasetProperty
    }
  }

  /**
   * Defines the Glue data source that contains the training data.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.cleanroomsml.*;
   * GlueDataSourceProperty glueDataSourceProperty = GlueDataSourceProperty.builder()
   * .databaseName("databaseName")
   * .tableName("tableName")
   * // the properties below are optional
   * .catalogId("catalogId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-gluedatasource.html)
   */
  public interface GlueDataSourceProperty {
    /**
     * The Glue catalog that contains the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-gluedatasource.html#cfn-cleanroomsml-trainingdataset-gluedatasource-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The Glue database that contains the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-gluedatasource.html#cfn-cleanroomsml-trainingdataset-gluedatasource-databasename)
     */
    public fun databaseName(): String

    /**
     * The Glue table that contains the training data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-gluedatasource.html#cfn-cleanroomsml-trainingdataset-gluedatasource-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [GlueDataSourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The Glue catalog that contains the training data.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName The Glue database that contains the training data. 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param tableName The Glue table that contains the training data. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.GlueDataSourceProperty.Builder
          =
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.GlueDataSourceProperty.builder()

      /**
       * @param catalogId The Glue catalog that contains the training data.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName The Glue database that contains the training data. 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param tableName The Glue table that contains the training data. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.GlueDataSourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.GlueDataSourceProperty,
    ) : CdkObject(cdkObject), GlueDataSourceProperty {
      /**
       * The Glue catalog that contains the training data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-gluedatasource.html#cfn-cleanroomsml-trainingdataset-gluedatasource-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The Glue database that contains the training data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-gluedatasource.html#cfn-cleanroomsml-trainingdataset-gluedatasource-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The Glue table that contains the training data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cleanroomsml-trainingdataset-gluedatasource.html#cfn-cleanroomsml-trainingdataset-gluedatasource-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GlueDataSourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.GlueDataSourceProperty):
          GlueDataSourceProperty = CdkObjectWrappers.wrap(cdkObject) as? GlueDataSourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: GlueDataSourceProperty):
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.GlueDataSourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.cleanroomsml.CfnTrainingDataset.GlueDataSourceProperty
    }
  }
}
