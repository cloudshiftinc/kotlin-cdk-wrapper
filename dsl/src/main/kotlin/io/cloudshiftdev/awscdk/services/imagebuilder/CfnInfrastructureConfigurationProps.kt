package io.cloudshiftdev.awscdk.services.imagebuilder

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.collections.Map
import kotlin.jvm.JvmName

public interface CfnInfrastructureConfigurationProps {
  /**
   * The description of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The instance metadata option settings for the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
   */
  public fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

  /**
   * The instance profile of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instanceprofilename)
   */
  public fun instanceProfileName(): String

  /**
   * The instance types of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
   */
  public fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

  /**
   * The Amazon EC2 key pair of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-keypair)
   */
  public fun keyPair(): String? = unwrap(this).getKeyPair()

  /**
   * The logging configuration defines where Image Builder uploads your logs.
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
   * The tags attached to the resource created by Image Builder.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
   */
  public fun resourceTags(): Any? = unwrap(this).getResourceTags()

  /**
   * The security group IDs of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
   */
  public fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?: emptyList()

  /**
   * The Amazon Resource Name (ARN) of the SNS topic for the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-snstopicarn)
   */
  public fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

  /**
   * The subnet ID of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-subnetid)
   */
  public fun subnetId(): String? = unwrap(this).getSubnetId()

  /**
   * The tags of the infrastructure configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-tags)
   */
  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  /**
   * The terminate instance on failure configuration of the infrastructure configuration.
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
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration.
     */
    public fun instanceMetadataOptions(instanceMetadataOptions: IResolvable)

    /**
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration.
     */
    public
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty)

    /**
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a6a8239cd0b9d52c1d027610fb7cdc90f79c930841a33643caaa091a0fafc8e")
    public
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder.() -> Unit)

    /**
     * @param instanceProfileName The instance profile of the infrastructure configuration. 
     */
    public fun instanceProfileName(instanceProfileName: String)

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     */
    public fun instanceTypes(instanceTypes: List<String>)

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     */
    public fun instanceTypes(vararg instanceTypes: String)

    /**
     * @param keyPair The Amazon EC2 key pair of the infrastructure configuration.
     */
    public fun keyPair(keyPair: String)

    /**
     * @param logging The logging configuration defines where Image Builder uploads your logs.
     */
    public fun logging(logging: IResolvable)

    /**
     * @param logging The logging configuration defines where Image Builder uploads your logs.
     */
    public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty)

    /**
     * @param logging The logging configuration defines where Image Builder uploads your logs.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9cf648abfd79f264614f5df1feaae17d622c7d7a162001c656eecb67db4671b0")
    public fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty.Builder.() -> Unit)

    /**
     * @param name The name of the infrastructure configuration. 
     */
    public fun name(name: String)

    /**
     * @param resourceTags The tags attached to the resource created by Image Builder.
     */
    public fun resourceTags(resourceTags: IResolvable)

    /**
     * @param resourceTags The tags attached to the resource created by Image Builder.
     */
    public fun resourceTags(resourceTags: Map<String, String>)

    /**
     * @param securityGroupIds The security group IDs of the infrastructure configuration.
     */
    public fun securityGroupIds(securityGroupIds: List<String>)

    /**
     * @param securityGroupIds The security group IDs of the infrastructure configuration.
     */
    public fun securityGroupIds(vararg securityGroupIds: String)

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic for the infrastructure
     * configuration.
     */
    public fun snsTopicArn(snsTopicArn: String)

    /**
     * @param subnetId The subnet ID of the infrastructure configuration.
     */
    public fun subnetId(subnetId: String)

    /**
     * @param tags The tags of the infrastructure configuration.
     */
    public fun tags(tags: Map<String, String>)

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration.
     */
    public fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean)

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration.
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
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration.
     */
    override fun instanceMetadataOptions(instanceMetadataOptions: IResolvable) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(IResolvable::unwrap))
    }

    /**
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration.
     */
    override
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty) {
      cdkBuilder.instanceMetadataOptions(instanceMetadataOptions.let(CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty::unwrap))
    }

    /**
     * @param instanceMetadataOptions The instance metadata option settings for the infrastructure
     * configuration.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9a6a8239cd0b9d52c1d027610fb7cdc90f79c930841a33643caaa091a0fafc8e")
    override
        fun instanceMetadataOptions(instanceMetadataOptions: CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty.Builder.() -> Unit):
        Unit =
        instanceMetadataOptions(CfnInfrastructureConfiguration.InstanceMetadataOptionsProperty(instanceMetadataOptions))

    /**
     * @param instanceProfileName The instance profile of the infrastructure configuration. 
     */
    override fun instanceProfileName(instanceProfileName: String) {
      cdkBuilder.instanceProfileName(instanceProfileName)
    }

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     */
    override fun instanceTypes(instanceTypes: List<String>) {
      cdkBuilder.instanceTypes(instanceTypes)
    }

    /**
     * @param instanceTypes The instance types of the infrastructure configuration.
     */
    override fun instanceTypes(vararg instanceTypes: String): Unit =
        instanceTypes(instanceTypes.toList())

    /**
     * @param keyPair The Amazon EC2 key pair of the infrastructure configuration.
     */
    override fun keyPair(keyPair: String) {
      cdkBuilder.keyPair(keyPair)
    }

    /**
     * @param logging The logging configuration defines where Image Builder uploads your logs.
     */
    override fun logging(logging: IResolvable) {
      cdkBuilder.logging(logging.let(IResolvable::unwrap))
    }

    /**
     * @param logging The logging configuration defines where Image Builder uploads your logs.
     */
    override fun logging(logging: CfnInfrastructureConfiguration.LoggingProperty) {
      cdkBuilder.logging(logging.let(CfnInfrastructureConfiguration.LoggingProperty::unwrap))
    }

    /**
     * @param logging The logging configuration defines where Image Builder uploads your logs.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
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
     * @param resourceTags The tags attached to the resource created by Image Builder.
     */
    override fun resourceTags(resourceTags: IResolvable) {
      cdkBuilder.resourceTags(resourceTags.let(IResolvable::unwrap))
    }

    /**
     * @param resourceTags The tags attached to the resource created by Image Builder.
     */
    override fun resourceTags(resourceTags: Map<String, String>) {
      cdkBuilder.resourceTags(resourceTags)
    }

    /**
     * @param securityGroupIds The security group IDs of the infrastructure configuration.
     */
    override fun securityGroupIds(securityGroupIds: List<String>) {
      cdkBuilder.securityGroupIds(securityGroupIds)
    }

    /**
     * @param securityGroupIds The security group IDs of the infrastructure configuration.
     */
    override fun securityGroupIds(vararg securityGroupIds: String): Unit =
        securityGroupIds(securityGroupIds.toList())

    /**
     * @param snsTopicArn The Amazon Resource Name (ARN) of the SNS topic for the infrastructure
     * configuration.
     */
    override fun snsTopicArn(snsTopicArn: String) {
      cdkBuilder.snsTopicArn(snsTopicArn)
    }

    /**
     * @param subnetId The subnet ID of the infrastructure configuration.
     */
    override fun subnetId(subnetId: String) {
      cdkBuilder.subnetId(subnetId)
    }

    /**
     * @param tags The tags of the infrastructure configuration.
     */
    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration.
     */
    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: Boolean) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure)
    }

    /**
     * @param terminateInstanceOnFailure The terminate instance on failure configuration of the
     * infrastructure configuration.
     */
    override fun terminateInstanceOnFailure(terminateInstanceOnFailure: IResolvable) {
      cdkBuilder.terminateInstanceOnFailure(terminateInstanceOnFailure.let(IResolvable::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps,
  ) : CdkObject(cdkObject), CfnInfrastructureConfigurationProps {
    /**
     * The description of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The instance metadata option settings for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancemetadataoptions)
     */
    override fun instanceMetadataOptions(): Any? = unwrap(this).getInstanceMetadataOptions()

    /**
     * The instance profile of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instanceprofilename)
     */
    override fun instanceProfileName(): String = unwrap(this).getInstanceProfileName()

    /**
     * The instance types of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-instancetypes)
     */
    override fun instanceTypes(): List<String> = unwrap(this).getInstanceTypes() ?: emptyList()

    /**
     * The Amazon EC2 key pair of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-keypair)
     */
    override fun keyPair(): String? = unwrap(this).getKeyPair()

    /**
     * The logging configuration defines where Image Builder uploads your logs.
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
     * The tags attached to the resource created by Image Builder.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-resourcetags)
     */
    override fun resourceTags(): Any? = unwrap(this).getResourceTags()

    /**
     * The security group IDs of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-securitygroupids)
     */
    override fun securityGroupIds(): List<String> = unwrap(this).getSecurityGroupIds() ?:
        emptyList()

    /**
     * The Amazon Resource Name (ARN) of the SNS topic for the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-snstopicarn)
     */
    override fun snsTopicArn(): String? = unwrap(this).getSnsTopicArn()

    /**
     * The subnet ID of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-subnetid)
     */
    override fun subnetId(): String? = unwrap(this).getSubnetId()

    /**
     * The tags of the infrastructure configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-imagebuilder-infrastructureconfiguration.html#cfn-imagebuilder-infrastructureconfiguration-tags)
     */
    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

    /**
     * The terminate instance on failure configuration of the infrastructure configuration.
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
        CfnInfrastructureConfigurationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnInfrastructureConfigurationProps):
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.imagebuilder.CfnInfrastructureConfigurationProps
  }
}
