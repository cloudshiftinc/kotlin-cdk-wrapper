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
import software.amazon.awscdk.services.sagemaker.CfnImageVersionProps
import kotlin.String

@CdkDslMarker
public class CfnImageVersionPropsDsl {
    private val cdkBuilder: CfnImageVersionProps.Builder = CfnImageVersionProps.builder()

    public fun baseImage(baseImage: String) {
        cdkBuilder.baseImage(baseImage)
    }

    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    public fun build(): CfnImageVersionProps = cdkBuilder.build()
}
