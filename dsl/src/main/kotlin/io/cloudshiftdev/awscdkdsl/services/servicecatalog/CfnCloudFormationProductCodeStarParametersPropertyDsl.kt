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

package io.cloudshiftdev.awscdkdsl.services.servicecatalog

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

/**
 * The subtype containing details about the Codestar connection `Type` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * CodeStarParametersProperty codeStarParametersProperty = CodeStarParametersProperty.builder()
 * .artifactPath("artifactPath")
 * .branch("branch")
 * .connectionArn("connectionArn")
 * .repository("repository")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-codestarparameters.html)
 */
@CdkDslMarker
public class CfnCloudFormationProductCodeStarParametersPropertyDsl {
    private val cdkBuilder: CfnCloudFormationProduct.CodeStarParametersProperty.Builder =
        CfnCloudFormationProduct.CodeStarParametersProperty.builder()

    /**
     * @param artifactPath The absolute path wehre the artifact resides within the repo and branch,
     *   formatted as "folder/file.json.".
     */
    public fun artifactPath(artifactPath: String) {
        cdkBuilder.artifactPath(artifactPath)
    }

    /** @param branch The specific branch where the artifact resides. */
    public fun branch(branch: String) {
        cdkBuilder.branch(branch)
    }

    /**
     * @param connectionArn The CodeStar ARN, which is the connection between AWS Service Catalog
     *   and the external repository.
     */
    public fun connectionArn(connectionArn: String) {
        cdkBuilder.connectionArn(connectionArn)
    }

    /**
     * @param repository The specific repository where the product’s artifact-to-be-synced resides,
     *   formatted as "Account/Repo.".
     */
    public fun repository(repository: String) {
        cdkBuilder.repository(repository)
    }

    public fun build(): CfnCloudFormationProduct.CodeStarParametersProperty = cdkBuilder.build()
}
