@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kms

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kms.CfnAlias
import software.constructs.Construct

@CdkDslMarker
public class CfnAliasDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnAlias.Builder = CfnAlias.Builder.create(scope, id)

  public fun aliasName(aliasName: String) {
    cdkBuilder.aliasName(aliasName)
  }

  public fun targetKeyId(targetKeyId: String) {
    cdkBuilder.targetKeyId(targetKeyId)
  }

  public fun build(): CfnAlias = cdkBuilder.build()
}
