@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a Route53 private hosted zone for use in one or more VPCs.
 *
 * Note that `enableDnsHostnames` and `enableDnsSupport` must have been enabled
 * for the VPC you're configuring for private hosted zones.
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
public open class PrivateHostedZone(
  cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZone,
) : HostedZone(cdkObject), IPrivateHostedZone {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrivateHostedZoneProps,
  ) :
      this(software.amazon.awscdk.services.route53.PrivateHostedZone(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(PrivateHostedZoneProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: PrivateHostedZoneProps.Builder.() -> Unit,
  ) : this(scope, id, PrivateHostedZoneProps(props)
  )

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.PrivateHostedZone].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Whether to add a trailing dot to the zone name.
     *
     * Default: true
     *
     * @param addTrailingDot Whether to add a trailing dot to the zone name. 
     */
    public fun addTrailingDot(addTrailingDot: Boolean)

    /**
     * Any comments that you want to include about the hosted zone.
     *
     * Default: none
     *
     * @param comment Any comments that you want to include about the hosted zone. 
     */
    public fun comment(comment: String)

    /**
     * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
     * logs to.
     *
     * Default: disabled
     *
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to. 
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    /**
     * A VPC that you want to associate with this hosted zone.
     *
     * Private hosted zones must be associated with at least one VPC. You can
     * associated additional VPCs using `addVpc(vpc)`.
     *
     * @param vpc A VPC that you want to associate with this hosted zone. 
     */
    public fun vpc(vpc: IVpc)

    /**
     * The name of the domain.
     *
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     *
     * @param zoneName The name of the domain. 
     */
    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.PrivateHostedZone.Builder =
        software.amazon.awscdk.services.route53.PrivateHostedZone.Builder.create(scope, id)

    /**
     * Whether to add a trailing dot to the zone name.
     *
     * Default: true
     *
     * @param addTrailingDot Whether to add a trailing dot to the zone name. 
     */
    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /**
     * Any comments that you want to include about the hosted zone.
     *
     * Default: none
     *
     * @param comment Any comments that you want to include about the hosted zone. 
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
     * logs to.
     *
     * Default: disabled
     *
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to. 
     */
    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * A VPC that you want to associate with this hosted zone.
     *
     * Private hosted zones must be associated with at least one VPC. You can
     * associated additional VPCs using `addVpc(vpc)`.
     *
     * @param vpc A VPC that you want to associate with this hosted zone. 
     */
    override fun vpc(vpc: IVpc) {
      cdkBuilder.vpc(vpc.let(IVpc::unwrap))
    }

    /**
     * The name of the domain.
     *
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     *
     * @param zoneName The name of the domain. 
     */
    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PrivateHostedZone =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromPrivateHostedZoneId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      privateHostedZoneId: String,
    ): IPrivateHostedZone =
        software.amazon.awscdk.services.route53.PrivateHostedZone.fromPrivateHostedZoneId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, privateHostedZoneId).let(IPrivateHostedZone::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PrivateHostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PrivateHostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PrivateHostedZone):
        PrivateHostedZone = PrivateHostedZone(cdkObject)

    internal fun unwrap(wrapped: PrivateHostedZone):
        software.amazon.awscdk.services.route53.PrivateHostedZone = wrapped.cdkObject as
        software.amazon.awscdk.services.route53.PrivateHostedZone
  }
}
