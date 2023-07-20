@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.RemovalPolicy
import software.amazon.awscdk.RemovalPolicyOptions

@CdkDslMarker
public class RemovalPolicyOptionsDsl {
  private val cdkBuilder: RemovalPolicyOptions.Builder = RemovalPolicyOptions.builder()

  public fun applyToUpdateReplacePolicy(applyToUpdateReplacePolicy: Boolean) {
    cdkBuilder.applyToUpdateReplacePolicy(applyToUpdateReplacePolicy)
  }

  public fun defaultValue(defaultValue: RemovalPolicy) {
    cdkBuilder.defaultValue(defaultValue)
  }

  public fun build(): RemovalPolicyOptions = cdkBuilder.build()
}
