@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnContinuousDeploymentPolicy

@CdkDslMarker
public class CfnContinuousDeploymentPolicyContinuousDeploymentPolicyConfigPropertyDsl {
  private val cdkBuilder:
      CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.Builder =
      CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty.builder()

  private val _stagingDistributionDnsNames: MutableList<String> = mutableListOf()

  /**
   * @param enabled A Boolean that indicates whether this continuous deployment policy is enabled
   * (in effect). 
   * When this value is `true` , this policy is enabled and in effect. When this value is `false` ,
   * this policy is not enabled and has no effect.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled A Boolean that indicates whether this continuous deployment policy is enabled
   * (in effect). 
   * When this value is `true` , this policy is enabled and in effect. When this value is `false` ,
   * this policy is not enabled and has no effect.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution. 
   * For example: `d111111abcdef8.cloudfront.net` .
   */
  public fun stagingDistributionDnsNames(vararg stagingDistributionDnsNames: String) {
    _stagingDistributionDnsNames.addAll(listOf(*stagingDistributionDnsNames))
  }

  /**
   * @param stagingDistributionDnsNames The CloudFront domain name of the staging distribution. 
   * For example: `d111111abcdef8.cloudfront.net` .
   */
  public fun stagingDistributionDnsNames(stagingDistributionDnsNames: Collection<String>) {
    _stagingDistributionDnsNames.addAll(stagingDistributionDnsNames)
  }

  /**
   * @param trafficConfig Contains the parameters for routing production traffic from your primary
   * to staging distributions.
   */
  public fun trafficConfig(trafficConfig: IResolvable) {
    cdkBuilder.trafficConfig(trafficConfig)
  }

  /**
   * @param trafficConfig Contains the parameters for routing production traffic from your primary
   * to staging distributions.
   */
  public fun trafficConfig(trafficConfig: CfnContinuousDeploymentPolicy.TrafficConfigProperty) {
    cdkBuilder.trafficConfig(trafficConfig)
  }

  public fun build(): CfnContinuousDeploymentPolicy.ContinuousDeploymentPolicyConfigProperty {
    if(_stagingDistributionDnsNames.isNotEmpty())
        cdkBuilder.stagingDistributionDnsNames(_stagingDistributionDnsNames)
    return cdkBuilder.build()
  }
}
