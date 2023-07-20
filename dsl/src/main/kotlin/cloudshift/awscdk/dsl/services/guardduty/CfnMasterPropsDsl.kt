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

package cloudshift.awscdk.dsl.services.guardduty

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.guardduty.CfnMasterProps
import kotlin.String

@CdkDslMarker
public class CfnMasterPropsDsl {
    private val cdkBuilder: CfnMasterProps.Builder = CfnMasterProps.builder()

    public fun detectorId(detectorId: String) {
        cdkBuilder.detectorId(detectorId)
    }

    public fun invitationId(invitationId: String) {
        cdkBuilder.invitationId(invitationId)
    }

    public fun masterId(masterId: String) {
        cdkBuilder.masterId(masterId)
    }

    public fun build(): CfnMasterProps = cdkBuilder.build()
}
