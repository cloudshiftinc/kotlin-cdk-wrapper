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
import software.amazon.awscdk.services.lambda.CfnParametersCodeProps

@CdkDslMarker
public class CfnParametersCodePropsDsl {
    private val cdkBuilder: CfnParametersCodeProps.Builder = CfnParametersCodeProps.builder()

    public fun bucketNameParam(bucketNameParam: CfnParameter) {
        cdkBuilder.bucketNameParam(bucketNameParam)
    }

    public fun objectKeyParam(objectKeyParam: CfnParameter) {
        cdkBuilder.objectKeyParam(objectKeyParam)
    }

    public fun build(): CfnParametersCodeProps = cdkBuilder.build()
}
