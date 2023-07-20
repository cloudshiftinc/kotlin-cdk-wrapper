@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.cloudformation

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudformation.CfnStackSet

@CdkDslMarker
public class CfnStackSetAutoDeploymentPropertyDsl {
  private val cdkBuilder: CfnStackSet.AutoDeploymentProperty.Builder =
      CfnStackSet.AutoDeploymentProperty.builder()

  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: Boolean) {
    cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
  }

  public fun retainStacksOnAccountRemoval(retainStacksOnAccountRemoval: IResolvable) {
    cdkBuilder.retainStacksOnAccountRemoval(retainStacksOnAccountRemoval)
  }

  public fun build(): CfnStackSet.AutoDeploymentProperty = cdkBuilder.build()
}
