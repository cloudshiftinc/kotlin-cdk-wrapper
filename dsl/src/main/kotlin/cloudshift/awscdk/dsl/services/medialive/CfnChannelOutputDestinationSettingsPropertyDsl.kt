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

package cloudshift.awscdk.dsl.services.medialive

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The configuration information for this output.
 *
 * The parent of this entity is OutputDestination.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * OutputDestinationSettingsProperty outputDestinationSettingsProperty =
 * OutputDestinationSettingsProperty.builder()
 * .passwordParam("passwordParam")
 * .streamName("streamName")
 * .url("url")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-outputdestinationsettings.html)
 */
@CdkDslMarker
public class CfnChannelOutputDestinationSettingsPropertyDsl {
    private val cdkBuilder: CfnChannel.OutputDestinationSettingsProperty.Builder =
        CfnChannel.OutputDestinationSettingsProperty.builder()

    /**
     * @param passwordParam The password parameter that holds the password for accessing the
     *   downstream system. This password parameter applies only if the downstream system requires
     *   credentials.
     */
    public fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
    }

    /** @param streamName The stream name for the content. This applies only to RTMP outputs. */
    public fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
    }

    /** @param url The URL for the destination. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    /**
     * @param username The user name to connect to the downstream system. This applies only if the
     *   downstream system requires credentials.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnChannel.OutputDestinationSettingsProperty = cdkBuilder.build()
}
