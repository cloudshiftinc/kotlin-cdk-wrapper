@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.ec2.IVpc
import software.amazon.awscdk.services.route53.HostedZone
import software.constructs.Construct

@CdkDslMarker
public class HostedZoneDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: HostedZone.Builder = HostedZone.Builder.create(scope, id)

  private val _vpcs: MutableList<IVpc> = mutableListOf()

  public fun addTrailingDot(addTrailingDot: Boolean) {
    cdkBuilder.addTrailingDot(addTrailingDot)
  }

  public fun comment(comment: String) {
    cdkBuilder.comment(comment)
  }

  public fun queryLogsLogGroupArn(queryLogsLogGroupArn: String) {
    cdkBuilder.queryLogsLogGroupArn(queryLogsLogGroupArn)
  }

  public fun vpcs(vararg vpcs: IVpc) {
    _vpcs.addAll(listOf(*vpcs))
  }

  public fun vpcs(vpcs: Collection<IVpc>) {
    _vpcs.addAll(vpcs)
  }

  public fun zoneName(zoneName: String) {
    cdkBuilder.zoneName(zoneName)
  }

  public fun build(): HostedZone {
    if(_vpcs.isNotEmpty()) cdkBuilder.vpcs(_vpcs)
    return cdkBuilder.build()
  }
}
