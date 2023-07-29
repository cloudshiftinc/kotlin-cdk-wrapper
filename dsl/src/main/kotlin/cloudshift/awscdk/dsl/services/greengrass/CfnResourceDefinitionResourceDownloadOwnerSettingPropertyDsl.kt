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
import software.amazon.awscdk.services.greengrass.CfnResourceDefinition

/**
 * The owner setting for a downloaded machine learning resource.
 *
 * For more information, see
 * [Access Machine Learning Resources from Lambda Functions](https://docs.aws.amazon.com/greengrass/latest/developerguide/access-ml-resources.html)
 * in the *Developer Guide* .
 *
 * In an AWS CloudFormation template, `ResourceDownloadOwnerSetting` is the property type of the
 * `OwnerSetting` property for the
 * [`S3MachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html)
 * and
 * [`SageMakerMachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html)
 * property types.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.greengrass.*;
 * ResourceDownloadOwnerSettingProperty resourceDownloadOwnerSettingProperty =
 * ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedownloadownersetting.html)
 */
@CdkDslMarker
public class CfnResourceDefinitionResourceDownloadOwnerSettingPropertyDsl {
    private val cdkBuilder: CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.Builder =
        CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.builder()

    /**
     * @param groupOwner The group owner of the machine learning resource. This is the group ID
     *   (GID) of an existing Linux OS group on the system. The group's permissions are added to the
     *   Lambda process.
     */
    public fun groupOwner(groupOwner: String) {
        cdkBuilder.groupOwner(groupOwner)
    }

    /**
     * @param groupPermission The permissions that the group owner has to the machine learning
     *   resource. Valid values are `rw` (read-write) or `ro` (read-only).
     */
    public fun groupPermission(groupPermission: String) {
        cdkBuilder.groupPermission(groupPermission)
    }

    public fun build(): CfnResourceDefinition.ResourceDownloadOwnerSettingProperty =
        cdkBuilder.build()
}
