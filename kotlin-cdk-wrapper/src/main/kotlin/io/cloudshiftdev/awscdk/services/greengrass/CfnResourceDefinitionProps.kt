@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.greengrass

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnResourceDefinition`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.greengrass.*;
 * Object tags;
 * CfnResourceDefinitionProps cfnResourceDefinitionProps = CfnResourceDefinitionProps.builder()
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
public interface CfnResourceDefinitionProps {
  /**
   * The resource definition version to include when the resource definition is created.
   *
   * A resource definition version contains a list of [`resource
   * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
   * property types.
   *
   *
   * To associate a resource definition version after the resource definition is created, create an
   * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
   * resource and specify the ID of this resource definition.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-initialversion)
   */
  public fun initialVersion(): Any? = unwrap(this).getInitialVersion()

  /**
   * The name of the resource definition.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-name)
   */
  public fun name(): String

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
   */
  public fun tags(): Any? = unwrap(this).getTags()

  /**
   * A builder for [CfnResourceDefinitionProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param initialVersion The resource definition version to include when the resource definition
     * is created.
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     */
    public fun initialVersion(initialVersion: IResolvable)

    /**
     * @param initialVersion The resource definition version to include when the resource definition
     * is created.
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     */
    public
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty)

    /**
     * @param initialVersion The resource definition version to include when the resource definition
     * is created.
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25aa5059095f95a5b51e1d5cf4fe020f7e29e43f6c40a6eca7db8fc2096ff0b")
    public
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder.() -> Unit)

    /**
     * @param name The name of the resource definition. 
     */
    public fun name(name: String)

    /**
     * @param tags Application-specific metadata to attach to the resource definition.
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
     */
    public fun tags(tags: Any)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps.Builder =
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps.builder()

    /**
     * @param initialVersion The resource definition version to include when the resource definition
     * is created.
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     */
    override fun initialVersion(initialVersion: IResolvable) {
      cdkBuilder.initialVersion(initialVersion.let(IResolvable::unwrap))
    }

    /**
     * @param initialVersion The resource definition version to include when the resource definition
     * is created.
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     */
    override
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty) {
      cdkBuilder.initialVersion(initialVersion.let(CfnResourceDefinition.ResourceDefinitionVersionProperty::unwrap))
    }

    /**
     * @param initialVersion The resource definition version to include when the resource definition
     * is created.
     * A resource definition version contains a list of [`resource
     * instance`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-greengrass-resourcedefinition-resourceinstance.html)
     * property types.
     *
     *
     * To associate a resource definition version after the resource definition is created, create
     * an
     * [`AWS::Greengrass::ResourceDefinitionVersion`](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinitionversion.html)
     * resource and specify the ID of this resource definition.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d25aa5059095f95a5b51e1d5cf4fe020f7e29e43f6c40a6eca7db8fc2096ff0b")
    override
        fun initialVersion(initialVersion: CfnResourceDefinition.ResourceDefinitionVersionProperty.Builder.() -> Unit):
        Unit =
        initialVersion(CfnResourceDefinition.ResourceDefinitionVersionProperty(initialVersion))

    /**
     * @param name The name of the resource definition. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Application-specific metadata to attach to the resource definition.
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
     */
    override fun tags(tags: Any) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps,
  ) : CdkObject(cdkObject), CfnResourceDefinitionProps {
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
     */
    override fun initialVersion(): Any? = unwrap(this).getInitialVersion()

    /**
     * The name of the resource definition.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-greengrass-resourcedefinition.html#cfn-greengrass-resourcedefinition-name)
     */
    override fun name(): String = unwrap(this).getName()

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
     */
    override fun tags(): Any? = unwrap(this).getTags()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnResourceDefinitionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps):
        CfnResourceDefinitionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnResourceDefinitionProps):
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.greengrass.CfnResourceDefinitionProps
  }
}
