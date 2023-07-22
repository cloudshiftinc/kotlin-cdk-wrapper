@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfigProps

/**
 * Properties for defining a `CfnSecurityConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.opensearchserverless.*;
 * CfnSecurityConfigProps cfnSecurityConfigProps = CfnSecurityConfigProps.builder()
 * .description("description")
 * .name("name")
 * .samlOptions(SamlConfigOptionsProperty.builder()
 * .metadata("metadata")
 * // the properties below are optional
 * .groupAttribute("groupAttribute")
 * .sessionTimeout(123)
 * .userAttribute("userAttribute")
 * .build())
 * .type("type")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html)
 */
@CdkDslMarker
public class CfnSecurityConfigPropsDsl {
  private val cdkBuilder: CfnSecurityConfigProps.Builder = CfnSecurityConfigProps.builder()

  /**
   * @param description The description of the security configuration.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name The name of the security configuration.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param samlOptions SAML options for the security configuration in the form of a key-value map.
   */
  public fun samlOptions(samlOptions: IResolvable) {
    cdkBuilder.samlOptions(samlOptions)
  }

  /**
   * @param samlOptions SAML options for the security configuration in the form of a key-value map.
   */
  public fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty) {
    cdkBuilder.samlOptions(samlOptions)
  }

  /**
   * @param type The type of security configuration.
   * Currently the only option is `saml` .
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSecurityConfigProps = cdkBuilder.build()
}
