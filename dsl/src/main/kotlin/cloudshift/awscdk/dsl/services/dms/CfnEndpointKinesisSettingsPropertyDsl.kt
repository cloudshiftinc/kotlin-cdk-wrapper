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
import kotlin.String

@CdkDslMarker
public class CfnEndpointKinesisSettingsPropertyDsl {
    private val cdkBuilder: CfnEndpoint.KinesisSettingsProperty.Builder =
        CfnEndpoint.KinesisSettingsProperty.builder()

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

    public fun serviceAccessRoleArn(serviceAccessRoleArn: String) {
        cdkBuilder.serviceAccessRoleArn(serviceAccessRoleArn)
    }

    public fun streamArn(streamArn: String) {
        cdkBuilder.streamArn(streamArn)
    }

    public fun build(): CfnEndpoint.KinesisSettingsProperty = cdkBuilder.build()
}
