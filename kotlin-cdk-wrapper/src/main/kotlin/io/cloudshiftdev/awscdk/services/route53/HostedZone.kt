@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.Resource
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.Grant
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Container for records, and records contain information about how to route traffic for a specific
 * domain, such as example.com and its subdomains (acme.example.com, zenith.example.com).
 *
 * Example:
 *
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
public open class HostedZone(
  cdkObject: software.amazon.awscdk.services.route53.HostedZone,
) : Resource(cdkObject), IHostedZone {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HostedZoneProps,
  ) :
      this(software.amazon.awscdk.services.route53.HostedZone(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(HostedZoneProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: HostedZoneProps.Builder.() -> Unit,
  ) : this(scope, id, HostedZoneProps(props)
  )

  /**
   * Add another VPC to this private hosted zone.
   *
   * @param vpc the other VPC to add. 
   */
  public open fun addVpc(vpc: IVpc) {
    unwrap(this).addVpc(vpc.let(IVpc::unwrap))
  }

  /**
   * Grant permissions to add delegation records to this zone.
   *
   * @param grantee 
   */
  public override fun grantDelegation(grantee: IGrantable): Grant =
      unwrap(this).grantDelegation(grantee.let(IGrantable::unwrap)).let(Grant::wrap)

  /**
   * ARN of this hosted zone, such as arn:${Partition}:route53:::hostedzone/${Id}.
   */
  public override fun hostedZoneArn(): String = unwrap(this).getHostedZoneArn()

  /**
   * ID of this hosted zone, such as "Z23ABC4XYZL05B".
   */
  public override fun hostedZoneId(): String = unwrap(this).getHostedZoneId()

  /**
   * Returns the set of name servers for the specific hosted zone. For example: ns1.example.com.
   *
   * This attribute will be undefined for private hosted zones or hosted zones imported from another
   * stack.
   */
  public override fun hostedZoneNameServers(): List<String> =
      unwrap(this).getHostedZoneNameServers() ?: emptyList()

  /**
   * FQDN of this hosted zone.
   */
  public override fun zoneName(): String = unwrap(this).getZoneName()

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.HostedZone].
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
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     *
     * Default: public (no VPCs associated)
     *
     * @param vpcs A VPC that you want to associate with this hosted zone. 
     */
    public fun vpcs(vpcs: List<IVpc>)

    /**
     * A VPC that you want to associate with this hosted zone.
     *
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     *
     * Default: public (no VPCs associated)
     *
     * @param vpcs A VPC that you want to associate with this hosted zone. 
     */
    public fun vpcs(vararg vpcs: IVpc)

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
    private val cdkBuilder: software.amazon.awscdk.services.route53.HostedZone.Builder =
        software.amazon.awscdk.services.route53.HostedZone.Builder.create(scope, id)

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
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     *
     * Default: public (no VPCs associated)
     *
     * @param vpcs A VPC that you want to associate with this hosted zone. 
     */
    override fun vpcs(vpcs: List<IVpc>) {
      cdkBuilder.vpcs(vpcs.map(IVpc::unwrap))
    }

    /**
     * A VPC that you want to associate with this hosted zone.
     *
     * When you specify
     * this property, a private hosted zone will be created.
     *
     * You can associate additional VPCs to this private zone using `addVpc(vpc)`.
     *
     * Default: public (no VPCs associated)
     *
     * @param vpcs A VPC that you want to associate with this hosted zone. 
     */
    override fun vpcs(vararg vpcs: IVpc): Unit = vpcs(vpcs.toList())

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

    public fun build(): software.amazon.awscdk.services.route53.HostedZone = cdkBuilder.build()
  }

  public companion object {
    public fun fromHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HostedZoneAttributes,
    ): IHostedZone =
        software.amazon.awscdk.services.route53.HostedZone.fromHostedZoneAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(HostedZoneAttributes::unwrap)).let(IHostedZone::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("ec7a6041c2e75e630a70fa110a2369053e8a0554dd6c63d11cfc004e3770592a")
    public fun fromHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: HostedZoneAttributes.Builder.() -> Unit,
    ): IHostedZone = fromHostedZoneAttributes(scope, id, HostedZoneAttributes(attrs))

    public fun fromHostedZoneId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      hostedZoneId: String,
    ): IHostedZone =
        software.amazon.awscdk.services.route53.HostedZone.fromHostedZoneId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, hostedZoneId).let(IHostedZone::wrap)

    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      query: HostedZoneProviderProps,
    ): IHostedZone =
        software.amazon.awscdk.services.route53.HostedZone.fromLookup(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, query.let(HostedZoneProviderProps::unwrap)).let(IHostedZone::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("1f3c8afe809bef1b11863ef5f2169db51c709530a321c9ba303e6b29bcd9690a")
    public fun fromLookup(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      query: HostedZoneProviderProps.Builder.() -> Unit,
    ): IHostedZone = fromLookup(scope, id, HostedZoneProviderProps(query))

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): HostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return HostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.HostedZone): HostedZone =
        HostedZone(cdkObject)

    internal fun unwrap(wrapped: HostedZone): software.amazon.awscdk.services.route53.HostedZone =
        wrapped.cdkObject as software.amazon.awscdk.services.route53.HostedZone
  }
}
