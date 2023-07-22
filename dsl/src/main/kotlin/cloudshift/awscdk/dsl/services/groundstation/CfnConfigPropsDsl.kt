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
import software.amazon.awscdk.services.groundstation.CfnConfigProps

@CdkDslMarker
public class CfnConfigPropsDsl {
  private val cdkBuilder: CfnConfigProps.Builder = CfnConfigProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param configData Object containing the parameters of a config. 
   * Only one subtype may be specified per config. See the subtype definitions for a description of
   * each config subtype.
   */
  public fun configData(configData: IResolvable) {
    cdkBuilder.configData(configData)
  }

  /**
   * @param configData Object containing the parameters of a config. 
   * Only one subtype may be specified per config. See the subtype definitions for a description of
   * each config subtype.
   */
  public fun configData(configData: CfnConfig.ConfigDataProperty) {
    cdkBuilder.configData(configData)
  }

  /**
   * @param name The name of the config object. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags Tags assigned to a resource.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Tags assigned to a resource.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnConfigProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
