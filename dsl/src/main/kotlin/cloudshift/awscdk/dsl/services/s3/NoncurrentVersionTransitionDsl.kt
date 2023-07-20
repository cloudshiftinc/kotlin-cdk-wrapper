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

package cloudshift.awscdk.dsl.services.s3

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.s3.NoncurrentVersionTransition
import software.amazon.awscdk.services.s3.StorageClass
import kotlin.Number

@CdkDslMarker
public class NoncurrentVersionTransitionDsl {
    private val cdkBuilder: NoncurrentVersionTransition.Builder =
        NoncurrentVersionTransition.builder()

    public fun noncurrentVersionsToRetain(noncurrentVersionsToRetain: Number) {
        cdkBuilder.noncurrentVersionsToRetain(noncurrentVersionsToRetain)
    }

    public fun storageClass(storageClass: StorageClass) {
        cdkBuilder.storageClass(storageClass)
    }

    public fun transitionAfter(transitionAfter: Duration) {
        cdkBuilder.transitionAfter(transitionAfter)
    }

    public fun build(): NoncurrentVersionTransition = cdkBuilder.build()
}
