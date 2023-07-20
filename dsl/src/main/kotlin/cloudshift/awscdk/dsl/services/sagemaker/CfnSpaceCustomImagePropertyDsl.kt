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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnSpace
import kotlin.Number
import kotlin.String

@CdkDslMarker
public class CfnSpaceCustomImagePropertyDsl {
    private val cdkBuilder: CfnSpace.CustomImageProperty.Builder =
        CfnSpace.CustomImageProperty.builder()

    public fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
    }

    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    public fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
    }

    public fun build(): CfnSpace.CustomImageProperty = cdkBuilder.build()
}
