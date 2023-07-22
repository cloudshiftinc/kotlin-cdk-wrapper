@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.constructs.Construct

@CdkDslMarker
public class CfnFlowDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnFlow.Builder = CfnFlow.Builder.create(scope, id)

  /**
   * The Availability Zone that you want to create the flow in.
   *
   * These options are limited to the Availability Zones within the current AWS Region.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-availabilityzone)
   * @param availabilityZone The Availability Zone that you want to create the flow in. 
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * The name of the flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-name)
   * @param name The name of the flow. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The settings for the source that you want to use for the new flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
   * @param source The settings for the source that you want to use for the new flow. 
   */
  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  /**
   * The settings for the source that you want to use for the new flow.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-source)
   * @param source The settings for the source that you want to use for the new flow. 
   */
  public fun source(source: CfnFlow.SourceProperty) {
    cdkBuilder.source(source)
  }

  /**
   * The settings for source failover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
   * @param sourceFailoverConfig The settings for source failover. 
   */
  public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  /**
   * The settings for source failover.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-mediaconnect-flow.html#cfn-mediaconnect-flow-sourcefailoverconfig)
   * @param sourceFailoverConfig The settings for source failover. 
   */
  public fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  public fun build(): CfnFlow = cdkBuilder.build()
}
