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
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.entityresolution.CfnMatchingWorkflow

/**
 * A list of `OutputAttribute` objects, each of which have the fields `Name` and `Hashed` .
 *
 * Each of these objects selects a column to be included in the output table, and whether the values
 * of the column should be hashed.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.entityresolution.*;
 * OutputSourceProperty outputSourceProperty = OutputSourceProperty.builder()
 * .output(List.of(OutputAttributeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hashed(false)
 * .build()))
 * .outputS3Path("outputS3Path")
 * // the properties below are optional
 * .applyNormalization(false)
 * .kmsArn("kmsArn")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputsource.html)
 */
@CdkDslMarker
public class CfnMatchingWorkflowOutputSourcePropertyDsl {
    private val cdkBuilder: CfnMatchingWorkflow.OutputSourceProperty.Builder =
        CfnMatchingWorkflow.OutputSourceProperty.builder()

    private val _output: MutableList<Any> = mutableListOf()

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
     * @param kmsArn Customer KMS ARN for encryption at rest. If not provided, system will use an
     *   AWS Entity Resolution managed KMS key.
     */
    public fun kmsArn(kmsArn: String) {
        cdkBuilder.kmsArn(kmsArn)
    }

    /**
     * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
     *   `Hashed` . Each of these objects selects a column to be included in the output table, and
     *   whether the values of the column should be hashed.
     */
    public fun output(vararg output: Any) {
        _output.addAll(listOf(*output))
    }

    /**
     * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
     *   `Hashed` . Each of these objects selects a column to be included in the output table, and
     *   whether the values of the column should be hashed.
     */
    public fun output(output: Collection<Any>) {
        _output.addAll(output)
    }

    /**
     * @param output A list of `OutputAttribute` objects, each of which have the fields `Name` and
     *   `Hashed` . Each of these objects selects a column to be included in the output table, and
     *   whether the values of the column should be hashed.
     */
    public fun output(output: IResolvable) {
        cdkBuilder.output(output)
    }

    /**
     * @param outputS3Path The S3 path to which AWS Entity Resolution will write the output table.
     */
    public fun outputS3Path(outputS3Path: String) {
        cdkBuilder.outputS3Path(outputS3Path)
    }

    public fun build(): CfnMatchingWorkflow.OutputSourceProperty {
        if (_output.isNotEmpty()) cdkBuilder.output(_output)
        return cdkBuilder.build()
    }
}
