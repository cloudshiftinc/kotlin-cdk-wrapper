@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::ResourceDefinitionVersion` resource represents a resource definition
 * version for AWS IoT Greengrass .
 *
 * A resource definition version contains a list of resources. (In AWS CloudFormation , resources
 * are named *resource instances* .)
 *
 *
 * To create a resource definition version, you must specify the ID of the resource definition that
 * you want to associate with the version. For information about creating a resource definition, see
 * [`AWS::Greengrass::ResourceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
 * .
 *
 * After you create a resource definition version that contains the resources you want to deploy,
 * you must add it to your group version. For more information, see
 * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
 * .
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * CfnResourceDefinitionVersion cfnResourceDefinitionVersion =
 * CfnResourceDefinitionVersion.Builder.create(this, "MyCfnResourceDefinitionVersion")
 * .resourceDefinitionId("resourceDefinitionId")
 * .resources(List.of(ResourceInstanceProperty.builder()
 * .id("id")
 * .name("name")
 * .resourceDataContainer(ResourceDataContainerProperty.builder()
 * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build())
 * .build())
 * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sourcePath("sourcePath")
 * // the properties below are optional
 * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
 * .autoAddGroupOwner(false)
 * // the properties below are optional
 * .groupOwner("groupOwner")
 * .build())
 * .build())
 * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .s3Uri("s3Uri")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build())
 * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
 * .destinationPath("destinationPath")
 * .sageMakerJobArn("sageMakerJobArn")
 * // the properties below are optional
 * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
 * .groupOwner("groupOwner")
 * .groupPermission("groupPermission")
 * .build())
 * .build())
 * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
 * .arn("arn")
 * // the properties below are optional
 * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
 * .build())
 * .build())
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
 */
public open class CfnResourceDefinitionVersion internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion,
) : CfnResource(cdkObject), IInspectable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The ID of the resource definition associated with this version.
   */
  public open fun resourceDefinitionId(): String = unwrap(this).getResourceDefinitionId()

  /**
   * The ID of the resource definition associated with this version.
   */
  public open fun resourceDefinitionId(`value`: String) {
    unwrap(this).setResourceDefinitionId(`value`)
  }

  /**
   * The resources in this version.
   */
  public open fun resources(): Any = unwrap(this).getResources()

  /**
   * The resources in this version.
   */
  public open fun resources(`value`: IResolvable) {
    unwrap(this).setResources(`value`.let(IResolvable::unwrap))
  }

  /**
   * The resources in this version.
   */
  public open fun resources(__idx_ac66f0: List<Any>) {
    unwrap(this).setResources(__idx_ac66f0)
  }

  /**
   * The resources in this version.
   */
  public open fun resources(vararg __idx_ac66f0: Any): Unit = resources(__idx_ac66f0.toList())

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.greengrass.CfnResourceDefinitionVersion].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The ID of the resource definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid)
     * @param resourceDefinitionId The ID of the resource definition associated with this version. 
     */
    public fun resourceDefinitionId(resourceDefinitionId: String)

    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
     * @param resources The resources in this version. 
     */
    public fun resources(resources: IResolvable)

    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
     * @param resources The resources in this version. 
     */
    public fun resources(resources: List<Any>)

    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
     * @param resources The resources in this version. 
     */
    public fun resources(vararg resources: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.Builder =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.Builder.create(scope,
        id)

    /**
     * The ID of the resource definition associated with this version.
     *
     * This value is a GUID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resourcedefinitionid)
     * @param resourceDefinitionId The ID of the resource definition associated with this version. 
     */
    override fun resourceDefinitionId(resourceDefinitionId: String) {
      cdkBuilder.resourceDefinitionId(resourceDefinitionId)
    }

    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
     * @param resources The resources in this version. 
     */
    override fun resources(resources: IResolvable) {
      cdkBuilder.resources(resources.let(IResolvable::unwrap))
    }

    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
     * @param resources The resources in this version. 
     */
    override fun resources(resources: List<Any>) {
      cdkBuilder.resources(resources)
    }

    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html#cfn-greengrass-resourcedefinitionversion-resources)
     * @param resources The resources in this version. 
     */
    override fun resources(vararg resources: Any): Unit = resources(resources.toList())

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceDefinitionVersion {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceDefinitionVersion(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion):
        CfnResourceDefinitionVersion = CfnResourceDefinitionVersion(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinitionVersion):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion = wrapped.cdkObject
  }

  /**
   * Settings for an Secrets Manager machine learning resource.
   *
   * For more information, see [Perform Machine Learning
   * Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html) in the
   * *Developer Guide* .
   *
   * In an AWS CloudFormation template, `SageMakerMachineLearningModelResourceData` can be used in
   * the
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * SageMakerMachineLearningModelResourceDataProperty
   * sageMakerMachineLearningModelResourceDataProperty =
   * SageMakerMachineLearningModelResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .sageMakerJobArn("sageMakerJobArn")
   * // the properties below are optional
   * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
   * .groupOwner("groupOwner")
   * .groupPermission("groupPermission")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html)
   */
  public interface SageMakerMachineLearningModelResourceDataProperty {
    /**
     * The absolute local path of the resource inside the Lambda environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-destinationpath)
     */
    public fun destinationPath(): String

    /**
     * The owner setting for the downloaded machine learning resource.
     *
     * For more information, see [Access Machine Learning Resources from Lambda
     * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html) in
     * the *Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-ownersetting)
     */
    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SageMaker training job that represents the
     * source model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-sagemakerjobarn)
     */
    public fun sageMakerJobArn(): String

    /**
     * A builder for [SageMakerMachineLearningModelResourceDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationPath The absolute local path of the resource inside the Lambda
       * environment. 
       */
      public fun destinationPath(destinationPath: String)

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      public fun ownerSetting(ownerSetting: IResolvable)

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty)

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54e6b75466ee607f880457860e24a313e6760e9edf2dc2df9ad427159ddf598f")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      /**
       * @param sageMakerJobArn The Amazon Resource Name (ARN) of the Amazon SageMaker training job
       * that represents the source model. 
       */
      public fun sageMakerJobArn(sageMakerJobArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty.builder()

      /**
       * @param destinationPath The absolute local path of the resource inside the Lambda
       * environment. 
       */
      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      override fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting.let(IResolvable::unwrap))
      }

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      override fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting.let(ResourceDownloadOwnerSettingProperty::unwrap))
      }

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("54e6b75466ee607f880457860e24a313e6760e9edf2dc2df9ad427159ddf598f")
      override
          fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit):
          Unit = ownerSetting(ResourceDownloadOwnerSettingProperty(ownerSetting))

      /**
       * @param sageMakerJobArn The Amazon Resource Name (ARN) of the Amazon SageMaker training job
       * that represents the source model. 
       */
      override fun sageMakerJobArn(sageMakerJobArn: String) {
        cdkBuilder.sageMakerJobArn(sageMakerJobArn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty,
    ) : CdkObject(cdkObject), SageMakerMachineLearningModelResourceDataProperty {
      /**
       * The absolute local path of the resource inside the Lambda environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-destinationpath)
       */
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      /**
       * The owner setting for the downloaded machine learning resource.
       *
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-ownersetting)
       */
      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SageMaker training job that represents the
       * source model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata-sagemakerjobarn)
       */
      override fun sageMakerJobArn(): String = unwrap(this).getSageMakerJobArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SageMakerMachineLearningModelResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty):
          SageMakerMachineLearningModelResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerMachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SageMakerMachineLearningModelResourceDataProperty
    }
  }

  /**
   * Settings for a secret resource, which references a secret from AWS Secrets Manager .
   *
   * AWS IoT Greengrass stores a local, encrypted copy of the secret on the Greengrass core, where
   * it can be securely accessed by connectors and Lambda functions. For more information, see [Deploy
   * Secrets to the AWS IoT Greengrass
   * Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/secrets.html) in the *Developer
   * Guide* .
   *
   * In an AWS CloudFormation template, `SecretsManagerSecretResourceData` can be used in the
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * SecretsManagerSecretResourceDataProperty secretsManagerSecretResourceDataProperty =
   * SecretsManagerSecretResourceDataProperty.builder()
   * .arn("arn")
   * // the properties below are optional
   * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html)
   */
  public interface SecretsManagerSecretResourceDataProperty {
    /**
     * The staging labels whose values you want to make available on the core, in addition to
     * `AWSCURRENT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata-additionalstaginglabelstodownload)
     */
    public fun additionalStagingLabelsToDownload(): List<String> =
        unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the Secrets Manager secret to make available on the core.
     *
     * The value of the secret's latest version (represented by the `AWSCURRENT` staging label) is
     * included by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata-arn)
     */
    public fun arn(): String

    /**
     * A builder for [SecretsManagerSecretResourceDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param additionalStagingLabelsToDownload The staging labels whose values you want to make
       * available on the core, in addition to `AWSCURRENT` .
       */
      public fun additionalStagingLabelsToDownload(additionalStagingLabelsToDownload: List<String>)

      /**
       * @param additionalStagingLabelsToDownload The staging labels whose values you want to make
       * available on the core, in addition to `AWSCURRENT` .
       */
      public fun additionalStagingLabelsToDownload(vararg additionalStagingLabelsToDownload: String)

      /**
       * @param arn The Amazon Resource Name (ARN) of the Secrets Manager secret to make available
       * on the core. 
       * The value of the secret's latest version (represented by the `AWSCURRENT` staging label) is
       * included by default.
       */
      public fun arn(arn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty.builder()

      /**
       * @param additionalStagingLabelsToDownload The staging labels whose values you want to make
       * available on the core, in addition to `AWSCURRENT` .
       */
      override
          fun additionalStagingLabelsToDownload(additionalStagingLabelsToDownload: List<String>) {
        cdkBuilder.additionalStagingLabelsToDownload(additionalStagingLabelsToDownload)
      }

      /**
       * @param additionalStagingLabelsToDownload The staging labels whose values you want to make
       * available on the core, in addition to `AWSCURRENT` .
       */
      override fun additionalStagingLabelsToDownload(vararg
          additionalStagingLabelsToDownload: String): Unit =
          additionalStagingLabelsToDownload(additionalStagingLabelsToDownload.toList())

      /**
       * @param arn The Amazon Resource Name (ARN) of the Secrets Manager secret to make available
       * on the core. 
       * The value of the secret's latest version (represented by the `AWSCURRENT` staging label) is
       * included by default.
       */
      override fun arn(arn: String) {
        cdkBuilder.arn(arn)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty,
    ) : CdkObject(cdkObject), SecretsManagerSecretResourceDataProperty {
      /**
       * The staging labels whose values you want to make available on the core, in addition to
       * `AWSCURRENT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata-additionalstaginglabelstodownload)
       */
      override fun additionalStagingLabelsToDownload(): List<String> =
          unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

      /**
       * The Amazon Resource Name (ARN) of the Secrets Manager secret to make available on the core.
       *
       * The value of the secret's latest version (represented by the `AWSCURRENT` staging label) is
       * included by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinitionversion-secretsmanagersecretresourcedata-arn)
       */
      override fun arn(): String = unwrap(this).getArn()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          SecretsManagerSecretResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty):
          SecretsManagerSecretResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretsManagerSecretResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.SecretsManagerSecretResourceDataProperty
    }
  }

  /**
   * Settings for a local device resource, which represents a file under `/dev` .
   *
   * For more information, see [Access Local Resources with Lambda
   * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
   * in the *Developer Guide* .
   *
   * In an AWS CloudFormation template, `LocalDeviceResourceData` can be used in the
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
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
  public interface LocalDeviceResourceDataProperty {
    /**
     * Settings that define additional Linux OS group permissions to give to the Lambda function
     * process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-groupownersetting)
     */
    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    /**
     * The local absolute path of the device resource.
     *
     * The source path for a device resource can refer only to a character device or block device
     * under `/dev` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-sourcepath)
     */
    public fun sourcePath(): String

    /**
     * A builder for [LocalDeviceResourceDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      public fun groupOwnerSetting(groupOwnerSetting: IResolvable)

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty)

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9500b9e7ac082eea20debb618ffe7e4852da9f334d5e31fdfdceec6519c341cd")
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit)

      /**
       * @param sourcePath The local absolute path of the device resource. 
       * The source path for a device resource can refer only to a character device or block device
       * under `/dev` .
       */
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty.builder()

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      override fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(IResolvable::unwrap))
      }

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      override fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(GroupOwnerSettingProperty::unwrap))
      }

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9500b9e7ac082eea20debb618ffe7e4852da9f334d5e31fdfdceec6519c341cd")
      override
          fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit):
          Unit = groupOwnerSetting(GroupOwnerSettingProperty(groupOwnerSetting))

      /**
       * @param sourcePath The local absolute path of the device resource. 
       * The source path for a device resource can refer only to a character device or block device
       * under `/dev` .
       */
      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty,
    ) : CdkObject(cdkObject), LocalDeviceResourceDataProperty {
      /**
       * Settings that define additional Linux OS group permissions to give to the Lambda function
       * process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-groupownersetting)
       */
      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      /**
       * The local absolute path of the device resource.
       *
       * The source path for a device resource can refer only to a character device or block device
       * under `/dev` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html#cfn-greengrass-resourcedefinitionversion-localdeviceresourcedata-sourcepath)
       */
      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalDeviceResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty):
          LocalDeviceResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalDeviceResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalDeviceResourceDataProperty
    }
  }

  /**
   * Settings for a local volume resource, which represents a file or directory on the root file
   * system.
   *
   * For more information, see [Access Local Resources with Lambda
   * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html)
   * in the *Developer Guide* .
   *
   * In an AWS CloudFormation template, `LocalVolumeResourceData` can be used in the
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
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
  public interface LocalVolumeResourceDataProperty {
    /**
     * The absolute local path of the resource in the Lambda environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-destinationpath)
     */
    public fun destinationPath(): String

    /**
     * Settings that define additional Linux OS group permissions to give to the Lambda function
     * process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-groupownersetting)
     */
    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    /**
     * The local absolute path of the volume resource on the host.
     *
     * The source path for a volume resource type cannot start with `/sys` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-sourcepath)
     */
    public fun sourcePath(): String

    /**
     * A builder for [LocalVolumeResourceDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationPath The absolute local path of the resource in the Lambda environment. 
       */
      public fun destinationPath(destinationPath: String)

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      public fun groupOwnerSetting(groupOwnerSetting: IResolvable)

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty)

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9b552e152365010d3ad7186cfc68a45aa431a0941294a73b2320fe01ebd7e08")
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit)

      /**
       * @param sourcePath The local absolute path of the volume resource on the host. 
       * The source path for a volume resource type cannot start with `/sys` .
       */
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty.builder()

      /**
       * @param destinationPath The absolute local path of the resource in the Lambda environment. 
       */
      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      override fun groupOwnerSetting(groupOwnerSetting: IResolvable) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(IResolvable::unwrap))
      }

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      override fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty) {
        cdkBuilder.groupOwnerSetting(groupOwnerSetting.let(GroupOwnerSettingProperty::unwrap))
      }

      /**
       * @param groupOwnerSetting Settings that define additional Linux OS group permissions to give
       * to the Lambda function process.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a9b552e152365010d3ad7186cfc68a45aa431a0941294a73b2320fe01ebd7e08")
      override
          fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit):
          Unit = groupOwnerSetting(GroupOwnerSettingProperty(groupOwnerSetting))

      /**
       * @param sourcePath The local absolute path of the volume resource on the host. 
       * The source path for a volume resource type cannot start with `/sys` .
       */
      override fun sourcePath(sourcePath: String) {
        cdkBuilder.sourcePath(sourcePath)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty,
    ) : CdkObject(cdkObject), LocalVolumeResourceDataProperty {
      /**
       * The absolute local path of the resource in the Lambda environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-destinationpath)
       */
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      /**
       * Settings that define additional Linux OS group permissions to give to the Lambda function
       * process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-groupownersetting)
       */
      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      /**
       * The local absolute path of the volume resource on the host.
       *
       * The source path for a volume resource type cannot start with `/sys` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html#cfn-greengrass-resourcedefinitionversion-localvolumeresourcedata-sourcepath)
       */
      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalVolumeResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty):
          LocalVolumeResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalVolumeResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.LocalVolumeResourceDataProperty
    }
  }

  /**
   * Settings that define additional Linux OS group permissions to give to the Lambda function
   * process.
   *
   * You can give the permissions of the Linux group that owns the resource or choose another Linux
   * group. These permissions are in addition to the function's `RunAs` permissions.
   *
   * In an AWS CloudFormation template, `GroupOwnerSetting` is a property of the
   * [`LocalDeviceResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localdeviceresourcedata.html)
   * and
   * [`LocalVolumeResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-localvolumeresourcedata.html)
   * property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * GroupOwnerSettingProperty groupOwnerSettingProperty = GroupOwnerSettingProperty.builder()
   * .autoAddGroupOwner(false)
   * // the properties below are optional
   * .groupOwner("groupOwner")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html)
   */
  public interface GroupOwnerSettingProperty {
    /**
     * Indicates whether to give the privileges of the Linux group that owns the resource to the
     * Lambda process.
     *
     * This gives the Lambda process the file access permissions of the Linux group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-autoaddgroupowner)
     */
    public fun autoAddGroupOwner(): Any

    /**
     * The name of the Linux group whose privileges you want to add to the Lambda process.
     *
     * This value is ignored if `AutoAddGroupOwner` is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-groupowner)
     */
    public fun groupOwner(): String? = unwrap(this).getGroupOwner()

    /**
     * A builder for [GroupOwnerSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that
       * owns the resource to the Lambda process. 
       * This gives the Lambda process the file access permissions of the Linux group.
       */
      public fun autoAddGroupOwner(autoAddGroupOwner: Boolean)

      /**
       * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that
       * owns the resource to the Lambda process. 
       * This gives the Lambda process the file access permissions of the Linux group.
       */
      public fun autoAddGroupOwner(autoAddGroupOwner: IResolvable)

      /**
       * @param groupOwner The name of the Linux group whose privileges you want to add to the
       * Lambda process.
       * This value is ignored if `AutoAddGroupOwner` is true.
       */
      public fun groupOwner(groupOwner: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty.builder()

      /**
       * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that
       * owns the resource to the Lambda process. 
       * This gives the Lambda process the file access permissions of the Linux group.
       */
      override fun autoAddGroupOwner(autoAddGroupOwner: Boolean) {
        cdkBuilder.autoAddGroupOwner(autoAddGroupOwner)
      }

      /**
       * @param autoAddGroupOwner Indicates whether to give the privileges of the Linux group that
       * owns the resource to the Lambda process. 
       * This gives the Lambda process the file access permissions of the Linux group.
       */
      override fun autoAddGroupOwner(autoAddGroupOwner: IResolvable) {
        cdkBuilder.autoAddGroupOwner(autoAddGroupOwner.let(IResolvable::unwrap))
      }

      /**
       * @param groupOwner The name of the Linux group whose privileges you want to add to the
       * Lambda process.
       * This value is ignored if `AutoAddGroupOwner` is true.
       */
      override fun groupOwner(groupOwner: String) {
        cdkBuilder.groupOwner(groupOwner)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty,
    ) : CdkObject(cdkObject), GroupOwnerSettingProperty {
      /**
       * Indicates whether to give the privileges of the Linux group that owns the resource to the
       * Lambda process.
       *
       * This gives the Lambda process the file access permissions of the Linux group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-autoaddgroupowner)
       */
      override fun autoAddGroupOwner(): Any = unwrap(this).getAutoAddGroupOwner()

      /**
       * The name of the Linux group whose privileges you want to add to the Lambda process.
       *
       * This value is ignored if `AutoAddGroupOwner` is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-groupownersetting.html#cfn-greengrass-resourcedefinitionversion-groupownersetting-groupowner)
       */
      override fun groupOwner(): String? = unwrap(this).getGroupOwner()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupOwnerSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty):
          GroupOwnerSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.GroupOwnerSettingProperty
    }
  }

  /**
   * The owner setting for a downloaded machine learning resource.
   *
   * For more information, see [Access Machine Learning Resources from Lambda
   * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html) in
   * the *Developer Guide* .
   *
   * In an AWS CloudFormation template, `ResourceDownloadOwnerSetting` is the property type of the
   * `OwnerSetting` property for the
   * [`S3MachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html)
   * and
   * [`SageMakerMachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-sagemakermachinelearningmodelresourcedata.html)
   * property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * ResourceDownloadOwnerSettingProperty resourceDownloadOwnerSettingProperty =
   * ResourceDownloadOwnerSettingProperty.builder()
   * .groupOwner("groupOwner")
   * .groupPermission("groupPermission")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html)
   */
  public interface ResourceDownloadOwnerSettingProperty {
    /**
     * The group owner of the machine learning resource.
     *
     * This is the group ID (GID) of an existing Linux OS group on the system. The group's
     * permissions are added to the Lambda process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-groupowner)
     */
    public fun groupOwner(): String

    /**
     * The permissions that the group owner has to the machine learning resource.
     *
     * Valid values are `rw` (read-write) or `ro` (read-only).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-grouppermission)
     */
    public fun groupPermission(): String

    /**
     * A builder for [ResourceDownloadOwnerSettingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param groupOwner The group owner of the machine learning resource. 
       * This is the group ID (GID) of an existing Linux OS group on the system. The group's
       * permissions are added to the Lambda process.
       */
      public fun groupOwner(groupOwner: String)

      /**
       * @param groupPermission The permissions that the group owner has to the machine learning
       * resource. 
       * Valid values are `rw` (read-write) or `ro` (read-only).
       */
      public fun groupPermission(groupPermission: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty.builder()

      /**
       * @param groupOwner The group owner of the machine learning resource. 
       * This is the group ID (GID) of an existing Linux OS group on the system. The group's
       * permissions are added to the Lambda process.
       */
      override fun groupOwner(groupOwner: String) {
        cdkBuilder.groupOwner(groupOwner)
      }

      /**
       * @param groupPermission The permissions that the group owner has to the machine learning
       * resource. 
       * Valid values are `rw` (read-write) or `ro` (read-only).
       */
      override fun groupPermission(groupPermission: String) {
        cdkBuilder.groupPermission(groupPermission)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty,
    ) : CdkObject(cdkObject), ResourceDownloadOwnerSettingProperty {
      /**
       * The group owner of the machine learning resource.
       *
       * This is the group ID (GID) of an existing Linux OS group on the system. The group's
       * permissions are added to the Lambda process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-groupowner)
       */
      override fun groupOwner(): String = unwrap(this).getGroupOwner()

      /**
       * The permissions that the group owner has to the machine learning resource.
       *
       * Valid values are `rw` (read-write) or `ro` (read-only).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinitionversion-resourcedownloadownersetting-grouppermission)
       */
      override fun groupPermission(): String = unwrap(this).getGroupPermission()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceDownloadOwnerSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty):
          ResourceDownloadOwnerSettingProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDownloadOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDownloadOwnerSettingProperty
    }
  }

  /**
   * Settings for an Amazon S3 machine learning resource.
   *
   * For more information, see [Perform Machine Learning
   * Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html) in the
   * *Developer Guide* .
   *
   * In an AWS CloudFormation template, `S3MachineLearningModelResourceData` can be used in the
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * S3MachineLearningModelResourceDataProperty s3MachineLearningModelResourceDataProperty =
   * S3MachineLearningModelResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
   * .groupOwner("groupOwner")
   * .groupPermission("groupPermission")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html)
   */
  public interface S3MachineLearningModelResourceDataProperty {
    /**
     * The absolute local path of the resource inside the Lambda environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata-destinationpath)
     */
    public fun destinationPath(): String

    /**
     * The owner setting for the downloaded machine learning resource.
     *
     * For more information, see [Access Machine Learning Resources from Lambda
     * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html) in
     * the *Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata-ownersetting)
     */
    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    /**
     * The URI of the source model in an Amazon S3 bucket.
     *
     * The model package must be in `tar.gz` or `.zip` format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata-s3uri)
     */
    public fun s3Uri(): String

    /**
     * A builder for [S3MachineLearningModelResourceDataProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param destinationPath The absolute local path of the resource inside the Lambda
       * environment. 
       */
      public fun destinationPath(destinationPath: String)

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      public fun ownerSetting(ownerSetting: IResolvable)

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty)

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("946ddc93f0bcb1ce4cb9c4c5d6d9f5d0f60ea1b65a2b99ec523290de60c52417")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      /**
       * @param s3Uri The URI of the source model in an Amazon S3 bucket. 
       * The model package must be in `tar.gz` or `.zip` format.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty.builder()

      /**
       * @param destinationPath The absolute local path of the resource inside the Lambda
       * environment. 
       */
      override fun destinationPath(destinationPath: String) {
        cdkBuilder.destinationPath(destinationPath)
      }

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      override fun ownerSetting(ownerSetting: IResolvable) {
        cdkBuilder.ownerSetting(ownerSetting.let(IResolvable::unwrap))
      }

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      override fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty) {
        cdkBuilder.ownerSetting(ownerSetting.let(ResourceDownloadOwnerSettingProperty::unwrap))
      }

      /**
       * @param ownerSetting The owner setting for the downloaded machine learning resource.
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("946ddc93f0bcb1ce4cb9c4c5d6d9f5d0f60ea1b65a2b99ec523290de60c52417")
      override
          fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit):
          Unit = ownerSetting(ResourceDownloadOwnerSettingProperty(ownerSetting))

      /**
       * @param s3Uri The URI of the source model in an Amazon S3 bucket. 
       * The model package must be in `tar.gz` or `.zip` format.
       */
      override fun s3Uri(s3Uri: String) {
        cdkBuilder.s3Uri(s3Uri)
      }

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty,
    ) : CdkObject(cdkObject), S3MachineLearningModelResourceDataProperty {
      /**
       * The absolute local path of the resource inside the Lambda environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata-destinationpath)
       */
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      /**
       * The owner setting for the downloaded machine learning resource.
       *
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata-ownersetting)
       */
      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      /**
       * The URI of the source model in an Amazon S3 bucket.
       *
       * The model package must be in `tar.gz` or `.zip` format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinitionversion-s3machinelearningmodelresourcedata-s3uri)
       */
      override fun s3Uri(): String = unwrap(this).getS3Uri()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          S3MachineLearningModelResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty):
          S3MachineLearningModelResourceDataProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3MachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.S3MachineLearningModelResourceDataProperty
    }
  }

  /**
   * A container for resource data, which defines the resource type.
   *
   * The container takes only one of the following supported resource data types:
   * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
   * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
   * `SecretsManagerSecretResourceData` .
   *
   *
   * Only one resource type can be defined for a `ResourceDataContainer` instance.
   *
   *
   * In an AWS CloudFormation template, `ResourceDataContainer` is a property of the
   * [`ResourceInstance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
   * property type.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * ResourceDataContainerProperty resourceDataContainerProperty =
   * ResourceDataContainerProperty.builder()
   * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
   * .sourcePath("sourcePath")
   * // the properties below are optional
   * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
   * .autoAddGroupOwner(false)
   * // the properties below are optional
   * .groupOwner("groupOwner")
   * .build())
   * .build())
   * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .sourcePath("sourcePath")
   * // the properties below are optional
   * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
   * .autoAddGroupOwner(false)
   * // the properties below are optional
   * .groupOwner("groupOwner")
   * .build())
   * .build())
   * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
   * .groupOwner("groupOwner")
   * .groupPermission("groupPermission")
   * .build())
   * .build())
   * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .sageMakerJobArn("sageMakerJobArn")
   * // the properties below are optional
   * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
   * .groupOwner("groupOwner")
   * .groupPermission("groupPermission")
   * .build())
   * .build())
   * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
   * .arn("arn")
   * // the properties below are optional
   * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html)
   */
  public interface ResourceDataContainerProperty {
    /**
     * Settings for a local device resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-localdeviceresourcedata)
     */
    public fun localDeviceResourceData(): Any? = unwrap(this).getLocalDeviceResourceData()

    /**
     * Settings for a local volume resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-localvolumeresourcedata)
     */
    public fun localVolumeResourceData(): Any? = unwrap(this).getLocalVolumeResourceData()

    /**
     * Settings for a machine learning resource stored in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-s3machinelearningmodelresourcedata)
     */
    public fun s3MachineLearningModelResourceData(): Any? =
        unwrap(this).getS3MachineLearningModelResourceData()

    /**
     * Settings for a machine learning resource saved as an SageMaker training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-sagemakermachinelearningmodelresourcedata)
     */
    public fun sageMakerMachineLearningModelResourceData(): Any? =
        unwrap(this).getSageMakerMachineLearningModelResourceData()

    /**
     * Settings for a secret resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-secretsmanagersecretresourcedata)
     */
    public fun secretsManagerSecretResourceData(): Any? =
        unwrap(this).getSecretsManagerSecretResourceData()

    /**
     * A builder for [ResourceDataContainerProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param localDeviceResourceData Settings for a local device resource.
       */
      public fun localDeviceResourceData(localDeviceResourceData: IResolvable)

      /**
       * @param localDeviceResourceData Settings for a local device resource.
       */
      public fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty)

      /**
       * @param localDeviceResourceData Settings for a local device resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a71b6d3b8d67a0864a39ed7bf094e9eee952e7c37558a5404a511860a585bc5d")
      public
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty.Builder.() -> Unit)

      /**
       * @param localVolumeResourceData Settings for a local volume resource.
       */
      public fun localVolumeResourceData(localVolumeResourceData: IResolvable)

      /**
       * @param localVolumeResourceData Settings for a local volume resource.
       */
      public fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty)

      /**
       * @param localVolumeResourceData Settings for a local volume resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3fe498ffd1c13631b929d0429ab0ec0b617126be20da1d0a11b8a5fb40f4368")
      public
          fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty.Builder.() -> Unit)

      /**
       * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored
       * in Amazon S3 .
       */
      public fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable)

      /**
       * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored
       * in Amazon S3 .
       */
      public
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty)

      /**
       * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored
       * in Amazon S3 .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9002d2b37239a4c2725aca61a597c9dbf8567a4cf12b3ffccc43ece59cea3c4a")
      public
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty.Builder.() -> Unit)

      /**
       * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
       * saved as an SageMaker training job.
       */
      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable)

      /**
       * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
       * saved as an SageMaker training job.
       */
      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty)

      /**
       * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
       * saved as an SageMaker training job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d4481c0beb7f1a56a3d4a576e952f7e92219b31dc1c6f418d5748ec3e8955f2")
      public
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty.Builder.() -> Unit)

      /**
       * @param secretsManagerSecretResourceData Settings for a secret resource.
       */
      public fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable)

      /**
       * @param secretsManagerSecretResourceData Settings for a secret resource.
       */
      public
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty)

      /**
       * @param secretsManagerSecretResourceData Settings for a secret resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01e5af1250a7b41f1920ed49b1655fc9c96ad41d4357df5ab3557a8b8947e98")
      public
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty.builder()

      /**
       * @param localDeviceResourceData Settings for a local device resource.
       */
      override fun localDeviceResourceData(localDeviceResourceData: IResolvable) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData.let(IResolvable::unwrap))
      }

      /**
       * @param localDeviceResourceData Settings for a local device resource.
       */
      override
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty) {
        cdkBuilder.localDeviceResourceData(localDeviceResourceData.let(LocalDeviceResourceDataProperty::unwrap))
      }

      /**
       * @param localDeviceResourceData Settings for a local device resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("a71b6d3b8d67a0864a39ed7bf094e9eee952e7c37558a5404a511860a585bc5d")
      override
          fun localDeviceResourceData(localDeviceResourceData: LocalDeviceResourceDataProperty.Builder.() -> Unit):
          Unit = localDeviceResourceData(LocalDeviceResourceDataProperty(localDeviceResourceData))

      /**
       * @param localVolumeResourceData Settings for a local volume resource.
       */
      override fun localVolumeResourceData(localVolumeResourceData: IResolvable) {
        cdkBuilder.localVolumeResourceData(localVolumeResourceData.let(IResolvable::unwrap))
      }

      /**
       * @param localVolumeResourceData Settings for a local volume resource.
       */
      override
          fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty) {
        cdkBuilder.localVolumeResourceData(localVolumeResourceData.let(LocalVolumeResourceDataProperty::unwrap))
      }

      /**
       * @param localVolumeResourceData Settings for a local volume resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("f3fe498ffd1c13631b929d0429ab0ec0b617126be20da1d0a11b8a5fb40f4368")
      override
          fun localVolumeResourceData(localVolumeResourceData: LocalVolumeResourceDataProperty.Builder.() -> Unit):
          Unit = localVolumeResourceData(LocalVolumeResourceDataProperty(localVolumeResourceData))

      /**
       * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored
       * in Amazon S3 .
       */
      override
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: IResolvable) {
        cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData.let(IResolvable::unwrap))
      }

      /**
       * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored
       * in Amazon S3 .
       */
      override
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty) {
        cdkBuilder.s3MachineLearningModelResourceData(s3MachineLearningModelResourceData.let(S3MachineLearningModelResourceDataProperty::unwrap))
      }

      /**
       * @param s3MachineLearningModelResourceData Settings for a machine learning resource stored
       * in Amazon S3 .
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("9002d2b37239a4c2725aca61a597c9dbf8567a4cf12b3ffccc43ece59cea3c4a")
      override
          fun s3MachineLearningModelResourceData(s3MachineLearningModelResourceData: S3MachineLearningModelResourceDataProperty.Builder.() -> Unit):
          Unit =
          s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty(s3MachineLearningModelResourceData))

      /**
       * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
       * saved as an SageMaker training job.
       */
      override
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: IResolvable) {
        cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData.let(IResolvable::unwrap))
      }

      /**
       * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
       * saved as an SageMaker training job.
       */
      override
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty) {
        cdkBuilder.sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData.let(SageMakerMachineLearningModelResourceDataProperty::unwrap))
      }

      /**
       * @param sageMakerMachineLearningModelResourceData Settings for a machine learning resource
       * saved as an SageMaker training job.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("5d4481c0beb7f1a56a3d4a576e952f7e92219b31dc1c6f418d5748ec3e8955f2")
      override
          fun sageMakerMachineLearningModelResourceData(sageMakerMachineLearningModelResourceData: SageMakerMachineLearningModelResourceDataProperty.Builder.() -> Unit):
          Unit =
          sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty(sageMakerMachineLearningModelResourceData))

      /**
       * @param secretsManagerSecretResourceData Settings for a secret resource.
       */
      override fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: IResolvable) {
        cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData.let(IResolvable::unwrap))
      }

      /**
       * @param secretsManagerSecretResourceData Settings for a secret resource.
       */
      override
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty) {
        cdkBuilder.secretsManagerSecretResourceData(secretsManagerSecretResourceData.let(SecretsManagerSecretResourceDataProperty::unwrap))
      }

      /**
       * @param secretsManagerSecretResourceData Settings for a secret resource.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("e01e5af1250a7b41f1920ed49b1655fc9c96ad41d4357df5ab3557a8b8947e98")
      override
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit):
          Unit =
          secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty(secretsManagerSecretResourceData))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty,
    ) : CdkObject(cdkObject), ResourceDataContainerProperty {
      /**
       * Settings for a local device resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-localdeviceresourcedata)
       */
      override fun localDeviceResourceData(): Any? = unwrap(this).getLocalDeviceResourceData()

      /**
       * Settings for a local volume resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-localvolumeresourcedata)
       */
      override fun localVolumeResourceData(): Any? = unwrap(this).getLocalVolumeResourceData()

      /**
       * Settings for a machine learning resource stored in Amazon S3 .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-s3machinelearningmodelresourcedata)
       */
      override fun s3MachineLearningModelResourceData(): Any? =
          unwrap(this).getS3MachineLearningModelResourceData()

      /**
       * Settings for a machine learning resource saved as an SageMaker training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-sagemakermachinelearningmodelresourcedata)
       */
      override fun sageMakerMachineLearningModelResourceData(): Any? =
          unwrap(this).getSageMakerMachineLearningModelResourceData()

      /**
       * Settings for a secret resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourcedatacontainer.html#cfn-greengrass-resourcedefinitionversion-resourcedatacontainer-secretsmanagersecretresourcedata)
       */
      override fun secretsManagerSecretResourceData(): Any? =
          unwrap(this).getSecretsManagerSecretResourceData()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceDataContainerProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty):
          ResourceDataContainerProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDataContainerProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceDataContainerProperty
    }
  }

  /**
   * A local resource, machine learning resource, or secret resource.
   *
   * For more information, see [Access Local Resources with Lambda
   * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-local-resources.html) ,
   * [Perform Machine Learning
   * Inference](https://docs.aws.amazon.com/greengrass/v1/developerguide/ml-inference.html) , and
   * [Deploy Secrets to the AWS IoT Greengrass
   * Core](https://docs.aws.amazon.com/greengrass/v1/developerguide/secrets.html) in the *Developer
   * Guide* .
   *
   * In an AWS CloudFormation template, the `Resources` property of the
   * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
   * resource contains a list of `ResourceInstance` property types.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * ResourceInstanceProperty resourceInstanceProperty = ResourceInstanceProperty.builder()
   * .id("id")
   * .name("name")
   * .resourceDataContainer(ResourceDataContainerProperty.builder()
   * .localDeviceResourceData(LocalDeviceResourceDataProperty.builder()
   * .sourcePath("sourcePath")
   * // the properties below are optional
   * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
   * .autoAddGroupOwner(false)
   * // the properties below are optional
   * .groupOwner("groupOwner")
   * .build())
   * .build())
   * .localVolumeResourceData(LocalVolumeResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .sourcePath("sourcePath")
   * // the properties below are optional
   * .groupOwnerSetting(GroupOwnerSettingProperty.builder()
   * .autoAddGroupOwner(false)
   * // the properties below are optional
   * .groupOwner("groupOwner")
   * .build())
   * .build())
   * .s3MachineLearningModelResourceData(S3MachineLearningModelResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .s3Uri("s3Uri")
   * // the properties below are optional
   * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
   * .groupOwner("groupOwner")
   * .groupPermission("groupPermission")
   * .build())
   * .build())
   * .sageMakerMachineLearningModelResourceData(SageMakerMachineLearningModelResourceDataProperty.builder()
   * .destinationPath("destinationPath")
   * .sageMakerJobArn("sageMakerJobArn")
   * // the properties below are optional
   * .ownerSetting(ResourceDownloadOwnerSettingProperty.builder()
   * .groupOwner("groupOwner")
   * .groupPermission("groupPermission")
   * .build())
   * .build())
   * .secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty.builder()
   * .arn("arn")
   * // the properties below are optional
   * .additionalStagingLabelsToDownload(List.of("additionalStagingLabelsToDownload"))
   * .build())
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html)
   */
  public interface ResourceInstanceProperty {
    /**
     * A descriptive or arbitrary ID for the resource.
     *
     * This value must be unique within the resource definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html#cfn-greengrass-resourcedefinitionversion-resourceinstance-id)
     */
    public fun id(): String

    /**
     * The descriptive resource name, which is displayed on the AWS IoT Greengrass console.
     *
     * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
     * Greengrass group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html#cfn-greengrass-resourcedefinitionversion-resourceinstance-name)
     */
    public fun name(): String

    /**
     * A container for resource data.
     *
     * The container takes only one of the following supported resource data types:
     * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
     * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
     * `SecretsManagerSecretResourceData` .
     *
     *
     * Only one resource type can be defined for a `ResourceDataContainer` instance.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html#cfn-greengrass-resourcedefinitionversion-resourceinstance-resourcedatacontainer)
     */
    public fun resourceDataContainer(): Any

    /**
     * A builder for [ResourceInstanceProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param id A descriptive or arbitrary ID for the resource. 
       * This value must be unique within the resource definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      public fun id(id: String)

      /**
       * @param name The descriptive resource name, which is displayed on the AWS IoT Greengrass
       * console. 
       * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
       * Greengrass group.
       */
      public fun name(name: String)

      /**
       * @param resourceDataContainer A container for resource data. 
       * The container takes only one of the following supported resource data types:
       * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
       * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
       * `SecretsManagerSecretResourceData` .
       *
       *
       * Only one resource type can be defined for a `ResourceDataContainer` instance.
       */
      public fun resourceDataContainer(resourceDataContainer: IResolvable)

      /**
       * @param resourceDataContainer A container for resource data. 
       * The container takes only one of the following supported resource data types:
       * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
       * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
       * `SecretsManagerSecretResourceData` .
       *
       *
       * Only one resource type can be defined for a `ResourceDataContainer` instance.
       */
      public fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty)

      /**
       * @param resourceDataContainer A container for resource data. 
       * The container takes only one of the following supported resource data types:
       * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
       * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
       * `SecretsManagerSecretResourceData` .
       *
       *
       * Only one resource type can be defined for a `ResourceDataContainer` instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c40aa6c325d7f2cecf940cacf9a1f9b124c85d905f7c2071aaf6b6a695f32f9f")
      public
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty.builder()

      /**
       * @param id A descriptive or arbitrary ID for the resource. 
       * This value must be unique within the resource definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       */
      override fun id(id: String) {
        cdkBuilder.id(id)
      }

      /**
       * @param name The descriptive resource name, which is displayed on the AWS IoT Greengrass
       * console. 
       * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
       * Greengrass group.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param resourceDataContainer A container for resource data. 
       * The container takes only one of the following supported resource data types:
       * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
       * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
       * `SecretsManagerSecretResourceData` .
       *
       *
       * Only one resource type can be defined for a `ResourceDataContainer` instance.
       */
      override fun resourceDataContainer(resourceDataContainer: IResolvable) {
        cdkBuilder.resourceDataContainer(resourceDataContainer.let(IResolvable::unwrap))
      }

      /**
       * @param resourceDataContainer A container for resource data. 
       * The container takes only one of the following supported resource data types:
       * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
       * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
       * `SecretsManagerSecretResourceData` .
       *
       *
       * Only one resource type can be defined for a `ResourceDataContainer` instance.
       */
      override fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty) {
        cdkBuilder.resourceDataContainer(resourceDataContainer.let(ResourceDataContainerProperty::unwrap))
      }

      /**
       * @param resourceDataContainer A container for resource data. 
       * The container takes only one of the following supported resource data types:
       * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
       * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
       * `SecretsManagerSecretResourceData` .
       *
       *
       * Only one resource type can be defined for a `ResourceDataContainer` instance.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c40aa6c325d7f2cecf940cacf9a1f9b124c85d905f7c2071aaf6b6a695f32f9f")
      override
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit):
          Unit = resourceDataContainer(ResourceDataContainerProperty(resourceDataContainer))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty,
    ) : CdkObject(cdkObject), ResourceInstanceProperty {
      /**
       * A descriptive or arbitrary ID for the resource.
       *
       * This value must be unique within the resource definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html#cfn-greengrass-resourcedefinitionversion-resourceinstance-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The descriptive resource name, which is displayed on the AWS IoT Greengrass console.
       *
       * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
       * Greengrass group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html#cfn-greengrass-resourcedefinitionversion-resourceinstance-name)
       */
      override fun name(): String = unwrap(this).getName()

      /**
       * A container for resource data.
       *
       * The container takes only one of the following supported resource data types:
       * `LocalDeviceResourceData` , `LocalVolumeResourceData` ,
       * `SageMakerMachineLearningModelResourceData` , `S3MachineLearningModelResourceData` , or
       * `SecretsManagerSecretResourceData` .
       *
       *
       * Only one resource type can be defined for a `ResourceDataContainer` instance.
       *
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinitionversion-resourceinstance.html#cfn-greengrass-resourcedefinitionversion-resourceinstance-resourcedatacontainer)
       */
      override fun resourceDataContainer(): Any = unwrap(this).getResourceDataContainer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty):
          ResourceInstanceProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceInstanceProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinitionVersion.ResourceInstanceProperty
    }
  }
}
