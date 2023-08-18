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

package io.cloudshiftdev.awscdkdsl.services.medialive

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.medialive.CfnChannel

/**
 * The input location.
 *
 * The parent of this entity is InputLossBehavior.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputLocationProperty inputLocationProperty = InputLocationProperty.builder()
 * .passwordParam("passwordParam")
 * .uri("uri")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-channel-inputlocation.html)
 */
@CdkDslMarker
public class CfnChannelInputLocationPropertyDsl {
    private val cdkBuilder: CfnChannel.InputLocationProperty.Builder =
        CfnChannel.InputLocationProperty.builder()

    /**
     * @param passwordParam The password parameter that holds the password for accessing the
     *   downstream system. This applies only if the downstream system requires credentials.
     */
    public fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
    }

    /**
     * @param uri The URI should be a path to a file that is accessible to the Live system (for
     *   example, an http:// URI) depending on the output type. For example, an RTMP destination
     *   should have a URI similar to rtmp://fmsserver/live.
     */
    public fun uri(uri: String) {
        cdkBuilder.uri(uri)
    }

    /**
     * @param username The user name to connect to the downstream system. This applies only if the
     *   downstream system requires credentials.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnChannel.InputLocationProperty = cdkBuilder.build()
}
