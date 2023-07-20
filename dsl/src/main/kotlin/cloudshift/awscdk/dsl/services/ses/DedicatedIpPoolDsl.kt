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
import software.amazon.awscdk.services.ses.DedicatedIpPool
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class DedicatedIpPoolDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DedicatedIpPool.Builder = DedicatedIpPool.Builder.create(scope, id)

    public fun dedicatedIpPoolName(dedicatedIpPoolName: String) {
        cdkBuilder.dedicatedIpPoolName(dedicatedIpPoolName)
    }

    public fun build(): DedicatedIpPool = cdkBuilder.build()
}
