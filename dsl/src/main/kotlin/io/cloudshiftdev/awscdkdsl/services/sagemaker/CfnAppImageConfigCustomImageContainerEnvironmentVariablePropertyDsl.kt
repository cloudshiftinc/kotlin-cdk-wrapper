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
import kotlin.String
import software.amazon.awscdk.services.sagemaker.CfnAppImageConfig

/**
 * The environment variables to set in the container.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CustomImageContainerEnvironmentVariableProperty customImageContainerEnvironmentVariableProperty =
 * CustomImageContainerEnvironmentVariableProperty.builder()
 * .key("key")
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-appimageconfig-customimagecontainerenvironmentvariable.html)
 */
@CdkDslMarker
public class CfnAppImageConfigCustomImageContainerEnvironmentVariablePropertyDsl {
    private val cdkBuilder:
        CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty.Builder =
        CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty.builder()

    /** @param key The key that identifies a container environment variable. */
    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    /** @param value The value of the container environment variable. */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnAppImageConfig.CustomImageContainerEnvironmentVariableProperty =
        cdkBuilder.build()
}
