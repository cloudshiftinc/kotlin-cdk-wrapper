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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.databrew.CfnDataset

/**
 * Represents a single entry in the `ValuesMap` of a `FilterExpression` .
 *
 * A `FilterValue` associates the name of a substitution variable in an expression to its value.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.databrew.*;
 * FilterValueProperty filterValueProperty = FilterValueProperty.builder()
 * .value("value")
 * .valueReference("valueReference")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-databrew-dataset-filtervalue.html)
 */
@CdkDslMarker
public class CfnDatasetFilterValuePropertyDsl {
    private val cdkBuilder: CfnDataset.FilterValueProperty.Builder =
        CfnDataset.FilterValueProperty.builder()

    /** @param value The value to be associated with the substitution variable. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    /** @param valueReference The substitution variable reference. */
    public fun valueReference(valueReference: String) {
        cdkBuilder.valueReference(valueReference)
    }

    public fun build(): CfnDataset.FilterValueProperty = cdkBuilder.build()
}
