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
 * The infrastructure configuration allows you to specify the infrastructure within which to build
 * and test your image.
 *
 * In the infrastructure configuration, you can specify instance types, subnets, and security groups
 * to associate with your instance. You can also associate an Amazon EC2 key pair with the instance
 * used to build your image. This allows you to log on to your instance to troubleshoot if your build
 * fails and you set terminateInstanceOnFailure to false.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnInfrastructureConfiguration cfnInfrastructureConfiguration =
 * CfnInfrastructureConfiguration.Builder.create(this, "MyCfnInfrastructureConfiguration")
 * .instanceProfileName("instanceProfileName")
 * .name("name")
 * // the properties below are optional
 * .description("description")
 * .instanceMetadataOptions(InstanceMetadataOptionsProperty.builder()
 * .httpPutResponseHopLimit(123)
 * .httpTokens("httpTokens")
 * .build())
 * .instanceTypes(List.of("instanceTypes"))
 * .keyPair("keyPair")
 * .logging(LoggingProperty.builder()
 * .s3Logs(S3LogsProperty.builder()
 * .s3BucketName("s3BucketName")
 * .s3KeyPrefix("s3KeyPrefix")
 * .build())
 * .build())
 * .resourceTags(Map.of(
 * "resourceTagsKey", "resourceTags"))
 * .securityGroupIds(List.of("securityGroupIds"))
 * .snsTopicArn("snsTopicArn")
 * .subnetId("subnetId")
 * .tags(Map.of(
 * "tagsKey", "tags"))
 * .terminateInstanceOnFailure(false)
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html)
 */
public open class CfnInfrastructureConfiguration internal constructor(
  internal override val cdkObject:
      software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Returns the Amazon Resource Name (ARN) of the infrastructure configuration.
   *
   * The following pattern is applied:
   * `^arn:aws[^:]*:imagebuilder:[^:]+:(?:\d{12}|aws):(?:image-recipe|infrastructure-configuration|distribution-configuration|component|image|image-pipeline)/[a-z0-9-_]+(?:/(?:(?:x|\d+)\.(?:x|\d+)\.(?:x|\d+))(?:/\d+)?)?$`
   * .
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The name of the infrastructure configuration.
   */
  public open fun attrName(): String = unwrap(this).getAttrName()

  /**
   * The description of the infrastructure configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the infrastructure configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
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
   * The instance metadata option settings for the infrastructure configuration.
   */
  public open fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

  /**
   * The instance metadata option settings for the infrastructure configuration.
   */
  public open fun instanceMetadataOptions(`value`: IResolvable) {
    unwrap(this).setInstanceMetadataOptions(`value`.let(IResolvable::unwrap))
  }

  /**
   * The instance metadata option settings for the infrastructure configuration.
   */
  public open fun instanceMetadataOptions(`value`: InstanceMetadataOptionsProperty) {
    unwrap(this).setInstanceMetadataOptions(`value`.let(InstanceMetadataOptionsProperty::unwrap))
  }

  /**
   * The instance metadata option settings for the infrastructure configuration.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e42fdd1eab591949e29aea918b51efbd6cb9a65b1e0208eec8d964ec1e8c1961")
  public open
      fun instanceMetadataOptions(`value`: InstanceMetadataOptionsProperty.Builder.() -> Unit): Unit
      = instanceMetadataOptions(InstanceMetadataOptionsProperty(`value`))

  /**
   * The instance profile of the infrastructure configuration.
   */
  public open fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

  /**
   * The instance profile of the infrastructure configuration.
   */
  public open fun instanceProfileName(`value`: String) {
    unwrap(this).setInstanceProfileName(`value`)
  }

  /**
   * The instance types of the infrastructure configuration.
   */
  public open fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  /**
   * The instance types of the infrastructure configuration.
   */
  public open fun instanceTypes(`value`: List<String>) {
    unwrap(this).setInstanceTypes(`value`)
  }

  /**
   * The instance types of the infrastructure configuration.
   */
  public open fun instanceTypes(vararg `value`: String): Unit = instanceTypes(`value`.toList())

  /**
   * The Amazon EC2 key pair of the infrastructure configuration.
   */
  public open fun keyPair(): String? = unwrap(this).getKeyPair()

  /**
   * The Amazon EC2 key pair of the infrastructure configuration.
   */
  public open fun keyPair(`value`: String) {
    unwrap(this).setKeyPair(`value`)
  }

  /**
   * The logging configuration defines where Image Builder uploads your logs.
   */
  public open fun logging(): Any? = unwrap(this).getLogging()

  /**
   * The logging configuration defines where Image Builder uploads your logs.
   */
  public open fun logging(`value`: IResolvable) {
    unwrap(this).setLogging(`value`.let(IResolvable::unwrap))
  }

  /**
   * The logging configuration defines where Image Builder uploads your logs.
   */
  public open fun logging(`value`: LoggingProperty) {
    unwrap(this).setLogging(`value`.let(LoggingProperty::unwrap))
  }

  /**
   * The logging configuration defines where Image Builder uploads your logs.
   */
  @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("e663c026004e317139e7760979c3ea35760bb71aeabc9554e29b92449251d657")
  public open fun logging(`value`: LoggingProperty.Builder.() -> Unit): Unit =
      logging(LoggingProperty(`value`))

  /**
   * The name of the infrastructure configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the infrastructure configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * The tags attached to the resource created by Image Builder.
   */
  public open fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * The tags attached to the resource created by Image Builder.
   */
  public open fun resourceTags(`value`: IResolvable) {
    unwrap(this).setResourceTags(`value`.let(IResolvable::unwrap))
  }

  /**
   * The tags attached to the resource created by Image Builder.
   */
  public open fun resourceTags(`value`: Map<String, String>) {
    unwrap(this).setResourceTags(`value`)
  }

  /**
   * The security group IDs of the infrastructure configuration.
   */
  public open fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
      emptyList()

  /**
   * The security group IDs of the infrastructure configuration.
   */
  public open fun securityGroupIds(`value`: List<String>) {
    unwrap(this).setSecurityGroupIds(`value`)
  }

  /**
   * The security group IDs of the infrastructure configuration.
   */
  public open fun securityGroupIds(vararg `value`: String): Unit =
      securityGroupIds(`value`.toList())

  /**
   * The Amazon Resource Name (ARN) of the SNS topic for the infrastructure configuration.
   */
  public open fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * The Amazon Resource Name (ARN) of the SNS topic for the infrastructure configuration.
   */
  public open fun snsTopicArn(`value`: String) {
    unwrap(this).setSnsTopicArn(`value`)
  }

  /**
   * The subnet ID of the infrastructure configuration.
   */
  public open fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The subnet ID of the infrastructure configuration.
   */
  public open fun subnetId(`value`: String) {
    unwrap(this).setSubnetId(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The tags of the infrastructure configuration.
   */
  public open fun tagsRaw(): Map<String, String> = unwrap(this).getTagsRaw() ?: emptyMap()

  /**
   * The tags of the infrastructure configuration.
   */
  public open fun tagsRaw(`value`: Map<String, String>) {
    unwrap(this).setTagsRaw(`value`)
  }

  /**
   * The terminate instance on failure configuration of the infrastructure configuration.
   */
  public open fun terminateInstanceOnFailure(): Any? = unwrap(this).getTerminateInstanceOnFailure()

  /**
   * The terminate instance on failure configuration of the infrastructure configuration.
   */
  public open fun terminateInstanceOnFailure(`value`: Boolean) {
    unwrap(this).setTerminateInstanceOnFailure(`value`)
  }

  /**
   * The terminate instance on failure configuration of the infrastructure configuration.
   */
  public open fun terminateInstanceOnFailure(`value`: IResolvable) {
    unwrap(this).setTerminateInstanceOnFailure(`value`.let(IResolvable::unwrap))
  }

  /**
   * A fluent builder for
   * [io.cloudshiftdev.awscdk.services.imagebuilder.CfnInfrastructureConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * The description of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-description)
     * @param description The description of the infrastructure configuration. 
     */
    public fun description(description: String)

    /**
     * The instance metadata option settings for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration. 
     */
    public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable)

    /**
     * The instance metadata option settings for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration. 
     */
    public fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty)

    /**
     * The instance metadata option settings for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a248e5d7f6fd3e44d70ef3b895c0577238f43ea28ab2bef4a5b7492a38ef371")
    public
        fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty.Builder.() -> Unit)

    /**
     * The instance profile of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instanceprofilename)
     * @param instanceProfileName The instance profile of the infrastructure configuration. 
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * The instance types of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
     * @param instanceTypes The instance types of the infrastructure configuration. 
     */
    public fun instanceTypes(instanceTypes: List<String>)

    /**
     * The instance types of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
     * @param instanceTypes The instance types of the infrastructure configuration. 
     */
    public fun instanceTypes(vararg instanceTypes: String)

    /**
     * The Amazon EC2 key pair of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-keypair)
     * @param keyPair The Amazon EC2 key pair of the infrastructure configuration. 
     */
    public fun keyPair(keyPair: String)

    /**
     * The logging configuration defines where Image Builder uploads your logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
     * @param logging The logging configuration defines where Image Builder uploads your logs. 
     */
    public fun logging(logging: IResolvable)

    /**
     * The logging configuration defines where Image Builder uploads your logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
     * @param logging The logging configuration defines where Image Builder uploads your logs. 
     */
    public fun logging(logging: LoggingProperty)

    /**
     * The logging configuration defines where Image Builder uploads your logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
     * @param logging The logging configuration defines where Image Builder uploads your logs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668f7e605a157c72d15bc514ef2dec91a5b4d84d02e0db4d951ddae0a3db24ae")
    public fun logging(logging: LoggingProperty.Builder.() -> Unit)

    /**
     * The name of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-name)
     * @param name The name of the infrastructure configuration. 
     */
    public fun name(name: String)

    /**
     * The tags attached to the resource created by Image Builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
     * @param resourceTags The tags attached to the resource created by Image Builder. 
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * The tags attached to the resource created by Image Builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
     * @param resourceTags The tags attached to the resource created by Image Builder. 
     */
    public fun resourceTags(resourceTags: Map<String, String>)

    /**
     * The security group IDs of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
     * @param securityGroupIds The security group IDs of the infrastructure configuration. 
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * The security group IDs of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
     * @param securityGroupIds The security group IDs of the infrastructure configuration. 
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * The Amazon Resource Name (ARN) of the SNS topic for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic for the infrastructure
     * configuration. 
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * The subnet ID of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-subnetid)
     * @param subnetId The subnet ID of the infrastructure configuration. 
     */
    public fun subnetId(subnetId: String)

    /**
     * The tags of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-tags)
     * @param tags The tags of the infrastructure configuration. 
     */
    public fun tags(tags: Map<String, String>)

    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration. 
     */
    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean)

    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration. 
     */
    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.Builder.create(scope,
        id)

    /**
     * The description of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-description)
     * @param description The description of the infrastructure configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The instance metadata option settings for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration. 
     */
    override fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(IResolvable::unwrap))
    }

    /**
     * The instance metadata option settings for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration. 
     */
    override fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(InstanceMetadataOptionsProperty::unwrap))
    }

    /**
     * The instance metadata option settings for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("7a248e5d7f6fd3e44d70ef3b895c0577238f43ea28ab2bef4a5b7492a38ef371")
    override
        fun instanceMetadataOptions(instanceMetadataOptions: InstanceMetadataOptionsProperty.Builder.() -> Unit):
        Unit = instanceMetadataOptions(InstanceMetadataOptionsProperty(instanceMetadataOptions))

    /**
     * The instance profile of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instanceprofilename)
     * @param instanceProfileName The instance profile of the infrastructure configuration. 
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * The instance types of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
     * @param instanceTypes The instance types of the infrastructure configuration. 
     */
    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    /**
     * The instance types of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
     * @param instanceTypes The instance types of the infrastructure configuration. 
     */
    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * The Amazon EC2 key pair of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-keypair)
     * @param keyPair The Amazon EC2 key pair of the infrastructure configuration. 
     */
    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    /**
     * The logging configuration defines where Image Builder uploads your logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
     * @param logging The logging configuration defines where Image Builder uploads your logs. 
     */
    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    /**
     * The logging configuration defines where Image Builder uploads your logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
     * @param logging The logging configuration defines where Image Builder uploads your logs. 
     */
    override fun logging(logging: LoggingProperty) {
      cdkBuilder.logging(logging.let(LoggingProperty::unwrap))
    }

    /**
     * The logging configuration defines where Image Builder uploads your logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
     * @param logging The logging configuration defines where Image Builder uploads your logs. 
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("668f7e605a157c72d15bc514ef2dec91a5b4d84d02e0db4d951ddae0a3db24ae")
    override fun logging(logging: LoggingProperty.Builder.() -> Unit): Unit =
        logging(LoggingProperty(logging))

    /**
     * The name of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-name)
     * @param name The name of the infrastructure configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * The tags attached to the resource created by Image Builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
     * @param resourceTags The tags attached to the resource created by Image Builder. 
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * The tags attached to the resource created by Image Builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
     * @param resourceTags The tags attached to the resource created by Image Builder. 
     */
    override fun resourceTags(resourceTags: Map<String, String>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * The security group IDs of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
     * @param securityGroupIds The security group IDs of the infrastructure configuration. 
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * The security group IDs of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
     * @param securityGroupIds The security group IDs of the infrastructure configuration. 
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * The Amazon Resource Name (ARN) of the SNS topic for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-snstopicarn)
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic for the infrastructure
     * configuration. 
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * The subnet ID of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-subnetid)
     * @param subnetId The subnet ID of the infrastructure configuration. 
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * The tags of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-tags)
     * @param tags The tags of the infrastructure configuration. 
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration. 
     */
    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
    }

    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration. 
     */
    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure.let(IResolvable::unwrap))
    }

    public fun build(): software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration
        = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnInfrastructureConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnInfrastructureConfiguration(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration):
        CfnInfrastructureConfiguration = CfnInfrastructureConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnInfrastructureConfiguration):
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration =
        wrapped.cdkObject
  }

  /**
   * Amazon S3 logging configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * S3LogsProperty s3LogsProperty = S3LogsProperty.builder()
   * .s3BucketName("s3BucketName")
   * .s3KeyPrefix("s3KeyPrefix")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html)
   */
  public interface S3LogsProperty {
    /**
     * The S3 bucket in which to store the logs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html#cfn-imagebuilder-infrastructureconfiguration-s3logs-s3bucketname)
     */
    public fun s3BucketName(): String? = unwrap(this).getS3BucketName()

    /**
     * The Amazon S3 path to the bucket where the logs are stored.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html#cfn-imagebuilder-infrastructureconfiguration-s3logs-s3keyprefix)
     */
    public fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()

    /**
     * A builder for [S3LogsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3BucketName The S3 bucket in which to store the logs.
       */
      public fun s3BucketName(s3BucketName: String)

      /**
       * @param s3KeyPrefix The Amazon S3 path to the bucket where the logs are stored.
       */
      public fun s3KeyPrefix(s3KeyPrefix: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty.builder()

      /**
       * @param s3BucketName The S3 bucket in which to store the logs.
       */
      override fun s3BucketName(s3BucketName: String) {
        cdkBuilder.s3BucketName(s3BucketName)
      }

      /**
       * @param s3KeyPrefix The Amazon S3 path to the bucket where the logs are stored.
       */
      override fun s3KeyPrefix(s3KeyPrefix: String) {
        cdkBuilder.s3KeyPrefix(s3KeyPrefix)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty,
    ) : CdkObject(cdkObject), S3LogsProperty {
      /**
       * The S3 bucket in which to store the logs.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html#cfn-imagebuilder-infrastructureconfiguration-s3logs-s3bucketname)
       */
      override fun s3BucketName(): String? = unwrap(this).getS3BucketName()

      /**
       * The Amazon S3 path to the bucket where the logs are stored.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-s3logs.html#cfn-imagebuilder-infrastructureconfiguration-s3logs-s3keyprefix)
       */
      override fun s3KeyPrefix(): String? = unwrap(this).getS3KeyPrefix()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): S3LogsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty):
          S3LogsProperty = CdkObjectWrappers.wrap(cdkObject) as S3LogsProperty

      internal fun unwrap(wrapped: S3LogsProperty):
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.S3LogsProperty
    }
  }

  /**
   * Logging configuration defines where Image Builder uploads your logs.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * LoggingProperty loggingProperty = LoggingProperty.builder()
   * .s3Logs(S3LogsProperty.builder()
   * .s3BucketName("s3BucketName")
   * .s3KeyPrefix("s3KeyPrefix")
   * .build())
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-logging.html)
   */
  public interface LoggingProperty {
    /**
     * The Amazon S3 logging configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-logging.html#cfn-imagebuilder-infrastructureconfiguration-logging-s3logs)
     */
    public fun s3Logs(): Any? = unwrap(this).getS3Logs()

    /**
     * A builder for [LoggingProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param s3Logs The Amazon S3 logging configuration.
       */
      public fun s3Logs(s3Logs: IResolvable)

      /**
       * @param s3Logs The Amazon S3 logging configuration.
       */
      public fun s3Logs(s3Logs: S3LogsProperty)

      /**
       * @param s3Logs The Amazon S3 logging configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e9563363a0603bf873c97808686b4ca093cdb2e6f9f28e63b7c800744cafff")
      public fun s3Logs(s3Logs: S3LogsProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty.builder()

      /**
       * @param s3Logs The Amazon S3 logging configuration.
       */
      override fun s3Logs(s3Logs: IResolvable) {
        cdkBuilder.s3Logs(s3Logs.let(IResolvable::unwrap))
      }

      /**
       * @param s3Logs The Amazon S3 logging configuration.
       */
      override fun s3Logs(s3Logs: S3LogsProperty) {
        cdkBuilder.s3Logs(s3Logs.let(S3LogsProperty::unwrap))
      }

      /**
       * @param s3Logs The Amazon S3 logging configuration.
       */
      @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("10e9563363a0603bf873c97808686b4ca093cdb2e6f9f28e63b7c800744cafff")
      override fun s3Logs(s3Logs: S3LogsProperty.Builder.() -> Unit): Unit =
          s3Logs(S3LogsProperty(s3Logs))

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty,
    ) : CdkObject(cdkObject), LoggingProperty {
      /**
       * The Amazon S3 logging configuration.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-logging.html#cfn-imagebuilder-infrastructureconfiguration-logging-s3logs)
       */
      override fun s3Logs(): Any? = unwrap(this).getS3Logs()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): LoggingProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty):
          LoggingProperty = CdkObjectWrappers.wrap(cdkObject) as LoggingProperty

      internal fun unwrap(wrapped: LoggingProperty):
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.LoggingProperty
    }
  }

  /**
   * The instance metadata options that apply to the HTTP requests that pipeline builds use to
   * launch EC2 build and test instances.
   *
   * For more information about instance metadata options, see [Configure the instance metadata
   * options](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-instance-metadata-options.html)
   * in the **Amazon EC2 User Guide** for Linux instances, or [Configure the instance metadata
   * options](https://docs.aws.amazon.com/AWSEC2/latest/WindowsGuide/configuring-instance-metadata-options.html)
   * in the **Amazon EC2 Windows Guide** for Windows instances.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
   * InstanceMetadataOptionsProperty instanceMetadataOptionsProperty =
   * InstanceMetadataOptionsProperty.builder()
   * .httpPutResponseHopLimit(123)
   * .httpTokens("httpTokens")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-instancemetadataoptions.html)
   */
  public interface InstanceMetadataOptionsProperty {
    /**
     * Limit the number of hops that an instance metadata request can traverse to reach its
     * destination.
     *
     * The default is one hop. However, if HTTP tokens are required, container image builds need a
     * minimum of two hops.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-instancemetadataoptions.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions-httpputresponsehoplimit)
     */
    public fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

    /**
     * Indicates whether a signed token header is required for instance metadata retrieval requests.
     *
     * The values affect the response as follows:
     *
     * * *required* – When you retrieve the IAM role credentials, version 2.0 credentials are
     * returned in all cases.
     * * *optional* – You can include a signed token header in your request to retrieve instance
     * metadata, or you can leave it out. If you include it, version 2.0 credentials are returned for
     * the IAM role. Otherwise, version 1.0 credentials are returned.
     *
     * The default setting is *optional* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-instancemetadataoptions.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions-httptokens)
     */
    public fun httpTokens(): String? = unwrap(this).getHttpTokens()

    /**
     * A builder for [InstanceMetadataOptionsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param httpPutResponseHopLimit Limit the number of hops that an instance metadata request
       * can traverse to reach its destination.
       * The default is one hop. However, if HTTP tokens are required, container image builds need a
       * minimum of two hops.
       */
      public fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number)

      /**
       * @param httpTokens Indicates whether a signed token header is required for instance metadata
       * retrieval requests.
       * The values affect the response as follows:
       *
       * * *required* – When you retrieve the IAM role credentials, version 2.0 credentials are
       * returned in all cases.
       * * *optional* – You can include a signed token header in your request to retrieve instance
       * metadata, or you can leave it out. If you include it, version 2.0 credentials are returned for
       * the IAM role. Otherwise, version 1.0 credentials are returned.
       *
       * The default setting is *optional* .
       */
      public fun httpTokens(httpTokens: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder
          =
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.builder()

      /**
       * @param httpPutResponseHopLimit Limit the number of hops that an instance metadata request
       * can traverse to reach its destination.
       * The default is one hop. However, if HTTP tokens are required, container image builds need a
       * minimum of two hops.
       */
      override fun httpPutResponseHopLimit(httpPutResponseHopLimit: Number) {
        cdkBuilder.httpPutResponseHopLimit(httpPutResponseHopLimit)
      }

      /**
       * @param httpTokens Indicates whether a signed token header is required for instance metadata
       * retrieval requests.
       * The values affect the response as follows:
       *
       * * *required* – When you retrieve the IAM role credentials, version 2.0 credentials are
       * returned in all cases.
       * * *optional* – You can include a signed token header in your request to retrieve instance
       * metadata, or you can leave it out. If you include it, version 2.0 credentials are returned for
       * the IAM role. Otherwise, version 1.0 credentials are returned.
       *
       * The default setting is *optional* .
       */
      override fun httpTokens(httpTokens: String) {
        cdkBuilder.httpTokens(httpTokens)
      }

      public fun build():
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty
          = cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty,
    ) : CdkObject(cdkObject), InstanceMetadataOptionsProperty {
      /**
       * Limit the number of hops that an instance metadata request can traverse to reach its
       * destination.
       *
       * The default is one hop. However, if HTTP tokens are required, container image builds need a
       * minimum of two hops.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-instancemetadataoptions.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions-httpputresponsehoplimit)
       */
      override fun httpPutResponseHopLimit(): Number? = unwrap(this).getHttpPutResponseHopLimit()

      /**
       * Indicates whether a signed token header is required for instance metadata retrieval
       * requests.
       *
       * The values affect the response as follows:
       *
       * * *required* – When you retrieve the IAM role credentials, version 2.0 credentials are
       * returned in all cases.
       * * *optional* – You can include a signed token header in your request to retrieve instance
       * metadata, or you can leave it out. If you include it, version 2.0 credentials are returned for
       * the IAM role. Otherwise, version 1.0 credentials are returned.
       *
       * The default setting is *optional* .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-imagebuilder-infrastructureconfiguration-instancemetadataoptions.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions-httptokens)
       */
      override fun httpTokens(): String? = unwrap(this).getHttpTokens()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): InstanceMetadataOptionsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty):
          InstanceMetadataOptionsProperty = CdkObjectWrappers.wrap(cdkObject) as
          InstanceMetadataOptionsProperty

      internal fun unwrap(wrapped: InstanceMetadataOptionsProperty):
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty
          = (wrapped as CdkObject).cdkObject as
          software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty
    }
  }
}
