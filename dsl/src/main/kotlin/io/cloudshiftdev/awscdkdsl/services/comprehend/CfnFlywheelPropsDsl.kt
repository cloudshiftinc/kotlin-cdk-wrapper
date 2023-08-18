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

package io.cloudshiftdev.awscdkdsl.services.comprehend

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.comprehend.CfnFlywheel
import software.amazon.awscdk.services.comprehend.CfnFlywheelProps

/**
 * Properties for defining a `CfnFlywheel`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
 * CfnFlywheelProps cfnFlywheelProps = CfnFlywheelProps.builder()
 * .dataAccessRoleArn("dataAccessRoleArn")
 * .dataLakeS3Uri("dataLakeS3Uri")
 * .flywheelName("flywheelName")
 * // the properties below are optional
 * .activeModelArn("activeModelArn")
 * .dataSecurityConfig(DataSecurityConfigProperty.builder()
 * .dataLakeKmsKeyId("dataLakeKmsKeyId")
 * .modelKmsKeyId("modelKmsKeyId")
 * .volumeKmsKeyId("volumeKmsKeyId")
 * .vpcConfig(VpcConfigProperty.builder()
 * .securityGroupIds(List.of("securityGroupIds"))
 * .subnets(List.of("subnets"))
 * .build())
 * .build())
 * .modelType("modelType")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .taskConfig(TaskConfigProperty.builder()
 * .languageCode("languageCode")
 * // the properties below are optional
 * .documentClassificationConfig(DocumentClassificationConfigProperty.builder()
 * .mode("mode")
 * // the properties below are optional
 * .labels(List.of("labels"))
 * .build())
 * .entityRecognitionConfig(EntityRecognitionConfigProperty.builder()
 * .entityTypes(List.of(EntityTypesListItemProperty.builder()
 * .type("type")
 * .build()))
 * .build())
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html)
 */
@CdkDslMarker
public class CfnFlywheelPropsDsl {
    private val cdkBuilder: CfnFlywheelProps.Builder = CfnFlywheelProps.builder()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /** @param activeModelArn The Amazon Resource Number (ARN) of the active model version. */
    public fun activeModelArn(activeModelArn: String) {
        cdkBuilder.activeModelArn(activeModelArn)
    }

    /**
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     *   Comprehend permission to access the flywheel data.
     */
    public fun dataAccessRoleArn(dataAccessRoleArn: String) {
        cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    /** @param dataLakeS3Uri Amazon S3 URI of the data lake location. */
    public fun dataLakeS3Uri(dataLakeS3Uri: String) {
        cdkBuilder.dataLakeS3Uri(dataLakeS3Uri)
    }

    /** @param dataSecurityConfig Data security configuration. */
    public fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
        cdkBuilder.dataSecurityConfig(dataSecurityConfig)
    }

    /** @param dataSecurityConfig Data security configuration. */
    public fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty) {
        cdkBuilder.dataSecurityConfig(dataSecurityConfig)
    }

    /** @param flywheelName Name for the flywheel. */
    public fun flywheelName(flywheelName: String) {
        cdkBuilder.flywheelName(flywheelName)
    }

    /** @param modelType Model type of the flywheel's model. */
    public fun modelType(modelType: String) {
        cdkBuilder.modelType(modelType)
    }

    /**
     * @param tags Tags associated with the endpoint being created. A tag is a key-value pair that
     *   adds metadata to the endpoint. For example, a tag with "Sales" as the key might be added to
     *   an endpoint to indicate its use by the sales department.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * @param tags Tags associated with the endpoint being created. A tag is a key-value pair that
     *   adds metadata to the endpoint. For example, a tag with "Sales" as the key might be added to
     *   an endpoint to indicate its use by the sales department.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /** @param taskConfig Configuration about the model associated with a flywheel. */
    public fun taskConfig(taskConfig: IResolvable) {
        cdkBuilder.taskConfig(taskConfig)
    }

    /** @param taskConfig Configuration about the model associated with a flywheel. */
    public fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty) {
        cdkBuilder.taskConfig(taskConfig)
    }

    public fun build(): CfnFlywheelProps {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
