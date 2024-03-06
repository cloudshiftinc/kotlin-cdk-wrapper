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
import kotlin.String
import software.amazon.awscdk.services.dynamodb.Attribute
import software.amazon.awscdk.services.dynamodb.AttributeType

/**
 * Represents an attribute for describing the key schema for the table and indexes.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.*;
 * App app = new App();
 * Stack stack = Stack.Builder.create(app,
 * "Stack").env(Environment.builder().region("us-west-2").build()).build();
 * TableV2 globalTable = TableV2.Builder.create(stack, "GlobalTable")
 * .partitionKey(Attribute.builder().name("pk").type(AttributeType.STRING).build())
 * // applys to all replicas, i.e., us-west-2, us-east-1, us-east-2
 * .removalPolicy(RemovalPolicy.DESTROY)
 * .replicas(List.of(ReplicaTableProps.builder().region("us-east-1").build(),
 * ReplicaTableProps.builder().region("us-east-2").build()))
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
