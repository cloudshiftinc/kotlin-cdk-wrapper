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
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.route53.HostedZoneProps

/**
 * Properties of a new hosted zone.
 *
 * Example:
 * ```
 * HostedZone hostedZone = HostedZone.Builder.create(this,
 * "MyHostedZone").zoneName("example.org").build();
 * Metric metric = Metric.Builder.create()
 * .namespace("AWS/Route53")
 * .metricName("DNSQueries")
 * .dimensionsMap(Map.of(
 * "HostedZoneId", hostedZone.getHostedZoneId()))
 * .build();
 * ```
 */
@CdkDslMarker
public class HostedZonePropsDsl {
    private val cdkBuilder: HostedZoneProps.Builder = HostedZoneProps.builder()

    private val _vpcs: MutableList<IVpc> = mutableListOf()

    /** @param addTrailingDot Whether to add a trailing dot to the zone name. */
    public fun addTrailingDot(addTrailingDot: Boolean) {
        cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /** @param comment Any comments that you want to include about the hosted zone. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     *   Amazon Route 53 to send query logs to.
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
        cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * @param vpcs A VPC that you want to associate with this hosted zone. When you specify this
     *   property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     */
    public fun vpcs(vararg vpcs: IVpc) {
        _vpcs.addAll(listOf(*vpcs))
    }

    /**
     * @param vpcs A VPC that you want to associate with this hosted zone. When you specify this
     *   property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     */
    public fun vpcs(vpcs: Collection<IVpc>) {
        _vpcs.addAll(vpcs)
    }

    /**
     * @param zoneName The name of the domain. For resource record types that include a domain name,
     *   specify a fully qualified domain name.
     */
    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): HostedZoneProps {
        if (_vpcs.isNotEmpty()) cdkBuilder.vpcs(_vpcs)
        return cdkBuilder.build()
    }
}
