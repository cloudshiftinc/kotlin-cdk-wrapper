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
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53.CfnRecordSet
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CfnRecordSetAliasTargetPropertyDsl {
    private val cdkBuilder: CfnRecordSet.AliasTargetProperty.Builder =
        CfnRecordSet.AliasTargetProperty.builder()

    public fun dnsName(dnsName: String) {
        cdkBuilder.dnsName(dnsName)
    }

    public fun evaluateTargetHealth(evaluateTargetHealth: Boolean) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
    }

    public fun evaluateTargetHealth(evaluateTargetHealth: IResolvable) {
        cdkBuilder.evaluateTargetHealth(evaluateTargetHealth)
    }

    public fun hostedZoneId(hostedZoneId: String) {
        cdkBuilder.hostedZoneId(hostedZoneId)
    }

    public fun build(): CfnRecordSet.AliasTargetProperty = cdkBuilder.build()
}
