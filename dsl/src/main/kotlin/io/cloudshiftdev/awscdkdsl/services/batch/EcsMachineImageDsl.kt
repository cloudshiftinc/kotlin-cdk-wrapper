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
import software.amazon.awscdk.services.batch.EcsMachineImage
import software.amazon.awscdk.services.batch.EcsMachineImageType
import software.amazon.awscdk.services.ec2.IMachineImage

/**
 * A Batch MachineImage that is compatible with ECS.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * import software.amazon.awscdk.services.ec2.*;
 * IMachineImage machineImage;
 * EcsMachineImage ecsMachineImage = EcsMachineImage.builder()
 * .image(machineImage)
 * .imageType(EcsMachineImageType.ECS_AL2)
 * .build();
 * ```
 */
@CdkDslMarker
public class EcsMachineImageDsl {
    private val cdkBuilder: EcsMachineImage.Builder = EcsMachineImage.builder()

    /** @param image The machine image to use. */
    public fun image(image: IMachineImage) {
        cdkBuilder.image(image)
    }

    /** @param imageType Tells Batch which instance type to launch this image on. */
    public fun imageType(imageType: EcsMachineImageType) {
        cdkBuilder.imageType(imageType)
    }

    public fun build(): EcsMachineImage = cdkBuilder.build()
}
