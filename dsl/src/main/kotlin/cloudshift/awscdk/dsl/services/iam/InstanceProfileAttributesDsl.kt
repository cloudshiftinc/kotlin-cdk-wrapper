@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.iam.IRole
import software.amazon.awscdk.services.iam.InstanceProfileAttributes

@CdkDslMarker
public class InstanceProfileAttributesDsl {
  private val cdkBuilder: InstanceProfileAttributes.Builder = InstanceProfileAttributes.builder()

  public fun instanceProfileArn(instanceProfileArn: String) {
    cdkBuilder.instanceProfileArn(instanceProfileArn)
  }

  public fun role(role: IRole) {
    cdkBuilder.role(role)
  }

  public fun build(): InstanceProfileAttributes = cdkBuilder.build()
}
