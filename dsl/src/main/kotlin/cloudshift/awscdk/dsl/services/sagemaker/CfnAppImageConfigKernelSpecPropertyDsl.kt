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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

/**
 * The specification of a Jupyter kernel.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * KernelSpecProperty kernelSpecProperty = KernelSpecProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .displayName("displayName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-kernelspec.html)
 */
@CdkDslMarker
public class CfnAppImageConfigKernelSpecPropertyDsl {
    private val cdkBuilder: CfnAppImageConfig.KernelSpecProperty.Builder =
        CfnAppImageConfig.KernelSpecProperty.builder()

    /** @param displayName The display name of the kernel. */
    public fun displayName(displayName: String) {
        cdkBuilder.displayName(displayName)
    }

    /** @param name The name of the Jupyter kernel in the image. This value is case sensitive. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnAppImageConfig.KernelSpecProperty = cdkBuilder.build()
}
