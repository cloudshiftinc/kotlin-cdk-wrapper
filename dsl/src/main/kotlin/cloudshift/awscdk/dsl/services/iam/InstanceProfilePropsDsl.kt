@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.InstanceProfileProps

@CdkDslMarker
public class InstanceProfilePropsDsl {
  private val cdkBuilder: InstanceProfileProps.Builder = InstanceProfileProps.builder()

  public fun instanceProfileName(instanceProfileName: String) {
    cdkBuilder.instanceProfileName(instanceProfileName)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): InstanceProfileProps = cdkBuilder.build()
}
