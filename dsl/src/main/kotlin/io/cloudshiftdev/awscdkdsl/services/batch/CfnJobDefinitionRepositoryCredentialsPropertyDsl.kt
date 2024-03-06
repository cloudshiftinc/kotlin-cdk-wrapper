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
import kotlin.String
import software.amazon.awscdk.services.batch.CfnJobDefinition

/**
 * The repository credentials for private registry authentication.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.batch.*;
 * RepositoryCredentialsProperty repositoryCredentialsProperty =
 * RepositoryCredentialsProperty.builder()
 * .credentialsParameter("credentialsParameter")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-batch-jobdefinition-repositorycredentials.html)
 */
@CdkDslMarker
public class CfnJobDefinitionRepositoryCredentialsPropertyDsl {
    private val cdkBuilder: CfnJobDefinition.RepositoryCredentialsProperty.Builder =
        CfnJobDefinition.RepositoryCredentialsProperty.builder()

    /**
     * @param credentialsParameter The Amazon Resource Name (ARN) of the secret containing the
     *   private repository credentials.
     */
    public fun credentialsParameter(credentialsParameter: String) {
        cdkBuilder.credentialsParameter(credentialsParameter)
    }

    public fun build(): CfnJobDefinition.RepositoryCredentialsProperty = cdkBuilder.build()
}
