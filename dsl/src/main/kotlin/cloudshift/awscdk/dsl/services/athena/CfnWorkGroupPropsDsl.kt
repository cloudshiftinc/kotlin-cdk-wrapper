@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.athena

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.athena.CfnWorkGroup
import software.amazon.awscdk.services.athena.CfnWorkGroupProps

@CdkDslMarker
public class CfnWorkGroupPropsDsl {
  private val cdkBuilder: CfnWorkGroupProps.Builder = CfnWorkGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  public fun recursiveDeleteOption(recursiveDeleteOption: Boolean) {
    cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
  }

  public fun recursiveDeleteOption(recursiveDeleteOption: IResolvable) {
    cdkBuilder.recursiveDeleteOption(recursiveDeleteOption)
  }

  public fun state(state: String) {
    cdkBuilder.state(state)
  }

  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun workGroupConfiguration(workGroupConfiguration: IResolvable) {
    cdkBuilder.workGroupConfiguration(workGroupConfiguration)
  }

  public
      fun workGroupConfiguration(workGroupConfiguration: CfnWorkGroup.WorkGroupConfigurationProperty) {
    cdkBuilder.workGroupConfiguration(workGroupConfiguration)
  }

  public fun build(): CfnWorkGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
