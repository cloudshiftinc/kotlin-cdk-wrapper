@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnInfrastructureConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.imagebuilder.*;
 * CfnInfrastructureConfigurationProps cfnInfrastructureConfigurationProps =
 * CfnInfrastructureConfigurationProps.builder()
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
 * .placement(PlacementProperty.builder()
 * .availabilityZone("availabilityZone")
 * .hostId("hostId")
 * .hostResourceGroupArn("hostResourceGroupArn")
 * .tenancy("tenancy")
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
public interface CfnInfrastructureConfigurationProps {
  /**
   * The description of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The instance metadata options that you can set for the HTTP requests that pipeline builds use
   * to launch EC2 build and test instances.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
   */
  public fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

  /**
   * The instance profile to associate with the instance used to customize your Amazon EC2 AMI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instanceprofilename)
   */
  public fun instanceProfileName(): String

  /**
   * The instance types of the infrastructure configuration.
   *
   * You can specify one or more instance types to use for this build. The service will pick one of
   * these instance types based on availability.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
   */
  public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  /**
   * The key pair of the infrastructure configuration.
   *
   * You can use this to log on to and debug the instance used to create your image.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-keypair)
   */
  public fun keyPair(): String? = unwrap(this).getKeyPair()

  /**
   * The logging configuration of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
   */
  public fun logging(): Any? = unwrap(this).getLogging()

  /**
   * The name of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-name)
   */
  public fun name(): String

  /**
   * The instance placement settings that define where the instances that are launched from your
   * image will run.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-placement)
   */
  public fun placement(): Any? = unwrap(this).getPlacement()

  /**
   * The metadata tags to assign to the Amazon EC2 instance that Image Builder launches during the
   * build process.
   *
   * Tags are formatted as key value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
   */
  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * The security group IDs to associate with the instance used to customize your Amazon EC2 AMI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) for the SNS topic to which we send image build event
   * notifications.
   *
   *
   * EC2 Image Builder is unable to send notifications to SNS topics that are encrypted using keys
   * from other accounts. The key that is used to encrypt the SNS topic must reside in the account that
   * the Image Builder service runs under.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-snstopicarn)
   */
  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * The subnet ID in which to place the instance used to customize your Amazon EC2 AMI.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The metadata tags to assign to the infrastructure configuration resource that Image Builder
   * creates as output.
   *
   * Tags are formatted as key value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The terminate instance on failure setting of the infrastructure configuration.
   *
   * Set to false if you want Image Builder to retain the instance used to configure your AMI if the
   * build or test phase of your workflow fails.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
   */
  public fun terminateInstanceOnFailure(): Any? = unwrap(this).getTerminateInstanceOnFailure()

  /**
   * A builder for [CfnInfrastructureConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description The description of the infrastructure configuration.
     */
    public fun description(description: String)

    /**
     * @param instanceMetadataOptions The instance metadata options that you can set for the HTTP
     * requests that pipeline builds use to launch EC2 build and test instances.
     */
    public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable)

    /**
     * @param instanceMetadataOptions The instance metadata options that you can set for the HTTP
     * requests that pipeline builds use to launch EC2 build and test instances.
     */
    public
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty)

    /**
     * @param instanceMetadataOptions The instance metadata options that you can set for the HTTP
     * requests that pipeline builds use to launch EC2 build and test instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a6a8239cd0b9d52c1d027610fb7cdc90f79c930841a33643caaa091a0fafc8e")
    public
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder.() -> Unit)

    /**
     * @param instanceProfileName The instance profile to associate with the instance used to
     * customize your Amazon EC2 AMI. 
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     * You can specify one or more instance types to use for this build. The service will pick one
     * of these instance types based on availability.
     */
    public fun instanceTypes(instanceTypes: List<String>)

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     * You can specify one or more instance types to use for this build. The service will pick one
     * of these instance types based on availability.
     */
    public fun instanceTypes(vararg instanceTypes: String)

    /**
     * @param keyPair The key pair of the infrastructure configuration.
     * You can use this to log on to and debug the instance used to create your image.
     */
    public fun keyPair(keyPair: String)

    /**
     * @param logging The logging configuration of the infrastructure configuration.
     */
    public fun logging(logging: IResolvable)

    /**
     * @param logging The logging configuration of the infrastructure configuration.
     */
    public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty)

    /**
     * @param logging The logging configuration of the infrastructure configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf648abfd79f264614f5df1feaae17d622c7d7a162001c656eecb67db4671b0")
    public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty.Builder.() -> Unit)

    /**
     * @param name The name of the infrastructure configuration. 
     */
    public fun name(name: String)

    /**
     * @param placement The instance placement settings that define where the instances that are
     * launched from your image will run.
     */
    public fun placement(placement: IResolvable)

    /**
     * @param placement The instance placement settings that define where the instances that are
     * launched from your image will run.
     */
    public fun placement(placement: CfnInfrastructureConfiguration.PlacementProperty)

    /**
     * @param placement The instance placement settings that define where the instances that are
     * launched from your image will run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2236db51934879948d63f6c1281dc364beda4ad02d99deb45fd6b8635d11e343")
    public
        fun placement(placement: CfnInfrastructureConfiguration.PlacementProperty.Builder.() -> Unit)

    /**
     * @param resourceTags The metadata tags to assign to the Amazon EC2 instance that Image Builder
     * launches during the build process.
     * Tags are formatted as key value pairs.
     */
    public fun resourceTags(resourceTags: Map<String, String>)

    /**
     * @param resourceTags The metadata tags to assign to the Amazon EC2 instance that Image Builder
     * launches during the build process.
     * Tags are formatted as key value pairs.
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param securityGroupIds The security group IDs to associate with the instance used to
     * customize your Amazon EC2 AMI.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The security group IDs to associate with the instance used to
     * customize your Amazon EC2 AMI.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) for the SNS topic to which we send image
     * build event notifications.
     *
     * EC2 Image Builder is unable to send notifications to SNS topics that are encrypted using keys
     * from other accounts. The key that is used to encrypt the SNS topic must reside in the account
     * that the Image Builder service runs under.
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * @param subnetId The subnet ID in which to place the instance used to customize your Amazon
     * EC2 AMI.
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags The metadata tags to assign to the infrastructure configuration resource that
     * Image Builder creates as output.
     * Tags are formatted as key value pairs.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure setting of the
     * infrastructure configuration.
     * Set to false if you want Image Builder to retain the instance used to configure your AMI if
     * the build or test phase of your workflow fails.
     */
    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean)

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure setting of the
     * infrastructure configuration.
     * Set to false if you want Image Builder to retain the instance used to configure your AMI if
     * the build or test phase of your workflow fails.
     */
    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps.Builder =
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps.builder()

    /**
     * @param description The description of the infrastructure configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param instanceMetadataOptions The instance metadata options that you can set for the HTTP
     * requests that pipeline builds use to launch EC2 build and test instances.
     */
    override fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param instanceMetadataOptions The instance metadata options that you can set for the HTTP
     * requests that pipeline builds use to launch EC2 build and test instances.
     */
    override
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Companion::unwrap))
    }

    /**
     * @param instanceMetadataOptions The instance metadata options that you can set for the HTTP
     * requests that pipeline builds use to launch EC2 build and test instances.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a6a8239cd0b9d52c1d027610fb7cdc90f79c930841a33643caaa091a0fafc8e")
    override
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder.() -> Unit):
        Unit =
        instanceMetadataOptions(CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty(instanceMetadataOptions))

    /**
     * @param instanceProfileName The instance profile to associate with the instance used to
     * customize your Amazon EC2 AMI. 
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     * You can specify one or more instance types to use for this build. The service will pick one
     * of these instance types based on availability.
     */
    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     * You can specify one or more instance types to use for this build. The service will pick one
     * of these instance types based on availability.
     */
    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * @param keyPair The key pair of the infrastructure configuration.
     * You can use this to log on to and debug the instance used to create your image.
     */
    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    /**
     * @param logging The logging configuration of the infrastructure configuration.
     */
    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param logging The logging configuration of the infrastructure configuration.
     */
    override fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty) {
      cdkBuilder.logging(logging.let(CfnInfrastructureConfiguration.LoggingProperty.Companion::unwrap))
    }

    /**
     * @param logging The logging configuration of the infrastructure configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf648abfd79f264614f5df1feaae17d622c7d7a162001c656eecb67db4671b0")
    override
        fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty.Builder.() -> Unit):
        Unit = logging(CfnInfrastructureConfiguration.LoggingProperty(logging))

    /**
     * @param name The name of the infrastructure configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param placement The instance placement settings that define where the instances that are
     * launched from your image will run.
     */
    override fun placement(placement: IResolvable) {
      cdkBuilder.placement(placement.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param placement The instance placement settings that define where the instances that are
     * launched from your image will run.
     */
    override fun placement(placement: CfnInfrastructureConfiguration.PlacementProperty) {
      cdkBuilder.placement(placement.let(CfnInfrastructureConfiguration.PlacementProperty.Companion::unwrap))
    }

    /**
     * @param placement The instance placement settings that define where the instances that are
     * launched from your image will run.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2236db51934879948d63f6c1281dc364beda4ad02d99deb45fd6b8635d11e343")
    override
        fun placement(placement: CfnInfrastructureConfiguration.PlacementProperty.Builder.() -> Unit):
        Unit = placement(CfnInfrastructureConfiguration.PlacementProperty(placement))

    /**
     * @param resourceTags The metadata tags to assign to the Amazon EC2 instance that Image Builder
     * launches during the build process.
     * Tags are formatted as key value pairs.
     */
    override fun resourceTags(resourceTags: Map<String, String>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * @param resourceTags The metadata tags to assign to the Amazon EC2 instance that Image Builder
     * launches during the build process.
     * Tags are formatted as key value pairs.
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param securityGroupIds The security group IDs to associate with the instance used to
     * customize your Amazon EC2 AMI.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The security group IDs to associate with the instance used to
     * customize your Amazon EC2 AMI.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) for the SNS topic to which we send image
     * build event notifications.
     *
     * EC2 Image Builder is unable to send notifications to SNS topics that are encrypted using keys
     * from other accounts. The key that is used to encrypt the SNS topic must reside in the account
     * that the Image Builder service runs under.
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param subnetId The subnet ID in which to place the instance used to customize your Amazon
     * EC2 AMI.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags The metadata tags to assign to the infrastructure configuration resource that
     * Image Builder creates as output.
     * Tags are formatted as key value pairs.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure setting of the
     * infrastructure configuration.
     * Set to false if you want Image Builder to retain the instance used to configure your AMI if
     * the build or test phase of your workflow fails.
     */
    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
    }

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure setting of the
     * infrastructure configuration.
     * Set to false if you want Image Builder to retain the instance used to configure your AMI if
     * the build or test phase of your workflow fails.
     */
    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure.let(IResolvable.Companion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps,
  ) : CdkObject(cdkObject),
      CfnInfrastructureConfigurationProps {
    /**
     * The description of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The instance metadata options that you can set for the HTTP requests that pipeline builds use
     * to launch EC2 build and test instances.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     */
    override fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

    /**
     * The instance profile to associate with the instance used to customize your Amazon EC2 AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instanceprofilename)
     */
    override fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

    /**
     * The instance types of the infrastructure configuration.
     *
     * You can specify one or more instance types to use for this build. The service will pick one
     * of these instance types based on availability.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
     */
    override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    /**
     * The key pair of the infrastructure configuration.
     *
     * You can use this to log on to and debug the instance used to create your image.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-keypair)
     */
    override fun keyPair(): String? = unwrap(this).getKeyPair()

    /**
     * The logging configuration of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-logging)
     */
    override fun logging(): Any? = unwrap(this).getLogging()

    /**
     * The name of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The instance placement settings that define where the instances that are launched from your
     * image will run.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-placement)
     */
    override fun placement(): Any? = unwrap(this).getPlacement()

    /**
     * The metadata tags to assign to the Amazon EC2 instance that Image Builder launches during the
     * build process.
     *
     * Tags are formatted as key value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
     */
    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * The security group IDs to associate with the instance used to customize your Amazon EC2 AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The Amazon Resource Name (ARN) for the SNS topic to which we send image build event
     * notifications.
     *
     *
     * EC2 Image Builder is unable to send notifications to SNS topics that are encrypted using keys
     * from other accounts. The key that is used to encrypt the SNS topic must reside in the account
     * that the Image Builder service runs under.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-snstopicarn)
     */
    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * The subnet ID in which to place the instance used to customize your Amazon EC2 AMI.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The metadata tags to assign to the infrastructure configuration resource that Image Builder
     * creates as output.
     *
     * Tags are formatted as key value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The terminate instance on failure setting of the infrastructure configuration.
     *
     * Set to false if you want Image Builder to retain the instance used to configure your AMI if
     * the build or test phase of your workflow fails.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-terminateinstanceonfailure)
     */
    override fun terminateInstanceOnFailure(): Any? = unwrap(this).getTerminateInstanceOnFailure()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnInfrastructureConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps):
        CfnInfrastructureConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as?
        CfnInfrastructureConfigurationProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInfrastructureConfigurationProps):
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps
  }
}
