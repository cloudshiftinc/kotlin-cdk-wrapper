@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.CfnWaitConditionHandle
import software.constructs.Construct

@CdkDslMarker
public class CfnWaitConditionHandleDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnWaitConditionHandle.Builder =
      CfnWaitConditionHandle.Builder.create(scope, id)

  public fun build(): CfnWaitConditionHandle = cdkBuilder.build()
}
