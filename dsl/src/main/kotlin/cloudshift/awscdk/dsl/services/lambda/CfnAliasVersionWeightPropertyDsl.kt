@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.lambda.CfnAlias

@CdkDslMarker
public class CfnAliasVersionWeightPropertyDsl {
  private val cdkBuilder: CfnAlias.VersionWeightProperty.Builder =
      CfnAlias.VersionWeightProperty.builder()

  public fun functionVersion(functionVersion: String) {
    cdkBuilder.functionVersion(functionVersion)
  }

  public fun functionWeight(functionWeight: Number) {
    cdkBuilder.functionWeight(functionWeight)
  }

  public fun build(): CfnAlias.VersionWeightProperty = cdkBuilder.build()
}
