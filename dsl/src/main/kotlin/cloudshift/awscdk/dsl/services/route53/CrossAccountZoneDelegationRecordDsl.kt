@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.Duration
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.route53.CrossAccountZoneDelegationRecord
import software.amazon.awscdk.services.route53.IHostedZone
import software.constructs.Construct

/**
 * A Cross Account Zone Delegation record.
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
public class CrossAccountZoneDelegationRecordDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CrossAccountZoneDelegationRecord.Builder =
      CrossAccountZoneDelegationRecord.Builder.create(scope, id)

  /**
   * The zone to be delegated.
   *
   * @param delegatedZone The zone to be delegated. 
   */
  public fun delegatedZone(delegatedZone: IHostedZone) {
    cdkBuilder.delegatedZone(delegatedZone)
  }

  /**
   * The delegation role in the parent account.
   *
   * @param delegationRole The delegation role in the parent account. 
   */
  public fun delegationRole(delegationRole: IRole) {
    cdkBuilder.delegationRole(delegationRole)
  }

  /**
   * The hosted zone id in the parent account.
   *
   * Default: - no zone id
   *
   * @param parentHostedZoneId The hosted zone id in the parent account. 
   */
  public fun parentHostedZoneId(parentHostedZoneId: String) {
    cdkBuilder.parentHostedZoneId(parentHostedZoneId)
  }

  /**
   * The hosted zone name in the parent account.
   *
   * Default: - no zone name
   *
   * @param parentHostedZoneName The hosted zone name in the parent account. 
   */
  public fun parentHostedZoneName(parentHostedZoneName: String) {
    cdkBuilder.parentHostedZoneName(parentHostedZoneName)
  }

  /**
   * The removal policy to apply to the record set.
   *
   * Default: RemovalPolicy.DESTROY
   *
   * @param removalPolicy The removal policy to apply to the record set. 
   */
  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  /**
   * The resource record cache time to live (TTL).
   *
   * Default: Duration.days(2)
   *
   * @param ttl The resource record cache time to live (TTL). 
   */
  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): CrossAccountZoneDelegationRecord = cdkBuilder.build()
}
