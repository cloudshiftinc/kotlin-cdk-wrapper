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
import kotlin.Number
import software.amazon.awscdk.services.dynamodb.EnableScalingProps

/**
 * Properties for enabling DynamoDB capacity scaling.
 *
 * Example:
 * ```
 * Table globalTable = Table.Builder.create(this, "Table")
 * .partitionKey(Attribute.builder().name("id").type(AttributeType.STRING).build())
 * .replicationRegions(List.of("us-east-1", "us-east-2", "us-west-2"))
 * .billingMode(BillingMode.PROVISIONED)
 * .build();
 * globalTable.autoScaleWriteCapacity(EnableScalingProps.builder()
 * .minCapacity(1)
 * .maxCapacity(10)
 * .build()).scaleOnUtilization(UtilizationScalingProps.builder().targetUtilizationPercent(75).build());
 * ```
 */
@CdkDslMarker
public class EnableScalingPropsDsl {
    private val cdkBuilder: EnableScalingProps.Builder = EnableScalingProps.builder()

    /** @param maxCapacity Maximum capacity to scale to. */
    public fun maxCapacity(maxCapacity: Number) {
        cdkBuilder.maxCapacity(maxCapacity)
    }

    /** @param minCapacity Minimum capacity to scale to. */
    public fun minCapacity(minCapacity: Number) {
        cdkBuilder.minCapacity(minCapacity)
    }

    public fun build(): EnableScalingProps = cdkBuilder.build()
}
