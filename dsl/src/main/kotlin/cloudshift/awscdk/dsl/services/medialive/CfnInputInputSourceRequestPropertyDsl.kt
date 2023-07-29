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
import software.amazon.awscdk.services.medialive.CfnInput

/**
 * Settings that apply only if the input is a pull type of input.
 *
 * The parent of this entity is Input.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.medialive.*;
 * InputSourceRequestProperty inputSourceRequestProperty = InputSourceRequestProperty.builder()
 * .passwordParam("passwordParam")
 * .url("url")
 * .username("username")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html)
 */
@CdkDslMarker
public class CfnInputInputSourceRequestPropertyDsl {
    private val cdkBuilder: CfnInput.InputSourceRequestProperty.Builder =
        CfnInput.InputSourceRequestProperty.builder()

    /**
     * @param passwordParam The password parameter that holds the password for accessing the
     *   upstream system. The password parameter applies only if the upstream system requires
     *   credentials.
     */
    public fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
    }

    /** @param url For a pull input, the URL where MediaLive pulls the source content from. */
    public fun url(url: String) {
        cdkBuilder.url(url)
    }

    /**
     * @param username The user name to connect to the upstream system. The user name applies only
     *   if the upstream system requires credentials.
     */
    public fun username(username: String) {
        cdkBuilder.username(username)
    }

    public fun build(): CfnInput.InputSourceRequestProperty = cdkBuilder.build()
}
