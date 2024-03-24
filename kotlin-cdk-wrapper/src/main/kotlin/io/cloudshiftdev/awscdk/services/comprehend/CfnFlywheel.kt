@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.comprehend

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

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
 * For more information about flywheels, see [Flywheel
 * overview](https://docs.aws.amazon.com/comprehend/latest/dg/flywheels-about.html) in the *Amazon
 * Comprehend Developer Guide* .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.comprehend.*;
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
public open class CfnFlywheel(
  cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlywheelProps,
  ) :
      this(software.amazon.awscdk.services.comprehend.CfnFlywheel(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnFlywheelProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnFlywheelProps.Builder.() -> Unit,
  ) : this(scope, id, CfnFlywheelProps(props)
  )

  /**
   * The Amazon Resource Number (ARN) of the active model version.
   */
  public open fun activeModelArn(): String? = unwrap(this).getActiveModelArn()

  /**
   * The Amazon Resource Number (ARN) of the active model version.
   */
  public open fun activeModelArn(`value`: String) {
    unwrap(this).setActiveModelArn(`value`)
  }

  /**
   * The Amazon Resource Name (ARN) of the flywheel.
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to
   * access the flywheel data.
   */
  public open fun dataAccessRoleArn(): String = unwrap(this).getDataAccessRoleArn()

  /**
   * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to
   * access the flywheel data.
   */
  public open fun dataAccessRoleArn(`value`: String) {
    unwrap(this).setDataAccessRoleArn(`value`)
  }

  /**
   * Amazon S3 URI of the data lake location.
   */
  public open fun dataLakeS3Uri(): String = unwrap(this).getDataLakeS3Uri()

  /**
   * Amazon S3 URI of the data lake location.
   */
  public open fun dataLakeS3Uri(`value`: String) {
    unwrap(this).setDataLakeS3Uri(`value`)
  }

  /**
   * Data security configuration.
   */
  public open fun dataSecurityConfig(): Any? = unwrap(this).getDataSecurityConfig()

  /**
   * Data security configuration.
   */
  public open fun dataSecurityConfig(`value`: IResolvable) {
    unwrap(this).setDataSecurityConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Data security configuration.
   */
  public open fun dataSecurityConfig(`value`: DataSecurityConfigProperty) {
    unwrap(this).setDataSecurityConfig(`value`.let(DataSecurityConfigProperty::unwrap))
  }

  /**
   * Data security configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("60652ba424b85a3c687981540d3f45905b9e0b96d495ae072544b99069c8f270")
  public open fun dataSecurityConfig(`value`: DataSecurityConfigProperty.Builder.() -> Unit): Unit =
      dataSecurityConfig(DataSecurityConfigProperty(`value`))

  /**
   * Name for the flywheel.
   */
  public open fun flywheelName(): String = unwrap(this).getFlywheelName()

  /**
   * Name for the flywheel.
   */
  public open fun flywheelName(`value`: String) {
    unwrap(this).setFlywheelName(`value`)
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * Model type of the flywheel's model.
   */
  public open fun modelType(): String? = unwrap(this).getModelType()

  /**
   * Model type of the flywheel's model.
   */
  public open fun modelType(`value`: String) {
    unwrap(this).setModelType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Tags associated with the endpoint being created.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Tags associated with the endpoint being created.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Tags associated with the endpoint being created.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Configuration about the model associated with a flywheel.
   */
  public open fun taskConfig(): Any? = unwrap(this).getTaskConfig()

  /**
   * Configuration about the model associated with a flywheel.
   */
  public open fun taskConfig(`value`: IResolvable) {
    unwrap(this).setTaskConfig(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configuration about the model associated with a flywheel.
   */
  public open fun taskConfig(`value`: TaskConfigProperty) {
    unwrap(this).setTaskConfig(`value`.let(TaskConfigProperty::unwrap))
  }

  /**
   * Configuration about the model associated with a flywheel.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("0e575999d6de8e815b6c32561d2bbcd2405ab783115eaf417cee20f32b680078")
  public open fun taskConfig(`value`: TaskConfigProperty.Builder.() -> Unit): Unit =
      taskConfig(TaskConfigProperty(`value`))

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.comprehend.CfnFlywheel].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The Amazon Resource Number (ARN) of the active model version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-activemodelarn)
     * @param activeModelArn The Amazon Resource Number (ARN) of the active model version. 
     */
    public fun activeModelArn(activeModelArn: String)

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to
     * access the flywheel data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-dataaccessrolearn)
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data. 
     */
    public fun dataAccessRoleArn(dataAccessRoleArn: String)

    /**
     * Amazon S3 URI of the data lake location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datalakes3uri)
     * @param dataLakeS3Uri Amazon S3 URI of the data lake location. 
     */
    public fun dataLakeS3Uri(dataLakeS3Uri: String)

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     * @param dataSecurityConfig Data security configuration. 
     */
    public fun dataSecurityConfig(dataSecurityConfig: IResolvable)

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     * @param dataSecurityConfig Data security configuration. 
     */
    public fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty)

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     * @param dataSecurityConfig Data security configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e8a9bad11909e847082d3e9f601041c2aedd678201044b663f0719e9ac320")
    public fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty.Builder.() -> Unit)

    /**
     * Name for the flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-flywheelname)
     * @param flywheelName Name for the flywheel. 
     */
    public fun flywheelName(flywheelName: String)

    /**
     * Model type of the flywheel's model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-modeltype)
     * @param modelType Model type of the flywheel's model. 
     */
    public fun modelType(modelType: String)

    /**
     * Tags associated with the endpoint being created.
     *
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
     * @param tags Tags associated with the endpoint being created. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Tags associated with the endpoint being created.
     *
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
     * @param tags Tags associated with the endpoint being created. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     * @param taskConfig Configuration about the model associated with a flywheel. 
     */
    public fun taskConfig(taskConfig: IResolvable)

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     * @param taskConfig Configuration about the model associated with a flywheel. 
     */
    public fun taskConfig(taskConfig: TaskConfigProperty)

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     * @param taskConfig Configuration about the model associated with a flywheel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09eba78f68059042ae50f73fa7f01f04f82c002aaa4e6cd375b73157c78bcd11")
    public fun taskConfig(taskConfig: TaskConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.comprehend.CfnFlywheel.Builder =
        software.amazon.awscdk.services.comprehend.CfnFlywheel.Builder.create(scope, id)

    /**
     * The Amazon Resource Number (ARN) of the active model version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-activemodelarn)
     * @param activeModelArn The Amazon Resource Number (ARN) of the active model version. 
     */
    override fun activeModelArn(activeModelArn: String) {
      cdkBuilder.activeModelArn(activeModelArn)
    }

    /**
     * The Amazon Resource Name (ARN) of the IAM role that grants Amazon Comprehend permission to
     * access the flywheel data.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-dataaccessrolearn)
     * @param dataAccessRoleArn The Amazon Resource Name (ARN) of the IAM role that grants Amazon
     * Comprehend permission to access the flywheel data. 
     */
    override fun dataAccessRoleArn(dataAccessRoleArn: String) {
      cdkBuilder.dataAccessRoleArn(dataAccessRoleArn)
    }

    /**
     * Amazon S3 URI of the data lake location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datalakes3uri)
     * @param dataLakeS3Uri Amazon S3 URI of the data lake location. 
     */
    override fun dataLakeS3Uri(dataLakeS3Uri: String) {
      cdkBuilder.dataLakeS3Uri(dataLakeS3Uri)
    }

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     * @param dataSecurityConfig Data security configuration. 
     */
    override fun dataSecurityConfig(dataSecurityConfig: IResolvable) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(IResolvable::unwrap))
    }

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     * @param dataSecurityConfig Data security configuration. 
     */
    override fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty) {
      cdkBuilder.dataSecurityConfig(dataSecurityConfig.let(DataSecurityConfigProperty::unwrap))
    }

    /**
     * Data security configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-datasecurityconfig)
     * @param dataSecurityConfig Data security configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("817e8a9bad11909e847082d3e9f601041c2aedd678201044b663f0719e9ac320")
    override
        fun dataSecurityConfig(dataSecurityConfig: DataSecurityConfigProperty.Builder.() -> Unit):
        Unit = dataSecurityConfig(DataSecurityConfigProperty(dataSecurityConfig))

    /**
     * Name for the flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-flywheelname)
     * @param flywheelName Name for the flywheel. 
     */
    override fun flywheelName(flywheelName: String) {
      cdkBuilder.flywheelName(flywheelName)
    }

    /**
     * Model type of the flywheel's model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-modeltype)
     * @param modelType Model type of the flywheel's model. 
     */
    override fun modelType(modelType: String) {
      cdkBuilder.modelType(modelType)
    }

    /**
     * Tags associated with the endpoint being created.
     *
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
     * @param tags Tags associated with the endpoint being created. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Tags associated with the endpoint being created.
     *
     * A tag is a key-value pair that adds metadata to the endpoint. For example, a tag with "Sales"
     * as the key might be added to an endpoint to indicate its use by the sales department.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-tags)
     * @param tags Tags associated with the endpoint being created. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     * @param taskConfig Configuration about the model associated with a flywheel. 
     */
    override fun taskConfig(taskConfig: IResolvable) {
      cdkBuilder.taskConfig(taskConfig.let(IResolvable::unwrap))
    }

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     * @param taskConfig Configuration about the model associated with a flywheel. 
     */
    override fun taskConfig(taskConfig: TaskConfigProperty) {
      cdkBuilder.taskConfig(taskConfig.let(TaskConfigProperty::unwrap))
    }

    /**
     * Configuration about the model associated with a flywheel.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-comprehend-flywheel.html#cfn-comprehend-flywheel-taskconfig)
     * @param taskConfig Configuration about the model associated with a flywheel. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("09eba78f68059042ae50f73fa7f01f04f82c002aaa4e6cd375b73157c78bcd11")
    override fun taskConfig(taskConfig: TaskConfigProperty.Builder.() -> Unit): Unit =
        taskConfig(TaskConfigProperty(taskConfig))

    public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheel = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.comprehend.CfnFlywheel.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnFlywheel {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnFlywheel(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel):
        CfnFlywheel = CfnFlywheel(cdkObject)

    internal fun unwrap(wrapped: CfnFlywheel):
        software.amazon.awscdk.services.comprehend.CfnFlywheel = wrapped.cdkObject as
        software.amazon.awscdk.services.comprehend.CfnFlywheel
  }

  /**
   * Data security configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * DataSecurityConfigProperty dataSecurityConfigProperty = DataSecurityConfigProperty.builder()
   * .dataLakeKmsKeyId("dataLakeKmsKeyId")
   * .modelKmsKeyId("modelKmsKeyId")
   * .volumeKmsKeyId("volumeKmsKeyId")
   * .vpcConfig(VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html)
   */
  public interface DataSecurityConfigProperty {
    /**
     * ID for the AWS KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-datalakekmskeyid)
     */
    public fun dataLakeKmsKeyId(): String? = unwrap(this).getDataLakeKmsKeyId()

    /**
     * ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained custom models.
     *
     * The ModelKmsKeyId can be either of the following formats:
     *
     * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
     * * Amazon Resource Name (ARN) of a KMS Key:
     * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-modelkmskeyid)
     */
    public fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

    /**
     * ID for the AWS KMS key that Amazon Comprehend uses to encrypt the volume.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-volumekmskeyid)
     */
    public fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

    /**
     * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the
     * resources you are using for the job.
     *
     * For more information, see [Amazon
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-vpcconfig)
     */
    public fun vpcConfig(): Any? = unwrap(this).getVpcConfig()

    /**
     * A builder for [DataSecurityConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param dataLakeKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt the
       * data in the data lake.
       */
      public fun dataLakeKmsKeyId(dataLakeKmsKeyId: String)

      /**
       * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
       * custom models.
       * The ModelKmsKeyId can be either of the following formats:
       *
       * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * Amazon Resource Name (ARN) of a KMS Key:
       * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
       */
      public fun modelKmsKeyId(modelKmsKeyId: String)

      /**
       * @param volumeKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt the
       * volume.
       */
      public fun volumeKmsKeyId(volumeKmsKeyId: String)

      /**
       * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud
       * (VPC) containing the resources you are using for the job.
       * For more information, see [Amazon
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
       */
      public fun vpcConfig(vpcConfig: IResolvable)

      /**
       * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud
       * (VPC) containing the resources you are using for the job.
       * For more information, see [Amazon
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
       */
      public fun vpcConfig(vpcConfig: VpcConfigProperty)

      /**
       * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud
       * (VPC) containing the resources you are using for the job.
       * For more information, see [Amazon
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad6014fdcd8de69b64beb8facb1fb63a7f13a50ee6e082c13819782318101c13")
      public fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty.builder()

      /**
       * @param dataLakeKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt the
       * data in the data lake.
       */
      override fun dataLakeKmsKeyId(dataLakeKmsKeyId: String) {
        cdkBuilder.dataLakeKmsKeyId(dataLakeKmsKeyId)
      }

      /**
       * @param modelKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained
       * custom models.
       * The ModelKmsKeyId can be either of the following formats:
       *
       * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * Amazon Resource Name (ARN) of a KMS Key:
       * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
       */
      override fun modelKmsKeyId(modelKmsKeyId: String) {
        cdkBuilder.modelKmsKeyId(modelKmsKeyId)
      }

      /**
       * @param volumeKmsKeyId ID for the AWS KMS key that Amazon Comprehend uses to encrypt the
       * volume.
       */
      override fun volumeKmsKeyId(volumeKmsKeyId: String) {
        cdkBuilder.volumeKmsKeyId(volumeKmsKeyId)
      }

      /**
       * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud
       * (VPC) containing the resources you are using for the job.
       * For more information, see [Amazon
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
       */
      override fun vpcConfig(vpcConfig: IResolvable) {
        cdkBuilder.vpcConfig(vpcConfig.let(IResolvable::unwrap))
      }

      /**
       * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud
       * (VPC) containing the resources you are using for the job.
       * For more information, see [Amazon
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
       */
      override fun vpcConfig(vpcConfig: VpcConfigProperty) {
        cdkBuilder.vpcConfig(vpcConfig.let(VpcConfigProperty::unwrap))
      }

      /**
       * @param vpcConfig Configuration parameters for an optional private Virtual Private Cloud
       * (VPC) containing the resources you are using for the job.
       * For more information, see [Amazon
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("ad6014fdcd8de69b64beb8facb1fb63a7f13a50ee6e082c13819782318101c13")
      override fun vpcConfig(vpcConfig: VpcConfigProperty.Builder.() -> Unit): Unit =
          vpcConfig(VpcConfigProperty(vpcConfig))

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty,
    ) : CdkObject(cdkObject), DataSecurityConfigProperty {
      /**
       * ID for the AWS KMS key that Amazon Comprehend uses to encrypt the data in the data lake.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-datalakekmskeyid)
       */
      override fun dataLakeKmsKeyId(): String? = unwrap(this).getDataLakeKmsKeyId()

      /**
       * ID for the AWS KMS key that Amazon Comprehend uses to encrypt trained custom models.
       *
       * The ModelKmsKeyId can be either of the following formats:
       *
       * * KMS Key ID: `"1234abcd-12ab-34cd-56ef-1234567890ab"`
       * * Amazon Resource Name (ARN) of a KMS Key:
       * `"arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab"`
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-modelkmskeyid)
       */
      override fun modelKmsKeyId(): String? = unwrap(this).getModelKmsKeyId()

      /**
       * ID for the AWS KMS key that Amazon Comprehend uses to encrypt the volume.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-volumekmskeyid)
       */
      override fun volumeKmsKeyId(): String? = unwrap(this).getVolumeKmsKeyId()

      /**
       * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the
       * resources you are using for the job.
       *
       * For more information, see [Amazon
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-datasecurityconfig.html#cfn-comprehend-flywheel-datasecurityconfig-vpcconfig)
       */
      override fun vpcConfig(): Any? = unwrap(this).getVpcConfig()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DataSecurityConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty):
          DataSecurityConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DataSecurityConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DataSecurityConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DataSecurityConfigProperty
    }
  }

  /**
   * Configuration required for a document classification model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * DocumentClassificationConfigProperty documentClassificationConfigProperty =
   * DocumentClassificationConfigProperty.builder()
   * .mode("mode")
   * // the properties below are optional
   * .labels(List.of("labels"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-documentclassificationconfig.html)
   */
  public interface DocumentClassificationConfigProperty {
    /**
     * One or more labels to associate with the custom classifier.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-documentclassificationconfig.html#cfn-comprehend-flywheel-documentclassificationconfig-labels)
     */
    public fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

    /**
     * Classification mode indicates whether the documents are `MULTI_CLASS` or `MULTI_LABEL` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-documentclassificationconfig.html#cfn-comprehend-flywheel-documentclassificationconfig-mode)
     */
    public fun mode(): String

    /**
     * A builder for [DocumentClassificationConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param labels One or more labels to associate with the custom classifier.
       */
      public fun labels(labels: List<String>)

      /**
       * @param labels One or more labels to associate with the custom classifier.
       */
      public fun labels(vararg labels: String)

      /**
       * @param mode Classification mode indicates whether the documents are `MULTI_CLASS` or
       * `MULTI_LABEL` . 
       */
      public fun mode(mode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty.builder()

      /**
       * @param labels One or more labels to associate with the custom classifier.
       */
      override fun labels(labels: List<String>) {
        cdkBuilder.labels(labels)
      }

      /**
       * @param labels One or more labels to associate with the custom classifier.
       */
      override fun labels(vararg labels: String): Unit = labels(labels.toList())

      /**
       * @param mode Classification mode indicates whether the documents are `MULTI_CLASS` or
       * `MULTI_LABEL` . 
       */
      override fun mode(mode: String) {
        cdkBuilder.mode(mode)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty,
    ) : CdkObject(cdkObject), DocumentClassificationConfigProperty {
      /**
       * One or more labels to associate with the custom classifier.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-documentclassificationconfig.html#cfn-comprehend-flywheel-documentclassificationconfig-labels)
       */
      override fun labels(): List<String> = unwrap(this).getLabels() ?: emptyList()

      /**
       * Classification mode indicates whether the documents are `MULTI_CLASS` or `MULTI_LABEL` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-documentclassificationconfig.html#cfn-comprehend-flywheel-documentclassificationconfig-mode)
       */
      override fun mode(): String = unwrap(this).getMode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          DocumentClassificationConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty):
          DocumentClassificationConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          DocumentClassificationConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: DocumentClassificationConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnFlywheel.DocumentClassificationConfigProperty
    }
  }

  /**
   * Configuration required for an entity recognition model.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * EntityRecognitionConfigProperty entityRecognitionConfigProperty =
   * EntityRecognitionConfigProperty.builder()
   * .entityTypes(List.of(EntityTypesListItemProperty.builder()
   * .type("type")
   * .build()))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entityrecognitionconfig.html)
   */
  public interface EntityRecognitionConfigProperty {
    /**
     * Up to 25 entity types that the model is trained to recognize.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entityrecognitionconfig.html#cfn-comprehend-flywheel-entityrecognitionconfig-entitytypes)
     */
    public fun entityTypes(): Any? = unwrap(this).getEntityTypes()

    /**
     * A builder for [EntityRecognitionConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param entityTypes Up to 25 entity types that the model is trained to recognize.
       */
      public fun entityTypes(entityTypes: IResolvable)

      /**
       * @param entityTypes Up to 25 entity types that the model is trained to recognize.
       */
      public fun entityTypes(entityTypes: List<Any>)

      /**
       * @param entityTypes Up to 25 entity types that the model is trained to recognize.
       */
      public fun entityTypes(vararg entityTypes: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty.builder()

      /**
       * @param entityTypes Up to 25 entity types that the model is trained to recognize.
       */
      override fun entityTypes(entityTypes: IResolvable) {
        cdkBuilder.entityTypes(entityTypes.let(IResolvable::unwrap))
      }

      /**
       * @param entityTypes Up to 25 entity types that the model is trained to recognize.
       */
      override fun entityTypes(entityTypes: List<Any>) {
        cdkBuilder.entityTypes(entityTypes.map{CdkObjectWrappers.unwrap(it)})
      }

      /**
       * @param entityTypes Up to 25 entity types that the model is trained to recognize.
       */
      override fun entityTypes(vararg entityTypes: Any): Unit = entityTypes(entityTypes.toList())

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty,
    ) : CdkObject(cdkObject), EntityRecognitionConfigProperty {
      /**
       * Up to 25 entity types that the model is trained to recognize.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entityrecognitionconfig.html#cfn-comprehend-flywheel-entityrecognitionconfig-entitytypes)
       */
      override fun entityTypes(): Any? = unwrap(this).getEntityTypes()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EntityRecognitionConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty):
          EntityRecognitionConfigProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EntityRecognitionConfigProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityRecognitionConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityRecognitionConfigProperty
    }
  }

  /**
   * An entity type within a labeled training dataset that Amazon Comprehend uses to train a custom
   * entity recognizer.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * EntityTypesListItemProperty entityTypesListItemProperty = EntityTypesListItemProperty.builder()
   * .type("type")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entitytypeslistitem.html)
   */
  public interface EntityTypesListItemProperty {
    /**
     * An entity type within a labeled training dataset that Amazon Comprehend uses to train a
     * custom entity recognizer.
     *
     * Entity types must not contain the following invalid characters: \n (line break), \n (escaped
     * line break, \r (carriage return), \r (escaped carriage return), \t (tab), \t (escaped tab), and
     * , (comma).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entitytypeslistitem.html#cfn-comprehend-flywheel-entitytypeslistitem-type)
     */
    public fun type(): String

    /**
     * A builder for [EntityTypesListItemProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param type An entity type within a labeled training dataset that Amazon Comprehend uses to
       * train a custom entity recognizer. 
       * Entity types must not contain the following invalid characters: \n (line break), \n
       * (escaped line break, \r (carriage return), \r (escaped carriage return), \t (tab), \t (escaped
       * tab), and , (comma).
       */
      public fun type(type: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty.Builder
          =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty.builder()

      /**
       * @param type An entity type within a labeled training dataset that Amazon Comprehend uses to
       * train a custom entity recognizer. 
       * Entity types must not contain the following invalid characters: \n (line break), \n
       * (escaped line break, \r (carriage return), \r (escaped carriage return), \t (tab), \t (escaped
       * tab), and , (comma).
       */
      override fun type(type: String) {
        cdkBuilder.type(type)
      }

      public fun build():
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty,
    ) : CdkObject(cdkObject), EntityTypesListItemProperty {
      /**
       * An entity type within a labeled training dataset that Amazon Comprehend uses to train a
       * custom entity recognizer.
       *
       * Entity types must not contain the following invalid characters: \n (line break), \n
       * (escaped line break, \r (carriage return), \r (escaped carriage return), \t (tab), \t (escaped
       * tab), and , (comma).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-entitytypeslistitem.html#cfn-comprehend-flywheel-entitytypeslistitem-type)
       */
      override fun type(): String = unwrap(this).getType()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): EntityTypesListItemProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty):
          EntityTypesListItemProperty = CdkObjectWrappers.wrap(cdkObject) as?
          EntityTypesListItemProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: EntityTypesListItemProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty =
          (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnFlywheel.EntityTypesListItemProperty
    }
  }

  /**
   * Configuration about the model associated with a flywheel.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * TaskConfigProperty taskConfigProperty = TaskConfigProperty.builder()
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
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html)
   */
  public interface TaskConfigProperty {
    /**
     * Configuration required for a document classification model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html#cfn-comprehend-flywheel-taskconfig-documentclassificationconfig)
     */
    public fun documentClassificationConfig(): Any? = unwrap(this).getDocumentClassificationConfig()

    /**
     * Configuration required for an entity recognition model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html#cfn-comprehend-flywheel-taskconfig-entityrecognitionconfig)
     */
    public fun entityRecognitionConfig(): Any? = unwrap(this).getEntityRecognitionConfig()

    /**
     * Language code for the language that the model supports.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html#cfn-comprehend-flywheel-taskconfig-languagecode)
     */
    public fun languageCode(): String

    /**
     * A builder for [TaskConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param documentClassificationConfig Configuration required for a document classification
       * model.
       */
      public fun documentClassificationConfig(documentClassificationConfig: IResolvable)

      /**
       * @param documentClassificationConfig Configuration required for a document classification
       * model.
       */
      public
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty)

      /**
       * @param documentClassificationConfig Configuration required for a document classification
       * model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c03bf1866fb06a9eeca14958a7d8128b8db4e0beac190da74f07d6dbcd06bd6")
      public
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty.Builder.() -> Unit)

      /**
       * @param entityRecognitionConfig Configuration required for an entity recognition model.
       */
      public fun entityRecognitionConfig(entityRecognitionConfig: IResolvable)

      /**
       * @param entityRecognitionConfig Configuration required for an entity recognition model.
       */
      public fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty)

      /**
       * @param entityRecognitionConfig Configuration required for an entity recognition model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32aff837a53f4deca6be85f3c340a711b900d2b07ea9f545e6ca3bb8527b7538")
      public
          fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty.Builder.() -> Unit)

      /**
       * @param languageCode Language code for the language that the model supports. 
       */
      public fun languageCode(languageCode: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty.Builder =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty.builder()

      /**
       * @param documentClassificationConfig Configuration required for a document classification
       * model.
       */
      override fun documentClassificationConfig(documentClassificationConfig: IResolvable) {
        cdkBuilder.documentClassificationConfig(documentClassificationConfig.let(IResolvable::unwrap))
      }

      /**
       * @param documentClassificationConfig Configuration required for a document classification
       * model.
       */
      override
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty) {
        cdkBuilder.documentClassificationConfig(documentClassificationConfig.let(DocumentClassificationConfigProperty::unwrap))
      }

      /**
       * @param documentClassificationConfig Configuration required for a document classification
       * model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("1c03bf1866fb06a9eeca14958a7d8128b8db4e0beac190da74f07d6dbcd06bd6")
      override
          fun documentClassificationConfig(documentClassificationConfig: DocumentClassificationConfigProperty.Builder.() -> Unit):
          Unit =
          documentClassificationConfig(DocumentClassificationConfigProperty(documentClassificationConfig))

      /**
       * @param entityRecognitionConfig Configuration required for an entity recognition model.
       */
      override fun entityRecognitionConfig(entityRecognitionConfig: IResolvable) {
        cdkBuilder.entityRecognitionConfig(entityRecognitionConfig.let(IResolvable::unwrap))
      }

      /**
       * @param entityRecognitionConfig Configuration required for an entity recognition model.
       */
      override
          fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty) {
        cdkBuilder.entityRecognitionConfig(entityRecognitionConfig.let(EntityRecognitionConfigProperty::unwrap))
      }

      /**
       * @param entityRecognitionConfig Configuration required for an entity recognition model.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("32aff837a53f4deca6be85f3c340a711b900d2b07ea9f545e6ca3bb8527b7538")
      override
          fun entityRecognitionConfig(entityRecognitionConfig: EntityRecognitionConfigProperty.Builder.() -> Unit):
          Unit = entityRecognitionConfig(EntityRecognitionConfigProperty(entityRecognitionConfig))

      /**
       * @param languageCode Language code for the language that the model supports. 
       */
      override fun languageCode(languageCode: String) {
        cdkBuilder.languageCode(languageCode)
      }

      public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty,
    ) : CdkObject(cdkObject), TaskConfigProperty {
      /**
       * Configuration required for a document classification model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html#cfn-comprehend-flywheel-taskconfig-documentclassificationconfig)
       */
      override fun documentClassificationConfig(): Any? =
          unwrap(this).getDocumentClassificationConfig()

      /**
       * Configuration required for an entity recognition model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html#cfn-comprehend-flywheel-taskconfig-entityrecognitionconfig)
       */
      override fun entityRecognitionConfig(): Any? = unwrap(this).getEntityRecognitionConfig()

      /**
       * Language code for the language that the model supports.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-taskconfig.html#cfn-comprehend-flywheel-taskconfig-languagecode)
       */
      override fun languageCode(): String = unwrap(this).getLanguageCode()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TaskConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty):
          TaskConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? TaskConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: TaskConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnFlywheel.TaskConfigProperty
    }
  }

  /**
   * Configuration parameters for an optional private Virtual Private Cloud (VPC) containing the
   * resources you are using for the job.
   *
   * For more information, see [Amazon
   * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/what-is-amazon-vpc.html) .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.comprehend.*;
   * VpcConfigProperty vpcConfigProperty = VpcConfigProperty.builder()
   * .securityGroupIds(List.of("securityGroupIds"))
   * .subnets(List.of("subnets"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-vpcconfig.html)
   */
  public interface VpcConfigProperty {
    /**
     * The ID number for a security group on an instance of your private VPC.
     *
     * Security groups on your VPC function serve as a virtual firewall to control inbound and
     * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
     * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more information,
     * see [Security Groups for your
     * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-vpcconfig.html#cfn-comprehend-flywheel-vpcconfig-securitygroupids)
     */
    public fun securityGroupIds(): List<String>

    /**
     * The ID for each subnet being used in your private VPC.
     *
     * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to a
     * given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
     * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
     * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-vpcconfig.html#cfn-comprehend-flywheel-vpcconfig-subnets)
     */
    public fun subnets(): List<String>

    /**
     * A builder for [VpcConfigProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      public fun securityGroupIds(securityGroupIds: List<String>)

      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      public fun securityGroupIds(vararg securityGroupIds: String)

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      public fun subnets(subnets: List<String>)

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      public fun subnets(vararg subnets: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty.Builder =
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty.builder()

      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      override fun securityGroupIds(securityGroupIds: List<String>) {
        cdkBuilder.securityGroupIds(securityGroupIds)
      }

      /**
       * @param securityGroupIds The ID number for a security group on an instance of your private
       * VPC. 
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       */
      override fun securityGroupIds(vararg securityGroupIds: String): Unit =
          securityGroupIds(securityGroupIds.toList())

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      override fun subnets(subnets: List<String>) {
        cdkBuilder.subnets(subnets)
      }

      /**
       * @param subnets The ID for each subnet being used in your private VPC. 
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       */
      override fun subnets(vararg subnets: String): Unit = subnets(subnets.toList())

      public fun build(): software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty,
    ) : CdkObject(cdkObject), VpcConfigProperty {
      /**
       * The ID number for a security group on an instance of your private VPC.
       *
       * Security groups on your VPC function serve as a virtual firewall to control inbound and
       * outbound traffic and provides security for the resources that you’ll be accessing on the VPC.
       * This ID number is preceded by "sg-", for instance: "sg-03b388029b0a285ea". For more
       * information, see [Security Groups for your
       * VPC](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_SecurityGroups.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-vpcconfig.html#cfn-comprehend-flywheel-vpcconfig-securitygroupids)
       */
      override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds()

      /**
       * The ID for each subnet being used in your private VPC.
       *
       * This subnet is a subset of the a range of IPv4 addresses used by the VPC and is specific to
       * a given availability zone in the VPC’s Region. This ID number is preceded by "subnet-", for
       * instance: "subnet-04ccf456919e69055". For more information, see [VPCs and
       * Subnets](https://docs.aws.amazon.com/vpc/latest/userguide/VPC_Subnets.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-comprehend-flywheel-vpcconfig.html#cfn-comprehend-flywheel-vpcconfig-subnets)
       */
      override fun subnets(): List<String> = unwrap(this).getSubnets()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): VpcConfigProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty):
          VpcConfigProperty = CdkObjectWrappers.wrap(cdkObject) as? VpcConfigProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: VpcConfigProperty):
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.comprehend.CfnFlywheel.VpcConfigProperty
    }
  }
}
