@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.iotsitewise

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnProject`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.iotsitewise.*;
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
public interface CfnProjectProps {
  /**
   * A list that contains the IDs of each asset associated with the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
   */
  public fun assetIds(): List<String> = unwrap(this).getAssetIds() ?: emptyList()

  /**
   * The ID of the portal in which to create the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-portalid)
   */
  public fun portalId(): String

  /**
   * A description for the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectdescription)
   */
  public fun projectDescription(): String? = unwrap(this).getProjectDescription()

  /**
   * A friendly name for the project.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectname)
   */
  public fun projectName(): String

  /**
   * A list of key-value pairs that contain metadata for the project.
   *
   * For more information, see [Tagging your AWS IoT SiteWise
   * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
   * *AWS IoT SiteWise User Guide* .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnProjectProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param assetIds A list that contains the IDs of each asset associated with the project.
     */
    public fun assetIds(assetIds: List<String>)

    /**
     * @param assetIds A list that contains the IDs of each asset associated with the project.
     */
    public fun assetIds(vararg assetIds: String)

    /**
     * @param portalId The ID of the portal in which to create the project. 
     */
    public fun portalId(portalId: String)

    /**
     * @param projectDescription A description for the project.
     */
    public fun projectDescription(projectDescription: String)

    /**
     * @param projectName A friendly name for the project. 
     */
    public fun projectName(projectName: String)

    /**
     * @param tags A list of key-value pairs that contain metadata for the project.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A list of key-value pairs that contain metadata for the project.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.iotsitewise.CfnProjectProps.Builder =
        software.amazon.awscdk.services.iotsitewise.CfnProjectProps.builder()

    /**
     * @param assetIds A list that contains the IDs of each asset associated with the project.
     */
    override fun assetIds(assetIds: List<String>) {
      cdkBuilder.assetIds(assetIds)
    }

    /**
     * @param assetIds A list that contains the IDs of each asset associated with the project.
     */
    override fun assetIds(vararg assetIds: String): Unit = assetIds(assetIds.toList())

    /**
     * @param portalId The ID of the portal in which to create the project. 
     */
    override fun portalId(portalId: String) {
      cdkBuilder.portalId(portalId)
    }

    /**
     * @param projectDescription A description for the project.
     */
    override fun projectDescription(projectDescription: String) {
      cdkBuilder.projectDescription(projectDescription)
    }

    /**
     * @param projectName A friendly name for the project. 
     */
    override fun projectName(projectName: String) {
      cdkBuilder.projectName(projectName)
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the project.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags A list of key-value pairs that contain metadata for the project.
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.iotsitewise.CfnProjectProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProjectProps,
  ) : CdkObject(cdkObject), CfnProjectProps {
    /**
     * A list that contains the IDs of each asset associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
     */
    override fun assetIds(): List<String> = unwrap(this).getAssetIds() ?: emptyList()

    /**
     * The ID of the portal in which to create the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-portalid)
     */
    override fun portalId(): String = unwrap(this).getPortalId()

    /**
     * A description for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectdescription)
     */
    override fun projectDescription(): String? = unwrap(this).getProjectDescription()

    /**
     * A friendly name for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectname)
     */
    override fun projectName(): String = unwrap(this).getProjectName()

    /**
     * A list of key-value pairs that contain metadata for the project.
     *
     * For more information, see [Tagging your AWS IoT SiteWise
     * resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html) in the
     * *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnProjectProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.iotsitewise.CfnProjectProps):
        CfnProjectProps = CdkObjectWrappers.wrap(cdkObject) as CfnProjectProps

    internal fun unwrap(wrapped: CfnProjectProps):
        software.amazon.awscdk.services.iotsitewise.CfnProjectProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.iotsitewise.CfnProjectProps
  }
}
