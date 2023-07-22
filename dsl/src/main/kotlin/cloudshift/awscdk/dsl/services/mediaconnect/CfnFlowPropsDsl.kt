@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.mediaconnect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.mediaconnect.CfnFlow
import software.amazon.awscdk.services.mediaconnect.CfnFlowProps

@CdkDslMarker
public class CfnFlowPropsDsl {
  private val cdkBuilder: CfnFlowProps.Builder = CfnFlowProps.builder()

  /**
   * @param availabilityZone The Availability Zone that you want to create the flow in.
   * These options are limited to the Availability Zones within the current AWS Region.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param name The name of the flow. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param source The settings for the source that you want to use for the new flow. 
   */
  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  /**
   * @param source The settings for the source that you want to use for the new flow. 
   */
  public fun source(source: CfnFlow.SourceProperty) {
    cdkBuilder.source(source)
  }

  /**
   * @param sourceFailoverConfig The settings for source failover.
   */
  public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  /**
   * @param sourceFailoverConfig The settings for source failover.
   */
  public fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  public fun build(): CfnFlowProps = cdkBuilder.build()
}
