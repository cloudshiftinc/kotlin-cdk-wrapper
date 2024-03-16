@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit

/**
 * Properties to create a Route 53 private hosted zone.
 *
 * Example:
 *
 * ```
 * Vpc vpc;
 * PrivateHostedZone zone = PrivateHostedZone.Builder.create(this, "HostedZone")
 * .zoneName("fully.qualified.domain.com")
 * .vpc(vpc)
 * .build();
 * ```
 */
public interface PrivateHostedZoneProps : CommonHostedZoneProps {
  /**
   * A VPC that you want to associate with this hosted zone.
   *
   * Private hosted zones must be associated with at least one VPC. You can
   * associated additional VPCs using `addVpc(vpc)`.
   */
  public fun vpc(): IVpc

  /**
   * A builder for [PrivateHostedZoneProps]
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
     * @param vpc A VPC that you want to associate with this hosted zone. 
     * Private hosted zones must be associated with at least one VPC. You can
     * associated additional VPCs using `addVpc(vpc)`.
     */
    public fun vpc(vpc: IVpc)

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.PrivateHostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.PrivateHostedZoneProps.builder()

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
     * @param vpc A VPC that you want to associate with this hosted zone. 
     * Private hosted zones must be associated with at least one VPC. You can
     * associated additional VPCs using `addVpc(vpc)`.
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PrivateHostedZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZoneProps,
  ) : CdkObject(cdkObject), PrivateHostedZoneProps {
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
     * Private hosted zones must be associated with at least one VPC. You can
     * associated additional VPCs using `addVpc(vpc)`.
     */
    override fun vpc(): IVpc = unwrap(this).getVpc().let(IVpc::wrap)

    /**
     * The name of the domain.
     *
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrivateHostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZoneProps):
        PrivateHostedZoneProps = CdkObjectWrappers.wrap(cdkObject) as PrivateHostedZoneProps

    internal fun unwrap(wrapped: PrivateHostedZoneProps):
        software.amazon.awscdk.services.route53.PrivateHostedZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.PrivateHostedZoneProps
  }
}
