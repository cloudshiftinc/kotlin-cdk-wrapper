@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnDistribution

@CdkDslMarker
public class CfnDistributionOriginGroupPropertyDsl {
  private val cdkBuilder: CfnDistribution.OriginGroupProperty.Builder =
      CfnDistribution.OriginGroupProperty.builder()

  /**
   * @param failoverCriteria A complex type that contains information about the failover criteria
   * for an origin group. 
   */
  public fun failoverCriteria(failoverCriteria: IResolvable) {
    cdkBuilder.failoverCriteria(failoverCriteria)
  }

  /**
   * @param failoverCriteria A complex type that contains information about the failover criteria
   * for an origin group. 
   */
  public
      fun failoverCriteria(failoverCriteria: CfnDistribution.OriginGroupFailoverCriteriaProperty) {
    cdkBuilder.failoverCriteria(failoverCriteria)
  }

  /**
   * @param id The origin group's ID. 
   */
  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  /**
   * @param members A complex type that contains information about the origins in an origin group. 
   */
  public fun members(members: IResolvable) {
    cdkBuilder.members(members)
  }

  /**
   * @param members A complex type that contains information about the origins in an origin group. 
   */
  public fun members(members: CfnDistribution.OriginGroupMembersProperty) {
    cdkBuilder.members(members)
  }

  public fun build(): CfnDistribution.OriginGroupProperty = cdkBuilder.build()
}
