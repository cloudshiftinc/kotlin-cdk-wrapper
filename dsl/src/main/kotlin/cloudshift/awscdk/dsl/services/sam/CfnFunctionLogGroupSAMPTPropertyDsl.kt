@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionLogGroupSAMPTPropertyDsl {
  private val cdkBuilder: CfnFunction.LogGroupSAMPTProperty.Builder =
      CfnFunction.LogGroupSAMPTProperty.builder()

  public fun logGroupName(logGroupName: String) {
    cdkBuilder.logGroupName(logGroupName)
  }

  public fun build(): CfnFunction.LogGroupSAMPTProperty = cdkBuilder.build()
}
