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
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.Duration
import software.amazon.awscdk.services.route53.DsRecord
import software.amazon.awscdk.services.route53.GeoLocation
import software.amazon.awscdk.services.route53.IHostedZone
import software.constructs.Construct

/**
 * A DNS DS record.
 *
 * Example:
 * ```
 * HostedZone myZone;
 * DsRecord.Builder.create(this, "DSRecord")
 * .zone(myZone)
 * .recordName("foo")
 * .values(List.of("12345 3 1 123456789abcdef67890123456789abcdef67890"))
 * .ttl(Duration.minutes(90))
 * .build();
 * ```
 */
@CdkDslMarker
public class DsRecordDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: DsRecord.Builder = DsRecord.Builder.create(scope, id)

    private val _values: MutableList<String> = mutableListOf()

    /**
     * A comment to add on the record.
     *
     * Default: no comment
     *
     * @param comment A comment to add on the record.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * Whether to delete the same record set in the hosted zone if it already exists (dangerous!).
     *
     * This allows to deploy a new record set while minimizing the downtime because the new record
     * set will be created immediately after the existing one is deleted. It also avoids "manual"
     * actions to delete existing record sets.
     *
     * **N.B.:** this feature is dangerous, use with caution! It can only be used safely when
     * `deleteExisting` is set to `true` as soon as the resource is added to the stack. Changing an
     * existing Record Set's `deleteExisting` property from `false -&gt; true` after deployment will
     * delete the record!
     *
     * Default: false
     *
     * @param deleteExisting Whether to delete the same record set in the hosted zone if it already
     *   exists (dangerous!).
     */
    public fun deleteExisting(deleteExisting: Boolean) {
        cdkBuilder.deleteExisting(deleteExisting)
    }

    /**
     * The geographical origin for this record to return DNS records based on the user's location.
     *
     * @param geoLocation The geographical origin for this record to return DNS records based on the
     *   user's location.
     */
    public fun geoLocation(geoLocation: GeoLocation) {
        cdkBuilder.geoLocation(geoLocation)
    }

    /**
     * The subdomain name for this record. This should be relative to the zone root name.
     *
     * For example, if you want to create a record for acme.example.com, specify "acme".
     *
     * You can also specify the fully qualified domain name which terminates with a ".". For
     * example, "acme.example.com.".
     *
     * Default: zone root
     *
     * @param recordName The subdomain name for this record. This should be relative to the zone
     *   root name.
     */
    public fun recordName(recordName: String) {
        cdkBuilder.recordName(recordName)
    }

    /**
     * The resource record cache time to live (TTL).
     *
     * Default: Duration.minutes(30)
     *
     * @param ttl The resource record cache time to live (TTL).
     */
    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    /**
     * The DS values.
     *
     * @param values The DS values.
     */
    public fun values(vararg values: String) {
        _values.addAll(listOf(*values))
    }

    /**
     * The DS values.
     *
     * @param values The DS values.
     */
    public fun values(values: Collection<String>) {
        _values.addAll(values)
    }

    /**
     * The hosted zone in which to define the new record.
     *
     * @param zone The hosted zone in which to define the new record.
     */
    public fun zone(zone: IHostedZone) {
        cdkBuilder.zone(zone)
    }

    public fun build(): DsRecord {
        if (_values.isNotEmpty()) cdkBuilder.values(_values)
        return cdkBuilder.build()
    }
}
