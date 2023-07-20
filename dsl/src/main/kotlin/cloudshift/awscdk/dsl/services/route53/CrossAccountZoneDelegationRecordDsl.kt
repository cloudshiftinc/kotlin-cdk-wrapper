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

@CdkDslMarker
public class CrossAccountZoneDelegationRecordDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CrossAccountZoneDelegationRecord.Builder =
      CrossAccountZoneDelegationRecord.Builder.create(scope, id)

  public fun delegatedZone(delegatedZone: IHostedZone) {
    cdkBuilder.delegatedZone(delegatedZone)
  }

  public fun delegationRole(delegationRole: IRole) {
    cdkBuilder.delegationRole(delegationRole)
  }

  public fun parentHostedZoneId(parentHostedZoneId: String) {
    cdkBuilder.parentHostedZoneId(parentHostedZoneId)
  }

  public fun parentHostedZoneName(parentHostedZoneName: String) {
    cdkBuilder.parentHostedZoneName(parentHostedZoneName)
  }

  public fun removalPolicy(removalPolicy: RemovalPolicy) {
    cdkBuilder.removalPolicy(removalPolicy)
  }

  public fun ttl(ttl: Duration) {
    cdkBuilder.ttl(ttl)
  }

  public fun build(): CrossAccountZoneDelegationRecord = cdkBuilder.build()
}
