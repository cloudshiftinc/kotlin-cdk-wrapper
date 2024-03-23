@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lakeformation

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnPermissions`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lakeformation.*;
 * CfnPermissionsProps cfnPermissionsProps = CfnPermissionsProps.builder()
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
public interface CfnPermissionsProps {
  /**
   * The AWS Lake Formation principal.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
   */
  public fun dataLakePrincipal(): Any

  /**
   * The permissions granted or revoked.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
   */
  public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

  /**
   * Indicates the ability to grant permissions (as a subset of permissions granted).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
   */
  public fun permissionsWithGrantOption(): List<String> =
      unwrap(this).getPermissionsWithGrantOption() ?: emptyList()

  /**
   * A structure for the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
   */
  public fun resource(): Any

  /**
   * A builder for [CfnPermissionsProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    public fun dataLakePrincipal(dataLakePrincipal: IResolvable)

    /**
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    public fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty)

    /**
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f8856ba34bd002f5d6dccea2e5741252ca023dad6e6bb1527a99948a5d7ea9")
    public
        fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty.Builder.() -> Unit)

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
     * @param resource A structure for the resource. 
     */
    public fun resource(resource: IResolvable)

    /**
     * @param resource A structure for the resource. 
     */
    public fun resource(resource: CfnPermissions.ResourceProperty)

    /**
     * @param resource A structure for the resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7081d32c97e383618c1b8abd8c4109155007e47ca72a313141859e4b37ee870f")
    public fun resource(resource: CfnPermissions.ResourceProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.lakeformation.CfnPermissionsProps.Builder =
        software.amazon.awscdk.services.lakeformation.CfnPermissionsProps.builder()

    /**
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    override fun dataLakePrincipal(dataLakePrincipal: IResolvable) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(IResolvable::unwrap))
    }

    /**
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    override fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty) {
      cdkBuilder.dataLakePrincipal(dataLakePrincipal.let(CfnPermissions.DataLakePrincipalProperty::unwrap))
    }

    /**
     * @param dataLakePrincipal The AWS Lake Formation principal. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f7f8856ba34bd002f5d6dccea2e5741252ca023dad6e6bb1527a99948a5d7ea9")
    override
        fun dataLakePrincipal(dataLakePrincipal: CfnPermissions.DataLakePrincipalProperty.Builder.() -> Unit):
        Unit = dataLakePrincipal(CfnPermissions.DataLakePrincipalProperty(dataLakePrincipal))

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
     * @param resource A structure for the resource. 
     */
    override fun resource(resource: IResolvable) {
      cdkBuilder.resource(resource.let(IResolvable::unwrap))
    }

    /**
     * @param resource A structure for the resource. 
     */
    override fun resource(resource: CfnPermissions.ResourceProperty) {
      cdkBuilder.resource(resource.let(CfnPermissions.ResourceProperty::unwrap))
    }

    /**
     * @param resource A structure for the resource. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7081d32c97e383618c1b8abd8c4109155007e47ca72a313141859e4b37ee870f")
    override fun resource(resource: CfnPermissions.ResourceProperty.Builder.() -> Unit): Unit =
        resource(CfnPermissions.ResourceProperty(resource))

    public fun build(): software.amazon.awscdk.services.lakeformation.CfnPermissionsProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissionsProps,
  ) : CdkObject(cdkObject), CfnPermissionsProps {
    /**
     * The AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-datalakeprincipal)
     */
    override fun dataLakePrincipal(): Any = unwrap(this).getDataLakePrincipal()

    /**
     * The permissions granted or revoked.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissions)
     */
    override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    /**
     * Indicates the ability to grant permissions (as a subset of permissions granted).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-permissionswithgrantoption)
     */
    override fun permissionsWithGrantOption(): List<String> =
        unwrap(this).getPermissionsWithGrantOption() ?: emptyList()

    /**
     * A structure for the resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lakeformation-permissions.html#cfn-lakeformation-permissions-resource)
     */
    override fun resource(): Any = unwrap(this).getResource()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnPermissionsProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lakeformation.CfnPermissionsProps):
        CfnPermissionsProps = CdkObjectWrappers.wrap(cdkObject) as? CfnPermissionsProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnPermissionsProps):
        software.amazon.awscdk.services.lakeformation.CfnPermissionsProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lakeformation.CfnPermissionsProps
  }
}
