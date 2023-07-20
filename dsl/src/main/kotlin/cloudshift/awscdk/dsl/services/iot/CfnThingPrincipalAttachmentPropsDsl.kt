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

package cloudshift.awscdk.dsl.services.iot

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.iot.CfnThingPrincipalAttachmentProps
import kotlin.String

@CdkDslMarker
public class CfnThingPrincipalAttachmentPropsDsl {
    private val cdkBuilder: CfnThingPrincipalAttachmentProps.Builder =
        CfnThingPrincipalAttachmentProps.builder()

    public fun principal(principal: String) {
        cdkBuilder.principal(principal)
    }

    public fun thingName(thingName: String) {
        cdkBuilder.thingName(thingName)
    }

    public fun build(): CfnThingPrincipalAttachmentProps = cdkBuilder.build()
}
