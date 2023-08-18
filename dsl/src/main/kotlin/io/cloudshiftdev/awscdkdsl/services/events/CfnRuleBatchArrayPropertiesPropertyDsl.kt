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

package io.cloudshiftdev.awscdkdsl.services.events

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.events.CfnRule

/**
 * The array properties for the submitted job, such as the size of the array.
 *
 * The array size can be between 2 and 10,000. If you specify array properties for a job, it becomes
 * an array job. This parameter is used only if the target is an AWS Batch job.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * BatchArrayPropertiesProperty batchArrayPropertiesProperty =
 * BatchArrayPropertiesProperty.builder()
 * .size(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-batcharrayproperties.html)
 */
@CdkDslMarker
public class CfnRuleBatchArrayPropertiesPropertyDsl {
    private val cdkBuilder: CfnRule.BatchArrayPropertiesProperty.Builder =
        CfnRule.BatchArrayPropertiesProperty.builder()

    /**
     * @param size The size of the array, if this is an array batch job. Valid values are integers
     *   between 2 and 10,000.
     */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnRule.BatchArrayPropertiesProperty = cdkBuilder.build()
}
