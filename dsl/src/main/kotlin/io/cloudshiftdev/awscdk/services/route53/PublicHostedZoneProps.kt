package io.cloudshiftdev.awscdk.services.route53

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.services.iam.IPrincipal
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import kotlin.Unit

public interface PublicHostedZoneProps : CommonHostedZoneProps {
  /**
   * Whether to create a CAA record to restrict certificate authorities allowed to issue
   * certificates for this domain to Amazon only.
   *
   * Default: false
   */
  public fun caaAmazon(): Boolean? = unwrap(this).getCaaAmazon()

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
   */
  @Deprecated(message = "deprecated in CDK")
  public fun crossAccountZoneDelegationPrincipal(): IPrincipal? =
      unwrap(this).getCrossAccountZoneDelegationPrincipal()?.let(IPrincipal::wrap)

  /**
   * (deprecated) The name of the role created for cross account delegation.
   *
   * Default: - A role name is generated automatically
   *
   * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun crossAccountZoneDelegationRoleName(): String? =
      unwrap(this).getCrossAccountZoneDelegationRoleName()

  /**
   * A builder for [PublicHostedZoneProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param addTrailingDot Whether to add a trailing dot to the zone name.
     */
    public fun addTrailingDot(addTrailingDot: Boolean)

    /**
     * @param caaAmazon Whether to create a CAA record to restrict certificate authorities allowed
     * to issue certificates for this domain to Amazon only.
     */
    public fun caaAmazon(caaAmazon: Boolean)

    /**
     * @param comment Any comments that you want to include about the hosted zone.
     */
    public fun comment(comment: String)

    /**
     * @param crossAccountZoneDelegationPrincipal A principal which is trusted to assume a role for
     * zone delegation.
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
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal)

    /**
     * @param crossAccountZoneDelegationRoleName The name of the role created for cross account
     * delegation.
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String)

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to.
     */
    public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String)

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    public fun zoneName(zoneName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.route53.PublicHostedZoneProps.Builder =
        software.amazon.awscdk.services.route53.PublicHostedZoneProps.builder()

    /**
     * @param addTrailingDot Whether to add a trailing dot to the zone name.
     */
    override fun addTrailingDot(addTrailingDot: Boolean) {
      cdkBuilder.addTrailingDot(addTrailingDot)
    }

    /**
     * @param caaAmazon Whether to create a CAA record to restrict certificate authorities allowed
     * to issue certificates for this domain to Amazon only.
     */
    override fun caaAmazon(caaAmazon: Boolean) {
      cdkBuilder.caaAmazon(caaAmazon)
    }

    /**
     * @param comment Any comments that you want to include about the hosted zone.
     */
    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    /**
     * @param crossAccountZoneDelegationPrincipal A principal which is trusted to assume a role for
     * zone delegation.
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
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     */
    @Deprecated(message = "deprecated in CDK")
    override
        fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal) {
      cdkBuilder.crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal.let(IPrincipal::unwrap))
    }

    /**
     * @param crossAccountZoneDelegationRoleName The name of the role created for cross account
     * delegation.
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String) {
      cdkBuilder.crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName)
    }

    /**
     * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
     * Amazon Route 53 to send query logs to.
     */
    override fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
      cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
    }

    /**
     * @param zoneName The name of the domain. 
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(zoneName: String) {
      cdkBuilder.zoneName(zoneName)
    }

    public fun build(): software.amazon.awscdk.services.route53.PublicHostedZoneProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneProps,
  ) : CdkObject(cdkObject), PublicHostedZoneProps {
    /**
     * Whether to add a trailing dot to the zone name.
     *
     * Default: true
     */
    override fun addTrailingDot(): Boolean? = unwrap(this).getAddTrailingDot()

    /**
     * Whether to create a CAA record to restrict certificate authorities allowed to issue
     * certificates for this domain to Amazon only.
     *
     * Default: false
     */
    override fun caaAmazon(): Boolean? = unwrap(this).getCaaAmazon()

    /**
     * Any comments that you want to include about the hosted zone.
     *
     * Default: none
     */
    override fun comment(): String? = unwrap(this).getComment()

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
     */
    @Deprecated(message = "deprecated in CDK")
    override fun crossAccountZoneDelegationPrincipal(): IPrincipal? =
        unwrap(this).getCrossAccountZoneDelegationPrincipal()?.let(IPrincipal::wrap)

    /**
     * (deprecated) The name of the role created for cross account delegation.
     *
     * Default: - A role name is generated automatically
     *
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     */
    @Deprecated(message = "deprecated in CDK")
    override fun crossAccountZoneDelegationRoleName(): String? =
        unwrap(this).getCrossAccountZoneDelegationRoleName()

    /**
     * The Amazon Resource Name (ARN) for the log group that you want Amazon Route 53 to send query
     * logs to.
     *
     * Default: disabled
     */
    override fun queryLogsLogGroupArn(): String? = unwrap(this).getQueryLogsLogGroupArn()

    /**
     * The name of the domain.
     *
     * For resource record types that include a domain
     * name, specify a fully qualified domain name.
     */
    override fun zoneName(): String = unwrap(this).getZoneName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicHostedZoneProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.route53.PublicHostedZoneProps):
        PublicHostedZoneProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicHostedZoneProps):
        software.amazon.awscdk.services.route53.PublicHostedZoneProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.route53.PublicHostedZoneProps
  }
}
