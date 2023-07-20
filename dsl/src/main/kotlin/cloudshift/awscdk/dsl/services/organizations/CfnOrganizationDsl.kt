@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.organizations

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.organizations.CfnOrganization
import software.constructs.Construct

@CdkDslMarker
public class CfnOrganizationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnOrganization.Builder = CfnOrganization.Builder.create(scope, id)

  public fun featureSet(featureSet: String) {
    cdkBuilder.featureSet(featureSet)
  }

  public fun build(): CfnOrganization = cdkBuilder.build()
}
