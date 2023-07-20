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

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.stepfunctions.CfnStateMachine
import kotlin.String

@CdkDslMarker
public class CfnStateMachineS3LocationPropertyDsl {
    private val cdkBuilder: CfnStateMachine.S3LocationProperty.Builder =
        CfnStateMachine.S3LocationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnStateMachine.S3LocationProperty = cdkBuilder.build()
}
