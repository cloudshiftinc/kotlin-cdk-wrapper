@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.constructs.Construct

/**
 * An activity is a task that you write in any programming language and host on any machine that has
 * access to AWS Step Functions .
 *
 * Activities must poll Step Functions using the `GetActivityTask` API action and respond using
 * `SendTask*` API actions. This function lets Step Functions know the existence of your activity and
 * returns an identifier for use in a state machine and when polling from the activity.
 *
 * For information about creating an activity, see [Creating an Activity State
 * Machine](https://docs.aws.amazon.com/step-functions/latest/dg/tutorial-creating-activity-state-machine.html)
 * in the *AWS Step Functions Developer Guide* and
 * [CreateActivity](https://docs.aws.amazon.com/step-functions/latest/apireference/API_CreateActivity.html)
 * in the *AWS Step Functions API Reference* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.stepfunctions.*;
 * CfnActivity cfnActivity = CfnActivity.Builder.create(this, "MyCfnActivity")
 * .name("name")
 * // the properties below are optional
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html)
 */
@CdkDslMarker
public class CfnActivityDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnActivity.Builder = CfnActivity.Builder.create(scope, id)

  private val _tags: MutableList<CfnActivity.TagsEntryProperty> = mutableListOf()

  /**
   * The name of the activity.
   *
   * A name must *not* contain:
   *
   * * white space
   * * brackets `&lt; &gt; { } [ ]`
   * * wildcard characters `? *`
   * * special characters `" # % \ ^ | ~ ` $ &amp; , ; : /`
   * * control characters ( `U+0000-001F` , `U+007F-009F` )
   *
   * To enable logging with CloudWatch Logs, the name should only contain 0-9, A-Z, a-z, - and _.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-name)
   * @param name The name of the activity. 
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * The list of tags to add to a resource.
   *
   * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
   * @param tags The list of tags to add to a resource. 
   */
  public fun tags(tags: CfnActivityTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnActivityTagsEntryPropertyDsl().apply(tags).build())
  }

  /**
   * The list of tags to add to a resource.
   *
   * Tags may only contain Unicode letters, digits, white space, or these symbols: `_ . : / = + -
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-stepfunctions-activity.html#cfn-stepfunctions-activity-tags)
   * @param tags The list of tags to add to a resource. 
   */
  public fun tags(tags: Collection<CfnActivity.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnActivity {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
