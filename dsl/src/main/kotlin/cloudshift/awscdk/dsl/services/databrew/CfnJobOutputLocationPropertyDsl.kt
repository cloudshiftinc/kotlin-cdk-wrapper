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

package cloudshift.awscdk.dsl.services.databrew

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.databrew.CfnJob
import kotlin.String

@CdkDslMarker
public class CfnJobOutputLocationPropertyDsl {
    private val cdkBuilder: CfnJob.OutputLocationProperty.Builder =
        CfnJob.OutputLocationProperty.builder()

    public fun bucket(bucket: String) {
        cdkBuilder.bucket(bucket)
    }

    public fun bucketOwner(bucketOwner: String) {
        cdkBuilder.bucketOwner(bucketOwner)
    }

    public fun key(key: String) {
        cdkBuilder.key(key)
    }

    public fun build(): CfnJob.OutputLocationProperty = cdkBuilder.build()
}
