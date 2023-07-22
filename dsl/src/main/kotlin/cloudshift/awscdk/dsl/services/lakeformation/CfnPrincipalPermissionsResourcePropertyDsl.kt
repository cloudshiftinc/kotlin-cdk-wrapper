@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lakeformation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lakeformation.CfnPrincipalPermissions

/**
 * A structure for the resource.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lakeformation.*;
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
@CdkDslMarker
public class CfnPrincipalPermissionsResourcePropertyDsl {
  private val cdkBuilder: CfnPrincipalPermissions.ResourceProperty.Builder =
      CfnPrincipalPermissions.ResourceProperty.builder()

  /**
   * @param catalog The identifier for the Data Catalog.
   * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
   * database definitions, table definitions, and other control information to manage your AWS Lake
   * Formation environment.
   */
  public fun catalog(catalog: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(catalog)
    cdkBuilder.catalog(builder.map)
  }

  /**
   * @param catalog The identifier for the Data Catalog.
   * By default, the account ID. The Data Catalog is the persistent metadata store. It contains
   * database definitions, table definitions, and other control information to manage your AWS Lake
   * Formation environment.
   */
  public fun catalog(catalog: Any) {
    cdkBuilder.catalog(catalog)
  }

  /**
   * @param dataCellsFilter A data cell filter.
   */
  public fun dataCellsFilter(dataCellsFilter: IResolvable) {
    cdkBuilder.dataCellsFilter(dataCellsFilter)
  }

  /**
   * @param dataCellsFilter A data cell filter.
   */
  public
      fun dataCellsFilter(dataCellsFilter: CfnPrincipalPermissions.DataCellsFilterResourceProperty) {
    cdkBuilder.dataCellsFilter(dataCellsFilter)
  }

  /**
   * @param dataLocation The location of an Amazon S3 path where permissions are granted or revoked.
   */
  public fun dataLocation(dataLocation: IResolvable) {
    cdkBuilder.dataLocation(dataLocation)
  }

  /**
   * @param dataLocation The location of an Amazon S3 path where permissions are granted or revoked.
   */
  public fun dataLocation(dataLocation: CfnPrincipalPermissions.DataLocationResourceProperty) {
    cdkBuilder.dataLocation(dataLocation)
  }

  /**
   * @param database The database for the resource.
   * Unique to the Data Catalog. A database is a set of associated table definitions organized into
   * a logical group. You can Grant and Revoke database permissions to a principal.
   */
  public fun database(database: IResolvable) {
    cdkBuilder.database(database)
  }

  /**
   * @param database The database for the resource.
   * Unique to the Data Catalog. A database is a set of associated table definitions organized into
   * a logical group. You can Grant and Revoke database permissions to a principal.
   */
  public fun database(database: CfnPrincipalPermissions.DatabaseResourceProperty) {
    cdkBuilder.database(database)
  }

  /**
   * @param lfTag The LF-tag key and values attached to a resource.
   */
  public fun lfTag(lfTag: IResolvable) {
    cdkBuilder.lfTag(lfTag)
  }

  /**
   * @param lfTag The LF-tag key and values attached to a resource.
   */
  public fun lfTag(lfTag: CfnPrincipalPermissions.LFTagKeyResourceProperty) {
    cdkBuilder.lfTag(lfTag)
  }

  /**
   * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
   */
  public fun lfTagPolicy(lfTagPolicy: IResolvable) {
    cdkBuilder.lfTagPolicy(lfTagPolicy)
  }

  /**
   * @param lfTagPolicy A list of LF-tag conditions that define a resource's LF-tag policy.
   */
  public fun lfTagPolicy(lfTagPolicy: CfnPrincipalPermissions.LFTagPolicyResourceProperty) {
    cdkBuilder.lfTagPolicy(lfTagPolicy)
  }

  /**
   * @param table The table for the resource.
   * A table is a metadata definition that represents your data. You can Grant and Revoke table
   * privileges to a principal.
   */
  public fun table(table: IResolvable) {
    cdkBuilder.table(table)
  }

  /**
   * @param table The table for the resource.
   * A table is a metadata definition that represents your data. You can Grant and Revoke table
   * privileges to a principal.
   */
  public fun table(table: CfnPrincipalPermissions.TableResourceProperty) {
    cdkBuilder.table(table)
  }

  /**
   * @param tableWithColumns The table with columns for the resource.
   * A principal with permissions to this resource can select metadata from the columns of a table
   * in the Data Catalog and the underlying data in Amazon S3.
   */
  public fun tableWithColumns(tableWithColumns: IResolvable) {
    cdkBuilder.tableWithColumns(tableWithColumns)
  }

  /**
   * @param tableWithColumns The table with columns for the resource.
   * A principal with permissions to this resource can select metadata from the columns of a table
   * in the Data Catalog and the underlying data in Amazon S3.
   */
  public
      fun tableWithColumns(tableWithColumns: CfnPrincipalPermissions.TableWithColumnsResourceProperty) {
    cdkBuilder.tableWithColumns(tableWithColumns)
  }

  public fun build(): CfnPrincipalPermissions.ResourceProperty = cdkBuilder.build()
}
