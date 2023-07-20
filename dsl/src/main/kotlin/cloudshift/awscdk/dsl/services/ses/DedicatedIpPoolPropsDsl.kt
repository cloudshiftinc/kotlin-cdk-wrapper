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

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.ses.DedicatedIpPoolProps
import kotlin.String

@CdkDslMarker
public class DedicatedIpPoolPropsDsl {
    private val cdkBuilder: DedicatedIpPoolProps.Builder = DedicatedIpPoolProps.builder()

    public fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
        cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    public fun build(): DedicatedIpPoolProps = cdkBuilder.build()
}
