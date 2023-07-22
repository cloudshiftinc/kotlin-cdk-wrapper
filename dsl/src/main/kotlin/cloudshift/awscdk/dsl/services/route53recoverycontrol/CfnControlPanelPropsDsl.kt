@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.route53recoverycontrol

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanelProps

/**
 * Properties for defining a `CfnControlPanel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.route53recoverycontrol.*;
 * CfnControlPanelProps cfnControlPanelProps = CfnControlPanelProps.builder()
 * .name("name")
 * // the properties below are optional
 * .clusterArn("clusterArn")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-route53recoverycontrol-controlpanel.html)
 */
@CdkDslMarker
public class CfnControlPanelPropsDsl {
  private val cdkBuilder: CfnControlPanelProps.Builder = CfnControlPanelProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param clusterArn The Amazon Resource Name (ARN) of the cluster for the control panel.
   */
  public fun clusterArn(clusterArn: String) {
    cdkBuilder.clusterArn(clusterArn)
  }

  /**
   * @param name The name of the control panel. 
   * You can use any non-white space character in the name.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param tags The value for a tag.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The value for a tag.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnControlPanelProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
