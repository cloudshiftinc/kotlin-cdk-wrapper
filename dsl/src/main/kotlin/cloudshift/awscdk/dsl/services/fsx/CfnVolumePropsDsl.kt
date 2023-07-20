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

  public fun backupId(backupId: String) {
    cdkBuilder.backupId(backupId)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun ontapConfiguration(ontapConfiguration: IResolvable) {
    cdkBuilder.ontapConfiguration(ontapConfiguration)
  }

  public fun ontapConfiguration(ontapConfiguration: CfnVolume.OntapConfigurationProperty) {
    cdkBuilder.ontapConfiguration(ontapConfiguration)
  }

  public fun openZfsConfiguration(openZfsConfiguration: IResolvable) {
    cdkBuilder.openZfsConfiguration(openZfsConfiguration)
  }

  public fun openZfsConfiguration(openZfsConfiguration: CfnVolume.OpenZFSConfigurationProperty) {
    cdkBuilder.openZfsConfiguration(openZfsConfiguration)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun volumeType(volumeType: String) {
    cdkBuilder.volumeType(volumeType)
  }

  public fun build(): CfnVolumeProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
