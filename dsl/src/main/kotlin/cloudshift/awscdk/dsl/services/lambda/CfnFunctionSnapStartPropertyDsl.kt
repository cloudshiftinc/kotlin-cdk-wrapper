@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnFunction

@CdkDslMarker
public class CfnFunctionSnapStartPropertyDsl {
  private val cdkBuilder: CfnFunction.SnapStartProperty.Builder =
      CfnFunction.SnapStartProperty.builder()

  /**
   * @param applyOn Set `ApplyOn` to `PublishedVersions` to create a snapshot of the initialized
   * execution environment when you publish a function version. 
   */
  public fun applyOn(applyOn: String) {
    cdkBuilder.applyOn(applyOn)
  }

  public fun build(): CfnFunction.SnapStartProperty = cdkBuilder.build()
}
