@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnCondition
import software.amazon.awscdk.ICfnConditionExpression
import software.constructs.Construct

@CdkDslMarker
public class CfnConditionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnCondition.Builder = CfnCondition.Builder.create(scope, id)

  public fun expression(expression: ICfnConditionExpression) {
    cdkBuilder.expression(expression)
  }

  public fun build(): CfnCondition = cdkBuilder.build()
}
