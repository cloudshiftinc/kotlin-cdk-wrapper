@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.iotsitewise

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnProjectProps

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnProjectProps cfnProjectProps = CfnProjectProps.builder()
 * .portalId("portalId")
 * .projectName("projectName")
 * // the properties below are optional
 * .assetIds(List.of("assetIds"))
 * .projectDescription("projectDescription")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html)
 */
@CdkDslMarker
public class CfnProjectPropsDsl {
  private val cdkBuilder: CfnProjectProps.Builder = CfnProjectProps.builder()

  private val _assetIds: MutableList<String> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param assetIds A list that contains the IDs of each asset associated with the project.
   */
  public fun assetIds(vararg assetIds: String) {
    _assetIds.addAll(listOf(*assetIds))
  }

  /**
   * @param assetIds A list that contains the IDs of each asset associated with the project.
   */
  public fun assetIds(assetIds: Collection<String>) {
    _assetIds.addAll(assetIds)
  }

  /**
   * @param portalId The ID of the portal in which to create the project. 
   */
  public fun portalId(portalId: String) {
    cdkBuilder.portalId(portalId)
  }

  /**
   * @param projectDescription A description for the project.
   */
  public fun projectDescription(projectDescription: String) {
    cdkBuilder.projectDescription(projectDescription)
  }

  /**
   * @param projectName A friendly name for the project. 
   */
  public fun projectName(projectName: String) {
    cdkBuilder.projectName(projectName)
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the project.
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags A list of key-value pairs that contain metadata for the project.
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  public fun build(): CfnProjectProps {
    if(_assetIds.isNotEmpty()) cdkBuilder.assetIds(_assetIds)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
