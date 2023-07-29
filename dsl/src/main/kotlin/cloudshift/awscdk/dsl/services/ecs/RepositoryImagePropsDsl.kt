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
import software.amazon.awscdk.services.ecs.RepositoryImageProps
import software.amazon.awscdk.services.secretsmanager.ISecret

/**
 * The properties for an image hosted in a public or private repository.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.ecs.*;
 * import software.amazon.awscdk.services.secretsmanager.*;
 * Secret secret;
 * RepositoryImageProps repositoryImageProps = RepositoryImageProps.builder()
 * .credentials(secret)
 * .build();
 * ```
 */
@CdkDslMarker
public class RepositoryImagePropsDsl {
    private val cdkBuilder: RepositoryImageProps.Builder = RepositoryImageProps.builder()

    /**
     * @param credentials The secret to expose to the container that contains the credentials for
     *   the image repository. The supported value is the full ARN of an AWS Secrets Manager secret.
     */
    public fun credentials(credentials: ISecret) {
        cdkBuilder.credentials(credentials)
    }

    public fun build(): RepositoryImageProps = cdkBuilder.build()
}
