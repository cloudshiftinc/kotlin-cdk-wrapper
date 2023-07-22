@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.lightsail

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.lightsail.CfnInstance
import software.amazon.awscdk.services.lightsail.CfnInstanceProps

@CdkDslMarker
public class CfnInstancePropsDsl {
  private val cdkBuilder: CfnInstanceProps.Builder = CfnInstanceProps.builder()

  private val _addOns: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param addOns An array of add-ons for the instance.
   *
   * If the instance has an add-on enabled when performing a delete instance request, the add-on is
   * automatically disabled before the instance is deleted.
   */
  public fun addOns(vararg addOns: Any) {
    _addOns.addAll(listOf(*addOns))
  }

  /**
   * @param addOns An array of add-ons for the instance.
   *
   * If the instance has an add-on enabled when performing a delete instance request, the add-on is
   * automatically disabled before the instance is deleted.
   */
  public fun addOns(addOns: Collection<Any>) {
    _addOns.addAll(addOns)
  }

  /**
   * @param addOns An array of add-ons for the instance.
   *
   * If the instance has an add-on enabled when performing a delete instance request, the add-on is
   * automatically disabled before the instance is deleted.
   */
  public fun addOns(addOns: IResolvable) {
    cdkBuilder.addOns(addOns)
  }

  /**
   * @param availabilityZone The Availability Zone for the instance.
   */
  public fun availabilityZone(availabilityZone: String) {
    cdkBuilder.availabilityZone(availabilityZone)
  }

  /**
   * @param blueprintId The blueprint ID for the instance (for example, `os_amlinux_2016_03` ). 
   */
  public fun blueprintId(blueprintId: String) {
    cdkBuilder.blueprintId(blueprintId)
  }

  /**
   * @param bundleId The bundle ID for the instance (for example, `micro_1_0` ). 
   */
  public fun bundleId(bundleId: String) {
    cdkBuilder.bundleId(bundleId)
  }

  /**
   * @param hardware The hardware properties for the instance, such as the vCPU count, attached
   * disks, and amount of RAM.
   *
   * The instance restarts when performing an attach disk or detach disk request. This resets the
   * public IP address of your instance if a static IP isn't attached to it.
   */
  public fun hardware(hardware: IResolvable) {
    cdkBuilder.hardware(hardware)
  }

  /**
   * @param hardware The hardware properties for the instance, such as the vCPU count, attached
   * disks, and amount of RAM.
   *
   * The instance restarts when performing an attach disk or detach disk request. This resets the
   * public IP address of your instance if a static IP isn't attached to it.
   */
  public fun hardware(hardware: CfnInstance.HardwareProperty) {
    cdkBuilder.hardware(hardware)
  }

  /**
   * @param instanceName The name of the instance. 
   */
  public fun instanceName(instanceName: String) {
    cdkBuilder.instanceName(instanceName)
  }

  /**
   * @param keyPairName The name of the key pair to use for the instance.
   * If no key pair name is specified, the Regional Lightsail default key pair is used.
   */
  public fun keyPairName(keyPairName: String) {
    cdkBuilder.keyPairName(keyPairName)
  }

  /**
   * @param location The location for the instance, such as the AWS Region and Availability Zone.
   *
   * The `Location` property is read-only and should not be specified in a create instance or update
   * instance request.
   */
  public fun location(location: IResolvable) {
    cdkBuilder.location(location)
  }

  /**
   * @param location The location for the instance, such as the AWS Region and Availability Zone.
   *
   * The `Location` property is read-only and should not be specified in a create instance or update
   * instance request.
   */
  public fun location(location: CfnInstance.LocationProperty) {
    cdkBuilder.location(location)
  }

  /**
   * @param networking The public ports and the monthly amount of data transfer allocated for the
   * instance.
   */
  public fun networking(networking: IResolvable) {
    cdkBuilder.networking(networking)
  }

  /**
   * @param networking The public ports and the monthly amount of data transfer allocated for the
   * instance.
   */
  public fun networking(networking: CfnInstance.NetworkingProperty) {
    cdkBuilder.networking(networking)
  }

  /**
   * @param state The status code and the state (for example, `running` ) of the instance.
   *
   * The `State` property is read-only and should not be specified in a create instance or update
   * instance request.
   */
  public fun state(state: IResolvable) {
    cdkBuilder.state(state)
  }

  /**
   * @param state The status code and the state (for example, `running` ) of the instance.
   *
   * The `State` property is read-only and should not be specified in a create instance or update
   * instance request.
   */
  public fun state(state: CfnInstance.StateProperty) {
    cdkBuilder.state(state)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * in the *AWS CloudFormation User Guide* .
   *
   *
   * The `Value` of `Tags` is optional for Lightsail resources.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param userData The optional launch script for the instance.
   * Specify a launch script to configure an instance with additional user data. For example, you
   * might want to specify `apt-get -y update` as a launch script.
   *
   *
   * Depending on the blueprint of your instance, the command to get software on your instance
   * varies. Amazon Linux and CentOS use `yum` , Debian and Ubuntu use `apt-get` , and FreeBSD uses
   * `pkg` .
   */
  public fun userData(userData: String) {
    cdkBuilder.userData(userData)
  }

  public fun build(): CfnInstanceProps {
    if(_addOns.isNotEmpty()) cdkBuilder.addOns(_addOns)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
