@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotsitewise.CfnAccessPolicy
import software.constructs.Construct

@CdkDslMarker
public class CfnAccessPolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAccessPolicy.Builder = CfnAccessPolicy.Builder.create(scope, id)

  public fun accessPolicyIdentity(accessPolicyIdentity: IResolvable) {
    cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
  }

  public
      fun accessPolicyIdentity(accessPolicyIdentity: CfnAccessPolicy.AccessPolicyIdentityProperty) {
    cdkBuilder.accessPolicyIdentity(accessPolicyIdentity)
  }

  public fun accessPolicyPermission(accessPolicyPermission: String) {
    cdkBuilder.accessPolicyPermission(accessPolicyPermission)
  }

  public fun accessPolicyResource(accessPolicyResource: IResolvable) {
    cdkBuilder.accessPolicyResource(accessPolicyResource)
  }

  public
      fun accessPolicyResource(accessPolicyResource: CfnAccessPolicy.AccessPolicyResourceProperty) {
    cdkBuilder.accessPolicyResource(accessPolicyResource)
  }

  public fun build(): CfnAccessPolicy = cdkBuilder.build()
}
