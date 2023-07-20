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
public class CfnModelPackageDriftCheckModelDataQualityPropertyDsl {
    private val cdkBuilder: CfnModelPackage.DriftCheckModelDataQualityProperty.Builder =
        CfnModelPackage.DriftCheckModelDataQualityProperty.builder()

    public fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints)
    }

    public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.constraints(constraints)
    }

    public fun statistics(statistics: IResolvable) {
        cdkBuilder.statistics(statistics)
    }

    public fun statistics(statistics: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.statistics(statistics)
    }

    public fun build(): CfnModelPackage.DriftCheckModelDataQualityProperty = cdkBuilder.build()
}
