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
import software.amazon.awscdk.services.ec2.UserData
import software.amazon.awscdk.services.ec2.WindowsImageProps

/**
 * Configuration options for WindowsImage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * UserData userData;
 * WindowsImageProps windowsImageProps = WindowsImageProps.builder()
 * .userData(userData)
 * .build();
 * ```
 */
@CdkDslMarker
public class WindowsImagePropsDsl {
    private val cdkBuilder: WindowsImageProps.Builder = WindowsImageProps.builder()

    /** @param userData Initial user data. */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): WindowsImageProps = cdkBuilder.build()
}
