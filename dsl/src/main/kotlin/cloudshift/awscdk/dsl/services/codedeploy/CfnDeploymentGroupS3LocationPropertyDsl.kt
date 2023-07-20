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

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codedeploy.CfnDeploymentGroup
import kotlin.String

@CdkDslMarker
public class CfnDeploymentGroupS3LocationPropertyDsl {
    private val cdkBuilder: CfnDeploymentGroup.S3LocationProperty.Builder =
        CfnDeploymentGroup.S3LocationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun bundleType(bundleType: String) {
        cdkBuilder.bundleType(bundleType)
    }

    public fun eTag(eTag: String) {
        cdkBuilder.eTag(eTag)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun version(version: String) {
        cdkBuilder.version(version)
    }

    public fun build(): CfnDeploymentGroup.S3LocationProperty = cdkBuilder.build()
}
