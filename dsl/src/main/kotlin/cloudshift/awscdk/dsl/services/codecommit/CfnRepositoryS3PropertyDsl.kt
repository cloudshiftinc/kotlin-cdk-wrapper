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

package cloudshift.awscdk.dsl.services.codecommit

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.codecommit.CfnRepository
import kotlin.String

@CdkDslMarker
public class CfnRepositoryS3PropertyDsl {
    private val cdkBuilder: CfnRepository.S3Property.Builder = CfnRepository.S3Property.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun objectVersion(objectVersion: String) {
        cdkBuilder.objectVersion(objectVersion)
    }

    public fun build(): CfnRepository.S3Property = cdkBuilder.build()
}
