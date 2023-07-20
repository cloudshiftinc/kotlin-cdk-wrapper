@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION",
)

package cloudshift.awscdk.dsl.services.ecs

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ecs.RepositoryImage
import software.amazon.awscdk.services.secretsmanager.ISecret
import kotlin.String

@CdkDslMarker
public class RepositoryImageDsl(
    imageName: String,
) {
    private val cdkBuilder: RepositoryImage.Builder = RepositoryImage.Builder.create(imageName)

    public fun credentials(credentials: ISecret) {
        cdkBuilder.credentials(credentials)
    }

    public fun build(): RepositoryImage = cdkBuilder.build()
}
