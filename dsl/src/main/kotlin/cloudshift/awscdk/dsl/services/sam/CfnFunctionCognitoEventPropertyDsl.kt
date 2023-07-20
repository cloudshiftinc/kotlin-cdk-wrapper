@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionCognitoEventPropertyDsl {
  private val cdkBuilder: CfnFunction.CognitoEventProperty.Builder =
      CfnFunction.CognitoEventProperty.builder()

  public fun trigger(trigger: String) {
    cdkBuilder.trigger(trigger)
  }

  public fun userPool(userPool: String) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): CfnFunction.CognitoEventProperty = cdkBuilder.build()
}
