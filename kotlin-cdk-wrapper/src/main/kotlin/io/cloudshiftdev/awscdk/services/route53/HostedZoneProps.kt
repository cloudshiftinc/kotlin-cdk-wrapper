@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties of a new hosted zone.
 *
 * Example:
 *
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
public interface HostedZoneProps : CommonHostedZoneProps {
  /**
   * A VPC that you want to associate with this hosted zone.
   *
   * When you specify
   * this property, a private hosted zone will be created.
   *
   * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
   *
   * Default: public (no VPCs associated)
   */
  public fun vpcs(): List<IVpc> = unwrap(this).getVpcs()?.map(IVpc::wrap) ?: emptyList()

  /**
   * A builder for [HostedZoneProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addTrailingDot Whether to add a trailing dot to the zone name.
     */
    public fun addTrailingDot(addTrailingDot: Boolean)

    /**
     * @param comment Any comments that you want to include about the hosted zone.
     */
    public fun comment(comment: String)

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to.
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    /**
     * @param vpcs A VPC that you want to associate with this hosted zone.
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     */
    public fun vpcs(vpcs: List<IVpc>)

    /**
     * @param vpcs A VPC that you want to associate with this hosted zone.
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     */
    public fun vpcs(vararg vpcs: IVpc)

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.HostedZoneProps.builder()

    /**
     * @param addTrailingDot Whether to add a trailing dot to the zone name.
     */
    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /**
     * @param comment Any comments that you want to include about the hosted zone.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to.
     */
    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * @param vpcs A VPC that you want to associate with this hosted zone.
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     */
    override fun vpcs(vpcs: List<IVpc>) {
      cdkBuilder.vpcs(vpcs.map(IVpc::unwrap))
    }

    /**
     * @param vpcs A VPC that you want to associate with this hosted zone.
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     */
    override fun vpcs(vararg vpcs: IVpc): Unit = vpcs(vpcs.toList())

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.HostedZoneProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.HostedZoneProps,
  ) : CdkObject(cdkObject), HostedZoneProps {
    /**
     * Whether to add a trailing dot to the zone name.
     *
     * Default: true
     */
    override fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

    /**
     * Any comments that you want to include about the hosted zone.
     *
     * Default: none
     */
    override fun comment(): String? = unwrap(this).getComment()

    /**
     * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
     * logs to.
     *
     * Default: disabled
     */
    override fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

    /**
     * A VPC that you want to associate with this hosted zone.
     *
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     *
     * Default: public (no VPCs associated)
     */
    override fun vpcs(): List<IVpc> = unwrap(this).getVpcs()?.map(IVpc::wrap) ?: emptyList()

    /**
     * The name of the domain.
     *
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): HostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZoneProps):
        HostedZoneProps = CdkObjectWrappers.wrap(cdkObject) as? HostedZoneProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: HostedZoneProps):
        software.amazon.awscdk.services.route53.HostedZoneProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.route53.HostedZoneProps
  }
}
