@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.events

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.events.CfnRule

/**
 * Information about the EC2 instances that are to be sent the command, specified as key-value
 * pairs.
 *
 * Each `RunCommandTarget` block can include only one key, but this key may specify multiple values.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.events.*;
 * RunCommandTargetProperty runCommandTargetProperty = RunCommandTargetProperty.builder()
 * .key("key")
 * .values(List.of("values"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-events-rule-runcommandtarget.html)
 */
@CdkDslMarker
public class CfnRuleRunCommandTargetPropertyDsl {
  private val cdkBuilder: CfnRule.RunCommandTargetProperty.Builder =
      CfnRule.RunCommandTargetProperty.builder()

  private val _values: MutableList<String> = mutableListOf()

  /**
   * @param key Can be either `tag:` *tag-key* or `InstanceIds` . 
   */
  public fun key(key: String) {
    cdkBuilder.key(key)
  }

  /**
   * @param values If `Key` is `tag:` *tag-key* , `Values` is a list of tag values. 
   * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
   */
  public fun values(vararg values: String) {
    _values.addAll(listOf(*values))
  }

  /**
   * @param values If `Key` is `tag:` *tag-key* , `Values` is a list of tag values. 
   * If `Key` is `InstanceIds` , `Values` is a list of Amazon EC2 instance IDs.
   */
  public fun values(values: Collection<String>) {
    _values.addAll(values)
  }

  public fun build(): CfnRule.RunCommandTargetProperty {
    if(_values.isNotEmpty()) cdkBuilder.values(_values)
    return cdkBuilder.build()
  }
}
