@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.glue

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
 * The `AWS::Glue::Database` resource specifies a logical grouping of tables in AWS Glue .
 *
 * For more information, see [Defining a Database in Your Data
 * Catalog](https://docs.aws.amazon.com/glue/latest/dg/define-database.html) and [Database
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-databases.html#aws-glue-api-catalog-databases-Database)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object parameters;
 * CfnDatabase cfnDatabase = CfnDatabase.Builder.create(this, "MyCfnDatabase")
 * .catalogId("catalogId")
 * .databaseInput(DatabaseInputProperty.builder()
 * .createTableDefaultPermissions(List.of(PrincipalPrivilegesProperty.builder()
 * .permissions(List.of("permissions"))
 * .principal(DataLakePrincipalProperty.builder()
 * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
 * .build())
 * .build()))
 * .description("description")
 * .federatedDatabase(FederatedDatabaseProperty.builder()
 * .connectionName("connectionName")
 * .identifier("identifier")
 * .build())
 * .locationUri("locationUri")
 * .name("name")
 * .parameters(parameters)
 * .targetDatabase(DatabaseIdentifierProperty.builder()
 * .catalogId("catalogId")
 * .databaseName("databaseName")
 * .region("region")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html)
 */
public open class CfnDatabase internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnDatabase,
) : CfnResource(cdkObject), IInspectable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatabaseProps,
  ) :
      this(software.amazon.awscdk.services.glue.CfnDatabase(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDatabaseProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDatabaseProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDatabaseProps(props)
  )

  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The AWS account ID for the account in which to create the catalog object.
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The AWS account ID for the account in which to create the catalog object.
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * The metadata for the database.
   */
  public open fun databaseInput(): Any = unwrap(this).getDatabaseInput()

  /**
   * The metadata for the database.
   */
  public open fun databaseInput(`value`: IResolvable) {
    unwrap(this).setDatabaseInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * The metadata for the database.
   */
  public open fun databaseInput(`value`: DatabaseInputProperty) {
    unwrap(this).setDatabaseInput(`value`.let(DatabaseInputProperty::unwrap))
  }

  /**
   * The metadata for the database.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("8910c3394f6c7c10c51245acf8628f28a9c05a0d326653d4f1b02aefff064f81")
  public open fun databaseInput(`value`: DatabaseInputProperty.Builder.() -> Unit): Unit =
      databaseInput(DatabaseInputProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnDatabase].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The AWS account ID for the account in which to create the catalog object.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
     * @param catalogId The AWS account ID for the account in which to create the catalog object. 
     */
    public fun catalogId(catalogId: String)

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     * @param databaseInput The metadata for the database. 
     */
    public fun databaseInput(databaseInput: IResolvable)

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     * @param databaseInput The metadata for the database. 
     */
    public fun databaseInput(databaseInput: DatabaseInputProperty)

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     * @param databaseInput The metadata for the database. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("977dcab4f4d2d0a2cf36d1e9a7b5532875b1237f2589a2f57b19100e301a879b")
    public fun databaseInput(databaseInput: DatabaseInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnDatabase.Builder =
        software.amazon.awscdk.services.glue.CfnDatabase.Builder.create(scope, id)

    /**
     * The AWS account ID for the account in which to create the catalog object.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId`
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-catalogid)
     * @param catalogId The AWS account ID for the account in which to create the catalog object. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     * @param databaseInput The metadata for the database. 
     */
    override fun databaseInput(databaseInput: IResolvable) {
      cdkBuilder.databaseInput(databaseInput.let(IResolvable::unwrap))
    }

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     * @param databaseInput The metadata for the database. 
     */
    override fun databaseInput(databaseInput: DatabaseInputProperty) {
      cdkBuilder.databaseInput(databaseInput.let(DatabaseInputProperty::unwrap))
    }

    /**
     * The metadata for the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-database.html#cfn-glue-database-databaseinput)
     * @param databaseInput The metadata for the database. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("977dcab4f4d2d0a2cf36d1e9a7b5532875b1237f2589a2f57b19100e301a879b")
    override fun databaseInput(databaseInput: DatabaseInputProperty.Builder.() -> Unit): Unit =
        databaseInput(DatabaseInputProperty(databaseInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnDatabase = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnDatabase.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDatabase {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDatabase(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase): CfnDatabase =
        CfnDatabase(cdkObject)

    internal fun unwrap(wrapped: CfnDatabase): software.amazon.awscdk.services.glue.CfnDatabase =
        wrapped.cdkObject
  }

  /**
   * The structure used to create or update a database.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object parameters;
   * DatabaseInputProperty databaseInputProperty = DatabaseInputProperty.builder()
   * .createTableDefaultPermissions(List.of(PrincipalPrivilegesProperty.builder()
   * .permissions(List.of("permissions"))
   * .principal(DataLakePrincipalProperty.builder()
   * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
   * .build())
   * .build()))
   * .description("description")
   * .federatedDatabase(FederatedDatabaseProperty.builder()
   * .connectionName("connectionName")
   * .identifier("identifier")
   * .build())
   * .locationUri("locationUri")
   * .name("name")
   * .parameters(parameters)
   * .targetDatabase(DatabaseIdentifierProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .region("region")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html)
   */
  public interface DatabaseInputProperty {
    /**
     * Creates a set of default permissions on the table for principals.
     *
     * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-createtabledefaultpermissions)
     */
    public fun createTableDefaultPermissions(): Any? =
        unwrap(this).getCreateTableDefaultPermissions()

    /**
     * A description of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A `FederatedDatabase` structure that references an entity outside the AWS Glue Data Catalog .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-federateddatabase)
     */
    public fun federatedDatabase(): Any? = unwrap(this).getFederatedDatabase()

    /**
     * The location of the database (for example, an HDFS path).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-locationuri)
     */
    public fun locationUri(): String? = unwrap(this).getLocationUri()

    /**
     * The name of the database.
     *
     * For Hive compatibility, this is folded to lowercase when it is stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * These key-value pairs define parameters and properties of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-parameters)
     */
    public fun parameters(): Any? = unwrap(this).getParameters()

    /**
     * A `DatabaseIdentifier` structure that describes a target database for resource linking.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-targetdatabase)
     */
    public fun targetDatabase(): Any? = unwrap(this).getTargetDatabase()

    /**
     * A builder for [DatabaseInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param createTableDefaultPermissions Creates a set of default permissions on the table for
       * principals.
       * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
       */
      public fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable)

      /**
       * @param createTableDefaultPermissions Creates a set of default permissions on the table for
       * principals.
       * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
       */
      public fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>)

      /**
       * @param createTableDefaultPermissions Creates a set of default permissions on the table for
       * principals.
       * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
       */
      public fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any)

      /**
       * @param description A description of the database.
       */
      public fun description(description: String)

      /**
       * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
       * the AWS Glue Data Catalog .
       */
      public fun federatedDatabase(federatedDatabase: IResolvable)

      /**
       * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
       * the AWS Glue Data Catalog .
       */
      public fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty)

      /**
       * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
       * the AWS Glue Data Catalog .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b65ff7c8b03e9b65250939a9639ccc40f86571e64b8ca5ca97272767ae23b00")
      public fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty.Builder.() -> Unit)

      /**
       * @param locationUri The location of the database (for example, an HDFS path).
       */
      public fun locationUri(locationUri: String)

      /**
       * @param name The name of the database.
       * For Hive compatibility, this is folded to lowercase when it is stored.
       */
      public fun name(name: String)

      /**
       * @param parameters These key-value pairs define parameters and properties of the database.
       */
      public fun parameters(parameters: Any)

      /**
       * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
       * resource linking.
       */
      public fun targetDatabase(targetDatabase: IResolvable)

      /**
       * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
       * resource linking.
       */
      public fun targetDatabase(targetDatabase: DatabaseIdentifierProperty)

      /**
       * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
       * resource linking.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8343aa203b412577f62ae7a45c499c1c61ea101c62145d4fd2f7b75aaecf2792")
      public fun targetDatabase(targetDatabase: DatabaseIdentifierProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty.builder()

      /**
       * @param createTableDefaultPermissions Creates a set of default permissions on the table for
       * principals.
       * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
       */
      override fun createTableDefaultPermissions(createTableDefaultPermissions: IResolvable) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions.let(IResolvable::unwrap))
      }

      /**
       * @param createTableDefaultPermissions Creates a set of default permissions on the table for
       * principals.
       * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
       */
      override fun createTableDefaultPermissions(createTableDefaultPermissions: List<Any>) {
        cdkBuilder.createTableDefaultPermissions(createTableDefaultPermissions)
      }

      /**
       * @param createTableDefaultPermissions Creates a set of default permissions on the table for
       * principals.
       * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
       */
      override fun createTableDefaultPermissions(vararg createTableDefaultPermissions: Any): Unit =
          createTableDefaultPermissions(createTableDefaultPermissions.toList())

      /**
       * @param description A description of the database.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
       * the AWS Glue Data Catalog .
       */
      override fun federatedDatabase(federatedDatabase: IResolvable) {
        cdkBuilder.federatedDatabase(federatedDatabase.let(IResolvable::unwrap))
      }

      /**
       * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
       * the AWS Glue Data Catalog .
       */
      override fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty) {
        cdkBuilder.federatedDatabase(federatedDatabase.let(FederatedDatabaseProperty::unwrap))
      }

      /**
       * @param federatedDatabase A `FederatedDatabase` structure that references an entity outside
       * the AWS Glue Data Catalog .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4b65ff7c8b03e9b65250939a9639ccc40f86571e64b8ca5ca97272767ae23b00")
      override
          fun federatedDatabase(federatedDatabase: FederatedDatabaseProperty.Builder.() -> Unit):
          Unit = federatedDatabase(FederatedDatabaseProperty(federatedDatabase))

      /**
       * @param locationUri The location of the database (for example, an HDFS path).
       */
      override fun locationUri(locationUri: String) {
        cdkBuilder.locationUri(locationUri)
      }

      /**
       * @param name The name of the database.
       * For Hive compatibility, this is folded to lowercase when it is stored.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param parameters These key-value pairs define parameters and properties of the database.
       */
      override fun parameters(parameters: Any) {
        cdkBuilder.parameters(parameters)
      }

      /**
       * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
       * resource linking.
       */
      override fun targetDatabase(targetDatabase: IResolvable) {
        cdkBuilder.targetDatabase(targetDatabase.let(IResolvable::unwrap))
      }

      /**
       * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
       * resource linking.
       */
      override fun targetDatabase(targetDatabase: DatabaseIdentifierProperty) {
        cdkBuilder.targetDatabase(targetDatabase.let(DatabaseIdentifierProperty::unwrap))
      }

      /**
       * @param targetDatabase A `DatabaseIdentifier` structure that describes a target database for
       * resource linking.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8343aa203b412577f62ae7a45c499c1c61ea101c62145d4fd2f7b75aaecf2792")
      override fun targetDatabase(targetDatabase: DatabaseIdentifierProperty.Builder.() -> Unit):
          Unit = targetDatabase(DatabaseIdentifierProperty(targetDatabase))

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty,
    ) : CdkObject(cdkObject), DatabaseInputProperty {
      /**
       * Creates a set of default permissions on the table for principals.
       *
       * Used by AWS Lake Formation . Not used in the normal course of AWS Glue operations.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-createtabledefaultpermissions)
       */
      override fun createTableDefaultPermissions(): Any? =
          unwrap(this).getCreateTableDefaultPermissions()

      /**
       * A description of the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A `FederatedDatabase` structure that references an entity outside the AWS Glue Data Catalog
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-federateddatabase)
       */
      override fun federatedDatabase(): Any? = unwrap(this).getFederatedDatabase()

      /**
       * The location of the database (for example, an HDFS path).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-locationuri)
       */
      override fun locationUri(): String? = unwrap(this).getLocationUri()

      /**
       * The name of the database.
       *
       * For Hive compatibility, this is folded to lowercase when it is stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * These key-value pairs define parameters and properties of the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-parameters)
       */
      override fun parameters(): Any? = unwrap(this).getParameters()

      /**
       * A `DatabaseIdentifier` structure that describes a target database for resource linking.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseinput.html#cfn-glue-database-databaseinput-targetdatabase)
       */
      override fun targetDatabase(): Any? = unwrap(this).getTargetDatabase()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty):
          DatabaseInputProperty = CdkObjectWrappers.wrap(cdkObject) as? DatabaseInputProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseInputProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseInputProperty
    }
  }

  /**
   * A `FederatedDatabase` structure that references an entity outside the AWS Glue Data Catalog .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * FederatedDatabaseProperty federatedDatabaseProperty = FederatedDatabaseProperty.builder()
   * .connectionName("connectionName")
   * .identifier("identifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-federateddatabase.html)
   */
  public interface FederatedDatabaseProperty {
    /**
     * The name of the connection to the external metastore.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-federateddatabase.html#cfn-glue-database-federateddatabase-connectionname)
     */
    public fun connectionName(): String? = unwrap(this).getConnectionName()

    /**
     * A unique identifier for the federated database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-federateddatabase.html#cfn-glue-database-federateddatabase-identifier)
     */
    public fun identifier(): String? = unwrap(this).getIdentifier()

    /**
     * A builder for [FederatedDatabaseProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionName The name of the connection to the external metastore.
       */
      public fun connectionName(connectionName: String)

      /**
       * @param identifier A unique identifier for the federated database.
       */
      public fun identifier(identifier: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty.builder()

      /**
       * @param connectionName The name of the connection to the external metastore.
       */
      override fun connectionName(connectionName: String) {
        cdkBuilder.connectionName(connectionName)
      }

      /**
       * @param identifier A unique identifier for the federated database.
       */
      override fun identifier(identifier: String) {
        cdkBuilder.identifier(identifier)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty,
    ) : CdkObject(cdkObject), FederatedDatabaseProperty {
      /**
       * The name of the connection to the external metastore.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-federateddatabase.html#cfn-glue-database-federateddatabase-connectionname)
       */
      override fun connectionName(): String? = unwrap(this).getConnectionName()

      /**
       * A unique identifier for the federated database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-federateddatabase.html#cfn-glue-database-federateddatabase-identifier)
       */
      override fun identifier(): String? = unwrap(this).getIdentifier()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FederatedDatabaseProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty):
          FederatedDatabaseProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FederatedDatabaseProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FederatedDatabaseProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.FederatedDatabaseProperty
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
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * DataLakePrincipalProperty dataLakePrincipalProperty = DataLakePrincipalProperty.builder()
   * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-datalakeprincipal.html)
   */
  public interface DataLakePrincipalProperty {
    /**
     * An identifier for the AWS Lake Formation principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-datalakeprincipal.html#cfn-glue-database-datalakeprincipal-datalakeprincipalidentifier)
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
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty.builder()

      /**
       * @param dataLakePrincipalIdentifier An identifier for the AWS Lake Formation principal.
       */
      override fun dataLakePrincipalIdentifier(dataLakePrincipalIdentifier: String) {
        cdkBuilder.dataLakePrincipalIdentifier(dataLakePrincipalIdentifier)
      }

      public fun build(): software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty,
    ) : CdkObject(cdkObject), DataLakePrincipalProperty {
      /**
       * An identifier for the AWS Lake Formation principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-datalakeprincipal.html#cfn-glue-database-datalakeprincipal-datalakeprincipalidentifier)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty):
          DataLakePrincipalProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataLakePrincipalProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataLakePrincipalProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.DataLakePrincipalProperty
    }
  }

  /**
   * the permissions granted to a principal.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * PrincipalPrivilegesProperty principalPrivilegesProperty = PrincipalPrivilegesProperty.builder()
   * .permissions(List.of("permissions"))
   * .principal(DataLakePrincipalProperty.builder()
   * .dataLakePrincipalIdentifier("dataLakePrincipalIdentifier")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-principalprivileges.html)
   */
  public interface PrincipalPrivilegesProperty {
    /**
     * The permissions that are granted to the principal.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-principalprivileges.html#cfn-glue-database-principalprivileges-permissions)
     */
    public fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

    /**
     * The principal who is granted permissions.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-principalprivileges.html#cfn-glue-database-principalprivileges-principal)
     */
    public fun principal(): Any? = unwrap(this).getPrincipal()

    /**
     * A builder for [PrincipalPrivilegesProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param permissions The permissions that are granted to the principal.
       */
      public fun permissions(permissions: List<String>)

      /**
       * @param permissions The permissions that are granted to the principal.
       */
      public fun permissions(vararg permissions: String)

      /**
       * @param principal The principal who is granted permissions.
       */
      public fun principal(principal: IResolvable)

      /**
       * @param principal The principal who is granted permissions.
       */
      public fun principal(principal: DataLakePrincipalProperty)

      /**
       * @param principal The principal who is granted permissions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26a401ea0875e6e271c7b0116fc64b0c6609b7fca88d8ba318032f56fd772af6")
      public fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty.builder()

      /**
       * @param permissions The permissions that are granted to the principal.
       */
      override fun permissions(permissions: List<String>) {
        cdkBuilder.permissions(permissions)
      }

      /**
       * @param permissions The permissions that are granted to the principal.
       */
      override fun permissions(vararg permissions: String): Unit = permissions(permissions.toList())

      /**
       * @param principal The principal who is granted permissions.
       */
      override fun principal(principal: IResolvable) {
        cdkBuilder.principal(principal.let(IResolvable::unwrap))
      }

      /**
       * @param principal The principal who is granted permissions.
       */
      override fun principal(principal: DataLakePrincipalProperty) {
        cdkBuilder.principal(principal.let(DataLakePrincipalProperty::unwrap))
      }

      /**
       * @param principal The principal who is granted permissions.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("26a401ea0875e6e271c7b0116fc64b0c6609b7fca88d8ba318032f56fd772af6")
      override fun principal(principal: DataLakePrincipalProperty.Builder.() -> Unit): Unit =
          principal(DataLakePrincipalProperty(principal))

      public fun build():
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty,
    ) : CdkObject(cdkObject), PrincipalPrivilegesProperty {
      /**
       * The permissions that are granted to the principal.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-principalprivileges.html#cfn-glue-database-principalprivileges-permissions)
       */
      override fun permissions(): List<String> = unwrap(this).getPermissions() ?: emptyList()

      /**
       * The principal who is granted permissions.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-principalprivileges.html#cfn-glue-database-principalprivileges-principal)
       */
      override fun principal(): Any? = unwrap(this).getPrincipal()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): PrincipalPrivilegesProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty):
          PrincipalPrivilegesProperty = CdkObjectWrappers.wrap(cdkObject) as?
          PrincipalPrivilegesProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: PrincipalPrivilegesProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.PrincipalPrivilegesProperty
    }
  }

  /**
   * A structure that describes a target database for resource linking.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * DatabaseIdentifierProperty databaseIdentifierProperty = DatabaseIdentifierProperty.builder()
   * .catalogId("catalogId")
   * .databaseName("databaseName")
   * .region("region")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html)
   */
  public interface DatabaseIdentifierProperty {
    /**
     * The ID of the Data Catalog in which the database resides.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html#cfn-glue-database-databaseidentifier-catalogid)
     */
    public fun catalogId(): String? = unwrap(this).getCatalogId()

    /**
     * The name of the catalog database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html#cfn-glue-database-databaseidentifier-databasename)
     */
    public fun databaseName(): String? = unwrap(this).getDatabaseName()

    /**
     * The Region of the database.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html#cfn-glue-database-databaseidentifier-region)
     */
    public fun region(): String? = unwrap(this).getRegion()

    /**
     * A builder for [DatabaseIdentifierProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param catalogId The ID of the Data Catalog in which the database resides.
       */
      public fun catalogId(catalogId: String)

      /**
       * @param databaseName The name of the catalog database.
       */
      public fun databaseName(databaseName: String)

      /**
       * @param region The Region of the database.
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty.Builder =
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty.builder()

      /**
       * @param catalogId The ID of the Data Catalog in which the database resides.
       */
      override fun catalogId(catalogId: String) {
        cdkBuilder.catalogId(catalogId)
      }

      /**
       * @param databaseName The name of the catalog database.
       */
      override fun databaseName(databaseName: String) {
        cdkBuilder.databaseName(databaseName)
      }

      /**
       * @param region The Region of the database.
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty,
    ) : CdkObject(cdkObject), DatabaseIdentifierProperty {
      /**
       * The ID of the Data Catalog in which the database resides.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html#cfn-glue-database-databaseidentifier-catalogid)
       */
      override fun catalogId(): String? = unwrap(this).getCatalogId()

      /**
       * The name of the catalog database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html#cfn-glue-database-databaseidentifier-databasename)
       */
      override fun databaseName(): String? = unwrap(this).getDatabaseName()

      /**
       * The Region of the database.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-database-databaseidentifier.html#cfn-glue-database-databaseidentifier-region)
       */
      override fun region(): String? = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DatabaseIdentifierProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty):
          DatabaseIdentifierProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DatabaseIdentifierProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DatabaseIdentifierProperty):
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnDatabase.DatabaseIdentifierProperty
    }
  }
}
