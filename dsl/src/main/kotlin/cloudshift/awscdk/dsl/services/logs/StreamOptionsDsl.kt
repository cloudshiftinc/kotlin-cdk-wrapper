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

package cloudshift.awscdk.dsl.services.logs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.logs.StreamOptions

/**
 * Properties for a new LogStream created from a LogGroup.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.logs.*;
 * StreamOptions streamOptions = StreamOptions.builder()
 * .logStreamName("logStreamName")
 * .build();
 * ```
 */
@CdkDslMarker
public class StreamOptionsDsl {
    private val cdkBuilder: StreamOptions.Builder = StreamOptions.builder()

    /**
     * @param logStreamName The name of the log stream to create. The name must be unique within the
     *   log group.
     */
    public fun logStreamName(logStreamName: String) {
        cdkBuilder.logStreamName(logStreamName)
    }

    public fun build(): StreamOptions = cdkBuilder.build()
}
