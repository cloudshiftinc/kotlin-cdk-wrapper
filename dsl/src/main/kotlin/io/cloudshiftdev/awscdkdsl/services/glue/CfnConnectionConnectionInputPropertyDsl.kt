@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.glue

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnConnection

/**
 * A structure that is used to specify a connection to create or update.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.glue.*;
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
@CdkDslMarker
public class CfnConnectionConnectionInputPropertyDsl {
    private val cdkBuilder: CfnConnection.ConnectionInputProperty.Builder =
        CfnConnection.ConnectionInputProperty.builder()

    private val _matchCriteria: MutableList<String> = mutableListOf()

    /** @param connectionProperties These key-value pairs define parameters for the connection. */
    public fun connectionProperties(connectionProperties: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(connectionProperties)
        cdkBuilder.connectionProperties(builder.map)
    }

    /** @param connectionProperties These key-value pairs define parameters for the connection. */
    public fun connectionProperties(connectionProperties: Any) {
        cdkBuilder.connectionProperties(connectionProperties)
    }

    /**
     * @param connectionType The type of the connection. Currently, these types are supported:.
     * * `JDBC` - Designates a connection to a database through Java Database Connectivity (JDBC).
     *
     * `JDBC` Connections use the following ConnectionParameters.
     * * Required: All of ( `HOST` , `PORT` , `JDBC_ENGINE` ) or `JDBC_CONNECTION_URL` .
     * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
     * * Optional: `JDBC_ENFORCE_SSL` , `CUSTOM_JDBC_CERT` , `CUSTOM_JDBC_CERT_STRING` ,
     *   `SKIP_CUSTOM_JDBC_CERT_VALIDATION` . These parameters are used to configure SSL with JDBC.
     * * `KAFKA` - Designates a connection to an Apache Kafka streaming platform.
     *
     * `KAFKA` Connections use the following ConnectionParameters.
     * * Required: `KAFKA_BOOTSTRAP_SERVERS` .
     * * Optional: `KAFKA_SSL_ENABLED` , `KAFKA_CUSTOM_CERT` , `KAFKA_SKIP_CUSTOM_CERT_VALIDATION` .
     *   These parameters are used to configure SSL with `KAFKA` .
     * * Optional: `KAFKA_CLIENT_KEYSTORE` , `KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
     *   `KAFKA_CLIENT_KEY_PASSWORD` , `ENCRYPTED_KAFKA_CLIENT_KEYSTORE_PASSWORD` ,
     *   `ENCRYPTED_KAFKA_CLIENT_KEY_PASSWORD` . These parameters are used to configure TLS client
     *   configuration with SSL in `KAFKA` .
     * * Optional: `KAFKA_SASL_MECHANISM` . Can be specified as `SCRAM-SHA-512` , `GSSAPI` , or
     *   `AWS_MSK_IAM` .
     * * Optional: `KAFKA_SASL_SCRAM_USERNAME` , `KAFKA_SASL_SCRAM_PASSWORD` ,
     *   `ENCRYPTED_KAFKA_SASL_SCRAM_PASSWORD` . These parameters are used to configure
     *   SASL/SCRAM-SHA-512 authentication with `KAFKA` .
     * * Optional: `KAFKA_SASL_GSSAPI_KEYTAB` , `KAFKA_SASL_GSSAPI_KRB5_CONF` ,
     *   `KAFKA_SASL_GSSAPI_SERVICE` , `KAFKA_SASL_GSSAPI_PRINCIPAL` . These parameters are used to
     *   configure SASL/GSSAPI authentication with `KAFKA` .
     * * `MONGODB` - Designates a connection to a MongoDB document database.
     *
     * `MONGODB` Connections use the following ConnectionParameters.
     * * Required: `CONNECTION_URL` .
     * * Required: All of ( `USERNAME` , `PASSWORD` ) or `SECRET_ID` .
     * * `NETWORK` - Designates a network connection to a data source within an Amazon Virtual
     *   Private Cloud environment (Amazon VPC).
     *
     * `NETWORK` Connections do not require ConnectionParameters. Instead, provide a
     * PhysicalConnectionRequirements.
     * * `MARKETPLACE` - Uses configuration settings contained in a connector purchased from AWS
     *   Marketplace to read from and write to data stores that are not natively supported by AWS
     *   Glue .
     *
     * `MARKETPLACE` Connections use the following ConnectionParameters.
     * * Required: `CONNECTOR_TYPE` , `CONNECTOR_URL` , `CONNECTOR_CLASS_NAME` , `CONNECTION_URL` .
     * * Required for `JDBC` `CONNECTOR_TYPE` connections: All of ( `USERNAME` , `PASSWORD` ) or
     *   `SECRET_ID` .
     * * `CUSTOM` - Uses configuration settings contained in a custom connector to read from and
     *   write to data stores that are not natively supported by AWS Glue .
     *
     * `SFTP` is not supported.
     *
     * For more information about how optional ConnectionProperties are used to configure features
     * in AWS Glue , consult
     * [AWS Glue connection properties](https://docs.aws.amazon.com/glue/latest/dg/connection-defining.html)
     * .
     *
     * For more information about how optional ConnectionProperties are used to configure features
     * in AWS Glue Studio, consult
     * [Using connectors and connections](https://docs.aws.amazon.com/glue/latest/ug/connectors-chapter.html)
     * .
     */
    public fun connectionType(connectionType: String) {
        cdkBuilder.connectionType(connectionType)
    }

    /** @param description The description of the connection. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param matchCriteria A list of criteria that can be used in selecting this connection. */
    public fun matchCriteria(vararg matchCriteria: String) {
        _matchCriteria.addAll(listOf(*matchCriteria))
    }

    /** @param matchCriteria A list of criteria that can be used in selecting this connection. */
    public fun matchCriteria(matchCriteria: Collection<String>) {
        _matchCriteria.addAll(matchCriteria)
    }

    /**
     * @param name The name of the connection. Connection will not function as expected without a
     *   name.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param physicalConnectionRequirements A map of physical connection requirements, such as
     *   virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
     *   connection.
     */
    public fun physicalConnectionRequirements(physicalConnectionRequirements: IResolvable) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements)
    }

    /**
     * @param physicalConnectionRequirements A map of physical connection requirements, such as
     *   virtual private cloud (VPC) and `SecurityGroup` , that are needed to successfully make this
     *   connection.
     */
    public fun physicalConnectionRequirements(
        physicalConnectionRequirements: CfnConnection.PhysicalConnectionRequirementsProperty
    ) {
        cdkBuilder.physicalConnectionRequirements(physicalConnectionRequirements)
    }

    public fun build(): CfnConnection.ConnectionInputProperty {
        if (_matchCriteria.isNotEmpty()) cdkBuilder.matchCriteria(_matchCriteria)
        return cdkBuilder.build()
    }
}
