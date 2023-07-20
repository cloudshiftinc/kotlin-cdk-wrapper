@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ec2

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ec2.GenericWindowsImageProps
import software.amazon.awscdk.services.ec2.UserData

@CdkDslMarker
public class GenericWindowsImagePropsDsl {
    private val cdkBuilder: GenericWindowsImageProps.Builder = GenericWindowsImageProps.builder()

    public fun userData(userData: UserData) {
        cdkBuilder.userData(userData)
    }

    public fun build(): GenericWindowsImageProps = cdkBuilder.build()
}
