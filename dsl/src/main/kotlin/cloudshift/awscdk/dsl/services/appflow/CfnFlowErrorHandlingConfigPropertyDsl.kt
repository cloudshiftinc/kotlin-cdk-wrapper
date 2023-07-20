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

package cloudshift.awscdk.dsl.services.appflow

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.appflow.CfnFlow
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnFlowErrorHandlingConfigPropertyDsl {
    private val cdkBuilder: CfnFlow.ErrorHandlingConfigProperty.Builder =
        CfnFlow.ErrorHandlingConfigProperty.builder()

    public fun bucketName(bucketName: String) {
        cdkBuilder.bucketName(bucketName)
    }

    public fun bucketPrefix(bucketPrefix: String) {
        cdkBuilder.bucketPrefix(bucketPrefix)
    }

    public fun failOnFirstError(failOnFirstError: Boolean) {
        cdkBuilder.failOnFirstError(failOnFirstError)
    }

    public fun failOnFirstError(failOnFirstError: IResolvable) {
        cdkBuilder.failOnFirstError(failOnFirstError)
    }

    public fun build(): CfnFlow.ErrorHandlingConfigProperty = cdkBuilder.build()
}
