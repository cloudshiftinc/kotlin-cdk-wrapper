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
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy
import kotlin.String

@CdkDslMarker
public class CfnContinuousDeploymentPolicySingleHeaderConfigPropertyDsl {
    private val cdkBuilder: CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.Builder =
        CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty.builder()

    public fun `header`(`header`: String) {
        cdkBuilder.`header`(`header`)
    }

    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnContinuousDeploymentPolicy.SingleHeaderConfigProperty = cdkBuilder.build()
}
