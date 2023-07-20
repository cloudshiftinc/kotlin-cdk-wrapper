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
import software.amazon.awscdk.services.s3.StorageClass
import software.amazon.awscdk.services.s3.Transition
import java.time.Instant

@CdkDslMarker
public class TransitionDsl {
    private val cdkBuilder: Transition.Builder = Transition.builder()

    public fun storageClass(storageClass: StorageClass) {
        cdkBuilder.storageClass(storageClass)
    }

    public fun transitionAfter(transitionAfter: Duration) {
        cdkBuilder.transitionAfter(transitionAfter)
    }

    public fun transitionDate(transitionDate: Instant) {
        cdkBuilder.transitionDate(transitionDate)
    }

    public fun build(): Transition = cdkBuilder.build()
}
