@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53resolver

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.route53resolver.CfnResolverDNSSECConfig
import software.constructs.Construct

@CdkDslMarker
public class CfnResolverDNSSECConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnResolverDNSSECConfig.Builder =
      CfnResolverDNSSECConfig.Builder.create(scope, id)

  /**
   * The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC validation status
   * for.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53resolver-resolverdnssecconfig.html#cfn-route53resolver-resolverdnssecconfig-resourceid)
   * @param resourceId The ID of the virtual private cloud (VPC) that you're configuring the DNSSEC
   * validation status for. 
   */
  public fun resourceId(resourceId: String) {
    cdkBuilder.resourceId(resourceId)
  }

  public fun build(): CfnResolverDNSSECConfig = cdkBuilder.build()
}
