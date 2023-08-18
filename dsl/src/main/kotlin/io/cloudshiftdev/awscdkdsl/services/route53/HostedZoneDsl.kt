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
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.route53.HostedZone
import software.constructs.Construct

/**
 * Container for records, and records contain information about how to route traffic for a specific
 * domain, such as example.com and its subdomains (acme.example.com, zenith.example.com).
 *
 * Example:
 * ```
 * HostedZone myHostedZone = HostedZone.Builder.create(this, "HostedZone")
 * .zoneName("example.com")
 * .build();
 * Certificate.Builder.create(this, "Certificate")
 * .domainName("hello.example.com")
 * .certificateName("Hello World Service") // Optionally provide an certificate name
 * .validation(CertificateValidation.fromDns(myHostedZone))
 * .build();
 * ```
 */
@CdkDslMarker
public class HostedZoneDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: HostedZone.Builder = HostedZone.Builder.create(scope, id)

    private val _vpcs: MutableList<IVpc> = mutableListOf()

    /**
     * Whether to add a trailing dot to the zone name.
     *
     * Default: true
     *
     * @param addTrailingDot Whether to add a trailing dot to the zone name.
     */
    public fun addTrailingDot(addTrailingDot: Boolean) {
        cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /**
     * Any comments that you want to include about the hosted zone.
     *
     * Default: none
     *
     * @param comment Any comments that you want to include about the hosted zone.
     */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /**
     * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
     * logs to.
     *
     * Default: disabled
     *
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     *   Amazon Route 53 to send query logs to.
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
        cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * A VPC that you want to associate with this hosted zone.
     *
     * When you specify this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     *
     * Default: public (no VPCs associated)
     *
     * @param vpcs A VPC that you want to associate with this hosted zone.
     */
    public fun vpcs(vararg vpcs: IVpc) {
        _vpcs.addAll(listOf(*vpcs))
    }

    /**
     * A VPC that you want to associate with this hosted zone.
     *
     * When you specify this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     *
     * Default: public (no VPCs associated)
     *
     * @param vpcs A VPC that you want to associate with this hosted zone.
     */
    public fun vpcs(vpcs: Collection<IVpc>) {
        _vpcs.addAll(vpcs)
    }

    /**
     * The name of the domain.
     *
     * For resource record types that include a domain name, specify a fully qualified domain name.
     *
     * @param zoneName The name of the domain.
     */
    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): HostedZone {
        if (_vpcs.isNotEmpty()) cdkBuilder.vpcs(_vpcs)
        return cdkBuilder.build()
    }
}
