@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.groundstation

import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.services.groundstation.CfnConfig
import software.amazon.awscdk.services.groundstation.CfnConfigProps
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroup
import software.amazon.awscdk.services.groundstation.CfnDataflowEndpointGroupProps
import software.amazon.awscdk.services.groundstation.CfnMissionProfile
import software.amazon.awscdk.services.groundstation.CfnMissionProfileProps
import software.constructs.Construct

public object groundstation {
  /**
   * Creates a `Config` with the specified parameters.
   *
   * Config objects provide Ground Station with the details necessary in order to schedule and
   * execute satellite contacts.
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
  public inline fun cfnConfig(
    scope: Construct,
    id: String,
    block: CfnConfigDsl.() -> Unit = {},
  ): CfnConfig {
    val builder = CfnConfigDsl(scope, id)
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.groundstation.*;
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
  public inline
      fun cfnConfigAntennaDownlinkConfigProperty(block: CfnConfigAntennaDownlinkConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.AntennaDownlinkConfigProperty {
    val builder = CfnConfigAntennaDownlinkConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.groundstation.*;
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
  public inline
      fun cfnConfigAntennaDownlinkDemodDecodeConfigProperty(block: CfnConfigAntennaDownlinkDemodDecodeConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.AntennaDownlinkDemodDecodeConfigProperty {
    val builder = CfnConfigAntennaDownlinkDemodDecodeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.groundstation.*;
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
  public inline
      fun cfnConfigAntennaUplinkConfigProperty(block: CfnConfigAntennaUplinkConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.AntennaUplinkConfigProperty {
    val builder = CfnConfigAntennaUplinkConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.groundstation.*;
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
  public inline fun cfnConfigConfigDataProperty(block: CfnConfigConfigDataPropertyDsl.() -> Unit =
      {}): CfnConfig.ConfigDataProperty {
    val builder = CfnConfigConfigDataPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides information to AWS Ground Station about which IP endpoints to use during a contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * DataflowEndpointConfigProperty dataflowEndpointConfigProperty =
   * DataflowEndpointConfigProperty.builder()
   * .dataflowEndpointName("dataflowEndpointName")
   * .dataflowEndpointRegion("dataflowEndpointRegion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-dataflowendpointconfig.html)
   */
  public inline
      fun cfnConfigDataflowEndpointConfigProperty(block: CfnConfigDataflowEndpointConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.DataflowEndpointConfigProperty {
    val builder = CfnConfigDataflowEndpointConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines decoding settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * DecodeConfigProperty decodeConfigProperty = DecodeConfigProperty.builder()
   * .unvalidatedJson("unvalidatedJson")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-decodeconfig.html)
   */
  public inline fun cfnConfigDecodeConfigProperty(block: CfnConfigDecodeConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.DecodeConfigProperty {
    val builder = CfnConfigDecodeConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines demodulation settings.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * DemodulationConfigProperty demodulationConfigProperty = DemodulationConfigProperty.builder()
   * .unvalidatedJson("unvalidatedJson")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-demodulationconfig.html)
   */
  public inline
      fun cfnConfigDemodulationConfigProperty(block: CfnConfigDemodulationConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.DemodulationConfigProperty {
    val builder = CfnConfigDemodulationConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines an equivalent isotropically radiated power (EIRP).
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * EirpProperty eirpProperty = EirpProperty.builder()
   * .units("units")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-eirp.html)
   */
  public inline fun cfnConfigEirpProperty(block: CfnConfigEirpPropertyDsl.() -> Unit = {}):
      CfnConfig.EirpProperty {
    val builder = CfnConfigEirpPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines a bandwidth.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * FrequencyBandwidthProperty frequencyBandwidthProperty = FrequencyBandwidthProperty.builder()
   * .units("units")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequencybandwidth.html)
   */
  public inline
      fun cfnConfigFrequencyBandwidthProperty(block: CfnConfigFrequencyBandwidthPropertyDsl.() -> Unit
      = {}): CfnConfig.FrequencyBandwidthProperty {
    val builder = CfnConfigFrequencyBandwidthPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines a frequency.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * FrequencyProperty frequencyProperty = FrequencyProperty.builder()
   * .units("units")
   * .value(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-frequency.html)
   */
  public inline fun cfnConfigFrequencyProperty(block: CfnConfigFrequencyPropertyDsl.() -> Unit =
      {}): CfnConfig.FrequencyProperty {
    val builder = CfnConfigFrequencyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnConfig`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
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
  public inline fun cfnConfigProps(block: CfnConfigPropsDsl.() -> Unit = {}): CfnConfigProps {
    val builder = CfnConfigPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Provides information about how AWS Ground Station should save downlink data to S3.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * S3RecordingConfigProperty s3RecordingConfigProperty = S3RecordingConfigProperty.builder()
   * .bucketArn("bucketArn")
   * .prefix("prefix")
   * .roleArn("roleArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-s3recordingconfig.html)
   */
  public inline
      fun cfnConfigS3RecordingConfigProperty(block: CfnConfigS3RecordingConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.S3RecordingConfigProperty {
    val builder = CfnConfigS3RecordingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines a spectrum.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
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
  public inline
      fun cfnConfigSpectrumConfigProperty(block: CfnConfigSpectrumConfigPropertyDsl.() -> Unit =
      {}): CfnConfig.SpectrumConfigProperty {
    val builder = CfnConfigSpectrumConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.groundstation.*;
   * TrackingConfigProperty trackingConfigProperty = TrackingConfigProperty.builder()
   * .autotrack("autotrack")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-trackingconfig.html)
   */
  public inline
      fun cfnConfigTrackingConfigProperty(block: CfnConfigTrackingConfigPropertyDsl.() -> Unit =
      {}): CfnConfig.TrackingConfigProperty {
    val builder = CfnConfigTrackingConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
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
   * import software.amazon.awscdk.services.groundstation.*;
   * UplinkEchoConfigProperty uplinkEchoConfigProperty = UplinkEchoConfigProperty.builder()
   * .antennaUplinkConfigArn("antennaUplinkConfigArn")
   * .enabled(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-config-uplinkechoconfig.html)
   */
  public inline
      fun cfnConfigUplinkEchoConfigProperty(block: CfnConfigUplinkEchoConfigPropertyDsl.() -> Unit =
      {}): CfnConfig.UplinkEchoConfigProperty {
    val builder = CfnConfigUplinkEchoConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Defines a uplink spectrum.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
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
  public inline
      fun cfnConfigUplinkSpectrumConfigProperty(block: CfnConfigUplinkSpectrumConfigPropertyDsl.() -> Unit
      = {}): CfnConfig.UplinkSpectrumConfigProperty {
    val builder = CfnConfigUplinkSpectrumConfigPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Creates a Dataflow Endpoint Group request.
   *
   * Dataflow endpoint groups contain a list of endpoints. When the name of a dataflow endpoint
   * group is specified in a mission profile, the Ground Station service will connect to the endpoints
   * and flow data during a contact.
   *
   * For more information about dataflow endpoint groups, see [Dataflow Endpoint
   * Groups](https://docs.aws.amazon.com/ground-station/latest/ug/dataflowendpointgroups.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * CfnDataflowEndpointGroup cfnDataflowEndpointGroup =
   * CfnDataflowEndpointGroup.Builder.create(this, "MyCfnDataflowEndpointGroup")
   * .endpointDetails(List.of(EndpointDetailsProperty.builder()
   * .awsGroundStationAgentEndpoint(AwsGroundStationAgentEndpointProperty.builder()
   * .agentStatus("agentStatus")
   * .auditResults("auditResults")
   * .egressAddress(ConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .build())
   * .ingressAddress(RangedConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build())
   * .build())
   * .name("name")
   * .build())
   * .endpoint(DataflowEndpointProperty.builder()
   * .address(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .mtu(123)
   * .name("name")
   * .build())
   * .securityDetails(SecurityDetailsProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build())
   * .build()))
   * // the properties below are optional
   * .contactPostPassDurationSeconds(123)
   * .contactPrePassDurationSeconds(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html)
   */
  public inline fun cfnDataflowEndpointGroup(
    scope: Construct,
    id: String,
    block: CfnDataflowEndpointGroupDsl.() -> Unit = {},
  ): CfnDataflowEndpointGroup {
    val builder = CfnDataflowEndpointGroupDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * AwsGroundStationAgentEndpointProperty awsGroundStationAgentEndpointProperty =
   * AwsGroundStationAgentEndpointProperty.builder()
   * .agentStatus("agentStatus")
   * .auditResults("auditResults")
   * .egressAddress(ConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .build())
   * .ingressAddress(RangedConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build())
   * .build())
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-awsgroundstationagentendpoint.html)
   */
  public inline
      fun cfnDataflowEndpointGroupAwsGroundStationAgentEndpointProperty(block: CfnDataflowEndpointGroupAwsGroundStationAgentEndpointPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.AwsGroundStationAgentEndpointProperty {
    val builder = CfnDataflowEndpointGroupAwsGroundStationAgentEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * ConnectionDetailsProperty connectionDetailsProperty = ConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-connectiondetails.html)
   */
  public inline
      fun cfnDataflowEndpointGroupConnectionDetailsProperty(block: CfnDataflowEndpointGroupConnectionDetailsPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.ConnectionDetailsProperty {
    val builder = CfnDataflowEndpointGroupConnectionDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Contains information such as socket address and name that defines an endpoint.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * DataflowEndpointProperty dataflowEndpointProperty = DataflowEndpointProperty.builder()
   * .address(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .mtu(123)
   * .name("name")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-dataflowendpoint.html)
   */
  public inline
      fun cfnDataflowEndpointGroupDataflowEndpointProperty(block: CfnDataflowEndpointGroupDataflowEndpointPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.DataflowEndpointProperty {
    val builder = CfnDataflowEndpointGroupDataflowEndpointPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The security details and endpoint information.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * EndpointDetailsProperty endpointDetailsProperty = EndpointDetailsProperty.builder()
   * .awsGroundStationAgentEndpoint(AwsGroundStationAgentEndpointProperty.builder()
   * .agentStatus("agentStatus")
   * .auditResults("auditResults")
   * .egressAddress(ConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .build())
   * .ingressAddress(RangedConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build())
   * .build())
   * .name("name")
   * .build())
   * .endpoint(DataflowEndpointProperty.builder()
   * .address(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .mtu(123)
   * .name("name")
   * .build())
   * .securityDetails(SecurityDetailsProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-endpointdetails.html)
   */
  public inline
      fun cfnDataflowEndpointGroupEndpointDetailsProperty(block: CfnDataflowEndpointGroupEndpointDetailsPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.EndpointDetailsProperty {
    val builder = CfnDataflowEndpointGroupEndpointDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * IntegerRangeProperty integerRangeProperty = IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-integerrange.html)
   */
  public inline
      fun cfnDataflowEndpointGroupIntegerRangeProperty(block: CfnDataflowEndpointGroupIntegerRangePropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.IntegerRangeProperty {
    val builder = CfnDataflowEndpointGroupIntegerRangePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnDataflowEndpointGroup`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * CfnDataflowEndpointGroupProps cfnDataflowEndpointGroupProps =
   * CfnDataflowEndpointGroupProps.builder()
   * .endpointDetails(List.of(EndpointDetailsProperty.builder()
   * .awsGroundStationAgentEndpoint(AwsGroundStationAgentEndpointProperty.builder()
   * .agentStatus("agentStatus")
   * .auditResults("auditResults")
   * .egressAddress(ConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .build())
   * .ingressAddress(RangedConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build())
   * .build())
   * .name("name")
   * .build())
   * .endpoint(DataflowEndpointProperty.builder()
   * .address(SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build())
   * .mtu(123)
   * .name("name")
   * .build())
   * .securityDetails(SecurityDetailsProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build())
   * .build()))
   * // the properties below are optional
   * .contactPostPassDurationSeconds(123)
   * .contactPrePassDurationSeconds(123)
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-dataflowendpointgroup.html)
   */
  public inline fun cfnDataflowEndpointGroupProps(block: CfnDataflowEndpointGroupPropsDsl.() -> Unit
      = {}): CfnDataflowEndpointGroupProps {
    val builder = CfnDataflowEndpointGroupPropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * RangedConnectionDetailsProperty rangedConnectionDetailsProperty =
   * RangedConnectionDetailsProperty.builder()
   * .mtu(123)
   * .socketAddress(RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedconnectiondetails.html)
   */
  public inline
      fun cfnDataflowEndpointGroupRangedConnectionDetailsProperty(block: CfnDataflowEndpointGroupRangedConnectionDetailsPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.RangedConnectionDetailsProperty {
    val builder = CfnDataflowEndpointGroupRangedConnectionDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * RangedSocketAddressProperty rangedSocketAddressProperty = RangedSocketAddressProperty.builder()
   * .name("name")
   * .portRange(IntegerRangeProperty.builder()
   * .maximum(123)
   * .minimum(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-rangedsocketaddress.html)
   */
  public inline
      fun cfnDataflowEndpointGroupRangedSocketAddressProperty(block: CfnDataflowEndpointGroupRangedSocketAddressPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.RangedSocketAddressProperty {
    val builder = CfnDataflowEndpointGroupRangedSocketAddressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Information about IAM roles, subnets, and security groups needed for this
   * DataflowEndpointGroup.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * SecurityDetailsProperty securityDetailsProperty = SecurityDetailsProperty.builder()
   * .roleArn("roleArn")
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-securitydetails.html)
   */
  public inline
      fun cfnDataflowEndpointGroupSecurityDetailsProperty(block: CfnDataflowEndpointGroupSecurityDetailsPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.SecurityDetailsProperty {
    val builder = CfnDataflowEndpointGroupSecurityDetailsPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * The address of the endpoint, such as `192.168.1.1` .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * SocketAddressProperty socketAddressProperty = SocketAddressProperty.builder()
   * .name("name")
   * .port(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-dataflowendpointgroup-socketaddress.html)
   */
  public inline
      fun cfnDataflowEndpointGroupSocketAddressProperty(block: CfnDataflowEndpointGroupSocketAddressPropertyDsl.() -> Unit
      = {}): CfnDataflowEndpointGroup.SocketAddressProperty {
    val builder = CfnDataflowEndpointGroupSocketAddressPropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Mission profiles specify parameters and provide references to config objects to define how
   * Ground Station lists and executes contacts.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * CfnMissionProfile cfnMissionProfile = CfnMissionProfile.Builder.create(this,
   * "MyCfnMissionProfile")
   * .dataflowEdges(List.of(DataflowEdgeProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build()))
   * .minimumViableContactDurationSeconds(123)
   * .name("name")
   * .trackingConfigArn("trackingConfigArn")
   * // the properties below are optional
   * .contactPostPassDurationSeconds(123)
   * .contactPrePassDurationSeconds(123)
   * .streamsKmsKey(StreamsKmsKeyProperty.builder()
   * .kmsAliasArn("kmsAliasArn")
   * .kmsKeyArn("kmsKeyArn")
   * .build())
   * .streamsKmsRole("streamsKmsRole")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html)
   */
  public inline fun cfnMissionProfile(
    scope: Construct,
    id: String,
    block: CfnMissionProfileDsl.() -> Unit = {},
  ): CfnMissionProfile {
    val builder = CfnMissionProfileDsl(scope, id)
    builder.apply(block)
    return builder.build()
  }

  /**
   * A dataflow edge defines from where and to where data will flow during a contact.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * DataflowEdgeProperty dataflowEdgeProperty = DataflowEdgeProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-dataflowedge.html)
   */
  public inline
      fun cfnMissionProfileDataflowEdgeProperty(block: CfnMissionProfileDataflowEdgePropertyDsl.() -> Unit
      = {}): CfnMissionProfile.DataflowEdgeProperty {
    val builder = CfnMissionProfileDataflowEdgePropertyDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Properties for defining a `CfnMissionProfile`.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * CfnMissionProfileProps cfnMissionProfileProps = CfnMissionProfileProps.builder()
   * .dataflowEdges(List.of(DataflowEdgeProperty.builder()
   * .destination("destination")
   * .source("source")
   * .build()))
   * .minimumViableContactDurationSeconds(123)
   * .name("name")
   * .trackingConfigArn("trackingConfigArn")
   * // the properties below are optional
   * .contactPostPassDurationSeconds(123)
   * .contactPrePassDurationSeconds(123)
   * .streamsKmsKey(StreamsKmsKeyProperty.builder()
   * .kmsAliasArn("kmsAliasArn")
   * .kmsKeyArn("kmsKeyArn")
   * .build())
   * .streamsKmsRole("streamsKmsRole")
   * .tags(List.of(CfnTag.builder()
   * .key("key")
   * .value("value")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-groundstation-missionprofile.html)
   */
  public inline fun cfnMissionProfileProps(block: CfnMissionProfilePropsDsl.() -> Unit = {}):
      CfnMissionProfileProps {
    val builder = CfnMissionProfilePropsDsl()
    builder.apply(block)
    return builder.build()
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import software.amazon.awscdk.services.groundstation.*;
   * StreamsKmsKeyProperty streamsKmsKeyProperty = StreamsKmsKeyProperty.builder()
   * .kmsAliasArn("kmsAliasArn")
   * .kmsKeyArn("kmsKeyArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-groundstation-missionprofile-streamskmskey.html)
   */
  public inline
      fun cfnMissionProfileStreamsKmsKeyProperty(block: CfnMissionProfileStreamsKmsKeyPropertyDsl.() -> Unit
      = {}): CfnMissionProfile.StreamsKmsKeyProperty {
    val builder = CfnMissionProfileStreamsKmsKeyPropertyDsl()
    builder.apply(block)
    return builder.build()
  }
}
