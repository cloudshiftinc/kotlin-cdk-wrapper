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

package cloudshift.awscdk.dsl.services.imagebuilder

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImage
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Map

@CdkDslMarker
public class CfnImageDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnImage.Builder = CfnImage.Builder.create(scope, id)

    public fun containerRecipeArn(containerRecipeArn: String) {
        cdkBuilder.containerRecipeArn(containerRecipeArn)
    }

    public fun distributionConfigurationArn(distributionConfigurationArn: String) {
        cdkBuilder.distributionConfigurationArn(distributionConfigurationArn)
    }

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: Boolean) {
        cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    public fun enhancedImageMetadataEnabled(enhancedImageMetadataEnabled: IResolvable) {
        cdkBuilder.enhancedImageMetadataEnabled(enhancedImageMetadataEnabled)
    }

    public fun imageRecipeArn(imageRecipeArn: String) {
        cdkBuilder.imageRecipeArn(imageRecipeArn)
    }

    public fun imageScanningConfiguration(imageScanningConfiguration: IResolvable) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    public fun imageScanningConfiguration(imageScanningConfiguration: CfnImage.ImageScanningConfigurationProperty) {
        cdkBuilder.imageScanningConfiguration(imageScanningConfiguration)
    }

    public fun imageTestsConfiguration(imageTestsConfiguration: IResolvable) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    public fun imageTestsConfiguration(imageTestsConfiguration: CfnImage.ImageTestsConfigurationProperty) {
        cdkBuilder.imageTestsConfiguration(imageTestsConfiguration)
    }

    public fun infrastructureConfigurationArn(infrastructureConfigurationArn: String) {
        cdkBuilder.infrastructureConfigurationArn(infrastructureConfigurationArn)
    }

    public fun tags(tags: Map<String, String>) {
        cdkBuilder.tags(tags)
    }

    public fun build(): CfnImage = cdkBuilder.build()
}
