@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.msk

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.msk.CfnServerlessCluster
import software.constructs.Construct

@CdkDslMarker
public class CfnServerlessClusterDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnServerlessCluster.Builder = CfnServerlessCluster.Builder.create(scope,
      id)

  private val _vpcConfigs: MutableList<Any> = mutableListOf()

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
   * @param clientAuthentication 
   */
  public fun clientAuthentication(clientAuthentication: IResolvable) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clientauthentication)
   * @param clientAuthentication 
   */
  public
      fun clientAuthentication(clientAuthentication: CfnServerlessCluster.ClientAuthenticationProperty) {
    cdkBuilder.clientAuthentication(clientAuthentication)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-clustername)
   * @param clusterName 
   */
  public fun clusterName(clusterName: String) {
    cdkBuilder.clusterName(clusterName)
  }

  /**
   * A key-value pair to associate with a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-tags)
   * @param tags A key-value pair to associate with a resource. 
   */
  public fun tags(tags: Map<String, String>) {
    cdkBuilder.tags(tags)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
   * @param vpcConfigs 
   */
  public fun vpcConfigs(vararg vpcConfigs: Any) {
    _vpcConfigs.addAll(listOf(*vpcConfigs))
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
   * @param vpcConfigs 
   */
  public fun vpcConfigs(vpcConfigs: Collection<Any>) {
    _vpcConfigs.addAll(vpcConfigs)
  }

  /**
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-msk-serverlesscluster.html#cfn-msk-serverlesscluster-vpcconfigs)
   * @param vpcConfigs 
   */
  public fun vpcConfigs(vpcConfigs: IResolvable) {
    cdkBuilder.vpcConfigs(vpcConfigs)
  }

  public fun build(): CfnServerlessCluster {
    if(_vpcConfigs.isNotEmpty()) cdkBuilder.vpcConfigs(_vpcConfigs)
    return cdkBuilder.build()
  }
}
