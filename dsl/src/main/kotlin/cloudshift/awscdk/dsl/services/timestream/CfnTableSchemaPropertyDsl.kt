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

package cloudshift.awscdk.dsl.services.timestream

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.timestream.CfnTable

/**
 * A Schema specifies the expected data model of the table.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.timestream.*;
 * SchemaProperty schemaProperty = SchemaProperty.builder()
 * .compositePartitionKey(List.of(PartitionKeyProperty.builder()
 * .type("type")
 * // the properties below are optional
 * .enforcementInRecord("enforcementInRecord")
 * .name("name")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-timestream-table-schema.html)
 */
@CdkDslMarker
public class CfnTableSchemaPropertyDsl {
    private val cdkBuilder: CfnTable.SchemaProperty.Builder = CfnTable.SchemaProperty.builder()

    private val _compositePartitionKey: MutableList<Any> = mutableListOf()

    /**
     * @param compositePartitionKey A non-empty list of partition keys defining the attributes used
     *   to partition the table data. The order of the list determines the partition hierarchy. The
     *   name and type of each partition key as well as the partition key order cannot be changed
     *   after the table is created. However, the enforcement level of each partition key can be
     *   changed.
     */
    public fun compositePartitionKey(vararg compositePartitionKey: Any) {
        _compositePartitionKey.addAll(listOf(*compositePartitionKey))
    }

    /**
     * @param compositePartitionKey A non-empty list of partition keys defining the attributes used
     *   to partition the table data. The order of the list determines the partition hierarchy. The
     *   name and type of each partition key as well as the partition key order cannot be changed
     *   after the table is created. However, the enforcement level of each partition key can be
     *   changed.
     */
    public fun compositePartitionKey(compositePartitionKey: Collection<Any>) {
        _compositePartitionKey.addAll(compositePartitionKey)
    }

    /**
     * @param compositePartitionKey A non-empty list of partition keys defining the attributes used
     *   to partition the table data. The order of the list determines the partition hierarchy. The
     *   name and type of each partition key as well as the partition key order cannot be changed
     *   after the table is created. However, the enforcement level of each partition key can be
     *   changed.
     */
    public fun compositePartitionKey(compositePartitionKey: IResolvable) {
        cdkBuilder.compositePartitionKey(compositePartitionKey)
    }

    public fun build(): CfnTable.SchemaProperty {
        if (_compositePartitionKey.isNotEmpty())
            cdkBuilder.compositePartitionKey(_compositePartitionKey)
        return cdkBuilder.build()
    }
}
