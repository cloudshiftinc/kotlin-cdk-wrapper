@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.directoryservice

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.directoryservice.CfnMicrosoftAD
import software.constructs.Construct

@CdkDslMarker
public class CfnMicrosoftADDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnMicrosoftAD.Builder = CfnMicrosoftAD.Builder.create(scope, id)

  public fun createAlias(createAlias: Boolean) {
    cdkBuilder.createAlias(createAlias)
  }

  public fun createAlias(createAlias: IResolvable) {
    cdkBuilder.createAlias(createAlias)
  }

  public fun edition(edition: String) {
    cdkBuilder.edition(edition)
  }

  public fun enableSso(enableSso: Boolean) {
    cdkBuilder.enableSso(enableSso)
  }

  public fun enableSso(enableSso: IResolvable) {
    cdkBuilder.enableSso(enableSso)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun password(password: String) {
    cdkBuilder.password(password)
  }

  public fun shortName(shortName: String) {
    cdkBuilder.shortName(shortName)
  }

  public fun vpcSettings(vpcSettings: IResolvable) {
    cdkBuilder.vpcSettings(vpcSettings)
  }

  public fun vpcSettings(vpcSettings: CfnMicrosoftAD.VpcSettingsProperty) {
    cdkBuilder.vpcSettings(vpcSettings)
  }

  public fun build(): CfnMicrosoftAD = cdkBuilder.build()
}
