@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.fsx

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.fsx.CfnVolume
import software.amazon.awscdk.services.fsx.CfnVolumeProps

@CdkDslMarker
public class CfnVolumePropsDsl {
  private val cdkBuilder: CfnVolumeProps.Builder = CfnVolumeProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param backupId Specifies the ID of the volume backup to use to create a new volume.
   */
  public fun backupId(backupId: String) {
    cdkBuilder.backupId(backupId)
  }

  /**
   * @param name The name of the volume. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
   */
  public fun ontapConfiguration(ontapConfiguration: IResolvable) {
    cdkBuilder.ontapConfiguration(ontapConfiguration)
  }

  /**
   * @param ontapConfiguration The configuration of an Amazon FSx for NetApp ONTAP volume.
   */
  public fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty) {
    cdkBuilder.ontapConfiguration(ontapConfiguration)
  }

  /**
   * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
   */
  public fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
    cdkBuilder.openZfsConfiguration(openZfsConfiguration)
  }

  /**
   * @param openZfsConfiguration The configuration of an Amazon FSx for OpenZFS volume.
   */
  public fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty) {
    cdkBuilder.openZfsConfiguration(openZfsConfiguration)
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags An array of key-value pairs to apply to this resource.
   * For more information, see
   * [Tag](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-resource-tags.html)
   * .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param volumeType The type of the volume.
   */
  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnVolumeProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
