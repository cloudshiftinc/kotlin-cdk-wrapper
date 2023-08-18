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
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.route53.PublicHostedZone
import software.constructs.Construct

/**
 * Create a Route53 public hosted zone.
 *
 * Example:
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
@CdkDslMarker
public class PublicHostedZoneDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: PublicHostedZone.Builder = PublicHostedZone.Builder.create(scope, id)

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
     * Whether to create a CAA record to restrict certificate authorities allowed to issue
     * certificates for this domain to Amazon only.
     *
     * Default: false
     *
     * @param caaAmazon Whether to create a CAA record to restrict certificate authorities allowed
     *   to issue certificates for this domain to Amazon only.
     */
    public fun caaAmazon(caaAmazon: Boolean) {
        cdkBuilder.caaAmazon(caaAmazon)
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
     * (deprecated) A principal which is trusted to assume a role for zone delegation.
     *
     * If supplied, this will create a Role in the same account as the Hosted Zone, which can be
     * assumed by the `CrossAccountZoneDelegationRecord` to create a delegation record to a zone in
     * a different account.
     *
     * Be sure to indicate the account(s) that you trust to create delegation records, using either
     * `iam.AccountPrincipal` or `iam.OrganizationPrincipal`.
     *
     * If you are planning to use `iam.ServicePrincipal`s here, be sure to include region-specific
     * service principals for every opt-in region you are going to be delegating to; or don't use
     * this feature and create separate roles with appropriate permissions for every opt-in region
     * instead.
     *
     * Default: - No delegation configuration
     *
     * @param crossAccountZoneDelegationPrincipal A principal which is trusted to assume a role for
     *   zone delegation.
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationPrincipal(
        crossAccountZoneDelegationPrincipal: IPrincipal
    ) {
        cdkBuilder.crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal)
    }

    /**
     * (deprecated) The name of the role created for cross account delegation.
     *
     * Default: - A role name is generated automatically
     *
     * @param crossAccountZoneDelegationRoleName The name of the role created for cross account
     *   delegation.
     * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
     */
    @Deprecated(message = "deprecated in CDK")
    public fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String) {
        cdkBuilder.crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName)
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
     * The name of the domain.
     *
     * For resource record types that include a domain name, specify a fully qualified domain name.
     *
     * @param zoneName The name of the domain.
     */
    public fun zoneName(zoneName: String) {
        cdkBuilder.zoneName(zoneName)
    }

    public fun build(): PublicHostedZone = cdkBuilder.build()
}
