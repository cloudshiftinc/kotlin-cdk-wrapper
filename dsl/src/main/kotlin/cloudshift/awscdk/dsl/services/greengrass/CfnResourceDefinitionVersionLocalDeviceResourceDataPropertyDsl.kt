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

package cloudshift.awscdk.dsl.services.greengrass

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion

/**
 * Settings for a local device resource, which represents a file under `/dev` .
 *
 * For more information, see
 * [Access Local Resources with Lambda Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-local-resources.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, `LocalDeviceResourceData` can be used in the
 * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
 * property type.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * LocalDeviceResourceDataProperty localDeviceResourceDataProperty =
 * LocalDeviceResourceDataProperty.builder()
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
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionVersionLocalDeviceResourceDataPropertyDsl {
    private val cdkBuilder: CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.Builder =
        CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.builder()

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
     * @param sourcePath The local absolute path of the device resource. The source path for a
     *   device resource can refer only to a character device or block device under `/dev` .
     */
    public fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
    }

    public fun build(): CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty =
        cdkBuilder.build()
}
