@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

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
 * The `AWS::LakeFormation::TagAssociation` resource represents an assignment of an LF-tag to a Data
 * Catalog resource (database, table, or column).
 *
 * During a stack operation, CloudFormation calls AWS Lake Formation `AddLFTagsToResource` API to
 * create a `TagAssociation` resource and calls the `RemoveLFTagsToResource` API to delete it.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.S3Table;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Database;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.DataFormat;
 * import io.cloudshiftdev.awscdk.services.glue.alpha.Schema;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnDataLakeSettings;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTag;
 * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTagAssociation;
 * Stack stack;
 * String accountId;
 * String tagKey = "aws";
 * String[] tagValues = List.of("dev");
 * Database database = new Database(this, "Database");
 * S3Table table = S3Table.Builder.create(this, "Table")
 * .database(database)
 * .columns(List.of(Column.builder()
 * .name("col1")
 * .type(Schema.STRING)
 * .build(), Column.builder()
 * .name("col2")
 * .type(Schema.STRING)
 * .build()))
 * .dataFormat(DataFormat.CSV)
 * .build();
 * DefaultStackSynthesizer synthesizer = (DefaultStackSynthesizer)stack.getSynthesizer();
 * CfnDataLakeSettings.Builder.create(this, "DataLakeSettings")
 * .admins(List.of(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier(stack.formatArn(ArnComponents.builder()
 * .service("iam")
 * .resource("role")
 * .region("")
 * .account(accountId)
 * .resourceName("Admin")
 * .build()))
 * .build(), DataLakePrincipalProperty.builder()
 * // The CDK cloudformation execution role.
 * .dataLakePrincipalIdentifier(synthesizer.cloudFormationExecutionRoleArn.replace("${AWS::Partition}",
 * "aws"))
 * .build()))
 * .build();
 * CfnTag tag = CfnTag.Builder.create(this, "Tag")
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * LFTagPairProperty lfTagPairProperty = LFTagPairProperty.builder()
 * .catalogId(accountId)
 * .tagKey(tagKey)
 * .tagValues(tagValues)
 * .build();
 * CfnTagAssociation tagAssociation = CfnTagAssociation.Builder.create(this, "TagAssociation")
 * .lfTags(List.of(lfTagPairProperty))
 * .resource(ResourceProperty.builder()
 * .tableWithColumns(TableWithColumnsResourceProperty.builder()
 * .databaseName(database.getDatabaseName())
 * .columnNames(List.of("col1", "col2"))
 * .catalogId(accountId)
 * .name(table.getTableName())
 * .build())
 * .build())
 * .build();
 * tagAssociation.node.addDependency(tag);
 * tagAssociation.node.addDependency(table);
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html)
 */
public open class CfnTagAssociation(
  cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagAssociationProps,
  ) :
      this(software.amazon.awscdk.services.lakeformation.CfnTagAssociation(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnTagAssociationProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnTagAssociationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnTagAssociationProps(props)
  )

  /**
   * Json encoding of the input resource.
   *
   * **Examples** - Database:
   * `{"Catalog":null,"Database":{"CatalogId":"123456789012","Name":"ExampleDbName"},"Table":null,"TableWithColumns":null}`
   *
   * * Table:
   * `{"Catalog":null,"Database":null,"Table":{"CatalogId":"123456789012","DatabaseName":"ExampleDbName","Name":"ExampleTableName","TableWildcard":null},"TableWithColumns":null}`
   * * Columns:
   * `{"Catalog":null,"Database":null,"Table":null,"TableWithColumns":{"CatalogId":"123456789012","DatabaseName":"ExampleDbName","Name":"ExampleTableName","ColumnNames":["ExampleColName1","ExampleColName2"]}}`
   */
  public open fun attrResourceIdentifier(): String = unwrap(this).getAttrResourceIdentifier()

  /**
   * Json encoding of the input LFTags list.
   *
   * For example:
   * `[{"CatalogId":null,"TagKey":"tagKey1","TagValues":null},{"CatalogId":null,"TagKey":"tagKey2","TagValues":null}]`
   */
  public open fun attrTagsIdentifier(): String = unwrap(this).getAttrTagsIdentifier()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A structure containing an LF-tag key-value pair.
   */
  public open fun lfTags(): Any = unwrap(this).getLfTags()

  /**
   * A structure containing an LF-tag key-value pair.
   */
  public open fun lfTags(`value`: IResolvable) {
    unwrap(this).setLfTags(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * A structure containing an LF-tag key-value pair.
   */
  public open fun lfTags(`value`: List<Any>) {
    unwrap(this).setLfTags(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * A structure containing an LF-tag key-value pair.
   */
  public open fun lfTags(vararg `value`: Any): Unit = lfTags(`value`.toList())

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   */
  public open fun resource(): Any = unwrap(this).getResource()

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   */
  public open fun resource(`value`: IResolvable) {
    unwrap(this).setResource(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   */
  public open fun resource(`value`: ResourceProperty) {
    unwrap(this).setResource(`value`.let(ResourceProperty.Companion::unwrap))
  }

  /**
   * UTF-8 string (valid values: `DATABASE | TABLE` ).
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("cccb07ab6492bcc0b5b63d4931c7013cd14fcbf6b0e06abd4bb6d3a782074288")
  public open fun resource(`value`: ResourceProperty.Builder.() -> Unit): Unit =
      resource(ResourceProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnTagAssociation].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(lfTags: IResolvable)

    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(lfTags: List<Any>)

    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    public fun lfTags(vararg lfTags: Any)

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     */
    public fun resource(resource: IResolvable)

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     */
    public fun resource(resource: ResourceProperty)

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94892b7ca3d7baf8fb6d41c4ebbb0d927fa34d8552a92ec08081dc4c04bd9cde")
    public fun resource(resource: ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.Builder
        = software.amazon.awscdk.services.lakeformation.CfnTagAssociation.Builder.create(scope, id)

    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(lfTags: IResolvable) {
      cdkBuilder.lfTags(lfTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(lfTags: List<Any>) {
      cdkBuilder.lfTags(lfTags.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * A structure containing an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-lftags)
     * @param lfTags A structure containing an LF-tag key-value pair. 
     */
    override fun lfTags(vararg lfTags: Any): Unit = lfTags(lfTags.toList())

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     */
    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable.Companion::unwrap))
    }

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     */
    override fun resource(resource: ResourceProperty) {
      cdkBuilder.resource(resource.let(ResourceProperty.Companion::unwrap))
    }

    /**
     * UTF-8 string (valid values: `DATABASE | TABLE` ).
     *
     * The resource for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-tagassociation.html#cfn-lakeformation-tagassociation-resource)
     * @param resource UTF-8 string (valid values: `DATABASE | TABLE` ). 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("94892b7ca3d7baf8fb6d41c4ebbb0d927fa34d8552a92ec08081dc4c04bd9cde")
    override fun resource(resource: ResourceProperty.Builder.() -> Unit): Unit =
        resource(ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnTagAssociation =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnTagAssociation.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnTagAssociation {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnTagAssociation(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation):
        CfnTagAssociation = CfnTagAssociation(cdkObject)

    internal fun unwrap(wrapped: CfnTagAssociation):
        software.amazon.awscdk.services.lakeformation.CfnTagAssociation = wrapped.cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnTagAssociation
  }

  /**
   * A structure for the database object.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * DatabaseResourceProperty databaseResourceProperty = DatabaseResourceProperty.builder()
   * .catalogId("catalogId")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-databaseresource.html)
   */
  public interface DatabaseResourceProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, it should be the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-databaseresource.html#cfn-lakeformation-tagassociation-databaseresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The name of the database resource.
     *
     * Unique to the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-databaseresource.html#cfn-lakeformation-tagassociation-databaseresource-name)
     */
    public fun name(): String

    /**
     * A builder for [DatabaseResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog . 
       * By default, it should be the account ID of the caller.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param name The name of the database resource. 
       * Unique to the Data Catalog.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog . 
       * By default, it should be the account ID of the caller.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param name The name of the database resource. 
       * Unique to the Data Catalog.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty,
    ) : CdkObject(cdkObject), DatabaseResourceProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * By default, it should be the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-databaseresource.html#cfn-lakeformation-tagassociation-databaseresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The name of the database resource.
       *
       * Unique to the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-databaseresource.html#cfn-lakeformation-tagassociation-databaseresource-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty):
          DatabaseResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DatabaseResourceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.DatabaseResourceProperty
    }
  }

  /**
   * A structure containing the catalog ID, tag key, and tag values of an LF-tag key-value pair.
   *
   * Example:
   *
   * ```
   * import io.cloudshiftdev.awscdk.*;
   * import io.cloudshiftdev.awscdk.services.glue.alpha.S3Table;
   * import io.cloudshiftdev.awscdk.services.glue.alpha.Database;
   * import io.cloudshiftdev.awscdk.services.glue.alpha.DataFormat;
   * import io.cloudshiftdev.awscdk.services.glue.alpha.Schema;
   * import io.cloudshiftdev.awscdk.services.lakeformation.CfnDataLakeSettings;
   * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTag;
   * import io.cloudshiftdev.awscdk.services.lakeformation.CfnTagAssociation;
   * Stack stack;
   * String accountId;
   * String tagKey = "aws";
   * String[] tagValues = List.of("dev");
   * Database database = new Database(this, "Database");
   * S3Table table = S3Table.Builder.create(this, "Table")
   * .database(database)
   * .columns(List.of(Column.builder()
   * .name("col1")
   * .type(Schema.STRING)
   * .build(), Column.builder()
   * .name("col2")
   * .type(Schema.STRING)
   * .build()))
   * .dataFormat(DataFormat.CSV)
   * .build();
   * DefaultStackSynthesizer synthesizer = (DefaultStackSynthesizer)stack.getSynthesizer();
   * CfnDataLakeSettings.Builder.create(this, "DataLakeSettings")
   * .admins(List.of(DataLakePrincipalProperty.builder()
   * .dataLakePrincipalIdentifier(stack.formatArn(ArnComponents.builder()
   * .service("iam")
   * .resource("role")
   * .region("")
   * .account(accountId)
   * .resourceName("Admin")
   * .build()))
   * .build(), DataLakePrincipalProperty.builder()
   * // The CDK cloudformation execution role.
   * .dataLakePrincipalIdentifier(synthesizer.cloudFormationExecutionRoleArn.replace("${AWS::Partition}",
   * "aws"))
   * .build()))
   * .build();
   * CfnTag tag = CfnTag.Builder.create(this, "Tag")
   * .catalogId(accountId)
   * .tagKey(tagKey)
   * .tagValues(tagValues)
   * .build();
   * LFTagPairProperty lfTagPairProperty = LFTagPairProperty.builder()
   * .catalogId(accountId)
   * .tagKey(tagKey)
   * .tagValues(tagValues)
   * .build();
   * CfnTagAssociation tagAssociation = CfnTagAssociation.Builder.create(this, "TagAssociation")
   * .lfTags(List.of(lfTagPairProperty))
   * .resource(ResourceProperty.builder()
   * .tableWithColumns(TableWithColumnsResourceProperty.builder()
   * .databaseName(database.getDatabaseName())
   * .columnNames(List.of("col1", "col2"))
   * .catalogId(accountId)
   * .name(table.getTableName())
   * .build())
   * .build())
   * .build();
   * tagAssociation.node.addDependency(tag);
   * tagAssociation.node.addDependency(table);
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html)
   */
  public interface LFTagPairProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html#cfn-lakeformation-tagassociation-lftagpair-catalogid)
     */
    public fun catalogId(): String

    /**
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html#cfn-lakeformation-tagassociation-lftagpair-tagkey)
     */
    public fun tagKey(): String

    /**
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html#cfn-lakeformation-tagassociation-lftagpair-tagvalues)
     */
    public fun tagValues(): List<String>

    /**
     * A builder for [LFTagPairProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog . 
       * By default, it is the account ID of the caller.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param tagKey The key-name for the LF-tag. 
       */
      public fun tagKey(tagKey: String)

      /**
       * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      public fun tagValues(tagValues: List<String>)

      /**
       * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      public fun tagValues(vararg tagValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog . 
       * By default, it is the account ID of the caller.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param tagKey The key-name for the LF-tag. 
       */
      override fun tagKey(tagKey: String) {
        cdkBuilder.tagKey(tagKey)
      }

      /**
       * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      /**
       * @param tagValues A list of possible values of the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty,
    ) : CdkObject(cdkObject), LFTagPairProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html#cfn-lakeformation-tagassociation-lftagpair-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The key-name for the LF-tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html#cfn-lakeformation-tagassociation-lftagpair-tagkey)
       */
      override fun tagKey(): String = unwrap(this).getTagKey()

      /**
       * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-lftagpair.html#cfn-lakeformation-tagassociation-lftagpair-tagvalues)
       */
      override fun tagValues(): List<String> = unwrap(this).getTagValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagPairProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty):
          LFTagPairProperty = CdkObjectWrappers.wrap(cdkObject) as? LFTagPairProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagPairProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.LFTagPairProperty
    }
  }

  /**
   * A structure for the resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * Object catalog;
   * Object tableWildcard;
   * ResourceProperty resourceProperty = ResourceProperty.builder()
   * .catalog(catalog)
   * .database(DatabaseResourceProperty.builder()
   * .catalogId("catalogId")
   * .name("name")
   * .build())
   * .table(TableResourceProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * // the properties below are optional
   * .name("name")
   * .tableWildcard(tableWildcard)
   * .build())
   * .tableWithColumns(TableWithColumnsResourceProperty.builder()
   * .catalogId("catalogId")
   * .columnNames(List.of("columnNames"))
   * .databaseName("databaseName")
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html)
   */
  public interface ResourceProperty {
    /**
     * The identifier for the Data Catalog.
     *
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-catalog)
     */
    public fun catalog(): Any? = unwrap(this).getCatalog()

    /**
     * The database for the resource.
     *
     * Unique to the Data Catalog. A database is a set of associated table definitions organized
     * into a logical group. You can Grant and Revoke database permissions to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-database)
     */
    public fun database(): Any? = unwrap(this).getDatabase()

    /**
     * The table for the resource.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-table)
     */
    public fun table(): Any? = unwrap(this).getTable()

    /**
     * The table with columns for the resource.
     *
     * A principal with permissions to this resource can select metadata from the columns of a table
     * in the Data Catalog and the underlying data in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-tablewithcolumns)
     */
    public fun tableWithColumns(): Any? = unwrap(this).getTableWithColumns()

    /**
     * A builder for [ResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalog The identifier for the Data Catalog.
       * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
       * database definitions, table definitions, and other control information to manage your AWS Lake
       * Formation environment.
       */
      public fun catalog(catalog: Any)

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      public fun database(database: IResolvable)

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      public fun database(database: DatabaseResourceProperty)

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97176c28c0e94cb42304507c85985874dcaebccbb3157e601c84f47a1b83b608")
      public fun database(database: DatabaseResourceProperty.Builder.() -> Unit)

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      public fun table(table: IResolvable)

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      public fun table(table: TableResourceProperty)

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222f937de1b3ea7ce39f737cd3d76c9d79c51727be76d73727495101f8d808d4")
      public fun table(table: TableResourceProperty.Builder.() -> Unit)

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      public fun tableWithColumns(tableWithColumns: IResolvable)

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      public fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty)

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4db238db16749c277996565207f773ff92a79866045d6c0b2cb4ecb6d5008c3f")
      public
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty.Builder =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty.builder()

      /**
       * @param catalog The identifier for the Data Catalog.
       * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
       * database definitions, table definitions, and other control information to manage your AWS Lake
       * Formation environment.
       */
      override fun catalog(catalog: Any) {
        cdkBuilder.catalog(catalog)
      }

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      override fun database(database: IResolvable) {
        cdkBuilder.database(database.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      override fun database(database: DatabaseResourceProperty) {
        cdkBuilder.database(database.let(DatabaseResourceProperty.Companion::unwrap))
      }

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("97176c28c0e94cb42304507c85985874dcaebccbb3157e601c84f47a1b83b608")
      override fun database(database: DatabaseResourceProperty.Builder.() -> Unit): Unit =
          database(DatabaseResourceProperty(database))

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      override fun table(table: IResolvable) {
        cdkBuilder.table(table.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      override fun table(table: TableResourceProperty) {
        cdkBuilder.table(table.let(TableResourceProperty.Companion::unwrap))
      }

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("222f937de1b3ea7ce39f737cd3d76c9d79c51727be76d73727495101f8d808d4")
      override fun table(table: TableResourceProperty.Builder.() -> Unit): Unit =
          table(TableResourceProperty(table))

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      override fun tableWithColumns(tableWithColumns: IResolvable) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      override fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(TableWithColumnsResourceProperty.Companion::unwrap))
      }

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4db238db16749c277996565207f773ff92a79866045d6c0b2cb4ecb6d5008c3f")
      override
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit):
          Unit = tableWithColumns(TableWithColumnsResourceProperty(tableWithColumns))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty,
    ) : CdkObject(cdkObject), ResourceProperty {
      /**
       * The identifier for the Data Catalog.
       *
       * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
       * database definitions, table definitions, and other control information to manage your AWS Lake
       * Formation environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-catalog)
       */
      override fun catalog(): Any? = unwrap(this).getCatalog()

      /**
       * The database for the resource.
       *
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-database)
       */
      override fun database(): Any? = unwrap(this).getDatabase()

      /**
       * The table for the resource.
       *
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-table)
       */
      override fun table(): Any? = unwrap(this).getTable()

      /**
       * The table with columns for the resource.
       *
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-resource.html#cfn-lakeformation-tagassociation-resource-tablewithcolumns)
       */
      override fun tableWithColumns(): Any? = unwrap(this).getTableWithColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty):
          ResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.ResourceProperty
    }
  }

  /**
   * A structure for the table object.
   *
   * A table is a metadata definition that represents your data. You can Grant and Revoke table
   * privileges to a principal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * Object tableWildcard;
   * TableResourceProperty tableResourceProperty = TableResourceProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * // the properties below are optional
   * .name("name")
   * .tableWildcard(tableWildcard)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html)
   */
  public interface TableResourceProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The name of the database for the table.
     *
     * Unique to a Data Catalog. A database is a set of associated table definitions organized into
     * a logical group. You can Grant and Revoke database privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-databasename)
     */
    public fun databaseName(): String

    /**
     * The name of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A wildcard object representing every table under a database.This is an object with no
     * properties that effectively behaves as a true or false depending on whether not it is passed as
     * a parameter. The valid inputs for a property with this type in either yaml or json is null or
     * {}.
     *
     * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-tablewildcard)
     */
    public fun tableWildcard(): Any? = unwrap(this).getTableWildcard()

    /**
     * A builder for [TableResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog . 
       * By default, it is the account ID of the caller.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName The name of the database for the table. 
       * Unique to a Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param name The name of the table.
       */
      public fun name(name: String)

      /**
       * @param tableWildcard A wildcard object representing every table under a database.This is an
       * object with no properties that effectively behaves as a true or false depending on whether not
       * it is passed as a parameter. The valid inputs for a property with this type in either yaml or
       * json is null or {}.
       * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
       */
      public fun tableWildcard(tableWildcard: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog . 
       * By default, it is the account ID of the caller.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName The name of the database for the table. 
       * Unique to a Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param name The name of the table.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param tableWildcard A wildcard object representing every table under a database.This is an
       * object with no properties that effectively behaves as a true or false depending on whether not
       * it is passed as a parameter. The valid inputs for a property with this type in either yaml or
       * json is null or {}.
       * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
       */
      override fun tableWildcard(tableWildcard: Any) {
        cdkBuilder.tableWildcard(tableWildcard)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty,
    ) : CdkObject(cdkObject), TableResourceProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The name of the database for the table.
       *
       * Unique to a Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The name of the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A wildcard object representing every table under a database.This is an object with no
       * properties that effectively behaves as a true or false depending on whether not it is passed
       * as a parameter. The valid inputs for a property with this type in either yaml or json is null
       * or {}.
       *
       * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tableresource.html#cfn-lakeformation-tagassociation-tableresource-tablewildcard)
       */
      override fun tableWildcard(): Any? = unwrap(this).getTableWildcard()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty):
          TableResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? TableResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableResourceProperty
    }
  }

  /**
   * A structure for a table with columns object. This object is only used when granting a SELECT
   * permission.
   *
   * This object must take a value for at least one of `ColumnsNames` , `ColumnsIndexes` , or
   * `ColumnsWildcard` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * TableWithColumnsResourceProperty tableWithColumnsResourceProperty =
   * TableWithColumnsResourceProperty.builder()
   * .catalogId("catalogId")
   * .columnNames(List.of("columnNames"))
   * .databaseName("databaseName")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html)
   */
  public interface TableWithColumnsResourceProperty {
    /**
     * A wildcard object representing every table under a database.
     *
     * At least one of TableResource$Name or TableResource$TableWildcard is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The list of column names for the table.
     *
     * At least one of `ColumnNames` or `ColumnWildcard` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-columnnames)
     */
    public fun columnNames(): List<String>

    /**
     * The name of the database for the table with columns resource.
     *
     * Unique to the Data Catalog. A database is a set of associated table definitions organized
     * into a logical group. You can Grant and Revoke database privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-databasename)
     */
    public fun databaseName(): String

    /**
     * The name of the table resource.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-name)
     */
    public fun name(): String

    /**
     * A builder for [TableWithColumnsResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId A wildcard object representing every table under a database. 
       * At least one of TableResource$Name or TableResource$TableWildcard is required.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param columnNames The list of column names for the table. 
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      public fun columnNames(columnNames: List<String>)

      /**
       * @param columnNames The list of column names for the table. 
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      public fun columnNames(vararg columnNames: String)

      /**
       * @param databaseName The name of the database for the table with columns resource. 
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param name The name of the table resource. 
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      public fun name(name: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty.builder()

      /**
       * @param catalogId A wildcard object representing every table under a database. 
       * At least one of TableResource$Name or TableResource$TableWildcard is required.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param columnNames The list of column names for the table. 
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      override fun columnNames(columnNames: List<String>) {
        cdkBuilder.columnNames(columnNames)
      }

      /**
       * @param columnNames The list of column names for the table. 
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      override fun columnNames(vararg columnNames: String): Unit = columnNames(columnNames.toList())

      /**
       * @param databaseName The name of the database for the table with columns resource. 
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param name The name of the table resource. 
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty,
    ) : CdkObject(cdkObject), TableWithColumnsResourceProperty {
      /**
       * A wildcard object representing every table under a database.
       *
       * At least one of TableResource$Name or TableResource$TableWildcard is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The list of column names for the table.
       *
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-columnnames)
       */
      override fun columnNames(): List<String> = unwrap(this).getColumnNames()

      /**
       * The name of the database for the table with columns resource.
       *
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The name of the table resource.
       *
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-tagassociation-tablewithcolumnsresource.html#cfn-lakeformation-tagassociation-tablewithcolumnsresource-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableWithColumnsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty):
          TableWithColumnsResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TableWithColumnsResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWithColumnsResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnTagAssociation.TableWithColumnsResourceProperty
    }
  }
}
