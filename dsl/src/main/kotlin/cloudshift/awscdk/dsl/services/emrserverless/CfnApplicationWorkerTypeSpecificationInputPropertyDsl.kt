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

package cloudshift.awscdk.dsl.services.emrserverless

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

@CdkDslMarker
public class CfnApplicationWorkerTypeSpecificationInputPropertyDsl {
    private val cdkBuilder: CfnApplication.WorkerTypeSpecificationInputProperty.Builder =
        CfnApplication.WorkerTypeSpecificationInputProperty.builder()

    public fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    public fun imageConfiguration(imageConfiguration: CfnApplication.ImageConfigurationInputProperty) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    public fun build(): CfnApplication.WorkerTypeSpecificationInputProperty = cdkBuilder.build()
}
