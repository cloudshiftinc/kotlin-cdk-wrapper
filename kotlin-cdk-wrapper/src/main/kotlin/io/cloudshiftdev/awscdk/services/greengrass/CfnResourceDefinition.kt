@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::Greengrass::ResourceDefinition` resource represents a resource definition for AWS IoT
 * Greengrass .
 *
 * Resource definitions are used to organize your resource definition versions.
 *
 * Resource definitions can reference multiple resource definition versions. All resource definition
 * versions must be associated with a resource definition. Each resource definition version can contain
 * one or more resources. (In AWS CloudFormation , resources are named *resource instances* .)
 *
 *
 * When you create a resource definition, you can optionally include an initial resource definition
 * version. To associate a resource definition version later, create an
 * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
 * resource and specify the ID of this resource definition.
 *
 * After you create the resource definition version that contains the resources you want to deploy,
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
 * Object tags;
 * CfnResourceDefinition cfnResourceDefinition = CfnResourceDefinition.Builder.create(this,
 * "MyCfnResourceDefinition")
 * .name("name")
 * // the properties below are optional
 * .initialVersion(ResourceDefinitionVersionProperty.builder()
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
 * .build())
 * .tags(tags)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
 */
public open class CfnResourceDefinition internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceDefinitionProps,
  ) :
      this(software.amazon.awscdk.services.greengrass.CfnResourceDefinition(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnResourceDefinitionProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnResourceDefinitionProps.Builder.() -> Unit,
  ) : this(scope, id, CfnResourceDefinitionProps(props)
  )

  /**
   * The Amazon Resource Name (ARN) of the `ResourceDefinition` , such as
   * `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/resources/1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the `ResourceDefinition` , such as `1234a5b6-78cd-901e-2fgh-3i45j6k178l9` .
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The ARN of the last `ResourceDefinitionVersion` that was added to the `ResourceDefinition` ,
   * such as `arn:aws:greengrass:us-east-1: 
   * :/greengrass/definition/resources/1234a5b6-78cd-901e-2fgh-3i45j6k178l9/versions/9876ac30-4bdb-4f9d-95af-b5fdb66be1a2`
   * .
   */
  public open fun attrLatestVersionArn(): String = unwrap(this).getAttrLatestVersionArn()

  /**
   * The name of the `ResourceDefinition` , such as `MyResourceDefinition` .
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The resource definition version to include when the resource definition is created.
   */
  public open fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The resource definition version to include when the resource definition is created.
   */
  public open fun initialVersion(`value`: IResolvable) {
    unwrap(this).setInitialVersion(`value`.let(IResolvable::unwrap))
  }

  /**
   * The resource definition version to include when the resource definition is created.
   */
  public open fun initialVersion(`value`: ResourceDefinitionVersionProperty) {
    unwrap(this).setInitialVersion(`value`.let(ResourceDefinitionVersionProperty::unwrap))
  }

  /**
   * The resource definition version to include when the resource definition is created.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("50867f78352fa50d48fb6743b07d1411a531a0a211172f41ce7254c10180603f")
  public open fun initialVersion(`value`: ResourceDefinitionVersionProperty.Builder.() -> Unit):
      Unit = initialVersion(ResourceDefinitionVersionProperty(`value`))

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of the resource definition.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the resource definition.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Application-specific metadata to attach to the resource definition.
   */
  public open fun tagsRaw(): Any? = unwrap(this).getTagsRaw()

  /**
   * Application-specific metadata to attach to the resource definition.
   */
  public open fun tagsRaw(`value`: Any) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.greengrass.CfnResourceDefinition].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     * @param initialVersion The resource definition version to include when the resource definition
     * is created. 
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     * @param initialVersion The resource definition version to include when the resource definition
     * is created. 
     */
    public fun initialVersion(initialVersion: ResourceDefinitionVersionProperty)

    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     * @param initialVersion The resource definition version to include when the resource definition
     * is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b45c7964550cb0ecf3f5f1a733f690a533a66561ec64ac86c995487386ae899")
    public fun initialVersion(initialVersion: ResourceDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * The name of the resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-name)
     * @param name The name of the resource definition. 
     */
    public fun name(name: String)

    /**
     * Application-specific metadata to attach to the resource definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-tags)
     * @param tags Application-specific metadata to attach to the resource definition. 
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.Builder
        = software.amazon.awscdk.services.greengrass.CfnResourceDefinition.Builder.create(scope, id)

    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     * @param initialVersion The resource definition version to include when the resource definition
     * is created. 
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     * @param initialVersion The resource definition version to include when the resource definition
     * is created. 
     */
    override fun initialVersion(initialVersion: ResourceDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(ResourceDefinitionVersionProperty::unwrap))
    }

    /**
     * The resource definition version to include when the resource definition is created.
     *
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
     * @param initialVersion The resource definition version to include when the resource definition
     * is created. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7b45c7964550cb0ecf3f5f1a733f690a533a66561ec64ac86c995487386ae899")
    override
        fun initialVersion(initialVersion: ResourceDefinitionVersionProperty.Builder.() -> Unit):
        Unit = initialVersion(ResourceDefinitionVersionProperty(initialVersion))

    /**
     * The name of the resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-name)
     * @param name The name of the resource definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Application-specific metadata to attach to the resource definition.
     *
     * You can use tags in IAM policies to control access to AWS IoT Greengrass resources. You can
     * also use tags to categorize your resources. For more information, see [Tagging Your AWS IoT
     * Greengrass Resources](https://docs.aws.amazon.com/greengrass/v1/developerguide/tagging.html) in
     * the *Developer Guide* .
     *
     * This `Json` property type is processed as a map of key-value pairs. It uses the following
     * format, which is different from most `Tags` implementations in AWS CloudFormation templates.
     *
     * ```
     * "Tags": { "KeyName0": "value", "KeyName1": "value", "KeyName2": "value"
     * }
     * ```
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-tags)
     * @param tags Application-specific metadata to attach to the resource definition. 
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinition =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinition.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnResourceDefinition {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnResourceDefinition(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition):
        CfnResourceDefinition = CfnResourceDefinition(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinition):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinition = wrapped.cdkObject
  }

  /**
   * A resource definition version contains a list of resources. (In AWS CloudFormation , resources
   * are named *resource instances* .).
   *
   *
   * After you create a resource definition version that contains the resources you want to deploy,
   * you must add it to your group version. For more information, see
   * [`AWS::Greengrass::Group`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-group.html)
   * .
   *
   *
   * In an AWS CloudFormation template, `ResourceDefinitionVersion` is the property type of the
   * `InitialVersion` property in the
   * [`AWS::Greengrass::ResourceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
   * resource.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.greengrass.*;
   * ResourceDefinitionVersionProperty resourceDefinitionVersionProperty =
   * ResourceDefinitionVersionProperty.builder()
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html)
   */
  public interface ResourceDefinitionVersionProperty {
    /**
     * The resources in this version.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html#cfn-greengrass-resourcedefinition-resourcedefinitionversion-resources)
     */
    public fun resources(): Any

    /**
     * A builder for [ResourceDefinitionVersionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param resources The resources in this version. 
       */
      public fun resources(resources: IResolvable)

      /**
       * @param resources The resources in this version. 
       */
      public fun resources(resources: List<Any>)

      /**
       * @param resources The resources in this version. 
       */
      public fun resources(vararg resources: Any)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty.builder()

      /**
       * @param resources The resources in this version. 
       */
      override fun resources(resources: IResolvable) {
        cdkBuilder.resources(resources.let(IResolvable::unwrap))
      }

      /**
       * @param resources The resources in this version. 
       */
      override fun resources(resources: List<Any>) {
        cdkBuilder.resources(resources)
      }

      /**
       * @param resources The resources in this version. 
       */
      override fun resources(vararg resources: Any): Unit = resources(resources.toList())

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty,
    ) : CdkObject(cdkObject), ResourceDefinitionVersionProperty {
      /**
       * The resources in this version.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedefinitionversion.html#cfn-greengrass-resourcedefinition-resourcedefinitionversion-resources)
       */
      override fun resources(): Any = unwrap(this).getResources()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ResourceDefinitionVersionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty):
          ResourceDefinitionVersionProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceDefinitionVersionProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDefinitionVersionProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDefinitionVersionProperty
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
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html)
   */
  public interface SecretsManagerSecretResourceDataProperty {
    /**
     * The staging labels whose values you want to make available on the core, in addition to
     * `AWSCURRENT` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-additionalstaginglabelstodownload)
     */
    public fun additionalStagingLabelsToDownload(): List<String> =
        unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

    /**
     * The Amazon Resource Name (ARN) of the Secrets Manager secret to make available on the core.
     *
     * The value of the secret's latest version (represented by the `AWSCURRENT` staging label) is
     * included by default.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-arn)
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty,
    ) : CdkObject(cdkObject), SecretsManagerSecretResourceDataProperty {
      /**
       * The staging labels whose values you want to make available on the core, in addition to
       * `AWSCURRENT` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-additionalstaginglabelstodownload)
       */
      override fun additionalStagingLabelsToDownload(): List<String> =
          unwrap(this).getAdditionalStagingLabelsToDownload() ?: emptyList()

      /**
       * The Amazon Resource Name (ARN) of the Secrets Manager secret to make available on the core.
       *
       * The value of the secret's latest version (represented by the `AWSCURRENT` staging label) is
       * included by default.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-secretsmanagersecretresourcedata.html#cfn-greengrass-resourcedefinition-secretsmanagersecretresourcedata-arn)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty):
          SecretsManagerSecretResourceDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SecretsManagerSecretResourceDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SecretsManagerSecretResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SecretsManagerSecretResourceDataProperty
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
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html)
   */
  public interface S3MachineLearningModelResourceDataProperty {
    /**
     * The absolute local path of the resource inside the Lambda environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-destinationpath)
     */
    public fun destinationPath(): String

    /**
     * The owner setting for the downloaded machine learning resource.
     *
     * For more information, see [Access Machine Learning Resources from Lambda
     * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html) in
     * the *Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-ownersetting)
     */
    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    /**
     * The URI of the source model in an Amazon S3 bucket.
     *
     * The model package must be in `tar.gz` or `.zip` format.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-s3uri)
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
      @JvmName("9b322291179e4c0587cd6764ee886a458c1e495c94e49aad683966fdfe3e2a6b")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      /**
       * @param s3Uri The URI of the source model in an Amazon S3 bucket. 
       * The model package must be in `tar.gz` or `.zip` format.
       */
      public fun s3Uri(s3Uri: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty.builder()

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
      @JvmName("9b322291179e4c0587cd6764ee886a458c1e495c94e49aad683966fdfe3e2a6b")
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty,
    ) : CdkObject(cdkObject), S3MachineLearningModelResourceDataProperty {
      /**
       * The absolute local path of the resource inside the Lambda environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-destinationpath)
       */
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      /**
       * The owner setting for the downloaded machine learning resource.
       *
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-ownersetting)
       */
      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      /**
       * The URI of the source model in an Amazon S3 bucket.
       *
       * The model package must be in `tar.gz` or `.zip` format.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-s3machinelearningmodelresourcedata-s3uri)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty):
          S3MachineLearningModelResourceDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          S3MachineLearningModelResourceDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: S3MachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.S3MachineLearningModelResourceDataProperty
    }
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
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html)
   */
  public interface SageMakerMachineLearningModelResourceDataProperty {
    /**
     * The absolute local path of the resource inside the Lambda environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-destinationpath)
     */
    public fun destinationPath(): String

    /**
     * The owner setting for the downloaded machine learning resource.
     *
     * For more information, see [Access Machine Learning Resources from Lambda
     * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html) in
     * the *Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-ownersetting)
     */
    public fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

    /**
     * The Amazon Resource Name (ARN) of the Amazon SageMaker training job that represents the
     * source model.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-sagemakerjobarn)
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
      @JvmName("e80aef52452dc8b668b395a82205060b415ac013a2d979f12ca8b3720a6af7e8")
      public fun ownerSetting(ownerSetting: ResourceDownloadOwnerSettingProperty.Builder.() -> Unit)

      /**
       * @param sageMakerJobArn The Amazon Resource Name (ARN) of the Amazon SageMaker training job
       * that represents the source model. 
       */
      public fun sageMakerJobArn(sageMakerJobArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty.builder()

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
      @JvmName("e80aef52452dc8b668b395a82205060b415ac013a2d979f12ca8b3720a6af7e8")
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty,
    ) : CdkObject(cdkObject), SageMakerMachineLearningModelResourceDataProperty {
      /**
       * The absolute local path of the resource inside the Lambda environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-destinationpath)
       */
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      /**
       * The owner setting for the downloaded machine learning resource.
       *
       * For more information, see [Access Machine Learning Resources from Lambda
       * Functions](https://docs.aws.amazon.com/greengrass/v1/developerguide/access-ml-resources.html)
       * in the *Developer Guide* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-ownersetting)
       */
      override fun ownerSetting(): Any? = unwrap(this).getOwnerSetting()

      /**
       * The Amazon Resource Name (ARN) of the Amazon SageMaker training job that represents the
       * source model.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html#cfn-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata-sagemakerjobarn)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty):
          SageMakerMachineLearningModelResourceDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          SageMakerMachineLearningModelResourceDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: SageMakerMachineLearningModelResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.SageMakerMachineLearningModelResourceDataProperty
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
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html)
   */
  public interface LocalVolumeResourceDataProperty {
    /**
     * The absolute local path of the resource in the Lambda environment.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html#cfn-greengrass-resourcedefinition-localvolumeresourcedata-destinationpath)
     */
    public fun destinationPath(): String

    /**
     * Settings that define additional Linux OS group permissions to give to the Lambda function
     * process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html#cfn-greengrass-resourcedefinition-localvolumeresourcedata-groupownersetting)
     */
    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    /**
     * The local absolute path of the volume resource on the host.
     *
     * The source path for a volume resource type cannot start with `/sys` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html#cfn-greengrass-resourcedefinition-localvolumeresourcedata-sourcepath)
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
      @JvmName("d2ba809514e8753cc7b3c36c4756ea36411805335e2f2e214e4b3a274cca3c2f")
      public fun groupOwnerSetting(groupOwnerSetting: GroupOwnerSettingProperty.Builder.() -> Unit)

      /**
       * @param sourcePath The local absolute path of the volume resource on the host. 
       * The source path for a volume resource type cannot start with `/sys` .
       */
      public fun sourcePath(sourcePath: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty.builder()

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
      @JvmName("d2ba809514e8753cc7b3c36c4756ea36411805335e2f2e214e4b3a274cca3c2f")
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty,
    ) : CdkObject(cdkObject), LocalVolumeResourceDataProperty {
      /**
       * The absolute local path of the resource in the Lambda environment.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html#cfn-greengrass-resourcedefinition-localvolumeresourcedata-destinationpath)
       */
      override fun destinationPath(): String = unwrap(this).getDestinationPath()

      /**
       * Settings that define additional Linux OS group permissions to give to the Lambda function
       * process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html#cfn-greengrass-resourcedefinition-localvolumeresourcedata-groupownersetting)
       */
      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      /**
       * The local absolute path of the volume resource on the host.
       *
       * The source path for a volume resource type cannot start with `/sys` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html#cfn-greengrass-resourcedefinition-localvolumeresourcedata-sourcepath)
       */
      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalVolumeResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty):
          LocalVolumeResourceDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocalVolumeResourceDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalVolumeResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalVolumeResourceDataProperty
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
   * [`ResourceDataContainer`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html)
   */
  public interface LocalDeviceResourceDataProperty {
    /**
     * Settings that define additional Linux OS group permissions to give to the Lambda function
     * process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-groupownersetting)
     */
    public fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

    /**
     * The local absolute path of the device resource.
     *
     * The source path for a device resource can refer only to a character device or block device
     * under `/dev` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-sourcepath)
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
      @JvmName("3aa219c6edc900b545d41570be768782e2e9cccf35bda45acb6abddf3a2155e4")
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty.builder()

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
      @JvmName("3aa219c6edc900b545d41570be768782e2e9cccf35bda45acb6abddf3a2155e4")
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty,
    ) : CdkObject(cdkObject), LocalDeviceResourceDataProperty {
      /**
       * Settings that define additional Linux OS group permissions to give to the Lambda function
       * process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-groupownersetting)
       */
      override fun groupOwnerSetting(): Any? = unwrap(this).getGroupOwnerSetting()

      /**
       * The local absolute path of the device resource.
       *
       * The source path for a device resource can refer only to a character device or block device
       * under `/dev` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html#cfn-greengrass-resourcedefinition-localdeviceresourcedata-sourcepath)
       */
      override fun sourcePath(): String = unwrap(this).getSourcePath()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LocalDeviceResourceDataProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty):
          LocalDeviceResourceDataProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LocalDeviceResourceDataProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LocalDeviceResourceDataProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.LocalDeviceResourceDataProperty
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
   * [`AWS::Greengrass::ResourceDefinition`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
   */
  public interface ResourceInstanceProperty {
    /**
     * A descriptive or arbitrary ID for the resource.
     *
     * This value must be unique within the resource definition version. Maximum length is 128
     * characters with pattern `[a-zA-Z0-9:_-]+` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html#cfn-greengrass-resourcedefinition-resourceinstance-id)
     */
    public fun id(): String

    /**
     * The descriptive resource name, which is displayed on the AWS IoT Greengrass console.
     *
     * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
     * Greengrass group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html#cfn-greengrass-resourcedefinition-resourceinstance-name)
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
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html#cfn-greengrass-resourcedefinition-resourceinstance-resourcedatacontainer)
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
      @JvmName("5f37c08c90f935f1f997b4f8c90ea5149cdc55f38601647c2878651ff719535a")
      public
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty.builder()

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
      @JvmName("5f37c08c90f935f1f997b4f8c90ea5149cdc55f38601647c2878651ff719535a")
      override
          fun resourceDataContainer(resourceDataContainer: ResourceDataContainerProperty.Builder.() -> Unit):
          Unit = resourceDataContainer(ResourceDataContainerProperty(resourceDataContainer))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty,
    ) : CdkObject(cdkObject), ResourceInstanceProperty {
      /**
       * A descriptive or arbitrary ID for the resource.
       *
       * This value must be unique within the resource definition version. Maximum length is 128
       * characters with pattern `[a-zA-Z0-9:_-]+` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html#cfn-greengrass-resourcedefinition-resourceinstance-id)
       */
      override fun id(): String = unwrap(this).getId()

      /**
       * The descriptive resource name, which is displayed on the AWS IoT Greengrass console.
       *
       * Maximum length 128 characters with pattern [a-zA-Z0-9:_-]+. This must be unique within a
       * Greengrass group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html#cfn-greengrass-resourcedefinition-resourceinstance-name)
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
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html#cfn-greengrass-resourcedefinition-resourceinstance-resourcedatacontainer)
       */
      override fun resourceDataContainer(): Any = unwrap(this).getResourceDataContainer()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): ResourceInstanceProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty):
          ResourceInstanceProperty = CdkObjectWrappers.wrap(cdkObject) as? ResourceInstanceProperty
          ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceInstanceProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceInstanceProperty
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
   * [`ResourceInstance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html)
   */
  public interface ResourceDataContainerProperty {
    /**
     * Settings for a local device resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-localdeviceresourcedata)
     */
    public fun localDeviceResourceData(): Any? = unwrap(this).getLocalDeviceResourceData()

    /**
     * Settings for a local volume resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-localvolumeresourcedata)
     */
    public fun localVolumeResourceData(): Any? = unwrap(this).getLocalVolumeResourceData()

    /**
     * Settings for a machine learning resource stored in Amazon S3 .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-s3machinelearningmodelresourcedata)
     */
    public fun s3MachineLearningModelResourceData(): Any? =
        unwrap(this).getS3MachineLearningModelResourceData()

    /**
     * Settings for a machine learning resource saved as an SageMaker training job.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-sagemakermachinelearningmodelresourcedata)
     */
    public fun sageMakerMachineLearningModelResourceData(): Any? =
        unwrap(this).getSageMakerMachineLearningModelResourceData()

    /**
     * Settings for a secret resource.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-secretsmanagersecretresourcedata)
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
      @JvmName("f18045f1a07083f608f8030c060c6ce07e5582e55faceb64f61aca27f171b8e2")
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
      @JvmName("8e671e3203a0dd456cfd14a4c2526402225b1aa9d59f134b8479ce9b1159955b")
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
      @JvmName("0db1d9d931fd3c1477d3a734d7fb1f94b5658b2191fe5941d654f0c1a196a1ad")
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
      @JvmName("d765df094e5bca3ebc387e99ef4bcf53f5556f1662b724d4ad3cdb9393a53ac2")
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
      @JvmName("9b7b73f807c94710295a55c1b244c751cbad3689f0201541e7e78f9bf18b3182")
      public
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty.builder()

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
      @JvmName("f18045f1a07083f608f8030c060c6ce07e5582e55faceb64f61aca27f171b8e2")
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
      @JvmName("8e671e3203a0dd456cfd14a4c2526402225b1aa9d59f134b8479ce9b1159955b")
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
      @JvmName("0db1d9d931fd3c1477d3a734d7fb1f94b5658b2191fe5941d654f0c1a196a1ad")
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
      @JvmName("d765df094e5bca3ebc387e99ef4bcf53f5556f1662b724d4ad3cdb9393a53ac2")
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
      @JvmName("9b7b73f807c94710295a55c1b244c751cbad3689f0201541e7e78f9bf18b3182")
      override
          fun secretsManagerSecretResourceData(secretsManagerSecretResourceData: SecretsManagerSecretResourceDataProperty.Builder.() -> Unit):
          Unit =
          secretsManagerSecretResourceData(SecretsManagerSecretResourceDataProperty(secretsManagerSecretResourceData))

      public fun build():
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty,
    ) : CdkObject(cdkObject), ResourceDataContainerProperty {
      /**
       * Settings for a local device resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-localdeviceresourcedata)
       */
      override fun localDeviceResourceData(): Any? = unwrap(this).getLocalDeviceResourceData()

      /**
       * Settings for a local volume resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-localvolumeresourcedata)
       */
      override fun localVolumeResourceData(): Any? = unwrap(this).getLocalVolumeResourceData()

      /**
       * Settings for a machine learning resource stored in Amazon S3 .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-s3machinelearningmodelresourcedata)
       */
      override fun s3MachineLearningModelResourceData(): Any? =
          unwrap(this).getS3MachineLearningModelResourceData()

      /**
       * Settings for a machine learning resource saved as an SageMaker training job.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-sagemakermachinelearningmodelresourcedata)
       */
      override fun sageMakerMachineLearningModelResourceData(): Any? =
          unwrap(this).getSageMakerMachineLearningModelResourceData()

      /**
       * Settings for a secret resource.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedatacontainer.html#cfn-greengrass-resourcedefinition-resourcedatacontainer-secretsmanagersecretresourcedata)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty):
          ResourceDataContainerProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceDataContainerProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDataContainerProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDataContainerProperty
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
   * [`S3MachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-s3machinelearningmodelresourcedata.html)
   * and
   * [`SageMakerMachineLearningModelResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-sagemakermachinelearningmodelresourcedata.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedownloadownersetting.html)
   */
  public interface ResourceDownloadOwnerSettingProperty {
    /**
     * The group owner of the machine learning resource.
     *
     * This is the group ID (GID) of an existing Linux OS group on the system. The group's
     * permissions are added to the Lambda process.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinition-resourcedownloadownersetting-groupowner)
     */
    public fun groupOwner(): String

    /**
     * The permissions that the group owner has to the machine learning resource.
     *
     * Valid values are `rw` (read-write) or `ro` (read-only).
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinition-resourcedownloadownersetting-grouppermission)
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty,
    ) : CdkObject(cdkObject), ResourceDownloadOwnerSettingProperty {
      /**
       * The group owner of the machine learning resource.
       *
       * This is the group ID (GID) of an existing Linux OS group on the system. The group's
       * permissions are added to the Lambda process.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinition-resourcedownloadownersetting-groupowner)
       */
      override fun groupOwner(): String = unwrap(this).getGroupOwner()

      /**
       * The permissions that the group owner has to the machine learning resource.
       *
       * Valid values are `rw` (read-write) or `ro` (read-only).
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourcedownloadownersetting.html#cfn-greengrass-resourcedefinition-resourcedownloadownersetting-grouppermission)
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
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty):
          ResourceDownloadOwnerSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ResourceDownloadOwnerSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ResourceDownloadOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.ResourceDownloadOwnerSettingProperty
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
   * [`LocalDeviceResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localdeviceresourcedata.html)
   * and
   * [`LocalVolumeResourceData`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-localvolumeresourcedata.html)
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
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html)
   */
  public interface GroupOwnerSettingProperty {
    /**
     * Indicates whether to give the privileges of the Linux group that owns the resource to the
     * Lambda process.
     *
     * This gives the Lambda process the file access permissions of the Linux group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html#cfn-greengrass-resourcedefinition-groupownersetting-autoaddgroupowner)
     */
    public fun autoAddGroupOwner(): Any

    /**
     * The name of the Linux group whose privileges you want to add to the Lambda process.
     *
     * This value is ignored if `AutoAddGroupOwner` is true.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html#cfn-greengrass-resourcedefinition-groupownersetting-groupowner)
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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty.Builder
          =
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty.builder()

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
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty,
    ) : CdkObject(cdkObject), GroupOwnerSettingProperty {
      /**
       * Indicates whether to give the privileges of the Linux group that owns the resource to the
       * Lambda process.
       *
       * This gives the Lambda process the file access permissions of the Linux group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html#cfn-greengrass-resourcedefinition-groupownersetting-autoaddgroupowner)
       */
      override fun autoAddGroupOwner(): Any = unwrap(this).getAutoAddGroupOwner()

      /**
       * The name of the Linux group whose privileges you want to add to the Lambda process.
       *
       * This value is ignored if `AutoAddGroupOwner` is true.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-groupownersetting.html#cfn-greengrass-resourcedefinition-groupownersetting-groupowner)
       */
      override fun groupOwner(): String? = unwrap(this).getGroupOwner()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): GroupOwnerSettingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty):
          GroupOwnerSettingProperty = CdkObjectWrappers.wrap(cdkObject) as?
          GroupOwnerSettingProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: GroupOwnerSettingProperty):
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.greengrass.CfnResourceDefinition.GroupOwnerSettingProperty
    }
  }
}
