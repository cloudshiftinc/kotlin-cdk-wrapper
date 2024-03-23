@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

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
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * A distribution configuration allows you to specify the name and description of your output AMI,
 * authorize other AWS account s to launch the AMI, and replicate the AMI to other AWS Regions .
 *
 * It also allows you to export the AMI to Amazon S3 .
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * Object amiDistributionConfiguration;
 * Object containerDistributionConfiguration;
 * CfnDistributionConfiguration cfnDistributionConfiguration =
 * CfnDistributionConfiguration.Builder.create(this, "MyCfnDistributionConfiguration")
 * .distributions(List.of(DistributionProperty.builder()
 * .region("region")
 * // the properties below are optional
 * .amiDistributionConfiguration(amiDistributionConfiguration)
 * .containerDistributionConfiguration(containerDistributionConfiguration)
 * .fastLaunchConfigurations(List.of(FastLaunchConfigurationProperty.builder()
 * .accountId("accountId")
 * .enabled(false)
 * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
 * .launchTemplateId("launchTemplateId")
 * .launchTemplateName("launchTemplateName")
 * .launchTemplateVersion("launchTemplateVersion")
 * .build())
 * .maxParallelLaunches(123)
 * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
 * .targetResourceCount(123)
 * .build())
 * .build()))
 * .launchTemplateConfigurations(List.of(LaunchTemplateConfigurationProperty.builder()
 * .accountId("accountId")
 * .launchTemplateId("launchTemplateId")
 * .setDefaultVersion(false)
 * .build()))
 * .licenseConfigurationArns(List.of("licenseConfigurationArns"))
 * .build()))
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html)
 */
public open class CfnDistributionConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDistributionConfigurationProps,
  ) :
      this(software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration(scope.let(CloudshiftdevConstructsConstruct::unwrap),
      id, props.let(CfnDistributionConfigurationProps::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnDistributionConfigurationProps.Builder.() -> Unit,
  ) : this(scope, id, CfnDistributionConfigurationProps(props)
  )

  /**
   * Returns the Amazon Resource Name (ARN) of this distribution configuration.
   *
   * The following pattern is applied:
   * `^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe|infrastructure-configuration|distribution-configuration|component|image|image-pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * Returns the name of the distribution configuration.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The description of this distribution configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of this distribution configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   */
  public open fun distributions(): Any = unwrap(this).getDistributions()

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   */
  public open fun distributions(`value`: IResolvable) {
    unwrap(this).setDistributions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   */
  public open fun distributions(`value`: List<Any>) {
    unwrap(this).setDistributions(`value`)
  }

  /**
   * The distributions of this distribution configuration formatted as an array of Distribution
   * objects.
   */
  public open fun distributions(vararg `value`: Any): Unit = distributions(`value`.toList())

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector::unwrap))
  }

  /**
   * The name of this distribution configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of this distribution configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of this distribution configuration.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags of this distribution configuration.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.imagebuilder.CfnDistributionConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-description)
     * @param description The description of this distribution configuration. 
     */
    public fun description(description: String)

    /**
     * The distributions of this distribution configuration formatted as an array of Distribution
     * objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    public fun distributions(distributions: IResolvable)

    /**
     * The distributions of this distribution configuration formatted as an array of Distribution
     * objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    public fun distributions(distributions: List<Any>)

    /**
     * The distributions of this distribution configuration formatted as an array of Distribution
     * objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    public fun distributions(vararg distributions: Any)

    /**
     * The name of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-name)
     * @param name The name of this distribution configuration. 
     */
    public fun name(name: String)

    /**
     * The tags of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-tags)
     * @param tags The tags of this distribution configuration. 
     */
    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.Builder.create(scope,
        id)

    /**
     * The description of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-description)
     * @param description The description of this distribution configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The distributions of this distribution configuration formatted as an array of Distribution
     * objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    override fun distributions(distributions: IResolvable) {
      cdkBuilder.distributions(distributions.let(IResolvable::unwrap))
    }

    /**
     * The distributions of this distribution configuration formatted as an array of Distribution
     * objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    override fun distributions(distributions: List<Any>) {
      cdkBuilder.distributions(distributions)
    }

    /**
     * The distributions of this distribution configuration formatted as an array of Distribution
     * objects.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-distributions)
     * @param distributions The distributions of this distribution configuration formatted as an
     * array of Distribution objects. 
     */
    override fun distributions(vararg distributions: Any): Unit =
        distributions(distributions.toList())

    /**
     * The name of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-name)
     * @param name The name of this distribution configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags of this distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-distributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-tags)
     * @param tags The tags of this distribution configuration. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnDistributionConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnDistributionConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration):
        CfnDistributionConfiguration = CfnDistributionConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnDistributionConfiguration):
        software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration =
        wrapped.cdkObject
  }

  /**
   * Define and configure the output AMIs of the pipeline.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * AmiDistributionConfigurationProperty amiDistributionConfigurationProperty =
   * AmiDistributionConfigurationProperty.builder()
   * .amiTags(Map.of(
   * "amiTagsKey", "amiTags"))
   * .description("description")
   * .kmsKeyId("kmsKeyId")
   * .launchPermissionConfiguration(LaunchPermissionConfigurationProperty.builder()
   * .organizationalUnitArns(List.of("organizationalUnitArns"))
   * .organizationArns(List.of("organizationArns"))
   * .userGroups(List.of("userGroups"))
   * .userIds(List.of("userIds"))
   * .build())
   * .name("name")
   * .targetAccountIds(List.of("targetAccountIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html)
   */
  public interface AmiDistributionConfigurationProperty {
    /**
     * The tags to apply to AMIs distributed to this Region.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-amitags)
     */
    public fun amiTags(): Any? = unwrap(this).getAmiTags()

    /**
     * The description of the AMI distribution configuration.
     *
     * Minimum and maximum length are in characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The KMS key identifier used to encrypt the distributed image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-kmskeyid)
     */
    public fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

    /**
     * Launch permissions can be used to configure which AWS account s can use the AMI to launch
     * instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-launchpermissionconfiguration)
     */
    public fun launchPermissionConfiguration(): Any? =
        unwrap(this).getLaunchPermissionConfiguration()

    /**
     * The name of the output AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-name)
     */
    public fun name(): String? = unwrap(this).getName()

    /**
     * The ID of an account to which you want to distribute an image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-targetaccountids)
     */
    public fun targetAccountIds(): List<String> = unwrap(this).getTargetAccountIds() ?: emptyList()

    /**
     * A builder for [AmiDistributionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amiTags The tags to apply to AMIs distributed to this Region.
       */
      public fun amiTags(amiTags: IResolvable)

      /**
       * @param amiTags The tags to apply to AMIs distributed to this Region.
       */
      public fun amiTags(amiTags: Map<String, String>)

      /**
       * @param description The description of the AMI distribution configuration.
       * Minimum and maximum length are in characters.
       */
      public fun description(description: String)

      /**
       * @param kmsKeyId The KMS key identifier used to encrypt the distributed image.
       */
      public fun kmsKeyId(kmsKeyId: String)

      /**
       * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
       * account s can use the AMI to launch instances.
       */
      public fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable)

      /**
       * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
       * account s can use the AMI to launch instances.
       */
      public
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty)

      /**
       * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
       * account s can use the AMI to launch instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c400002ce94b557f48fb2d2253a5a8693c5b10c052fff0404053ec670f8ec6f1")
      public
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty.Builder.() -> Unit)

      /**
       * @param name The name of the output AMI.
       */
      public fun name(name: String)

      /**
       * @param targetAccountIds The ID of an account to which you want to distribute an image.
       */
      public fun targetAccountIds(targetAccountIds: List<String>)

      /**
       * @param targetAccountIds The ID of an account to which you want to distribute an image.
       */
      public fun targetAccountIds(vararg targetAccountIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty.builder()

      /**
       * @param amiTags The tags to apply to AMIs distributed to this Region.
       */
      override fun amiTags(amiTags: IResolvable) {
        cdkBuilder.amiTags(amiTags.let(IResolvable::unwrap))
      }

      /**
       * @param amiTags The tags to apply to AMIs distributed to this Region.
       */
      override fun amiTags(amiTags: Map<String, String>) {
        cdkBuilder.amiTags(amiTags)
      }

      /**
       * @param description The description of the AMI distribution configuration.
       * Minimum and maximum length are in characters.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param kmsKeyId The KMS key identifier used to encrypt the distributed image.
       */
      override fun kmsKeyId(kmsKeyId: String) {
        cdkBuilder.kmsKeyId(kmsKeyId)
      }

      /**
       * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
       * account s can use the AMI to launch instances.
       */
      override fun launchPermissionConfiguration(launchPermissionConfiguration: IResolvable) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
       * account s can use the AMI to launch instances.
       */
      override
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty) {
        cdkBuilder.launchPermissionConfiguration(launchPermissionConfiguration.let(LaunchPermissionConfigurationProperty::unwrap))
      }

      /**
       * @param launchPermissionConfiguration Launch permissions can be used to configure which AWS
       * account s can use the AMI to launch instances.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("c400002ce94b557f48fb2d2253a5a8693c5b10c052fff0404053ec670f8ec6f1")
      override
          fun launchPermissionConfiguration(launchPermissionConfiguration: LaunchPermissionConfigurationProperty.Builder.() -> Unit):
          Unit =
          launchPermissionConfiguration(LaunchPermissionConfigurationProperty(launchPermissionConfiguration))

      /**
       * @param name The name of the output AMI.
       */
      override fun name(name: String) {
        cdkBuilder.name(name)
      }

      /**
       * @param targetAccountIds The ID of an account to which you want to distribute an image.
       */
      override fun targetAccountIds(targetAccountIds: List<String>) {
        cdkBuilder.targetAccountIds(targetAccountIds)
      }

      /**
       * @param targetAccountIds The ID of an account to which you want to distribute an image.
       */
      override fun targetAccountIds(vararg targetAccountIds: String): Unit =
          targetAccountIds(targetAccountIds.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty,
    ) : CdkObject(cdkObject), AmiDistributionConfigurationProperty {
      /**
       * The tags to apply to AMIs distributed to this Region.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-amitags)
       */
      override fun amiTags(): Any? = unwrap(this).getAmiTags()

      /**
       * The description of the AMI distribution configuration.
       *
       * Minimum and maximum length are in characters.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The KMS key identifier used to encrypt the distributed image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-kmskeyid)
       */
      override fun kmsKeyId(): String? = unwrap(this).getKmsKeyId()

      /**
       * Launch permissions can be used to configure which AWS account s can use the AMI to launch
       * instances.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-launchpermissionconfiguration)
       */
      override fun launchPermissionConfiguration(): Any? =
          unwrap(this).getLaunchPermissionConfiguration()

      /**
       * The name of the output AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-name)
       */
      override fun name(): String? = unwrap(this).getName()

      /**
       * The ID of an account to which you want to distribute an image.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-amidistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-amidistributionconfiguration-targetaccountids)
       */
      override fun targetAccountIds(): List<String> = unwrap(this).getTargetAccountIds() ?:
          emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          AmiDistributionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty):
          AmiDistributionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          AmiDistributionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: AmiDistributionConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.AmiDistributionConfigurationProperty
    }
  }

  /**
   * Container distribution settings for encryption, licensing, and sharing in a specific Region.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * ContainerDistributionConfigurationProperty containerDistributionConfigurationProperty =
   * ContainerDistributionConfigurationProperty.builder()
   * .containerTags(List.of("containerTags"))
   * .description("description")
   * .targetRepository(TargetContainerRepositoryProperty.builder()
   * .repositoryName("repositoryName")
   * .service("service")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html)
   */
  public interface ContainerDistributionConfigurationProperty {
    /**
     * Tags that are attached to the container distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-containerdistributionconfiguration-containertags)
     */
    public fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

    /**
     * The description of the container distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-containerdistributionconfiguration-description)
     */
    public fun description(): String? = unwrap(this).getDescription()

    /**
     * The destination repository for the container distribution configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-containerdistributionconfiguration-targetrepository)
     */
    public fun targetRepository(): Any? = unwrap(this).getTargetRepository()

    /**
     * A builder for [ContainerDistributionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param containerTags Tags that are attached to the container distribution configuration.
       */
      public fun containerTags(containerTags: List<String>)

      /**
       * @param containerTags Tags that are attached to the container distribution configuration.
       */
      public fun containerTags(vararg containerTags: String)

      /**
       * @param description The description of the container distribution configuration.
       */
      public fun description(description: String)

      /**
       * @param targetRepository The destination repository for the container distribution
       * configuration.
       */
      public fun targetRepository(targetRepository: IResolvable)

      /**
       * @param targetRepository The destination repository for the container distribution
       * configuration.
       */
      public fun targetRepository(targetRepository: TargetContainerRepositoryProperty)

      /**
       * @param targetRepository The destination repository for the container distribution
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3abe93f8cd08350c006e560c9641d8a913b8a8e7ec17314f270edbe34b657032")
      public
          fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty.builder()

      /**
       * @param containerTags Tags that are attached to the container distribution configuration.
       */
      override fun containerTags(containerTags: List<String>) {
        cdkBuilder.containerTags(containerTags)
      }

      /**
       * @param containerTags Tags that are attached to the container distribution configuration.
       */
      override fun containerTags(vararg containerTags: String): Unit =
          containerTags(containerTags.toList())

      /**
       * @param description The description of the container distribution configuration.
       */
      override fun description(description: String) {
        cdkBuilder.description(description)
      }

      /**
       * @param targetRepository The destination repository for the container distribution
       * configuration.
       */
      override fun targetRepository(targetRepository: IResolvable) {
        cdkBuilder.targetRepository(targetRepository.let(IResolvable::unwrap))
      }

      /**
       * @param targetRepository The destination repository for the container distribution
       * configuration.
       */
      override fun targetRepository(targetRepository: TargetContainerRepositoryProperty) {
        cdkBuilder.targetRepository(targetRepository.let(TargetContainerRepositoryProperty::unwrap))
      }

      /**
       * @param targetRepository The destination repository for the container distribution
       * configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("3abe93f8cd08350c006e560c9641d8a913b8a8e7ec17314f270edbe34b657032")
      override
          fun targetRepository(targetRepository: TargetContainerRepositoryProperty.Builder.() -> Unit):
          Unit = targetRepository(TargetContainerRepositoryProperty(targetRepository))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty,
    ) : CdkObject(cdkObject), ContainerDistributionConfigurationProperty {
      /**
       * Tags that are attached to the container distribution configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-containerdistributionconfiguration-containertags)
       */
      override fun containerTags(): List<String> = unwrap(this).getContainerTags() ?: emptyList()

      /**
       * The description of the container distribution configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-containerdistributionconfiguration-description)
       */
      override fun description(): String? = unwrap(this).getDescription()

      /**
       * The destination repository for the container distribution configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-containerdistributionconfiguration.html#cfn-imagebuilder-distributionconfiguration-containerdistributionconfiguration-targetrepository)
       */
      override fun targetRepository(): Any? = unwrap(this).getTargetRepository()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          ContainerDistributionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty):
          ContainerDistributionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          ContainerDistributionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: ContainerDistributionConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.ContainerDistributionConfigurationProperty
    }
  }

  /**
   * The distribution configuration distribution defines the settings for a specific Region in the
   * Distribution Configuration.
   *
   * You must specify whether the distribution is for an AMI or a container image. To do so, include
   * exactly one of the following data types for your distribution:
   *
   * * amiDistributionConfiguration
   * * containerDistributionConfiguration
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * Object amiDistributionConfiguration;
   * Object containerDistributionConfiguration;
   * DistributionProperty distributionProperty = DistributionProperty.builder()
   * .region("region")
   * // the properties below are optional
   * .amiDistributionConfiguration(amiDistributionConfiguration)
   * .containerDistributionConfiguration(containerDistributionConfiguration)
   * .fastLaunchConfigurations(List.of(FastLaunchConfigurationProperty.builder()
   * .accountId("accountId")
   * .enabled(false)
   * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .launchTemplateVersion("launchTemplateVersion")
   * .build())
   * .maxParallelLaunches(123)
   * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
   * .targetResourceCount(123)
   * .build())
   * .build()))
   * .launchTemplateConfigurations(List.of(LaunchTemplateConfigurationProperty.builder()
   * .accountId("accountId")
   * .launchTemplateId("launchTemplateId")
   * .setDefaultVersion(false)
   * .build()))
   * .licenseConfigurationArns(List.of("licenseConfigurationArns"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html)
   */
  public interface DistributionProperty {
    /**
     * The specific AMI settings, such as launch permissions and AMI tags.
     *
     * For details, see example schema below.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-amidistributionconfiguration)
     */
    public fun amiDistributionConfiguration(): Any? = unwrap(this).getAmiDistributionConfiguration()

    /**
     * Container distribution settings for encryption, licensing, and sharing in a specific Region.
     *
     * For details, see example schema below.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-containerdistributionconfiguration)
     */
    public fun containerDistributionConfiguration(): Any? =
        unwrap(this).getContainerDistributionConfiguration()

    /**
     * The Windows faster-launching configurations to use for AMI distribution.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-fastlaunchconfigurations)
     */
    public fun fastLaunchConfigurations(): Any? = unwrap(this).getFastLaunchConfigurations()

    /**
     * A group of launchTemplateConfiguration settings that apply to image distribution for
     * specified accounts.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-launchtemplateconfigurations)
     */
    public fun launchTemplateConfigurations(): Any? = unwrap(this).getLaunchTemplateConfigurations()

    /**
     * The License Manager Configuration to associate with the AMI in the specified Region.
     *
     * For more information, see the [LicenseConfiguration
     * API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-licenseconfigurationarns)
     */
    public fun licenseConfigurationArns(): List<String> = unwrap(this).getLicenseConfigurationArns()
        ?: emptyList()

    /**
     * The target Region for the Distribution Configuration.
     *
     * For example, `eu-west-1` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-region)
     */
    public fun region(): String

    /**
     * A builder for [DistributionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param amiDistributionConfiguration The specific AMI settings, such as launch permissions
       * and AMI tags.
       * For details, see example schema below.
       */
      public fun amiDistributionConfiguration(amiDistributionConfiguration: Any)

      /**
       * @param containerDistributionConfiguration Container distribution settings for encryption,
       * licensing, and sharing in a specific Region.
       * For details, see example schema below.
       */
      public fun containerDistributionConfiguration(containerDistributionConfiguration: Any)

      /**
       * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
       * distribution.
       */
      public fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable)

      /**
       * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
       * distribution.
       */
      public fun fastLaunchConfigurations(fastLaunchConfigurations: List<Any>)

      /**
       * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
       * distribution.
       */
      public fun fastLaunchConfigurations(vararg fastLaunchConfigurations: Any)

      /**
       * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
       * apply to image distribution for specified accounts.
       */
      public fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable)

      /**
       * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
       * apply to image distribution for specified accounts.
       */
      public fun launchTemplateConfigurations(launchTemplateConfigurations: List<Any>)

      /**
       * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
       * apply to image distribution for specified accounts.
       */
      public fun launchTemplateConfigurations(vararg launchTemplateConfigurations: Any)

      /**
       * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI
       * in the specified Region.
       * For more information, see the [LicenseConfiguration
       * API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
       * .
       */
      public fun licenseConfigurationArns(licenseConfigurationArns: List<String>)

      /**
       * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI
       * in the specified Region.
       * For more information, see the [LicenseConfiguration
       * API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
       * .
       */
      public fun licenseConfigurationArns(vararg licenseConfigurationArns: String)

      /**
       * @param region The target Region for the Distribution Configuration. 
       * For example, `eu-west-1` .
       */
      public fun region(region: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty.builder()

      /**
       * @param amiDistributionConfiguration The specific AMI settings, such as launch permissions
       * and AMI tags.
       * For details, see example schema below.
       */
      override fun amiDistributionConfiguration(amiDistributionConfiguration: Any) {
        cdkBuilder.amiDistributionConfiguration(amiDistributionConfiguration)
      }

      /**
       * @param containerDistributionConfiguration Container distribution settings for encryption,
       * licensing, and sharing in a specific Region.
       * For details, see example schema below.
       */
      override fun containerDistributionConfiguration(containerDistributionConfiguration: Any) {
        cdkBuilder.containerDistributionConfiguration(containerDistributionConfiguration)
      }

      /**
       * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
       * distribution.
       */
      override fun fastLaunchConfigurations(fastLaunchConfigurations: IResolvable) {
        cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
       * distribution.
       */
      override fun fastLaunchConfigurations(fastLaunchConfigurations: List<Any>) {
        cdkBuilder.fastLaunchConfigurations(fastLaunchConfigurations)
      }

      /**
       * @param fastLaunchConfigurations The Windows faster-launching configurations to use for AMI
       * distribution.
       */
      override fun fastLaunchConfigurations(vararg fastLaunchConfigurations: Any): Unit =
          fastLaunchConfigurations(fastLaunchConfigurations.toList())

      /**
       * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
       * apply to image distribution for specified accounts.
       */
      override fun launchTemplateConfigurations(launchTemplateConfigurations: IResolvable) {
        cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
       * apply to image distribution for specified accounts.
       */
      override fun launchTemplateConfigurations(launchTemplateConfigurations: List<Any>) {
        cdkBuilder.launchTemplateConfigurations(launchTemplateConfigurations)
      }

      /**
       * @param launchTemplateConfigurations A group of launchTemplateConfiguration settings that
       * apply to image distribution for specified accounts.
       */
      override fun launchTemplateConfigurations(vararg launchTemplateConfigurations: Any): Unit =
          launchTemplateConfigurations(launchTemplateConfigurations.toList())

      /**
       * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI
       * in the specified Region.
       * For more information, see the [LicenseConfiguration
       * API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
       * .
       */
      override fun licenseConfigurationArns(licenseConfigurationArns: List<String>) {
        cdkBuilder.licenseConfigurationArns(licenseConfigurationArns)
      }

      /**
       * @param licenseConfigurationArns The License Manager Configuration to associate with the AMI
       * in the specified Region.
       * For more information, see the [LicenseConfiguration
       * API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
       * .
       */
      override fun licenseConfigurationArns(vararg licenseConfigurationArns: String): Unit =
          licenseConfigurationArns(licenseConfigurationArns.toList())

      /**
       * @param region The target Region for the Distribution Configuration. 
       * For example, `eu-west-1` .
       */
      override fun region(region: String) {
        cdkBuilder.region(region)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty,
    ) : CdkObject(cdkObject), DistributionProperty {
      /**
       * The specific AMI settings, such as launch permissions and AMI tags.
       *
       * For details, see example schema below.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-amidistributionconfiguration)
       */
      override fun amiDistributionConfiguration(): Any? =
          unwrap(this).getAmiDistributionConfiguration()

      /**
       * Container distribution settings for encryption, licensing, and sharing in a specific
       * Region.
       *
       * For details, see example schema below.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-containerdistributionconfiguration)
       */
      override fun containerDistributionConfiguration(): Any? =
          unwrap(this).getContainerDistributionConfiguration()

      /**
       * The Windows faster-launching configurations to use for AMI distribution.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-fastlaunchconfigurations)
       */
      override fun fastLaunchConfigurations(): Any? = unwrap(this).getFastLaunchConfigurations()

      /**
       * A group of launchTemplateConfiguration settings that apply to image distribution for
       * specified accounts.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-launchtemplateconfigurations)
       */
      override fun launchTemplateConfigurations(): Any? =
          unwrap(this).getLaunchTemplateConfigurations()

      /**
       * The License Manager Configuration to associate with the AMI in the specified Region.
       *
       * For more information, see the [LicenseConfiguration
       * API](https://docs.aws.amazon.com/license-manager/latest/APIReference/API_LicenseConfiguration.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-licenseconfigurationarns)
       */
      override fun licenseConfigurationArns(): List<String> =
          unwrap(this).getLicenseConfigurationArns() ?: emptyList()

      /**
       * The target Region for the Distribution Configuration.
       *
       * For example, `eu-west-1` .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-distribution.html#cfn-imagebuilder-distributionconfiguration-distribution-region)
       */
      override fun region(): String = unwrap(this).getRegion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): DistributionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty):
          DistributionProperty = CdkObjectWrappers.wrap(cdkObject) as? DistributionProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: DistributionProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.DistributionProperty
    }
  }

  /**
   * Define and configure faster launching for output Windows AMIs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * FastLaunchConfigurationProperty fastLaunchConfigurationProperty =
   * FastLaunchConfigurationProperty.builder()
   * .accountId("accountId")
   * .enabled(false)
   * .launchTemplate(FastLaunchLaunchTemplateSpecificationProperty.builder()
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .launchTemplateVersion("launchTemplateVersion")
   * .build())
   * .maxParallelLaunches(123)
   * .snapshotConfiguration(FastLaunchSnapshotConfigurationProperty.builder()
   * .targetResourceCount(123)
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html)
   */
  public interface FastLaunchConfigurationProperty {
    /**
     * The owner account ID for the fast-launch enabled Windows AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-accountid)
     */
    public fun accountId(): String? = unwrap(this).getAccountId()

    /**
     * A Boolean that represents the current state of faster launching for the Windows AMI.
     *
     * Set to `true` to start using Windows faster launching, or `false` to stop using it.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-enabled)
     */
    public fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows
     * instances to create pre-provisioned snapshots.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-launchtemplate)
     */
    public fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

    /**
     * The maximum number of parallel instances that are launched for creating resources.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-maxparallellaunches)
     */
    public fun maxParallelLaunches(): Number? = unwrap(this).getMaxParallelLaunches()

    /**
     * Configuration settings for managing the number of snapshots that are created from
     * pre-provisioned instances for the Windows AMI when faster launching is enabled.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-snapshotconfiguration)
     */
    public fun snapshotConfiguration(): Any? = unwrap(this).getSnapshotConfiguration()

    /**
     * A builder for [FastLaunchConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountId The owner account ID for the fast-launch enabled Windows AMI.
       */
      public fun accountId(accountId: String)

      /**
       * @param enabled A Boolean that represents the current state of faster launching for the
       * Windows AMI.
       * Set to `true` to start using Windows faster launching, or `false` to stop using it.
       */
      public fun enabled(enabled: Boolean)

      /**
       * @param enabled A Boolean that represents the current state of faster launching for the
       * Windows AMI.
       * Set to `true` to start using Windows faster launching, or `false` to stop using it.
       */
      public fun enabled(enabled: IResolvable)

      /**
       * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses
       * when it launches Windows instances to create pre-provisioned snapshots.
       */
      public fun launchTemplate(launchTemplate: IResolvable)

      /**
       * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses
       * when it launches Windows instances to create pre-provisioned snapshots.
       */
      public fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty)

      /**
       * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses
       * when it launches Windows instances to create pre-provisioned snapshots.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de8d9d9090f8a1faa0956d49f10c75cbec6e79170ab681806aa68af0e95e0a9")
      public
          fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty.Builder.() -> Unit)

      /**
       * @param maxParallelLaunches The maximum number of parallel instances that are launched for
       * creating resources.
       */
      public fun maxParallelLaunches(maxParallelLaunches: Number)

      /**
       * @param snapshotConfiguration Configuration settings for managing the number of snapshots
       * that are created from pre-provisioned instances for the Windows AMI when faster launching is
       * enabled.
       */
      public fun snapshotConfiguration(snapshotConfiguration: IResolvable)

      /**
       * @param snapshotConfiguration Configuration settings for managing the number of snapshots
       * that are created from pre-provisioned instances for the Windows AMI when faster launching is
       * enabled.
       */
      public
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty)

      /**
       * @param snapshotConfiguration Configuration settings for managing the number of snapshots
       * that are created from pre-provisioned instances for the Windows AMI when faster launching is
       * enabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4278f27bde85506fe2b205f731c9b02d31b969355212f17d409a9bfc5cb7a103")
      public
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty.builder()

      /**
       * @param accountId The owner account ID for the fast-launch enabled Windows AMI.
       */
      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      /**
       * @param enabled A Boolean that represents the current state of faster launching for the
       * Windows AMI.
       * Set to `true` to start using Windows faster launching, or `false` to stop using it.
       */
      override fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
      }

      /**
       * @param enabled A Boolean that represents the current state of faster launching for the
       * Windows AMI.
       * Set to `true` to start using Windows faster launching, or `false` to stop using it.
       */
      override fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses
       * when it launches Windows instances to create pre-provisioned snapshots.
       */
      override fun launchTemplate(launchTemplate: IResolvable) {
        cdkBuilder.launchTemplate(launchTemplate.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses
       * when it launches Windows instances to create pre-provisioned snapshots.
       */
      override fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty) {
        cdkBuilder.launchTemplate(launchTemplate.let(FastLaunchLaunchTemplateSpecificationProperty::unwrap))
      }

      /**
       * @param launchTemplate The launch template that the fast-launch enabled Windows AMI uses
       * when it launches Windows instances to create pre-provisioned snapshots.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8de8d9d9090f8a1faa0956d49f10c75cbec6e79170ab681806aa68af0e95e0a9")
      override
          fun launchTemplate(launchTemplate: FastLaunchLaunchTemplateSpecificationProperty.Builder.() -> Unit):
          Unit = launchTemplate(FastLaunchLaunchTemplateSpecificationProperty(launchTemplate))

      /**
       * @param maxParallelLaunches The maximum number of parallel instances that are launched for
       * creating resources.
       */
      override fun maxParallelLaunches(maxParallelLaunches: Number) {
        cdkBuilder.maxParallelLaunches(maxParallelLaunches)
      }

      /**
       * @param snapshotConfiguration Configuration settings for managing the number of snapshots
       * that are created from pre-provisioned instances for the Windows AMI when faster launching is
       * enabled.
       */
      override fun snapshotConfiguration(snapshotConfiguration: IResolvable) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration.let(IResolvable::unwrap))
      }

      /**
       * @param snapshotConfiguration Configuration settings for managing the number of snapshots
       * that are created from pre-provisioned instances for the Windows AMI when faster launching is
       * enabled.
       */
      override
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty) {
        cdkBuilder.snapshotConfiguration(snapshotConfiguration.let(FastLaunchSnapshotConfigurationProperty::unwrap))
      }

      /**
       * @param snapshotConfiguration Configuration settings for managing the number of snapshots
       * that are created from pre-provisioned instances for the Windows AMI when faster launching is
       * enabled.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("4278f27bde85506fe2b205f731c9b02d31b969355212f17d409a9bfc5cb7a103")
      override
          fun snapshotConfiguration(snapshotConfiguration: FastLaunchSnapshotConfigurationProperty.Builder.() -> Unit):
          Unit =
          snapshotConfiguration(FastLaunchSnapshotConfigurationProperty(snapshotConfiguration))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty,
    ) : CdkObject(cdkObject), FastLaunchConfigurationProperty {
      /**
       * The owner account ID for the fast-launch enabled Windows AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-accountid)
       */
      override fun accountId(): String? = unwrap(this).getAccountId()

      /**
       * A Boolean that represents the current state of faster launching for the Windows AMI.
       *
       * Set to `true` to start using Windows faster launching, or `false` to stop using it.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-enabled)
       */
      override fun enabled(): Any? = unwrap(this).getEnabled()

      /**
       * The launch template that the fast-launch enabled Windows AMI uses when it launches Windows
       * instances to create pre-provisioned snapshots.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-launchtemplate)
       */
      override fun launchTemplate(): Any? = unwrap(this).getLaunchTemplate()

      /**
       * The maximum number of parallel instances that are launched for creating resources.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-maxparallellaunches)
       */
      override fun maxParallelLaunches(): Number? = unwrap(this).getMaxParallelLaunches()

      /**
       * Configuration settings for managing the number of snapshots that are created from
       * pre-provisioned instances for the Windows AMI when faster launching is enabled.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchconfiguration-snapshotconfiguration)
       */
      override fun snapshotConfiguration(): Any? = unwrap(this).getSnapshotConfiguration()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): FastLaunchConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty):
          FastLaunchConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FastLaunchConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastLaunchConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchConfigurationProperty
    }
  }

  /**
   * Identifies the launch template that the associated Windows AMI uses for launching an instance
   * when faster launching is enabled.
   *
   *
   * You can specify either the `launchTemplateName` or the `launchTemplateId` , but not both.
   *
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * FastLaunchLaunchTemplateSpecificationProperty fastLaunchLaunchTemplateSpecificationProperty =
   * FastLaunchLaunchTemplateSpecificationProperty.builder()
   * .launchTemplateId("launchTemplateId")
   * .launchTemplateName("launchTemplateName")
   * .launchTemplateVersion("launchTemplateVersion")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html)
   */
  public interface FastLaunchLaunchTemplateSpecificationProperty {
    /**
     * The ID of the launch template to use for faster launching for a Windows AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html#cfn-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * The name of the launch template to use for faster launching for a Windows AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html#cfn-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification-launchtemplatename)
     */
    public fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

    /**
     * The version of the launch template to use for faster launching for a Windows AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html#cfn-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification-launchtemplateversion)
     */
    public fun launchTemplateVersion(): String? = unwrap(this).getLaunchTemplateVersion()

    /**
     * A builder for [FastLaunchLaunchTemplateSpecificationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param launchTemplateId The ID of the launch template to use for faster launching for a
       * Windows AMI.
       */
      public fun launchTemplateId(launchTemplateId: String)

      /**
       * @param launchTemplateName The name of the launch template to use for faster launching for a
       * Windows AMI.
       */
      public fun launchTemplateName(launchTemplateName: String)

      /**
       * @param launchTemplateVersion The version of the launch template to use for faster launching
       * for a Windows AMI.
       */
      public fun launchTemplateVersion(launchTemplateVersion: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty.builder()

      /**
       * @param launchTemplateId The ID of the launch template to use for faster launching for a
       * Windows AMI.
       */
      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      /**
       * @param launchTemplateName The name of the launch template to use for faster launching for a
       * Windows AMI.
       */
      override fun launchTemplateName(launchTemplateName: String) {
        cdkBuilder.launchTemplateName(launchTemplateName)
      }

      /**
       * @param launchTemplateVersion The version of the launch template to use for faster launching
       * for a Windows AMI.
       */
      override fun launchTemplateVersion(launchTemplateVersion: String) {
        cdkBuilder.launchTemplateVersion(launchTemplateVersion)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty,
    ) : CdkObject(cdkObject), FastLaunchLaunchTemplateSpecificationProperty {
      /**
       * The ID of the launch template to use for faster launching for a Windows AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html#cfn-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * The name of the launch template to use for faster launching for a Windows AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html#cfn-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification-launchtemplatename)
       */
      override fun launchTemplateName(): String? = unwrap(this).getLaunchTemplateName()

      /**
       * The version of the launch template to use for faster launching for a Windows AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification.html#cfn-imagebuilder-distributionconfiguration-fastlaunchlaunchtemplatespecification-launchtemplateversion)
       */
      override fun launchTemplateVersion(): String? = unwrap(this).getLaunchTemplateVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FastLaunchLaunchTemplateSpecificationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty):
          FastLaunchLaunchTemplateSpecificationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FastLaunchLaunchTemplateSpecificationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastLaunchLaunchTemplateSpecificationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchLaunchTemplateSpecificationProperty
    }
  }

  /**
   * Configuration settings for creating and managing pre-provisioned snapshots for a fast-launch
   * enabled Windows AMI.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * FastLaunchSnapshotConfigurationProperty fastLaunchSnapshotConfigurationProperty =
   * FastLaunchSnapshotConfigurationProperty.builder()
   * .targetResourceCount(123)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchsnapshotconfiguration.html)
   */
  public interface FastLaunchSnapshotConfigurationProperty {
    /**
     * The number of pre-provisioned snapshots to keep on hand for a fast-launch enabled Windows
     * AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchsnapshotconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchsnapshotconfiguration-targetresourcecount)
     */
    public fun targetResourceCount(): Number? = unwrap(this).getTargetResourceCount()

    /**
     * A builder for [FastLaunchSnapshotConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param targetResourceCount The number of pre-provisioned snapshots to keep on hand for a
       * fast-launch enabled Windows AMI.
       */
      public fun targetResourceCount(targetResourceCount: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty.builder()

      /**
       * @param targetResourceCount The number of pre-provisioned snapshots to keep on hand for a
       * fast-launch enabled Windows AMI.
       */
      override fun targetResourceCount(targetResourceCount: Number) {
        cdkBuilder.targetResourceCount(targetResourceCount)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty,
    ) : CdkObject(cdkObject), FastLaunchSnapshotConfigurationProperty {
      /**
       * The number of pre-provisioned snapshots to keep on hand for a fast-launch enabled Windows
       * AMI.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-fastlaunchsnapshotconfiguration.html#cfn-imagebuilder-distributionconfiguration-fastlaunchsnapshotconfiguration-targetresourcecount)
       */
      override fun targetResourceCount(): Number? = unwrap(this).getTargetResourceCount()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          FastLaunchSnapshotConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty):
          FastLaunchSnapshotConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          FastLaunchSnapshotConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: FastLaunchSnapshotConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.FastLaunchSnapshotConfigurationProperty
    }
  }

  /**
   * Describes the configuration for a launch permission.
   *
   * The launch permission modification request is sent to the [Amazon EC2
   * ModifyImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html)
   * API on behalf of the user for each Region they have selected to distribute the AMI. To make an AMI
   * public, set the launch permission authorized accounts to `all` . See the examples for making an
   * AMI public at [Amazon EC2
   * ModifyImageAttribute](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_ModifyImageAttribute.html)
   * .
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * LaunchPermissionConfigurationProperty launchPermissionConfigurationProperty =
   * LaunchPermissionConfigurationProperty.builder()
   * .organizationalUnitArns(List.of("organizationalUnitArns"))
   * .organizationArns(List.of("organizationArns"))
   * .userGroups(List.of("userGroups"))
   * .userIds(List.of("userIds"))
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html)
   */
  public interface LaunchPermissionConfigurationProperty {
    /**
     * The ARN for an AWS Organization that you want to share your AMI with.
     *
     * For more information, see [What is AWS Organizations
     * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-organizationarns)
     */
    public fun organizationArns(): List<String> = unwrap(this).getOrganizationArns() ?: emptyList()

    /**
     * The ARN for an AWS Organizations organizational unit (OU) that you want to share your AMI
     * with.
     *
     * For more information about key concepts for AWS Organizations , see [AWS Organizations
     * terminology and
     * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
     * .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-organizationalunitarns)
     */
    public fun organizationalUnitArns(): List<String> = unwrap(this).getOrganizationalUnitArns() ?:
        emptyList()

    /**
     * The name of the group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-usergroups)
     */
    public fun userGroups(): List<String> = unwrap(this).getUserGroups() ?: emptyList()

    /**
     * The AWS account ID.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-userids)
     */
    public fun userIds(): List<String> = unwrap(this).getUserIds() ?: emptyList()

    /**
     * A builder for [LaunchPermissionConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param organizationArns The ARN for an AWS Organization that you want to share your AMI
       * with.
       * For more information, see [What is AWS Organizations
       * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
       */
      public fun organizationArns(organizationArns: List<String>)

      /**
       * @param organizationArns The ARN for an AWS Organization that you want to share your AMI
       * with.
       * For more information, see [What is AWS Organizations
       * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
       */
      public fun organizationArns(vararg organizationArns: String)

      /**
       * @param organizationalUnitArns The ARN for an AWS Organizations organizational unit (OU)
       * that you want to share your AMI with.
       * For more information about key concepts for AWS Organizations , see [AWS Organizations
       * terminology and
       * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
       * .
       */
      public fun organizationalUnitArns(organizationalUnitArns: List<String>)

      /**
       * @param organizationalUnitArns The ARN for an AWS Organizations organizational unit (OU)
       * that you want to share your AMI with.
       * For more information about key concepts for AWS Organizations , see [AWS Organizations
       * terminology and
       * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
       * .
       */
      public fun organizationalUnitArns(vararg organizationalUnitArns: String)

      /**
       * @param userGroups The name of the group.
       */
      public fun userGroups(userGroups: List<String>)

      /**
       * @param userGroups The name of the group.
       */
      public fun userGroups(vararg userGroups: String)

      /**
       * @param userIds The AWS account ID.
       */
      public fun userIds(userIds: List<String>)

      /**
       * @param userIds The AWS account ID.
       */
      public fun userIds(vararg userIds: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty.builder()

      /**
       * @param organizationArns The ARN for an AWS Organization that you want to share your AMI
       * with.
       * For more information, see [What is AWS Organizations
       * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
       */
      override fun organizationArns(organizationArns: List<String>) {
        cdkBuilder.organizationArns(organizationArns)
      }

      /**
       * @param organizationArns The ARN for an AWS Organization that you want to share your AMI
       * with.
       * For more information, see [What is AWS Organizations
       * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
       */
      override fun organizationArns(vararg organizationArns: String): Unit =
          organizationArns(organizationArns.toList())

      /**
       * @param organizationalUnitArns The ARN for an AWS Organizations organizational unit (OU)
       * that you want to share your AMI with.
       * For more information about key concepts for AWS Organizations , see [AWS Organizations
       * terminology and
       * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
       * .
       */
      override fun organizationalUnitArns(organizationalUnitArns: List<String>) {
        cdkBuilder.organizationalUnitArns(organizationalUnitArns)
      }

      /**
       * @param organizationalUnitArns The ARN for an AWS Organizations organizational unit (OU)
       * that you want to share your AMI with.
       * For more information about key concepts for AWS Organizations , see [AWS Organizations
       * terminology and
       * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
       * .
       */
      override fun organizationalUnitArns(vararg organizationalUnitArns: String): Unit =
          organizationalUnitArns(organizationalUnitArns.toList())

      /**
       * @param userGroups The name of the group.
       */
      override fun userGroups(userGroups: List<String>) {
        cdkBuilder.userGroups(userGroups)
      }

      /**
       * @param userGroups The name of the group.
       */
      override fun userGroups(vararg userGroups: String): Unit = userGroups(userGroups.toList())

      /**
       * @param userIds The AWS account ID.
       */
      override fun userIds(userIds: List<String>) {
        cdkBuilder.userIds(userIds)
      }

      /**
       * @param userIds The AWS account ID.
       */
      override fun userIds(vararg userIds: String): Unit = userIds(userIds.toList())

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty,
    ) : CdkObject(cdkObject), LaunchPermissionConfigurationProperty {
      /**
       * The ARN for an AWS Organization that you want to share your AMI with.
       *
       * For more information, see [What is AWS Organizations
       * ?](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_introduction.html) .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-organizationarns)
       */
      override fun organizationArns(): List<String> = unwrap(this).getOrganizationArns() ?:
          emptyList()

      /**
       * The ARN for an AWS Organizations organizational unit (OU) that you want to share your AMI
       * with.
       *
       * For more information about key concepts for AWS Organizations , see [AWS Organizations
       * terminology and
       * concepts](https://docs.aws.amazon.com/organizations/latest/userguide/orgs_getting-started_concepts.html)
       * .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-organizationalunitarns)
       */
      override fun organizationalUnitArns(): List<String> = unwrap(this).getOrganizationalUnitArns()
          ?: emptyList()

      /**
       * The name of the group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-usergroups)
       */
      override fun userGroups(): List<String> = unwrap(this).getUserGroups() ?: emptyList()

      /**
       * The AWS account ID.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchpermissionconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchpermissionconfiguration-userids)
       */
      override fun userIds(): List<String> = unwrap(this).getUserIds() ?: emptyList()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchPermissionConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty):
          LaunchPermissionConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LaunchPermissionConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchPermissionConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchPermissionConfigurationProperty
    }
  }

  /**
   * Identifies an Amazon EC2 launch template to use for a specific account.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * LaunchTemplateConfigurationProperty launchTemplateConfigurationProperty =
   * LaunchTemplateConfigurationProperty.builder()
   * .accountId("accountId")
   * .launchTemplateId("launchTemplateId")
   * .setDefaultVersion(false)
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html)
   */
  public interface LaunchTemplateConfigurationProperty {
    /**
     * The account ID that this configuration applies to.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchtemplateconfiguration-accountid)
     */
    public fun accountId(): String? = unwrap(this).getAccountId()

    /**
     * Identifies the Amazon EC2 launch template to use.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchtemplateconfiguration-launchtemplateid)
     */
    public fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

    /**
     * Set the specified Amazon EC2 launch template as the default launch template for the specified
     * account.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchtemplateconfiguration-setdefaultversion)
     */
    public fun setDefaultVersion(): Any? = unwrap(this).getSetDefaultVersion()

    /**
     * A builder for [LaunchTemplateConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param accountId The account ID that this configuration applies to.
       */
      public fun accountId(accountId: String)

      /**
       * @param setDefaultVersion Set the specified Amazon EC2 launch template as the default launch
       * template for the specified account.
       */
      public fun defaultVersion(setDefaultVersion: Boolean)

      /**
       * @param setDefaultVersion Set the specified Amazon EC2 launch template as the default launch
       * template for the specified account.
       */
      public fun defaultVersion(setDefaultVersion: IResolvable)

      /**
       * @param launchTemplateId Identifies the Amazon EC2 launch template to use.
       */
      public fun launchTemplateId(launchTemplateId: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty.builder()

      /**
       * @param accountId The account ID that this configuration applies to.
       */
      override fun accountId(accountId: String) {
        cdkBuilder.accountId(accountId)
      }

      /**
       * @param setDefaultVersion Set the specified Amazon EC2 launch template as the default launch
       * template for the specified account.
       */
      override fun defaultVersion(setDefaultVersion: Boolean) {
        cdkBuilder.setDefaultVersion(setDefaultVersion)
      }

      /**
       * @param setDefaultVersion Set the specified Amazon EC2 launch template as the default launch
       * template for the specified account.
       */
      override fun defaultVersion(setDefaultVersion: IResolvable) {
        cdkBuilder.setDefaultVersion(setDefaultVersion.let(IResolvable::unwrap))
      }

      /**
       * @param launchTemplateId Identifies the Amazon EC2 launch template to use.
       */
      override fun launchTemplateId(launchTemplateId: String) {
        cdkBuilder.launchTemplateId(launchTemplateId)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty,
    ) : CdkObject(cdkObject), LaunchTemplateConfigurationProperty {
      /**
       * The account ID that this configuration applies to.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchtemplateconfiguration-accountid)
       */
      override fun accountId(): String? = unwrap(this).getAccountId()

      /**
       * Identifies the Amazon EC2 launch template to use.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchtemplateconfiguration-launchtemplateid)
       */
      override fun launchTemplateId(): String? = unwrap(this).getLaunchTemplateId()

      /**
       * Set the specified Amazon EC2 launch template as the default launch template for the
       * specified account.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-launchtemplateconfiguration.html#cfn-imagebuilder-distributionconfiguration-launchtemplateconfiguration-setdefaultversion)
       */
      override fun setDefaultVersion(): Any? = unwrap(this).getSetDefaultVersion()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          LaunchTemplateConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty):
          LaunchTemplateConfigurationProperty = CdkObjectWrappers.wrap(cdkObject) as?
          LaunchTemplateConfigurationProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: LaunchTemplateConfigurationProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.LaunchTemplateConfigurationProperty
    }
  }

  /**
   * The container repository where the output container image is stored.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * TargetContainerRepositoryProperty targetContainerRepositoryProperty =
   * TargetContainerRepositoryProperty.builder()
   * .repositoryName("repositoryName")
   * .service("service")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-targetcontainerrepository.html)
   */
  public interface TargetContainerRepositoryProperty {
    /**
     * The name of the container repository where the output container image is stored.
     *
     * This name is prefixed by the repository location.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-targetcontainerrepository.html#cfn-imagebuilder-distributionconfiguration-targetcontainerrepository-repositoryname)
     */
    public fun repositoryName(): String? = unwrap(this).getRepositoryName()

    /**
     * Specifies the service in which this image was registered.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-targetcontainerrepository.html#cfn-imagebuilder-distributionconfiguration-targetcontainerrepository-service)
     */
    public fun service(): String? = unwrap(this).getService()

    /**
     * A builder for [TargetContainerRepositoryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param repositoryName The name of the container repository where the output container image
       * is stored.
       * This name is prefixed by the repository location.
       */
      public fun repositoryName(repositoryName: String)

      /**
       * @param service Specifies the service in which this image was registered.
       */
      public fun service(service: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty.builder()

      /**
       * @param repositoryName The name of the container repository where the output container image
       * is stored.
       * This name is prefixed by the repository location.
       */
      override fun repositoryName(repositoryName: String) {
        cdkBuilder.repositoryName(repositoryName)
      }

      /**
       * @param service Specifies the service in which this image was registered.
       */
      override fun service(service: String) {
        cdkBuilder.service(service)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty,
    ) : CdkObject(cdkObject), TargetContainerRepositoryProperty {
      /**
       * The name of the container repository where the output container image is stored.
       *
       * This name is prefixed by the repository location.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-targetcontainerrepository.html#cfn-imagebuilder-distributionconfiguration-targetcontainerrepository-repositoryname)
       */
      override fun repositoryName(): String? = unwrap(this).getRepositoryName()

      /**
       * Specifies the service in which this image was registered.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-distributionconfiguration-targetcontainerrepository.html#cfn-imagebuilder-distributionconfiguration-targetcontainerrepository-service)
       */
      override fun service(): String? = unwrap(this).getService()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}):
          TargetContainerRepositoryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty):
          TargetContainerRepositoryProperty = CdkObjectWrappers.wrap(cdkObject) as?
          TargetContainerRepositoryProperty ?: Wrapper(cdkObject)

      internal fun unwrap(wrapped: TargetContainerRepositoryProperty):
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnDistributionConfiguration.TargetContainerRepositoryProperty
    }
  }
}
