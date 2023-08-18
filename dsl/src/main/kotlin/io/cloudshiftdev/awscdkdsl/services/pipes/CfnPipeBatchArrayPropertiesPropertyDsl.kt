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

package io.cloudshiftdev.awscdkdsl.services.pipes

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.pipes.CfnPipe

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
 * import software.amazon.awscdk.services.pipes.*;
 * BatchArrayPropertiesProperty batchArrayPropertiesProperty =
 * BatchArrayPropertiesProperty.builder()
 * .size(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-batcharrayproperties.html)
 */
@CdkDslMarker
public class CfnPipeBatchArrayPropertiesPropertyDsl {
    private val cdkBuilder: CfnPipe.BatchArrayPropertiesProperty.Builder =
        CfnPipe.BatchArrayPropertiesProperty.builder()

    /** @param size The size of the array, if this is an array batch job. */
    public fun size(size: Number) {
        cdkBuilder.size(size)
    }

    public fun build(): CfnPipe.BatchArrayPropertiesProperty = cdkBuilder.build()
}
