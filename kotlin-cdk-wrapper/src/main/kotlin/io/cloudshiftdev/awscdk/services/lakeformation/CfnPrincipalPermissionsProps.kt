@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPrincipalPermissions`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lakeformation.*;
 * Object catalog;
 * Object tableWildcard;
 * CfnPrincipalPermissionsProps cfnPrincipalPermissionsProps =
 * CfnPrincipalPermissionsProps.builder()
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
public interface CfnPrincipalPermissionsProps {
  /**
   * The identifier for the Data Catalog .
   *
   * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
   * database definitions, table definitions, and other control information to manage your Lake
   * Formation environment.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-catalog)
   */
  public fun catalog(): String? = unwrap(this).getCatalog()

  /**
   * The permissions granted or revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
   */
  public fun permissions(): List<String>

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
   */
  public fun permissionsWithGrantOption(): List<String>

  /**
   * The principal to be granted a permission.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
   */
  public fun principal(): Any

  /**
   * The resource to be granted or revoked permissions.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
   */
  public fun resource(): Any

  /**
   * A builder for [CfnPrincipalPermissionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param catalog The identifier for the Data Catalog .
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     */
    public fun catalog(catalog: String)

    /**
     * @param permissions The permissions granted or revoked. 
     */
    public fun permissions(permissions: List<String>)

    /**
     * @param permissions The permissions granted or revoked. 
     */
    public fun permissions(vararg permissions: String)

    /**
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    public fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>)

    /**
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    public fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String)

    /**
     * @param principal The principal to be granted a permission. 
     */
    public fun principal(principal: IResolvable)

    /**
     * @param principal The principal to be granted a permission. 
     */
    public fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty)

    /**
     * @param principal The principal to be granted a permission. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de0007850ae99f716679bc6b480df1bbc86f3dfdd41ef634cd4d93d29bfad61")
    public
        fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty.Builder.() -> Unit)

    /**
     * @param resource The resource to be granted or revoked permissions. 
     */
    public fun resource(resource: IResolvable)

    /**
     * @param resource The resource to be granted or revoked permissions. 
     */
    public fun resource(resource: CfnPrincipalPermissions.ResourceProperty)

    /**
     * @param resource The resource to be granted or revoked permissions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("208e6895ae69550da7d3de0401c3035667c7aaeeb3feaff03ac7e60b0ddc162a")
    public fun resource(resource: CfnPrincipalPermissions.ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps.builder()

    /**
     * @param catalog The identifier for the Data Catalog .
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     */
    override fun catalog(catalog: String) {
      cdkBuilder.catalog(catalog)
    }

    /**
     * @param permissions The permissions granted or revoked. 
     */
    override fun permissions(permissions: List<String>) {
      cdkBuilder.permissions(permissions)
    }

    /**
     * @param permissions The permissions granted or revoked. 
     */
    override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

    /**
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    override fun permissionsWithGrantOption(permissionsWithGrantOption: List<String>) {
      cdkBuilder.permissionsWithGrantOption(permissionsWithGrantOption)
    }

    /**
     * @param permissionsWithGrantOption Indicates the ability to grant permissions (as a subset of
     * permissions granted). 
     */
    override fun permissionsWithGrantOption(vararg permissionsWithGrantOption: String): Unit =
        permissionsWithGrantOption(permissionsWithGrantOption.toList())

    /**
     * @param principal The principal to be granted a permission. 
     */
    override fun principal(principal: IResolvable) {
      cdkBuilder.principal(principal.let(IResolvable::unwrap))
    }

    /**
     * @param principal The principal to be granted a permission. 
     */
    override fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty) {
      cdkBuilder.principal(principal.let(CfnPrincipalPermissions.DataLakePrincipalProperty::unwrap))
    }

    /**
     * @param principal The principal to be granted a permission. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7de0007850ae99f716679bc6b480df1bbc86f3dfdd41ef634cd4d93d29bfad61")
    override
        fun principal(principal: CfnPrincipalPermissions.DataLakePrincipalProperty.Builder.() -> Unit):
        Unit = principal(CfnPrincipalPermissions.DataLakePrincipalProperty(principal))

    /**
     * @param resource The resource to be granted or revoked permissions. 
     */
    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    /**
     * @param resource The resource to be granted or revoked permissions. 
     */
    override fun resource(resource: CfnPrincipalPermissions.ResourceProperty) {
      cdkBuilder.resource(resource.let(CfnPrincipalPermissions.ResourceProperty::unwrap))
    }

    /**
     * @param resource The resource to be granted or revoked permissions. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("208e6895ae69550da7d3de0401c3035667c7aaeeb3feaff03ac7e60b0ddc162a")
    override fun resource(resource: CfnPrincipalPermissions.ResourceProperty.Builder.() -> Unit):
        Unit = resource(CfnPrincipalPermissions.ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps,
  ) : CdkObject(cdkObject), CfnPrincipalPermissionsProps {
    /**
     * The identifier for the Data Catalog .
     *
     * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
     * database definitions, table definitions, and other control information to manage your Lake
     * Formation environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-catalog)
     */
    override fun catalog(): String? = unwrap(this).getCatalog()

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissions)
     */
    override fun permissions(): List<String> = unwrap(this).getPermissions()

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-permissionswithgrantoption)
     */
    override fun permissionsWithGrantOption(): List<String> =
        unwrap(this).getPermissionsWithGrantOption()

    /**
     * The principal to be granted a permission.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-principal)
     */
    override fun principal(): Any = unwrap(this).getPrincipal()

    /**
     * The resource to be granted or revoked permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-principalpermissions.html#cfn-lakeformation-principalpermissions-resource)
     */
    override fun resource(): Any = unwrap(this).getResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPrincipalPermissionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps):
        CfnPrincipalPermissionsProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPrincipalPermissionsProps):
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissionsProps
  }
}
