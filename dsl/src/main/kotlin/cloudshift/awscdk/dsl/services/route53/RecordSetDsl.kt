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
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.RecordSet
import software.amazon.awscdk.services.route53.RecordTarget
import software.amazon.awscdk.services.route53.RecordType
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class RecordSetDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: RecordSet.Builder = RecordSet.Builder.create(scope, id)

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun deleteExisting(deleteExisting: Boolean) {
        cdkBuilder.deleteExisting(deleteExisting)
    }

    public fun recordName(recordName: String) {
        cdkBuilder.recordName(recordName)
    }

    public fun recordType(recordType: RecordType) {
        cdkBuilder.recordType(recordType)
    }

    public fun target(target: RecordTarget) {
        cdkBuilder.target(target)
    }

    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun zone(zone: IHostedZone) {
        cdkBuilder.zone(zone)
    }

    public fun build(): RecordSet = cdkBuilder.build()
}
