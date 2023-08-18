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
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

/**
 * Settings for a local volume resource, which represents a file or directory on the root file
 * system.
 *
 * For more information, see
 * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-local-resources.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, `LocalVolumeResourceData` can be used in the
 * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionLocalVolumeResourceDataPropertyDsl {
    private val cdkBuilder: CfnResourceDefinition.LocalVolumeResourceDataProperty.Builder =
        CfnResourceDefinition.LocalVolumeResourceDataProperty.builder()

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
        groupOwnerSetting: CfnResourceDefinition.GroupOwnerSettingProperty
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

    public fun build(): CfnResourceDefinition.LocalVolumeResourceDataProperty = cdkBuilder.build()
}
