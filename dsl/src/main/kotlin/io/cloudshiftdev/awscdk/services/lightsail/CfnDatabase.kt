package io.cloudshiftdev.awscdk.services.lightsail

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnDatabase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabase,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the database (for example,
   * `arn:aws:lightsail:us-east-2:123456789101:RelationalDatabase/244ad76f-8aad-4741-809f-12345EXAMPLE`
   * ).
   */
  public open fun attrDatabaseArn(): String = unwrap(this).getAttrDatabaseArn()

  /**
   * The Availability Zone for the database.
   */
  public open fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

  /**
   * The Availability Zone for the database.
   */
  public open fun availabilityZone(`value`: String) {
    unwrap(this).setAvailabilityZone(`value`)
  }

  /**
   * A Boolean value indicating whether automated backup retention is enabled for the database.
   */
  public open fun backupRetention(): Any? = unwrap(this).getBackupRetention()

  /**
   * A Boolean value indicating whether automated backup retention is enabled for the database.
   */
  public open fun backupRetention(`value`: Boolean) {
    unwrap(this).setBackupRetention(`value`)
  }

  /**
   * A Boolean value indicating whether automated backup retention is enabled for the database.
   */
  public open fun backupRetention(`value`: IResolvable) {
    unwrap(this).setBackupRetention(`value`.let(IResolvable::unwrap))
  }

  /**
   * The certificate associated with the database.
   */
  public open fun caCertificateIdentifier(): String? = unwrap(this).getCaCertificateIdentifier()

  /**
   * The certificate associated with the database.
   */
  public open fun caCertificateIdentifier(`value`: String) {
    unwrap(this).setCaCertificateIdentifier(`value`)
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
   * The meaning of this parameter differs according to the database engine you use.
   */
  public open fun masterDatabaseName(): String = unwrap(this).getMasterDatabaseName()

  /**
   * The meaning of this parameter differs according to the database engine you use.
   */
  public open fun masterDatabaseName(`value`: String) {
    unwrap(this).setMasterDatabaseName(`value`)
  }

  /**
   * The password for the primary user of the database.
   */
  public open fun masterUserPassword(): String? = unwrap(this).getMasterUserPassword()

  /**
   * The password for the primary user of the database.
   */
  public open fun masterUserPassword(`value`: String) {
    unwrap(this).setMasterUserPassword(`value`)
  }

  /**
   * The name for the primary user.
   */
  public open fun masterUsername(): String = unwrap(this).getMasterUsername()

  /**
   * The name for the primary user.
   */
  public open fun masterUsername(`value`: String) {
    unwrap(this).setMasterUsername(`value`)
  }

  /**
   * The daily time range during which automated backups are created for the database (for example,
   * `16:00-16:30` ).
   */
  public open fun preferredBackupWindow(): String? = unwrap(this).getPreferredBackupWindow()

  /**
   * The daily time range during which automated backups are created for the database (for example,
   * `16:00-16:30` ).
   */
  public open fun preferredBackupWindow(`value`: String) {
    unwrap(this).setPreferredBackupWindow(`value`)
  }

  /**
   * The weekly time range during which system maintenance can occur for the database, formatted as
   * follows: `ddd:hh24:mi-ddd:hh24:mi` .
   */
  public open fun preferredMaintenanceWindow(): String? =
      unwrap(this).getPreferredMaintenanceWindow()

  /**
   * The weekly time range during which system maintenance can occur for the database, formatted as
   * follows: `ddd:hh24:mi-ddd:hh24:mi` .
   */
  public open fun preferredMaintenanceWindow(`value`: String) {
    unwrap(this).setPreferredMaintenanceWindow(`value`)
  }

  /**
   * A Boolean value indicating whether the database is accessible to anyone on the internet.
   */
  public open fun publiclyAccessible(): Any? = unwrap(this).getPubliclyAccessible()

  /**
   * A Boolean value indicating whether the database is accessible to anyone on the internet.
   */
  public open fun publiclyAccessible(`value`: Boolean) {
    unwrap(this).setPubliclyAccessible(`value`)
  }

  /**
   * A Boolean value indicating whether the database is accessible to anyone on the internet.
   */
  public open fun publiclyAccessible(`value`: IResolvable) {
    unwrap(this).setPubliclyAccessible(`value`.let(IResolvable::unwrap))
  }

  /**
   * The blueprint ID for the database (for example, `mysql_8_0` ).
   */
  public open fun relationalDatabaseBlueprintId(): String =
      unwrap(this).getRelationalDatabaseBlueprintId()

  /**
   * The blueprint ID for the database (for example, `mysql_8_0` ).
   */
  public open fun relationalDatabaseBlueprintId(`value`: String) {
    unwrap(this).setRelationalDatabaseBlueprintId(`value`)
  }

  /**
   * The bundle ID for the database (for example, `medium_1_0` ).
   */
  public open fun relationalDatabaseBundleId(): String =
      unwrap(this).getRelationalDatabaseBundleId()

  /**
   * The bundle ID for the database (for example, `medium_1_0` ).
   */
  public open fun relationalDatabaseBundleId(`value`: String) {
    unwrap(this).setRelationalDatabaseBundleId(`value`)
  }

  /**
   * The name of the instance.
   */
  public open fun relationalDatabaseName(): String = unwrap(this).getRelationalDatabaseName()

  /**
   * The name of the instance.
   */
  public open fun relationalDatabaseName(`value`: String) {
    unwrap(this).setRelationalDatabaseName(`value`)
  }

  /**
   * An array of parameters for the database.
   */
  public open fun relationalDatabaseParameters(): Any? =
      unwrap(this).getRelationalDatabaseParameters()

  /**
   * An array of parameters for the database.
   */
  public open fun relationalDatabaseParameters(`value`: IResolvable) {
    unwrap(this).setRelationalDatabaseParameters(`value`.let(IResolvable::unwrap))
  }

  /**
   * An array of parameters for the database.
   */
  public open fun relationalDatabaseParameters(__idx_ac66f0: List<Any>) {
    unwrap(this).setRelationalDatabaseParameters(__idx_ac66f0)
  }

  /**
   * An array of parameters for the database.
   */
  public open fun relationalDatabaseParameters(vararg __idx_ac66f0: Any): Unit =
      relationalDatabaseParameters(__idx_ac66f0.toList())

  /**
   * A Boolean value indicating whether to change the primary user password to a new, strong
   * password generated by Lightsail .
   */
  public open fun rotateMasterUserPassword(): Any? = unwrap(this).getRotateMasterUserPassword()

  /**
   * A Boolean value indicating whether to change the primary user password to a new, strong
   * password generated by Lightsail .
   */
  public open fun rotateMasterUserPassword(`value`: Boolean) {
    unwrap(this).setRotateMasterUserPassword(`value`)
  }

  /**
   * A Boolean value indicating whether to change the primary user password to a new, strong
   * password generated by Lightsail .
   */
  public open fun rotateMasterUserPassword(`value`: IResolvable) {
    unwrap(this).setRotateMasterUserPassword(`value`.let(IResolvable::unwrap))
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs to apply to this resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.lightsail.CfnDatabase].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Availability Zone for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-availabilityzone)
     * @param availabilityZone The Availability Zone for the database. 
     */
    public fun availabilityZone(availabilityZone: String)

    /**
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     *
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-backupretention)
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database. 
     */
    public fun backupRetention(backupRetention: Boolean)

    /**
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     *
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-backupretention)
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database. 
     */
    public fun backupRetention(backupRetention: IResolvable)

    /**
     * The certificate associated with the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-cacertificateidentifier)
     * @param caCertificateIdentifier The certificate associated with the database. 
     */
    public fun caCertificateIdentifier(caCertificateIdentifier: String)

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
     * @param masterDatabaseName The meaning of this parameter differs according to the database
     * engine you use. 
     */
    public fun masterDatabaseName(masterDatabaseName: String)

    /**
     * The password for the primary user of the database.
     *
     * The password can include any printable ASCII character except the following: /, ", or
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masteruserpassword)
     * @param masterUserPassword The password for the primary user of the database. 
     */
    public fun masterUserPassword(masterUserPassword: String)

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
     * @param masterUsername The name for the primary user. 
     */
    public fun masterUsername(masterUsername: String)

    /**
     * The daily time range during which automated backups are created for the database (for
     * example, `16:00-16:30` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredbackupwindow)
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * for the database (for example, `16:00-16:30` ). 
     */
    public fun preferredBackupWindow(preferredBackupWindow: String)

    /**
     * The weekly time range during which system maintenance can occur for the database, formatted
     * as follows: `ddd:hh24:mi-ddd:hh24:mi` .
     *
     * For example, `Tue:17:00-Tue:17:30` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur for the database, formatted as follows: `ddd:hh24:mi-ddd:hh24:mi` . 
     */
    public fun preferredMaintenanceWindow(preferredMaintenanceWindow: String)

    /**
     * A Boolean value indicating whether the database is accessible to anyone on the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-publiclyaccessible)
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet. 
     */
    public fun publiclyAccessible(publiclyAccessible: Boolean)

    /**
     * A Boolean value indicating whether the database is accessible to anyone on the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-publiclyaccessible)
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet. 
     */
    public fun publiclyAccessible(publiclyAccessible: IResolvable)

    /**
     * The blueprint ID for the database (for example, `mysql_8_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseblueprintid)
     * @param relationalDatabaseBlueprintId The blueprint ID for the database (for example,
     * `mysql_8_0` ). 
     */
    public fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String)

    /**
     * The bundle ID for the database (for example, `medium_1_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasebundleid)
     * @param relationalDatabaseBundleId The bundle ID for the database (for example, `medium_1_0`
     * ). 
     */
    public fun relationalDatabaseBundleId(relationalDatabaseBundleId: String)

    /**
     * The name of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasename)
     * @param relationalDatabaseName The name of the instance. 
     */
    public fun relationalDatabaseName(relationalDatabaseName: String)

    /**
     * An array of parameters for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
     * @param relationalDatabaseParameters An array of parameters for the database. 
     */
    public fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable)

    /**
     * An array of parameters for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
     * @param relationalDatabaseParameters An array of parameters for the database. 
     */
    public fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>)

    /**
     * An array of parameters for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
     * @param relationalDatabaseParameters An array of parameters for the database. 
     */
    public fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any)

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
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail . 
     */
    public fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean)

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
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail . 
     */
    public fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable)

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(tags: List<CfnTag>)

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.lightsail.CfnDatabase.Builder =
        software.amazon.awscdk.services.lightsail.CfnDatabase.Builder.create(scope, id)

    /**
     * The Availability Zone for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-availabilityzone)
     * @param availabilityZone The Availability Zone for the database. 
     */
    override fun availabilityZone(availabilityZone: String) {
      cdkBuilder.availabilityZone(availabilityZone)
    }

    /**
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     *
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-backupretention)
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database. 
     */
    override fun backupRetention(backupRetention: Boolean) {
      cdkBuilder.backupRetention(backupRetention)
    }

    /**
     * A Boolean value indicating whether automated backup retention is enabled for the database.
     *
     * Data Import Mode is enabled when `BackupRetention` is set to `false` , and is disabled when
     * `BackupRetention` is set to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-backupretention)
     * @param backupRetention A Boolean value indicating whether automated backup retention is
     * enabled for the database. 
     */
    override fun backupRetention(backupRetention: IResolvable) {
      cdkBuilder.backupRetention(backupRetention.let(IResolvable::unwrap))
    }

    /**
     * The certificate associated with the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-cacertificateidentifier)
     * @param caCertificateIdentifier The certificate associated with the database. 
     */
    override fun caCertificateIdentifier(caCertificateIdentifier: String) {
      cdkBuilder.caCertificateIdentifier(caCertificateIdentifier)
    }

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
     * @param masterDatabaseName The meaning of this parameter differs according to the database
     * engine you use. 
     */
    override fun masterDatabaseName(masterDatabaseName: String) {
      cdkBuilder.masterDatabaseName(masterDatabaseName)
    }

    /**
     * The password for the primary user of the database.
     *
     * The password can include any printable ASCII character except the following: /, ", or
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-masteruserpassword)
     * @param masterUserPassword The password for the primary user of the database. 
     */
    override fun masterUserPassword(masterUserPassword: String) {
      cdkBuilder.masterUserPassword(masterUserPassword)
    }

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
     * @param masterUsername The name for the primary user. 
     */
    override fun masterUsername(masterUsername: String) {
      cdkBuilder.masterUsername(masterUsername)
    }

    /**
     * The daily time range during which automated backups are created for the database (for
     * example, `16:00-16:30` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredbackupwindow)
     * @param preferredBackupWindow The daily time range during which automated backups are created
     * for the database (for example, `16:00-16:30` ). 
     */
    override fun preferredBackupWindow(preferredBackupWindow: String) {
      cdkBuilder.preferredBackupWindow(preferredBackupWindow)
    }

    /**
     * The weekly time range during which system maintenance can occur for the database, formatted
     * as follows: `ddd:hh24:mi-ddd:hh24:mi` .
     *
     * For example, `Tue:17:00-Tue:17:30` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-preferredmaintenancewindow)
     * @param preferredMaintenanceWindow The weekly time range during which system maintenance can
     * occur for the database, formatted as follows: `ddd:hh24:mi-ddd:hh24:mi` . 
     */
    override fun preferredMaintenanceWindow(preferredMaintenanceWindow: String) {
      cdkBuilder.preferredMaintenanceWindow(preferredMaintenanceWindow)
    }

    /**
     * A Boolean value indicating whether the database is accessible to anyone on the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-publiclyaccessible)
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet. 
     */
    override fun publiclyAccessible(publiclyAccessible: Boolean) {
      cdkBuilder.publiclyAccessible(publiclyAccessible)
    }

    /**
     * A Boolean value indicating whether the database is accessible to anyone on the internet.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-publiclyaccessible)
     * @param publiclyAccessible A Boolean value indicating whether the database is accessible to
     * anyone on the internet. 
     */
    override fun publiclyAccessible(publiclyAccessible: IResolvable) {
      cdkBuilder.publiclyAccessible(publiclyAccessible.let(IResolvable::unwrap))
    }

    /**
     * The blueprint ID for the database (for example, `mysql_8_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseblueprintid)
     * @param relationalDatabaseBlueprintId The blueprint ID for the database (for example,
     * `mysql_8_0` ). 
     */
    override fun relationalDatabaseBlueprintId(relationalDatabaseBlueprintId: String) {
      cdkBuilder.relationalDatabaseBlueprintId(relationalDatabaseBlueprintId)
    }

    /**
     * The bundle ID for the database (for example, `medium_1_0` ).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasebundleid)
     * @param relationalDatabaseBundleId The bundle ID for the database (for example, `medium_1_0`
     * ). 
     */
    override fun relationalDatabaseBundleId(relationalDatabaseBundleId: String) {
      cdkBuilder.relationalDatabaseBundleId(relationalDatabaseBundleId)
    }

    /**
     * The name of the instance.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabasename)
     * @param relationalDatabaseName The name of the instance. 
     */
    override fun relationalDatabaseName(relationalDatabaseName: String) {
      cdkBuilder.relationalDatabaseName(relationalDatabaseName)
    }

    /**
     * An array of parameters for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
     * @param relationalDatabaseParameters An array of parameters for the database. 
     */
    override fun relationalDatabaseParameters(relationalDatabaseParameters: IResolvable) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters.let(IResolvable::unwrap))
    }

    /**
     * An array of parameters for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
     * @param relationalDatabaseParameters An array of parameters for the database. 
     */
    override fun relationalDatabaseParameters(relationalDatabaseParameters: List<Any>) {
      cdkBuilder.relationalDatabaseParameters(relationalDatabaseParameters)
    }

    /**
     * An array of parameters for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-lightsail-database.html#cfn-lightsail-database-relationaldatabaseparameters)
     * @param relationalDatabaseParameters An array of parameters for the database. 
     */
    override fun relationalDatabaseParameters(vararg relationalDatabaseParameters: Any): Unit =
        relationalDatabaseParameters(relationalDatabaseParameters.toList())

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
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail . 
     */
    override fun rotateMasterUserPassword(rotateMasterUserPassword: Boolean) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword)
    }

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
     * @param rotateMasterUserPassword A Boolean value indicating whether to change the primary user
     * password to a new, strong password generated by Lightsail . 
     */
    override fun rotateMasterUserPassword(rotateMasterUserPassword: IResolvable) {
      cdkBuilder.rotateMasterUserPassword(rotateMasterUserPassword.let(IResolvable::unwrap))
    }

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

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
     * @param tags An array of key-value pairs to apply to this resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.lightsail.CfnDatabase = cdkBuilder.build()
  }

  public companion object {
    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatabase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatabase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabase): CfnDatabase
        = CfnDatabase(cdkObject)

    internal fun unwrap(wrapped: CfnDatabase): software.amazon.awscdk.services.lightsail.CfnDatabase
        = wrapped.cdkObject
  }

  public interface RelationalDatabaseParameterProperty {
    /**
     * The valid range of values for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-allowedvalues)
     */
    public fun allowedValues(): String? = unwrap(this).getAllowedValues()

    /**
     * Indicates when parameter updates are applied.
     *
     * Can be `immediate` or `pending-reboot` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-applymethod)
     */
    public fun applyMethod(): String? = unwrap(this).getApplyMethod()

    /**
     * Specifies the engine-specific parameter type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-applytype)
     */
    public fun applyType(): String? = unwrap(this).getApplyType()

    /**
     * The valid data type of the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-datatype)
     */
    public fun dataType(): String? = unwrap(this).getDataType()

    /**
     * A description of the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A Boolean value indicating whether the parameter can be modified.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-ismodifiable)
     */
    public fun isModifiable(): Any? = unwrap(this).getIsModifiable()

    /**
     * The name of the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-parametername)
     */
    public fun parameterName(): String? = unwrap(this).getParameterName()

    /**
     * The value for the parameter.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-parametervalue)
     */
    public fun parameterValue(): String? = unwrap(this).getParameterValue()

    /**
     * A builder for [RelationalDatabaseParameterProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param allowedValues The valid range of values for the parameter.
       */
      public fun allowedValues(allowedValues: String)

      /**
       * @param applyMethod Indicates when parameter updates are applied.
       * Can be `immediate` or `pending-reboot` .
       */
      public fun applyMethod(applyMethod: String)

      /**
       * @param applyType Specifies the engine-specific parameter type.
       */
      public fun applyType(applyType: String)

      /**
       * @param dataType The valid data type of the parameter.
       */
      public fun dataType(dataType: String)

      /**
       * @param description A description of the parameter.
       */
      public fun description(description: String)

      /**
       * @param isModifiable A Boolean value indicating whether the parameter can be modified.
       */
      public fun isModifiable(isModifiable: Boolean)

      /**
       * @param isModifiable A Boolean value indicating whether the parameter can be modified.
       */
      public fun isModifiable(isModifiable: IResolvable)

      /**
       * @param parameterName The name of the parameter.
       */
      public fun parameterName(parameterName: String)

      /**
       * @param parameterValue The value for the parameter.
       */
      public fun parameterValue(parameterValue: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty.Builder
          =
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty.builder()

      /**
       * @param allowedValues The valid range of values for the parameter.
       */
      override fun allowedValues(allowedValues: String) {
        cdkBuilder.allowedValues(allowedValues)
      }

      /**
       * @param applyMethod Indicates when parameter updates are applied.
       * Can be `immediate` or `pending-reboot` .
       */
      override fun applyMethod(applyMethod: String) {
        cdkBuilder.applyMethod(applyMethod)
      }

      /**
       * @param applyType Specifies the engine-specific parameter type.
       */
      override fun applyType(applyType: String) {
        cdkBuilder.applyType(applyType)
      }

      /**
       * @param dataType The valid data type of the parameter.
       */
      override fun dataType(dataType: String) {
        cdkBuilder.dataType(dataType)
      }

      /**
       * @param description A description of the parameter.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param isModifiable A Boolean value indicating whether the parameter can be modified.
       */
      override fun isModifiable(isModifiable: Boolean) {
        cdkBuilder.isModifiable(isModifiable)
      }

      /**
       * @param isModifiable A Boolean value indicating whether the parameter can be modified.
       */
      override fun isModifiable(isModifiable: IResolvable) {
        cdkBuilder.isModifiable(isModifiable.let(IResolvable::unwrap))
      }

      /**
       * @param parameterName The name of the parameter.
       */
      override fun parameterName(parameterName: String) {
        cdkBuilder.parameterName(parameterName)
      }

      /**
       * @param parameterValue The value for the parameter.
       */
      override fun parameterValue(parameterValue: String) {
        cdkBuilder.parameterValue(parameterValue)
      }

      public fun build():
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty,
    ) : CdkObject(cdkObject), RelationalDatabaseParameterProperty {
      /**
       * The valid range of values for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-allowedvalues)
       */
      override fun allowedValues(): String? = unwrap(this).getAllowedValues()

      /**
       * Indicates when parameter updates are applied.
       *
       * Can be `immediate` or `pending-reboot` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-applymethod)
       */
      override fun applyMethod(): String? = unwrap(this).getApplyMethod()

      /**
       * Specifies the engine-specific parameter type.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-applytype)
       */
      override fun applyType(): String? = unwrap(this).getApplyType()

      /**
       * The valid data type of the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-datatype)
       */
      override fun dataType(): String? = unwrap(this).getDataType()

      /**
       * A description of the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A Boolean value indicating whether the parameter can be modified.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-ismodifiable)
       */
      override fun isModifiable(): Any? = unwrap(this).getIsModifiable()

      /**
       * The name of the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-parametername)
       */
      override fun parameterName(): String? = unwrap(this).getParameterName()

      /**
       * The value for the parameter.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-lightsail-database-relationaldatabaseparameter.html#cfn-lightsail-database-relationaldatabaseparameter-parametervalue)
       */
      override fun parameterValue(): String? = unwrap(this).getParameterValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          RelationalDatabaseParameterProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty):
          RelationalDatabaseParameterProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: RelationalDatabaseParameterProperty):
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.lightsail.CfnDatabase.RelationalDatabaseParameterProperty
    }
  }
}
