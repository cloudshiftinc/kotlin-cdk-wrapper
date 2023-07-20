@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.secretsmanager

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.secretsmanager.ISecret
import software.amazon.awscdk.services.secretsmanager.ResourcePolicy
import software.constructs.Construct

@CdkDslMarker
public class ResourcePolicyDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: ResourcePolicy.Builder = ResourcePolicy.Builder.create(scope, id)

  public fun secret(secret: ISecret) {
    cdkBuilder.secret(secret)
  }

  public fun build(): ResourcePolicy = cdkBuilder.build()
}
