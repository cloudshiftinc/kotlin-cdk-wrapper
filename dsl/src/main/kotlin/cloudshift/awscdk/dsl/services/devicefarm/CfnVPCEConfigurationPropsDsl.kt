@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.devicefarm

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.devicefarm.CfnVPCEConfigurationProps

/**
 * Properties for defining a `CfnVPCEConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.devicefarm.*;
 * CfnVPCEConfigurationProps cfnVPCEConfigurationProps = CfnVPCEConfigurationProps.builder()
 * .serviceDnsName("serviceDnsName")
 * .vpceConfigurationName("vpceConfigurationName")
 * .vpceServiceName("vpceServiceName")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .vpceConfigurationDescription("vpceConfigurationDescription")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-devicefarm-vpceconfiguration.html)
 */
@CdkDslMarker
public class CfnVPCEConfigurationPropsDsl {
  private val cdkBuilder: CfnVPCEConfigurationProps.Builder = CfnVPCEConfigurationProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param serviceDnsName The DNS name that Device Farm will use to map to the private service you
   * want to access. 
   */
  public fun serviceDnsName(serviceDnsName: String) {
    cdkBuilder.serviceDnsName(serviceDnsName)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param vpceConfigurationDescription An optional description that provides details about your
   * VPC endpoint configuration.
   */
  public fun vpceConfigurationDescription(vpceConfigurationDescription: String) {
    cdkBuilder.vpceConfigurationDescription(vpceConfigurationDescription)
  }

  /**
   * @param vpceConfigurationName The friendly name you give to your VPC endpoint configuration to
   * manage your configurations more easily. 
   */
  public fun vpceConfigurationName(vpceConfigurationName: String) {
    cdkBuilder.vpceConfigurationName(vpceConfigurationName)
  }

  /**
   * @param vpceServiceName The name of the VPC endpoint service that you want to access from Device
   * Farm. 
   * The name follows the format `com.amazonaws.vpce.us-west-2.vpce-svc-id` .
   */
  public fun vpceServiceName(vpceServiceName: String) {
    cdkBuilder.vpceServiceName(vpceServiceName)
  }

  public fun build(): CfnVPCEConfigurationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
