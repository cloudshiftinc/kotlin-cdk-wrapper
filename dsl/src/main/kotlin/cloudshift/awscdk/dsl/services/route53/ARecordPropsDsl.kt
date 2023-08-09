@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.ARecordProps
import software.amazon.awscdk.services.route53.GeoLocation
import software.amazon.awscdk.services.route53.IHostedZone
import software.amazon.awscdk.services.route53.RecordTarget

/**
 * Construction properties for a ARecord.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.apigatewayv2.alpha.*;
 * HostedZone zone;
 * DomainName domainName;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new
 * ApiGatewayv2DomainProperties(domainName.getRegionalDomainName(),
 * domainName.getRegionalHostedZoneId())))
 * .build();
 * ```
 */
@CdkDslMarker
public class ARecordPropsDsl {
    private val cdkBuilder: ARecordProps.Builder = ARecordProps.builder()

    /** @param comment A comment to add on the record. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
     *   exists (dangerous!). This allows to deploy a new record set while minimizing the downtime
     *   because the new record set will be created immediately after the existing one is deleted.
     *   It also avoids "manual" actions to delete existing record sets.
     *
     * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
     * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing an
     * existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment will
     * delete the record!
     */
    public fun deleteExisting(deleteExisting: Boolean) {
        cdkBuilder.deleteExisting(deleteExisting)
    }

    /**
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     *   user's location.
     */
    public fun geoLocation(geoLocation: GeoLocation) {
        cdkBuilder.geoLocation(geoLocation)
    }

    /**
     * @param recordName The subdomain name for this record. This should be relative to the zone
     *   root name. For example, if you want to create a record for acme.example.com, specify
     *   "acme".
     *
     * You can also specify the fully qualified domain name which terminates with a ".". For
     * example, "acme.example.com.".
     */
    public fun recordName(recordName: String) {
        cdkBuilder.recordName(recordName)
    }

    /** @param target The target. */
    public fun target(target: RecordTarget) {
        cdkBuilder.target(target)
    }

    /** @param ttl The resource record cache time to live (TTL). */
    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    /** @param zone The hosted zone in which to define the new record. */
    public fun zone(zone: IHostedZone) {
        cdkBuilder.zone(zone)
    }

    public fun build(): ARecordProps = cdkBuilder.build()
}
