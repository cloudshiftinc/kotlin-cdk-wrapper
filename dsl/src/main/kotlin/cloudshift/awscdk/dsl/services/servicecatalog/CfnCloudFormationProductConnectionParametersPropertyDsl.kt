@file:Suppress("RedundantVisibilityModifier", "RedundantUnitReturnType", "RemoveRedundantQualifierName", "unused", "UnusedImport", "ClassName", "REDUNDANT_PROJECTION", "DEPRECATION")

package cloudshift.awscdk.dsl.services.servicecatalog

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.servicecatalog.CfnCloudFormationProduct

/**
 * Provides connection details.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.servicecatalog.*;
 * ConnectionParametersProperty connectionParametersProperty =
 * ConnectionParametersProperty.builder()
 * .codeStar(CodeStarParametersProperty.builder()
 * .artifactPath("artifactPath")
 * .branch("branch")
 * .connectionArn("connectionArn")
 * .repository("repository")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-servicecatalog-cloudformationproduct-connectionparameters.html)
 */
@CdkDslMarker
public class CfnCloudFormationProductConnectionParametersPropertyDsl {
    private val cdkBuilder: CfnCloudFormationProduct.ConnectionParametersProperty.Builder =
        CfnCloudFormationProduct.ConnectionParametersProperty.builder()

    /**
     * @param codeStar Provides `ConnectionType` details.
     */
    public fun codeStar(codeStar: IResolvable) {
        cdkBuilder.codeStar(codeStar)
    }

    /**
     * @param codeStar Provides `ConnectionType` details.
     */
    public fun codeStar(codeStar: CfnCloudFormationProduct.CodeStarParametersProperty) {
        cdkBuilder.codeStar(codeStar)
    }

    public fun build(): CfnCloudFormationProduct.ConnectionParametersProperty = cdkBuilder.build()
}
