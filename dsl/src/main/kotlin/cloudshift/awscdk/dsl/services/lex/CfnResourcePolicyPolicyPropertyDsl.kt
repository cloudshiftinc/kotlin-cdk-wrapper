@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lex

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.services.lex.CfnResourcePolicy

@CdkDslMarker
public class CfnResourcePolicyPolicyPropertyDsl {
  private val cdkBuilder: CfnResourcePolicy.PolicyProperty.Builder =
      CfnResourcePolicy.PolicyProperty.builder()

  public fun build(): CfnResourcePolicy.PolicyProperty = cdkBuilder.build()
}
