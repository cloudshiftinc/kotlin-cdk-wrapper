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

package io.cloudshiftdev.awscdkdsl.services.batch

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import software.amazon.awscdk.services.batch.EksMachineImage
import software.amazon.awscdk.services.batch.EksMachineImageType
import software.amazon.awscdk.services.ec2.IMachineImage

/**
 * A Batch MachineImage that is compatible with EKS.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * import software.amazon.awscdk.services.ec2.*;
 * IMachineImage machineImage;
 * EksMachineImage eksMachineImage = EksMachineImage.builder()
 * .image(machineImage)
 * .imageType(EksMachineImageType.EKS_AL2)
 * .build();
 * ```
 */
@CdkDslMarker
public class EksMachineImageDsl {
    private val cdkBuilder: EksMachineImage.Builder = EksMachineImage.builder()

    /** @param image The machine image to use. */
    public fun image(image: IMachineImage) {
        cdkBuilder.image(image)
    }

    /** @param imageType Tells Batch which instance type to launch this image on. */
    public fun imageType(imageType: EksMachineImageType) {
        cdkBuilder.imageType(imageType)
    }

    public fun build(): EksMachineImage = cdkBuilder.build()
}
