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

package io.cloudshiftdev.awscdkdsl.services.dynamodb

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.dynamodb.TableAttributesV2
import software.amazon.awscdk.services.kms.IKey

/**
 * Attributes of a DynamoDB table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.dynamodb.*;
 * import software.amazon.awscdk.services.kms.*;
 * Key key;
 * TableAttributesV2 tableAttributesV2 = TableAttributesV2.builder()
 * .encryptionKey(key)
 * .globalIndexes(List.of("globalIndexes"))
 * .grantIndexPermissions(false)
 * .localIndexes(List.of("localIndexes"))
 * .tableArn("tableArn")
 * .tableId("tableId")
 * .tableName("tableName")
 * .tableStreamArn("tableStreamArn")
 * .build();
 * ```
 */
@CdkDslMarker
public class TableAttributesV2Dsl {
    private val cdkBuilder: TableAttributesV2.Builder = TableAttributesV2.builder()

    private val _globalIndexes: MutableList<String> = mutableListOf()

    private val _localIndexes: MutableList<String> = mutableListOf()

    /** @param encryptionKey KMS encryption key for the table. */
    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    /**
     * @param globalIndexes The name of the global indexes set for the table. Note: You must set
     *   either this property or `localIndexes` if you want permissions to be granted for indexes as
     *   well as the table itself.
     */
    public fun globalIndexes(vararg globalIndexes: String) {
        _globalIndexes.addAll(listOf(*globalIndexes))
    }

    /**
     * @param globalIndexes The name of the global indexes set for the table. Note: You must set
     *   either this property or `localIndexes` if you want permissions to be granted for indexes as
     *   well as the table itself.
     */
    public fun globalIndexes(globalIndexes: Collection<String>) {
        _globalIndexes.addAll(globalIndexes)
    }

    /**
     * @param grantIndexPermissions Whether or not to grant permissions for all indexes of the
     *   table. Note: If false, permissions will only be granted to indexes when `globalIndexes` or
     *   `localIndexes` is specified.
     */
    public fun grantIndexPermissions(grantIndexPermissions: Boolean) {
        cdkBuilder.grantIndexPermissions(grantIndexPermissions)
    }

    /**
     * @param localIndexes The name of the local indexes set for the table. Note: You must set
     *   either this property or `globalIndexes` if you want permissions to be granted for indexes
     *   as well as the table itself.
     */
    public fun localIndexes(vararg localIndexes: String) {
        _localIndexes.addAll(listOf(*localIndexes))
    }

    /**
     * @param localIndexes The name of the local indexes set for the table. Note: You must set
     *   either this property or `globalIndexes` if you want permissions to be granted for indexes
     *   as well as the table itself.
     */
    public fun localIndexes(localIndexes: Collection<String>) {
        _localIndexes.addAll(localIndexes)
    }

    /** @param tableArn The ARN of the table. Note: You must specify this or the `tableName`. */
    public fun tableArn(tableArn: String) {
        cdkBuilder.tableArn(tableArn)
    }

    /** @param tableId The ID of the table. */
    public fun tableId(tableId: String) {
        cdkBuilder.tableId(tableId)
    }

    /** @param tableName The name of the table. Note: You must specify this or the `tableArn`. */
    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    /** @param tableStreamArn The stream ARN of the table. */
    public fun tableStreamArn(tableStreamArn: String) {
        cdkBuilder.tableStreamArn(tableStreamArn)
    }

    public fun build(): TableAttributesV2 {
        if (_globalIndexes.isNotEmpty()) cdkBuilder.globalIndexes(_globalIndexes)
        if (_localIndexes.isNotEmpty()) cdkBuilder.localIndexes(_localIndexes)
        return cdkBuilder.build()
    }
}
