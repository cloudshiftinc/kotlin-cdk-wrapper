@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnDatabaseProps

/**
 * Properties for defining a `CfnDatabase`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.lightsail.*;
 * CfnDatabaseProps cfnDatabaseProps = CfnDatabaseProps.builder()
 * .masterDatabaseName("masterDatabaseName")
 * .masterUsername("masterUsername")
 * .relationalDatabaseBlueprintId("relationalDatabaseBlueprintId")
 * .relationalDatabaseBundleId("relationalDatabaseBundleId")
 * .relationalDatabaseName("relationalDatabaseName")
 * // the properties below are optional
 * .availabilityZone("availabilityZone")
 * .backupRetention(false)
 * .caCertificateIdentifier("caCertificateIdentifier")
 * .masterUserPassword("masterUserPassword")
 * .preferredBackupWindow("preferredBackupWindow")
 * .preferredMaintenanceWindow("preferredMaintenanceWindow")
 * .publiclyAccessible(false)
 * .relationalDatabaseParameters(List.of(RelationalDatabaseParameterProperty.builder()
 * .allowedValues("allowedValues")
 * .applyMethod("applyMethod")
 * .applyType("applyType")
 * .dataType("dataType")
 * .description("description")
 * .isModifiable(false)
 * .parameterName("parameterName")
 * .parameterValue("parameterValue")
 * .build()))
 * .rotateMasterUserPassword(false)
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html)
 */
@CdkDslMarker
public class CfnDatabasePropsDsl {
  private val cdkBuilder: CfnDatabaseProps.Builder = CfnDatabaseProps.builder()

  private val _relationalDatabaseParameters: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param availabilityZone The Availability Zone for the database.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param backupRetention A Boolean value indicating whether automated backup retention is enabled
   * for the database.
   */
  public fun backupRetention(backupRetention: Boolean) {
    cdkBuilder.backupRetention(backupRetention)
  }

  /**
   * @param backupRetention A Boolean value indicating whether automated backup retention is enabled
   * for the database.
   */
  public fun backupRetention(backupRetention: IResolvable) {
    cdkBuilder.backupRetention(backupRetention)
  }

  /**
   * @param caCertificateIdentifier The certificate associated with the database.
   */
  public fun caCertificateIdentifier(caCertificateIdentifier: String) {
    cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
  }

  /**
   * @param masterDatabaseName The meaning of this parameter differs according to the database
   * engine you use. 
   * *MySQL*
   *
   * The name of the database to create when the Lightsail database resource is created. If this
   * parameter isn't specified, no database is created in the database resource.
   *
   * Constraints:
   *
   * * Must contain 1-64 letters or numbers.
   * * Must begin with a letter. Subsequent characters can be letters, underscores, or numbers
   * (0-9).
   * * Can't be a word reserved by the specified database engine.
   *
   * For more information about reserved words in MySQL, see the Keywords and Reserved Words
   * articles for [MySQL
   * 5.6](https://docs.aws.amazon.com/https://dev.mysql.com/doc/refman/5.6/en/keywords.html) , [MySQL
   * 5.7](https://docs.aws.amazon.com/https://dev.mysql.com/doc/refman/5.7/en/keywords.html) , and
   * [MySQL 8.0](https://docs.aws.amazon.com/https://dev.mysql.com/doc/refman/8.0/en/keywords.html) .
   *
   * *PostgreSQL*
   *
   * The name of the database to create when the Lightsail database resource is created. If this
   * parameter isn't specified, a database named `postgres` is created in the database resource.
   *
   * Constraints:
   *
   * * Must contain 1-63 letters or numbers.
   * * Must begin with a letter. Subsequent characters can be letters, underscores, or numbers
   * (0-9).
   * * Can't be a word reserved by the specified database engine.
   *
   * For more information about reserved words in PostgreSQL, see the SQL Key Words articles for
   * [PostgreSQL
   * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html) ,
   * [PostgreSQL
   * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
   * [PostgreSQL
   * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
   * and [PostgreSQL
   * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
   */
  public fun masterDatabaseName(masterDatabaseName: String) {
    cdkBuilder.masterDatabaseName(masterDatabaseName)
  }

  /**
   * @param masterUserPassword The password for the primary user of the database.
   * The password can include any printable ASCII character except the following: /, ", or
   */
  public fun masterUserPassword(masterUserPassword: String) {
    cdkBuilder.masterUserPassword(masterUserPassword)
  }

  /**
   * @param masterUsername The name for the primary user. 
   * *MySQL*
   *
   * Constraints:
   *
   * * Required for MySQL.
   * * Must be 1-16 letters or numbers. Can contain underscores.
   * * First character must be a letter.
   * * Can't be a reserved word for the chosen database engine.
   *
   * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved
   * Words articles for [MySQL
   * 5.6](https://docs.aws.amazon.com/https://dev.mysql.com/doc/refman/5.6/en/keywords.html) , [MySQL
   * 5.7](https://docs.aws.amazon.com/https://dev.mysql.com/doc/refman/5.7/en/keywords.html) , or
   * [MySQL 8.0](https://docs.aws.amazon.com/https://dev.mysql.com/doc/refman/8.0/en/keywords.html) .
   *
   * *PostgreSQL*
   *
   * Constraints:
   *
   * * Required for PostgreSQL.
   * * Must be 1-63 letters or numbers. Can contain underscores.
   * * First character must be a letter.
   * * Can't be a reserved word for the chosen database engine.
   *
   * For more information about reserved words in MySQL 5.6 or 5.7, see the Keywords and Reserved
   * Words articles for [PostgreSQL
   * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html) ,
   * [PostgreSQL
   * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
   * [PostgreSQL
   * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
   * and [PostgreSQL
   * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
   */
  public fun masterUsername(masterUsername: String) {
    cdkBuilder.masterUsername(masterUsername)
  }

  /**
   * @param preferredBackupWindow The daily time range during which automated backups are created
   * for the database (for example, `16:00-16:30` ).
   */
  public fun preferredBackupWindow(preferredBackupWindow: String) {
    cdkBuilder.preferredBackupWindow(preferredBackupWindow)
  }

  /**
   * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
   * occur for the database, formatted as follows: `ddd:hh24:mi-ddd:hh24:mi` .
   * For example, `Tue:17:00-Tue:17:30` .
   */
  public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
    cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
  }

  /**
   * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
   * anyone on the internet.
   */
  public fun publiclyAccessible(publiclyAccessible: Boolean) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
   * anyone on the internet.
   */
  public fun publiclyAccessible(publiclyAccessible: IResolvable) {
    cdkBuilder.publiclyAccessible(publiclyAccessible)
  }

  /**
   * @param relationalDatabaseBlueprintId The blueprint ID for the database (for example,
   * `mysql_8_0` ). 
   */
  public fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String) {
    cdkBuilder.relationalDatabaseBlueprintId(relationalDatabaseBlueprintId)
  }

  /**
   * @param relationalDatabaseBundleId The bundle ID for the database (for example, `medium_1_0` ). 
   */
  public fun relationalDatabaseBundleId(relationalDatabaseBundleId: String) {
    cdkBuilder.relationalDatabaseBundleId(relationalDatabaseBundleId)
  }

  /**
   * @param relationalDatabaseName The name of the instance. 
   */
  public fun relationalDatabaseName(relationalDatabaseName: String) {
    cdkBuilder.relationalDatabaseName(relationalDatabaseName)
  }

  /**
   * @param relationalDatabaseParameters An array of parameters for the database.
   */
  public fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any) {
    _relationalDatabaseParameters.addAll(listOf(*relationalDatabaseParameters))
  }

  /**
   * @param relationalDatabaseParameters An array of parameters for the database.
   */
  public fun relationalDatabaseParameters(relationalDatabaseParameters: Collection<Any>) {
    _relationalDatabaseParameters.addAll(relationalDatabaseParameters)
  }

  /**
   * @param relationalDatabaseParameters An array of parameters for the database.
   */
  public fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable) {
    cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters)
  }

  /**
   * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
   * password to a new, strong password generated by Lightsail .
   *
   * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
   * the same template.
   */
  public fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean) {
    cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
  }

  /**
   * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
   * password to a new, strong password generated by Lightsail .
   *
   * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
   * the same template.
   */
  public fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable) {
    cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDatabaseProps {
    if(_relationalDatabaseParameters.isNotEmpty())
        cdkBuilder.relationalDatabaseParameters(_relationalDatabaseParameters)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
