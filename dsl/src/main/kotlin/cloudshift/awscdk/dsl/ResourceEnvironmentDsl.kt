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

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.ResourceEnvironment
import kotlin.String

@CdkDslMarker
public class ResourceEnvironmentDsl {
    private val cdkBuilder: ResourceEnvironment.Builder = ResourceEnvironment.builder()

    public fun account(account: String) {
        cdkBuilder.account(account)
    }

    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    public fun build(): ResourceEnvironment = cdkBuilder.build()
}
