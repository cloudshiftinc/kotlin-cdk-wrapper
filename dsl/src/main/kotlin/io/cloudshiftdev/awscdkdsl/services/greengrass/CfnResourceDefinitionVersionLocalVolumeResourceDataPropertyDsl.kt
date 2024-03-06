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

package io.cloudshiftdev.awscdkdsl.services.greengrass

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

/**
 * Settings for a local volume resource, which represents a file or directory on the root file
 * system.
 *
 * For more information, see
 * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, `LocalVolumeResourceData` can be used in the
 * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * LocalVolumeResourceDataProperty localVolumeResourceDataProperty =
 * LocalVolumeResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionVersionLocalVolumeResourceDataPropertyDsl {
    private val cdkBuilder: CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.builder()

    /** @param destinationPath The absolute local path of the resource in the Lambda environment. */
    public fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
    }

    /**
     * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
     *   to the Lambda function process.
     */
    public fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting)
    }

    /**
     * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
     *   to the Lambda function process.
     */
    public fun groupOwnerSetting(
        groupOwnerSetting: CfnResourceDefinitionVersion.GroupOwnerSettingProperty
    ) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting)
    }

    /**
     * @param sourcePath The local absolute path of the volume resource on the host. The source path
     *   for a volume resource type cannot start with `/sys` .
     */
    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty =
        cdkBuilder.build()
}
