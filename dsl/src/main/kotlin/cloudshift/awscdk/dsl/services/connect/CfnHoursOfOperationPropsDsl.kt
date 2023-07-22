@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.connect

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.connect.CfnHoursOfOperationProps

@CdkDslMarker
public class CfnHoursOfOperationPropsDsl {
  private val cdkBuilder: CfnHoursOfOperationProps.Builder = CfnHoursOfOperationProps.builder()

  private val _config: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param config Configuration information for the hours of operation. 
   */
  public fun config(vararg config: Any) {
    _config.addAll(listOf(*config))
  }

  /**
   * @param config Configuration information for the hours of operation. 
   */
  public fun config(config: Collection<Any>) {
    _config.addAll(config)
  }

  /**
   * @param config Configuration information for the hours of operation. 
   */
  public fun config(config: IResolvable) {
    cdkBuilder.config(config)
  }

  /**
   * @param description The description for the hours of operation.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param instanceArn The Amazon Resource Name (ARN) for the instance. 
   */
  public fun instanceArn(instanceArn: String) {
    cdkBuilder.instanceArn(instanceArn)
  }

  /**
   * @param name The name for the hours of operation. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The tags used to organize, track, or control access for this resource.
   * For example, { "tags": {"key1":"value1", "key2":"value2"} }.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param timeZone The time zone for the hours of operation. 
   */
  public fun timeZone(timeZone: String) {
    cdkBuilder.timeZone(timeZone)
  }

  public fun build(): CfnHoursOfOperationProps {
    if(_config.isNotEmpty()) cdkBuilder.config(_config)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
