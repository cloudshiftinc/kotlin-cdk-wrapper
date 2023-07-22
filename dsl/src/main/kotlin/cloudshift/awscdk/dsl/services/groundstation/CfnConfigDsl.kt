@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.groundstation.CfnConfig
import software.constructs.Construct

/**
 * Creates a `Config` with the specified parameters.
 *
 * Config objects provide Ground Station with the details necessary in order to schedule and execute
 * satellite contacts.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.groundstation.*;
 * CfnConfig cfnConfig = CfnConfig.Builder.create(this, "MyCfnConfig")
 * .configData(ConfigDataProperty.builder()
 * .antennaDownlinkConfig(AntennaDownlinkConfigProperty.builder()
 * .spectrumConfig(SpectrumConfigProperty.builder()
 * .bandwidth(FrequencyBandwidthProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .centerFrequency(FrequencyProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .polarization("polarization")
 * .build())
 * .build())
 * .antennaDownlinkDemodDecodeConfig(AntennaDownlinkDemodDecodeConfigProperty.builder()
 * .decodeConfig(DecodeConfigProperty.builder()
 * .unvalidatedJson("unvalidatedJson")
 * .build())
 * .demodulationConfig(DemodulationConfigProperty.builder()
 * .unvalidatedJson("unvalidatedJson")
 * .build())
 * .spectrumConfig(SpectrumConfigProperty.builder()
 * .bandwidth(FrequencyBandwidthProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .centerFrequency(FrequencyProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .polarization("polarization")
 * .build())
 * .build())
 * .antennaUplinkConfig(AntennaUplinkConfigProperty.builder()
 * .spectrumConfig(UplinkSpectrumConfigProperty.builder()
 * .centerFrequency(FrequencyProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .polarization("polarization")
 * .build())
 * .targetEirp(EirpProperty.builder()
 * .units("units")
 * .value(123)
 * .build())
 * .transmitDisabled(false)
 * .build())
 * .dataflowEndpointConfig(DataflowEndpointConfigProperty.builder()
 * .dataflowEndpointName("dataflowEndpointName")
 * .dataflowEndpointRegion("dataflowEndpointRegion")
 * .build())
 * .s3RecordingConfig(S3RecordingConfigProperty.builder()
 * .bucketArn("bucketArn")
 * .prefix("prefix")
 * .roleArn("roleArn")
 * .build())
 * .trackingConfig(TrackingConfigProperty.builder()
 * .autotrack("autotrack")
 * .build())
 * .uplinkEchoConfig(UplinkEchoConfigProperty.builder()
 * .antennaUplinkConfigArn("antennaUplinkConfigArn")
 * .enabled(false)
 * .build())
 * .build())
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html)
 */
@CdkDslMarker
public class CfnConfigDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnConfig.Builder = CfnConfig.Builder.create(scope, id)

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * Object containing the parameters of a config.
   *
   * Only one subtype may be specified per config. See the subtype definitions for a description of
   * each config subtype.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
   * @param configData Object containing the parameters of a config. 
   */
  public fun configData(configData: IResolvable) {
    cdkBuilder.configData(configData)
  }

  /**
   * Object containing the parameters of a config.
   *
   * Only one subtype may be specified per config. See the subtype definitions for a description of
   * each config subtype.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
   * @param configData Object containing the parameters of a config. 
   */
  public fun configData(configData: CfnConfig.ConfigDataProperty) {
    cdkBuilder.configData(configData)
  }

  /**
   * The name of the config object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-name)
   * @param name The name of the config object. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * Tags assigned to a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
   * @param tags Tags assigned to a resource. 
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * Tags assigned to a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
   * @param tags Tags assigned to a resource. 
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnConfig {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
