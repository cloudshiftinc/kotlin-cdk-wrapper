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

package io.cloudshiftdev.awscdkdsl.services.emrserverless

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.emrserverless.CfnApplication

/**
 * The specifications for a worker type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emrserverless.*;
 * WorkerTypeSpecificationInputProperty workerTypeSpecificationInputProperty =
 * WorkerTypeSpecificationInputProperty.builder()
 * .imageConfiguration(ImageConfigurationInputProperty.builder()
 * .imageUri("imageUri")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-emrserverless-application-workertypespecificationinput.html)
 */
@CdkDslMarker
public class CfnApplicationWorkerTypeSpecificationInputPropertyDsl {
    private val cdkBuilder: CfnApplication.WorkerTypeSpecificationInputProperty.Builder =
        CfnApplication.WorkerTypeSpecificationInputProperty.builder()

    /** @param imageConfiguration The image configuration for a worker type. */
    public fun imageConfiguration(imageConfiguration: IResolvable) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    /** @param imageConfiguration The image configuration for a worker type. */
    public fun imageConfiguration(
        imageConfiguration: CfnApplication.ImageConfigurationInputProperty
    ) {
        cdkBuilder.imageConfiguration(imageConfiguration)
    }

    public fun build(): CfnApplication.WorkerTypeSpecificationInputProperty = cdkBuilder.build()
}
