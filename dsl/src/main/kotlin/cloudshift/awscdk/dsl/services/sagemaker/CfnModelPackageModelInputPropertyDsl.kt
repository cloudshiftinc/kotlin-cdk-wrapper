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
public class CfnModelPackageModelInputPropertyDsl {
    private val cdkBuilder: CfnModelPackage.ModelInputProperty.Builder =
        CfnModelPackage.ModelInputProperty.builder()

    public fun dataInputConfig(dataInputConfig: String) {
        cdkBuilder.dataInputConfig(dataInputConfig)
    }

    public fun build(): CfnModelPackage.ModelInputProperty = cdkBuilder.build()
}
