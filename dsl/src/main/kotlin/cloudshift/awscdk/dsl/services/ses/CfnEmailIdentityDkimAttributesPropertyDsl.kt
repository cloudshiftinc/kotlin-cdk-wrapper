@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.ses

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.ses.CfnEmailIdentity

@CdkDslMarker
public class CfnEmailIdentityDkimAttributesPropertyDsl {
  private val cdkBuilder: CfnEmailIdentity.DkimAttributesProperty.Builder =
      CfnEmailIdentity.DkimAttributesProperty.builder()

  public fun signingEnabled(signingEnabled: Boolean) {
    cdkBuilder.signingEnabled(signingEnabled)
  }

  public fun signingEnabled(signingEnabled: IResolvable) {
    cdkBuilder.signingEnabled(signingEnabled)
  }

  public fun build(): CfnEmailIdentity.DkimAttributesProperty = cdkBuilder.build()
}
