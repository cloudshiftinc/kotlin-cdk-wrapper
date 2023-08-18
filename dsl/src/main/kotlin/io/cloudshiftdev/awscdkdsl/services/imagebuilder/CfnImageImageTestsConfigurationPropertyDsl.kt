@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.imagebuilder

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.imagebuilder.CfnImage

/**
 * When you create an image or container recipe with Image Builder , you can add the build or test
 * components that are used to create the final image.
 *
 * You must have at least one build component to create a recipe, but test components are not
 * required. If you have added tests, they run after the image is created, to ensure that the target
 * image is functional and can be used reliably for launching Amazon EC2 instances.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * ImageTestsConfigurationProperty imageTestsConfigurationProperty =
 * ImageTestsConfigurationProperty.builder()
 * .imageTestsEnabled(false)
 * .timeoutMinutes(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-image-imagetestsconfiguration.html)
 */
@CdkDslMarker
public class CfnImageImageTestsConfigurationPropertyDsl {
    private val cdkBuilder: CfnImage.ImageTestsConfigurationProperty.Builder =
        CfnImage.ImageTestsConfigurationProperty.builder()

    /**
     * @param imageTestsEnabled Determines if tests should run after building the image. Image
     *   Builder defaults to enable tests to run following the image build, before image
     *   distribution.
     */
    public fun imageTestsEnabled(imageTestsEnabled: Boolean) {
        cdkBuilder.imageTestsEnabled(imageTestsEnabled)
    }

    /**
     * @param imageTestsEnabled Determines if tests should run after building the image. Image
     *   Builder defaults to enable tests to run following the image build, before image
     *   distribution.
     */
    public fun imageTestsEnabled(imageTestsEnabled: IResolvable) {
        cdkBuilder.imageTestsEnabled(imageTestsEnabled)
    }

    /**
     * @param timeoutMinutes The maximum time in minutes that tests are permitted to run.
     *
     * The timeoutMinutes attribute is not currently active. This value is ignored.
     */
    public fun timeoutMinutes(timeoutMinutes: Number) {
        cdkBuilder.timeoutMinutes(timeoutMinutes)
    }

    public fun build(): CfnImage.ImageTestsConfigurationProperty = cdkBuilder.build()
}
