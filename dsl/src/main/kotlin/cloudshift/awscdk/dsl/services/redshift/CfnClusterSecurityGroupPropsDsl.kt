@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.redshift

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.redshift.CfnClusterSecurityGroupProps

/**
 * Properties for defining a `CfnClusterSecurityGroup`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.redshift.*;
 * CfnClusterSecurityGroupProps cfnClusterSecurityGroupProps =
 * CfnClusterSecurityGroupProps.builder()
 * .description("description")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-redshift-clustersecuritygroup.html)
 */
@CdkDslMarker
public class CfnClusterSecurityGroupPropsDsl {
  private val cdkBuilder: CfnClusterSecurityGroupProps.Builder =
      CfnClusterSecurityGroupProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param description A description for the security group. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
   * security group.
   * Use tags to manage your resources.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags Specifies an arbitrary set of tags (key–value pairs) to associate with this
   * security group.
   * Use tags to manage your resources.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnClusterSecurityGroupProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
