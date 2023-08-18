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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions.tasks

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.services.stepfunctions.tasks.S3LocationBindOptions

/**
 * Options for binding an S3 Location.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.tasks.*;
 * S3LocationBindOptions s3LocationBindOptions = S3LocationBindOptions.builder()
 * .forReading(false)
 * .forWriting(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class S3LocationBindOptionsDsl {
    private val cdkBuilder: S3LocationBindOptions.Builder = S3LocationBindOptions.builder()

    /** @param forReading Allow reading from the S3 Location. */
    public fun forReading(forReading: Boolean) {
        cdkBuilder.forReading(forReading)
    }

    /** @param forWriting Allow writing to the S3 Location. */
    public fun forWriting(forWriting: Boolean) {
        cdkBuilder.forWriting(forWriting)
    }

    public fun build(): S3LocationBindOptions = cdkBuilder.build()
}
