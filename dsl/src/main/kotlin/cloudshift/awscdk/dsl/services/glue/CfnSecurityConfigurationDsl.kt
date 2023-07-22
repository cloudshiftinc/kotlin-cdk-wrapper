@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.glue

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.glue.CfnSecurityConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnSecurityConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityConfiguration.Builder =
      CfnSecurityConfiguration.Builder.create(scope, id)

  /**
   * The encryption configuration associated with this security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
   * @param encryptionConfiguration The encryption configuration associated with this security
   * configuration. 
   */
  public fun encryptionConfiguration(encryptionConfiguration: IResolvable) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * The encryption configuration associated with this security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-encryptionconfiguration)
   * @param encryptionConfiguration The encryption configuration associated with this security
   * configuration. 
   */
  public
      fun encryptionConfiguration(encryptionConfiguration: CfnSecurityConfiguration.EncryptionConfigurationProperty) {
    cdkBuilder.encryptionConfiguration(encryptionConfiguration)
  }

  /**
   * The name of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-glue-securityconfiguration.html#cfn-glue-securityconfiguration-name)
   * @param name The name of the security configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun build(): CfnSecurityConfiguration = cdkBuilder.build()
}
