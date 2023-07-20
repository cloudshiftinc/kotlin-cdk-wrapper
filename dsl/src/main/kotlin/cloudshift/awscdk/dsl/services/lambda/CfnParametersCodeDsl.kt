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
import software.amazon.awscdk.CfnParameter
import software.amazon.awscdk.services.lambda.CfnParametersCode

@CdkDslMarker
public class CfnParametersCodeDsl {
    private val cdkBuilder: CfnParametersCode.Builder = CfnParametersCode.Builder.create()

    public fun bucketNameParam(bucketNameParam: CfnParameter) {
        cdkBuilder.bucketNameParam(bucketNameParam)
    }

    public fun objectKeyParam(objectKeyParam: CfnParameter) {
        cdkBuilder.objectKeyParam(objectKeyParam)
    }

    public fun build(): CfnParametersCode = cdkBuilder.build()
}
