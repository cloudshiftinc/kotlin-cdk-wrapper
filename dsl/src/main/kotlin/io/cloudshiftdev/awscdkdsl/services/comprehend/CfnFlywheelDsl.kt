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
import software.constructs.Construct

/**
 * A flywheel is an AWS resource that orchestrates the ongoing training of a model for custom
 * classification or custom entity recognition.
 *
 * You can create a flywheel to start with an existing trained model, or Comprehend can create and
 * train a new model.
 *
 * When you create the flywheel, Comprehend creates a data lake in your account. The data lake holds
 * the training data and test data for all versions of the model.
 *
 * To use a flywheel with an existing trained model, you specify the active model version.
 * Comprehend copies the model's training data and test data into the flywheel's data lake.
 *
 * To use the flywheel with a new model, you need to provide a dataset for training data (and
 * optional test data) when you create the flywheel.
 *
 * For more information about flywheels, see
 * [Flywheel overview](https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html) in the
 * *Amazon Comprehend Developer Guide* .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.comprehend.*;
 * CfnFlywheel cfnFlywheel = CfnFlywheel.Builder.create(this, "MyCfnFlywheel")
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
public class CfnFlywheelDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFlywheel.Builder = CfnFlywheel.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The Amazon Resource Number (ARN) of the active model version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-activemodelarn)
     *
     * @param activeModelArn The Amazon Resource Number (ARN) of the active model version.
     */
    public fun activeModelArn(activeModelArn: String) {
        cdkBuilder.activeModelArn(activeModelArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to
     * access the flywheel data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-dataaccessrolearn)
     *
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     *   Comprehend permission to access the flywheel data.
     */
    public fun dataAccessRoleArn(dataAccessRoleArn: String) {
        cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    /**
     * Amazon S3 URI of the data lake location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datalakes3uri)
     *
     * @param dataLakeS3Uri Amazon S3 URI of the data lake location.
     */
    public fun dataLakeS3Uri(dataLakeS3Uri: String) {
        cdkBuilder.dataLakeS3Uri(dataLakeS3Uri)
    }

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     *
     * @param dataSecurityConfig Data security configuration.
     */
    public fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
        cdkBuilder.dataSecurityConfig(dataSecurityConfig)
    }

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     *
     * @param dataSecurityConfig Data security configuration.
     */
    public fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty) {
        cdkBuilder.dataSecurityConfig(dataSecurityConfig)
    }

    /**
     * Name for the flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-flywheelname)
     *
     * @param flywheelName Name for the flywheel.
     */
    public fun flywheelName(flywheelName: String) {
        cdkBuilder.flywheelName(flywheelName)
    }

    /**
     * Model type of the flywheel's model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-modeltype)
     *
     * @param modelType Model type of the flywheel's model.
     */
    public fun modelType(modelType: String) {
        cdkBuilder.modelType(modelType)
    }

    /**
     * Tags associated with the endpoint being created.
     *
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
     *
     * @param tags Tags associated with the endpoint being created.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Tags associated with the endpoint being created.
     *
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
     *
     * @param tags Tags associated with the endpoint being created.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     *
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    public fun taskConfig(taskConfig: IResolvable) {
        cdkBuilder.taskConfig(taskConfig)
    }

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     *
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    public fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty) {
        cdkBuilder.taskConfig(taskConfig)
    }

    public fun build(): CfnFlywheel {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
