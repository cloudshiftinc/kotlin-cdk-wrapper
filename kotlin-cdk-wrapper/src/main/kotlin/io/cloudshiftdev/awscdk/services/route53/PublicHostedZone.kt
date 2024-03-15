@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.ec2.IVpc
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import io.cloudshiftdev.awscdk.services.iam.Role
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Create a Route53 public hosted zone.
 *
 * Example:
 *
 * ```
 * Stack stack1 = Stack.Builder.create(app, "Stack1")
 * .env(Environment.builder()
 * .region("us-east-1")
 * .build())
 * .crossRegionReferences(true)
 * .build();
 * Certificate cert = Certificate.Builder.create(stack1, "Cert")
 * .domainName("*.example.com")
 * .validation(CertificateValidation.fromDns(PublicHostedZone.fromHostedZoneId(stack1, "Zone",
 * "Z0329774B51CGXTDQV3X")))
 * .build();
 * Stack stack2 = Stack.Builder.create(app, "Stack2")
 * .env(Environment.builder()
 * .region("us-east-2")
 * .build())
 * .crossRegionReferences(true)
 * .build();
 * Distribution.Builder.create(stack2, "Distribution")
 * .defaultBehavior(BehaviorOptions.builder()
 * .origin(new HttpOrigin("example.com"))
 * .build())
 * .domainNames(List.of("dev.example.com"))
 * .certificate(cert)
 * .build();
 * ```
 */
public open class PublicHostedZone internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.route53.PublicHostedZone,
) : HostedZone(cdkObject), IPublicHostedZone {
  /**
   * Adds a delegation from this zone to a designated zone.
   *
   * @param delegate the zone being delegated to. 
   * @param opts options for creating the DNS record, if any.
   */
  public open fun addDelegation(`delegate`: IPublicHostedZone) {
    unwrap(this).addDelegation(`delegate`.let(IPublicHostedZone::unwrap))
  }

  /**
   * Adds a delegation from this zone to a designated zone.
   *
   * @param delegate the zone being delegated to. 
   * @param opts options for creating the DNS record, if any.
   */
  public open fun addDelegation(`delegate`: IPublicHostedZone, opts: ZoneDelegationOptions) {
    unwrap(this).addDelegation(`delegate`.let(IPublicHostedZone::unwrap),
        opts.let(ZoneDelegationOptions::unwrap))
  }

  /**
   * Adds a delegation from this zone to a designated zone.
   *
   * @param delegate the zone being delegated to. 
   * @param opts options for creating the DNS record, if any.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b3fd65481d9aa885e9f4806ffe91bda7013b73dd21fe06d445e0d0b3ec8027f9")
  public open fun addDelegation(`delegate`: IPublicHostedZone,
      opts: ZoneDelegationOptions.Builder.() -> Unit): Unit = addDelegation(`delegate`,
      ZoneDelegationOptions(opts))

  /**
   * Add another VPC to this private hosted zone.
   *
   * @param _vpc 
   */
  public override fun addVpc(_vpc: IVpc) {
    unwrap(this).addVpc(_vpc.let(IVpc::unwrap))
  }

  /**
   * Role for cross account zone delegation.
   */
  public open fun crossAccountZoneDelegationRole(): Role? =
      unwrap(this).getCrossAccountZoneDelegationRole()?.let(Role::wrap)

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.route53.PublicHostedZone].
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
     * Whether to create a CAA record to restrict certificate authorities allowed to issue
     * certificates for this domain to Amazon only.
     *
     * Default: false
     *
     * @param caaAmazon Whether to create a CAA record to restrict certificate authorities allowed
     * to issue certificates for this domain to Amazon only. 
     */
    public fun caaAmazon(caaAmazon: Boolean)

    /**
     * Any comments that you want to include about the hosted zone.
     *
     * Default: none
     *
     * @param comment Any comments that you want to include about the hosted zone. 
     */
    public fun comment(comment: String)

    /**
     * (deprecated) A principal which is trusted to assume a role for zone delegation.
     *
     * If supplied, this will create a Role in the same account as the Hosted
     * Zone, which can be assumed by the `CrossAccountZoneDelegationRecord` to
     * create a delegation record to a zone in a different account.
     *
     * Be sure to indicate the account(s) that you trust to create delegation
     * records, using either `iam.AccountPrincipal` or `iam.OrganizationPrincipal`.
     *
     * If you are planning to use `iam.ServicePrincipal`s here, be sure to include
     * region-specific service principals for every opt-in region you are going to
     * be delegating to; or don't use this feature and create separate roles
     * with appropriate permissions for every opt-in region instead.
     *
     * Default: - No delegation configuration
     *
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     * @param crossAccountZoneDelegationPrincipal A principal which is trusted to assume a role for
     * zone delegation. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal)

    /**
     * (deprecated) The name of the role created for cross account delegation.
     *
     * Default: - A role name is generated automatically
     *
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     * @param crossAccountZoneDelegationRoleName The name of the role created for cross account
     * delegation. 
     */
    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String)

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
    private val cdkBuilder: software.amazon.awscdk.services.route53.PublicHostedZone.Builder =
        software.amazon.awscdk.services.route53.PublicHostedZone.Builder.create(scope, id)

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
     * Whether to create a CAA record to restrict certificate authorities allowed to issue
     * certificates for this domain to Amazon only.
     *
     * Default: false
     *
     * @param caaAmazon Whether to create a CAA record to restrict certificate authorities allowed
     * to issue certificates for this domain to Amazon only. 
     */
    override fun caaAmazon(caaAmazon: Boolean) {
      cdkBuilder.caaAmazon(caaAmazon)
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
     * (deprecated) A principal which is trusted to assume a role for zone delegation.
     *
     * If supplied, this will create a Role in the same account as the Hosted
     * Zone, which can be assumed by the `CrossAccountZoneDelegationRecord` to
     * create a delegation record to a zone in a different account.
     *
     * Be sure to indicate the account(s) that you trust to create delegation
     * records, using either `iam.AccountPrincipal` or `iam.OrganizationPrincipal`.
     *
     * If you are planning to use `iam.ServicePrincipal`s here, be sure to include
     * region-specific service principals for every opt-in region you are going to
     * be delegating to; or don't use this feature and create separate roles
     * with appropriate permissions for every opt-in region instead.
     *
     * Default: - No delegation configuration
     *
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     * @param crossAccountZoneDelegationPrincipal A principal which is trusted to assume a role for
     * zone delegation. 
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal) {
      cdkBuilder.crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal.let(IPrincipal::unwrap))
    }

    /**
     * (deprecated) The name of the role created for cross account delegation.
     *
     * Default: - A role name is generated automatically
     *
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     * @param crossAccountZoneDelegationRoleName The name of the role created for cross account
     * delegation. 
     */
    @Deprecated(message = "deprecated in CDK")
    override fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String) {
      cdkBuilder.crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName)
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

    public fun build(): software.amazon.awscdk.services.route53.PublicHostedZone =
        cdkBuilder.build()
  }

  public companion object {
    public fun fromPublicHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicHostedZoneAttributes,
    ): IPublicHostedZone =
        software.amazon.awscdk.services.route53.PublicHostedZone.fromPublicHostedZoneAttributes(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, attrs.let(PublicHostedZoneAttributes::unwrap)).let(IPublicHostedZone::wrap)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("06cb4baac981ad1dbf446227d98c9cfd34ba1dbb37d9b99936ef13730db60f6b")
    public fun fromPublicHostedZoneAttributes(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      attrs: PublicHostedZoneAttributes.Builder.() -> Unit,
    ): IPublicHostedZone = fromPublicHostedZoneAttributes(scope, id,
        PublicHostedZoneAttributes(attrs))

    public fun fromPublicHostedZoneId(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      publicHostedZoneId: String,
    ): IPublicHostedZone =
        software.amazon.awscdk.services.route53.PublicHostedZone.fromPublicHostedZoneId(scope.let(CloudshiftdevConstructsConstruct::unwrap),
        id, publicHostedZoneId).let(IPublicHostedZone::wrap)

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): PublicHostedZone {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return PublicHostedZone(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PublicHostedZone):
        PublicHostedZone = PublicHostedZone(cdkObject)

    internal fun unwrap(wrapped: PublicHostedZone):
        software.amazon.awscdk.services.route53.PublicHostedZone = wrapped.cdkObject
  }
}
