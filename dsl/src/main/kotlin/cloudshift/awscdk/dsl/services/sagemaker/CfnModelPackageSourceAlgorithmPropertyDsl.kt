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
import software.amazon.awscdk.services.sagemaker.CfnModelPackage
import kotlin.String

@CdkDslMarker
public class CfnModelPackageSourceAlgorithmPropertyDsl {
    private val cdkBuilder: CfnModelPackage.SourceAlgorithmProperty.Builder =
        CfnModelPackage.SourceAlgorithmProperty.builder()

    public fun algorithmName(algorithmName: String) {
        cdkBuilder.algorithmName(algorithmName)
    }

    public fun modelDataUrl(modelDataUrl: String) {
        cdkBuilder.modelDataUrl(modelDataUrl)
    }

    public fun build(): CfnModelPackage.SourceAlgorithmProperty = cdkBuilder.build()
}
