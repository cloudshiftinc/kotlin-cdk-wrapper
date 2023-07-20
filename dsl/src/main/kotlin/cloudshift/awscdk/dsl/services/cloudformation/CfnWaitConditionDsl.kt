@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Number
import kotlin.String
import software.amazon.awscdk.services.cloudformation.CfnWaitCondition
import software.constructs.Construct

@CdkDslMarker
public class CfnWaitConditionDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWaitCondition.Builder = CfnWaitCondition.Builder.create(scope, id)

  public fun count(count: Number) {
    cdkBuilder.count(count)
  }

  public fun handle(handle: String) {
    cdkBuilder.handle(handle)
  }

  public fun timeout(timeout: String) {
    cdkBuilder.timeout(timeout)
  }

  public fun build(): CfnWaitCondition = cdkBuilder.build()
}
