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

package cloudshift.awscdk.dsl.services.apigatewayv2

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.apigatewayv2.CfnDeploymentProps

/**
 * Properties for defining a `CfnDeployment`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigatewayv2.*;
 * CfnDeploymentProps cfnDeploymentProps = CfnDeploymentProps.builder()
 * .apiId("apiId")
 * // the properties below are optional
 * .description("description")
 * .stageName("stageName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigatewayv2-deployment.html)
 */
@CdkDslMarker
public class CfnDeploymentPropsDsl {
    private val cdkBuilder: CfnDeploymentProps.Builder = CfnDeploymentProps.builder()

    /** @param apiId The API identifier. */
    public fun apiId(apiId: String) {
        cdkBuilder.apiId(apiId)
    }

    /** @param description The description for the deployment resource. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param stageName The name of an existing stage to associate with the deployment. */
    public fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
    }

    public fun build(): CfnDeploymentProps = cdkBuilder.build()
}
