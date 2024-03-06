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

package io.cloudshiftdev.awscdkdsl.services.entityresolution

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow

/**
 * An object containing `InputSourceARN` , `SchemaName` , and `ApplyNormalization` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * InputSourceProperty inputSourceProperty = InputSourceProperty.builder()
 * .inputSourceArn("inputSourceArn")
 * .schemaArn("schemaArn")
 * // the properties below are optional
 * .applyNormalization(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-inputsource.html)
 */
@CdkDslMarker
public class CfnMatchingWorkflowInputSourcePropertyDsl {
    private val cdkBuilder: CfnMatchingWorkflow.InputSourceProperty.Builder =
        CfnMatchingWorkflow.InputSourceProperty.builder()

    /**
     * @param applyNormalization Normalizes the attributes defined in the schema in the input data.
     *   For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
     *   input table is in a format of 1234567890, AWS Entity Resolution will normalize this field
     *   in the output to (123)-456-7890.
     */
    public fun applyNormalization(applyNormalization: Boolean) {
        cdkBuilder.applyNormalization(applyNormalization)
    }

    /**
     * @param applyNormalization Normalizes the attributes defined in the schema in the input data.
     *   For example, if an attribute has an `AttributeType` of `PHONE_NUMBER` , and the data in the
     *   input table is in a format of 1234567890, AWS Entity Resolution will normalize this field
     *   in the output to (123)-456-7890.
     */
    public fun applyNormalization(applyNormalization: IResolvable) {
        cdkBuilder.applyNormalization(applyNormalization)
    }

    /**
     * @param inputSourceArn An object containing `InputSourceARN` , `SchemaName` , and
     *   `ApplyNormalization` .
     */
    public fun inputSourceArn(inputSourceArn: String) {
        cdkBuilder.inputSourceArn(inputSourceArn)
    }

    /** @param schemaArn The name of the schema. */
    public fun schemaArn(schemaArn: String) {
        cdkBuilder.schemaArn(schemaArn)
    }

    public fun build(): CfnMatchingWorkflow.InputSourceProperty = cdkBuilder.build()
}
