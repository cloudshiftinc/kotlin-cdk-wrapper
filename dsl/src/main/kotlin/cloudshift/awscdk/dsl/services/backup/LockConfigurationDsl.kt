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

package cloudshift.awscdk.dsl.services.backup

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.backup.LockConfiguration

@CdkDslMarker
public class LockConfigurationDsl {
    private val cdkBuilder: LockConfiguration.Builder = LockConfiguration.builder()

    public fun changeableFor(changeableFor: Duration) {
        cdkBuilder.changeableFor(changeableFor)
    }

    public fun maxRetention(maxRetention: Duration) {
        cdkBuilder.maxRetention(maxRetention)
    }

    public fun minRetention(minRetention: Duration) {
        cdkBuilder.minRetention(minRetention)
    }

    public fun build(): LockConfiguration = cdkBuilder.build()
}
