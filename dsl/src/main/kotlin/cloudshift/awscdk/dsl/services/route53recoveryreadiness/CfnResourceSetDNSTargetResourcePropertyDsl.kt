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

package cloudshift.awscdk.dsl.services.route53recoveryreadiness

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.route53recoveryreadiness.CfnResourceSet
import kotlin.String

@CdkDslMarker
public class CfnResourceSetDNSTargetResourcePropertyDsl {
    private val cdkBuilder: CfnResourceSet.DNSTargetResourceProperty.Builder =
        CfnResourceSet.DNSTargetResourceProperty.builder()

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun hostedZoneArn(hostedZoneArn: String) {
        cdkBuilder.hostedZoneArn(hostedZoneArn)
    }

    public fun recordSetId(recordSetId: String) {
        cdkBuilder.recordSetId(recordSetId)
    }

    public fun recordType(recordType: String) {
        cdkBuilder.recordType(recordType)
    }

    public fun targetResource(targetResource: IResolvable) {
        cdkBuilder.targetResource(targetResource)
    }

    public fun targetResource(targetResource: CfnResourceSet.TargetResourceProperty) {
        cdkBuilder.targetResource(targetResource)
    }

    public fun build(): CfnResourceSet.DNSTargetResourceProperty = cdkBuilder.build()
}
