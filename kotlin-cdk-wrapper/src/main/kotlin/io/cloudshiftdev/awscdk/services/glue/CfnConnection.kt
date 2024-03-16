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
 * The `AWS::Glue::Connection` resource specifies an AWS Glue connection to a data source.
 *
 * For more information, see [Adding a Connection to Your Data
 * Store](https://docs.aws.amazon.com/glue/latest/dg/populate-add-connection.html) and [Connection
 * Structure](https://docs.aws.amazon.com/glue/latest/dg/aws-glue-api-catalog-connections.html#aws-glue-api-catalog-connections-Connection)
 * in the *AWS Glue Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.glue.*;
 * Object connectionProperties;
 * CfnConnection cfnConnection = CfnConnection.Builder.create(this, "MyCfnConnection")
 * .catalogId("catalogId")
 * .connectionInput(ConnectionInputProperty.builder()
 * .connectionType("connectionType")
 * // the properties below are optional
 * .connectionProperties(connectionProperties)
 * .description("description")
 * .matchCriteria(List.of("matchCriteria"))
 * .name("name")
 * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
 * .availabilityZone("availabilityZone")
 * .securityGroupIdList(List.of("securityGroupIdList"))
 * .subnetId("subnetId")
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html)
 */
public open class CfnConnection internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.glue.CfnConnection,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ID of the data catalog to create the catalog object in.
   */
  public open fun catalogId(): String = unwrap(this).getCatalogId()

  /**
   * The ID of the data catalog to create the catalog object in.
   */
  public open fun catalogId(`value`: String) {
    unwrap(this).setCatalogId(`value`)
  }

  /**
   * The connection that you want to create.
   */
  public open fun connectionInput(): Any = unwrap(this).getConnectionInput()

  /**
   * The connection that you want to create.
   */
  public open fun connectionInput(`value`: IResolvable) {
    unwrap(this).setConnectionInput(`value`.let(IResolvable::unwrap))
  }

  /**
   * The connection that you want to create.
   */
  public open fun connectionInput(`value`: ConnectionInputProperty) {
    unwrap(this).setConnectionInput(`value`.let(ConnectionInputProperty::unwrap))
  }

  /**
   * The connection that you want to create.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("a70800f54815623ec235f1815fbe11bc942a5c51fe4a2ece00cb57e3b9c23b41")
  public open fun connectionInput(`value`: ConnectionInputProperty.Builder.() -> Unit): Unit =
      connectionInput(ConnectionInputProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.glue.CfnConnection].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the data catalog to create the catalog object in.
     *
     * Currently, this should be the AWS account ID.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
     * @param catalogId The ID of the data catalog to create the catalog object in. 
     */
    public fun catalogId(catalogId: String)

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    public fun connectionInput(connectionInput: IResolvable)

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    public fun connectionInput(connectionInput: ConnectionInputProperty)

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c054d79a6f4f180cc0bb153a4582bd3bf2eb5bd1d65394592303eaf70bb55bab")
    public fun connectionInput(connectionInput: ConnectionInputProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.glue.CfnConnection.Builder =
        software.amazon.awscdk.services.glue.CfnConnection.Builder.create(scope, id)

    /**
     * The ID of the data catalog to create the catalog object in.
     *
     * Currently, this should be the AWS account ID.
     *
     *
     * To specify the account ID, you can use the `Ref` intrinsic function with the `AWS::AccountId`
     * pseudo parameter. For example: `!Ref AWS::AccountId` .
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-catalogid)
     * @param catalogId The ID of the data catalog to create the catalog object in. 
     */
    override fun catalogId(catalogId: String) {
      cdkBuilder.catalogId(catalogId)
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    override fun connectionInput(connectionInput: IResolvable) {
      cdkBuilder.connectionInput(connectionInput.let(IResolvable::unwrap))
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    override fun connectionInput(connectionInput: ConnectionInputProperty) {
      cdkBuilder.connectionInput(connectionInput.let(ConnectionInputProperty::unwrap))
    }

    /**
     * The connection that you want to create.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-connection.html#cfn-glue-connection-connectioninput)
     * @param connectionInput The connection that you want to create. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("c054d79a6f4f180cc0bb153a4582bd3bf2eb5bd1d65394592303eaf70bb55bab")
    override fun connectionInput(connectionInput: ConnectionInputProperty.Builder.() -> Unit): Unit
        = connectionInput(ConnectionInputProperty(connectionInput))

    public fun build(): software.amazon.awscdk.services.glue.CfnConnection = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.glue.CfnConnection.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConnection {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConnection(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection): CfnConnection
        = CfnConnection(cdkObject)

    internal fun unwrap(wrapped: CfnConnection): software.amazon.awscdk.services.glue.CfnConnection
        = wrapped.cdkObject
  }

  /**
   * A structure that is used to specify a connection to create or update.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * Object connectionProperties;
   * ConnectionInputProperty connectionInputProperty = ConnectionInputProperty.builder()
   * .connectionType("connectionType")
   * // the properties below are optional
   * .connectionProperties(connectionProperties)
   * .description("description")
   * .matchCriteria(List.of("matchCriteria"))
   * .name("name")
   * .physicalConnectionRequirements(PhysicalConnectionRequirementsProperty.builder()
   * .availabilityZone("availabilityZone")
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetId("subnetId")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html)
   */
  public interface ConnectionInputProperty {
    /**
     * These key-value pairs define parameters for the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
     */
    public fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

    /**
     * The type of the connection. Currently, these types are supported:.
     *
     * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
     *
     * `JDBC` Connections use the following ConnectionParameters.
     *
     * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
     * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
     * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
     * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
     * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
     *
     * `KAFKA` Connections use the following ConnectionParameters.
     *
     * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
     * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION` .
     * These parameters are used to configure SSL with `KAFKA` .
     * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
     * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
     * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
     * configuration with SSL in `KAFKA` .
     * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
     * `AWS_MSK_IAM` .
     * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
     * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
     * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
     * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
     * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
     * configure SASL/GSSAPI authentication with `KAFKA` .
     * * `MONGODB` - Designates a connection to a MongoDB document database.
     *
     * `MONGODB` Connections use the following ConnectionParameters.
     *
     * * Required: `CONNECTION_URL` .
     * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
     * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
     * Private Cloud environment (Amazon VPC).
     *
     * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     *
     * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
     * Marketplace to read from and write to data stores that are not natively supported by AWS Glue .
     *
     * `MARKETPLACE` Connections use the following ConnectionParameters.
     *
     * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL` .
     * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
     * `SECRET_ID` .
     * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
     * write to data stores that are not natively supported by AWS Glue .
     *
     * `SFTP` is not supported.
     *
     * For more information about how optional ConnectionProperties are used to configure features
     * in AWS Glue , consult [AWS Glue connection
     * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
     *
     * For more information about how optional ConnectionProperties are used to configure features
     * in AWS Glue Studio, consult [Using connectors and
     * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
     */
    public fun connectionType(): String

    /**
     * The description of the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of criteria that can be used in selecting this connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
     */
    public fun matchCriteria(): List<String> = unwrap(this).getMatchCriteria() ?: emptyList()

    /**
     * The name of the connection.
     *
     * Connection will not function as expected without a name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * A map of physical connection requirements, such as virtual private cloud (VPC) and
     * `SecurityGroup` , that are needed to successfully make this connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
     */
    public fun physicalConnectionRequirements(): Any? =
        unwrap(this).getPhysicalConnectionRequirements()

    /**
     * A builder for [ConnectionInputProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param connectionProperties These key-value pairs define parameters for the connection.
       */
      public fun connectionProperties(connectionProperties: Any)

      /**
       * @param connectionType The type of the connection. Currently, these types are supported:. 
       * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
       *
       * `JDBC` Connections use the following ConnectionParameters.
       *
       * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
       * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
       * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
       *
       * `KAFKA` Connections use the following ConnectionParameters.
       *
       * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
       * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION`
       * . These parameters are used to configure SSL with `KAFKA` .
       * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
       * configuration with SSL in `KAFKA` .
       * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
       * `AWS_MSK_IAM` .
       * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
       * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
       * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
       * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
       * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
       * configure SASL/GSSAPI authentication with `KAFKA` .
       * * `MONGODB` - Designates a connection to a MongoDB document database.
       *
       * `MONGODB` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
       * Private Cloud environment (Amazon VPC).
       *
       * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
       * PhysicalConnectionRequirements.
       *
       * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
       * Marketplace to read from and write to data stores that are not natively supported by AWS Glue
       * .
       *
       * `MARKETPLACE` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL`
       * .
       * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
       * `SECRET_ID` .
       * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
       * write to data stores that are not natively supported by AWS Glue .
       *
       * `SFTP` is not supported.
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue , consult [AWS Glue connection
       * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue Studio, consult [Using connectors and
       * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
       */
      public fun connectionType(connectionType: String)

      /**
       * @param description The description of the connection.
       */
      public fun description(description: String)

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      public fun matchCriteria(matchCriteria: List<String>)

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      public fun matchCriteria(vararg matchCriteria: String)

      /**
       * @param name The name of the connection.
       * Connection will not function as expected without a name.
       */
      public fun name(name: String)

      /**
       * @param physicalConnectionRequirements A map of physical connection requirements, such as
       * virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      public fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable)

      /**
       * @param physicalConnectionRequirements A map of physical connection requirements, such as
       * virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty)

      /**
       * @param physicalConnectionRequirements A map of physical connection requirements, such as
       * virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3a681d707a4b419f21be2fa852df2b7c429b91fffc84f200ac88783cb319cdc")
      public
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty.Builder =
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty.builder()

      /**
       * @param connectionProperties These key-value pairs define parameters for the connection.
       */
      override fun connectionProperties(connectionProperties: Any) {
        cdkBuilder.connectionProperties(connectionProperties)
      }

      /**
       * @param connectionType The type of the connection. Currently, these types are supported:. 
       * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
       *
       * `JDBC` Connections use the following ConnectionParameters.
       *
       * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
       * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
       * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
       *
       * `KAFKA` Connections use the following ConnectionParameters.
       *
       * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
       * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION`
       * . These parameters are used to configure SSL with `KAFKA` .
       * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
       * configuration with SSL in `KAFKA` .
       * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
       * `AWS_MSK_IAM` .
       * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
       * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
       * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
       * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
       * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
       * configure SASL/GSSAPI authentication with `KAFKA` .
       * * `MONGODB` - Designates a connection to a MongoDB document database.
       *
       * `MONGODB` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
       * Private Cloud environment (Amazon VPC).
       *
       * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
       * PhysicalConnectionRequirements.
       *
       * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
       * Marketplace to read from and write to data stores that are not natively supported by AWS Glue
       * .
       *
       * `MARKETPLACE` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL`
       * .
       * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
       * `SECRET_ID` .
       * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
       * write to data stores that are not natively supported by AWS Glue .
       *
       * `SFTP` is not supported.
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue , consult [AWS Glue connection
       * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue Studio, consult [Using connectors and
       * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
       */
      override fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
      }

      /**
       * @param description The description of the connection.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      override fun matchCriteria(matchCriteria: List<String>) {
        cdkBuilder.matchCriteria(matchCriteria)
      }

      /**
       * @param matchCriteria A list of criteria that can be used in selecting this connection.
       */
      override fun matchCriteria(vararg matchCriteria: String): Unit =
          matchCriteria(matchCriteria.toList())

      /**
       * @param name The name of the connection.
       * Connection will not function as expected without a name.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param physicalConnectionRequirements A map of physical connection requirements, such as
       * virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      override fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(IResolvable::unwrap))
      }

      /**
       * @param physicalConnectionRequirements A map of physical connection requirements, such as
       * virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements.let(PhysicalConnectionRequirementsProperty::unwrap))
      }

      /**
       * @param physicalConnectionRequirements A map of physical connection requirements, such as
       * virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
       * connection.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("b3a681d707a4b419f21be2fa852df2b7c429b91fffc84f200ac88783cb319cdc")
      override
          fun physicalConnectionRequirements(physicalConnectionRequirements: PhysicalConnectionRequirementsProperty.Builder.() -> Unit):
          Unit =
          physicalConnectionRequirements(PhysicalConnectionRequirementsProperty(physicalConnectionRequirements))

      public fun build(): software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty,
    ) : CdkObject(cdkObject), ConnectionInputProperty {
      /**
       * These key-value pairs define parameters for the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectionproperties)
       */
      override fun connectionProperties(): Any? = unwrap(this).getConnectionProperties()

      /**
       * The type of the connection. Currently, these types are supported:.
       *
       * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
       *
       * `JDBC` Connections use the following ConnectionParameters.
       *
       * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
       * `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
       * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
       *
       * `KAFKA` Connections use the following ConnectionParameters.
       *
       * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
       * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION`
       * . These parameters are used to configure SSL with `KAFKA` .
       * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
       * `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
       * configuration with SSL in `KAFKA` .
       * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
       * `AWS_MSK_IAM` .
       * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
       * `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
       * SASL/SCRAM-SHA-512 authentication with `KAFKA` .
       * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
       * `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
       * configure SASL/GSSAPI authentication with `KAFKA` .
       * * `MONGODB` - Designates a connection to a MongoDB document database.
       *
       * `MONGODB` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTION_URL` .
       * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
       * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
       * Private Cloud environment (Amazon VPC).
       *
       * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
       * PhysicalConnectionRequirements.
       *
       * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
       * Marketplace to read from and write to data stores that are not natively supported by AWS Glue
       * .
       *
       * `MARKETPLACE` Connections use the following ConnectionParameters.
       *
       * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL`
       * .
       * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
       * `SECRET_ID` .
       * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
       * write to data stores that are not natively supported by AWS Glue .
       *
       * `SFTP` is not supported.
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue , consult [AWS Glue connection
       * properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html) .
       *
       * For more information about how optional ConnectionProperties are used to configure features
       * in AWS Glue Studio, consult [Using connectors and
       * connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-connectiontype)
       */
      override fun connectionType(): String = unwrap(this).getConnectionType()

      /**
       * The description of the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * A list of criteria that can be used in selecting this connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-matchcriteria)
       */
      override fun matchCriteria(): List<String> = unwrap(this).getMatchCriteria() ?: emptyList()

      /**
       * The name of the connection.
       *
       * Connection will not function as expected without a name.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * A map of physical connection requirements, such as virtual private cloud (VPC) and
       * `SecurityGroup` , that are needed to successfully make this connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-connectioninput.html#cfn-glue-connection-connectioninput-physicalconnectionrequirements)
       */
      override fun physicalConnectionRequirements(): Any? =
          unwrap(this).getPhysicalConnectionRequirements()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConnectionInputProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty):
          ConnectionInputProperty = CdkObjectWrappers.wrap(cdkObject) as ConnectionInputProperty

      internal fun unwrap(wrapped: ConnectionInputProperty):
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.ConnectionInputProperty
    }
  }

  /**
   * Specifies the physical requirements for a connection.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.glue.*;
   * PhysicalConnectionRequirementsProperty physicalConnectionRequirementsProperty =
   * PhysicalConnectionRequirementsProperty.builder()
   * .availabilityZone("availabilityZone")
   * .securityGroupIdList(List.of("securityGroupIdList"))
   * .subnetId("subnetId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html)
   */
  public interface PhysicalConnectionRequirementsProperty {
    /**
     * The connection's Availability Zone.
     *
     * This field is redundant because the specified subnet implies the Availability Zone to be
     * used. Currently the field must be populated, but it will be deprecated in the future.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
     */
    public fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

    /**
     * The security group ID list used by the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
     */
    public fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
        emptyList()

    /**
     * The subnet ID used by the connection.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
     */
    public fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * A builder for [PhysicalConnectionRequirementsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param availabilityZone The connection's Availability Zone.
       * This field is redundant because the specified subnet implies the Availability Zone to be
       * used. Currently the field must be populated, but it will be deprecated in the future.
       */
      public fun availabilityZone(availabilityZone: String)

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      public fun securityGroupIdList(securityGroupIdList: List<String>)

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      public fun securityGroupIdList(vararg securityGroupIdList: String)

      /**
       * @param subnetId The subnet ID used by the connection.
       */
      public fun subnetId(subnetId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty.Builder
          =
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty.builder()

      /**
       * @param availabilityZone The connection's Availability Zone.
       * This field is redundant because the specified subnet implies the Availability Zone to be
       * used. Currently the field must be populated, but it will be deprecated in the future.
       */
      override fun availabilityZone(availabilityZone: String) {
        cdkBuilder.availabilityZone(availabilityZone)
      }

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      override fun securityGroupIdList(securityGroupIdList: List<String>) {
        cdkBuilder.securityGroupIdList(securityGroupIdList)
      }

      /**
       * @param securityGroupIdList The security group ID list used by the connection.
       */
      override fun securityGroupIdList(vararg securityGroupIdList: String): Unit =
          securityGroupIdList(securityGroupIdList.toList())

      /**
       * @param subnetId The subnet ID used by the connection.
       */
      override fun subnetId(subnetId: String) {
        cdkBuilder.subnetId(subnetId)
      }

      public fun build():
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty,
    ) : CdkObject(cdkObject), PhysicalConnectionRequirementsProperty {
      /**
       * The connection's Availability Zone.
       *
       * This field is redundant because the specified subnet implies the Availability Zone to be
       * used. Currently the field must be populated, but it will be deprecated in the future.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-availabilityzone)
       */
      override fun availabilityZone(): String? = unwrap(this).getAvailabilityZone()

      /**
       * The security group ID list used by the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-securitygroupidlist)
       */
      override fun securityGroupIdList(): List<String> = unwrap(this).getSecurityGroupIdList() ?:
          emptyList()

      /**
       * The subnet ID used by the connection.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-glue-connection-physicalconnectionrequirements.html#cfn-glue-connection-physicalconnectionrequirements-subnetid)
       */
      override fun subnetId(): String? = unwrap(this).getSubnetId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          PhysicalConnectionRequirementsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty):
          PhysicalConnectionRequirementsProperty = CdkObjectWrappers.wrap(cdkObject) as
          PhysicalConnectionRequirementsProperty

      internal fun unwrap(wrapped: PhysicalConnectionRequirementsProperty):
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.glue.CfnConnection.PhysicalConnectionRequirementsProperty
    }
  }
}
