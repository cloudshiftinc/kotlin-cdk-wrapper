@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.eventschemas

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.eventschemas.CfnDiscoverer
import software.constructs.Construct

@CdkDslMarker
public class CfnDiscovererDsl(
  scope: Construct,
  id: String,
) {
  private val cdkBuilder: CfnDiscoverer.Builder = CfnDiscoverer.Builder.create(scope, id)

  private val _tags: MutableList<CfnDiscoverer.TagsEntryProperty> = mutableListOf()

  /**
   * Allows for the discovery of the event schemas that are sent to the event bus from another
   * account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
   * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
   * bus from another account. 
   */
  public fun crossAccount(crossAccount: Boolean) {
    cdkBuilder.crossAccount(crossAccount)
  }

  /**
   * Allows for the discovery of the event schemas that are sent to the event bus from another
   * account.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-crossaccount)
   * @param crossAccount Allows for the discovery of the event schemas that are sent to the event
   * bus from another account. 
   */
  public fun crossAccount(crossAccount: IResolvable) {
    cdkBuilder.crossAccount(crossAccount)
  }

  /**
   * A description for the discoverer.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-description)
   * @param description A description for the discoverer. 
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * The ARN of the event bus.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-sourcearn)
   * @param sourceArn The ARN of the event bus. 
   */
  public fun sourceArn(sourceArn: String) {
    cdkBuilder.sourceArn(sourceArn)
  }

  /**
   * Tags associated with the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
   * @param tags Tags associated with the resource. 
   */
  public fun tags(tags: CfnDiscovererTagsEntryPropertyDsl.() -> Unit) {
    _tags.add(CfnDiscovererTagsEntryPropertyDsl().apply(tags).build())
  }

  /**
   * Tags associated with the resource.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-eventschemas-discoverer.html#cfn-eventschemas-discoverer-tags)
   * @param tags Tags associated with the resource. 
   */
  public fun tags(tags: Collection<CfnDiscoverer.TagsEntryProperty>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnDiscoverer {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
