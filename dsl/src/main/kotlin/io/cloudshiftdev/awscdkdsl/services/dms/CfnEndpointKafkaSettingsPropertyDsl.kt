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

package io.cloudshiftdev.awscdkdsl.services.dms

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint

/**
 * Provides information that describes an Apache Kafka endpoint.
 *
 * This information includes the output format of records applied to the endpoint and details of
 * transaction and control table data information. For more information about other available
 * settings, see
 * [Using object mapping to migrate data to a Kafka topic](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html#CHAP_Target.Kafka.ObjectMapping)
 * in the *AWS Database Migration Service User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dms.*;
 * KafkaSettingsProperty kafkaSettingsProperty = KafkaSettingsProperty.builder()
 * .broker("broker")
 * .includeControlDetails(false)
 * .includeNullAndEmpty(false)
 * .includePartitionValue(false)
 * .includeTableAlterOperations(false)
 * .includeTransactionDetails(false)
 * .messageFormat("messageFormat")
 * .messageMaxBytes(123)
 * .noHexPrefix(false)
 * .partitionIncludeSchemaTable(false)
 * .saslPassword("saslPassword")
 * .saslUserName("saslUserName")
 * .securityProtocol("securityProtocol")
 * .sslCaCertificateArn("sslCaCertificateArn")
 * .sslClientCertificateArn("sslClientCertificateArn")
 * .sslClientKeyArn("sslClientKeyArn")
 * .sslClientKeyPassword("sslClientKeyPassword")
 * .topic("topic")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-dms-endpoint-kafkasettings.html)
 */
@CdkDslMarker
public class CfnEndpointKafkaSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.KafkaSettingsProperty.Builder =
        CfnEndpoint.KafkaSettingsProperty.builder()

    /**
     * @param broker A comma-separated list of one or more broker locations in your Kafka cluster
     *   that host your Kafka instance. Specify each broker location in the form
     *   `*broker-hostname-or-ip* : *port*` . For example,
     *   `"ec2-12-345-678-901.compute-1.amazonaws.com:2345"` . For more information and examples of
     *   specifying a list of broker locations, see
     *   [Using Apache Kafka as a target for AWS Database Migration Service](https://docs.aws.amazon.com/dms/latest/userguide/CHAP_Target.Kafka.html)
     *   in the *AWS Database Migration Service User Guide* .
     */
    public fun broker(broker: String) {
        cdkBuilder.broker(broker)
    }

    /**
     * @param includeControlDetails Shows detailed control information for table definition, column
     *   definition, and table and column changes in the Kafka message output. The default is
     *   `false` .
     */
    public fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
    }

    /**
     * @param includeControlDetails Shows detailed control information for table definition, column
     *   definition, and table and column changes in the Kafka message output. The default is
     *   `false` .
     */
    public fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails)
    }

    /**
     * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
     *   endpoint. The default is `false` .
     */
    public fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
    }

    /**
     * @param includeNullAndEmpty Include NULL and empty columns for records migrated to the
     *   endpoint. The default is `false` .
     */
    public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
    }

    /**
     * @param includePartitionValue Shows the partition value within the Kafka message output unless
     *   the partition type is `schema-table-type` . The default is `false` .
     */
    public fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
    }

    /**
     * @param includePartitionValue Shows the partition value within the Kafka message output unless
     *   the partition type is `schema-table-type` . The default is `false` .
     */
    public fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue)
    }

    /**
     * @param includeTableAlterOperations Includes any data definition language (DDL) operations
     *   that change the table in the control data, such as `rename-table` , `drop-table` ,
     *   `add-column` , `drop-column` , and `rename-column` . The default is `false` .
     */
    public fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
    }

    /**
     * @param includeTableAlterOperations Includes any data definition language (DDL) operations
     *   that change the table in the control data, such as `rename-table` , `drop-table` ,
     *   `add-column` , `drop-column` , and `rename-column` . The default is `false` .
     */
    public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
    }

    /**
     * @param includeTransactionDetails Provides detailed transaction information from the source
     *   database. This information includes a commit timestamp, a log position, and values for
     *   `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record
     *   offset within a transaction). The default is `false` .
     */
    public fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
    }

    /**
     * @param includeTransactionDetails Provides detailed transaction information from the source
     *   database. This information includes a commit timestamp, a log position, and values for
     *   `transaction_id` , previous `transaction_id` , and `transaction_record_id` (the record
     *   offset within a transaction). The default is `false` .
     */
    public fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
    }

    /**
     * @param messageFormat The output format for the records created on the endpoint. The message
     *   format is `JSON` (default) or `JSON_UNFORMATTED` (a single line with no tab).
     */
    public fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
    }

    /**
     * @param messageMaxBytes The maximum size in bytes for records created on the endpoint The
     *   default is 1,000,000.
     */
    public fun messageMaxBytes(messageMaxBytes: Number) {
        cdkBuilder.messageMaxBytes(messageMaxBytes)
    }

    /**
     * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to raw
     *   data in hexadecimal format. For example, by default, AWS DMS adds a '0x' prefix to the LOB
     *   column type in hexadecimal format moving from an Oracle source to a Kafka target. Use the
     *   `NoHexPrefix` endpoint setting to enable migration of RAW data type columns without adding
     *   the '0x' prefix.
     */
    public fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
    }

    /**
     * @param noHexPrefix Set this optional parameter to `true` to avoid adding a '0x' prefix to raw
     *   data in hexadecimal format. For example, by default, AWS DMS adds a '0x' prefix to the LOB
     *   column type in hexadecimal format moving from an Oracle source to a Kafka target. Use the
     *   `NoHexPrefix` endpoint setting to enable migration of RAW data type columns without adding
     *   the '0x' prefix.
     */
    public fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix)
    }

    /**
     * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values, when
     *   the partition type is `primary-key-type` . Doing this increases data distribution among
     *   Kafka partitions. For example, suppose that a SysBench schema has thousands of tables and
     *   each table has only limited range for a primary key. In this case, the same primary key is
     *   sent from thousands of tables to the same partition, which causes throttling. The default
     *   is `false` .
     */
    public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
    }

    /**
     * @param partitionIncludeSchemaTable Prefixes schema and table names to partition values, when
     *   the partition type is `primary-key-type` . Doing this increases data distribution among
     *   Kafka partitions. For example, suppose that a SysBench schema has thousands of tables and
     *   each table has only limited range for a primary key. In this case, the same primary key is
     *   sent from thousands of tables to the same partition, which causes throttling. The default
     *   is `false` .
     */
    public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
    }

    /**
     * @param saslPassword The secure password that you created when you first set up your Amazon
     *   MSK cluster to validate a client identity and make an encrypted connection between server
     *   and client using SASL-SSL authentication.
     */
    public fun saslPassword(saslPassword: String) {
        cdkBuilder.saslPassword(saslPassword)
    }

    /**
     * @param saslUserName The secure user name you created when you first set up your Amazon MSK
     *   cluster to validate a client identity and make an encrypted connection between server and
     *   client using SASL-SSL authentication.
     */
    public fun saslUserName(saslUserName: String) {
        cdkBuilder.saslUserName(saslUserName)
    }

    /**
     * @param securityProtocol Set secure connection to a Kafka target endpoint using Transport
     *   Layer Security (TLS). Options include `ssl-encryption` , `ssl-authentication` , and
     *   `sasl-ssl` . `sasl-ssl` requires `SaslUsername` and `SaslPassword` .
     */
    public fun securityProtocol(securityProtocol: String) {
        cdkBuilder.securityProtocol(securityProtocol)
    }

    /**
     * @param sslCaCertificateArn The Amazon Resource Name (ARN) for the private certificate
     *   authority (CA) cert that AWS DMS uses to securely connect to your Kafka target endpoint.
     */
    public fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
    }

    /**
     * @param sslClientCertificateArn The Amazon Resource Name (ARN) of the client certificate used
     *   to securely connect to a Kafka target endpoint.
     */
    public fun sslClientCertificateArn(sslClientCertificateArn: String) {
        cdkBuilder.sslClientCertificateArn(sslClientCertificateArn)
    }

    /**
     * @param sslClientKeyArn The Amazon Resource Name (ARN) for the client private key used to
     *   securely connect to a Kafka target endpoint.
     */
    public fun sslClientKeyArn(sslClientKeyArn: String) {
        cdkBuilder.sslClientKeyArn(sslClientKeyArn)
    }

    /**
     * @param sslClientKeyPassword The password for the client private key used to securely connect
     *   to a Kafka target endpoint.
     */
    public fun sslClientKeyPassword(sslClientKeyPassword: String) {
        cdkBuilder.sslClientKeyPassword(sslClientKeyPassword)
    }

    /**
     * @param topic The topic to which you migrate the data. If you don't specify a topic, AWS DMS
     *   specifies `"kafka-default-topic"` as the migration topic.
     */
    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnEndpoint.KafkaSettingsProperty = cdkBuilder.build()
}
