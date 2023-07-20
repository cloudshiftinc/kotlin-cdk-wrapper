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
import software.amazon.awscdk.services.sagemaker.CfnDomain
import kotlin.String

@CdkDslMarker
public class CfnDomainResourceSpecPropertyDsl {
    private val cdkBuilder: CfnDomain.ResourceSpecProperty.Builder =
        CfnDomain.ResourceSpecProperty.builder()

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun lifecycleConfigArn(lifecycleConfigArn: String) {
        cdkBuilder.lifecycleConfigArn(lifecycleConfigArn)
    }

    public fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
    }

    public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
    }

    public fun build(): CfnDomain.ResourceSpecProperty = cdkBuilder.build()
}
