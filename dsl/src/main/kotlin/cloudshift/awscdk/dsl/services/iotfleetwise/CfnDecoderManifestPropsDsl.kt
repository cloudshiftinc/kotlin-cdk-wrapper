@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotfleetwise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iotfleetwise.CfnDecoderManifestProps

/**
 * Properties for defining a `CfnDecoderManifest`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotfleetwise.*;
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
@CdkDslMarker
public class CfnDecoderManifestPropsDsl {
  private val cdkBuilder: CfnDecoderManifestProps.Builder = CfnDecoderManifestProps.builder()

  private val _networkInterfaces: MutableList<Any> = mutableListOf()

  private val _signalDecoders: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description (Optional) A brief description of the decoder manifest.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param modelManifestArn The Amazon Resource Name (ARN) of a vehicle model (model manifest)
   * associated with the decoder manifest. 
   */
  public fun modelManifestArn(modelManifestArn: String) {
    cdkBuilder.modelManifestArn(modelManifestArn)
  }

  /**
   * @param name The name of the decoder manifest. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param networkInterfaces (Optional) A list of information about available network interfaces.
   */
  public fun networkInterfaces(vararg networkInterfaces: Any) {
    _networkInterfaces.addAll(listOf(*networkInterfaces))
  }

  /**
   * @param networkInterfaces (Optional) A list of information about available network interfaces.
   */
  public fun networkInterfaces(networkInterfaces: Collection<Any>) {
    _networkInterfaces.addAll(networkInterfaces)
  }

  /**
   * @param networkInterfaces (Optional) A list of information about available network interfaces.
   */
  public fun networkInterfaces(networkInterfaces: IResolvable) {
    cdkBuilder.networkInterfaces(networkInterfaces)
  }

  /**
   * @param signalDecoders (Optional) A list of information about signal decoders.
   */
  public fun signalDecoders(vararg signalDecoders: Any) {
    _signalDecoders.addAll(listOf(*signalDecoders))
  }

  /**
   * @param signalDecoders (Optional) A list of information about signal decoders.
   */
  public fun signalDecoders(signalDecoders: Collection<Any>) {
    _signalDecoders.addAll(signalDecoders)
  }

  /**
   * @param signalDecoders (Optional) A list of information about signal decoders.
   */
  public fun signalDecoders(signalDecoders: IResolvable) {
    cdkBuilder.signalDecoders(signalDecoders)
  }

  /**
   * @param status (Optional) The state of the decoder manifest.
   * If the status is `ACTIVE` , the decoder manifest can't be edited. If the status is marked
   * `DRAFT` , you can edit the decoder manifest.
   */
  public fun status(status: String) {
    cdkBuilder.status(status)
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags (Optional) Metadata that can be used to manage the decoder manifest.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDecoderManifestProps {
    if(_networkInterfaces.isNotEmpty()) cdkBuilder.networkInterfaces(_networkInterfaces)
    if(_signalDecoders.isNotEmpty()) cdkBuilder.signalDecoders(_signalDecoders)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
