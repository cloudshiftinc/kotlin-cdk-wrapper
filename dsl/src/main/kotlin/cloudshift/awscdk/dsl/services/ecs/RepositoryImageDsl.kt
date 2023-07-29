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

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.ecs.RepositoryImage
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * An image hosted in a public or private repository.
 *
 * For images hosted in Amazon ECR, see
 * [EcrImage](https://docs.aws.amazon.com/AmazonECR/latest/userguide/images.html).
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecr.assets.*;
 * import software.amazon.awscdk.services.ecs.*;
 * DockerImageAsset dockerImageAsset;
 * ContainerImage repositoryImage = RepositoryImage.fromDockerImageAsset(dockerImageAsset);
 * ```
 */
@CdkDslMarker
public class RepositoryImageDsl(
    imageName: String,
) {
    private val cdkBuilder: RepositoryImage.Builder = RepositoryImage.Builder.create(imageName)

    /**
     * The secret to expose to the container that contains the credentials for the image repository.
     *
     * The supported value is the full ARN of an AWS Secrets Manager secret.
     *
     * @param credentials The secret to expose to the container that contains the credentials for
     *   the image repository.
     */
    public fun credentials(credentials: ISecret) {
        cdkBuilder.credentials(credentials)
    }

    public fun build(): RepositoryImage = cdkBuilder.build()
}
