@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iam

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.iam.CfnInstanceProfile
import software.constructs.Construct

@CdkDslMarker
public class CfnInstanceProfileDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnInstanceProfile.Builder = CfnInstanceProfile.Builder.create(scope, id)

  private val _roles: MutableList<String> = mutableListOf()

  public fun instanceProfileName(instanceProfileName: String) {
    cdkBuilder.instanceProfileName(instanceProfileName)
  }

  public fun path(path: String) {
    cdkBuilder.path(path)
  }

  public fun roles(vararg roles: String) {
    _roles.addAll(listOf(*roles))
  }

  public fun roles(roles: Collection<String>) {
    _roles.addAll(roles)
  }

  public fun build(): CfnInstanceProfile {
    if(_roles.isNotEmpty()) cdkBuilder.roles(_roles)
    return cdkBuilder.build()
  }
}
