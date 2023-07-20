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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.dynamodb.TableAttributes
import software.amazon.awscdk.services.kms.IKey
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList

@CdkDslMarker
public class TableAttributesDsl {
    private val cdkBuilder: TableAttributes.Builder = TableAttributes.builder()

    private val _globalIndexes: MutableList<String> = mutableListOf()

    private val _localIndexes: MutableList<String> = mutableListOf()

    public fun encryptionKey(encryptionKey: IKey) {
        cdkBuilder.encryptionKey(encryptionKey)
    }

    public fun globalIndexes(vararg globalIndexes: String) {
        _globalIndexes.addAll(listOf(*globalIndexes))
    }

    public fun globalIndexes(globalIndexes: Collection<String>) {
        _globalIndexes.addAll(globalIndexes)
    }

    public fun grantIndexPermissions(grantIndexPermissions: Boolean) {
        cdkBuilder.grantIndexPermissions(grantIndexPermissions)
    }

    public fun localIndexes(vararg localIndexes: String) {
        _localIndexes.addAll(listOf(*localIndexes))
    }

    public fun localIndexes(localIndexes: Collection<String>) {
        _localIndexes.addAll(localIndexes)
    }

    public fun tableArn(tableArn: String) {
        cdkBuilder.tableArn(tableArn)
    }

    public fun tableName(tableName: String) {
        cdkBuilder.tableName(tableName)
    }

    public fun tableStreamArn(tableStreamArn: String) {
        cdkBuilder.tableStreamArn(tableStreamArn)
    }

    public fun build(): TableAttributes {
        if (_globalIndexes.isNotEmpty()) cdkBuilder.globalIndexes(_globalIndexes)
        if (_localIndexes.isNotEmpty()) cdkBuilder.localIndexes(_localIndexes)
        return cdkBuilder.build()
    }
}
