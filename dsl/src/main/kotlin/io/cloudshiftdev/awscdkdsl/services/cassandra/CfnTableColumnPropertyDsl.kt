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

package io.cloudshiftdev.awscdkdsl.services.cassandra

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cassandra.CfnTable

/**
 * The name and data type of an individual column in a table.
 *
 * In addition to the data type, you can also use the following two keywords:
 * * `STATIC` if the table has a clustering column. Static columns store values that are shared by
 *   all rows in the same partition.
 * * `FROZEN` for collection data types. In frozen collections the values of the collection are
 *   serialized into a single immutable value, and Amazon Keyspaces treats them like a `BLOB` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cassandra.*;
 * ColumnProperty columnProperty = ColumnProperty.builder()
 * .columnName("columnName")
 * .columnType("columnType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cassandra-table-column.html)
 */
@CdkDslMarker
public class CfnTableColumnPropertyDsl {
    private val cdkBuilder: CfnTable.ColumnProperty.Builder = CfnTable.ColumnProperty.builder()

    /**
     * @param columnName The name of the column. For more information, see
     *   [Identifiers](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.elements.identifier)
     *   in the *Amazon Keyspaces Developer Guide* .
     */
    public fun columnName(columnName: String) {
        cdkBuilder.columnName(columnName)
    }

    /**
     * @param columnType The data type of the column. For more information, see
     *   [Data types](https://docs.aws.amazon.com/keyspaces/latest/devguide/cql.elements.html#cql.data-types)
     *   in the *Amazon Keyspaces Developer Guide* .
     */
    public fun columnType(columnType: String) {
        cdkBuilder.columnType(columnType)
    }

    public fun build(): CfnTable.ColumnProperty = cdkBuilder.build()
}
