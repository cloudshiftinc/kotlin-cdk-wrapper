@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.sam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnFunction

@CdkDslMarker
public class CfnFunctionCognitoEventPropertyDsl {
  private val cdkBuilder: CfnFunction.CognitoEventProperty.Builder =
      CfnFunction.CognitoEventProperty.builder()

  private val _trigger: MutableList<String> = mutableListOf()

  public fun trigger(trigger: String) {
    cdkBuilder.trigger(trigger)
  }

  public fun trigger(vararg trigger: String) {
    _trigger.addAll(listOf(*trigger))
  }

  public fun trigger(trigger: Collection<String>) {
    _trigger.addAll(trigger)
  }

  public fun trigger(trigger: IResolvable) {
    cdkBuilder.trigger(trigger)
  }

  public fun userPool(userPool: String) {
    cdkBuilder.userPool(userPool)
  }

  public fun build(): CfnFunction.CognitoEventProperty {
    if(_trigger.isNotEmpty()) cdkBuilder.trigger(_trigger)
    return cdkBuilder.build()
  }
}
