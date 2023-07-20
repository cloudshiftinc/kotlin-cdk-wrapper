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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sagemaker.CfnModelPackage

@CdkDslMarker
public class CfnModelPackageDriftCheckBaselinesPropertyDsl {
    private val cdkBuilder: CfnModelPackage.DriftCheckBaselinesProperty.Builder =
        CfnModelPackage.DriftCheckBaselinesProperty.builder()

    public fun bias(bias: IResolvable) {
        cdkBuilder.bias(bias)
    }

    public fun bias(bias: CfnModelPackage.DriftCheckBiasProperty) {
        cdkBuilder.bias(bias)
    }

    public fun explainability(explainability: IResolvable) {
        cdkBuilder.explainability(explainability)
    }

    public fun explainability(explainability: CfnModelPackage.DriftCheckExplainabilityProperty) {
        cdkBuilder.explainability(explainability)
    }

    public fun modelDataQuality(modelDataQuality: IResolvable) {
        cdkBuilder.modelDataQuality(modelDataQuality)
    }

    public fun modelDataQuality(modelDataQuality: CfnModelPackage.DriftCheckModelDataQualityProperty) {
        cdkBuilder.modelDataQuality(modelDataQuality)
    }

    public fun modelQuality(modelQuality: IResolvable) {
        cdkBuilder.modelQuality(modelQuality)
    }

    public fun modelQuality(modelQuality: CfnModelPackage.DriftCheckModelQualityProperty) {
        cdkBuilder.modelQuality(modelQuality)
    }

    public fun build(): CfnModelPackage.DriftCheckBaselinesProperty = cdkBuilder.build()
}
