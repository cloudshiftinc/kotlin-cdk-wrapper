@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.dms

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.dms.CfnEndpoint
import kotlin.Boolean
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnEndpointKafkaSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.KafkaSettingsProperty.Builder =
        CfnEndpoint.KafkaSettingsProperty.builder()

    public fun broker(broker: String) {
        cdkBuilder.broker(broker)
    }

    public fun includeControlDetails(includeControlDetails: Boolean) {
        cdkBuilder.includeControlDetails(includeControlDetails)
    }

    public fun includeControlDetails(includeControlDetails: IResolvable) {
        cdkBuilder.includeControlDetails(includeControlDetails)
    }

    public fun includeNullAndEmpty(includeNullAndEmpty: Boolean) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
    }

    public fun includeNullAndEmpty(includeNullAndEmpty: IResolvable) {
        cdkBuilder.includeNullAndEmpty(includeNullAndEmpty)
    }

    public fun includePartitionValue(includePartitionValue: Boolean) {
        cdkBuilder.includePartitionValue(includePartitionValue)
    }

    public fun includePartitionValue(includePartitionValue: IResolvable) {
        cdkBuilder.includePartitionValue(includePartitionValue)
    }

    public fun includeTableAlterOperations(includeTableAlterOperations: Boolean) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
    }

    public fun includeTableAlterOperations(includeTableAlterOperations: IResolvable) {
        cdkBuilder.includeTableAlterOperations(includeTableAlterOperations)
    }

    public fun includeTransactionDetails(includeTransactionDetails: Boolean) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
    }

    public fun includeTransactionDetails(includeTransactionDetails: IResolvable) {
        cdkBuilder.includeTransactionDetails(includeTransactionDetails)
    }

    public fun messageFormat(messageFormat: String) {
        cdkBuilder.messageFormat(messageFormat)
    }

    public fun messageMaxBytes(messageMaxBytes: Number) {
        cdkBuilder.messageMaxBytes(messageMaxBytes)
    }

    public fun noHexPrefix(noHexPrefix: Boolean) {
        cdkBuilder.noHexPrefix(noHexPrefix)
    }

    public fun noHexPrefix(noHexPrefix: IResolvable) {
        cdkBuilder.noHexPrefix(noHexPrefix)
    }

    public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: Boolean) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
    }

    public fun partitionIncludeSchemaTable(partitionIncludeSchemaTable: IResolvable) {
        cdkBuilder.partitionIncludeSchemaTable(partitionIncludeSchemaTable)
    }

    public fun saslPassword(saslPassword: String) {
        cdkBuilder.saslPassword(saslPassword)
    }

    public fun saslUserName(saslUserName: String) {
        cdkBuilder.saslUserName(saslUserName)
    }

    public fun securityProtocol(securityProtocol: String) {
        cdkBuilder.securityProtocol(securityProtocol)
    }

    public fun sslCaCertificateArn(sslCaCertificateArn: String) {
        cdkBuilder.sslCaCertificateArn(sslCaCertificateArn)
    }

    public fun sslClientCertificateArn(sslClientCertificateArn: String) {
        cdkBuilder.sslClientCertificateArn(sslClientCertificateArn)
    }

    public fun sslClientKeyArn(sslClientKeyArn: String) {
        cdkBuilder.sslClientKeyArn(sslClientKeyArn)
    }

    public fun sslClientKeyPassword(sslClientKeyPassword: String) {
        cdkBuilder.sslClientKeyPassword(sslClientKeyPassword)
    }

    public fun topic(topic: String) {
        cdkBuilder.topic(topic)
    }

    public fun build(): CfnEndpoint.KafkaSettingsProperty = cdkBuilder.build()
}
