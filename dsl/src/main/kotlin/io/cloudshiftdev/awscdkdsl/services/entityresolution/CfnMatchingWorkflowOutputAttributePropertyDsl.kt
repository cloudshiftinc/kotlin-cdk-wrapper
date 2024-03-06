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
 * OutputAttributeProperty outputAttributeProperty = OutputAttributeProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .hashed(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-entityresolution-matchingworkflow-outputattribute.html)
 */
@CdkDslMarker
public class CfnMatchingWorkflowOutputAttributePropertyDsl {
    private val cdkBuilder: CfnMatchingWorkflow.OutputAttributeProperty.Builder =
        CfnMatchingWorkflow.OutputAttributeProperty.builder()

    /** @param hashed Enables the ability to hash the column values in the output. */
    public fun hashed(hashed: Boolean) {
        cdkBuilder.hashed(hashed)
    }

    /** @param hashed Enables the ability to hash the column values in the output. */
    public fun hashed(hashed: IResolvable) {
        cdkBuilder.hashed(hashed)
    }

    /**
     * @param name A name of a column to be written to the output. This must be an `InputField` name
     *   in the schema mapping.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnMatchingWorkflow.OutputAttributeProperty = cdkBuilder.build()
}
