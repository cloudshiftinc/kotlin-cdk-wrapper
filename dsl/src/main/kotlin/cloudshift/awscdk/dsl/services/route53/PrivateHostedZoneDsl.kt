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
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.route53.PrivateHostedZone
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class PrivateHostedZoneDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PrivateHostedZone.Builder = PrivateHostedZone.Builder.create(scope, id)

    public fun addTrailingDot(addTrailingDot: Boolean) {
        cdkBuilder.addTrailingDot(addTrailingDot)
    }

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
        cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    public fun vpc(vpc: IVpc) {
        cdkBuilder.vpc(vpc)
    }

    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): PrivateHostedZone = cdkBuilder.build()
}
