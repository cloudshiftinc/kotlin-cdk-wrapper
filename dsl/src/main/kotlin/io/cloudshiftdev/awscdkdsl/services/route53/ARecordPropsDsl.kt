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

package io.cloudshiftdev.awscdkdsl.services.route53

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Number
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
 * import software.amazon.awscdk.services.apigateway.*;
 * HostedZone zone;
 * LambdaRestApi restApi;
 * ARecord.Builder.create(this, "AliasRecord")
 * .zone(zone)
 * .target(RecordTarget.fromAlias(new ApiGateway(restApi)))
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
     * @param multiValueAnswer Whether to return multiple values, such as IP addresses for your web
     *   servers, in response to DNS queries.
     */
    public fun multiValueAnswer(multiValueAnswer: Boolean) {
        cdkBuilder.multiValueAnswer(multiValueAnswer)
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

    /**
     * @param region The Amazon EC2 Region where you created the resource that this resource record
     *   set refers to. The resource typically is an AWS resource, such as an EC2 instance or an ELB
     *   load balancer, and is referred to by an IP address or a DNS domain name, depending on the
     *   record type.
     *
     * When Amazon Route 53 receives a DNS query for a domain name and type for which you have
     * created latency resource record sets, Route 53 selects the latency resource record set that
     * has the lowest latency between the end user and the associated Amazon EC2 Region. Route 53
     * then returns the value that is associated with the selected resource record set.
     */
    public fun region(region: String) {
        cdkBuilder.region(region)
    }

    /**
     * @param setIdentifier A string used to distinguish between different records with the same
     *   combination of DNS name and type. It can only be set when either weight or geoLocation is
     *   defined.
     *
     * This parameter must be between 1 and 128 characters in length.
     */
    public fun setIdentifier(setIdentifier: String) {
        cdkBuilder.setIdentifier(setIdentifier)
    }

    /** @param target The target. */
    public fun target(target: RecordTarget) {
        cdkBuilder.target(target)
    }

    /** @param ttl The resource record cache time to live (TTL). */
    public fun ttl(ttl: Duration) {
        cdkBuilder.ttl(ttl)
    }

    /**
     * @param weight Among resource record sets that have the same combination of DNS name and type,
     *   a value that determines the proportion of DNS queries that Amazon Route 53 responds to
     *   using the current resource record set. Route 53 calculates the sum of the weights for the
     *   resource record sets that have the same combination of DNS name and type. Route 53 then
     *   responds to queries based on the ratio of a resource's weight to the total.
     *
     * This value can be a number between 0 and 255.
     */
    public fun weight(weight: Number) {
        cdkBuilder.weight(weight)
    }

    /** @param zone The hosted zone in which to define the new record. */
    public fun zone(zone: IHostedZone) {
        cdkBuilder.zone(zone)
    }

    public fun build(): ARecordProps = cdkBuilder.build()
}
