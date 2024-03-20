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
 * The `AWS::LakeFormation::PrincipalPermissions` resource represents the permissions that a
 * principal has on a Data Catalog resource (such as AWS Glue databases or AWS Glue tables).
 *
 * When you create a `PrincipalPermissions` resource, the permissions are granted via the AWS Lake
 * Formation `GrantPermissions` API operation. When you delete a `PrincipalPermissions` resource, the
 * permissions on principal-resource pair are revoked via the AWS Lake Formation `RevokePermissions`
 * API operation.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lakeformation.*;
 * Object catalog;
 * Object tableWildcard;
 * CfnPrincipalPermissions cfnPrincipalPermissions = CfnPrincipalPermissions.Builder.create(this,
 * "MyCfnPrincipalPermissions")
 * .permissions(List.of("permissions"))
 * .permissionsWithGrantOption(List.of("permissionsWithGrantOption"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .resource(ResourceProperty.builder()
 * .catalog(catalog)
 * .database(DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build())
 * .dataCellsFilter(DataCellsFilterResourceProperty.builder()
 * .databaseName("databaseName")
 * .name("name")
 * .tableCatalogId("tableCatalogId")
 * .tableName("tableName")
 * .build())
 * .dataLocation(DataLocationResourceProperty.builder()
 * .catalogId("catalogId")
 * .resourceArn("resourceArn")
 * .build())
 * .lfTag(LFTagKeyResourceProperty.builder()
 * .catalogId("catalogId")
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build())
 * .lfTagPolicy(LFTagPolicyResourceProperty.builder()
 * .catalogId("catalogId")
 * .expression(List.of(LFTagProperty.builder()
 * .tagKey("tagKey")
 * .tagValues(List.of("tagValues"))
 * .build()))
 * .resourceType("resourceType")
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
 * .databaseName("databaseName")
 * .name("name")
 * // the properties below are optional
 * .columnNames(List.of("columnNames"))
 * .columnWildcard(ColumnWildcardProperty.builder()
 * .excludedColumnNames(List.of("excludedColumnNames"))
 * .build())
 * .build())
 * .build())
 * // the properties below are optional
 * .catalog("catalog")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html)
 */
public open class CfnPrincipalPermissions internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrincipalPermissionsProps,
  ) :
      this(software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnPrincipalPermissionsProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnPrincipalPermissionsProps.Builder.() -> Unit,
  ) : this(scope, id, CfnPrincipalPermissionsProps(props)
  )

  /**
   * Json encoding of the input principal.
   *
   * For example: `{"DataLakePrincipalIdentifier":"arn:aws:iam::123456789012:role/ExampleRole"}`
   */
  public open fun attrPrincipalIdentifier(): String = unwrap(this).getAttrPrincipalIdentifier()

  /**
   * Json encoding of the input resource.
   *
   * For example:
   * `{"Catalog":null,"Database":null,"Table":null,"TableWithColumns":null,"DataLocation":null,"DataCellsFilter":{"TableCatalogId":"123456789012","DatabaseName":"ExampleDatabase","TableName":"ExampleTable","Name":"ExampleFilter"},"LFTag":null,"LFTagPolicy":null}`
   */
  public open fun attrResourceIdentifier(): String = unwrap(this).getAttrResourceIdentifier()

  /**
   * The identifier for the Data Catalog .
   */
  public open fun catalog(): String? = unwrap(this).getCatalog()

  /**
   * The identifier for the Data Catalog .
   */
  public open fun catalog(`value`: String) {
    unwrap(this).setCatalog(`value`)
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
   * The permissions granted or revoked.
   */
  public open fun permissions(): List<String> = unwrap(this).getPermissions()

  /**
   * The permissions granted or revoked.
   */
  public open fun permissions(`value`: List<String>) {
    unwrap(this).setPermissions(`value`)
  }

  /**
   * The permissions granted or revoked.
   */
  public open fun permissions(vararg `value`: String): Unit = permissions(`value`.toList())

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   */
  public open fun permissionsWithGrantOption(): List<String> =
      unwrap(this).getPermissionsWithGrantOption()

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   */
  public open fun permissionsWithGrantOption(`value`: List<String>) {
    unwrap(this).setPermissionsWithGrantOption(`value`)
  }

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   */
  public open fun permissionsWithGrantOption(vararg `value`: String): Unit =
      permissionsWithGrantOption(`value`.toList())

  /**
   * The principal to be granted a permission.
   */
  public open fun principal(): Any = unwrap(this).getPrincipal()

  /**
   * The principal to be granted a permission.
   */
  public open fun principal(`value`: IResolvable) {
    unwrap(this).setPrincipal(`value`.let(IResolvable::unwrap))
  }

  /**
   * The principal to be granted a permission.
   */
  public open fun principal(`value`: DataLakePrincipalProperty) {
    unwrap(this).setPrincipal(`value`.let(DataLakePrincipalProperty::unwrap))
  }

  /**
   * The principal to be granted a permission.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a5b12d2ee943bcdc5bcd4c8f8e88a7bc0a87de2425c867fa4e98da8f13841247")
  public open fun principal(`value`: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
      principal(DataLakePrincipalProperty(`value`))

  /**
   * The resource to be granted or revoked permissions.
   */
  public open fun resource(): Any = unwrap(this).getResource()

  /**
   * The resource to be granted or revoked permissions.
   */
  public open fun resource(`value`: IResolvable) {
    unwrap(this).setResource(`value`.let(IResolvable::unwrap))
  }

  /**
   * The resource to be granted or revoked permissions.
   */
  public open fun resource(`value`: ResourceProperty) {
    unwrap(this).setResource(`value`.let(ResourceProperty::unwrap))
  }

  /**
   * The resource to be granted or revoked permissions.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("787381cc8c9d8f7e6379e551bab29247bcc52963c3237276eccf246e6b8abfbb")
  public open fun resource(`value`: ResourceProperty.Builder.() -> Unit): Unit =
      resource(ResourceProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnPrincipalPermissions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-catalog)
     * @param catalog The identifier for the Data Catalog . 
     */
    public fun catalog(catalog: String)

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    public fun permissions(permissions: List<String>)

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    public fun permissions(vararg permissions: String)

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    public fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>)

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String)

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission. 
     */
    public fun principal(principal: IResolvable)

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission. 
     */
    public fun principal(principal: DataLakePrincipalProperty)

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ada9de85da6a893ceb9189292d0a98668a4322aceecb7431d3cfc1cd81b58517")
    public fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit)

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions. 
     */
    public fun resource(resource: IResolvable)

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions. 
     */
    public fun resource(resource: ResourceProperty)

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e8ad70521eebb61655507ef9c8bf21f74f4a785b1336b8f2b5c53f809318bed")
    public fun resource(resource: ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.Builder.create(scope,
        id)

    /**
     * The identifier for the Data Catalog .
     *
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-catalog)
     * @param catalog The identifier for the Data Catalog . 
     */
    override fun catalog(catalog: String) {
      cdkBuilder.catalog(catalog)
    }

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    override fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
      cdkBuilder.permissionsWithGrantOption(permissionsWithGrantOption)
    }

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    override fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String): Unit =
        permissionsWithGrantOption(permissionsWithGrantOption.toList())

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission. 
     */
    override fun principal(principal: IResolvable) {
      cdkBuilder.principal(principal.let(IResolvable::unwrap))
    }

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission. 
     */
    override fun principal(principal: DataLakePrincipalProperty) {
      cdkBuilder.principal(principal.let(DataLakePrincipalProperty::unwrap))
    }

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     * @param principal The principal to be granted a permission. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ada9de85da6a893ceb9189292d0a98668a4322aceecb7431d3cfc1cd81b58517")
    override fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
        principal(DataLakePrincipalProperty(principal))

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions. 
     */
    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions. 
     */
    override fun resource(resource: ResourceProperty) {
      cdkBuilder.resource(resource.let(ResourceProperty::unwrap))
    }

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     * @param resource The resource to be granted or revoked permissions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("8e8ad70521eebb61655507ef9c8bf21f74f4a785b1336b8f2b5c53f809318bed")
    override fun resource(resource: ResourceProperty.Builder.() -> Unit): Unit =
        resource(ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPrincipalPermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPrincipalPermissions(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions):
        CfnPrincipalPermissions = CfnPrincipalPermissions(cdkObject)

    internal fun unwrap(wrapped: CfnPrincipalPermissions):
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions = wrapped.cdkObject
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
   * .dataCellsFilter(DataCellsFilterResourceProperty.builder()
   * .databaseName("databaseName")
   * .name("name")
   * .tableCatalogId("tableCatalogId")
   * .tableName("tableName")
   * .build())
   * .dataLocation(DataLocationResourceProperty.builder()
   * .catalogId("catalogId")
   * .resourceArn("resourceArn")
   * .build())
   * .lfTag(LFTagKeyResourceProperty.builder()
   * .catalogId("catalogId")
   * .tagKey("tagKey")
   * .tagValues(List.of("tagValues"))
   * .build())
   * .lfTagPolicy(LFTagPolicyResourceProperty.builder()
   * .catalogId("catalogId")
   * .expression(List.of(LFTagProperty.builder()
   * .tagKey("tagKey")
   * .tagValues(List.of("tagValues"))
   * .build()))
   * .resourceType("resourceType")
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
   * .databaseName("databaseName")
   * .name("name")
   * // the properties below are optional
   * .columnNames(List.of("columnNames"))
   * .columnWildcard(ColumnWildcardProperty.builder()
   * .excludedColumnNames(List.of("excludedColumnNames"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html)
   */
  public interface ResourceProperty {
    /**
     * The identifier for the Data Catalog.
     *
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your AWS Lake
     * Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-catalog)
     */
    public fun catalog(): Any? = unwrap(this).getCatalog()

    /**
     * A data cell filter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-datacellsfilter)
     */
    public fun dataCellsFilter(): Any? = unwrap(this).getDataCellsFilter()

    /**
     * The location of an Amazon S3 path where permissions are granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-datalocation)
     */
    public fun dataLocation(): Any? = unwrap(this).getDataLocation()

    /**
     * The database for the resource.
     *
     * Unique to the Data Catalog. A database is a set of associated table definitions organized
     * into a logical group. You can Grant and Revoke database permissions to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-database)
     */
    public fun database(): Any? = unwrap(this).getDatabase()

    /**
     * The LF-tag key and values attached to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-lftag)
     */
    public fun lfTag(): Any? = unwrap(this).getLfTag()

    /**
     * A list of LF-tag conditions that define a resource's LF-tag policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-lftagpolicy)
     */
    public fun lfTagPolicy(): Any? = unwrap(this).getLfTagPolicy()

    /**
     * The table for the resource.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-table)
     */
    public fun table(): Any? = unwrap(this).getTable()

    /**
     * The table with columns for the resource.
     *
     * A principal with permissions to this resource can select metadata from the columns of a table
     * in the Data Catalog and the underlying data in Amazon S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-tablewithcolumns)
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
       * @param dataCellsFilter A data cell filter.
       */
      public fun dataCellsFilter(dataCellsFilter: IResolvable)

      /**
       * @param dataCellsFilter A data cell filter.
       */
      public fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty)

      /**
       * @param dataCellsFilter A data cell filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("214f04098257eade207ce95738dd89ae45720eed005e04929106480571dbf4a3")
      public
          fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty.Builder.() -> Unit)

      /**
       * @param dataLocation The location of an Amazon S3 path where permissions are granted or
       * revoked.
       */
      public fun dataLocation(dataLocation: IResolvable)

      /**
       * @param dataLocation The location of an Amazon S3 path where permissions are granted or
       * revoked.
       */
      public fun dataLocation(dataLocation: DataLocationResourceProperty)

      /**
       * @param dataLocation The location of an Amazon S3 path where permissions are granted or
       * revoked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7b4189fe1269e009c363138ef33cb5e5b1a0ceb7590abade6833e9511b923a9")
      public fun dataLocation(dataLocation: DataLocationResourceProperty.Builder.() -> Unit)

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
      @JvmName("c9178c566a6b0e2f38e909d226ef8ee536c735477b7bb2850f24587b92e3994c")
      public fun database(database: DatabaseResourceProperty.Builder.() -> Unit)

      /**
       * @param lfTag The LF-tag key and values attached to a resource.
       */
      public fun lfTag(lfTag: IResolvable)

      /**
       * @param lfTag The LF-tag key and values attached to a resource.
       */
      public fun lfTag(lfTag: LFTagKeyResourceProperty)

      /**
       * @param lfTag The LF-tag key and values attached to a resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9063595a464c4850bf8fb02619ca7219d953c8e0863d3da41fc189880be8b10d")
      public fun lfTag(lfTag: LFTagKeyResourceProperty.Builder.() -> Unit)

      /**
       * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
       */
      public fun lfTagPolicy(lfTagPolicy: IResolvable)

      /**
       * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
       */
      public fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty)

      /**
       * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e7fbdb2b7dbf0e67b4e4467adb58fce79882b5f0045c739c4d75f5326b5bb21")
      public fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty.Builder.() -> Unit)

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
      @JvmName("36417835e8a5689f515c4ced639994f9578a56d03631f8db9e7dc0316bf5e613")
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
      @JvmName("7e4893b877fcfc70d7d8b3a0774a35e0f6ac5d636a9becbdab0e51e8b38f5432")
      public
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty.builder()

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
       * @param dataCellsFilter A data cell filter.
       */
      override fun dataCellsFilter(dataCellsFilter: IResolvable) {
        cdkBuilder.dataCellsFilter(dataCellsFilter.let(IResolvable::unwrap))
      }

      /**
       * @param dataCellsFilter A data cell filter.
       */
      override fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty) {
        cdkBuilder.dataCellsFilter(dataCellsFilter.let(DataCellsFilterResourceProperty::unwrap))
      }

      /**
       * @param dataCellsFilter A data cell filter.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("214f04098257eade207ce95738dd89ae45720eed005e04929106480571dbf4a3")
      override
          fun dataCellsFilter(dataCellsFilter: DataCellsFilterResourceProperty.Builder.() -> Unit):
          Unit = dataCellsFilter(DataCellsFilterResourceProperty(dataCellsFilter))

      /**
       * @param dataLocation The location of an Amazon S3 path where permissions are granted or
       * revoked.
       */
      override fun dataLocation(dataLocation: IResolvable) {
        cdkBuilder.dataLocation(dataLocation.let(IResolvable::unwrap))
      }

      /**
       * @param dataLocation The location of an Amazon S3 path where permissions are granted or
       * revoked.
       */
      override fun dataLocation(dataLocation: DataLocationResourceProperty) {
        cdkBuilder.dataLocation(dataLocation.let(DataLocationResourceProperty::unwrap))
      }

      /**
       * @param dataLocation The location of an Amazon S3 path where permissions are granted or
       * revoked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7b4189fe1269e009c363138ef33cb5e5b1a0ceb7590abade6833e9511b923a9")
      override fun dataLocation(dataLocation: DataLocationResourceProperty.Builder.() -> Unit): Unit
          = dataLocation(DataLocationResourceProperty(dataLocation))

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      override fun database(database: IResolvable) {
        cdkBuilder.database(database.let(IResolvable::unwrap))
      }

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      override fun database(database: DatabaseResourceProperty) {
        cdkBuilder.database(database.let(DatabaseResourceProperty::unwrap))
      }

      /**
       * @param database The database for the resource.
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c9178c566a6b0e2f38e909d226ef8ee536c735477b7bb2850f24587b92e3994c")
      override fun database(database: DatabaseResourceProperty.Builder.() -> Unit): Unit =
          database(DatabaseResourceProperty(database))

      /**
       * @param lfTag The LF-tag key and values attached to a resource.
       */
      override fun lfTag(lfTag: IResolvable) {
        cdkBuilder.lfTag(lfTag.let(IResolvable::unwrap))
      }

      /**
       * @param lfTag The LF-tag key and values attached to a resource.
       */
      override fun lfTag(lfTag: LFTagKeyResourceProperty) {
        cdkBuilder.lfTag(lfTag.let(LFTagKeyResourceProperty::unwrap))
      }

      /**
       * @param lfTag The LF-tag key and values attached to a resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9063595a464c4850bf8fb02619ca7219d953c8e0863d3da41fc189880be8b10d")
      override fun lfTag(lfTag: LFTagKeyResourceProperty.Builder.() -> Unit): Unit =
          lfTag(LFTagKeyResourceProperty(lfTag))

      /**
       * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
       */
      override fun lfTagPolicy(lfTagPolicy: IResolvable) {
        cdkBuilder.lfTagPolicy(lfTagPolicy.let(IResolvable::unwrap))
      }

      /**
       * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
       */
      override fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty) {
        cdkBuilder.lfTagPolicy(lfTagPolicy.let(LFTagPolicyResourceProperty::unwrap))
      }

      /**
       * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e7fbdb2b7dbf0e67b4e4467adb58fce79882b5f0045c739c4d75f5326b5bb21")
      override fun lfTagPolicy(lfTagPolicy: LFTagPolicyResourceProperty.Builder.() -> Unit): Unit =
          lfTagPolicy(LFTagPolicyResourceProperty(lfTagPolicy))

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      override fun table(table: IResolvable) {
        cdkBuilder.table(table.let(IResolvable::unwrap))
      }

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      override fun table(table: TableResourceProperty) {
        cdkBuilder.table(table.let(TableResourceProperty::unwrap))
      }

      /**
       * @param table The table for the resource.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("36417835e8a5689f515c4ced639994f9578a56d03631f8db9e7dc0316bf5e613")
      override fun table(table: TableResourceProperty.Builder.() -> Unit): Unit =
          table(TableResourceProperty(table))

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      override fun tableWithColumns(tableWithColumns: IResolvable) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(IResolvable::unwrap))
      }

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      override fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumns(tableWithColumns.let(TableWithColumnsResourceProperty::unwrap))
      }

      /**
       * @param tableWithColumns The table with columns for the resource.
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7e4893b877fcfc70d7d8b3a0774a35e0f6ac5d636a9becbdab0e51e8b38f5432")
      override
          fun tableWithColumns(tableWithColumns: TableWithColumnsResourceProperty.Builder.() -> Unit):
          Unit = tableWithColumns(TableWithColumnsResourceProperty(tableWithColumns))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty,
    ) : CdkObject(cdkObject), ResourceProperty {
      /**
       * The identifier for the Data Catalog.
       *
       * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
       * database definitions, table definitions, and other control information to manage your AWS Lake
       * Formation environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-catalog)
       */
      override fun catalog(): Any? = unwrap(this).getCatalog()

      /**
       * A data cell filter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-datacellsfilter)
       */
      override fun dataCellsFilter(): Any? = unwrap(this).getDataCellsFilter()

      /**
       * The location of an Amazon S3 path where permissions are granted or revoked.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-datalocation)
       */
      override fun dataLocation(): Any? = unwrap(this).getDataLocation()

      /**
       * The database for the resource.
       *
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database permissions to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-database)
       */
      override fun database(): Any? = unwrap(this).getDatabase()

      /**
       * The LF-tag key and values attached to a resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-lftag)
       */
      override fun lfTag(): Any? = unwrap(this).getLfTag()

      /**
       * A list of LF-tag conditions that define a resource's LF-tag policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-lftagpolicy)
       */
      override fun lfTagPolicy(): Any? = unwrap(this).getLfTagPolicy()

      /**
       * The table for the resource.
       *
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-table)
       */
      override fun table(): Any? = unwrap(this).getTable()

      /**
       * The table with columns for the resource.
       *
       * A principal with permissions to this resource can select metadata from the columns of a
       * table in the Data Catalog and the underlying data in Amazon S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-resource.html#cfn-lakeformation-principalpermissions-resource-tablewithcolumns)
       */
      override fun tableWithColumns(): Any? = unwrap(this).getTableWithColumns()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty):
          ResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ResourceProperty
    }
  }

  /**
   * A structure for a data location object where permissions are granted or revoked.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * DataLocationResourceProperty dataLocationResourceProperty =
   * DataLocationResourceProperty.builder()
   * .catalogId("catalogId")
   * .resourceArn("resourceArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalocationresource.html)
   */
  public interface DataLocationResourceProperty {
    /**
     * The identifier for the Data Catalog where the location is registered with AWS Lake Formation
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalocationresource.html#cfn-lakeformation-principalpermissions-datalocationresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalocationresource.html#cfn-lakeformation-principalpermissions-datalocationresource-resourcearn)
     */
    public fun resourceArn(): String

    /**
     * A builder for [DataLocationResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog where the location is registered with
       * AWS Lake Formation . 
       */
      public fun catalogId(catalogId: String)

      /**
       * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies the data
       * location resource. 
       */
      public fun resourceArn(resourceArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog where the location is registered with
       * AWS Lake Formation . 
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param resourceArn The Amazon Resource Name (ARN) that uniquely identifies the data
       * location resource. 
       */
      override fun resourceArn(resourceArn: String) {
        cdkBuilder.resourceArn(resourceArn)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty,
    ) : CdkObject(cdkObject), DataLocationResourceProperty {
      /**
       * The identifier for the Data Catalog where the location is registered with AWS Lake
       * Formation .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalocationresource.html#cfn-lakeformation-principalpermissions-datalocationresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalocationresource.html#cfn-lakeformation-principalpermissions-datalocationresource-resourcearn)
       */
      override fun resourceArn(): String = unwrap(this).getResourceArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataLocationResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty):
          DataLocationResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataLocationResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLocationResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLocationResourceProperty
    }
  }

  /**
   * A structure that describes certain columns on certain rows.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * DataCellsFilterResourceProperty dataCellsFilterResourceProperty =
   * DataCellsFilterResourceProperty.builder()
   * .databaseName("databaseName")
   * .name("name")
   * .tableCatalogId("tableCatalogId")
   * .tableName("tableName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html)
   */
  public interface DataCellsFilterResourceProperty {
    /**
     * A database in the Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-databasename)
     */
    public fun databaseName(): String

    /**
     * The name given by the user to the data filter cell.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-name)
     */
    public fun name(): String

    /**
     * The ID of the catalog to which the table belongs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-tablecatalogid)
     */
    public fun tableCatalogId(): String

    /**
     * The name of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-tablename)
     */
    public fun tableName(): String

    /**
     * A builder for [DataCellsFilterResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param databaseName A database in the Data Catalog . 
       */
      public fun databaseName(databaseName: String)

      /**
       * @param name The name given by the user to the data filter cell. 
       */
      public fun name(name: String)

      /**
       * @param tableCatalogId The ID of the catalog to which the table belongs. 
       */
      public fun tableCatalogId(tableCatalogId: String)

      /**
       * @param tableName The name of the table. 
       */
      public fun tableName(tableName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty.builder()

      /**
       * @param databaseName A database in the Data Catalog . 
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param name The name given by the user to the data filter cell. 
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param tableCatalogId The ID of the catalog to which the table belongs. 
       */
      override fun tableCatalogId(tableCatalogId: String) {
        cdkBuilder.tableCatalogId(tableCatalogId)
      }

      /**
       * @param tableName The name of the table. 
       */
      override fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty,
    ) : CdkObject(cdkObject), DataCellsFilterResourceProperty {
      /**
       * A database in the Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The name given by the user to the data filter cell.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * The ID of the catalog to which the table belongs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-tablecatalogid)
       */
      override fun tableCatalogId(): String = unwrap(this).getTableCatalogId()

      /**
       * The name of the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datacellsfilterresource.html#cfn-lakeformation-principalpermissions-datacellsfilterresource-tablename)
       */
      override fun tableName(): String = unwrap(this).getTableName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataCellsFilterResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty):
          DataCellsFilterResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataCellsFilterResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataCellsFilterResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataCellsFilterResourceProperty
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
   * .databaseName("databaseName")
   * .name("name")
   * // the properties below are optional
   * .columnNames(List.of("columnNames"))
   * .columnWildcard(ColumnWildcardProperty.builder()
   * .excludedColumnNames(List.of("excludedColumnNames"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html)
   */
  public interface TableWithColumnsResourceProperty {
    /**
     * The identifier for the Data Catalog where the location is registered with AWS Lake Formation
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The list of column names for the table.
     *
     * At least one of `ColumnNames` or `ColumnWildcard` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-columnnames)
     */
    public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    /**
     * A wildcard specified by a `ColumnWildcard` object.
     *
     * At least one of `ColumnNames` or `ColumnWildcard` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-columnwildcard)
     */
    public fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

    /**
     * The name of the database for the table with columns resource.
     *
     * Unique to the Data Catalog. A database is a set of associated table definitions organized
     * into a logical group. You can Grant and Revoke database privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-databasename)
     */
    public fun databaseName(): String

    /**
     * The name of the table resource.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-name)
     */
    public fun name(): String

    /**
     * A builder for [TableWithColumnsResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog where the location is registered with
       * AWS Lake Formation . 
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
       * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      public fun columnWildcard(columnWildcard: IResolvable)

      /**
       * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      public fun columnWildcard(columnWildcard: ColumnWildcardProperty)

      /**
       * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fb7005c47af5b8bd04299f7cb2a0e2fce1bf66c6e464fbe689c31bacf0605ab")
      public fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit)

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
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog where the location is registered with
       * AWS Lake Formation . 
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
       * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      override fun columnWildcard(columnWildcard: IResolvable) {
        cdkBuilder.columnWildcard(columnWildcard.let(IResolvable::unwrap))
      }

      /**
       * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      override fun columnWildcard(columnWildcard: ColumnWildcardProperty) {
        cdkBuilder.columnWildcard(columnWildcard.let(ColumnWildcardProperty::unwrap))
      }

      /**
       * @param columnWildcard A wildcard specified by a `ColumnWildcard` object.
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1fb7005c47af5b8bd04299f7cb2a0e2fce1bf66c6e464fbe689c31bacf0605ab")
      override fun columnWildcard(columnWildcard: ColumnWildcardProperty.Builder.() -> Unit): Unit =
          columnWildcard(ColumnWildcardProperty(columnWildcard))

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
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty,
    ) : CdkObject(cdkObject), TableWithColumnsResourceProperty {
      /**
       * The identifier for the Data Catalog where the location is registered with AWS Lake
       * Formation .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The list of column names for the table.
       *
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-columnnames)
       */
      override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

      /**
       * A wildcard specified by a `ColumnWildcard` object.
       *
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-columnwildcard)
       */
      override fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

      /**
       * The name of the database for the table with columns resource.
       *
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The name of the table resource.
       *
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tablewithcolumnsresource.html#cfn-lakeformation-principalpermissions-tablewithcolumnsresource-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableWithColumnsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty):
          TableWithColumnsResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TableWithColumnsResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWithColumnsResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableWithColumnsResourceProperty
    }
  }

  /**
   * The AWS Lake Formation principal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
   * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalakeprincipal.html)
   */
  public interface DataLakePrincipalProperty {
    /**
     * An identifier for the AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalakeprincipal.html#cfn-lakeformation-principalpermissions-datalakeprincipal-datalakeprincipalidentifier)
     */
    public fun dataLakePrincipalIdentifier(): String? =
        unwrap(this).getDataLakePrincipalIdentifier()

    /**
     * A builder for [DataLakePrincipalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataLakePrincipalIdentifier An identifier for the AWS Lake Formation principal.
       */
      public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty.builder()

      /**
       * @param dataLakePrincipalIdentifier An identifier for the AWS Lake Formation principal.
       */
      override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty,
    ) : CdkObject(cdkObject), DataLakePrincipalProperty {
      /**
       * An identifier for the AWS Lake Formation principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-datalakeprincipal.html#cfn-lakeformation-principalpermissions-datalakeprincipal-datalakeprincipalidentifier)
       */
      override fun dataLakePrincipalIdentifier(): String? =
          unwrap(this).getDataLakePrincipalIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataLakePrincipalProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty):
          DataLakePrincipalProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataLakePrincipalProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DataLakePrincipalProperty
    }
  }

  /**
   * A structure containing an LF-tag key and values for a resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * LFTagKeyResourceProperty lFTagKeyResourceProperty = LFTagKeyResourceProperty.builder()
   * .catalogId("catalogId")
   * .tagKey("tagKey")
   * .tagValues(List.of("tagValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html)
   */
  public interface LFTagKeyResourceProperty {
    /**
     * The identifier for the Data Catalog where the location is registered with Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html#cfn-lakeformation-principalpermissions-lftagkeyresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html#cfn-lakeformation-principalpermissions-lftagkeyresource-tagkey)
     */
    public fun tagKey(): String

    /**
     * A list of possible values for the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html#cfn-lakeformation-principalpermissions-lftagkeyresource-tagvalues)
     */
    public fun tagValues(): List<String>

    /**
     * A builder for [LFTagKeyResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog where the location is registered with
       * Data Catalog . 
       */
      public fun catalogId(catalogId: String)

      /**
       * @param tagKey The key-name for the LF-tag. 
       */
      public fun tagKey(tagKey: String)

      /**
       * @param tagValues A list of possible values for the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      public fun tagValues(tagValues: List<String>)

      /**
       * @param tagValues A list of possible values for the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      public fun tagValues(vararg tagValues: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog where the location is registered with
       * Data Catalog . 
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
       * @param tagValues A list of possible values for the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      override fun tagValues(tagValues: List<String>) {
        cdkBuilder.tagValues(tagValues)
      }

      /**
       * @param tagValues A list of possible values for the corresponding `TagKey` of an LF-tag
       * key-value pair. 
       */
      override fun tagValues(vararg tagValues: String): Unit = tagValues(tagValues.toList())

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty,
    ) : CdkObject(cdkObject), LFTagKeyResourceProperty {
      /**
       * The identifier for the Data Catalog where the location is registered with Data Catalog .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html#cfn-lakeformation-principalpermissions-lftagkeyresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The key-name for the LF-tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html#cfn-lakeformation-principalpermissions-lftagkeyresource-tagkey)
       */
      override fun tagKey(): String = unwrap(this).getTagKey()

      /**
       * A list of possible values for the corresponding `TagKey` of an LF-tag key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagkeyresource.html#cfn-lakeformation-principalpermissions-lftagkeyresource-tagvalues)
       */
      override fun tagValues(): List<String> = unwrap(this).getTagValues()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagKeyResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty):
          LFTagKeyResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? LFTagKeyResourceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagKeyResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagKeyResourceProperty
    }
  }

  /**
   * A list of LF-tag conditions that define a resource's LF-tag policy.
   *
   * A structure that allows an admin to grant user permissions on certain conditions. For example,
   * granting a role access to all columns that do not have the LF-tag 'PII' in tables that have the
   * LF-tag 'Prod'.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * LFTagPolicyResourceProperty lFTagPolicyResourceProperty = LFTagPolicyResourceProperty.builder()
   * .catalogId("catalogId")
   * .expression(List.of(LFTagProperty.builder()
   * .tagKey("tagKey")
   * .tagValues(List.of("tagValues"))
   * .build()))
   * .resourceType("resourceType")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html)
   */
  public interface LFTagPolicyResourceProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * The Data Catalog is the persistent metadata store. It contains database definitions, table
     * definitions, and other control information to manage your AWS Lake Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html#cfn-lakeformation-principalpermissions-lftagpolicyresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * A list of LF-tag conditions that apply to the resource's LF-tag policy.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html#cfn-lakeformation-principalpermissions-lftagpolicyresource-expression)
     */
    public fun expression(): Any

    /**
     * The resource type for which the LF-tag policy applies.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html#cfn-lakeformation-principalpermissions-lftagpolicyresource-resourcetype)
     */
    public fun resourceType(): String

    /**
     * A builder for [LFTagPolicyResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog . 
       * The Data Catalog is the persistent metadata store. It contains database definitions, table
       * definitions, and other control information to manage your AWS Lake Formation environment.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. 
       */
      public fun expression(expression: IResolvable)

      /**
       * @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. 
       */
      public fun expression(expression: List<Any>)

      /**
       * @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. 
       */
      public fun expression(vararg expression: Any)

      /**
       * @param resourceType The resource type for which the LF-tag policy applies. 
       */
      public fun resourceType(resourceType: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog . 
       * The Data Catalog is the persistent metadata store. It contains database definitions, table
       * definitions, and other control information to manage your AWS Lake Formation environment.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. 
       */
      override fun expression(expression: IResolvable) {
        cdkBuilder.expression(expression.let(IResolvable::unwrap))
      }

      /**
       * @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. 
       */
      override fun expression(expression: List<Any>) {
        cdkBuilder.expression(expression)
      }

      /**
       * @param expression A list of LF-tag conditions that apply to the resource's LF-tag policy. 
       */
      override fun expression(vararg expression: Any): Unit = expression(expression.toList())

      /**
       * @param resourceType The resource type for which the LF-tag policy applies. 
       */
      override fun resourceType(resourceType: String) {
        cdkBuilder.resourceType(resourceType)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty,
    ) : CdkObject(cdkObject), LFTagPolicyResourceProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * The Data Catalog is the persistent metadata store. It contains database definitions, table
       * definitions, and other control information to manage your AWS Lake Formation environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html#cfn-lakeformation-principalpermissions-lftagpolicyresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * A list of LF-tag conditions that apply to the resource's LF-tag policy.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html#cfn-lakeformation-principalpermissions-lftagpolicyresource-expression)
       */
      override fun expression(): Any = unwrap(this).getExpression()

      /**
       * The resource type for which the LF-tag policy applies.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftagpolicyresource.html#cfn-lakeformation-principalpermissions-lftagpolicyresource-resourcetype)
       */
      override fun resourceType(): String = unwrap(this).getResourceType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagPolicyResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty):
          LFTagPolicyResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LFTagPolicyResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagPolicyResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagPolicyResourceProperty
    }
  }

  /**
   * A wildcard object, consisting of an optional list of excluded column names or indexes.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * ColumnWildcardProperty columnWildcardProperty = ColumnWildcardProperty.builder()
   * .excludedColumnNames(List.of("excludedColumnNames"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-columnwildcard.html)
   */
  public interface ColumnWildcardProperty {
    /**
     * Excludes column names.
     *
     * Any column with this name will be excluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-columnwildcard.html#cfn-lakeformation-principalpermissions-columnwildcard-excludedcolumnnames)
     */
    public fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
        emptyList()

    /**
     * A builder for [ColumnWildcardProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      public fun excludedColumnNames(excludedColumnNames: List<String>)

      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      public fun excludedColumnNames(vararg excludedColumnNames: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty.builder()

      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      override fun excludedColumnNames(excludedColumnNames: List<String>) {
        cdkBuilder.excludedColumnNames(excludedColumnNames)
      }

      /**
       * @param excludedColumnNames Excludes column names.
       * Any column with this name will be excluded.
       */
      override fun excludedColumnNames(vararg excludedColumnNames: String): Unit =
          excludedColumnNames(excludedColumnNames.toList())

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty,
    ) : CdkObject(cdkObject), ColumnWildcardProperty {
      /**
       * Excludes column names.
       *
       * Any column with this name will be excluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-columnwildcard.html#cfn-lakeformation-principalpermissions-columnwildcard-excludedcolumnnames)
       */
      override fun excludedColumnNames(): List<String> = unwrap(this).getExcludedColumnNames() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ColumnWildcardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty):
          ColumnWildcardProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnWildcardProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.ColumnWildcardProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html)
   */
  public interface TableResourceProperty {
    /**
     * The identifier for the Data Catalog.
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The name of the database for the table.
     *
     * Unique to a Data Catalog. A database is a set of associated table definitions organized into
     * a logical group. You can Grant and Revoke database privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-databasename)
     */
    public fun databaseName(): String

    /**
     * The name of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A wildcard object representing every table under a database.
     *
     * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-tablewildcard)
     */
    public fun tableWildcard(): Any? = unwrap(this).getTableWildcard()

    /**
     * A builder for [TableResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog. 
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
       * @param tableWildcard A wildcard object representing every table under a database.
       * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
       */
      public fun tableWildcard(tableWildcard: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog. 
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
       * @param tableWildcard A wildcard object representing every table under a database.
       * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
       */
      override fun tableWildcard(tableWildcard: Any) {
        cdkBuilder.tableWildcard(tableWildcard)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty,
    ) : CdkObject(cdkObject), TableResourceProperty {
      /**
       * The identifier for the Data Catalog.
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The name of the database for the table.
       *
       * Unique to a Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-databasename)
       */
      override fun databaseName(): String = unwrap(this).getDatabaseName()

      /**
       * The name of the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A wildcard object representing every table under a database.
       *
       * At least one of `TableResource$Name` or `TableResource$TableWildcard` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-tableresource.html#cfn-lakeformation-principalpermissions-tableresource-tablewildcard)
       */
      override fun tableWildcard(): Any? = unwrap(this).getTableWildcard()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty):
          TableResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? TableResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.TableResourceProperty
    }
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-databaseresource.html)
   */
  public interface DatabaseResourceProperty {
    /**
     * The identifier for the Data Catalog.
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-databaseresource.html#cfn-lakeformation-principalpermissions-databaseresource-catalogid)
     */
    public fun catalogId(): String

    /**
     * The name of the database resource.
     *
     * Unique to the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-databaseresource.html#cfn-lakeformation-principalpermissions-databaseresource-name)
     */
    public fun name(): String

    /**
     * A builder for [DatabaseResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog. 
       * By default, it is the account ID of the caller.
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
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog. 
       * By default, it is the account ID of the caller.
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
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty,
    ) : CdkObject(cdkObject), DatabaseResourceProperty {
      /**
       * The identifier for the Data Catalog.
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-databaseresource.html#cfn-lakeformation-principalpermissions-databaseresource-catalogid)
       */
      override fun catalogId(): String = unwrap(this).getCatalogId()

      /**
       * The name of the database resource.
       *
       * Unique to the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-databaseresource.html#cfn-lakeformation-principalpermissions-databaseresource-name)
       */
      override fun name(): String = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty):
          DatabaseResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DatabaseResourceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.DatabaseResourceProperty
    }
  }

  /**
   * The LF-tag key and values attached to a resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * LFTagProperty lFTagProperty = LFTagProperty.builder()
   * .tagKey("tagKey")
   * .tagValues(List.of("tagValues"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftag.html)
   */
  public interface LFTagProperty {
    /**
     * The key-name for the LF-tag.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftag.html#cfn-lakeformation-principalpermissions-lftag-tagkey)
     */
    public fun tagKey(): String? = unwrap(this).getTagKey()

    /**
     * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftag.html#cfn-lakeformation-principalpermissions-lftag-tagvalues)
     */
    public fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()

    /**
     * A builder for [LFTagProperty]
     */
    @CdkDslMarker
    public interface Builder {
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
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty.builder()

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
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty,
    ) : CdkObject(cdkObject), LFTagProperty {
      /**
       * The key-name for the LF-tag.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftag.html#cfn-lakeformation-principalpermissions-lftag-tagkey)
       */
      override fun tagKey(): String? = unwrap(this).getTagKey()

      /**
       * A list of possible values of the corresponding `TagKey` of an LF-tag key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-principalpermissions-lftag.html#cfn-lakeformation-principalpermissions-lftag-tagvalues)
       */
      override fun tagValues(): List<String> = unwrap(this).getTagValues() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LFTagProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty):
          LFTagProperty = CdkObjectWrappers.wrap(cdkObject) as? LFTagProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LFTagProperty):
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions.LFTagProperty
    }
  }
}
