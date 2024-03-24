@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotfleetwise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnDecoderManifest`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotfleetwise.*;
 * CfnDecoderManifestProps cfnDecoderManifestProps = CfnDecoderManifestProps.builder()
 * .modelManifestArn("modelManifestArn")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .networkInterfaces(List.of(NetworkInterfacesItemsProperty.builder()
 * .interfaceId("interfaceId")
 * .type("type")
 * // the properties below are optional
 * .canInterface(CanInterfaceProperty.builder()
 * .name("name")
 * // the properties below are optional
 * .protocolName("protocolName")
 * .protocolVersion("protocolVersion")
 * .build())
 * .obdInterface(ObdInterfaceProperty.builder()
 * .name("name")
 * .requestMessageId("requestMessageId")
 * // the properties below are optional
 * .dtcRequestIntervalSeconds("dtcRequestIntervalSeconds")
 * .hasTransmissionEcu("hasTransmissionEcu")
 * .obdStandard("obdStandard")
 * .pidRequestIntervalSeconds("pidRequestIntervalSeconds")
 * .useExtendedIds("useExtendedIds")
 * .build())
 * .build()))
 * .signalDecoders(List.of(SignalDecodersItemsProperty.builder()
 * .fullyQualifiedName("fullyQualifiedName")
 * .interfaceId("interfaceId")
 * .type("type")
 * // the properties below are optional
 * .canSignal(CanSignalProperty.builder()
 * .factor("factor")
 * .isBigEndian("isBigEndian")
 * .isSigned("isSigned")
 * .length("length")
 * .messageId("messageId")
 * .offset("offset")
 * .startBit("startBit")
 * // the properties below are optional
 * .name("name")
 * .build())
 * .obdSignal(ObdSignalProperty.builder()
 * .byteLength("byteLength")
 * .offset("offset")
 * .pid("pid")
 * .pidResponseLength("pidResponseLength")
 * .scaling("scaling")
 * .serviceMode("serviceMode")
 * .startByte("startByte")
 * // the properties below are optional
 * .bitMaskLength("bitMaskLength")
 * .bitRightShift("bitRightShift")
 * .build())
 * .build()))
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html)
 */
public interface CfnDecoderManifestProps {
  /**
   * (Optional) A brief description of the decoder manifest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The Amazon Resource Name (ARN) of a vehicle model (model manifest) associated with the decoder
   * manifest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-modelmanifestarn)
   */
  public fun modelManifestArn(): String

  /**
   * The name of the decoder manifest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-name)
   */
  public fun name(): String

  /**
   * (Optional) A list of information about available network interfaces.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
   */
  public fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

  /**
   * (Optional) A list of information about signal decoders.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
   */
  public fun signalDecoders(): Any? = unwrap(this).getSignalDecoders()

  /**
   * (Optional) The state of the decoder manifest.
   *
   * If the status is `ACTIVE` , the decoder manifest can't be edited. If the status is marked
   * `DRAFT` , you can edit the decoder manifest.
   *
   * Default: - "DRAFT"
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-status)
   */
  public fun status(): String? = unwrap(this).getStatus()

  /**
   * (Optional) Metadata that can be used to manage the decoder manifest.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnDecoderManifestProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description (Optional) A brief description of the decoder manifest.
     */
    public fun description(description: String)

    /**
     * @param modelManifestArn The Amazon Resource Name (ARN) of a vehicle model (model manifest)
     * associated with the decoder manifest. 
     */
    public fun modelManifestArn(modelManifestArn: String)

    /**
     * @param name The name of the decoder manifest. 
     */
    public fun name(name: String)

    /**
     * @param networkInterfaces (Optional) A list of information about available network interfaces.
     */
    public fun networkInterfaces(networkInterfaces: IResolvable)

    /**
     * @param networkInterfaces (Optional) A list of information about available network interfaces.
     */
    public fun networkInterfaces(networkInterfaces: List<Any>)

    /**
     * @param networkInterfaces (Optional) A list of information about available network interfaces.
     */
    public fun networkInterfaces(vararg networkInterfaces: Any)

    /**
     * @param signalDecoders (Optional) A list of information about signal decoders.
     */
    public fun signalDecoders(signalDecoders: IResolvable)

    /**
     * @param signalDecoders (Optional) A list of information about signal decoders.
     */
    public fun signalDecoders(signalDecoders: List<Any>)

    /**
     * @param signalDecoders (Optional) A list of information about signal decoders.
     */
    public fun signalDecoders(vararg signalDecoders: Any)

    /**
     * @param status (Optional) The state of the decoder manifest.
     * If the status is `ACTIVE` , the decoder manifest can't be edited. If the status is marked
     * `DRAFT` , you can edit the decoder manifest.
     */
    public fun status(status: String)

    /**
     * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps.Builder =
        software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps.builder()

    /**
     * @param description (Optional) A brief description of the decoder manifest.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param modelManifestArn The Amazon Resource Name (ARN) of a vehicle model (model manifest)
     * associated with the decoder manifest. 
     */
    override fun modelManifestArn(modelManifestArn: String) {
      cdkBuilder.modelManifestArn(modelManifestArn)
    }

    /**
     * @param name The name of the decoder manifest. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param networkInterfaces (Optional) A list of information about available network interfaces.
     */
    override fun networkInterfaces(networkInterfaces: IResolvable) {
      cdkBuilder.networkInterfaces(networkInterfaces.let(IResolvable::unwrap))
    }

    /**
     * @param networkInterfaces (Optional) A list of information about available network interfaces.
     */
    override fun networkInterfaces(networkInterfaces: List<Any>) {
      cdkBuilder.networkInterfaces(networkInterfaces.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param networkInterfaces (Optional) A list of information about available network interfaces.
     */
    override fun networkInterfaces(vararg networkInterfaces: Any): Unit =
        networkInterfaces(networkInterfaces.toList())

    /**
     * @param signalDecoders (Optional) A list of information about signal decoders.
     */
    override fun signalDecoders(signalDecoders: IResolvable) {
      cdkBuilder.signalDecoders(signalDecoders.let(IResolvable::unwrap))
    }

    /**
     * @param signalDecoders (Optional) A list of information about signal decoders.
     */
    override fun signalDecoders(signalDecoders: List<Any>) {
      cdkBuilder.signalDecoders(signalDecoders.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * @param signalDecoders (Optional) A list of information about signal decoders.
     */
    override fun signalDecoders(vararg signalDecoders: Any): Unit =
        signalDecoders(signalDecoders.toList())

    /**
     * @param status (Optional) The state of the decoder manifest.
     * If the status is `ACTIVE` , the decoder manifest can't be edited. If the status is marked
     * `DRAFT` , you can edit the decoder manifest.
     */
    override fun status(status: String) {
      cdkBuilder.status(status)
    }

    /**
     * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps,
  ) : CdkObject(cdkObject), CfnDecoderManifestProps {
    /**
     * (Optional) A brief description of the decoder manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The Amazon Resource Name (ARN) of a vehicle model (model manifest) associated with the
     * decoder manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-modelmanifestarn)
     */
    override fun modelManifestArn(): String = unwrap(this).getModelManifestArn()

    /**
     * The name of the decoder manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * (Optional) A list of information about available network interfaces.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-networkinterfaces)
     */
    override fun networkInterfaces(): Any? = unwrap(this).getNetworkInterfaces()

    /**
     * (Optional) A list of information about signal decoders.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-signaldecoders)
     */
    override fun signalDecoders(): Any? = unwrap(this).getSignalDecoders()

    /**
     * (Optional) The state of the decoder manifest.
     *
     * If the status is `ACTIVE` , the decoder manifest can't be edited. If the status is marked
     * `DRAFT` , you can edit the decoder manifest.
     *
     * Default: - "DRAFT"
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-status)
     */
    override fun status(): String? = unwrap(this).getStatus()

    /**
     * (Optional) Metadata that can be used to manage the decoder manifest.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotfleetwise-decodermanifest.html#cfn-iotfleetwise-decodermanifest-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDecoderManifestProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps):
        CfnDecoderManifestProps = CdkObjectWrappers.wrap(cdkObject) as? CfnDecoderManifestProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDecoderManifestProps):
        software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps
  }
}
