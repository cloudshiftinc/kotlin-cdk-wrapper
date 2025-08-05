@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.medialive

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The AWS::MediaLive::Input resource is a MediaLive resource type that creates an input.
 *
 * A MediaLive input holds information that describes how the MediaLive channel is connected to the
 * upstream system that is providing the source content that is to be transcoded.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.medialive.*;
 * Object tags;
 * CfnInput cfnInput = CfnInput.Builder.create(this, "MyCfnInput")
 * .destinations(List.of(InputDestinationRequestProperty.builder()
 * .network("network")
 * .networkRoutes(List.of(InputRequestDestinationRouteProperty.builder()
 * .cidr("cidr")
 * .gateway("gateway")
 * .build()))
 * .staticIpAddress("staticIpAddress")
 * .streamName("streamName")
 * .build()))
 * .inputDevices(List.of(InputDeviceSettingsProperty.builder()
 * .id("id")
 * .build()))
 * .inputNetworkLocation("inputNetworkLocation")
 * .inputSecurityGroups(List.of("inputSecurityGroups"))
 * .mediaConnectFlows(List.of(MediaConnectFlowRequestProperty.builder()
 * .flowArn("flowArn")
 * .build()))
 * .multicastSettings(MulticastSettingsCreateRequestProperty.builder()
 * .sources(List.of(MulticastSourceCreateRequestProperty.builder()
 * .sourceIp("sourceIp")
 * .url("url")
 * .build()))
 * .build())
 * .name("name")
 * .roleArn("roleArn")
 * .sdiSources(List.of("sdiSources"))
 * .smpte2110ReceiverGroupSettings(Smpte2110ReceiverGroupSettingsProperty.builder()
 * .smpte2110ReceiverGroups(List.of(Smpte2110ReceiverGroupProperty.builder()
 * .sdpSettings(Smpte2110ReceiverGroupSdpSettingsProperty.builder()
 * .ancillarySdps(List.of(InputSdpLocationProperty.builder()
 * .mediaIndex(123)
 * .sdpUrl("sdpUrl")
 * .build()))
 * .audioSdps(List.of(InputSdpLocationProperty.builder()
 * .mediaIndex(123)
 * .sdpUrl("sdpUrl")
 * .build()))
 * .videoSdp(InputSdpLocationProperty.builder()
 * .mediaIndex(123)
 * .sdpUrl("sdpUrl")
 * .build())
 * .build())
 * .build()))
 * .build())
 * .sources(List.of(InputSourceRequestProperty.builder()
 * .passwordParam("passwordParam")
 * .url("url")
 * .username("username")
 * .build()))
 * .srtSettings(SrtSettingsRequestProperty.builder()
 * .srtCallerSources(List.of(SrtCallerSourceRequestProperty.builder()
 * .decryption(SrtCallerDecryptionRequestProperty.builder()
 * .algorithm("algorithm")
 * .passphraseSecretArn("passphraseSecretArn")
 * .build())
 * .minimumLatency(123)
 * .srtListenerAddress("srtListenerAddress")
 * .srtListenerPort("srtListenerPort")
 * .streamId("streamId")
 * .build()))
 * .build())
 * .tags(tags)
 * .type("type")
 * .vpc(InputVpcRequestProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnetIds(List.of("subnetIds"))
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html)
 */
public open class CfnInput(
  cdkObject: software.amazon.awscdk.services.medialive.CfnInput,
) : CfnResource(cdkObject),
    IInspectable,
    ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.medialive.CfnInput(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInputProps,
  ) :
      this(software.amazon.awscdk.services.medialive.CfnInput(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnInputProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnInputProps.Builder.() -> Unit,
  ) : this(scope, id, CfnInputProps(props)
  )

  /**
   * The ARN of the MediaLive input.
   *
   * For example: arn:aws:medialive:us-west-1:111122223333:medialive:input:1234567. MediaLive
   * creates this ARN when it creates the input.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * For a push input, the the destination or destinations for the input.
   *
   * The destinations are the URLs of locations on MediaLive where the upstream system pushes the
   * content to, for this input. MediaLive creates these addresses when it creates the input.
   */
  public open fun attrDestinations(): List<String> = unwrap(this).getAttrDestinations()

  /**
   * The unique ID for the device.
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * For a pull input, the source or sources for the input.
   *
   * The sources are the URLs of locations on the upstream system where MediaLive pulls the content
   * from, for this input. You included these URLs in the create request.
   */
  public open fun attrSources(): List<String> = unwrap(this).getAttrSources()

  /**
   * Settings that apply only if the input is a push type of input.
   */
  public open fun destinations(): Any? = unwrap(this).getDestinations()

  /**
   * Settings that apply only if the input is a push type of input.
   */
  public open fun destinations(`value`: IResolvable) {
    unwrap(this).setDestinations(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings that apply only if the input is a push type of input.
   */
  public open fun destinations(`value`: List<Any>) {
    unwrap(this).setDestinations(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Settings that apply only if the input is a push type of input.
   */
  public open fun destinations(vararg `value`: Any): Unit = destinations(`value`.toList())

  /**
   * Settings that apply only if the input is an Elemental Link input.
   */
  public open fun inputDevices(): Any? = unwrap(this).getInputDevices()

  /**
   * Settings that apply only if the input is an Elemental Link input.
   */
  public open fun inputDevices(`value`: IResolvable) {
    unwrap(this).setInputDevices(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings that apply only if the input is an Elemental Link input.
   */
  public open fun inputDevices(`value`: List<Any>) {
    unwrap(this).setInputDevices(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Settings that apply only if the input is an Elemental Link input.
   */
  public open fun inputDevices(vararg `value`: Any): Unit = inputDevices(`value`.toList())

  /**
   *
   */
  public open fun inputNetworkLocation(): String? = unwrap(this).getInputNetworkLocation()

  /**
   *
   */
  public open fun inputNetworkLocation(`value`: String) {
    unwrap(this).setInputNetworkLocation(`value`)
  }

  /**
   * The list of input security groups (referenced by IDs) to attach to the input if the input is a
   * push type.
   */
  public open fun inputSecurityGroups(): List<String> = unwrap(this).getInputSecurityGroups() ?:
      emptyList()

  /**
   * The list of input security groups (referenced by IDs) to attach to the input if the input is a
   * push type.
   */
  public open fun inputSecurityGroups(`value`: List<String>) {
    unwrap(this).setInputSecurityGroups(`value`)
  }

  /**
   * The list of input security groups (referenced by IDs) to attach to the input if the input is a
   * push type.
   */
  public open fun inputSecurityGroups(vararg `value`: String): Unit =
      inputSecurityGroups(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * Settings that apply only if the input is a MediaConnect input.
   */
  public open fun mediaConnectFlows(): Any? = unwrap(this).getMediaConnectFlows()

  /**
   * Settings that apply only if the input is a MediaConnect input.
   */
  public open fun mediaConnectFlows(`value`: IResolvable) {
    unwrap(this).setMediaConnectFlows(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings that apply only if the input is a MediaConnect input.
   */
  public open fun mediaConnectFlows(`value`: List<Any>) {
    unwrap(this).setMediaConnectFlows(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Settings that apply only if the input is a MediaConnect input.
   */
  public open fun mediaConnectFlows(vararg `value`: Any): Unit = mediaConnectFlows(`value`.toList())

  /**
   *
   */
  public open fun multicastSettings(): Any? = unwrap(this).getMulticastSettings()

  /**
   *
   */
  public open fun multicastSettings(`value`: IResolvable) {
    unwrap(this).setMulticastSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun multicastSettings(`value`: MulticastSettingsCreateRequestProperty) {
    unwrap(this).setMulticastSettings(`value`.let(MulticastSettingsCreateRequestProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("dfea0fc3b1f7c2811ae288163a3285fed32a8a6765b51be4cc5b9e91f1cba389")
  public open
      fun multicastSettings(`value`: MulticastSettingsCreateRequestProperty.Builder.() -> Unit):
      Unit = multicastSettings(MulticastSettingsCreateRequestProperty(`value`))

  /**
   * A name for the input.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A name for the input.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The IAM role for MediaLive to assume when creating a MediaConnect input or Amazon VPC input.
   */
  public open fun roleArn(): String? = unwrap(this).getRoleArn()

  /**
   * The IAM role for MediaLive to assume when creating a MediaConnect input or Amazon VPC input.
   */
  public open fun roleArn(`value`: String) {
    unwrap(this).setRoleArn(`value`)
  }

  /**
   *
   */
  public open fun sdiSources(): List<String> = unwrap(this).getSdiSources() ?: emptyList()

  /**
   *
   */
  public open fun sdiSources(`value`: List<String>) {
    unwrap(this).setSdiSources(`value`)
  }

  /**
   *
   */
  public open fun sdiSources(vararg `value`: String): Unit = sdiSources(`value`.toList())

  /**
   *
   */
  public open fun smpte2110ReceiverGroupSettings(): Any? =
      unwrap(this).getSmpte2110ReceiverGroupSettings()

  /**
   *
   */
  public open fun smpte2110ReceiverGroupSettings(`value`: IResolvable) {
    unwrap(this).setSmpte2110ReceiverGroupSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun smpte2110ReceiverGroupSettings(`value`: Smpte2110ReceiverGroupSettingsProperty) {
    unwrap(this).setSmpte2110ReceiverGroupSettings(`value`.let(Smpte2110ReceiverGroupSettingsProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("c83f11bec0968371cc22eb9ef32c8d7117725af54a9f98283e3e3e0c2ae98d9e")
  public open
      fun smpte2110ReceiverGroupSettings(`value`: Smpte2110ReceiverGroupSettingsProperty.Builder.() -> Unit):
      Unit = smpte2110ReceiverGroupSettings(Smpte2110ReceiverGroupSettingsProperty(`value`))

  /**
   * Settings that apply only if the input is a pull type of input.
   */
  public open fun sources(): Any? = unwrap(this).getSources()

  /**
   * Settings that apply only if the input is a pull type of input.
   */
  public open fun sources(`value`: IResolvable) {
    unwrap(this).setSources(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings that apply only if the input is a pull type of input.
   */
  public open fun sources(`value`: List<Any>) {
    unwrap(this).setSources(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * Settings that apply only if the input is a pull type of input.
   */
  public open fun sources(vararg `value`: Any): Unit = sources(`value`.toList())

  /**
   *
   */
  public open fun srtSettings(): Any? = unwrap(this).getSrtSettings()

  /**
   *
   */
  public open fun srtSettings(`value`: IResolvable) {
    unwrap(this).setSrtSettings(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   *
   */
  public open fun srtSettings(`value`: SrtSettingsRequestProperty) {
    unwrap(this).setSrtSettings(`value`.let(SrtSettingsRequestProperty.Companion::unwrap))
  }

  /**
   *
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b7fc1f30acc123313da482969b54fbf5f0e18b7fa39c2667672b834b1f35ba88")
  public open fun srtSettings(`value`: SrtSettingsRequestProperty.Builder.() -> Unit): Unit =
      srtSettings(SrtSettingsRequestProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * A collection of tags for this input.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * A collection of tags for this input.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The type for this input.
   */
  public open fun type(): String? = unwrap(this).getType()

  /**
   * The type for this input.
   */
  public open fun type(`value`: String) {
    unwrap(this).setType(`value`)
  }

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   */
  public open fun vpc(): Any? = unwrap(this).getVpc()

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   */
  public open fun vpc(`value`: IResolvable) {
    unwrap(this).setVpc(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   */
  public open fun vpc(`value`: InputVpcRequestProperty) {
    unwrap(this).setVpc(`value`.let(InputVpcRequestProperty.Companion::unwrap))
  }

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("28a20a9aad3c4ef43702cfe4232243c32ff28216751bc2331074a70727d0c8f5")
  public open fun vpc(`value`: InputVpcRequestProperty.Builder.() -> Unit): Unit =
      vpc(InputVpcRequestProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.medialive.CfnInput].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Settings that apply only if the input is a push type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
     * @param destinations Settings that apply only if the input is a push type of input. 
     */
    public fun destinations(destinations: IResolvable)

    /**
     * Settings that apply only if the input is a push type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
     * @param destinations Settings that apply only if the input is a push type of input. 
     */
    public fun destinations(destinations: List<Any>)

    /**
     * Settings that apply only if the input is a push type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
     * @param destinations Settings that apply only if the input is a push type of input. 
     */
    public fun destinations(vararg destinations: Any)

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
     * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
     */
    public fun inputDevices(inputDevices: IResolvable)

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
     * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
     */
    public fun inputDevices(inputDevices: List<Any>)

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
     * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
     */
    public fun inputDevices(vararg inputDevices: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputnetworklocation)
     * @param inputNetworkLocation 
     */
    public fun inputNetworkLocation(inputNetworkLocation: String)

    /**
     * The list of input security groups (referenced by IDs) to attach to the input if the input is
     * a push type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type. 
     */
    public fun inputSecurityGroups(inputSecurityGroups: List<String>)

    /**
     * The list of input security groups (referenced by IDs) to attach to the input if the input is
     * a push type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type. 
     */
    public fun inputSecurityGroups(vararg inputSecurityGroups: String)

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
     */
    public fun mediaConnectFlows(mediaConnectFlows: IResolvable)

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
     */
    public fun mediaConnectFlows(mediaConnectFlows: List<Any>)

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
     */
    public fun mediaConnectFlows(vararg mediaConnectFlows: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-multicastsettings)
     * @param multicastSettings 
     */
    public fun multicastSettings(multicastSettings: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-multicastsettings)
     * @param multicastSettings 
     */
    public fun multicastSettings(multicastSettings: MulticastSettingsCreateRequestProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-multicastsettings)
     * @param multicastSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5501623020c276f7455f5ee9a4d1d406d185c0cafa2c3a0c4f6aca7eb97acdb5")
    public
        fun multicastSettings(multicastSettings: MulticastSettingsCreateRequestProperty.Builder.() -> Unit)

    /**
     * A name for the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-name)
     * @param name A name for the input. 
     */
    public fun name(name: String)

    /**
     * The IAM role for MediaLive to assume when creating a MediaConnect input or Amazon VPC input.
     *
     * This doesn't apply to other types of inputs. The role is identified by its ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-rolearn)
     * @param roleArn The IAM role for MediaLive to assume when creating a MediaConnect input or
     * Amazon VPC input. 
     */
    public fun roleArn(roleArn: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sdisources)
     * @param sdiSources 
     */
    public fun sdiSources(sdiSources: List<String>)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sdisources)
     * @param sdiSources 
     */
    public fun sdiSources(vararg sdiSources: String)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-smpte2110receivergroupsettings)
     * @param smpte2110ReceiverGroupSettings 
     */
    public fun smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-smpte2110receivergroupsettings)
     * @param smpte2110ReceiverGroupSettings 
     */
    public
        fun smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings: Smpte2110ReceiverGroupSettingsProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-smpte2110receivergroupsettings)
     * @param smpte2110ReceiverGroupSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a18122e233278301dae7b23ae45e93e65531b653838a4edc6ee8256773b63314")
    public
        fun smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings: Smpte2110ReceiverGroupSettingsProperty.Builder.() -> Unit)

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
     * @param sources Settings that apply only if the input is a pull type of input. 
     */
    public fun sources(sources: IResolvable)

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
     * @param sources Settings that apply only if the input is a pull type of input. 
     */
    public fun sources(sources: List<Any>)

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
     * @param sources Settings that apply only if the input is a pull type of input. 
     */
    public fun sources(vararg sources: Any)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-srtsettings)
     * @param srtSettings 
     */
    public fun srtSettings(srtSettings: IResolvable)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-srtsettings)
     * @param srtSettings 
     */
    public fun srtSettings(srtSettings: SrtSettingsRequestProperty)

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-srtsettings)
     * @param srtSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4baefce32faa000b9c63b87059872a585c4276a7e58211f2243705abab1e56f")
    public fun srtSettings(srtSettings: SrtSettingsRequestProperty.Builder.() -> Unit)

    /**
     * A collection of tags for this input.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-tags)
     * @param tags A collection of tags for this input. 
     */
    public fun tags(tags: Any)

    /**
     * The type for this input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-type)
     * @param type The type for this input. 
     */
    public fun type(type: String)

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC. 
     */
    public fun vpc(vpc: IResolvable)

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC. 
     */
    public fun vpc(vpc: InputVpcRequestProperty)

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03d253b7a9d0d961b54013dff17b8657adbf7a55284ff688e0186c8c9f1a9123")
    public fun vpc(vpc: InputVpcRequestProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.medialive.CfnInput.Builder =
        software.amazon.awscdk.services.medialive.CfnInput.Builder.create(scope, id)

    /**
     * Settings that apply only if the input is a push type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
     * @param destinations Settings that apply only if the input is a push type of input. 
     */
    override fun destinations(destinations: IResolvable) {
      cdkBuilder.destinations(destinations.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings that apply only if the input is a push type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
     * @param destinations Settings that apply only if the input is a push type of input. 
     */
    override fun destinations(destinations: List<Any>) {
      cdkBuilder.destinations(destinations.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Settings that apply only if the input is a push type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-destinations)
     * @param destinations Settings that apply only if the input is a push type of input. 
     */
    override fun destinations(vararg destinations: Any): Unit = destinations(destinations.toList())

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
     * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
     */
    override fun inputDevices(inputDevices: IResolvable) {
      cdkBuilder.inputDevices(inputDevices.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
     * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
     */
    override fun inputDevices(inputDevices: List<Any>) {
      cdkBuilder.inputDevices(inputDevices.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Settings that apply only if the input is an Elemental Link input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputdevices)
     * @param inputDevices Settings that apply only if the input is an Elemental Link input. 
     */
    override fun inputDevices(vararg inputDevices: Any): Unit = inputDevices(inputDevices.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputnetworklocation)
     * @param inputNetworkLocation 
     */
    override fun inputNetworkLocation(inputNetworkLocation: String) {
      cdkBuilder.inputNetworkLocation(inputNetworkLocation)
    }

    /**
     * The list of input security groups (referenced by IDs) to attach to the input if the input is
     * a push type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type. 
     */
    override fun inputSecurityGroups(inputSecurityGroups: List<String>) {
      cdkBuilder.inputSecurityGroups(inputSecurityGroups)
    }

    /**
     * The list of input security groups (referenced by IDs) to attach to the input if the input is
     * a push type.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-inputsecuritygroups)
     * @param inputSecurityGroups The list of input security groups (referenced by IDs) to attach to
     * the input if the input is a push type. 
     */
    override fun inputSecurityGroups(vararg inputSecurityGroups: String): Unit =
        inputSecurityGroups(inputSecurityGroups.toList())

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
     */
    override fun mediaConnectFlows(mediaConnectFlows: IResolvable) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
     */
    override fun mediaConnectFlows(mediaConnectFlows: List<Any>) {
      cdkBuilder.mediaConnectFlows(mediaConnectFlows.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Settings that apply only if the input is a MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-mediaconnectflows)
     * @param mediaConnectFlows Settings that apply only if the input is a MediaConnect input. 
     */
    override fun mediaConnectFlows(vararg mediaConnectFlows: Any): Unit =
        mediaConnectFlows(mediaConnectFlows.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-multicastsettings)
     * @param multicastSettings 
     */
    override fun multicastSettings(multicastSettings: IResolvable) {
      cdkBuilder.multicastSettings(multicastSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-multicastsettings)
     * @param multicastSettings 
     */
    override fun multicastSettings(multicastSettings: MulticastSettingsCreateRequestProperty) {
      cdkBuilder.multicastSettings(multicastSettings.let(MulticastSettingsCreateRequestProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-multicastsettings)
     * @param multicastSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("5501623020c276f7455f5ee9a4d1d406d185c0cafa2c3a0c4f6aca7eb97acdb5")
    override
        fun multicastSettings(multicastSettings: MulticastSettingsCreateRequestProperty.Builder.() -> Unit):
        Unit = multicastSettings(MulticastSettingsCreateRequestProperty(multicastSettings))

    /**
     * A name for the input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-name)
     * @param name A name for the input. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The IAM role for MediaLive to assume when creating a MediaConnect input or Amazon VPC input.
     *
     * This doesn't apply to other types of inputs. The role is identified by its ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-rolearn)
     * @param roleArn The IAM role for MediaLive to assume when creating a MediaConnect input or
     * Amazon VPC input. 
     */
    override fun roleArn(roleArn: String) {
      cdkBuilder.roleArn(roleArn)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sdisources)
     * @param sdiSources 
     */
    override fun sdiSources(sdiSources: List<String>) {
      cdkBuilder.sdiSources(sdiSources)
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sdisources)
     * @param sdiSources 
     */
    override fun sdiSources(vararg sdiSources: String): Unit = sdiSources(sdiSources.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-smpte2110receivergroupsettings)
     * @param smpte2110ReceiverGroupSettings 
     */
    override fun smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings: IResolvable) {
      cdkBuilder.smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-smpte2110receivergroupsettings)
     * @param smpte2110ReceiverGroupSettings 
     */
    override
        fun smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings: Smpte2110ReceiverGroupSettingsProperty) {
      cdkBuilder.smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings.let(Smpte2110ReceiverGroupSettingsProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-smpte2110receivergroupsettings)
     * @param smpte2110ReceiverGroupSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("a18122e233278301dae7b23ae45e93e65531b653838a4edc6ee8256773b63314")
    override
        fun smpte2110ReceiverGroupSettings(smpte2110ReceiverGroupSettings: Smpte2110ReceiverGroupSettingsProperty.Builder.() -> Unit):
        Unit =
        smpte2110ReceiverGroupSettings(Smpte2110ReceiverGroupSettingsProperty(smpte2110ReceiverGroupSettings))

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
     * @param sources Settings that apply only if the input is a pull type of input. 
     */
    override fun sources(sources: IResolvable) {
      cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
     * @param sources Settings that apply only if the input is a pull type of input. 
     */
    override fun sources(sources: List<Any>) {
      cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * Settings that apply only if the input is a pull type of input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-sources)
     * @param sources Settings that apply only if the input is a pull type of input. 
     */
    override fun sources(vararg sources: Any): Unit = sources(sources.toList())

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-srtsettings)
     * @param srtSettings 
     */
    override fun srtSettings(srtSettings: IResolvable) {
      cdkBuilder.srtSettings(srtSettings.let(IResolvable.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-srtsettings)
     * @param srtSettings 
     */
    override fun srtSettings(srtSettings: SrtSettingsRequestProperty) {
      cdkBuilder.srtSettings(srtSettings.let(SrtSettingsRequestProperty.Companion::unwrap))
    }

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-srtsettings)
     * @param srtSettings 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d4baefce32faa000b9c63b87059872a585c4276a7e58211f2243705abab1e56f")
    override fun srtSettings(srtSettings: SrtSettingsRequestProperty.Builder.() -> Unit): Unit =
        srtSettings(SrtSettingsRequestProperty(srtSettings))

    /**
     * A collection of tags for this input.
     *
     * Each tag is a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-tags)
     * @param tags A collection of tags for this input. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    /**
     * The type for this input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-type)
     * @param type The type for this input. 
     */
    override fun type(type: String) {
      cdkBuilder.type(type)
    }

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC. 
     */
    override fun vpc(vpc: IResolvable) {
      cdkBuilder.vpc(vpc.let(IResolvable.Companion::unwrap))
    }

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC. 
     */
    override fun vpc(vpc: InputVpcRequestProperty) {
      cdkBuilder.vpc(vpc.let(InputVpcRequestProperty.Companion::unwrap))
    }

    /**
     * Settings that apply only if the input is an push input where the source is on Amazon VPC.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-medialive-input.html#cfn-medialive-input-vpc)
     * @param vpc Settings that apply only if the input is an push input where the source is on
     * Amazon VPC. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("03d253b7a9d0d961b54013dff17b8657adbf7a55284ff688e0186c8c9f1a9123")
    override fun vpc(vpc: InputVpcRequestProperty.Builder.() -> Unit): Unit =
        vpc(InputVpcRequestProperty(vpc))

    public fun build(): software.amazon.awscdk.services.medialive.CfnInput = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.medialive.CfnInput.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInput {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInput(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput): CfnInput =
        CfnInput(cdkObject)

    internal fun unwrap(wrapped: CfnInput): software.amazon.awscdk.services.medialive.CfnInput =
        wrapped.cdkObject as software.amazon.awscdk.services.medialive.CfnInput
  }

  /**
   * Settings that apply only if the input is a push type of input.
   *
   * The parent of this entity is Input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputDestinationRequestProperty inputDestinationRequestProperty =
   * InputDestinationRequestProperty.builder()
   * .network("network")
   * .networkRoutes(List.of(InputRequestDestinationRouteProperty.builder()
   * .cidr("cidr")
   * .gateway("gateway")
   * .build()))
   * .staticIpAddress("staticIpAddress")
   * .streamName("streamName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html)
   */
  public interface InputDestinationRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-network)
     */
    public fun network(): String? = unwrap(this).getNetwork()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-networkroutes)
     */
    public fun networkRoutes(): Any? = unwrap(this).getNetworkRoutes()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-staticipaddress)
     */
    public fun staticIpAddress(): String? = unwrap(this).getStaticIpAddress()

    /**
     * The stream name (application name/application instance) for the location the RTMP source
     * content will be pushed to in MediaLive.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-streamname)
     */
    public fun streamName(): String? = unwrap(this).getStreamName()

    /**
     * A builder for [InputDestinationRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param network the value to be set.
       */
      public fun network(network: String)

      /**
       * @param networkRoutes the value to be set.
       */
      public fun networkRoutes(networkRoutes: IResolvable)

      /**
       * @param networkRoutes the value to be set.
       */
      public fun networkRoutes(networkRoutes: List<Any>)

      /**
       * @param networkRoutes the value to be set.
       */
      public fun networkRoutes(vararg networkRoutes: Any)

      /**
       * @param staticIpAddress the value to be set.
       */
      public fun staticIpAddress(staticIpAddress: String)

      /**
       * @param streamName The stream name (application name/application instance) for the location
       * the RTMP source content will be pushed to in MediaLive.
       */
      public fun streamName(streamName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty.builder()

      /**
       * @param network the value to be set.
       */
      override fun network(network: String) {
        cdkBuilder.network(network)
      }

      /**
       * @param networkRoutes the value to be set.
       */
      override fun networkRoutes(networkRoutes: IResolvable) {
        cdkBuilder.networkRoutes(networkRoutes.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param networkRoutes the value to be set.
       */
      override fun networkRoutes(networkRoutes: List<Any>) {
        cdkBuilder.networkRoutes(networkRoutes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param networkRoutes the value to be set.
       */
      override fun networkRoutes(vararg networkRoutes: Any): Unit =
          networkRoutes(networkRoutes.toList())

      /**
       * @param staticIpAddress the value to be set.
       */
      override fun staticIpAddress(staticIpAddress: String) {
        cdkBuilder.staticIpAddress(staticIpAddress)
      }

      /**
       * @param streamName The stream name (application name/application instance) for the location
       * the RTMP source content will be pushed to in MediaLive.
       */
      override fun streamName(streamName: String) {
        cdkBuilder.streamName(streamName)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty,
    ) : CdkObject(cdkObject),
        InputDestinationRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-network)
       */
      override fun network(): String? = unwrap(this).getNetwork()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-networkroutes)
       */
      override fun networkRoutes(): Any? = unwrap(this).getNetworkRoutes()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-staticipaddress)
       */
      override fun staticIpAddress(): String? = unwrap(this).getStaticIpAddress()

      /**
       * The stream name (application name/application instance) for the location the RTMP source
       * content will be pushed to in MediaLive.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdestinationrequest.html#cfn-medialive-input-inputdestinationrequest-streamname)
       */
      override fun streamName(): String? = unwrap(this).getStreamName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputDestinationRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty):
          InputDestinationRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputDestinationRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputDestinationRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.InputDestinationRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputDeviceRequestProperty inputDeviceRequestProperty = InputDeviceRequestProperty.builder()
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicerequest.html)
   */
  public interface InputDeviceRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicerequest.html#cfn-medialive-input-inputdevicerequest-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A builder for [InputDeviceRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id the value to be set.
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty.builder()

      /**
       * @param id the value to be set.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty,
    ) : CdkObject(cdkObject),
        InputDeviceRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicerequest.html#cfn-medialive-input-inputdevicerequest-id)
       */
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputDeviceRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty):
          InputDeviceRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputDeviceRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputDeviceRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceRequestProperty
    }
  }

  /**
   * Settings that apply only if the input is an Elemental Link input.
   *
   * The parent of this entity is Input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputDeviceSettingsProperty inputDeviceSettingsProperty = InputDeviceSettingsProperty.builder()
   * .id("id")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicesettings.html)
   */
  public interface InputDeviceSettingsProperty {
    /**
     * The unique ID for the device.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicesettings.html#cfn-medialive-input-inputdevicesettings-id)
     */
    public fun id(): String? = unwrap(this).getId()

    /**
     * A builder for [InputDeviceSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id The unique ID for the device.
       */
      public fun id(id: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty.builder()

      /**
       * @param id The unique ID for the device.
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty,
    ) : CdkObject(cdkObject),
        InputDeviceSettingsProperty {
      /**
       * The unique ID for the device.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputdevicesettings.html#cfn-medialive-input-inputdevicesettings-id)
       */
      override fun id(): String? = unwrap(this).getId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputDeviceSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty):
          InputDeviceSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputDeviceSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputDeviceSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.InputDeviceSettingsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputRequestDestinationRouteProperty inputRequestDestinationRouteProperty =
   * InputRequestDestinationRouteProperty.builder()
   * .cidr("cidr")
   * .gateway("gateway")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputrequestdestinationroute.html)
   */
  public interface InputRequestDestinationRouteProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputrequestdestinationroute.html#cfn-medialive-input-inputrequestdestinationroute-cidr)
     */
    public fun cidr(): String? = unwrap(this).getCidr()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputrequestdestinationroute.html#cfn-medialive-input-inputrequestdestinationroute-gateway)
     */
    public fun gateway(): String? = unwrap(this).getGateway()

    /**
     * A builder for [InputRequestDestinationRouteProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cidr the value to be set.
       */
      public fun cidr(cidr: String)

      /**
       * @param gateway the value to be set.
       */
      public fun gateway(gateway: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputRequestDestinationRouteProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.InputRequestDestinationRouteProperty.builder()

      /**
       * @param cidr the value to be set.
       */
      override fun cidr(cidr: String) {
        cdkBuilder.cidr(cidr)
      }

      /**
       * @param gateway the value to be set.
       */
      override fun gateway(gateway: String) {
        cdkBuilder.gateway(gateway)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputRequestDestinationRouteProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputRequestDestinationRouteProperty,
    ) : CdkObject(cdkObject),
        InputRequestDestinationRouteProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputrequestdestinationroute.html#cfn-medialive-input-inputrequestdestinationroute-cidr)
       */
      override fun cidr(): String? = unwrap(this).getCidr()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputrequestdestinationroute.html#cfn-medialive-input-inputrequestdestinationroute-gateway)
       */
      override fun gateway(): String? = unwrap(this).getGateway()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          InputRequestDestinationRouteProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputRequestDestinationRouteProperty):
          InputRequestDestinationRouteProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputRequestDestinationRouteProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputRequestDestinationRouteProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputRequestDestinationRouteProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.InputRequestDestinationRouteProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputSdpLocationProperty inputSdpLocationProperty = InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsdplocation.html)
   */
  public interface InputSdpLocationProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsdplocation.html#cfn-medialive-input-inputsdplocation-mediaindex)
     */
    public fun mediaIndex(): Number? = unwrap(this).getMediaIndex()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsdplocation.html#cfn-medialive-input-inputsdplocation-sdpurl)
     */
    public fun sdpUrl(): String? = unwrap(this).getSdpUrl()

    /**
     * A builder for [InputSdpLocationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param mediaIndex the value to be set.
       */
      public fun mediaIndex(mediaIndex: Number)

      /**
       * @param sdpUrl the value to be set.
       */
      public fun sdpUrl(sdpUrl: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputSdpLocationProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputSdpLocationProperty.builder()

      /**
       * @param mediaIndex the value to be set.
       */
      override fun mediaIndex(mediaIndex: Number) {
        cdkBuilder.mediaIndex(mediaIndex)
      }

      /**
       * @param sdpUrl the value to be set.
       */
      override fun sdpUrl(sdpUrl: String) {
        cdkBuilder.sdpUrl(sdpUrl)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputSdpLocationProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputSdpLocationProperty,
    ) : CdkObject(cdkObject),
        InputSdpLocationProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsdplocation.html#cfn-medialive-input-inputsdplocation-mediaindex)
       */
      override fun mediaIndex(): Number? = unwrap(this).getMediaIndex()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsdplocation.html#cfn-medialive-input-inputsdplocation-sdpurl)
       */
      override fun sdpUrl(): String? = unwrap(this).getSdpUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputSdpLocationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputSdpLocationProperty):
          InputSdpLocationProperty = CdkObjectWrappers.wrap(cdkObject) as? InputSdpLocationProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSdpLocationProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputSdpLocationProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.InputSdpLocationProperty
    }
  }

  /**
   * Settings that apply only if the input is a pull type of input.
   *
   * The parent of this entity is Input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputSourceRequestProperty inputSourceRequestProperty = InputSourceRequestProperty.builder()
   * .passwordParam("passwordParam")
   * .url("url")
   * .username("username")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html)
   */
  public interface InputSourceRequestProperty {
    /**
     * The password parameter that holds the password for accessing the upstream system.
     *
     * The password parameter applies only if the upstream system requires credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html#cfn-medialive-input-inputsourcerequest-passwordparam)
     */
    public fun passwordParam(): String? = unwrap(this).getPasswordParam()

    /**
     * For a pull input, the URL where MediaLive pulls the source content from.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html#cfn-medialive-input-inputsourcerequest-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * The user name to connect to the upstream system.
     *
     * The user name applies only if the upstream system requires credentials.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html#cfn-medialive-input-inputsourcerequest-username)
     */
    public fun username(): String? = unwrap(this).getUsername()

    /**
     * A builder for [InputSourceRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param passwordParam The password parameter that holds the password for accessing the
       * upstream system.
       * The password parameter applies only if the upstream system requires credentials.
       */
      public fun passwordParam(passwordParam: String)

      /**
       * @param url For a pull input, the URL where MediaLive pulls the source content from.
       */
      public fun url(url: String)

      /**
       * @param username The user name to connect to the upstream system.
       * The user name applies only if the upstream system requires credentials.
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty.builder()

      /**
       * @param passwordParam The password parameter that holds the password for accessing the
       * upstream system.
       * The password parameter applies only if the upstream system requires credentials.
       */
      override fun passwordParam(passwordParam: String) {
        cdkBuilder.passwordParam(passwordParam)
      }

      /**
       * @param url For a pull input, the URL where MediaLive pulls the source content from.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      /**
       * @param username The user name to connect to the upstream system.
       * The user name applies only if the upstream system requires credentials.
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty,
    ) : CdkObject(cdkObject),
        InputSourceRequestProperty {
      /**
       * The password parameter that holds the password for accessing the upstream system.
       *
       * The password parameter applies only if the upstream system requires credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html#cfn-medialive-input-inputsourcerequest-passwordparam)
       */
      override fun passwordParam(): String? = unwrap(this).getPasswordParam()

      /**
       * For a pull input, the URL where MediaLive pulls the source content from.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html#cfn-medialive-input-inputsourcerequest-url)
       */
      override fun url(): String? = unwrap(this).getUrl()

      /**
       * The user name to connect to the upstream system.
       *
       * The user name applies only if the upstream system requires credentials.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputsourcerequest.html#cfn-medialive-input-inputsourcerequest-username)
       */
      override fun username(): String? = unwrap(this).getUsername()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputSourceRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty):
          InputSourceRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          InputSourceRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputSourceRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.InputSourceRequestProperty
    }
  }

  /**
   * Settings that apply only if the input is an push input where the source is on Amazon VPC.
   *
   * The parent of this entity is Input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * InputVpcRequestProperty inputVpcRequestProperty = InputVpcRequestProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnetIds(List.of("subnetIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputvpcrequest.html)
   */
  public interface InputVpcRequestProperty {
    /**
     * The list of up to five VPC security group IDs to attach to the input VPC network interfaces.
     *
     * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC default
     * security group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputvpcrequest.html#cfn-medialive-input-inputvpcrequest-securitygroupids)
     */
    public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

    /**
     * The list of two VPC subnet IDs from the same VPC.
     *
     * You must associate subnet IDs to two unique Availability Zones.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputvpcrequest.html#cfn-medialive-input-inputvpcrequest-subnetids)
     */
    public fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()

    /**
     * A builder for [InputVpcRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The list of up to five VPC security group IDs to attach to the
       * input VPC network interfaces.
       * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC
       * default security group.
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The list of up to five VPC security group IDs to attach to the
       * input VPC network interfaces.
       * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC
       * default security group.
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnetIds The list of two VPC subnet IDs from the same VPC.
       * You must associate subnet IDs to two unique Availability Zones.
       */
      public fun subnetIds(subnetIds: List<String>)

      /**
       * @param subnetIds The list of two VPC subnet IDs from the same VPC.
       * You must associate subnet IDs to two unique Availability Zones.
       */
      public fun subnetIds(vararg subnetIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty.builder()

      /**
       * @param securityGroupIds The list of up to five VPC security group IDs to attach to the
       * input VPC network interfaces.
       * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC
       * default security group.
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The list of up to five VPC security group IDs to attach to the
       * input VPC network interfaces.
       * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC
       * default security group.
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnetIds The list of two VPC subnet IDs from the same VPC.
       * You must associate subnet IDs to two unique Availability Zones.
       */
      override fun subnetIds(subnetIds: List<String>) {
        cdkBuilder.subnetIds(subnetIds)
      }

      /**
       * @param subnetIds The list of two VPC subnet IDs from the same VPC.
       * You must associate subnet IDs to two unique Availability Zones.
       */
      override fun subnetIds(vararg subnetIds: String): Unit = subnetIds(subnetIds.toList())

      public fun build(): software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty,
    ) : CdkObject(cdkObject),
        InputVpcRequestProperty {
      /**
       * The list of up to five VPC security group IDs to attach to the input VPC network
       * interfaces.
       *
       * The security groups require subnet IDs. If none are specified, MediaLive uses the VPC
       * default security group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputvpcrequest.html#cfn-medialive-input-inputvpcrequest-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
          emptyList()

      /**
       * The list of two VPC subnet IDs from the same VPC.
       *
       * You must associate subnet IDs to two unique Availability Zones.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-inputvpcrequest.html#cfn-medialive-input-inputvpcrequest-subnetids)
       */
      override fun subnetIds(): List<String> = unwrap(this).getSubnetIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InputVpcRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty):
          InputVpcRequestProperty = CdkObjectWrappers.wrap(cdkObject) as? InputVpcRequestProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: InputVpcRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.InputVpcRequestProperty
    }
  }

  /**
   * Settings that apply only if the input is a MediaConnect input.
   *
   * The parent of this entity is Input.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MediaConnectFlowRequestProperty mediaConnectFlowRequestProperty =
   * MediaConnectFlowRequestProperty.builder()
   * .flowArn("flowArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html)
   */
  public interface MediaConnectFlowRequestProperty {
    /**
     * The ARN of one or two MediaConnect flows that are the sources for this MediaConnect input.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html#cfn-medialive-input-mediaconnectflowrequest-flowarn)
     */
    public fun flowArn(): String? = unwrap(this).getFlowArn()

    /**
     * A builder for [MediaConnectFlowRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param flowArn The ARN of one or two MediaConnect flows that are the sources for this
       * MediaConnect input.
       */
      public fun flowArn(flowArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty.builder()

      /**
       * @param flowArn The ARN of one or two MediaConnect flows that are the sources for this
       * MediaConnect input.
       */
      override fun flowArn(flowArn: String) {
        cdkBuilder.flowArn(flowArn)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty,
    ) : CdkObject(cdkObject),
        MediaConnectFlowRequestProperty {
      /**
       * The ARN of one or two MediaConnect flows that are the sources for this MediaConnect input.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-mediaconnectflowrequest.html#cfn-medialive-input-mediaconnectflowrequest-flowarn)
       */
      override fun flowArn(): String? = unwrap(this).getFlowArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): MediaConnectFlowRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty):
          MediaConnectFlowRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MediaConnectFlowRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MediaConnectFlowRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.MediaConnectFlowRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MulticastSettingsCreateRequestProperty multicastSettingsCreateRequestProperty =
   * MulticastSettingsCreateRequestProperty.builder()
   * .sources(List.of(MulticastSourceCreateRequestProperty.builder()
   * .sourceIp("sourceIp")
   * .url("url")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsettingscreaterequest.html)
   */
  public interface MulticastSettingsCreateRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsettingscreaterequest.html#cfn-medialive-input-multicastsettingscreaterequest-sources)
     */
    public fun sources(): Any? = unwrap(this).getSources()

    /**
     * A builder for [MulticastSettingsCreateRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sources the value to be set.
       */
      public fun sources(sources: IResolvable)

      /**
       * @param sources the value to be set.
       */
      public fun sources(sources: List<Any>)

      /**
       * @param sources the value to be set.
       */
      public fun sources(vararg sources: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSettingsCreateRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSettingsCreateRequestProperty.builder()

      /**
       * @param sources the value to be set.
       */
      override fun sources(sources: IResolvable) {
        cdkBuilder.sources(sources.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sources the value to be set.
       */
      override fun sources(sources: List<Any>) {
        cdkBuilder.sources(sources.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param sources the value to be set.
       */
      override fun sources(vararg sources: Any): Unit = sources(sources.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSettingsCreateRequestProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.MulticastSettingsCreateRequestProperty,
    ) : CdkObject(cdkObject),
        MulticastSettingsCreateRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsettingscreaterequest.html#cfn-medialive-input-multicastsettingscreaterequest-sources)
       */
      override fun sources(): Any? = unwrap(this).getSources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MulticastSettingsCreateRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.MulticastSettingsCreateRequestProperty):
          MulticastSettingsCreateRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MulticastSettingsCreateRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MulticastSettingsCreateRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSettingsCreateRequestProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSettingsCreateRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * MulticastSourceCreateRequestProperty multicastSourceCreateRequestProperty =
   * MulticastSourceCreateRequestProperty.builder()
   * .sourceIp("sourceIp")
   * .url("url")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsourcecreaterequest.html)
   */
  public interface MulticastSourceCreateRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsourcecreaterequest.html#cfn-medialive-input-multicastsourcecreaterequest-sourceip)
     */
    public fun sourceIp(): String? = unwrap(this).getSourceIp()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsourcecreaterequest.html#cfn-medialive-input-multicastsourcecreaterequest-url)
     */
    public fun url(): String? = unwrap(this).getUrl()

    /**
     * A builder for [MulticastSourceCreateRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sourceIp the value to be set.
       */
      public fun sourceIp(sourceIp: String)

      /**
       * @param url the value to be set.
       */
      public fun url(url: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSourceCreateRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSourceCreateRequestProperty.builder()

      /**
       * @param sourceIp the value to be set.
       */
      override fun sourceIp(sourceIp: String) {
        cdkBuilder.sourceIp(sourceIp)
      }

      /**
       * @param url the value to be set.
       */
      override fun url(url: String) {
        cdkBuilder.url(url)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSourceCreateRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.MulticastSourceCreateRequestProperty,
    ) : CdkObject(cdkObject),
        MulticastSourceCreateRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsourcecreaterequest.html#cfn-medialive-input-multicastsourcecreaterequest-sourceip)
       */
      override fun sourceIp(): String? = unwrap(this).getSourceIp()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-multicastsourcecreaterequest.html#cfn-medialive-input-multicastsourcecreaterequest-url)
       */
      override fun url(): String? = unwrap(this).getUrl()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          MulticastSourceCreateRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.MulticastSourceCreateRequestProperty):
          MulticastSourceCreateRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          MulticastSourceCreateRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: MulticastSourceCreateRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSourceCreateRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.MulticastSourceCreateRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * Smpte2110ReceiverGroupProperty smpte2110ReceiverGroupProperty =
   * Smpte2110ReceiverGroupProperty.builder()
   * .sdpSettings(Smpte2110ReceiverGroupSdpSettingsProperty.builder()
   * .ancillarySdps(List.of(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build()))
   * .audioSdps(List.of(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build()))
   * .videoSdp(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroup.html)
   */
  public interface Smpte2110ReceiverGroupProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroup.html#cfn-medialive-input-smpte2110receivergroup-sdpsettings)
     */
    public fun sdpSettings(): Any? = unwrap(this).getSdpSettings()

    /**
     * A builder for [Smpte2110ReceiverGroupProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param sdpSettings the value to be set.
       */
      public fun sdpSettings(sdpSettings: IResolvable)

      /**
       * @param sdpSettings the value to be set.
       */
      public fun sdpSettings(sdpSettings: Smpte2110ReceiverGroupSdpSettingsProperty)

      /**
       * @param sdpSettings the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9f1f9110cc3fd966af659df80f61f81498f711f17dfd1661e419036551cfde3")
      public
          fun sdpSettings(sdpSettings: Smpte2110ReceiverGroupSdpSettingsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupProperty.builder()

      /**
       * @param sdpSettings the value to be set.
       */
      override fun sdpSettings(sdpSettings: IResolvable) {
        cdkBuilder.sdpSettings(sdpSettings.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param sdpSettings the value to be set.
       */
      override fun sdpSettings(sdpSettings: Smpte2110ReceiverGroupSdpSettingsProperty) {
        cdkBuilder.sdpSettings(sdpSettings.let(Smpte2110ReceiverGroupSdpSettingsProperty.Companion::unwrap))
      }

      /**
       * @param sdpSettings the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e9f1f9110cc3fd966af659df80f61f81498f711f17dfd1661e419036551cfde3")
      override
          fun sdpSettings(sdpSettings: Smpte2110ReceiverGroupSdpSettingsProperty.Builder.() -> Unit):
          Unit = sdpSettings(Smpte2110ReceiverGroupSdpSettingsProperty(sdpSettings))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupProperty,
    ) : CdkObject(cdkObject),
        Smpte2110ReceiverGroupProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroup.html#cfn-medialive-input-smpte2110receivergroup-sdpsettings)
       */
      override fun sdpSettings(): Any? = unwrap(this).getSdpSettings()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): Smpte2110ReceiverGroupProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupProperty):
          Smpte2110ReceiverGroupProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Smpte2110ReceiverGroupProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Smpte2110ReceiverGroupProperty):
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * Smpte2110ReceiverGroupSdpSettingsProperty smpte2110ReceiverGroupSdpSettingsProperty =
   * Smpte2110ReceiverGroupSdpSettingsProperty.builder()
   * .ancillarySdps(List.of(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build()))
   * .audioSdps(List.of(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build()))
   * .videoSdp(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsdpsettings.html)
   */
  public interface Smpte2110ReceiverGroupSdpSettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsdpsettings.html#cfn-medialive-input-smpte2110receivergroupsdpsettings-ancillarysdps)
     */
    public fun ancillarySdps(): Any? = unwrap(this).getAncillarySdps()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsdpsettings.html#cfn-medialive-input-smpte2110receivergroupsdpsettings-audiosdps)
     */
    public fun audioSdps(): Any? = unwrap(this).getAudioSdps()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsdpsettings.html#cfn-medialive-input-smpte2110receivergroupsdpsettings-videosdp)
     */
    public fun videoSdp(): Any? = unwrap(this).getVideoSdp()

    /**
     * A builder for [Smpte2110ReceiverGroupSdpSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param ancillarySdps the value to be set.
       */
      public fun ancillarySdps(ancillarySdps: IResolvable)

      /**
       * @param ancillarySdps the value to be set.
       */
      public fun ancillarySdps(ancillarySdps: List<Any>)

      /**
       * @param ancillarySdps the value to be set.
       */
      public fun ancillarySdps(vararg ancillarySdps: Any)

      /**
       * @param audioSdps the value to be set.
       */
      public fun audioSdps(audioSdps: IResolvable)

      /**
       * @param audioSdps the value to be set.
       */
      public fun audioSdps(audioSdps: List<Any>)

      /**
       * @param audioSdps the value to be set.
       */
      public fun audioSdps(vararg audioSdps: Any)

      /**
       * @param videoSdp the value to be set.
       */
      public fun videoSdp(videoSdp: IResolvable)

      /**
       * @param videoSdp the value to be set.
       */
      public fun videoSdp(videoSdp: InputSdpLocationProperty)

      /**
       * @param videoSdp the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b5046f4c424c9e6b315f464a9c59e77a9f3ae6f78a81555917d0055c6b41270")
      public fun videoSdp(videoSdp: InputSdpLocationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSdpSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSdpSettingsProperty.builder()

      /**
       * @param ancillarySdps the value to be set.
       */
      override fun ancillarySdps(ancillarySdps: IResolvable) {
        cdkBuilder.ancillarySdps(ancillarySdps.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param ancillarySdps the value to be set.
       */
      override fun ancillarySdps(ancillarySdps: List<Any>) {
        cdkBuilder.ancillarySdps(ancillarySdps.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param ancillarySdps the value to be set.
       */
      override fun ancillarySdps(vararg ancillarySdps: Any): Unit =
          ancillarySdps(ancillarySdps.toList())

      /**
       * @param audioSdps the value to be set.
       */
      override fun audioSdps(audioSdps: IResolvable) {
        cdkBuilder.audioSdps(audioSdps.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param audioSdps the value to be set.
       */
      override fun audioSdps(audioSdps: List<Any>) {
        cdkBuilder.audioSdps(audioSdps.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param audioSdps the value to be set.
       */
      override fun audioSdps(vararg audioSdps: Any): Unit = audioSdps(audioSdps.toList())

      /**
       * @param videoSdp the value to be set.
       */
      override fun videoSdp(videoSdp: IResolvable) {
        cdkBuilder.videoSdp(videoSdp.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param videoSdp the value to be set.
       */
      override fun videoSdp(videoSdp: InputSdpLocationProperty) {
        cdkBuilder.videoSdp(videoSdp.let(InputSdpLocationProperty.Companion::unwrap))
      }

      /**
       * @param videoSdp the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("6b5046f4c424c9e6b315f464a9c59e77a9f3ae6f78a81555917d0055c6b41270")
      override fun videoSdp(videoSdp: InputSdpLocationProperty.Builder.() -> Unit): Unit =
          videoSdp(InputSdpLocationProperty(videoSdp))

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSdpSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSdpSettingsProperty,
    ) : CdkObject(cdkObject),
        Smpte2110ReceiverGroupSdpSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsdpsettings.html#cfn-medialive-input-smpte2110receivergroupsdpsettings-ancillarysdps)
       */
      override fun ancillarySdps(): Any? = unwrap(this).getAncillarySdps()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsdpsettings.html#cfn-medialive-input-smpte2110receivergroupsdpsettings-audiosdps)
       */
      override fun audioSdps(): Any? = unwrap(this).getAudioSdps()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsdpsettings.html#cfn-medialive-input-smpte2110receivergroupsdpsettings-videosdp)
       */
      override fun videoSdp(): Any? = unwrap(this).getVideoSdp()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Smpte2110ReceiverGroupSdpSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSdpSettingsProperty):
          Smpte2110ReceiverGroupSdpSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Smpte2110ReceiverGroupSdpSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Smpte2110ReceiverGroupSdpSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSdpSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSdpSettingsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * Smpte2110ReceiverGroupSettingsProperty smpte2110ReceiverGroupSettingsProperty =
   * Smpte2110ReceiverGroupSettingsProperty.builder()
   * .smpte2110ReceiverGroups(List.of(Smpte2110ReceiverGroupProperty.builder()
   * .sdpSettings(Smpte2110ReceiverGroupSdpSettingsProperty.builder()
   * .ancillarySdps(List.of(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build()))
   * .audioSdps(List.of(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build()))
   * .videoSdp(InputSdpLocationProperty.builder()
   * .mediaIndex(123)
   * .sdpUrl("sdpUrl")
   * .build())
   * .build())
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsettings.html)
   */
  public interface Smpte2110ReceiverGroupSettingsProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsettings.html#cfn-medialive-input-smpte2110receivergroupsettings-smpte2110receivergroups)
     */
    public fun smpte2110ReceiverGroups(): Any? = unwrap(this).getSmpte2110ReceiverGroups()

    /**
     * A builder for [Smpte2110ReceiverGroupSettingsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param smpte2110ReceiverGroups the value to be set.
       */
      public fun smpte2110ReceiverGroups(smpte2110ReceiverGroups: IResolvable)

      /**
       * @param smpte2110ReceiverGroups the value to be set.
       */
      public fun smpte2110ReceiverGroups(smpte2110ReceiverGroups: List<Any>)

      /**
       * @param smpte2110ReceiverGroups the value to be set.
       */
      public fun smpte2110ReceiverGroups(vararg smpte2110ReceiverGroups: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSettingsProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSettingsProperty.builder()

      /**
       * @param smpte2110ReceiverGroups the value to be set.
       */
      override fun smpte2110ReceiverGroups(smpte2110ReceiverGroups: IResolvable) {
        cdkBuilder.smpte2110ReceiverGroups(smpte2110ReceiverGroups.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param smpte2110ReceiverGroups the value to be set.
       */
      override fun smpte2110ReceiverGroups(smpte2110ReceiverGroups: List<Any>) {
        cdkBuilder.smpte2110ReceiverGroups(smpte2110ReceiverGroups.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param smpte2110ReceiverGroups the value to be set.
       */
      override fun smpte2110ReceiverGroups(vararg smpte2110ReceiverGroups: Any): Unit =
          smpte2110ReceiverGroups(smpte2110ReceiverGroups.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSettingsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSettingsProperty,
    ) : CdkObject(cdkObject),
        Smpte2110ReceiverGroupSettingsProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-smpte2110receivergroupsettings.html#cfn-medialive-input-smpte2110receivergroupsettings-smpte2110receivergroups)
       */
      override fun smpte2110ReceiverGroups(): Any? = unwrap(this).getSmpte2110ReceiverGroups()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          Smpte2110ReceiverGroupSettingsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSettingsProperty):
          Smpte2110ReceiverGroupSettingsProperty = CdkObjectWrappers.wrap(cdkObject) as?
          Smpte2110ReceiverGroupSettingsProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: Smpte2110ReceiverGroupSettingsProperty):
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSettingsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.Smpte2110ReceiverGroupSettingsProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * SrtCallerDecryptionRequestProperty srtCallerDecryptionRequestProperty =
   * SrtCallerDecryptionRequestProperty.builder()
   * .algorithm("algorithm")
   * .passphraseSecretArn("passphraseSecretArn")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallerdecryptionrequest.html)
   */
  public interface SrtCallerDecryptionRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallerdecryptionrequest.html#cfn-medialive-input-srtcallerdecryptionrequest-algorithm)
     */
    public fun algorithm(): String? = unwrap(this).getAlgorithm()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallerdecryptionrequest.html#cfn-medialive-input-srtcallerdecryptionrequest-passphrasesecretarn)
     */
    public fun passphraseSecretArn(): String? = unwrap(this).getPassphraseSecretArn()

    /**
     * A builder for [SrtCallerDecryptionRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param algorithm the value to be set.
       */
      public fun algorithm(algorithm: String)

      /**
       * @param passphraseSecretArn the value to be set.
       */
      public fun passphraseSecretArn(passphraseSecretArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerDecryptionRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerDecryptionRequestProperty.builder()

      /**
       * @param algorithm the value to be set.
       */
      override fun algorithm(algorithm: String) {
        cdkBuilder.algorithm(algorithm)
      }

      /**
       * @param passphraseSecretArn the value to be set.
       */
      override fun passphraseSecretArn(passphraseSecretArn: String) {
        cdkBuilder.passphraseSecretArn(passphraseSecretArn)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerDecryptionRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.SrtCallerDecryptionRequestProperty,
    ) : CdkObject(cdkObject),
        SrtCallerDecryptionRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallerdecryptionrequest.html#cfn-medialive-input-srtcallerdecryptionrequest-algorithm)
       */
      override fun algorithm(): String? = unwrap(this).getAlgorithm()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallerdecryptionrequest.html#cfn-medialive-input-srtcallerdecryptionrequest-passphrasesecretarn)
       */
      override fun passphraseSecretArn(): String? = unwrap(this).getPassphraseSecretArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SrtCallerDecryptionRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.SrtCallerDecryptionRequestProperty):
          SrtCallerDecryptionRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SrtCallerDecryptionRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SrtCallerDecryptionRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerDecryptionRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerDecryptionRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * SrtCallerSourceRequestProperty srtCallerSourceRequestProperty =
   * SrtCallerSourceRequestProperty.builder()
   * .decryption(SrtCallerDecryptionRequestProperty.builder()
   * .algorithm("algorithm")
   * .passphraseSecretArn("passphraseSecretArn")
   * .build())
   * .minimumLatency(123)
   * .srtListenerAddress("srtListenerAddress")
   * .srtListenerPort("srtListenerPort")
   * .streamId("streamId")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html)
   */
  public interface SrtCallerSourceRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-decryption)
     */
    public fun decryption(): Any? = unwrap(this).getDecryption()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-minimumlatency)
     */
    public fun minimumLatency(): Number? = unwrap(this).getMinimumLatency()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-srtlisteneraddress)
     */
    public fun srtListenerAddress(): String? = unwrap(this).getSrtListenerAddress()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-srtlistenerport)
     */
    public fun srtListenerPort(): String? = unwrap(this).getSrtListenerPort()

    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-streamid)
     */
    public fun streamId(): String? = unwrap(this).getStreamId()

    /**
     * A builder for [SrtCallerSourceRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param decryption the value to be set.
       */
      public fun decryption(decryption: IResolvable)

      /**
       * @param decryption the value to be set.
       */
      public fun decryption(decryption: SrtCallerDecryptionRequestProperty)

      /**
       * @param decryption the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da17572550067a25ba16d9f699a74120d02a9f657a15c1c91abe34396c6bcab9")
      public fun decryption(decryption: SrtCallerDecryptionRequestProperty.Builder.() -> Unit)

      /**
       * @param minimumLatency the value to be set.
       */
      public fun minimumLatency(minimumLatency: Number)

      /**
       * @param srtListenerAddress the value to be set.
       */
      public fun srtListenerAddress(srtListenerAddress: String)

      /**
       * @param srtListenerPort the value to be set.
       */
      public fun srtListenerPort(srtListenerPort: String)

      /**
       * @param streamId the value to be set.
       */
      public fun streamId(streamId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerSourceRequestProperty.Builder
          =
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerSourceRequestProperty.builder()

      /**
       * @param decryption the value to be set.
       */
      override fun decryption(decryption: IResolvable) {
        cdkBuilder.decryption(decryption.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param decryption the value to be set.
       */
      override fun decryption(decryption: SrtCallerDecryptionRequestProperty) {
        cdkBuilder.decryption(decryption.let(SrtCallerDecryptionRequestProperty.Companion::unwrap))
      }

      /**
       * @param decryption the value to be set.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("da17572550067a25ba16d9f699a74120d02a9f657a15c1c91abe34396c6bcab9")
      override fun decryption(decryption: SrtCallerDecryptionRequestProperty.Builder.() -> Unit):
          Unit = decryption(SrtCallerDecryptionRequestProperty(decryption))

      /**
       * @param minimumLatency the value to be set.
       */
      override fun minimumLatency(minimumLatency: Number) {
        cdkBuilder.minimumLatency(minimumLatency)
      }

      /**
       * @param srtListenerAddress the value to be set.
       */
      override fun srtListenerAddress(srtListenerAddress: String) {
        cdkBuilder.srtListenerAddress(srtListenerAddress)
      }

      /**
       * @param srtListenerPort the value to be set.
       */
      override fun srtListenerPort(srtListenerPort: String) {
        cdkBuilder.srtListenerPort(srtListenerPort)
      }

      /**
       * @param streamId the value to be set.
       */
      override fun streamId(streamId: String) {
        cdkBuilder.streamId(streamId)
      }

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerSourceRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.SrtCallerSourceRequestProperty,
    ) : CdkObject(cdkObject),
        SrtCallerSourceRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-decryption)
       */
      override fun decryption(): Any? = unwrap(this).getDecryption()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-minimumlatency)
       */
      override fun minimumLatency(): Number? = unwrap(this).getMinimumLatency()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-srtlisteneraddress)
       */
      override fun srtListenerAddress(): String? = unwrap(this).getSrtListenerAddress()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-srtlistenerport)
       */
      override fun srtListenerPort(): String? = unwrap(this).getSrtListenerPort()

      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtcallersourcerequest.html#cfn-medialive-input-srtcallersourcerequest-streamid)
       */
      override fun streamId(): String? = unwrap(this).getStreamId()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SrtCallerSourceRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.SrtCallerSourceRequestProperty):
          SrtCallerSourceRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SrtCallerSourceRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SrtCallerSourceRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerSourceRequestProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.SrtCallerSourceRequestProperty
    }
  }

  /**
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.medialive.*;
   * SrtSettingsRequestProperty srtSettingsRequestProperty = SrtSettingsRequestProperty.builder()
   * .srtCallerSources(List.of(SrtCallerSourceRequestProperty.builder()
   * .decryption(SrtCallerDecryptionRequestProperty.builder()
   * .algorithm("algorithm")
   * .passphraseSecretArn("passphraseSecretArn")
   * .build())
   * .minimumLatency(123)
   * .srtListenerAddress("srtListenerAddress")
   * .srtListenerPort("srtListenerPort")
   * .streamId("streamId")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtsettingsrequest.html)
   */
  public interface SrtSettingsRequestProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtsettingsrequest.html#cfn-medialive-input-srtsettingsrequest-srtcallersources)
     */
    public fun srtCallerSources(): Any? = unwrap(this).getSrtCallerSources()

    /**
     * A builder for [SrtSettingsRequestProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param srtCallerSources the value to be set.
       */
      public fun srtCallerSources(srtCallerSources: IResolvable)

      /**
       * @param srtCallerSources the value to be set.
       */
      public fun srtCallerSources(srtCallerSources: List<Any>)

      /**
       * @param srtCallerSources the value to be set.
       */
      public fun srtCallerSources(vararg srtCallerSources: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.medialive.CfnInput.SrtSettingsRequestProperty.Builder =
          software.amazon.awscdk.services.medialive.CfnInput.SrtSettingsRequestProperty.builder()

      /**
       * @param srtCallerSources the value to be set.
       */
      override fun srtCallerSources(srtCallerSources: IResolvable) {
        cdkBuilder.srtCallerSources(srtCallerSources.let(IResolvable.Companion::unwrap))
      }

      /**
       * @param srtCallerSources the value to be set.
       */
      override fun srtCallerSources(srtCallerSources: List<Any>) {
        cdkBuilder.srtCallerSources(srtCallerSources.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param srtCallerSources the value to be set.
       */
      override fun srtCallerSources(vararg srtCallerSources: Any): Unit =
          srtCallerSources(srtCallerSources.toList())

      public fun build():
          software.amazon.awscdk.services.medialive.CfnInput.SrtSettingsRequestProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.medialive.CfnInput.SrtSettingsRequestProperty,
    ) : CdkObject(cdkObject),
        SrtSettingsRequestProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-medialive-input-srtsettingsrequest.html#cfn-medialive-input-srtsettingsrequest-srtcallersources)
       */
      override fun srtCallerSources(): Any? = unwrap(this).getSrtCallerSources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): SrtSettingsRequestProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.medialive.CfnInput.SrtSettingsRequestProperty):
          SrtSettingsRequestProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SrtSettingsRequestProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SrtSettingsRequestProperty):
          software.amazon.awscdk.services.medialive.CfnInput.SrtSettingsRequestProperty = (wrapped
          as CdkObject).cdkObject as
          software.amazon.awscdk.services.medialive.CfnInput.SrtSettingsRequestProperty
    }
  }
}
