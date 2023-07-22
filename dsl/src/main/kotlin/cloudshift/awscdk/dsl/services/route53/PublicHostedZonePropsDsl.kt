@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Deprecated
import kotlin.String
import software.amazon.awscdk.services.iam.IPrincipal
import software.amazon.awscdk.services.route53.PublicHostedZoneProps

/**
 * Construction properties for a PublicHostedZone.
 *
 * Example:
 *
 * ```
 * PublicHostedZone subZone = PublicHostedZone.Builder.create(this, "SubZone")
 * .zoneName("sub.someexample.com")
 * .build();
 * // import the delegation role by constructing the roleArn
 * String delegationRoleArn = Stack.of(this).formatArn(ArnComponents.builder()
 * .region("") // IAM is global in each partition
 * .service("iam")
 * .account("parent-account-id")
 * .resource("role")
 * .resourceName("MyDelegationRole")
 * .build());
 * IRole delegationRole = Role.fromRoleArn(this, "DelegationRole", delegationRoleArn);
 * // create the record
 * // create the record
 * CrossAccountZoneDelegationRecord.Builder.create(this, "delegate")
 * .delegatedZone(subZone)
 * .parentHostedZoneName("someexample.com") // or you can use parentHostedZoneId
 * .delegationRole(delegationRole)
 * .build();
 * ```
 */
@CdkDslMarker
public class PublicHostedZonePropsDsl {
  private val cdkBuilder: PublicHostedZoneProps.Builder = PublicHostedZoneProps.builder()

  /**
   * @param addTrailingDot Whether to add a trailing dot to the zone name.
   */
  public fun addTrailingDot(addTrailingDot: Boolean) {
    cdkBuilder.addTrailingDot(addTrailingDot)
  }

  /**
   * @param caaAmazon Whether to create a CAA record to restrict certificate authorities allowed to
   * issue certificates for this domain to Amazon only.
   */
  public fun caaAmazon(caaAmazon: Boolean) {
    cdkBuilder.caaAmazon(caaAmazon)
  }

  /**
   * @param comment Any comments that you want to include about the hosted zone.
   */
  public fun comment(comment: String) {
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
  public fun crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal: IPrincipal) {
    cdkBuilder.crossAccountZoneDelegationPrincipal(crossAccountZoneDelegationPrincipal)
  }

  /**
   * @param crossAccountZoneDelegationRoleName The name of the role created for cross account
   * delegation.
   * @deprecated Create the Role yourself and call `hostedZone.grantDelegation()`.
   */
  @Deprecated(message = "deprecated in CDK")
  public fun crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName: String) {
    cdkBuilder.crossAccountZoneDelegationRoleName(crossAccountZoneDelegationRoleName)
  }

  /**
   * @param queryLogsLogGroupArn The Amazon Resource Name (ARN) for the log group that you want
   * Amazon Route 53 to send query logs to.
   */
  public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
    cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
  }

  /**
   * @param zoneName The name of the domain. 
   * For resource record types that include a domain
   * name, specify a fully qualified domain name.
   */
  public fun zoneName(zoneName: String) {
    cdkBuilder.zoneName(zoneName)
  }

  public fun build(): PublicHostedZoneProps = cdkBuilder.build()
}
