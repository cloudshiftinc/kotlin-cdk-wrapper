@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.emr

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import kotlin.Any
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.emr.CfnSecurityConfigurationProps

/**
 * Properties for defining a `CfnSecurityConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.emr.*;
 * Object securityConfiguration;
 * CfnSecurityConfigurationProps cfnSecurityConfigurationProps =
 * CfnSecurityConfigurationProps.builder()
 * .securityConfiguration(securityConfiguration)
 * // the properties below are optional
 * .name("name")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-emr-securityconfiguration.html)
 */
@CdkDslMarker
public class CfnSecurityConfigurationPropsDsl {
  private val cdkBuilder: CfnSecurityConfigurationProps.Builder =
      CfnSecurityConfigurationProps.builder()

  /**
   * @param name The name of the security configuration.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param securityConfiguration The security configuration details in JSON format. 
   */
  public fun securityConfiguration(securityConfiguration: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(securityConfiguration)
    cdkBuilder.securityConfiguration(builder.map)
  }

  /**
   * @param securityConfiguration The security configuration details in JSON format. 
   */
  public fun securityConfiguration(securityConfiguration: Any) {
    cdkBuilder.securityConfiguration(securityConfiguration)
  }

  public fun build(): CfnSecurityConfigurationProps = cdkBuilder.build()
}
