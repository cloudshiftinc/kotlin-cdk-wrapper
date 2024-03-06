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

package io.cloudshiftdev.awscdkdsl.services.cloudformation

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnStack

/**
 * The Output data type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudformation.*;
 * OutputProperty outputProperty = OutputProperty.builder()
 * .description("description")
 * .exportName("exportName")
 * .outputKey("outputKey")
 * .outputValue("outputValue")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudformation-stack-output.html)
 */
@CdkDslMarker
public class CfnStackOutputPropertyDsl {
    private val cdkBuilder: CfnStack.OutputProperty.Builder = CfnStack.OutputProperty.builder()

    /** @param description User defined description associated with the output. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param exportName The name of the export associated with the output. */
    public fun exportName(exportName: String) {
        cdkBuilder.exportName(exportName)
    }

    /** @param outputKey The key associated with the output. */
    public fun outputKey(outputKey: String) {
        cdkBuilder.outputKey(outputKey)
    }

    /** @param outputValue The value associated with the output. */
    public fun outputValue(outputValue: String) {
        cdkBuilder.outputValue(outputValue)
    }

    public fun build(): CfnStack.OutputProperty = cdkBuilder.build()
}
