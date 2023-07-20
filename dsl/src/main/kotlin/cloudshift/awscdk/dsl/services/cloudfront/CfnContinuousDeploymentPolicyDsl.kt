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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnContinuousDeploymentPolicyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnContinuousDeploymentPolicy.Builder =
        CfnContinuousDeploymentPolicy.Builder.create(scope, id)

    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: IResolvable) {
        cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
    }

    public fun continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig: CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty) {
        cdkBuilder.continuousDeploymentPolicyConfig(continuousDeploymentPolicyConfig)
    }

    public fun build(): CfnContinuousDeploymentPolicy = cdkBuilder.build()
}
