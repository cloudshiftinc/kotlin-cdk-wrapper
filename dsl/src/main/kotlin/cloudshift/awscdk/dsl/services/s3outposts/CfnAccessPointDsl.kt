@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.s3outposts

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.s3outposts.CfnAccessPoint
import software.constructs.Construct

@CdkDslMarker
public class CfnAccessPointDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessPoint.Builder = CfnAccessPoint.Builder.create(scope, id)

  /**
   * The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated with this access
   * point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-bucket)
   * @param bucket The Amazon Resource Name (ARN) of the S3 on Outposts bucket that is associated
   * with this access point. 
   */
  public fun bucket(bucket: String) {
    cdkBuilder.bucket(bucket)
  }

  /**
   * The name of this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-name)
   * @param name The name of this access point. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The access point policy associated with this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
   * @param policy The access point policy associated with this access point. 
   */
  public fun policy(policy: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(policy)
    cdkBuilder.policy(builder.map)
  }

  /**
   * The access point policy associated with this access point.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-policy)
   * @param policy The access point policy associated with this access point. 
   */
  public fun policy(policy: Any) {
    cdkBuilder.policy(policy)
  }

  /**
   * The virtual private cloud (VPC) configuration for this access point, if one exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
   * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point, if
   * one exists. 
   */
  public fun vpcConfiguration(vpcConfiguration: IResolvable) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  /**
   * The virtual private cloud (VPC) configuration for this access point, if one exists.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-s3outposts-accesspoint.html#cfn-s3outposts-accesspoint-vpcconfiguration)
   * @param vpcConfiguration The virtual private cloud (VPC) configuration for this access point, if
   * one exists. 
   */
  public fun vpcConfiguration(vpcConfiguration: CfnAccessPoint.VpcConfigurationProperty) {
    cdkBuilder.vpcConfiguration(vpcConfiguration)
  }

  public fun build(): CfnAccessPoint = cdkBuilder.build()
}
