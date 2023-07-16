@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexJwtTokenTypeConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.JwtTokenTypeConfigurationProperty.Builder =
      CfnIndex.JwtTokenTypeConfigurationProperty.builder()

  public fun claimRegex(claimRegex: String) {
    cdkBuilder.claimRegex(claimRegex)
  }

  public fun groupAttributeField(groupAttributeField: String) {
    cdkBuilder.groupAttributeField(groupAttributeField)
  }

  public fun issuer(issuer: String) {
    cdkBuilder.issuer(issuer)
  }

  public fun keyLocation(keyLocation: String) {
    cdkBuilder.keyLocation(keyLocation)
  }

  public fun secretManagerArn(secretManagerArn: String) {
    cdkBuilder.secretManagerArn(secretManagerArn)
  }

  public fun url(url: String) {
    cdkBuilder.url(url)
  }

  public fun userNameAttributeField(userNameAttributeField: String) {
    cdkBuilder.userNameAttributeField(userNameAttributeField)
  }

  public fun build(): CfnIndex.JwtTokenTypeConfigurationProperty = cdkBuilder.build()
}
