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
import kotlin.String
import software.amazon.awscdk.services.imagebuilder.CfnContainerRecipe

/**
 * The container repository where the output container image is stored.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.imagebuilder.*;
 * TargetContainerRepositoryProperty targetContainerRepositoryProperty =
 * TargetContainerRepositoryProperty.builder()
 * .repositoryName("repositoryName")
 * .service("service")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-containerrecipe-targetcontainerrepository.html)
 */
@CdkDslMarker
public class CfnContainerRecipeTargetContainerRepositoryPropertyDsl {
    private val cdkBuilder: CfnContainerRecipe.TargetContainerRepositoryProperty.Builder =
        CfnContainerRecipe.TargetContainerRepositoryProperty.builder()

    /**
     * @param repositoryName The name of the container repository where the output container image
     *   is stored. This name is prefixed by the repository location.
     */
    public fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
    }

    /** @param service Specifies the service in which this image was registered. */
    public fun service(service: String) {
        cdkBuilder.service(service)
    }

    public fun build(): CfnContainerRecipe.TargetContainerRepositoryProperty = cdkBuilder.build()
}
