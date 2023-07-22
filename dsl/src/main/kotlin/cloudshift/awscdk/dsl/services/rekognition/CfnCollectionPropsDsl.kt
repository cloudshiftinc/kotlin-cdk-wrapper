@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.rekognition

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.rekognition.CfnCollectionProps

/**
 * Properties for defining a `CfnCollection`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.rekognition.*;
 * CfnCollectionProps cfnCollectionProps = CfnCollectionProps.builder()
 * .collectionId("collectionId")
 * // the properties below are optional
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-rekognition-collection.html)
 */
@CdkDslMarker
public class CfnCollectionPropsDsl {
  private val cdkBuilder: CfnCollectionProps.Builder = CfnCollectionProps.builder()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param collectionId ID for the collection that you are creating. 
   */
  public fun collectionId(collectionId: String) {
    cdkBuilder.collectionId(collectionId)
  }

  /**
   * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A set of tags (key-value pairs) that you want to attach to the collection.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnCollectionProps {
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
