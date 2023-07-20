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
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.route53.PublicHostedZone
import software.constructs.Construct
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String

@CdkDslMarker
public class PublicHostedZoneDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PublicHostedZone.Builder = PublicHostedZone.Builder.create(scope, id)

    public fun addTrailingDot(addTrailingDot: Boolean) {
        cdkBuilder.addTrailingDot(addTrailingDot)
    }

    public fun caaAmazon(caaAmazon: Boolean) {
        cdkBuilder.caaAmazon(caaAmazon)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal) {
        cdkBuilder.crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal)
    }

    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String) {
        cdkBuilder.crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName)
    }

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
        cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): PublicHostedZone = cdkBuilder.build()
}
