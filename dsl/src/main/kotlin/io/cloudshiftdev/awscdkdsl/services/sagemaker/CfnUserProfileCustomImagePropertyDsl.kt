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

package io.cloudshiftdev.awscdkdsl.services.sagemaker

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnUserProfile

/**
 * A custom SageMaker image.
 *
 * For more information, see
 * [Bring your own SageMaker image](https://docs.aws.amazon.com/sagemaker/latest/dg/studio-byoi.html)
 * .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CustomImageProperty customImageProperty = CustomImageProperty.builder()
 * .appImageConfigName("appImageConfigName")
 * .imageName("imageName")
 * // the properties below are optional
 * .imageVersionNumber(123)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-userprofile-customimage.html)
 */
@CdkDslMarker
public class CfnUserProfileCustomImagePropertyDsl {
    private val cdkBuilder: CfnUserProfile.CustomImageProperty.Builder =
        CfnUserProfile.CustomImageProperty.builder()

    /** @param appImageConfigName The name of the AppImageConfig. */
    public fun appImageConfigName(appImageConfigName: String) {
        cdkBuilder.appImageConfigName(appImageConfigName)
    }

    /** @param imageName The name of the CustomImage. Must be unique to your account. */
    public fun imageName(imageName: String) {
        cdkBuilder.imageName(imageName)
    }

    /** @param imageVersionNumber The version number of the CustomImage. */
    public fun imageVersionNumber(imageVersionNumber: Number) {
        cdkBuilder.imageVersionNumber(imageVersionNumber)
    }

    public fun build(): CfnUserProfile.CustomImageProperty = cdkBuilder.build()
}
