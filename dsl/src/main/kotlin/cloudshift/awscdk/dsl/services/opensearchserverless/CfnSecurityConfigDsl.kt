@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.opensearchserverless

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.opensearchserverless.CfnSecurityConfig
import software.constructs.Construct

@CdkDslMarker
public class CfnSecurityConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityConfig.Builder = CfnSecurityConfig.Builder.create(scope, id)

  /**
   * The description of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-description)
   * @param description The description of the security configuration. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The name of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-name)
   * @param name The name of the security configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * SAML options for the security configuration in the form of a key-value map.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
   * @param samlOptions SAML options for the security configuration in the form of a key-value map. 
   */
  public fun samlOptions(samlOptions: IResolvable) {
    cdkBuilder.samlOptions(samlOptions)
  }

  /**
   * SAML options for the security configuration in the form of a key-value map.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-samloptions)
   * @param samlOptions SAML options for the security configuration in the form of a key-value map. 
   */
  public fun samlOptions(samlOptions: CfnSecurityConfig.SamlConfigOptionsProperty) {
    cdkBuilder.samlOptions(samlOptions)
  }

  /**
   * The type of security configuration.
   *
   * Currently the only option is `saml` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-opensearchserverless-securityconfig.html#cfn-opensearchserverless-securityconfig-type)
   * @param type The type of security configuration. 
   */
  public fun type(type: String) {
    cdkBuilder.type(type)
  }

  public fun build(): CfnSecurityConfig = cdkBuilder.build()
}
