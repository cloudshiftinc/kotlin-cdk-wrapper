@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.kendra

import cloudshift.awscdk.common.CdkDslMarker
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.kendra.CfnIndex

@CdkDslMarker
public class CfnIndexUserTokenConfigurationPropertyDsl {
  private val cdkBuilder: CfnIndex.UserTokenConfigurationProperty.Builder =
      CfnIndex.UserTokenConfigurationProperty.builder()

  /**
   * @param jsonTokenTypeConfiguration Information about the JSON token type configuration.
   */
  public fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: IResolvable) {
    cdkBuilder.jsonTokenTypeConfiguration(jsonTokenTypeConfiguration)
  }

  /**
   * @param jsonTokenTypeConfiguration Information about the JSON token type configuration.
   */
  public
      fun jsonTokenTypeConfiguration(jsonTokenTypeConfiguration: CfnIndex.JsonTokenTypeConfigurationProperty) {
    cdkBuilder.jsonTokenTypeConfiguration(jsonTokenTypeConfiguration)
  }

  /**
   * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
   */
  public fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: IResolvable) {
    cdkBuilder.jwtTokenTypeConfiguration(jwtTokenTypeConfiguration)
  }

  /**
   * @param jwtTokenTypeConfiguration Information about the JWT token type configuration.
   */
  public
      fun jwtTokenTypeConfiguration(jwtTokenTypeConfiguration: CfnIndex.JwtTokenTypeConfigurationProperty) {
    cdkBuilder.jwtTokenTypeConfiguration(jwtTokenTypeConfiguration)
  }

  public fun build(): CfnIndex.UserTokenConfigurationProperty = cdkBuilder.build()
}
