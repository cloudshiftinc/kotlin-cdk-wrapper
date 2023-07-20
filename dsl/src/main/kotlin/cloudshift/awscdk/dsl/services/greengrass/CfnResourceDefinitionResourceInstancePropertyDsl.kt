@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionResourceInstancePropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.ResourceInstanceProperty.Builder =
      CfnResourceDefinition.ResourceInstanceProperty.builder()

  public fun id(id: String) {
    cdkBuilder.id(id)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun resourceDataContainer(resourceDataContainer: IResolvable) {
    cdkBuilder.resourceDataContainer(resourceDataContainer)
  }

  public
      fun resourceDataContainer(resourceDataContainer: CfnResourceDefinition.ResourceDataContainerProperty) {
    cdkBuilder.resourceDataContainer(resourceDataContainer)
  }

  public fun build(): CfnResourceDefinition.ResourceInstanceProperty = cdkBuilder.build()
}
