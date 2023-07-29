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

package cloudshift.awscdk.dsl.services.pipes

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.pipes.CfnPipe

/**
 * Filter events using an event pattern.
 *
 * For more information, see
 * [Events and Event Patterns](https://docs.aws.amazon.com/eventbridge/latest/userguide/eventbridge-and-event-patterns.html)
 * in the *Amazon EventBridge User Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.pipes.*;
 * FilterProperty filterProperty = FilterProperty.builder()
 * .pattern("pattern")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-pipes-pipe-filter.html)
 */
@CdkDslMarker
public class CfnPipeFilterPropertyDsl {
    private val cdkBuilder: CfnPipe.FilterProperty.Builder = CfnPipe.FilterProperty.builder()

    /** @param pattern The event pattern. */
    public fun pattern(pattern: String) {
        cdkBuilder.pattern(pattern)
    }

    public fun build(): CfnPipe.FilterProperty = cdkBuilder.build()
}
