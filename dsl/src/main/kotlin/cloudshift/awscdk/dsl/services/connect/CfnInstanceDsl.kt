@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnInstance
import software.constructs.Construct

@CdkDslMarker
public class CfnInstanceDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInstance.Builder = CfnInstance.Builder.create(scope, id)

  public fun attributes(attributes: IResolvable) {
    cdkBuilder.attributes(attributes)
  }

  public fun attributes(attributes: CfnInstance.AttributesProperty) {
    cdkBuilder.attributes(attributes)
  }

  public fun directoryId(directoryId: String) {
    cdkBuilder.directoryId(directoryId)
  }

  public fun identityManagementType(identityManagementType: String) {
    cdkBuilder.identityManagementType(identityManagementType)
  }

  public fun instanceAlias(instanceAlias: String) {
    cdkBuilder.instanceAlias(instanceAlias)
  }

  public fun build(): CfnInstance = cdkBuilder.build()
}
