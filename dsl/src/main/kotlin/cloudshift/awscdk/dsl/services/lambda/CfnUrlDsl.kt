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

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lambda.CfnUrl
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnUrlDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnUrl.Builder = CfnUrl.Builder.create(scope, id)

    public fun authType(authType: String) {
        cdkBuilder.authType(authType)
    }

    public fun cors(cors: IResolvable) {
        cdkBuilder.cors(cors)
    }

    public fun cors(cors: CfnUrl.CorsProperty) {
        cdkBuilder.cors(cors)
    }

    public fun invokeMode(invokeMode: String) {
        cdkBuilder.invokeMode(invokeMode)
    }

    public fun qualifier(qualifier: String) {
        cdkBuilder.qualifier(qualifier)
    }

    public fun targetFunctionArn(targetFunctionArn: String) {
        cdkBuilder.targetFunctionArn(targetFunctionArn)
    }

    public fun build(): CfnUrl = cdkBuilder.build()
}
