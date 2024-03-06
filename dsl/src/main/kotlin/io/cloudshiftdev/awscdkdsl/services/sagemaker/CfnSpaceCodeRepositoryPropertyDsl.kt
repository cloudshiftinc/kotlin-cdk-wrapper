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
import software.amazon.awscdk.services.sagemaker.CfnSpace

/**
 * A Git repository that SageMaker automatically displays to users for cloning in the JupyterServer
 * application.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sagemaker.*;
 * CodeRepositoryProperty codeRepositoryProperty = CodeRepositoryProperty.builder()
 * .repositoryUrl("repositoryUrl")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-space-coderepository.html)
 */
@CdkDslMarker
public class CfnSpaceCodeRepositoryPropertyDsl {
    private val cdkBuilder: CfnSpace.CodeRepositoryProperty.Builder =
        CfnSpace.CodeRepositoryProperty.builder()

    /** @param repositoryUrl The URL of the Git repository. */
    public fun repositoryUrl(repositoryUrl: String) {
        cdkBuilder.repositoryUrl(repositoryUrl)
    }

    public fun build(): CfnSpace.CodeRepositoryProperty = cdkBuilder.build()
}
