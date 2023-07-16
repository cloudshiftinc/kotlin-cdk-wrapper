@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lambda

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.services.lambda.Runtime
import software.amazon.awscdk.services.lambda.RuntimeFamily

@CdkDslMarker
public class RuntimeDsl(
  arg0: String,
  arg1: RuntimeFamily,
) {
  private val cdkBuilder: Runtime.Builder = Runtime.Builder.create(arg0, arg1)

  public fun bundlingDockerImage(bundlingDockerImage: String) {
    cdkBuilder.bundlingDockerImage(bundlingDockerImage)
  }

  public fun supportsCodeGuruProfiling(supportsCodeGuruProfiling: Boolean) {
    cdkBuilder.supportsCodeGuruProfiling(supportsCodeGuruProfiling)
  }

  public fun supportsInlineCode(supportsInlineCode: Boolean) {
    cdkBuilder.supportsInlineCode(supportsInlineCode)
  }

  public fun build(): Runtime = cdkBuilder.build()
}
