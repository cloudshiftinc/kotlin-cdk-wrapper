@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.groundstation

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * import io.cloudshiftdev.awscdk.services.groundstation.*;
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
public open class CfnConfig internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The ARN of the config, such as
   * `arn:aws:groundstation:us-east-2:1234567890:config/tracking/9940bf3b-d2ba-427e-9906-842b5e5d2296`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the config, such as `9940bf3b-d2ba-427e-9906-842b5e5d2296` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The type of the config, such as `tracking` .
   */
  public open fun attrType(): String = unwrap(this).getAttrType()

  /**
   * Object containing the parameters of a config.
   */
  public open fun configData(): Any = unwrap(this).getConfigData()

  /**
   * Object containing the parameters of a config.
   */
  public open fun configData(`value`: IResolvable) {
    unwrap(this).setConfigData(`value`.let(IResolvable::unwrap))
  }

  /**
   * Object containing the parameters of a config.
   */
  public open fun configData(`value`: ConfigDataProperty) {
    unwrap(this).setConfigData(`value`.let(ConfigDataProperty::unwrap))
  }

  /**
   * Object containing the parameters of a config.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("ad1cba991ba68797a0182dfde1623e59e6af576977ec8c35cf05cfa9eddc8d80")
  public open fun configData(`value`: ConfigDataProperty.Builder.() -> Unit): Unit =
      configData(ConfigDataProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the config object.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the config object.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags assigned to a resource.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags assigned to a resource.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags assigned to a resource.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.groundstation.CfnConfig].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     * @param configData Object containing the parameters of a config. 
     */
    public fun configData(configData: IResolvable)

    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     * @param configData Object containing the parameters of a config. 
     */
    public fun configData(configData: ConfigDataProperty)

    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     * @param configData Object containing the parameters of a config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bdf5af7de0ff43d0573dd7103ea00c681cadc3f9f100193f8727c8b62912646")
    public fun configData(configData: ConfigDataProperty.Builder.() -> Unit)

    /**
     * The name of the config object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-name)
     * @param name The name of the config object. 
     */
    public fun name(name: String)

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
     * @param tags Tags assigned to a resource. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
     * @param tags Tags assigned to a resource. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.groundstation.CfnConfig.Builder =
        software.amazon.awscdk.services.groundstation.CfnConfig.Builder.create(scope, id)

    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     * @param configData Object containing the parameters of a config. 
     */
    override fun configData(configData: IResolvable) {
      cdkBuilder.configData(configData.let(IResolvable::unwrap))
    }

    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     * @param configData Object containing the parameters of a config. 
     */
    override fun configData(configData: ConfigDataProperty) {
      cdkBuilder.configData(configData.let(ConfigDataProperty::unwrap))
    }

    /**
     * Object containing the parameters of a config.
     *
     * Only one subtype may be specified per config. See the subtype definitions for a description
     * of each config subtype.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-configdata)
     * @param configData Object containing the parameters of a config. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("3bdf5af7de0ff43d0573dd7103ea00c681cadc3f9f100193f8727c8b62912646")
    override fun configData(configData: ConfigDataProperty.Builder.() -> Unit): Unit =
        configData(ConfigDataProperty(configData))

    /**
     * The name of the config object.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-name)
     * @param name The name of the config object. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
     * @param tags Tags assigned to a resource. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags assigned to a resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-config.html#cfn-groundstation-config-tags)
     * @param tags Tags assigned to a resource. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.groundstation.CfnConfig.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfig {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfig(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig): CfnConfig
        = CfnConfig(cdkObject)

    internal fun unwrap(wrapped: CfnConfig): software.amazon.awscdk.services.groundstation.CfnConfig
        = wrapped.cdkObject
  }

  /**
   * Provides information to AWS Ground Station about which IP endpoints to use during a contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * DataflowEndpointConfigProperty dataflowEndpointConfigProperty =
   * DataflowEndpointConfigProperty.builder()
   * .dataflowEndpointName("dataflowEndpointName")
   * .dataflowEndpointRegion("dataflowEndpointRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-dataflowendpointconfig.html)
   */
  public interface DataflowEndpointConfigProperty {
    /**
     * The name of the dataflow endpoint to use during contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-dataflowendpointconfig.html#cfn-groundstation-config-dataflowendpointconfig-dataflowendpointname)
     */
    public fun dataflowEndpointName(): String? = unwrap(this).getDataflowEndpointName()

    /**
     * The region of the dataflow endpoint to use during contacts.
     *
     * When omitted, Ground Station will use the region of the contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-dataflowendpointconfig.html#cfn-groundstation-config-dataflowendpointconfig-dataflowendpointregion)
     */
    public fun dataflowEndpointRegion(): String? = unwrap(this).getDataflowEndpointRegion()

    /**
     * A builder for [DataflowEndpointConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataflowEndpointName The name of the dataflow endpoint to use during contacts.
       */
      public fun dataflowEndpointName(dataflowEndpointName: String)

      /**
       * @param dataflowEndpointRegion The region of the dataflow endpoint to use during contacts.
       * When omitted, Ground Station will use the region of the contact.
       */
      public fun dataflowEndpointRegion(dataflowEndpointRegion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty.builder()

      /**
       * @param dataflowEndpointName The name of the dataflow endpoint to use during contacts.
       */
      override fun dataflowEndpointName(dataflowEndpointName: String) {
        cdkBuilder.dataflowEndpointName(dataflowEndpointName)
      }

      /**
       * @param dataflowEndpointRegion The region of the dataflow endpoint to use during contacts.
       * When omitted, Ground Station will use the region of the contact.
       */
      override fun dataflowEndpointRegion(dataflowEndpointRegion: String) {
        cdkBuilder.dataflowEndpointRegion(dataflowEndpointRegion)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty,
    ) : CdkObject(cdkObject), DataflowEndpointConfigProperty {
      /**
       * The name of the dataflow endpoint to use during contacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-dataflowendpointconfig.html#cfn-groundstation-config-dataflowendpointconfig-dataflowendpointname)
       */
      override fun dataflowEndpointName(): String? = unwrap(this).getDataflowEndpointName()

      /**
       * The region of the dataflow endpoint to use during contacts.
       *
       * When omitted, Ground Station will use the region of the contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-dataflowendpointconfig.html#cfn-groundstation-config-dataflowendpointconfig-dataflowendpointregion)
       */
      override fun dataflowEndpointRegion(): String? = unwrap(this).getDataflowEndpointRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataflowEndpointConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty):
          DataflowEndpointConfigProperty = CdkObjectWrappers.wrap(cdkObject) as
          DataflowEndpointConfigProperty

      internal fun unwrap(wrapped: DataflowEndpointConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.DataflowEndpointConfigProperty
    }
  }

  /**
   * Defines a uplink spectrum.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * UplinkSpectrumConfigProperty uplinkSpectrumConfigProperty =
   * UplinkSpectrumConfigProperty.builder()
   * .centerFrequency(FrequencyProperty.builder()
   * .units("units")
   * .value(123)
   * .build())
   * .polarization("polarization")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkspectrumconfig.html)
   */
  public interface UplinkSpectrumConfigProperty {
    /**
     * The center frequency of the spectrum.
     *
     * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120
     * MHz for uplink.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkspectrumconfig.html#cfn-groundstation-config-uplinkspectrumconfig-centerfrequency)
     */
    public fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

    /**
     * The polarization of the spectrum.
     *
     * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkspectrumconfig.html#cfn-groundstation-config-uplinkspectrumconfig-polarization)
     */
    public fun polarization(): String? = unwrap(this).getPolarization()

    /**
     * A builder for [UplinkSpectrumConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      public fun centerFrequency(centerFrequency: IResolvable)

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      public fun centerFrequency(centerFrequency: FrequencyProperty)

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce5ef5bdc5a0cc681dbba37350877f9524c0fb76096c96eb150111dddad9694d")
      public fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit)

      /**
       * @param polarization The polarization of the spectrum.
       * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` .
       */
      public fun polarization(polarization: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty.builder()

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      override fun centerFrequency(centerFrequency: IResolvable) {
        cdkBuilder.centerFrequency(centerFrequency.let(IResolvable::unwrap))
      }

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      override fun centerFrequency(centerFrequency: FrequencyProperty) {
        cdkBuilder.centerFrequency(centerFrequency.let(FrequencyProperty::unwrap))
      }

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ce5ef5bdc5a0cc681dbba37350877f9524c0fb76096c96eb150111dddad9694d")
      override fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit): Unit =
          centerFrequency(FrequencyProperty(centerFrequency))

      /**
       * @param polarization The polarization of the spectrum.
       * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` .
       */
      override fun polarization(polarization: String) {
        cdkBuilder.polarization(polarization)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty,
    ) : CdkObject(cdkObject), UplinkSpectrumConfigProperty {
      /**
       * The center frequency of the spectrum.
       *
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkspectrumconfig.html#cfn-groundstation-config-uplinkspectrumconfig-centerfrequency)
       */
      override fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

      /**
       * The polarization of the spectrum.
       *
       * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkspectrumconfig.html#cfn-groundstation-config-uplinkspectrumconfig-polarization)
       */
      override fun polarization(): String? = unwrap(this).getPolarization()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UplinkSpectrumConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty):
          UplinkSpectrumConfigProperty = CdkObjectWrappers.wrap(cdkObject) as
          UplinkSpectrumConfigProperty

      internal fun unwrap(wrapped: UplinkSpectrumConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkSpectrumConfigProperty
    }
  }

  /**
   * Provides information about how AWS Ground Station should track the satellite through the sky
   * during a contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * TrackingConfigProperty trackingConfigProperty = TrackingConfigProperty.builder()
   * .autotrack("autotrack")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-trackingconfig.html)
   */
  public interface TrackingConfigProperty {
    /**
     * Specifies whether or not to use autotrack.
     *
     * `REMOVED` specifies that program track should only be used during the contact. `PREFERRED`
     * specifies that autotracking is preferred during the contact but fallback to program track if the
     * signal is lost. `REQUIRED` specifies that autotracking is required during the contact and not to
     * use program track if the signal is lost.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-trackingconfig.html#cfn-groundstation-config-trackingconfig-autotrack)
     */
    public fun autotrack(): String? = unwrap(this).getAutotrack()

    /**
     * A builder for [TrackingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autotrack Specifies whether or not to use autotrack.
       * `REMOVED` specifies that program track should only be used during the contact. `PREFERRED`
       * specifies that autotracking is preferred during the contact but fallback to program track if
       * the signal is lost. `REQUIRED` specifies that autotracking is required during the contact and
       * not to use program track if the signal is lost.
       */
      public fun autotrack(autotrack: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty.builder()

      /**
       * @param autotrack Specifies whether or not to use autotrack.
       * `REMOVED` specifies that program track should only be used during the contact. `PREFERRED`
       * specifies that autotracking is preferred during the contact but fallback to program track if
       * the signal is lost. `REQUIRED` specifies that autotracking is required during the contact and
       * not to use program track if the signal is lost.
       */
      override fun autotrack(autotrack: String) {
        cdkBuilder.autotrack(autotrack)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty,
    ) : CdkObject(cdkObject), TrackingConfigProperty {
      /**
       * Specifies whether or not to use autotrack.
       *
       * `REMOVED` specifies that program track should only be used during the contact. `PREFERRED`
       * specifies that autotracking is preferred during the contact but fallback to program track if
       * the signal is lost. `REQUIRED` specifies that autotracking is required during the contact and
       * not to use program track if the signal is lost.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-trackingconfig.html#cfn-groundstation-config-trackingconfig-autotrack)
       */
      override fun autotrack(): String? = unwrap(this).getAutotrack()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TrackingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty):
          TrackingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as TrackingConfigProperty

      internal fun unwrap(wrapped: TrackingConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.TrackingConfigProperty
    }
  }

  /**
   * Defines a frequency.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * FrequencyProperty frequencyProperty = FrequencyProperty.builder()
   * .units("units")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequency.html)
   */
  public interface FrequencyProperty {
    /**
     * The units of the frequency.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequency.html#cfn-groundstation-config-frequency-units)
     */
    public fun units(): String? = unwrap(this).getUnits()

    /**
     * The value of the frequency.
     *
     * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120
     * MHz for uplink.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequency.html#cfn-groundstation-config-frequency-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [FrequencyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param units The units of the frequency.
       */
      public fun units(units: String)

      /**
       * @param value The value of the frequency.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty.builder()

      /**
       * @param units The units of the frequency.
       */
      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      /**
       * @param value The value of the frequency.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty,
    ) : CdkObject(cdkObject), FrequencyProperty {
      /**
       * The units of the frequency.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequency.html#cfn-groundstation-config-frequency-units)
       */
      override fun units(): String? = unwrap(this).getUnits()

      /**
       * The value of the frequency.
       *
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequency.html#cfn-groundstation-config-frequency-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrequencyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty):
          FrequencyProperty = CdkObjectWrappers.wrap(cdkObject) as FrequencyProperty

      internal fun unwrap(wrapped: FrequencyProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyProperty
    }
  }

  /**
   * Config objects provide information to Ground Station about how to configure the antenna and how
   * data flows during a contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * ConfigDataProperty configDataProperty = ConfigDataProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html)
   */
  public interface ConfigDataProperty {
    /**
     * Provides information for an antenna downlink config object.
     *
     * Antenna downlink config objects are used to provide parameters for downlinks where no
     * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-antennadownlinkconfig)
     */
    public fun antennaDownlinkConfig(): Any? = unwrap(this).getAntennaDownlinkConfig()

    /**
     * Provides information for a downlink demod decode config object.
     *
     * Downlink demod decode config objects are used to provide parameters for downlinks where the
     * Ground Station service will demodulate and decode the downlinked data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-antennadownlinkdemoddecodeconfig)
     */
    public fun antennaDownlinkDemodDecodeConfig(): Any? =
        unwrap(this).getAntennaDownlinkDemodDecodeConfig()

    /**
     * Provides information for an uplink config object.
     *
     * Uplink config objects are used to provide parameters for uplink contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-antennauplinkconfig)
     */
    public fun antennaUplinkConfig(): Any? = unwrap(this).getAntennaUplinkConfig()

    /**
     * Provides information for a dataflow endpoint config object.
     *
     * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s) to
     * use during a contact. Dataflow endpoints are where Ground Station sends data during a downlink
     * contact and where Ground Station receives data to send to the satellite during an uplink
     * contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-dataflowendpointconfig)
     */
    public fun dataflowEndpointConfig(): Any? = unwrap(this).getDataflowEndpointConfig()

    /**
     * Provides information for an S3 recording config object.
     *
     * S3 recording config objects are used to provide parameters for S3 recording during downlink
     * contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-s3recordingconfig)
     */
    public fun s3RecordingConfig(): Any? = unwrap(this).getS3RecordingConfig()

    /**
     * Provides information for a tracking config object.
     *
     * Tracking config objects are used to provide parameters about how to track the satellite
     * through the sky during a contact.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-trackingconfig)
     */
    public fun trackingConfig(): Any? = unwrap(this).getTrackingConfig()

    /**
     * Provides information for an uplink echo config object.
     *
     * Uplink echo config objects are used to provide parameters for uplink echo during uplink
     * contacts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-uplinkechoconfig)
     */
    public fun uplinkEchoConfig(): Any? = unwrap(this).getUplinkEchoConfig()

    /**
     * A builder for [ConfigDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
       * Antenna downlink config objects are used to provide parameters for downlinks where no
       * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
       */
      public fun antennaDownlinkConfig(antennaDownlinkConfig: IResolvable)

      /**
       * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
       * Antenna downlink config objects are used to provide parameters for downlinks where no
       * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
       */
      public fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty)

      /**
       * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
       * Antenna downlink config objects are used to provide parameters for downlinks where no
       * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7a2cb2e2de5da61ba05fee08241c3e250ac1c4ae9b09b4c778b8b7fa82f7764")
      public
          fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty.Builder.() -> Unit)

      /**
       * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
       * config object.
       * Downlink demod decode config objects are used to provide parameters for downlinks where the
       * Ground Station service will demodulate and decode the downlinked data.
       */
      public fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: IResolvable)

      /**
       * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
       * config object.
       * Downlink demod decode config objects are used to provide parameters for downlinks where the
       * Ground Station service will demodulate and decode the downlinked data.
       */
      public
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty)

      /**
       * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
       * config object.
       * Downlink demod decode config objects are used to provide parameters for downlinks where the
       * Ground Station service will demodulate and decode the downlinked data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17d0baf1af43e1879e4081b34471973f4d932da70bfc6a9a450e0ea950877607")
      public
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty.Builder.() -> Unit)

      /**
       * @param antennaUplinkConfig Provides information for an uplink config object.
       * Uplink config objects are used to provide parameters for uplink contacts.
       */
      public fun antennaUplinkConfig(antennaUplinkConfig: IResolvable)

      /**
       * @param antennaUplinkConfig Provides information for an uplink config object.
       * Uplink config objects are used to provide parameters for uplink contacts.
       */
      public fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty)

      /**
       * @param antennaUplinkConfig Provides information for an uplink config object.
       * Uplink config objects are used to provide parameters for uplink contacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e683d9dbb2881828c7f91e7acf80e85b64ac1a993fe3920e567b26f5ab4bb3e")
      public
          fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty.Builder.() -> Unit)

      /**
       * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
       * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
       * to use during a contact. Dataflow endpoints are where Ground Station sends data during a
       * downlink contact and where Ground Station receives data to send to the satellite during an
       * uplink contact.
       */
      public fun dataflowEndpointConfig(dataflowEndpointConfig: IResolvable)

      /**
       * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
       * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
       * to use during a contact. Dataflow endpoints are where Ground Station sends data during a
       * downlink contact and where Ground Station receives data to send to the satellite during an
       * uplink contact.
       */
      public fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty)

      /**
       * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
       * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
       * to use during a contact. Dataflow endpoints are where Ground Station sends data during a
       * downlink contact and where Ground Station receives data to send to the satellite during an
       * uplink contact.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ecd5f3e83583f469ac597f4908c851e4e743ba415170780e3b6ec1b0b32a07f")
      public
          fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty.Builder.() -> Unit)

      /**
       * @param s3RecordingConfig Provides information for an S3 recording config object.
       * S3 recording config objects are used to provide parameters for S3 recording during downlink
       * contacts.
       */
      public fun s3RecordingConfig(s3RecordingConfig: IResolvable)

      /**
       * @param s3RecordingConfig Provides information for an S3 recording config object.
       * S3 recording config objects are used to provide parameters for S3 recording during downlink
       * contacts.
       */
      public fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty)

      /**
       * @param s3RecordingConfig Provides information for an S3 recording config object.
       * S3 recording config objects are used to provide parameters for S3 recording during downlink
       * contacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b810d472a639602948402c858f31c95b7f7e2c83183883330e5db314bbe364")
      public fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty.Builder.() -> Unit)

      /**
       * @param trackingConfig Provides information for a tracking config object.
       * Tracking config objects are used to provide parameters about how to track the satellite
       * through the sky during a contact.
       */
      public fun trackingConfig(trackingConfig: IResolvable)

      /**
       * @param trackingConfig Provides information for a tracking config object.
       * Tracking config objects are used to provide parameters about how to track the satellite
       * through the sky during a contact.
       */
      public fun trackingConfig(trackingConfig: TrackingConfigProperty)

      /**
       * @param trackingConfig Provides information for a tracking config object.
       * Tracking config objects are used to provide parameters about how to track the satellite
       * through the sky during a contact.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc026be17cdda923100e7e206217b7badfcc1d5b4b8787c6fff3048146a53ece")
      public fun trackingConfig(trackingConfig: TrackingConfigProperty.Builder.() -> Unit)

      /**
       * @param uplinkEchoConfig Provides information for an uplink echo config object.
       * Uplink echo config objects are used to provide parameters for uplink echo during uplink
       * contacts.
       */
      public fun uplinkEchoConfig(uplinkEchoConfig: IResolvable)

      /**
       * @param uplinkEchoConfig Provides information for an uplink echo config object.
       * Uplink echo config objects are used to provide parameters for uplink echo during uplink
       * contacts.
       */
      public fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty)

      /**
       * @param uplinkEchoConfig Provides information for an uplink echo config object.
       * Uplink echo config objects are used to provide parameters for uplink echo during uplink
       * contacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2dd7c421827f5ef12e5f61f27d89e3cb3a7df37bfde8d3f36d1365ac5be1962")
      public fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty.builder()

      /**
       * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
       * Antenna downlink config objects are used to provide parameters for downlinks where no
       * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
       */
      override fun antennaDownlinkConfig(antennaDownlinkConfig: IResolvable) {
        cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig.let(IResolvable::unwrap))
      }

      /**
       * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
       * Antenna downlink config objects are used to provide parameters for downlinks where no
       * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
       */
      override fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty) {
        cdkBuilder.antennaDownlinkConfig(antennaDownlinkConfig.let(AntennaDownlinkConfigProperty::unwrap))
      }

      /**
       * @param antennaDownlinkConfig Provides information for an antenna downlink config object.
       * Antenna downlink config objects are used to provide parameters for downlinks where no
       * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e7a2cb2e2de5da61ba05fee08241c3e250ac1c4ae9b09b4c778b8b7fa82f7764")
      override
          fun antennaDownlinkConfig(antennaDownlinkConfig: AntennaDownlinkConfigProperty.Builder.() -> Unit):
          Unit = antennaDownlinkConfig(AntennaDownlinkConfigProperty(antennaDownlinkConfig))

      /**
       * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
       * config object.
       * Downlink demod decode config objects are used to provide parameters for downlinks where the
       * Ground Station service will demodulate and decode the downlinked data.
       */
      override fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: IResolvable) {
        cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig.let(IResolvable::unwrap))
      }

      /**
       * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
       * config object.
       * Downlink demod decode config objects are used to provide parameters for downlinks where the
       * Ground Station service will demodulate and decode the downlinked data.
       */
      override
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty) {
        cdkBuilder.antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig.let(AntennaDownlinkDemodDecodeConfigProperty::unwrap))
      }

      /**
       * @param antennaDownlinkDemodDecodeConfig Provides information for a downlink demod decode
       * config object.
       * Downlink demod decode config objects are used to provide parameters for downlinks where the
       * Ground Station service will demodulate and decode the downlinked data.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("17d0baf1af43e1879e4081b34471973f4d932da70bfc6a9a450e0ea950877607")
      override
          fun antennaDownlinkDemodDecodeConfig(antennaDownlinkDemodDecodeConfig: AntennaDownlinkDemodDecodeConfigProperty.Builder.() -> Unit):
          Unit =
          antennaDownlinkDemodDecodeConfig(AntennaDownlinkDemodDecodeConfigProperty(antennaDownlinkDemodDecodeConfig))

      /**
       * @param antennaUplinkConfig Provides information for an uplink config object.
       * Uplink config objects are used to provide parameters for uplink contacts.
       */
      override fun antennaUplinkConfig(antennaUplinkConfig: IResolvable) {
        cdkBuilder.antennaUplinkConfig(antennaUplinkConfig.let(IResolvable::unwrap))
      }

      /**
       * @param antennaUplinkConfig Provides information for an uplink config object.
       * Uplink config objects are used to provide parameters for uplink contacts.
       */
      override fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty) {
        cdkBuilder.antennaUplinkConfig(antennaUplinkConfig.let(AntennaUplinkConfigProperty::unwrap))
      }

      /**
       * @param antennaUplinkConfig Provides information for an uplink config object.
       * Uplink config objects are used to provide parameters for uplink contacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9e683d9dbb2881828c7f91e7acf80e85b64ac1a993fe3920e567b26f5ab4bb3e")
      override
          fun antennaUplinkConfig(antennaUplinkConfig: AntennaUplinkConfigProperty.Builder.() -> Unit):
          Unit = antennaUplinkConfig(AntennaUplinkConfigProperty(antennaUplinkConfig))

      /**
       * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
       * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
       * to use during a contact. Dataflow endpoints are where Ground Station sends data during a
       * downlink contact and where Ground Station receives data to send to the satellite during an
       * uplink contact.
       */
      override fun dataflowEndpointConfig(dataflowEndpointConfig: IResolvable) {
        cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig.let(IResolvable::unwrap))
      }

      /**
       * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
       * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
       * to use during a contact. Dataflow endpoints are where Ground Station sends data during a
       * downlink contact and where Ground Station receives data to send to the satellite during an
       * uplink contact.
       */
      override fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty) {
        cdkBuilder.dataflowEndpointConfig(dataflowEndpointConfig.let(DataflowEndpointConfigProperty::unwrap))
      }

      /**
       * @param dataflowEndpointConfig Provides information for a dataflow endpoint config object.
       * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
       * to use during a contact. Dataflow endpoints are where Ground Station sends data during a
       * downlink contact and where Ground Station receives data to send to the satellite during an
       * uplink contact.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8ecd5f3e83583f469ac597f4908c851e4e743ba415170780e3b6ec1b0b32a07f")
      override
          fun dataflowEndpointConfig(dataflowEndpointConfig: DataflowEndpointConfigProperty.Builder.() -> Unit):
          Unit = dataflowEndpointConfig(DataflowEndpointConfigProperty(dataflowEndpointConfig))

      /**
       * @param s3RecordingConfig Provides information for an S3 recording config object.
       * S3 recording config objects are used to provide parameters for S3 recording during downlink
       * contacts.
       */
      override fun s3RecordingConfig(s3RecordingConfig: IResolvable) {
        cdkBuilder.s3RecordingConfig(s3RecordingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param s3RecordingConfig Provides information for an S3 recording config object.
       * S3 recording config objects are used to provide parameters for S3 recording during downlink
       * contacts.
       */
      override fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty) {
        cdkBuilder.s3RecordingConfig(s3RecordingConfig.let(S3RecordingConfigProperty::unwrap))
      }

      /**
       * @param s3RecordingConfig Provides information for an S3 recording config object.
       * S3 recording config objects are used to provide parameters for S3 recording during downlink
       * contacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("30b810d472a639602948402c858f31c95b7f7e2c83183883330e5db314bbe364")
      override
          fun s3RecordingConfig(s3RecordingConfig: S3RecordingConfigProperty.Builder.() -> Unit):
          Unit = s3RecordingConfig(S3RecordingConfigProperty(s3RecordingConfig))

      /**
       * @param trackingConfig Provides information for a tracking config object.
       * Tracking config objects are used to provide parameters about how to track the satellite
       * through the sky during a contact.
       */
      override fun trackingConfig(trackingConfig: IResolvable) {
        cdkBuilder.trackingConfig(trackingConfig.let(IResolvable::unwrap))
      }

      /**
       * @param trackingConfig Provides information for a tracking config object.
       * Tracking config objects are used to provide parameters about how to track the satellite
       * through the sky during a contact.
       */
      override fun trackingConfig(trackingConfig: TrackingConfigProperty) {
        cdkBuilder.trackingConfig(trackingConfig.let(TrackingConfigProperty::unwrap))
      }

      /**
       * @param trackingConfig Provides information for a tracking config object.
       * Tracking config objects are used to provide parameters about how to track the satellite
       * through the sky during a contact.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("fc026be17cdda923100e7e206217b7badfcc1d5b4b8787c6fff3048146a53ece")
      override fun trackingConfig(trackingConfig: TrackingConfigProperty.Builder.() -> Unit): Unit =
          trackingConfig(TrackingConfigProperty(trackingConfig))

      /**
       * @param uplinkEchoConfig Provides information for an uplink echo config object.
       * Uplink echo config objects are used to provide parameters for uplink echo during uplink
       * contacts.
       */
      override fun uplinkEchoConfig(uplinkEchoConfig: IResolvable) {
        cdkBuilder.uplinkEchoConfig(uplinkEchoConfig.let(IResolvable::unwrap))
      }

      /**
       * @param uplinkEchoConfig Provides information for an uplink echo config object.
       * Uplink echo config objects are used to provide parameters for uplink echo during uplink
       * contacts.
       */
      override fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty) {
        cdkBuilder.uplinkEchoConfig(uplinkEchoConfig.let(UplinkEchoConfigProperty::unwrap))
      }

      /**
       * @param uplinkEchoConfig Provides information for an uplink echo config object.
       * Uplink echo config objects are used to provide parameters for uplink echo during uplink
       * contacts.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f2dd7c421827f5ef12e5f61f27d89e3cb3a7df37bfde8d3f36d1365ac5be1962")
      override fun uplinkEchoConfig(uplinkEchoConfig: UplinkEchoConfigProperty.Builder.() -> Unit):
          Unit = uplinkEchoConfig(UplinkEchoConfigProperty(uplinkEchoConfig))

      public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty,
    ) : CdkObject(cdkObject), ConfigDataProperty {
      /**
       * Provides information for an antenna downlink config object.
       *
       * Antenna downlink config objects are used to provide parameters for downlinks where no
       * demodulation or decoding is performed by Ground Station (RF over IP downlinks).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-antennadownlinkconfig)
       */
      override fun antennaDownlinkConfig(): Any? = unwrap(this).getAntennaDownlinkConfig()

      /**
       * Provides information for a downlink demod decode config object.
       *
       * Downlink demod decode config objects are used to provide parameters for downlinks where the
       * Ground Station service will demodulate and decode the downlinked data.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-antennadownlinkdemoddecodeconfig)
       */
      override fun antennaDownlinkDemodDecodeConfig(): Any? =
          unwrap(this).getAntennaDownlinkDemodDecodeConfig()

      /**
       * Provides information for an uplink config object.
       *
       * Uplink config objects are used to provide parameters for uplink contacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-antennauplinkconfig)
       */
      override fun antennaUplinkConfig(): Any? = unwrap(this).getAntennaUplinkConfig()

      /**
       * Provides information for a dataflow endpoint config object.
       *
       * Dataflow endpoint config objects are used to provide parameters about which IP endpoint(s)
       * to use during a contact. Dataflow endpoints are where Ground Station sends data during a
       * downlink contact and where Ground Station receives data to send to the satellite during an
       * uplink contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-dataflowendpointconfig)
       */
      override fun dataflowEndpointConfig(): Any? = unwrap(this).getDataflowEndpointConfig()

      /**
       * Provides information for an S3 recording config object.
       *
       * S3 recording config objects are used to provide parameters for S3 recording during downlink
       * contacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-s3recordingconfig)
       */
      override fun s3RecordingConfig(): Any? = unwrap(this).getS3RecordingConfig()

      /**
       * Provides information for a tracking config object.
       *
       * Tracking config objects are used to provide parameters about how to track the satellite
       * through the sky during a contact.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-trackingconfig)
       */
      override fun trackingConfig(): Any? = unwrap(this).getTrackingConfig()

      /**
       * Provides information for an uplink echo config object.
       *
       * Uplink echo config objects are used to provide parameters for uplink echo during uplink
       * contacts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-configdata.html#cfn-groundstation-config-configdata-uplinkechoconfig)
       */
      override fun uplinkEchoConfig(): Any? = unwrap(this).getUplinkEchoConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ConfigDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty):
          ConfigDataProperty = CdkObjectWrappers.wrap(cdkObject) as ConfigDataProperty

      internal fun unwrap(wrapped: ConfigDataProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.ConfigDataProperty
    }
  }

  /**
   * Defines a bandwidth.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * FrequencyBandwidthProperty frequencyBandwidthProperty = FrequencyBandwidthProperty.builder()
   * .units("units")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequencybandwidth.html)
   */
  public interface FrequencyBandwidthProperty {
    /**
     * The units of the bandwidth.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequencybandwidth.html#cfn-groundstation-config-frequencybandwidth-units)
     */
    public fun units(): String? = unwrap(this).getUnits()

    /**
     * The value of the bandwidth. AWS Ground Station currently has the following bandwidth
     * limitations:.
     *
     * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
     * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
     * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequencybandwidth.html#cfn-groundstation-config-frequencybandwidth-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [FrequencyBandwidthProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param units The units of the bandwidth.
       */
      public fun units(units: String)

      /**
       * @param value The value of the bandwidth. AWS Ground Station currently has the following
       * bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty.builder()

      /**
       * @param units The units of the bandwidth.
       */
      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      /**
       * @param value The value of the bandwidth. AWS Ground Station currently has the following
       * bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty,
    ) : CdkObject(cdkObject), FrequencyBandwidthProperty {
      /**
       * The units of the bandwidth.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequencybandwidth.html#cfn-groundstation-config-frequencybandwidth-units)
       */
      override fun units(): String? = unwrap(this).getUnits()

      /**
       * The value of the bandwidth. AWS Ground Station currently has the following bandwidth
       * limitations:.
       *
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequencybandwidth.html#cfn-groundstation-config-frequencybandwidth-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FrequencyBandwidthProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty):
          FrequencyBandwidthProperty = CdkObjectWrappers.wrap(cdkObject) as
          FrequencyBandwidthProperty

      internal fun unwrap(wrapped: FrequencyBandwidthProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.FrequencyBandwidthProperty
    }
  }

  /**
   * Defines decoding settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * DecodeConfigProperty decodeConfigProperty = DecodeConfigProperty.builder()
   * .unvalidatedJson("unvalidatedJson")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-decodeconfig.html)
   */
  public interface DecodeConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-decodeconfig.html#cfn-groundstation-config-decodeconfig-unvalidatedjson)
     */
    public fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()

    /**
     * A builder for [DecodeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unvalidatedJson the value to be set.
       */
      public fun unvalidatedJson(unvalidatedJson: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty.builder()

      /**
       * @param unvalidatedJson the value to be set.
       */
      override fun unvalidatedJson(unvalidatedJson: String) {
        cdkBuilder.unvalidatedJson(unvalidatedJson)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty,
    ) : CdkObject(cdkObject), DecodeConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-decodeconfig.html#cfn-groundstation-config-decodeconfig-unvalidatedjson)
       */
      override fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DecodeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty):
          DecodeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as DecodeConfigProperty

      internal fun unwrap(wrapped: DecodeConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.DecodeConfigProperty
    }
  }

  /**
   * Defines an equivalent isotropically radiated power (EIRP).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * EirpProperty eirpProperty = EirpProperty.builder()
   * .units("units")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-eirp.html)
   */
  public interface EirpProperty {
    /**
     * The units of the EIRP.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-eirp.html#cfn-groundstation-config-eirp-units)
     */
    public fun units(): String? = unwrap(this).getUnits()

    /**
     * The value of the EIRP.
     *
     * Valid values are between 20.0 to 50.0 dBW.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-eirp.html#cfn-groundstation-config-eirp-value)
     */
    public fun `value`(): Number? = unwrap(this).getValue()

    /**
     * A builder for [EirpProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param units The units of the EIRP.
       */
      public fun units(units: String)

      /**
       * @param value The value of the EIRP.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      public fun `value`(`value`: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty.builder()

      /**
       * @param units The units of the EIRP.
       */
      override fun units(units: String) {
        cdkBuilder.units(units)
      }

      /**
       * @param value The value of the EIRP.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      override fun `value`(`value`: Number) {
        cdkBuilder.`value`(`value`)
      }

      public fun build(): software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty,
    ) : CdkObject(cdkObject), EirpProperty {
      /**
       * The units of the EIRP.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-eirp.html#cfn-groundstation-config-eirp-units)
       */
      override fun units(): String? = unwrap(this).getUnits()

      /**
       * The value of the EIRP.
       *
       * Valid values are between 20.0 to 50.0 dBW.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-eirp.html#cfn-groundstation-config-eirp-value)
       */
      override fun `value`(): Number? = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EirpProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty):
          EirpProperty = CdkObjectWrappers.wrap(cdkObject) as EirpProperty

      internal fun unwrap(wrapped: EirpProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.EirpProperty
    }
  }

  /**
   * Provides information about how AWS Ground Station should configure an antenna for downlink
   * during a contact.
   *
   * Use an antenna downlink demod decode config in a mission profile to receive the downlink data
   * that has been demodulated and decoded.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * AntennaDownlinkDemodDecodeConfigProperty antennaDownlinkDemodDecodeConfigProperty =
   * AntennaDownlinkDemodDecodeConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html)
   */
  public interface AntennaDownlinkDemodDecodeConfigProperty {
    /**
     * Defines how the RF signal will be decoded.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html#cfn-groundstation-config-antennadownlinkdemoddecodeconfig-decodeconfig)
     */
    public fun decodeConfig(): Any? = unwrap(this).getDecodeConfig()

    /**
     * Defines how the RF signal will be demodulated.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html#cfn-groundstation-config-antennadownlinkdemoddecodeconfig-demodulationconfig)
     */
    public fun demodulationConfig(): Any? = unwrap(this).getDemodulationConfig()

    /**
     * Defines the spectrum configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html#cfn-groundstation-config-antennadownlinkdemoddecodeconfig-spectrumconfig)
     */
    public fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

    /**
     * A builder for [AntennaDownlinkDemodDecodeConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param decodeConfig Defines how the RF signal will be decoded.
       */
      public fun decodeConfig(decodeConfig: IResolvable)

      /**
       * @param decodeConfig Defines how the RF signal will be decoded.
       */
      public fun decodeConfig(decodeConfig: DecodeConfigProperty)

      /**
       * @param decodeConfig Defines how the RF signal will be decoded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f6fe2a6a288dc6d33fb2eed29827a3837936477d02861ab99cad291d7cde72")
      public fun decodeConfig(decodeConfig: DecodeConfigProperty.Builder.() -> Unit)

      /**
       * @param demodulationConfig Defines how the RF signal will be demodulated.
       */
      public fun demodulationConfig(demodulationConfig: IResolvable)

      /**
       * @param demodulationConfig Defines how the RF signal will be demodulated.
       */
      public fun demodulationConfig(demodulationConfig: DemodulationConfigProperty)

      /**
       * @param demodulationConfig Defines how the RF signal will be demodulated.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0a9f2fe13c3bd64c02bcd06addc44c8e1290399ec3a59a50da1a9d5af7c78e0")
      public
          fun demodulationConfig(demodulationConfig: DemodulationConfigProperty.Builder.() -> Unit)

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      public fun spectrumConfig(spectrumConfig: IResolvable)

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty)

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e396683af6258796a463bfcfe4e947b18814e7a7223d1dfbbf3f2a08d326e96")
      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty.builder()

      /**
       * @param decodeConfig Defines how the RF signal will be decoded.
       */
      override fun decodeConfig(decodeConfig: IResolvable) {
        cdkBuilder.decodeConfig(decodeConfig.let(IResolvable::unwrap))
      }

      /**
       * @param decodeConfig Defines how the RF signal will be decoded.
       */
      override fun decodeConfig(decodeConfig: DecodeConfigProperty) {
        cdkBuilder.decodeConfig(decodeConfig.let(DecodeConfigProperty::unwrap))
      }

      /**
       * @param decodeConfig Defines how the RF signal will be decoded.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c0f6fe2a6a288dc6d33fb2eed29827a3837936477d02861ab99cad291d7cde72")
      override fun decodeConfig(decodeConfig: DecodeConfigProperty.Builder.() -> Unit): Unit =
          decodeConfig(DecodeConfigProperty(decodeConfig))

      /**
       * @param demodulationConfig Defines how the RF signal will be demodulated.
       */
      override fun demodulationConfig(demodulationConfig: IResolvable) {
        cdkBuilder.demodulationConfig(demodulationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param demodulationConfig Defines how the RF signal will be demodulated.
       */
      override fun demodulationConfig(demodulationConfig: DemodulationConfigProperty) {
        cdkBuilder.demodulationConfig(demodulationConfig.let(DemodulationConfigProperty::unwrap))
      }

      /**
       * @param demodulationConfig Defines how the RF signal will be demodulated.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e0a9f2fe13c3bd64c02bcd06addc44c8e1290399ec3a59a50da1a9d5af7c78e0")
      override
          fun demodulationConfig(demodulationConfig: DemodulationConfigProperty.Builder.() -> Unit):
          Unit = demodulationConfig(DemodulationConfigProperty(demodulationConfig))

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      override fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(IResolvable::unwrap))
      }

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(SpectrumConfigProperty::unwrap))
      }

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5e396683af6258796a463bfcfe4e947b18814e7a7223d1dfbbf3f2a08d326e96")
      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit): Unit =
          spectrumConfig(SpectrumConfigProperty(spectrumConfig))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty,
    ) : CdkObject(cdkObject), AntennaDownlinkDemodDecodeConfigProperty {
      /**
       * Defines how the RF signal will be decoded.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html#cfn-groundstation-config-antennadownlinkdemoddecodeconfig-decodeconfig)
       */
      override fun decodeConfig(): Any? = unwrap(this).getDecodeConfig()

      /**
       * Defines how the RF signal will be demodulated.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html#cfn-groundstation-config-antennadownlinkdemoddecodeconfig-demodulationconfig)
       */
      override fun demodulationConfig(): Any? = unwrap(this).getDemodulationConfig()

      /**
       * Defines the spectrum configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkdemoddecodeconfig.html#cfn-groundstation-config-antennadownlinkdemoddecodeconfig-spectrumconfig)
       */
      override fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AntennaDownlinkDemodDecodeConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty):
          AntennaDownlinkDemodDecodeConfigProperty = CdkObjectWrappers.wrap(cdkObject) as
          AntennaDownlinkDemodDecodeConfigProperty

      internal fun unwrap(wrapped: AntennaDownlinkDemodDecodeConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkDemodDecodeConfigProperty
    }
  }

  /**
   * Defines demodulation settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * DemodulationConfigProperty demodulationConfigProperty = DemodulationConfigProperty.builder()
   * .unvalidatedJson("unvalidatedJson")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-demodulationconfig.html)
   */
  public interface DemodulationConfigProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-demodulationconfig.html#cfn-groundstation-config-demodulationconfig-unvalidatedjson)
     */
    public fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()

    /**
     * A builder for [DemodulationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param unvalidatedJson the value to be set.
       */
      public fun unvalidatedJson(unvalidatedJson: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty.builder()

      /**
       * @param unvalidatedJson the value to be set.
       */
      override fun unvalidatedJson(unvalidatedJson: String) {
        cdkBuilder.unvalidatedJson(unvalidatedJson)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty,
    ) : CdkObject(cdkObject), DemodulationConfigProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-demodulationconfig.html#cfn-groundstation-config-demodulationconfig-unvalidatedjson)
       */
      override fun unvalidatedJson(): String? = unwrap(this).getUnvalidatedJson()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DemodulationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty):
          DemodulationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as
          DemodulationConfigProperty

      internal fun unwrap(wrapped: DemodulationConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.DemodulationConfigProperty
    }
  }

  /**
   * Provides information about how AWS Ground Station should configure an antenna for downlink
   * during a contact.
   *
   * Use an antenna downlink config in a mission profile to receive the downlink data in raw DigIF
   * format.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * AntennaDownlinkConfigProperty antennaDownlinkConfigProperty =
   * AntennaDownlinkConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkconfig.html)
   */
  public interface AntennaDownlinkConfigProperty {
    /**
     * Defines the spectrum configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkconfig.html#cfn-groundstation-config-antennadownlinkconfig-spectrumconfig)
     */
    public fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

    /**
     * A builder for [AntennaDownlinkConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      public fun spectrumConfig(spectrumConfig: IResolvable)

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty)

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b5683f44729ff20d9fefa85e712c39f52d7130711aadca8f83422b35d01ae3")
      public fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty.builder()

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      override fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(IResolvable::unwrap))
      }

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(SpectrumConfigProperty::unwrap))
      }

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e6b5683f44729ff20d9fefa85e712c39f52d7130711aadca8f83422b35d01ae3")
      override fun spectrumConfig(spectrumConfig: SpectrumConfigProperty.Builder.() -> Unit): Unit =
          spectrumConfig(SpectrumConfigProperty(spectrumConfig))

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty,
    ) : CdkObject(cdkObject), AntennaDownlinkConfigProperty {
      /**
       * Defines the spectrum configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennadownlinkconfig.html#cfn-groundstation-config-antennadownlinkconfig-spectrumconfig)
       */
      override fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AntennaDownlinkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty):
          AntennaDownlinkConfigProperty = CdkObjectWrappers.wrap(cdkObject) as
          AntennaDownlinkConfigProperty

      internal fun unwrap(wrapped: AntennaDownlinkConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaDownlinkConfigProperty
    }
  }

  /**
   * Provides information about how AWS Ground Station should save downlink data to S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * S3RecordingConfigProperty s3RecordingConfigProperty = S3RecordingConfigProperty.builder()
   * .bucketArn("bucketArn")
   * .prefix("prefix")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html)
   */
  public interface S3RecordingConfigProperty {
    /**
     * S3 Bucket where the data is written.
     *
     * The name of the S3 Bucket provided must begin with `aws-groundstation` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html#cfn-groundstation-config-s3recordingconfig-bucketarn)
     */
    public fun bucketArn(): String? = unwrap(this).getBucketArn()

    /**
     * The prefix of the S3 data object.
     *
     * If you choose to use any optional keys for substitution, these values will be replaced with
     * the corresponding information from your contact details. For example, a prefix of
     * `{satellite_id}/{year}/{month}/{day}/` will replaced with `fake_satellite_id/2021/01/10/`
     *
     * *Optional keys for substitution* : `{satellite_id}` | `{config-name}` | `{config-id}` |
     * `{year}` | `{month}` | `{day}`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html#cfn-groundstation-config-s3recordingconfig-prefix)
     */
    public fun prefix(): String? = unwrap(this).getPrefix()

    /**
     * Defines the ARN of the role assumed for putting archives to S3.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html#cfn-groundstation-config-s3recordingconfig-rolearn)
     */
    public fun roleArn(): String? = unwrap(this).getRoleArn()

    /**
     * A builder for [S3RecordingConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bucketArn S3 Bucket where the data is written.
       * The name of the S3 Bucket provided must begin with `aws-groundstation` .
       */
      public fun bucketArn(bucketArn: String)

      /**
       * @param prefix The prefix of the S3 data object.
       * If you choose to use any optional keys for substitution, these values will be replaced with
       * the corresponding information from your contact details. For example, a prefix of
       * `{satellite_id}/{year}/{month}/{day}/` will replaced with `fake_satellite_id/2021/01/10/`
       *
       * *Optional keys for substitution* : `{satellite_id}` | `{config-name}` | `{config-id}` |
       * `{year}` | `{month}` | `{day}`
       */
      public fun prefix(prefix: String)

      /**
       * @param roleArn Defines the ARN of the role assumed for putting archives to S3.
       */
      public fun roleArn(roleArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty.builder()

      /**
       * @param bucketArn S3 Bucket where the data is written.
       * The name of the S3 Bucket provided must begin with `aws-groundstation` .
       */
      override fun bucketArn(bucketArn: String) {
        cdkBuilder.bucketArn(bucketArn)
      }

      /**
       * @param prefix The prefix of the S3 data object.
       * If you choose to use any optional keys for substitution, these values will be replaced with
       * the corresponding information from your contact details. For example, a prefix of
       * `{satellite_id}/{year}/{month}/{day}/` will replaced with `fake_satellite_id/2021/01/10/`
       *
       * *Optional keys for substitution* : `{satellite_id}` | `{config-name}` | `{config-id}` |
       * `{year}` | `{month}` | `{day}`
       */
      override fun prefix(prefix: String) {
        cdkBuilder.prefix(prefix)
      }

      /**
       * @param roleArn Defines the ARN of the role assumed for putting archives to S3.
       */
      override fun roleArn(roleArn: String) {
        cdkBuilder.roleArn(roleArn)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty,
    ) : CdkObject(cdkObject), S3RecordingConfigProperty {
      /**
       * S3 Bucket where the data is written.
       *
       * The name of the S3 Bucket provided must begin with `aws-groundstation` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html#cfn-groundstation-config-s3recordingconfig-bucketarn)
       */
      override fun bucketArn(): String? = unwrap(this).getBucketArn()

      /**
       * The prefix of the S3 data object.
       *
       * If you choose to use any optional keys for substitution, these values will be replaced with
       * the corresponding information from your contact details. For example, a prefix of
       * `{satellite_id}/{year}/{month}/{day}/` will replaced with `fake_satellite_id/2021/01/10/`
       *
       * *Optional keys for substitution* : `{satellite_id}` | `{config-name}` | `{config-id}` |
       * `{year}` | `{month}` | `{day}`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html#cfn-groundstation-config-s3recordingconfig-prefix)
       */
      override fun prefix(): String? = unwrap(this).getPrefix()

      /**
       * Defines the ARN of the role assumed for putting archives to S3.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html#cfn-groundstation-config-s3recordingconfig-rolearn)
       */
      override fun roleArn(): String? = unwrap(this).getRoleArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3RecordingConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty):
          S3RecordingConfigProperty = CdkObjectWrappers.wrap(cdkObject) as S3RecordingConfigProperty

      internal fun unwrap(wrapped: S3RecordingConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.S3RecordingConfigProperty
    }
  }

  /**
   * Provides information about how AWS Ground Station should echo back uplink transmissions to a
   * dataflow endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * UplinkEchoConfigProperty uplinkEchoConfigProperty = UplinkEchoConfigProperty.builder()
   * .antennaUplinkConfigArn("antennaUplinkConfigArn")
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkechoconfig.html)
   */
  public interface UplinkEchoConfigProperty {
    /**
     * Defines the ARN of the uplink config to echo back to a dataflow endpoint.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkechoconfig.html#cfn-groundstation-config-uplinkechoconfig-antennauplinkconfigarn)
     */
    public fun antennaUplinkConfigArn(): String? = unwrap(this).getAntennaUplinkConfigArn()

    /**
     * Whether or not uplink echo is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkechoconfig.html#cfn-groundstation-config-uplinkechoconfig-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * A builder for [UplinkEchoConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param antennaUplinkConfigArn Defines the ARN of the uplink config to echo back to a
       * dataflow endpoint.
       */
      public fun antennaUplinkConfigArn(antennaUplinkConfigArn: String)

      /**
       * @param enabled Whether or not uplink echo is enabled.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled Whether or not uplink echo is enabled.
       */
      public fun enabled(enabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty.builder()

      /**
       * @param antennaUplinkConfigArn Defines the ARN of the uplink config to echo back to a
       * dataflow endpoint.
       */
      override fun antennaUplinkConfigArn(antennaUplinkConfigArn: String) {
        cdkBuilder.antennaUplinkConfigArn(antennaUplinkConfigArn)
      }

      /**
       * @param enabled Whether or not uplink echo is enabled.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled Whether or not uplink echo is enabled.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty,
    ) : CdkObject(cdkObject), UplinkEchoConfigProperty {
      /**
       * Defines the ARN of the uplink config to echo back to a dataflow endpoint.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkechoconfig.html#cfn-groundstation-config-uplinkechoconfig-antennauplinkconfigarn)
       */
      override fun antennaUplinkConfigArn(): String? = unwrap(this).getAntennaUplinkConfigArn()

      /**
       * Whether or not uplink echo is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkechoconfig.html#cfn-groundstation-config-uplinkechoconfig-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): UplinkEchoConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty):
          UplinkEchoConfigProperty = CdkObjectWrappers.wrap(cdkObject) as UplinkEchoConfigProperty

      internal fun unwrap(wrapped: UplinkEchoConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.UplinkEchoConfigProperty
    }
  }

  /**
   * Defines a spectrum.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * SpectrumConfigProperty spectrumConfigProperty = SpectrumConfigProperty.builder()
   * .bandwidth(FrequencyBandwidthProperty.builder()
   * .units("units")
   * .value(123)
   * .build())
   * .centerFrequency(FrequencyProperty.builder()
   * .units("units")
   * .value(123)
   * .build())
   * .polarization("polarization")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html)
   */
  public interface SpectrumConfigProperty {
    /**
     * The bandwidth of the spectrum. AWS Ground Station currently has the following bandwidth
     * limitations:.
     *
     * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
     * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
     * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html#cfn-groundstation-config-spectrumconfig-bandwidth)
     */
    public fun bandwidth(): Any? = unwrap(this).getBandwidth()

    /**
     * The center frequency of the spectrum.
     *
     * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to 2120
     * MHz for uplink.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html#cfn-groundstation-config-spectrumconfig-centerfrequency)
     */
    public fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

    /**
     * The polarization of the spectrum.
     *
     * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` . Capturing both `"RIGHT_HAND"` and
     * `"LEFT_HAND"` polarization requires two separate configs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html#cfn-groundstation-config-spectrumconfig-polarization)
     */
    public fun polarization(): String? = unwrap(this).getPolarization()

    /**
     * A builder for [SpectrumConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
       * following bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      public fun bandwidth(bandwidth: IResolvable)

      /**
       * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
       * following bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      public fun bandwidth(bandwidth: FrequencyBandwidthProperty)

      /**
       * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
       * following bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f86b6a696ee407f4e18ed6b8fa7d088c5cba74464613b1c99c83cb55ecc5e3b4")
      public fun bandwidth(bandwidth: FrequencyBandwidthProperty.Builder.() -> Unit)

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      public fun centerFrequency(centerFrequency: IResolvable)

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      public fun centerFrequency(centerFrequency: FrequencyProperty)

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fe26014ac8993be2915449f92c808ec5143605d29c7a43e98e914df410af126")
      public fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit)

      /**
       * @param polarization The polarization of the spectrum.
       * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` . Capturing both `"RIGHT_HAND"` and
       * `"LEFT_HAND"` polarization requires two separate configs.
       */
      public fun polarization(polarization: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty.Builder =
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty.builder()

      /**
       * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
       * following bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      override fun bandwidth(bandwidth: IResolvable) {
        cdkBuilder.bandwidth(bandwidth.let(IResolvable::unwrap))
      }

      /**
       * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
       * following bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      override fun bandwidth(bandwidth: FrequencyBandwidthProperty) {
        cdkBuilder.bandwidth(bandwidth.let(FrequencyBandwidthProperty::unwrap))
      }

      /**
       * @param bandwidth The bandwidth of the spectrum. AWS Ground Station currently has the
       * following bandwidth limitations:.
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f86b6a696ee407f4e18ed6b8fa7d088c5cba74464613b1c99c83cb55ecc5e3b4")
      override fun bandwidth(bandwidth: FrequencyBandwidthProperty.Builder.() -> Unit): Unit =
          bandwidth(FrequencyBandwidthProperty(bandwidth))

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      override fun centerFrequency(centerFrequency: IResolvable) {
        cdkBuilder.centerFrequency(centerFrequency.let(IResolvable::unwrap))
      }

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      override fun centerFrequency(centerFrequency: FrequencyProperty) {
        cdkBuilder.centerFrequency(centerFrequency.let(FrequencyProperty::unwrap))
      }

      /**
       * @param centerFrequency The center frequency of the spectrum.
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4fe26014ac8993be2915449f92c808ec5143605d29c7a43e98e914df410af126")
      override fun centerFrequency(centerFrequency: FrequencyProperty.Builder.() -> Unit): Unit =
          centerFrequency(FrequencyProperty(centerFrequency))

      /**
       * @param polarization The polarization of the spectrum.
       * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` . Capturing both `"RIGHT_HAND"` and
       * `"LEFT_HAND"` polarization requires two separate configs.
       */
      override fun polarization(polarization: String) {
        cdkBuilder.polarization(polarization)
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty,
    ) : CdkObject(cdkObject), SpectrumConfigProperty {
      /**
       * The bandwidth of the spectrum. AWS Ground Station currently has the following bandwidth
       * limitations:.
       *
       * * For `AntennaDownlinkDemodDecodeconfig` , valid values are between 125 kHz to 650 MHz.
       * * For `AntennaDownlinkconfig` , valid values are between 10 kHz to 54 MHz.
       * * For `AntennaUplinkConfig` , valid values are between 10 kHz to 54 MHz.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html#cfn-groundstation-config-spectrumconfig-bandwidth)
       */
      override fun bandwidth(): Any? = unwrap(this).getBandwidth()

      /**
       * The center frequency of the spectrum.
       *
       * Valid values are between 2200 to 2300 MHz and 7750 to 8400 MHz for downlink and 2025 to
       * 2120 MHz for uplink.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html#cfn-groundstation-config-spectrumconfig-centerfrequency)
       */
      override fun centerFrequency(): Any? = unwrap(this).getCenterFrequency()

      /**
       * The polarization of the spectrum.
       *
       * Valid values are `"RIGHT_HAND"` and `"LEFT_HAND"` . Capturing both `"RIGHT_HAND"` and
       * `"LEFT_HAND"` polarization requires two separate configs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-spectrumconfig.html#cfn-groundstation-config-spectrumconfig-polarization)
       */
      override fun polarization(): String? = unwrap(this).getPolarization()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SpectrumConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty):
          SpectrumConfigProperty = CdkObjectWrappers.wrap(cdkObject) as SpectrumConfigProperty

      internal fun unwrap(wrapped: SpectrumConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.SpectrumConfigProperty
    }
  }

  /**
   * Provides information about how AWS Ground Station should configure an antenna for uplink during
   * a contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.groundstation.*;
   * AntennaUplinkConfigProperty antennaUplinkConfigProperty = AntennaUplinkConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html)
   */
  public interface AntennaUplinkConfigProperty {
    /**
     * Defines the spectrum configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html#cfn-groundstation-config-antennauplinkconfig-spectrumconfig)
     */
    public fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

    /**
     * The equivalent isotropically radiated power (EIRP) to use for uplink transmissions.
     *
     * Valid values are between 20.0 to 50.0 dBW.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html#cfn-groundstation-config-antennauplinkconfig-targeteirp)
     */
    public fun targetEirp(): Any? = unwrap(this).getTargetEirp()

    /**
     * Whether or not uplink transmit is disabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html#cfn-groundstation-config-antennauplinkconfig-transmitdisabled)
     */
    public fun transmitDisabled(): Any? = unwrap(this).getTransmitDisabled()

    /**
     * A builder for [AntennaUplinkConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      public fun spectrumConfig(spectrumConfig: IResolvable)

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      public fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty)

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dea05ab978fd04ba084abfba00bf59ebfbef118fee29ca1b9ff8785385774e84")
      public fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty.Builder.() -> Unit)

      /**
       * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
       * transmissions.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      public fun targetEirp(targetEirp: IResolvable)

      /**
       * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
       * transmissions.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      public fun targetEirp(targetEirp: EirpProperty)

      /**
       * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
       * transmissions.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feefa4f5b0ff7258c3c5a4c739c2e1924d755d513639600e6a72ac97c904e03e")
      public fun targetEirp(targetEirp: EirpProperty.Builder.() -> Unit)

      /**
       * @param transmitDisabled Whether or not uplink transmit is disabled.
       */
      public fun transmitDisabled(transmitDisabled: Boolean)

      /**
       * @param transmitDisabled Whether or not uplink transmit is disabled.
       */
      public fun transmitDisabled(transmitDisabled: IResolvable)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty.Builder
          =
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty.builder()

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      override fun spectrumConfig(spectrumConfig: IResolvable) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(IResolvable::unwrap))
      }

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      override fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty) {
        cdkBuilder.spectrumConfig(spectrumConfig.let(UplinkSpectrumConfigProperty::unwrap))
      }

      /**
       * @param spectrumConfig Defines the spectrum configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("dea05ab978fd04ba084abfba00bf59ebfbef118fee29ca1b9ff8785385774e84")
      override fun spectrumConfig(spectrumConfig: UplinkSpectrumConfigProperty.Builder.() -> Unit):
          Unit = spectrumConfig(UplinkSpectrumConfigProperty(spectrumConfig))

      /**
       * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
       * transmissions.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      override fun targetEirp(targetEirp: IResolvable) {
        cdkBuilder.targetEirp(targetEirp.let(IResolvable::unwrap))
      }

      /**
       * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
       * transmissions.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      override fun targetEirp(targetEirp: EirpProperty) {
        cdkBuilder.targetEirp(targetEirp.let(EirpProperty::unwrap))
      }

      /**
       * @param targetEirp The equivalent isotropically radiated power (EIRP) to use for uplink
       * transmissions.
       * Valid values are between 20.0 to 50.0 dBW.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("feefa4f5b0ff7258c3c5a4c739c2e1924d755d513639600e6a72ac97c904e03e")
      override fun targetEirp(targetEirp: EirpProperty.Builder.() -> Unit): Unit =
          targetEirp(EirpProperty(targetEirp))

      /**
       * @param transmitDisabled Whether or not uplink transmit is disabled.
       */
      override fun transmitDisabled(transmitDisabled: Boolean) {
        cdkBuilder.transmitDisabled(transmitDisabled)
      }

      /**
       * @param transmitDisabled Whether or not uplink transmit is disabled.
       */
      override fun transmitDisabled(transmitDisabled: IResolvable) {
        cdkBuilder.transmitDisabled(transmitDisabled.let(IResolvable::unwrap))
      }

      public fun build():
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty,
    ) : CdkObject(cdkObject), AntennaUplinkConfigProperty {
      /**
       * Defines the spectrum configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html#cfn-groundstation-config-antennauplinkconfig-spectrumconfig)
       */
      override fun spectrumConfig(): Any? = unwrap(this).getSpectrumConfig()

      /**
       * The equivalent isotropically radiated power (EIRP) to use for uplink transmissions.
       *
       * Valid values are between 20.0 to 50.0 dBW.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html#cfn-groundstation-config-antennauplinkconfig-targeteirp)
       */
      override fun targetEirp(): Any? = unwrap(this).getTargetEirp()

      /**
       * Whether or not uplink transmit is disabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-antennauplinkconfig.html#cfn-groundstation-config-antennauplinkconfig-transmitdisabled)
       */
      override fun transmitDisabled(): Any? = unwrap(this).getTransmitDisabled()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): AntennaUplinkConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty):
          AntennaUplinkConfigProperty = CdkObjectWrappers.wrap(cdkObject) as
          AntennaUplinkConfigProperty

      internal fun unwrap(wrapped: AntennaUplinkConfigProperty):
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.groundstation.CfnConfig.AntennaUplinkConfigProperty
    }
  }
}
