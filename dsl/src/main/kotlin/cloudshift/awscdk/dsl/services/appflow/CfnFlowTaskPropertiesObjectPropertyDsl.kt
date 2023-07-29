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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.appflow.CfnFlow

/**
 * A map used to store task-related information.
 *
 * The execution service looks for particular information based on the `TaskType` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appflow.*;
 * TaskPropertiesObjectProperty taskPropertiesObjectProperty =
 * TaskPropertiesObjectProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-appflow-flow-taskpropertiesobject.html)
 */
@CdkDslMarker
public class CfnFlowTaskPropertiesObjectPropertyDsl {
    private val cdkBuilder: CfnFlow.TaskPropertiesObjectProperty.Builder =
        CfnFlow.TaskPropertiesObjectProperty.builder()

    /**
     * @param key The task property key. *Allowed Values* : `VALUE | VALUES | DATA_TYPE |
     *   UPPER_BOUND | LOWER_BOUND | SOURCE_DATA_TYPE | DESTINATION_DATA_TYPE | VALIDATION_ACTION |
     *   MASK_VALUE | MASK_LENGTH | TRUNCATE_LENGTH | MATH_OPERATION_FIELDS_ORDER | CONCAT_FORMAT |
     *   SUBFIELD_CATEGORY_MAP` | `EXCLUDE_SOURCE_FIELDS_LIST`
     */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The task property value. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnFlow.TaskPropertiesObjectProperty = cdkBuilder.build()
}
