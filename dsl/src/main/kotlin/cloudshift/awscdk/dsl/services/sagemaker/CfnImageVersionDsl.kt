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
import software.amazon.awscdk.services.sagemaker.CfnImageVersion
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnImageVersionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnImageVersion.Builder = CfnImageVersion.Builder.create(scope, id)

    public fun baseImage(baseImage: String) {
        cdkBuilder.baseImage(baseImage)
    }

    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    public fun build(): CfnImageVersion = cdkBuilder.build()
}
