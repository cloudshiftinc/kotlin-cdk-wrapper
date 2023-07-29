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
import software.amazon.awscdk.services.ec2.GenericLinuxImageProps
import software.amazon.awscdk.services.ec2.UserData

/**
 * Configuration options for GenericLinuxImage.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ec2.*;
 * UserData userData;
 * GenericLinuxImageProps genericLinuxImageProps = GenericLinuxImageProps.builder()
 * .userData(userData)
 * .build();
 * ```
 */
@CdkDslMarker
public class GenericLinuxImagePropsDsl {
    private val cdkBuilder: GenericLinuxImageProps.Builder = GenericLinuxImageProps.builder()

    /** @param userData Initial user data. */
    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): GenericLinuxImageProps = cdkBuilder.build()
}
