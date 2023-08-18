@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

package io.cloudshiftdev.awscdkdsl.services.iotsitewise

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.services.iotsitewise.CfnProject
import software.constructs.Construct

/**
 * Creates a project in the specified portal.
 *
 * Make sure that the project name and description don't contain confidential information.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iotsitewise.*;
 * CfnProject cfnProject = CfnProject.Builder.create(this, "MyCfnProject")
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
public class CfnProjectDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnProject.Builder = CfnProject.Builder.create(scope, id)

    private val _assetIds: MutableList<String> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * A list that contains the IDs of each asset associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
     *
     * @param assetIds A list that contains the IDs of each asset associated with the project.
     */
    public fun assetIds(vararg assetIds: String) {
        _assetIds.addAll(listOf(*assetIds))
    }

    /**
     * A list that contains the IDs of each asset associated with the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-assetids)
     *
     * @param assetIds A list that contains the IDs of each asset associated with the project.
     */
    public fun assetIds(assetIds: Collection<String>) {
        _assetIds.addAll(assetIds)
    }

    /**
     * The ID of the portal in which to create the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-portalid)
     *
     * @param portalId The ID of the portal in which to create the project.
     */
    public fun portalId(portalId: String) {
        cdkBuilder.portalId(portalId)
    }

    /**
     * A description for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectdescription)
     *
     * @param projectDescription A description for the project.
     */
    public fun projectDescription(projectDescription: String) {
        cdkBuilder.projectDescription(projectDescription)
    }

    /**
     * A friendly name for the project.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-projectname)
     *
     * @param projectName A friendly name for the project.
     */
    public fun projectName(projectName: String) {
        cdkBuilder.projectName(projectName)
    }

    /**
     * A list of key-value pairs that contain metadata for the project.
     *
     * For more information, see
     * [Tagging your AWS IoT SiteWise resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
     *
     * @param tags A list of key-value pairs that contain metadata for the project.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * A list of key-value pairs that contain metadata for the project.
     *
     * For more information, see
     * [Tagging your AWS IoT SiteWise resources](https://docs.aws.amazon.com/iot-sitewise/latest/userguide/tag-resources.html)
     * in the *AWS IoT SiteWise User Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iotsitewise-project.html#cfn-iotsitewise-project-tags)
     *
     * @param tags A list of key-value pairs that contain metadata for the project.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    public fun build(): CfnProject {
        if (_assetIds.isNotEmpty()) cdkBuilder.assetIds(_assetIds)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
