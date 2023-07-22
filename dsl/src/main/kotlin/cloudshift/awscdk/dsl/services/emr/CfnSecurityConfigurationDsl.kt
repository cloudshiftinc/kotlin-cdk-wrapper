@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnSecurityConfiguration
import software.constructs.Construct

@CdkDslMarker
public class CfnSecurityConfigurationDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnSecurityConfiguration.Builder =
      CfnSecurityConfiguration.Builder.create(scope, id)

  /**
   * The name of the security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-name)
   * @param name The name of the security configuration. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The security configuration details in JSON format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
   * @param securityConfiguration The security configuration details in JSON format. 
   */
  public fun securityConfiguration(securityConfiguration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(securityConfiguration)
    cdkBuilder.securityConfiguration(builder.map)
  }

  /**
   * The security configuration details in JSON format.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html#cfn-emr-securityconfiguration-securityconfiguration)
   * @param securityConfiguration The security configuration details in JSON format. 
   */
  public fun securityConfiguration(securityConfiguration: Any) {
    cdkBuilder.securityConfiguration(securityConfiguration)
  }

  public fun build(): CfnSecurityConfiguration = cdkBuilder.build()
}
