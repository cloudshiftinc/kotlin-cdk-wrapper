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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion
import kotlin.String

@CdkDslMarker
public class CfnResourceDefinitionVersionSageMakerMachineLearningModelResourceDataPropertyDsl {
    private val cdkBuilder:
        CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.builder()

    public fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
    }

    public fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    public fun ownerSetting(ownerSetting: CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    public fun sageMakerJobArn(sageMakerJobArn: String) {
        cdkBuilder.sageMakerJobArn(sageMakerJobArn)
    }

    public fun build(): CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty =
        cdkBuilder.build()
}
