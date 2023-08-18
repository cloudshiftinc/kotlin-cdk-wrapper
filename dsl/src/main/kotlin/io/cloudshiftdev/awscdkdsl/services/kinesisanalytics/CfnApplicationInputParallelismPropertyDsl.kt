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

package io.cloudshiftdev.awscdkdsl.services.kinesisanalytics

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import software.amazon.awscdk.services.kinesisanalytics.CfnApplication

/**
 * Describes the number of in-application streams to create for a given streaming source.
 *
 * For information about parallelism, see
 * [Configuring Application Input](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/how-it-works-input.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.kinesisanalytics.*;
 * InputParallelismProperty inputParallelismProperty = InputParallelismProperty.builder()
 * .count(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-kinesisanalytics-application-inputparallelism.html)
 */
@CdkDslMarker
public class CfnApplicationInputParallelismPropertyDsl {
    private val cdkBuilder: CfnApplication.InputParallelismProperty.Builder =
        CfnApplication.InputParallelismProperty.builder()

    /**
     * @param count Number of in-application streams to create. For more information, see
     *   [Limits](https://docs.aws.amazon.com/kinesisanalytics/latest/dev/limits.html) .
     */
    public fun count(count: Number) {
        cdkBuilder.count(count)
    }

    public fun build(): CfnApplication.InputParallelismProperty = cdkBuilder.build()
}
