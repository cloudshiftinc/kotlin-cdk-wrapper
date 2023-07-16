@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

@CdkDslMarker
public class CfnResourceDefinitionGroupOwnerSettingPropertyDsl {
  private val cdkBuilder: CfnResourceDefinition.GroupOwnerSettingProperty.Builder =
      CfnResourceDefinition.GroupOwnerSettingProperty.builder()

  public fun autoAddGroupOwner(autoAddGroupOwner: Boolean) {
    cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
  }

  public fun autoAddGroupOwner(autoAddGroupOwner: IResolvable) {
    cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
  }

  public fun groupOwner(groupOwner: String) {
    cdkBuilder.groupOwner(groupOwner)
  }

  public fun build(): CfnResourceDefinition.GroupOwnerSettingProperty = cdkBuilder.build()
}
