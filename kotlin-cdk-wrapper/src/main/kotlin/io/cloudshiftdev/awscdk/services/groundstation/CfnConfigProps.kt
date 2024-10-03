@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnConfig`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.groundstation.*;
 * CfnConfigProps cfnConfigProps = CfnConfigProps.builder()
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
public interface CfnConfigProps {
  /**
   * Object containing the parameters of a config.
   *
   * Only one subtype may be specified per config. See the subtype definitions for a description of
   * each config subtype.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
   */
  public fun configData(): Any

  /**
   * The name of the config object.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-name)
   */
  public fun name(): String

  /**
   * Tags assigned to a resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnConfigProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    public fun configData(configData: IResolvable)

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    public fun configData(configData: CfnConfig.ConfigDataProperty)

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3aa406290fe9e03b6d375c472620e0af2bd3dcd2531c9dc5b24304c0018eea")
    public fun configData(configData: CfnConfig.ConfigDataProperty.Builder.() -> Unit)

    /**
     * @param name The name of the config object. 
     */
    public fun name(name: String)

    /**
     * @param tags Tags assigned to a resource.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags assigned to a resource.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.groundstation.CfnConfigProps.Builder =
        software.amazon.awscdk.services.groundstation.CfnConfigProps.builder()

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    override fun configData(configData: IResolvable) {
      cdkBuilder.configData(configData.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    override fun configData(configData: CfnConfig.ConfigDataProperty) {
      cdkBuilder.configData(configData.let(CfnConfig.ConfigDataProperty.Companion::unwrap))
    }

    /**
     * @param configData Object containing the parameters of a config. 
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("eb3aa406290fe9e03b6d375c472620e0af2bd3dcd2531c9dc5b24304c0018eea")
    override fun configData(configData: CfnConfig.ConfigDataProperty.Builder.() -> Unit): Unit =
        configData(CfnConfig.ConfigDataProperty(configData))

    /**
     * @param name The name of the config object. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Tags assigned to a resource.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags assigned to a resource.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnConfigProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.groundstation.CfnConfigProps,
  ) : CdkObject(cdkObject),
      CfnConfigProps {
    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     */
    override fun configData(): Any = unwrap(this).getConfigData()

    /**
     * The name of the config object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfigProps):
        CfnConfigProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConfigProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigProps):
        software.amazon.awscdk.services.groundstation.CfnConfigProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.groundstation.CfnConfigProps
  }
}
