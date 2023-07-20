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
public class CfnResourceDefinitionVersionS3MachineLearningModelResourceDataPropertyDsl {
    private val cdkBuilder:
        CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.builder()

    public fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
    }

    public fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    public fun ownerSetting(ownerSetting: CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting)
    }

    public fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
    }

    public fun build(): CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty =
        cdkBuilder.build()
}
