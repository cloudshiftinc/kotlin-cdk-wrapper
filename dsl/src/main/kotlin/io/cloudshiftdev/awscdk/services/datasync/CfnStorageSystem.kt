package io.cloudshiftdev.awscdk.services.datasync

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.Number
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnStorageSystem internal constructor(
  private val cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from
   * your on-premises storage system's management interface.
   */
  public open fun agentArns(): List<String> = unwrap(this).getAgentArns()

  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from
   * your on-premises storage system's management interface.
   */
  public open fun agentArns(`value`: List<String>) {
    unwrap(this).setAgentArns(`value`)
  }

  /**
   * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads from
   * your on-premises storage system's management interface.
   */
  public open fun agentArns(vararg `value`: String): Unit = agentArns(`value`.toList())

  /**
   * Indicates whether your DataSync agent can connect to your on-premises storage system.
   */
  public open fun attrConnectivityStatus(): String = unwrap(this).getAttrConnectivityStatus()

  /**
   * The ARN of the secret that stores your on-premises storage system's credentials.
   *
   * DataSync Discovery stores these credentials in [AWS Secrets
   * Manager](https://docs.aws.amazon.com/datasync/latest/userguide/discovery-configure-storage.html#discovery-add-storage)
   * .
   */
  public open fun attrSecretsManagerArn(): String = unwrap(this).getAttrSecretsManagerArn()

  /**
   * The ARN of the on-premises storage system that you're using with DataSync Discovery.
   */
  public open fun attrStorageSystemArn(): String = unwrap(this).getAttrStorageSystemArn()

  /**
   * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job
   * events.
   */
  public open fun cloudWatchLogGroupArn(): String? = unwrap(this).getCloudWatchLogGroupArn()

  /**
   * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job
   * events.
   */
  public open fun cloudWatchLogGroupArn(`value`: String) {
    unwrap(this).setCloudWatchLogGroupArn(`value`)
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
   * Specifies a familiar name for your on-premises storage system.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * Specifies a familiar name for your on-premises storage system.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Specifies the server name and network port required to connect with the management interface of
   * your on-premises storage system.
   */
  public open fun serverConfiguration(): Any = unwrap(this).getServerConfiguration()

  /**
   * Specifies the server name and network port required to connect with the management interface of
   * your on-premises storage system.
   */
  public open fun serverConfiguration(`value`: IResolvable) {
    unwrap(this).setServerConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the server name and network port required to connect with the management interface of
   * your on-premises storage system.
   */
  public open fun serverConfiguration(`value`: ServerConfigurationProperty) {
    unwrap(this).setServerConfiguration(`value`.let(ServerConfigurationProperty::unwrap))
  }

  /**
   * Specifies the server name and network port required to connect with the management interface of
   * your on-premises storage system.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("5466e14becae674a0dce47d6eaab619951c00abe5ed3ec13560e946dd5e73587")
  public open fun serverConfiguration(`value`: ServerConfigurationProperty.Builder.() -> Unit): Unit
      = serverConfiguration(ServerConfigurationProperty(`value`))

  /**
   * Specifies the user name and password for accessing your on-premises storage system's management
   * interface.
   */
  public open fun serverCredentials(): Any? = unwrap(this).getServerCredentials()

  /**
   * Specifies the user name and password for accessing your on-premises storage system's management
   * interface.
   */
  public open fun serverCredentials(`value`: IResolvable) {
    unwrap(this).setServerCredentials(`value`.let(IResolvable::unwrap))
  }

  /**
   * Specifies the user name and password for accessing your on-premises storage system's management
   * interface.
   */
  public open fun serverCredentials(`value`: ServerCredentialsProperty) {
    unwrap(this).setServerCredentials(`value`.let(ServerCredentialsProperty::unwrap))
  }

  /**
   * Specifies the user name and password for accessing your on-premises storage system's management
   * interface.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("d5cd0b69c441200604cd8f75bec38bc529d02d3b2c00432210a81ac3da6578f7")
  public open fun serverCredentials(`value`: ServerCredentialsProperty.Builder.() -> Unit): Unit =
      serverCredentials(ServerCredentialsProperty(`value`))

  /**
   * Specifies the type of on-premises storage system that you want DataSync Discovery to collect
   * information about.
   */
  public open fun systemType(): String = unwrap(this).getSystemType()

  /**
   * Specifies the type of on-premises storage system that you want DataSync Discovery to collect
   * information about.
   */
  public open fun systemType(`value`: String) {
    unwrap(this).setSystemType(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * Specifies labels that help you categorize, filter, and search for your AWS resources.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.datasync.CfnStorageSystem].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads
     * from your on-premises storage system's management interface.
     *
     * You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     */
    public fun agentArns(agentArns: List<String>)

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads
     * from your on-premises storage system's management interface.
     *
     * You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     */
    public fun agentArns(vararg agentArns: String)

    /**
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-cloudwatchloggrouparn)
     * @param cloudWatchLogGroupArn Specifies the ARN of the Amazon CloudWatch log group for
     * monitoring and logging discovery job events. 
     */
    public fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String)

    /**
     * Specifies a familiar name for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-name)
     * @param name Specifies a familiar name for your on-premises storage system. 
     */
    public fun name(name: String)

    /**
     * Specifies the server name and network port required to connect with the management interface
     * of your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    public fun serverConfiguration(serverConfiguration: IResolvable)

    /**
     * Specifies the server name and network port required to connect with the management interface
     * of your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    public fun serverConfiguration(serverConfiguration: ServerConfigurationProperty)

    /**
     * Specifies the server name and network port required to connect with the management interface
     * of your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fea3a02de023e3ab99ac7b14d437a015acfd8a3eeeb131cc96ae57fd8fe82")
    public
        fun serverConfiguration(serverConfiguration: ServerConfigurationProperty.Builder.() -> Unit)

    /**
     * Specifies the user name and password for accessing your on-premises storage system's
     * management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface. 
     */
    public fun serverCredentials(serverCredentials: IResolvable)

    /**
     * Specifies the user name and password for accessing your on-premises storage system's
     * management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface. 
     */
    public fun serverCredentials(serverCredentials: ServerCredentialsProperty)

    /**
     * Specifies the user name and password for accessing your on-premises storage system's
     * management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ebba701bf8b661b60c10a0d2748b0e9d4fa67046ab26a76b24e3736ca96bb96")
    public fun serverCredentials(serverCredentials: ServerCredentialsProperty.Builder.() -> Unit)

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
     * @param systemType Specifies the type of on-premises storage system that you want DataSync
     * Discovery to collect information about. 
     */
    public fun systemType(systemType: String)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.datasync.CfnStorageSystem.Builder =
        software.amazon.awscdk.services.datasync.CfnStorageSystem.Builder.create(scope, id)

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads
     * from your on-premises storage system's management interface.
     *
     * You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     */
    override fun agentArns(agentArns: List<String>) {
      cdkBuilder.agentArns(agentArns)
    }

    /**
     * Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects to and reads
     * from your on-premises storage system's management interface.
     *
     * You can only specify one ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-agentarns)
     * @param agentArns Specifies the Amazon Resource Name (ARN) of the DataSync agent that connects
     * to and reads from your on-premises storage system's management interface. 
     */
    override fun agentArns(vararg agentArns: String): Unit = agentArns(agentArns.toList())

    /**
     * Specifies the ARN of the Amazon CloudWatch log group for monitoring and logging discovery job
     * events.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-cloudwatchloggrouparn)
     * @param cloudWatchLogGroupArn Specifies the ARN of the Amazon CloudWatch log group for
     * monitoring and logging discovery job events. 
     */
    override fun cloudWatchLogGroupArn(cloudWatchLogGroupArn: String) {
      cdkBuilder.cloudWatchLogGroupArn(cloudWatchLogGroupArn)
    }

    /**
     * Specifies a familiar name for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-name)
     * @param name Specifies a familiar name for your on-premises storage system. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Specifies the server name and network port required to connect with the management interface
     * of your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    override fun serverConfiguration(serverConfiguration: IResolvable) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Specifies the server name and network port required to connect with the management interface
     * of your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    override fun serverConfiguration(serverConfiguration: ServerConfigurationProperty) {
      cdkBuilder.serverConfiguration(serverConfiguration.let(ServerConfigurationProperty::unwrap))
    }

    /**
     * Specifies the server name and network port required to connect with the management interface
     * of your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-serverconfiguration)
     * @param serverConfiguration Specifies the server name and network port required to connect
     * with the management interface of your on-premises storage system. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("d63fea3a02de023e3ab99ac7b14d437a015acfd8a3eeeb131cc96ae57fd8fe82")
    override
        fun serverConfiguration(serverConfiguration: ServerConfigurationProperty.Builder.() -> Unit):
        Unit = serverConfiguration(ServerConfigurationProperty(serverConfiguration))

    /**
     * Specifies the user name and password for accessing your on-premises storage system's
     * management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface. 
     */
    override fun serverCredentials(serverCredentials: IResolvable) {
      cdkBuilder.serverCredentials(serverCredentials.let(IResolvable::unwrap))
    }

    /**
     * Specifies the user name and password for accessing your on-premises storage system's
     * management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface. 
     */
    override fun serverCredentials(serverCredentials: ServerCredentialsProperty) {
      cdkBuilder.serverCredentials(serverCredentials.let(ServerCredentialsProperty::unwrap))
    }

    /**
     * Specifies the user name and password for accessing your on-premises storage system's
     * management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-servercredentials)
     * @param serverCredentials Specifies the user name and password for accessing your on-premises
     * storage system's management interface. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("9ebba701bf8b661b60c10a0d2748b0e9d4fa67046ab26a76b24e3736ca96bb96")
    override fun serverCredentials(serverCredentials: ServerCredentialsProperty.Builder.() -> Unit):
        Unit = serverCredentials(ServerCredentialsProperty(serverCredentials))

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
     * @param systemType Specifies the type of on-premises storage system that you want DataSync
     * Discovery to collect information about. 
     */
    override fun systemType(systemType: String) {
      cdkBuilder.systemType(systemType)
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * Specifies labels that help you categorize, filter, and search for your AWS resources.
     *
     * We recommend creating at least a name tag for your on-premises storage system.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-datasync-storagesystem.html#cfn-datasync-storagesystem-tags)
     * @param tags Specifies labels that help you categorize, filter, and search for your AWS
     * resources. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.datasync.CfnStorageSystem =
        cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnStorageSystem {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnStorageSystem(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem):
        CfnStorageSystem = CfnStorageSystem(cdkObject)

    internal fun unwrap(wrapped: CfnStorageSystem):
        software.amazon.awscdk.services.datasync.CfnStorageSystem = wrapped.cdkObject
  }

  public interface ServerCredentialsProperty {
    /**
     * Specifies the password for your storage system's management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-servercredentials.html#cfn-datasync-storagesystem-servercredentials-password)
     */
    public fun password(): String

    /**
     * Specifies the user name for your storage system's management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-servercredentials.html#cfn-datasync-storagesystem-servercredentials-username)
     */
    public fun username(): String

    /**
     * A builder for [ServerCredentialsProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param password Specifies the password for your storage system's management interface. 
       */
      public fun password(password: String)

      /**
       * @param username Specifies the user name for your storage system's management interface. 
       */
      public fun username(username: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty.builder()

      /**
       * @param password Specifies the password for your storage system's management interface. 
       */
      override fun password(password: String) {
        cdkBuilder.password(password)
      }

      /**
       * @param username Specifies the user name for your storage system's management interface. 
       */
      override fun username(username: String) {
        cdkBuilder.username(username)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty,
    ) : ServerCredentialsProperty {
      /**
       * Specifies the password for your storage system's management interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-servercredentials.html#cfn-datasync-storagesystem-servercredentials-password)
       */
      override fun password(): String = unwrap(this).getPassword()

      /**
       * Specifies the user name for your storage system's management interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-servercredentials.html#cfn-datasync-storagesystem-servercredentials-username)
       */
      override fun username(): String = unwrap(this).getUsername()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServerCredentialsProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty):
          ServerCredentialsProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerCredentialsProperty):
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerCredentialsProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface ServerConfigurationProperty {
    /**
     * The domain name or IP address of your storage system's management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-serverconfiguration.html#cfn-datasync-storagesystem-serverconfiguration-serverhostname)
     */
    public fun serverHostname(): String

    /**
     * The network port for accessing the storage system's management interface.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-serverconfiguration.html#cfn-datasync-storagesystem-serverconfiguration-serverport)
     */
    public fun serverPort(): Number? = unwrap(this).getServerPort()

    /**
     * A builder for [ServerConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param serverHostname The domain name or IP address of your storage system's management
       * interface. 
       */
      public fun serverHostname(serverHostname: String)

      /**
       * @param serverPort The network port for accessing the storage system's management interface.
       */
      public fun serverPort(serverPort: Number)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty.builder()

      /**
       * @param serverHostname The domain name or IP address of your storage system's management
       * interface. 
       */
      override fun serverHostname(serverHostname: String) {
        cdkBuilder.serverHostname(serverHostname)
      }

      /**
       * @param serverPort The network port for accessing the storage system's management interface.
       */
      override fun serverPort(serverPort: Number) {
        cdkBuilder.serverPort(serverPort)
      }

      public fun build():
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty,
    ) : ServerConfigurationProperty {
      /**
       * The domain name or IP address of your storage system's management interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-serverconfiguration.html#cfn-datasync-storagesystem-serverconfiguration-serverhostname)
       */
      override fun serverHostname(): String = unwrap(this).getServerHostname()

      /**
       * The network port for accessing the storage system's management interface.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-datasync-storagesystem-serverconfiguration.html#cfn-datasync-storagesystem-serverconfiguration-serverport)
       */
      override fun serverPort(): Number? = unwrap(this).getServerPort()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): ServerConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty):
          ServerConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: ServerConfigurationProperty):
          software.amazon.awscdk.services.datasync.CfnStorageSystem.ServerConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }
}
