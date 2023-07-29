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

package cloudshift.awscdk.dsl.services.dynamodb

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.AttributeType

/**
 * Represents an attribute for describing the key schema for the table and indexes.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.cloudwatch.*;
 * Table table = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
 * .build();
 * IMetric metric = table.metricThrottledRequestsForOperations(OperationsMetricOptions.builder()
 * .operations(List.of(Operation.PUT_ITEM))
 * .period(Duration.minutes(1))
 * .build());
 * Alarm.Builder.create(this, "Alarm")
 * .metric(metric)
 * .evaluationPeriods(1)
 * .threshold(1)
 * .build();
 * ```
 */
@CdkDslMarker
public class AttributeDsl {
    private val cdkBuilder: Attribute.Builder = Attribute.builder()

    /** @param name The name of an attribute. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /** @param type The data type of an attribute. */
    public fun type(type: AttributeType) {
        cdkBuilder.type(type)
    }

    public fun build(): Attribute = cdkBuilder.build()
}
