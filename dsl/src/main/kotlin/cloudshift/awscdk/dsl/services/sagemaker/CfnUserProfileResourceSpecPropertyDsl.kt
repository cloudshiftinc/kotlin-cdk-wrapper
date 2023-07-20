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

package cloudshift.awscdk.dsl.services.sagemaker

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.sagemaker.CfnUserProfile
import kotlin.String

@CdkDslMarker
public class CfnUserProfileResourceSpecPropertyDsl {
    private val cdkBuilder: CfnUserProfile.ResourceSpecProperty.Builder =
        CfnUserProfile.ResourceSpecProperty.builder()

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
    }

    public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
    }

    public fun build(): CfnUserProfile.ResourceSpecProperty = cdkBuilder.build()
}
