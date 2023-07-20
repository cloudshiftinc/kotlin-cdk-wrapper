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

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.route53.CfnKeySigningKey
import software.constructs.Construct
import kotlin.String

@CdkDslMarker
public class CfnKeySigningKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnKeySigningKey.Builder = CfnKeySigningKey.Builder.create(scope, id)

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun keyManagementServiceArn(keyManagementServiceArn: String) {
        cdkBuilder.keyManagementServiceArn(keyManagementServiceArn)
    }

    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    public fun build(): CfnKeySigningKey = cdkBuilder.build()
}
