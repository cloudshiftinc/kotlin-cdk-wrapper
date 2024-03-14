package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

public interface CfnStorageSystemProps {
  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from
   * your on-premises storage system's management interface.
   *
   * You can only specify one ARN.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
   */
  public fun agentArns(): List<String>

  /**
   * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job
   * events.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-cloudwatchloggrouparn)
   */
  public fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  /**
   * Specifies a familiar name for your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * Specifies the server name and network port required to connect with the management interface of
   * your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
   */
  public fun serverConfiguration(): Any

  /**
   * Specifies the user name and password for accessing your on-premises storage system's management
   * interface.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
   */
  public fun serverCredentials(): Any? = unwrap(this).getServerCredentials()

  /**
   * Specifies the type of on-premises storage system that you want DataSync Discovery to collect
   * information about.
   *
   *
   * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS
   * (AFF) systems running ONTAP 9.7 or later.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-systemtype)
   */
  public fun systemType(): String

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   *
   * We recommend creating at least a name tag for your on-premises storage system.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnStorageSystemProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     * You can only specify one ARN.
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     * You can only specify one ARN.
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * @param cloudWatchLogGroupArn Specifies the ARN of the Amazon CloudWatch log group for
     * monitoring and logging discovery job events.
     */
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

    /**
     * @param name Specifies a familiar name for your on-premises storage system.
     */
    public fun name(name: String)

    /**
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    public fun serverConfiguration(serverConfiguration: IResolvable)

    /**
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    public
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty)

    /**
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f546866c99d0d31dec9da1a0a4281857c386f71ad94e0c8d9b56fe7dbaaaadcb")
    public
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty.Builder.() -> Unit)

    /**
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface.
     */
    public fun serverCredentials(serverCredentials: IResolvable)

    /**
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface.
     */
    public fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty)

    /**
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de6f4601e88f63dca973f40e13ae32cc4dffa79eb470c75e144b0cc564c4bde5")
    public
        fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty.Builder.() -> Unit)

    /**
     * @param systemType Specifies the type of on-premises storage system that you want DataSync
     * Discovery to collect information about. 
     *
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS
     * (AFF) systems running ONTAP 9.7 or later.
     */
    public fun systemType(systemType: String)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your on-premises storage system.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your on-premises storage system.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnStorageSystemProps.Builder =
        software.amazon.awscdk.services.datasync.CfnStorageSystemProps.builder()

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     * You can only specify one ARN.
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     * You can only specify one ARN.
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * @param cloudWatchLogGroupArn Specifies the ARN of the Amazon CloudWatch log group for
     * monitoring and logging discovery job events.
     */
    override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    /**
     * @param name Specifies a familiar name for your on-premises storage system.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    override fun serverConfiguration(serverConfiguration: IResolvable) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    override
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(CfnStorageSystem.ServerConfigurationProperty::unwrap))
    }

    /**
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("f546866c99d0d31dec9da1a0a4281857c386f71ad94e0c8d9b56fe7dbaaaadcb")
    override
        fun serverConfiguration(serverConfiguration: CfnStorageSystem.ServerConfigurationProperty.Builder.() -> Unit):
        Unit =
        serverConfiguration(CfnStorageSystem.ServerConfigurationProperty(serverConfiguration))

    /**
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface.
     */
    override fun serverCredentials(serverCredentials: IResolvable) {
      cdkBuilder.serverCredentials(serverCredentials.let(IResolvable::unwrap))
    }

    /**
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface.
     */
    override fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty) {
      cdkBuilder.serverCredentials(serverCredentials.let(CfnStorageSystem.ServerCredentialsProperty::unwrap))
    }

    /**
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface.
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("de6f4601e88f63dca973f40e13ae32cc4dffa79eb470c75e144b0cc564c4bde5")
    override
        fun serverCredentials(serverCredentials: CfnStorageSystem.ServerCredentialsProperty.Builder.() -> Unit):
        Unit = serverCredentials(CfnStorageSystem.ServerCredentialsProperty(serverCredentials))

    /**
     * @param systemType Specifies the type of on-premises storage system that you want DataSync
     * Discovery to collect information about. 
     *
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS
     * (AFF) systems running ONTAP 9.7 or later.
     */
    override fun systemType(systemType: String) {
      cdkBuilder.systemType(systemType)
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your on-premises storage system.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources.
     * We recommend creating at least a name tag for your on-premises storage system.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnStorageSystemProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystemProps,
  ) : CdkObject(cdkObject), CfnStorageSystemProps {
    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads
     * from your on-premises storage system's management interface.
     *
     * You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
     */
    override fun agentArns(): List<String> = unwrap(this).getAgentArns()

    /**
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-cloudwatchloggrouparn)
     */
    override fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

    /**
     * Specifies a familiar name for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-name)
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * Specifies the server name and network port required to connect with the management interface
     * of your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
     */
    override fun serverConfiguration(): Any = unwrap(this).getServerConfiguration()

    /**
     * Specifies the user name and password for accessing your on-premises storage system's
     * management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
     */
    override fun serverCredentials(): Any? = unwrap(this).getServerCredentials()

    /**
     * Specifies the type of on-premises storage system that you want DataSync Discovery to collect
     * information about.
     *
     *
     * DataSync Discovery currently supports NetApp Fabric-Attached Storage (FAS) and All Flash FAS
     * (AFF) systems running ONTAP 9.7 or later.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-systemtype)
     */
    override fun systemType(): String = unwrap(this).getSystemType()

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnStorageSystemProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystemProps):
        CfnStorageSystemProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnStorageSystemProps):
        software.amazon.awscdk.services.datasync.CfnStorageSystemProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.datasync.CfnStorageSystemProps
  }
}
