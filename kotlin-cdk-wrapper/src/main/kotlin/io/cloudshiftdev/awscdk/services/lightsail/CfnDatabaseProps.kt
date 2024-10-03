@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDatabase`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.lightsail.*;
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
public interface CfnDatabaseProps {
  /**
   * The Availability Zone for the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-availabilityzone)
   */
  public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * A Boolean value indicating whether automated backup retention is enabled for the database.
   *
   * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
   * `BackupRetention` is set to `true` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-backupretention)
   */
  public fun backupRetention(): Any? = unwrap(this).getBackupRetention()

  /**
   * The certificate associated with the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-cacertificateidentifier)
   */
  public fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  /**
   * The meaning of this parameter differs according to the database engine you use.
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masterdatabasename)
   */
  public fun masterDatabaseName(): String

  /**
   * The password for the primary user of the database.
   *
   * The password can include any printable ASCII character except the following: /, ", or
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masteruserpassword)
   */
  public fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The name for the primary user.
   *
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
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masterusername)
   */
  public fun masterUsername(): String

  /**
   * The daily time range during which automated backups are created for the database (for example,
   * `16:00-16:30` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredbackupwindow)
   */
  public fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The weekly time range during which system maintenance can occur for the database, formatted as
   * follows: `ddd:hh24:mi-ddd:hh24:mi` .
   *
   * For example, `Tue:17:00-Tue:17:30` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredmaintenancewindow)
   */
  public fun preferredMaintenanceWindow(): String? = unwrap(this).getPreferredMaintenanceWindow()

  /**
   * A Boolean value indicating whether the database is accessible to anyone on the internet.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-publiclyaccessible)
   */
  public fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * The blueprint ID for the database (for example, `mysql_8_0` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseblueprintid)
   */
  public fun relationalDatabaseBlueprintId(): String

  /**
   * The bundle ID for the database (for example, `medium_1_0` ).
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasebundleid)
   */
  public fun relationalDatabaseBundleId(): String

  /**
   * The name of the instance.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasename)
   */
  public fun relationalDatabaseName(): String

  /**
   * An array of parameters for the database.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
   */
  public fun relationalDatabaseParameters(): Any? = unwrap(this).getRelationalDatabaseParameters()

  /**
   * A Boolean value indicating whether to change the primary user password to a new, strong
   * password generated by Lightsail .
   *
   *
   * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
   * the same template.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-rotatemasteruserpassword)
   */
  public fun rotateMasterUserPassword(): Any? = unwrap(this).getRotateMasterUserPassword()

  /**
   * An array of key-value pairs to apply to this resource.
   *
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDatabaseProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param availabilityZone The Availability Zone for the database.
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database.
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     */
    public fun backupRetention(backupRetention: Boolean)

    /**
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database.
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     */
    public fun backupRetention(backupRetention: IResolvable)

    /**
     * @param caCertificateIdentifier The certificate associated with the database.
     */
    public fun caCertificateIdentifier(caCertificateIdentifier: String)

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
     * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html)
     * , [PostgreSQL
     * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
     * [PostgreSQL
     * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
     * and [PostgreSQL
     * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
     */
    public fun masterDatabaseName(masterDatabaseName: String)

    /**
     * @param masterUserPassword The password for the primary user of the database.
     * The password can include any printable ASCII character except the following: /, ", or
     */
    public fun masterUserPassword(masterUserPassword: String)

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
     * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html)
     * , [PostgreSQL
     * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
     * [PostgreSQL
     * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
     * and [PostgreSQL
     * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
     */
    public fun masterUsername(masterUsername: String)

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * for the database (for example, `16:00-16:30` ).
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur for the database, formatted as follows: `ddd:hh24:mi-ddd:hh24:mi` .
     * For example, `Tue:17:00-Tue:17:30` .
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet.
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet.
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * @param relationalDatabaseBlueprintId The blueprint ID for the database (for example,
     * `mysql_8_0` ). 
     */
    public fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String)

    /**
     * @param relationalDatabaseBundleId The bundle ID for the database (for example, `medium_1_0`
     * ). 
     */
    public fun relationalDatabaseBundleId(relationalDatabaseBundleId: String)

    /**
     * @param relationalDatabaseName The name of the instance. 
     */
    public fun relationalDatabaseName(relationalDatabaseName: String)

    /**
     * @param relationalDatabaseParameters An array of parameters for the database.
     */
    public fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable)

    /**
     * @param relationalDatabaseParameters An array of parameters for the database.
     */
    public fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>)

    /**
     * @param relationalDatabaseParameters An array of parameters for the database.
     */
    public fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any)

    /**
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail .
     *
     * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
     * the same template.
     */
    public fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean)

    /**
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail .
     *
     * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
     * the same template.
     */
    public fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs to apply to this resource.
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDatabaseProps.Builder =
        software.amazon.awscdk.services.lightsail.CfnDatabaseProps.builder()

    /**
     * @param availabilityZone The Availability Zone for the database.
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database.
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     */
    override fun backupRetention(backupRetention: Boolean) {
      cdkBuilder.backupRetention(backupRetention)
    }

    /**
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database.
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     */
    override fun backupRetention(backupRetention: IResolvable) {
      cdkBuilder.backupRetention(backupRetention.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param caCertificateIdentifier The certificate associated with the database.
     */
    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
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
     * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html)
     * , [PostgreSQL
     * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
     * [PostgreSQL
     * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
     * and [PostgreSQL
     * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
     */
    override fun masterDatabaseName(masterDatabaseName: String) {
      cdkBuilder.masterDatabaseName(masterDatabaseName)
    }

    /**
     * @param masterUserPassword The password for the primary user of the database.
     * The password can include any printable ASCII character except the following: /, ", or
     */
    override fun masterUserPassword(masterUserPassword: String) {
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
     * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html)
     * , [PostgreSQL
     * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
     * [PostgreSQL
     * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
     * and [PostgreSQL
     * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * for the database (for example, `16:00-16:30` ).
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur for the database, formatted as follows: `ddd:hh24:mi-ddd:hh24:mi` .
     * For example, `Tue:17:00-Tue:17:30` .
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet.
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet.
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param relationalDatabaseBlueprintId The blueprint ID for the database (for example,
     * `mysql_8_0` ). 
     */
    override fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String) {
      cdkBuilder.relationalDatabaseBlueprintId(relationalDatabaseBlueprintId)
    }

    /**
     * @param relationalDatabaseBundleId The bundle ID for the database (for example, `medium_1_0`
     * ). 
     */
    override fun relationalDatabaseBundleId(relationalDatabaseBundleId: String) {
      cdkBuilder.relationalDatabaseBundleId(relationalDatabaseBundleId)
    }

    /**
     * @param relationalDatabaseName The name of the instance. 
     */
    override fun relationalDatabaseName(relationalDatabaseName: String) {
      cdkBuilder.relationalDatabaseName(relationalDatabaseName)
    }

    /**
     * @param relationalDatabaseParameters An array of parameters for the database.
     */
    override fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param relationalDatabaseParameters An array of parameters for the database.
     */
    override fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param relationalDatabaseParameters An array of parameters for the database.
     */
    override fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any): Unit =
        relationalDatabaseParameters(relationalDatabaseParameters.toList())

    /**
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail .
     *
     * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
     * the same template.
     */
    override fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
    }

    /**
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail .
     *
     * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
     * the same template.
     */
    override fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword.let(IResolvable.Companion::unwrap))
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
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
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
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDatabaseProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabaseProps,
  ) : CdkObject(cdkObject),
      CfnDatabaseProps {
    /**
     * The Availability Zone for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-availabilityzone)
     */
    override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     *
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-backupretention)
     */
    override fun backupRetention(): Any? = unwrap(this).getBackupRetention()

    /**
     * The certificate associated with the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-cacertificateidentifier)
     */
    override fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

    /**
     * The meaning of this parameter differs according to the database engine you use.
     *
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
     * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html)
     * , [PostgreSQL
     * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
     * [PostgreSQL
     * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
     * and [PostgreSQL
     * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masterdatabasename)
     */
    override fun masterDatabaseName(): String = unwrap(this).getMasterDatabaseName()

    /**
     * The password for the primary user of the database.
     *
     * The password can include any printable ASCII character except the following: /, ", or
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masteruserpassword)
     */
    override fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

    /**
     * The name for the primary user.
     *
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
     * 9.6](https://docs.aws.amazon.com/https://www.postgresql.org/docs/9.6/sql-keywords-appendix.html)
     * , [PostgreSQL
     * 10](https://docs.aws.amazon.com/https://www.postgresql.org/docs/10/sql-keywords-appendix.html) ,
     * [PostgreSQL
     * 11](https://docs.aws.amazon.com/https://www.postgresql.org/docs/11/sql-keywords-appendix.html) ,
     * and [PostgreSQL
     * 12](https://docs.aws.amazon.com/https://www.postgresql.org/docs/12/sql-keywords-appendix.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masterusername)
     */
    override fun masterUsername(): String = unwrap(this).getMasterUsername()

    /**
     * The daily time range during which automated backups are created for the database (for
     * example, `16:00-16:30` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredbackupwindow)
     */
    override fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

    /**
     * The weekly time range during which system maintenance can occur for the database, formatted
     * as follows: `ddd:hh24:mi-ddd:hh24:mi` .
     *
     * For example, `Tue:17:00-Tue:17:30` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredmaintenancewindow)
     */
    override fun preferredMaintenanceWindow(): String? =
        unwrap(this).getPreferredMaintenanceWindow()

    /**
     * A Boolean value indicating whether the database is accessible to anyone on the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-publiclyaccessible)
     */
    override fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

    /**
     * The blueprint ID for the database (for example, `mysql_8_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseblueprintid)
     */
    override fun relationalDatabaseBlueprintId(): String =
        unwrap(this).getRelationalDatabaseBlueprintId()

    /**
     * The bundle ID for the database (for example, `medium_1_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasebundleid)
     */
    override fun relationalDatabaseBundleId(): String = unwrap(this).getRelationalDatabaseBundleId()

    /**
     * The name of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasename)
     */
    override fun relationalDatabaseName(): String = unwrap(this).getRelationalDatabaseName()

    /**
     * An array of parameters for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
     */
    override fun relationalDatabaseParameters(): Any? =
        unwrap(this).getRelationalDatabaseParameters()

    /**
     * A Boolean value indicating whether to change the primary user password to a new, strong
     * password generated by Lightsail .
     *
     *
     * The `RotateMasterUserPassword` and `MasterUserPassword` parameters cannot be used together in
     * the same template.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-rotatemasteruserpassword)
     */
    override fun rotateMasterUserPassword(): Any? = unwrap(this).getRotateMasterUserPassword()

    /**
     * An array of key-value pairs to apply to this resource.
     *
     * For more information, see
     * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
     * in the *AWS CloudFormation User Guide* .
     *
     *
     * The `Value` of `Tags` is optional for Lightsail resources.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatabaseProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabaseProps):
        CfnDatabaseProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDatabaseProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatabaseProps):
        software.amazon.awscdk.services.lightsail.CfnDatabaseProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.lightsail.CfnDatabaseProps
  }
}
