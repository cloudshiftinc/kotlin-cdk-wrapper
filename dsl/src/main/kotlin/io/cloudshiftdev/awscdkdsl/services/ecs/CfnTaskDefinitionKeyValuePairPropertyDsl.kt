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

package io.cloudshiftdev.awscdkdsl.services.ecs

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.CfnTaskDefinition

/**
 * A key-value pair object.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * KeyValuePairProperty keyValuePairProperty = KeyValuePairProperty.builder()
 * .name("name")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-ecs-taskdefinition-keyvaluepair.html)
 */
@CdkDslMarker
public class CfnTaskDefinitionKeyValuePairPropertyDsl {
    private val cdkBuilder: CfnTaskDefinition.KeyValuePairProperty.Builder =
        CfnTaskDefinition.KeyValuePairProperty.builder()

    /**
     * @param name The name of the key-value pair. For environment variables, this is the name of
     *   the environment variable.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param value The value of the key-value pair. For environment variables, this is the value of
     *   the environment variable.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnTaskDefinition.KeyValuePairProperty = cdkBuilder.build()
}
