@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.comprehend

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnFlywheel`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.comprehend.*;
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
public interface CfnFlywheelProps {
  /**
   * The Amazon Resource Number (ARN) of the active model version.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-activemodelarn)
   */
  public fun activeModelArn(): String? = unwrap(this).getActiveModelArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to
   * access the flywheel data.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-dataaccessrolearn)
   */
  public fun dataAccessRoleArn(): String

  /**
   * Amazon S3 URI of the data lake location.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datalakes3uri)
   */
  public fun dataLakeS3Uri(): String

  /**
   * Data security configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
   */
  public fun dataSecurityConfig(): Any? = unwrap(this).getDataSecurityConfig()

  /**
   * Name for the flywheel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-flywheelname)
   */
  public fun flywheelName(): String

  /**
   * Model type of the flywheel's model.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-modeltype)
   */
  public fun modelType(): String? = unwrap(this).getModelType()

  /**
   * Tags associated with the endpoint being created.
   *
   * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
   * as the key might be added to an endpoint to indicate its use by the sales department.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Configuration about the model associated with a flywheel.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
   */
  public fun taskConfig(): Any? = unwrap(this).getTaskConfig()

  /**
   * A builder for [CfnFlywheelProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param activeModelArn The Amazon Resource Number (ARN) of the active model version.
     */
    public fun activeModelArn(activeModelArn: String)

    /**
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data. 
     */
    public fun dataAccessRoleArn(dataAccessRoleArn: String)

    /**
     * @param dataLakeS3Uri Amazon S3 URI of the data lake location. 
     */
    public fun dataLakeS3Uri(dataLakeS3Uri: String)

    /**
     * @param dataSecurityConfig Data security configuration.
     */
    public fun dataSecurityConfig(dataSecurityConfig: IResolvable)

    /**
     * @param dataSecurityConfig Data security configuration.
     */
    public fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty)

    /**
     * @param dataSecurityConfig Data security configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f18de2912081bb4e7a28dc7d6104e9981ab7a6ce1da1fc281d32971aa37b8ba")
    public
        fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty.Builder.() -> Unit)

    /**
     * @param flywheelName Name for the flywheel. 
     */
    public fun flywheelName(flywheelName: String)

    /**
     * @param modelType Model type of the flywheel's model.
     */
    public fun modelType(modelType: String)

    /**
     * @param tags Tags associated with the endpoint being created.
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Tags associated with the endpoint being created.
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    public fun taskConfig(taskConfig: IResolvable)

    /**
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    public fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty)

    /**
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65d278bec051cfcb9344fe0b5f7a5e05eab667458ae6963dc2e118848bf9009d")
    public fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.comprehend.CfnFlywheelProps.Builder =
        software.amazon.awscdk.services.comprehend.CfnFlywheelProps.builder()

    /**
     * @param activeModelArn The Amazon Resource Number (ARN) of the active model version.
     */
    override fun activeModelArn(activeModelArn: String) {
      cdkBuilder.activeModelArn(activeModelArn)
    }

    /**
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data. 
     */
    override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    /**
     * @param dataLakeS3Uri Amazon S3 URI of the data lake location. 
     */
    override fun dataLakeS3Uri(dataLakeS3Uri: String) {
      cdkBuilder.dataLakeS3Uri(dataLakeS3Uri)
    }

    /**
     * @param dataSecurityConfig Data security configuration.
     */
    override fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param dataSecurityConfig Data security configuration.
     */
    override fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(CfnFlywheel.DataSecurityConfigProperty.Companion::unwrap))
    }

    /**
     * @param dataSecurityConfig Data security configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4f18de2912081bb4e7a28dc7d6104e9981ab7a6ce1da1fc281d32971aa37b8ba")
    override
        fun dataSecurityConfig(dataSecurityConfig: CfnFlywheel.DataSecurityConfigProperty.Builder.() -> Unit):
        Unit = dataSecurityConfig(CfnFlywheel.DataSecurityConfigProperty(dataSecurityConfig))

    /**
     * @param flywheelName Name for the flywheel. 
     */
    override fun flywheelName(flywheelName: String) {
      cdkBuilder.flywheelName(flywheelName)
    }

    /**
     * @param modelType Model type of the flywheel's model.
     */
    override fun modelType(modelType: String) {
      cdkBuilder.modelType(modelType)
    }

    /**
     * @param tags Tags associated with the endpoint being created.
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags Tags associated with the endpoint being created.
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    override fun taskConfig(taskConfig: IResolvable) {
      cdkBuilder.taskConfig(taskConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    override fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty) {
      cdkBuilder.taskConfig(taskConfig.let(CfnFlywheel.TaskConfigProperty.Companion::unwrap))
    }

    /**
     * @param taskConfig Configuration about the model associated with a flywheel.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("65d278bec051cfcb9344fe0b5f7a5e05eab667458ae6963dc2e118848bf9009d")
    override fun taskConfig(taskConfig: CfnFlywheel.TaskConfigProperty.Builder.() -> Unit): Unit =
        taskConfig(CfnFlywheel.TaskConfigProperty(taskConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheelProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheelProps,
  ) : CdkObject(cdkObject),
      CfnFlywheelProps {
    /**
     * The Amazon Resource Number (ARN) of the active model version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-activemodelarn)
     */
    override fun activeModelArn(): String? = unwrap(this).getActiveModelArn()

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to
     * access the flywheel data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-dataaccessrolearn)
     */
    override fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

    /**
     * Amazon S3 URI of the data lake location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datalakes3uri)
     */
    override fun dataLakeS3Uri(): String = unwrap(this).getDataLakeS3Uri()

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     */
    override fun dataSecurityConfig(): Any? = unwrap(this).getDataSecurityConfig()

    /**
     * Name for the flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-flywheelname)
     */
    override fun flywheelName(): String = unwrap(this).getFlywheelName()

    /**
     * Model type of the flywheel's model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-modeltype)
     */
    override fun modelType(): String? = unwrap(this).getModelType()

    /**
     * Tags associated with the endpoint being created.
     *
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     */
    override fun taskConfig(): Any? = unwrap(this).getTaskConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnFlywheelProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheelProps):
        CfnFlywheelProps = CdkObjectWrappers.wrap(cdkObject) as? CfnFlywheelProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnFlywheelProps):
        software.amazon.awscdk.services.comprehend.CfnFlywheelProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.comprehend.CfnFlywheelProps
  }
}
