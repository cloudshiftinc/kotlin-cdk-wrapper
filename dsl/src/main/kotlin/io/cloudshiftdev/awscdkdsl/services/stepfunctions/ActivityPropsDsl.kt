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

package io.cloudshiftdev.awscdkdsl.services.stepfunctions

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.stepfunctions.ActivityProps

/**
 * Properties for defining a new Step Functions Activity.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * ActivityProps activityProps = ActivityProps.builder()
 * .activityName("activityName")
 * .build();
 * ```
 */
@CdkDslMarker
public class ActivityPropsDsl {
    private val cdkBuilder: ActivityProps.Builder = ActivityProps.builder()

    /** @param activityName The name for this activity. */
    public fun activityName(activityName: String) {
        cdkBuilder.activityName(activityName)
    }

    public fun build(): ActivityProps = cdkBuilder.build()
}
