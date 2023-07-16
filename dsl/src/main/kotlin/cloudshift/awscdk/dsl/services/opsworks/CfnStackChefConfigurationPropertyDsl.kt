@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opsworks

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opsworks.CfnStack

@CdkDslMarker
public class CfnStackChefConfigurationPropertyDsl {
  private val cdkBuilder: CfnStack.ChefConfigurationProperty.Builder =
      CfnStack.ChefConfigurationProperty.builder()

  public fun berkshelfVersion(berkshelfVersion: String) {
    cdkBuilder.berkshelfVersion(berkshelfVersion)
  }

  public fun manageBerkshelf(manageBerkshelf: Boolean) {
    cdkBuilder.manageBerkshelf(manageBerkshelf)
  }

  public fun manageBerkshelf(manageBerkshelf: IResolvable) {
    cdkBuilder.manageBerkshelf(manageBerkshelf)
  }

  public fun build(): CfnStack.ChefConfigurationProperty = cdkBuilder.build()
}
