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
import software.amazon.awscdk.services.sagemaker.CfnApp
import kotlin.String

@CdkDslMarker
public class CfnAppResourceSpecPropertyDsl {
    private val cdkBuilder: CfnApp.ResourceSpecProperty.Builder =
        CfnApp.ResourceSpecProperty.builder()

    public fun instanceType(instanceType: String) {
        cdkBuilder.instanceType(instanceType)
    }

    public fun sageMakerImageArn(sageMakerImageArn: String) {
        cdkBuilder.sageMakerImageArn(sageMakerImageArn)
    }

    public fun sageMakerImageVersionArn(sageMakerImageVersionArn: String) {
        cdkBuilder.sageMakerImageVersionArn(sageMakerImageVersionArn)
    }

    public fun build(): CfnApp.ResourceSpecProperty = cdkBuilder.build()
}
