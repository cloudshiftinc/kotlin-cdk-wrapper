@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.codedeploy

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.codedeploy.LambdaApplicationProps

@CdkDslMarker
public class LambdaApplicationPropsDsl {
  private val cdkBuilder: LambdaApplicationProps.Builder = LambdaApplicationProps.builder()

  public fun applicationName(applicationName: String) {
    cdkBuilder.applicationName(applicationName)
  }

  public fun build(): LambdaApplicationProps = cdkBuilder.build()
}
