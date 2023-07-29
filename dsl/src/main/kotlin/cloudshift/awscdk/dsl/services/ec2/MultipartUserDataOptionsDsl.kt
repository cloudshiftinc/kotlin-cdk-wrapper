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

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ec2.MultipartUserDataOptions

/**
 * Options for creating `MultipartUserData`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * MultipartUserDataOptions multipartUserDataOptions = MultipartUserDataOptions.builder()
 * .partsSeparator("partsSeparator")
 * .build();
 * ```
 */
@CdkDslMarker
public class MultipartUserDataOptionsDsl {
    private val cdkBuilder: MultipartUserDataOptions.Builder = MultipartUserDataOptions.builder()

    /**
     * @param partsSeparator The string used to separate parts in multipart user data archive (it's
     *   like MIME boundary). This string should contain [a-zA-Z0-9()+,-./:=?] characters only, and
     *   should not be present in any part, or in text content of archive.
     */
    public fun partsSeparator(partsSeparator: String) {
        cdkBuilder.partsSeparator(partsSeparator)
    }

    public fun build(): MultipartUserDataOptions = cdkBuilder.build()
}
