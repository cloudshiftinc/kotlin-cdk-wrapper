@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.neptune

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.common.MapBuilder
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.neptune.CfnDBParameterGroupProps

@CdkDslMarker
public class CfnDBParameterGroupPropsDsl {
  private val cdkBuilder: CfnDBParameterGroupProps.Builder = CfnDBParameterGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description Provides the customer-specified description for this DB parameter group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param family Must be `neptune1` for engine versions prior to
   * [1.2.0.0](https://docs.aws.amazon.com/neptune/latest/userguide/engine-releases-1.2.0.0.html) , or
   * `neptune1.2` for engine version `1.2.0.0` and higher. 
   */
  public fun family(family: String) {
    cdkBuilder.family(family)
  }

  /**
   * @param name Provides the name of the DB parameter group.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param parameters The parameters to set for this DB parameter group. 
   * The parameters are expressed as a JSON object consisting of key-value pairs.
   *
   * Changes to dynamic parameters are applied immediately. During an update, if you have static
   * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
   * associated DB instance without failover.
   */
  public fun parameters(parameters: MapBuilder.() -> Unit = {}) {
    val builder = MapBuilder()
    builder.apply(parameters)
    cdkBuilder.parameters(builder.map)
  }

  /**
   * @param parameters The parameters to set for this DB parameter group. 
   * The parameters are expressed as a JSON object consisting of key-value pairs.
   *
   * Changes to dynamic parameters are applied immediately. During an update, if you have static
   * parameters (whether they were changed or not), it triggers AWS CloudFormation to reboot the
   * associated DB instance without failover.
   */
  public fun parameters(parameters: Any) {
    cdkBuilder.parameters(parameters)
  }

  /**
   * @param tags The tags that you want to attach to this parameter group.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags that you want to attach to this parameter group.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDBParameterGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
