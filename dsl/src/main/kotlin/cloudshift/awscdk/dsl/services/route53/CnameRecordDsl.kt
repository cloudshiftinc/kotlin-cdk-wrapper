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
import software.amazon.awscdk.services.route53.CnameRecord
import software.amazon.awscdk.services.route53.IHostedZone
import software.constructs.Construct
import kotlin.Boolean
import kotlin.String

@CdkDslMarker
public class CnameRecordDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CnameRecord.Builder = CnameRecord.Builder.create(scope, id)

    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    public fun deleteExisting(deleteExisting: Boolean) {
        cdkBuilder.deleteExisting(deleteExisting)
    }

    public fun domainName(domainName: String) {
        cdkBuilder.domainName(domainName)
    }

    public fun recordName(recordName: String) {
        cdkBuilder.recordName(recordName)
    }

    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    public fun zone(zone: IHostedZone) {
        cdkBuilder.zone(zone)
    }

    public fun build(): CnameRecord = cdkBuilder.build()
}
