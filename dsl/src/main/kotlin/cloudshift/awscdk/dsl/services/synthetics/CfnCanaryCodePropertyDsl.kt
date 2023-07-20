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

package cloudshift.awscdk.dsl.services.synthetics

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.synthetics.CfnCanary
import kotlin.String

@CdkDslMarker
public class CfnCanaryCodePropertyDsl {
    private val cdkBuilder: CfnCanary.CodeProperty.Builder = CfnCanary.CodeProperty.builder()

    public fun handler(handler: String) {
        cdkBuilder.handler(handler)
    }

    public fun s3Bucket(s3Bucket: String) {
        cdkBuilder.s3Bucket(s3Bucket)
    }

    public fun s3Key(s3Key: String) {
        cdkBuilder.s3Key(s3Key)
    }

    public fun s3ObjectVersion(s3ObjectVersion: String) {
        cdkBuilder.s3ObjectVersion(s3ObjectVersion)
    }

    public fun script(script: String) {
        cdkBuilder.script(script)
    }

    public fun sourceLocationArn(sourceLocationArn: String) {
        cdkBuilder.sourceLocationArn(sourceLocationArn)
    }

    public fun build(): CfnCanary.CodeProperty = cdkBuilder.build()
}
