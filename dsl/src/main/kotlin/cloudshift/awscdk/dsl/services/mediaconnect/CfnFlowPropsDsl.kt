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

  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun source(source: IResolvable) {
    cdkBuilder.source(source)
  }

  public fun source(source: CfnFlow.SourceProperty) {
    cdkBuilder.source(source)
  }

  public fun sourceFailoverConfig(sourceFailoverConfig: IResolvable) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  public fun sourceFailoverConfig(sourceFailoverConfig: CfnFlow.FailoverConfigProperty) {
    cdkBuilder.sourceFailoverConfig(sourceFailoverConfig)
  }

  public fun build(): CfnFlowProps = cdkBuilder.build()
}
