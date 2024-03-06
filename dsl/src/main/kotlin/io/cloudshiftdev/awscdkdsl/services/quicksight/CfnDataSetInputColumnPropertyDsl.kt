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

package io.cloudshiftdev.awscdkdsl.services.quicksight

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.quicksight.CfnDataSet

/**
 * Metadata for a column that is used as the input of a transform operation.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.quicksight.*;
 * InputColumnProperty inputColumnProperty = InputColumnProperty.builder()
 * .name("name")
 * .type("type")
 * // the properties below are optional
 * .subType("subType")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-quicksight-dataset-inputcolumn.html)
 */
@CdkDslMarker
public class CfnDataSetInputColumnPropertyDsl {
    private val cdkBuilder: CfnDataSet.InputColumnProperty.Builder =
        CfnDataSet.InputColumnProperty.builder()

    /** @param name The name of this column in the underlying data source. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * @param subType The sub data type of the column. Sub types are only available for decimal
     *   columns that are part of a SPICE dataset.
     */
    public fun subType(subType: String) {
        cdkBuilder.subType(subType)
    }

    /** @param type The data type of the column. */
    public fun type(type: String) {
        cdkBuilder.type(type)
    }

    public fun build(): CfnDataSet.InputColumnProperty = cdkBuilder.build()
}
