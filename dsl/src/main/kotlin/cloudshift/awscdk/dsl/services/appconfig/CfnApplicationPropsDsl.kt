@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.appconfig

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appconfig.CfnApplication
import software.amazon.awscdk.services.appconfig.CfnApplicationProps

/**
 * Properties for defining a `CfnApplication`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.appconfig.*;
 * CfnApplicationProps cfnApplicationProps = CfnApplicationProps.builder()
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(List.of(TagsProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appconfig-application.html)
 */
@CdkDslMarker
public class CfnApplicationPropsDsl {
  private val cdkBuilder: CfnApplicationProps.Builder = CfnApplicationProps.builder()

  private val _tags: MutableList<CfnApplication.TagsProperty> = mutableListOf()

  /**
   * @param description A description of the application.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param name A name for the application. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags Metadata to assign to the application.
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   */
  public fun tags(tags: CfnApplicationTagsPropertyDsl.() -> Unit) {
    _tags.add(CfnApplicationTagsPropertyDsl().apply(tags).build())
  }

  /**
   * @param tags Metadata to assign to the application.
   * Tags help organize and categorize your AWS AppConfig resources. Each tag consists of a key and
   * an optional value, both of which you define.
   */
  public fun tags(tags: Collection<CfnApplication.TagsProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnApplicationProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
