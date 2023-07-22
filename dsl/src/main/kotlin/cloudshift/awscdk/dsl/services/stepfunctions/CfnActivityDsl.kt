@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.stepfunctions

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.stepfunctions.CfnActivity
import software.constructs.Construct

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
