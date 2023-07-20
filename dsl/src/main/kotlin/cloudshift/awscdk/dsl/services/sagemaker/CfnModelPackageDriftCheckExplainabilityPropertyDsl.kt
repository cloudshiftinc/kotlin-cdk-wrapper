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
public class CfnModelPackageDriftCheckExplainabilityPropertyDsl {
    private val cdkBuilder: CfnModelPackage.DriftCheckExplainabilityProperty.Builder =
        CfnModelPackage.DriftCheckExplainabilityProperty.builder()

    public fun configFile(configFile: IResolvable) {
        cdkBuilder.configFile(configFile)
    }

    public fun configFile(configFile: CfnModelPackage.FileSourceProperty) {
        cdkBuilder.configFile(configFile)
    }

    public fun constraints(constraints: IResolvable) {
        cdkBuilder.constraints(constraints)
    }

    public fun constraints(constraints: CfnModelPackage.MetricsSourceProperty) {
        cdkBuilder.constraints(constraints)
    }

    public fun build(): CfnModelPackage.DriftCheckExplainabilityProperty = cdkBuilder.build()
}
