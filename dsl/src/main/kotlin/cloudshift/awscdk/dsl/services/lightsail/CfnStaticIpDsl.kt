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

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lightsail.CfnStaticIp
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnStaticIpDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnStaticIp.Builder = CfnStaticIp.Builder.create(scope, id)

    public fun attachedTo(attachedTo: String) {
        cdkBuilder.attachedTo(attachedTo)
    }

    public fun staticIpName(staticIpName: String) {
        cdkBuilder.staticIpName(staticIpName)
    }

    public fun build(): CfnStaticIp = cdkBuilder.build()
}
