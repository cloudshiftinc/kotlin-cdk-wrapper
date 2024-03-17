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
 * The `AWS::LakeFormation::Permissions` resource represents the permissions that a principal has on
 * an AWS Glue Data Catalog resource (such as AWS Glue database or AWS Glue tables).
 *
 * When you upload a permissions stack, the permissions are granted to the principal and when you
 * remove the stack, the permissions are revoked from the principal. If you remove a stack, and the
 * principal does not have the permissions referenced in the stack then AWS Lake Formation will throw
 * an error because you can’t call revoke on non-existing permissions. To successfully remove the
 * stack, you’ll need to regrant those permissions and then remove the stack.
 *
 *
 * New versions of AWS Lake Formation permission resources are now available. For more information,
 * see:
 * [AWS:LakeFormation::PrincipalPermissions](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html)
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lakeformation.*;
 * CfnPermissions cfnPermissions = CfnPermissions.Builder.create(this, "MyCfnPermissions")
 * .dataLakePrincipal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .resource(ResourceProperty.builder()
 * .databaseResource(DatabaseResourceProperty.builder()
 * .catalogId("catalogId")
 * .name("name")
 * .build())
 * .dataLocationResource(DataLocationResourceProperty.builder()
 * .catalogId("catalogId")
 * .s3Resource("s3Resource")
 * .build())
 * .tableResource(TableResourceProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .name("name")
 * .tableWildcard(TableWildcardProperty.builder().build())
 * .build())
 * .tableWithColumnsResource(TableWithColumnsResourceProperty.builder()
 * .catalogId("catalogId")
 * .columnNames(List.of("columnNames"))
 * .columnWildcard(ColumnWildcardProperty.builder()
 * .excludedColumnNames(List.of("excludedColumnNames"))
 * .build())
 * .databaseName("databaseName")
 * .name("name")
 * .build())
 * .build())
 * // the properties below are optional
 * .permissions(List.of("permissions"))
 * .permissionsWithGrantOption(List.of("permissionsWithGrantOption"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html)
 */
public open class CfnPermissions internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions,
) : CfnResource(cdkObject), IInspectable {
  /**
   * A unique identifier for the batch permissions request entry.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The AWS Lake Formation principal.
   */
  public open fun dataLakePrincipal(): Any = unwrap(this).getDataLakePrincipal()

  /**
   * The AWS Lake Formation principal.
   */
  public open fun dataLakePrincipal(`value`: IResolvable) {
    unwrap(this).setDataLakePrincipal(`value`.let(IResolvable::unwrap))
  }

  /**
   * The AWS Lake Formation principal.
   */
  public open fun dataLakePrincipal(`value`: DataLakePrincipalProperty) {
    unwrap(this).setDataLakePrincipal(`value`.let(DataLakePrincipalProperty::unwrap))
  }

  /**
   * The AWS Lake Formation principal.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d420e816ac0fcb72829d752bbe548221af202e6cedcfae5e4dfc0ef9dc3cb0c3")
  public open fun dataLakePrincipal(`value`: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
      dataLakePrincipal(DataLakePrincipalProperty(`value`))

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
  public open fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

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
      unwrap(this).getPermissionsWithGrantOption() ?: emptyList()

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
   * A structure for the resource.
   */
  public open fun resource(): Any = unwrap(this).getResource()

  /**
   * A structure for the resource.
   */
  public open fun resource(`value`: IResolvable) {
    unwrap(this).setResource(`value`.let(IResolvable::unwrap))
  }

  /**
   * A structure for the resource.
   */
  public open fun resource(`value`: ResourceProperty) {
    unwrap(this).setResource(`value`.let(ResourceProperty::unwrap))
  }

  /**
   * A structure for the resource.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("2745a1838854d0f33710243e67527d5459d9d83ad350c997fc118b013f89c28d")
  public open fun resource(`value`: ResourceProperty.Builder.() -> Unit): Unit =
      resource(ResourceProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lakeformation.CfnPermissions].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    public fun dataLakePrincipal(dataLakePrincipal: IResolvable)

    /**
     * The AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    public fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty)

    /**
     * The AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14d5340514d6def66fd861c1839f5875d5a4725e3ee4ee0a253c952e91bacea")
    public fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty.Builder.() -> Unit)

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    public fun permissions(permissions: List<String>)

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    public fun permissions(vararg permissions: String)

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    public fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>)

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String)

    /**
     * A structure for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
     * @param resource A structure for the resource. 
     */
    public fun resource(resource: IResolvable)

    /**
     * A structure for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
     * @param resource A structure for the resource. 
     */
    public fun resource(resource: ResourceProperty)

    /**
     * A structure for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
     * @param resource A structure for the resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605cb1f3cd7839c0c21f1aa993c8991148c17ab756e86124b7df6f4b51a95609")
    public fun resource(resource: ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lakeformation.CfnPermissions.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPermissions.Builder.create(scope, id)

    /**
     * The AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    override fun dataLakePrincipal(dataLakePrincipal: IResolvable) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(IResolvable::unwrap))
    }

    /**
     * The AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    override fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(DataLakePrincipalProperty::unwrap))
    }

    /**
     * The AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d14d5340514d6def66fd861c1839f5875d5a4725e3ee4ee0a253c952e91bacea")
    override fun dataLakePrincipal(dataLakePrincipal: DataLakePrincipalProperty.Builder.() -> Unit):
        Unit = dataLakePrincipal(DataLakePrincipalProperty(dataLakePrincipal))

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
     * @param permissions The permissions granted or revoked. 
     */
    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    override fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
      cdkBuilder.permissionsWithGrantOption(permissionsWithGrantOption)
    }

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    override fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String): Unit =
        permissionsWithGrantOption(permissionsWithGrantOption.toList())

    /**
     * A structure for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
     * @param resource A structure for the resource. 
     */
    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    /**
     * A structure for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
     * @param resource A structure for the resource. 
     */
    override fun resource(resource: ResourceProperty) {
      cdkBuilder.resource(resource.let(ResourceProperty::unwrap))
    }

    /**
     * A structure for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
     * @param resource A structure for the resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("605cb1f3cd7839c0c21f1aa993c8991148c17ab756e86124b7df6f4b51a95609")
    override fun resource(resource: ResourceProperty.Builder.() -> Unit): Unit =
        resource(ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPermissions =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.lakeformation.CfnPermissions.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnPermissions {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnPermissions(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions):
        CfnPermissions = CfnPermissions(cdkObject)

    internal fun unwrap(wrapped: CfnPermissions):
        software.amazon.awscdk.services.lakeformation.CfnPermissions = wrapped.cdkObject
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html)
   */
  public interface DatabaseResourceProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html#cfn-lakeformation-permissions-databaseresource-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of the database resource.
     *
     * Unique to the Data Catalog.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html#cfn-lakeformation-permissions-databaseresource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [DatabaseResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog .
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
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog .
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
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty,
    ) : CdkObject(cdkObject), DatabaseResourceProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html#cfn-lakeformation-permissions-databaseresource-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of the database resource.
       *
       * Unique to the Data Catalog.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-databaseresource.html#cfn-lakeformation-permissions-databaseresource-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty):
          DatabaseResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? DatabaseResourceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DatabaseResourceProperty
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
   * ResourceProperty resourceProperty = ResourceProperty.builder()
   * .databaseResource(DatabaseResourceProperty.builder()
   * .catalogId("catalogId")
   * .name("name")
   * .build())
   * .dataLocationResource(DataLocationResourceProperty.builder()
   * .catalogId("catalogId")
   * .s3Resource("s3Resource")
   * .build())
   * .tableResource(TableResourceProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .name("name")
   * .tableWildcard(TableWildcardProperty.builder().build())
   * .build())
   * .tableWithColumnsResource(TableWithColumnsResourceProperty.builder()
   * .catalogId("catalogId")
   * .columnNames(List.of("columnNames"))
   * .columnWildcard(ColumnWildcardProperty.builder()
   * .excludedColumnNames(List.of("excludedColumnNames"))
   * .build())
   * .databaseName("databaseName")
   * .name("name")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html)
   */
  public interface ResourceProperty {
    /**
     * A structure for a data location object where permissions are granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-datalocationresource)
     */
    public fun dataLocationResource(): Any? = unwrap(this).getDataLocationResource()

    /**
     * A structure for the database object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-databaseresource)
     */
    public fun databaseResource(): Any? = unwrap(this).getDatabaseResource()

    /**
     * A structure for the table object.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-tableresource)
     */
    public fun tableResource(): Any? = unwrap(this).getTableResource()

    /**
     * A structure for a table with columns object.
     *
     * This object is only used when granting a SELECT permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-tablewithcolumnsresource)
     */
    public fun tableWithColumnsResource(): Any? = unwrap(this).getTableWithColumnsResource()

    /**
     * A builder for [ResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataLocationResource A structure for a data location object where permissions are
       * granted or revoked.
       */
      public fun dataLocationResource(dataLocationResource: IResolvable)

      /**
       * @param dataLocationResource A structure for a data location object where permissions are
       * granted or revoked.
       */
      public fun dataLocationResource(dataLocationResource: DataLocationResourceProperty)

      /**
       * @param dataLocationResource A structure for a data location object where permissions are
       * granted or revoked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6411436c1ea8c4b37d5e2eb166ce9f794b976b9abed98ddb7d28fa0834de706")
      public
          fun dataLocationResource(dataLocationResource: DataLocationResourceProperty.Builder.() -> Unit)

      /**
       * @param databaseResource A structure for the database object.
       */
      public fun databaseResource(databaseResource: IResolvable)

      /**
       * @param databaseResource A structure for the database object.
       */
      public fun databaseResource(databaseResource: DatabaseResourceProperty)

      /**
       * @param databaseResource A structure for the database object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bf46bb069e66075fa4f807bd800fb94ef2081a1cf7d117522a2f6a777ec7cd8")
      public fun databaseResource(databaseResource: DatabaseResourceProperty.Builder.() -> Unit)

      /**
       * @param tableResource A structure for the table object.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      public fun tableResource(tableResource: IResolvable)

      /**
       * @param tableResource A structure for the table object.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      public fun tableResource(tableResource: TableResourceProperty)

      /**
       * @param tableResource A structure for the table object.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91a4f6b24ed2cda5195e0b77bbdb6caf22ad449f6803374aae8e569a1ec41ee")
      public fun tableResource(tableResource: TableResourceProperty.Builder.() -> Unit)

      /**
       * @param tableWithColumnsResource A structure for a table with columns object.
       * This object is only used when granting a SELECT permission.
       */
      public fun tableWithColumnsResource(tableWithColumnsResource: IResolvable)

      /**
       * @param tableWithColumnsResource A structure for a table with columns object.
       * This object is only used when granting a SELECT permission.
       */
      public
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty)

      /**
       * @param tableWithColumnsResource A structure for a table with columns object.
       * This object is only used when granting a SELECT permission.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0eb048f9c24296bdbd87bd02a8c4ac14dbba3b9e8f258a7b1f22bd63ee1f9fa7")
      public
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty.Builder =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty.builder()

      /**
       * @param dataLocationResource A structure for a data location object where permissions are
       * granted or revoked.
       */
      override fun dataLocationResource(dataLocationResource: IResolvable) {
        cdkBuilder.dataLocationResource(dataLocationResource.let(IResolvable::unwrap))
      }

      /**
       * @param dataLocationResource A structure for a data location object where permissions are
       * granted or revoked.
       */
      override fun dataLocationResource(dataLocationResource: DataLocationResourceProperty) {
        cdkBuilder.dataLocationResource(dataLocationResource.let(DataLocationResourceProperty::unwrap))
      }

      /**
       * @param dataLocationResource A structure for a data location object where permissions are
       * granted or revoked.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("d6411436c1ea8c4b37d5e2eb166ce9f794b976b9abed98ddb7d28fa0834de706")
      override
          fun dataLocationResource(dataLocationResource: DataLocationResourceProperty.Builder.() -> Unit):
          Unit = dataLocationResource(DataLocationResourceProperty(dataLocationResource))

      /**
       * @param databaseResource A structure for the database object.
       */
      override fun databaseResource(databaseResource: IResolvable) {
        cdkBuilder.databaseResource(databaseResource.let(IResolvable::unwrap))
      }

      /**
       * @param databaseResource A structure for the database object.
       */
      override fun databaseResource(databaseResource: DatabaseResourceProperty) {
        cdkBuilder.databaseResource(databaseResource.let(DatabaseResourceProperty::unwrap))
      }

      /**
       * @param databaseResource A structure for the database object.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7bf46bb069e66075fa4f807bd800fb94ef2081a1cf7d117522a2f6a777ec7cd8")
      override fun databaseResource(databaseResource: DatabaseResourceProperty.Builder.() -> Unit):
          Unit = databaseResource(DatabaseResourceProperty(databaseResource))

      /**
       * @param tableResource A structure for the table object.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      override fun tableResource(tableResource: IResolvable) {
        cdkBuilder.tableResource(tableResource.let(IResolvable::unwrap))
      }

      /**
       * @param tableResource A structure for the table object.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      override fun tableResource(tableResource: TableResourceProperty) {
        cdkBuilder.tableResource(tableResource.let(TableResourceProperty::unwrap))
      }

      /**
       * @param tableResource A structure for the table object.
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a91a4f6b24ed2cda5195e0b77bbdb6caf22ad449f6803374aae8e569a1ec41ee")
      override fun tableResource(tableResource: TableResourceProperty.Builder.() -> Unit): Unit =
          tableResource(TableResourceProperty(tableResource))

      /**
       * @param tableWithColumnsResource A structure for a table with columns object.
       * This object is only used when granting a SELECT permission.
       */
      override fun tableWithColumnsResource(tableWithColumnsResource: IResolvable) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource.let(IResolvable::unwrap))
      }

      /**
       * @param tableWithColumnsResource A structure for a table with columns object.
       * This object is only used when granting a SELECT permission.
       */
      override
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty) {
        cdkBuilder.tableWithColumnsResource(tableWithColumnsResource.let(TableWithColumnsResourceProperty::unwrap))
      }

      /**
       * @param tableWithColumnsResource A structure for a table with columns object.
       * This object is only used when granting a SELECT permission.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("0eb048f9c24296bdbd87bd02a8c4ac14dbba3b9e8f258a7b1f22bd63ee1f9fa7")
      override
          fun tableWithColumnsResource(tableWithColumnsResource: TableWithColumnsResourceProperty.Builder.() -> Unit):
          Unit =
          tableWithColumnsResource(TableWithColumnsResourceProperty(tableWithColumnsResource))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty,
    ) : CdkObject(cdkObject), ResourceProperty {
      /**
       * A structure for a data location object where permissions are granted or revoked.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-datalocationresource)
       */
      override fun dataLocationResource(): Any? = unwrap(this).getDataLocationResource()

      /**
       * A structure for the database object.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-databaseresource)
       */
      override fun databaseResource(): Any? = unwrap(this).getDatabaseResource()

      /**
       * A structure for the table object.
       *
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-tableresource)
       */
      override fun tableResource(): Any? = unwrap(this).getTableResource()

      /**
       * A structure for a table with columns object.
       *
       * This object is only used when granting a SELECT permission.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-resource.html#cfn-lakeformation-permissions-resource-tablewithcolumnsresource)
       */
      override fun tableWithColumnsResource(): Any? = unwrap(this).getTableWithColumnsResource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty):
          ResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ResourceProperty
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
   * .s3Resource("s3Resource")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html)
   */
  public interface DataLocationResourceProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-s3resource)
     */
    public fun s3Resource(): String? = unwrap(this).getS3Resource()

    /**
     * A builder for [DataLocationResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog .
       * By default, it is the account ID of the caller.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param s3Resource The Amazon Resource Name (ARN) that uniquely identifies the data location
       * resource.
       */
      public fun s3Resource(s3Resource: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog .
       * By default, it is the account ID of the caller.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param s3Resource The Amazon Resource Name (ARN) that uniquely identifies the data location
       * resource.
       */
      override fun s3Resource(s3Resource: String) {
        cdkBuilder.s3Resource(s3Resource)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty,
    ) : CdkObject(cdkObject), DataLocationResourceProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The Amazon Resource Name (ARN) that uniquely identifies the data location resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalocationresource.html#cfn-lakeformation-permissions-datalocationresource-s3resource)
       */
      override fun s3Resource(): String? = unwrap(this).getS3Resource()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataLocationResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty):
          DataLocationResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataLocationResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLocationResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLocationResourceProperty
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
   * .columnWildcard(ColumnWildcardProperty.builder()
   * .excludedColumnNames(List.of("excludedColumnNames"))
   * .build())
   * .databaseName("databaseName")
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html)
   */
  public interface TableWithColumnsResourceProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The list of column names for the table.
     *
     * At least one of `ColumnNames` or `ColumnWildcard` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnnames)
     */
    public fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

    /**
     * A wildcard specified by a `ColumnWildcard` object.
     *
     * At least one of `ColumnNames` or `ColumnWildcard` is required.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnwildcard)
     */
    public fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

    /**
     * The name of the database for the table with columns resource.
     *
     * Unique to the Data Catalog. A database is a set of associated table definitions organized
     * into a logical group. You can Grant and Revoke database privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The name of the table resource.
     *
     * A table is a metadata definition that represents your data. You can Grant and Revoke table
     * privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A builder for [TableWithColumnsResourceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The identifier for the Data Catalog .
       * By default, it is the account ID of the caller.
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
      @JvmName("6f1f43739d2600a999078da5d18436656f7e2cc0f6858d1846400a1ae88d1945")
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
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty.builder()

      /**
       * @param catalogId The identifier for the Data Catalog .
       * By default, it is the account ID of the caller.
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
      @JvmName("6f1f43739d2600a999078da5d18436656f7e2cc0f6858d1846400a1ae88d1945")
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
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty,
    ) : CdkObject(cdkObject), TableWithColumnsResourceProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The list of column names for the table.
       *
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnnames)
       */
      override fun columnNames(): List<String> = unwrap(this).getColumnNames() ?: emptyList()

      /**
       * A wildcard specified by a `ColumnWildcard` object.
       *
       * At least one of `ColumnNames` or `ColumnWildcard` is required.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-columnwildcard)
       */
      override fun columnWildcard(): Any? = unwrap(this).getColumnWildcard()

      /**
       * The name of the database for the table with columns resource.
       *
       * Unique to the Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The name of the table resource.
       *
       * A table is a metadata definition that represents your data. You can Grant and Revoke table
       * privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewithcolumnsresource.html#cfn-lakeformation-permissions-tablewithcolumnsresource-name)
       */
      override fun name(): String? = unwrap(this).getName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableWithColumnsResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty):
          TableWithColumnsResourceProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TableWithColumnsResourceProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWithColumnsResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWithColumnsResourceProperty
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html)
   */
  public interface ColumnWildcardProperty {
    /**
     * Excludes column names.
     *
     * Any column with this name will be excluded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html#cfn-lakeformation-permissions-columnwildcard-excludedcolumnnames)
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
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty.builder()

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
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty,
    ) : CdkObject(cdkObject), ColumnWildcardProperty {
      /**
       * Excludes column names.
       *
       * Any column with this name will be excluded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-columnwildcard.html#cfn-lakeformation-permissions-columnwildcard-excludedcolumnnames)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty):
          ColumnWildcardProperty = CdkObjectWrappers.wrap(cdkObject) as? ColumnWildcardProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: ColumnWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.ColumnWildcardProperty
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
   * TableResourceProperty tableResourceProperty = TableResourceProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .name("name")
   * .tableWildcard(TableWildcardProperty.builder().build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html)
   */
  public interface TableResourceProperty {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, it is the account ID of the caller.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of the database for the table.
     *
     * Unique to a Data Catalog. A database is a set of associated table definitions organized into
     * a logical group. You can Grant and Revoke database privileges to a principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The name of the table.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * An empty object representing all tables under a database.
     *
     * If this field is specified instead of the `Name` field, all tables under `DatabaseName` will
     * have permission changes applied.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-tablewildcard)
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
       * @param tableWildcard An empty object representing all tables under a database.
       * If this field is specified instead of the `Name` field, all tables under `DatabaseName`
       * will have permission changes applied.
       */
      public fun tableWildcard(tableWildcard: IResolvable)

      /**
       * @param tableWildcard An empty object representing all tables under a database.
       * If this field is specified instead of the `Name` field, all tables under `DatabaseName`
       * will have permission changes applied.
       */
      public fun tableWildcard(tableWildcard: TableWildcardProperty)

      /**
       * @param tableWildcard An empty object representing all tables under a database.
       * If this field is specified instead of the `Name` field, all tables under `DatabaseName`
       * will have permission changes applied.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328be344fd6ec36d119d60130993428b05c5bd2d30fb548e31653bcdcdff9f9d")
      public fun tableWildcard(tableWildcard: TableWildcardProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty.builder()

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
       * @param tableWildcard An empty object representing all tables under a database.
       * If this field is specified instead of the `Name` field, all tables under `DatabaseName`
       * will have permission changes applied.
       */
      override fun tableWildcard(tableWildcard: IResolvable) {
        cdkBuilder.tableWildcard(tableWildcard.let(IResolvable::unwrap))
      }

      /**
       * @param tableWildcard An empty object representing all tables under a database.
       * If this field is specified instead of the `Name` field, all tables under `DatabaseName`
       * will have permission changes applied.
       */
      override fun tableWildcard(tableWildcard: TableWildcardProperty) {
        cdkBuilder.tableWildcard(tableWildcard.let(TableWildcardProperty::unwrap))
      }

      /**
       * @param tableWildcard An empty object representing all tables under a database.
       * If this field is specified instead of the `Name` field, all tables under `DatabaseName`
       * will have permission changes applied.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("328be344fd6ec36d119d60130993428b05c5bd2d30fb548e31653bcdcdff9f9d")
      override fun tableWildcard(tableWildcard: TableWildcardProperty.Builder.() -> Unit): Unit =
          tableWildcard(TableWildcardProperty(tableWildcard))

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty,
    ) : CdkObject(cdkObject), TableResourceProperty {
      /**
       * The identifier for the Data Catalog .
       *
       * By default, it is the account ID of the caller.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of the database for the table.
       *
       * Unique to a Data Catalog. A database is a set of associated table definitions organized
       * into a logical group. You can Grant and Revoke database privileges to a principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The name of the table.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * An empty object representing all tables under a database.
       *
       * If this field is specified instead of the `Name` field, all tables under `DatabaseName`
       * will have permission changes applied.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tableresource.html#cfn-lakeformation-permissions-tableresource-tablewildcard)
       */
      override fun tableWildcard(): Any? = unwrap(this).getTableWildcard()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableResourceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty):
          TableResourceProperty = CdkObjectWrappers.wrap(cdkObject) as? TableResourceProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableResourceProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableResourceProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.lakeformation.*;
   * TableWildcardProperty tableWildcardProperty = TableWildcardProperty.builder().build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-tablewildcard.html)
   */
  public interface TableWildcardProperty {
    /**
     * A builder for [TableWildcardProperty]
     */
    @CdkDslMarker
    public interface Builder

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty.builder()

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty,
    ) : CdkObject(cdkObject), TableWildcardProperty

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TableWildcardProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty):
          TableWildcardProperty = CdkObjectWrappers.wrap(cdkObject) as? TableWildcardProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TableWildcardProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.TableWildcardProperty
    }
  }

  /**
   * The Lake Formation principal.
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html)
   */
  public interface DataLakePrincipalProperty {
    /**
     * An identifier for the Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html#cfn-lakeformation-permissions-datalakeprincipal-datalakeprincipalidentifier)
     */
    public fun dataLakePrincipalIdentifier(): String? =
        unwrap(this).getDataLakePrincipalIdentifier()

    /**
     * A builder for [DataLakePrincipalProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataLakePrincipalIdentifier An identifier for the Lake Formation principal.
       */
      public fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty.Builder
          =
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty.builder()

      /**
       * @param dataLakePrincipalIdentifier An identifier for the Lake Formation principal.
       */
      override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build():
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty,
    ) : CdkObject(cdkObject), DataLakePrincipalProperty {
      /**
       * An identifier for the Lake Formation principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lakeformation-permissions-datalakeprincipal.html#cfn-lakeformation-permissions-datalakeprincipal-datalakeprincipalidentifier)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty):
          DataLakePrincipalProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataLakePrincipalProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lakeformation.CfnPermissions.DataLakePrincipalProperty
    }
  }
}
