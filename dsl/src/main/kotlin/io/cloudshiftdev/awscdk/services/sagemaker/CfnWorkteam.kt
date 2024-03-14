package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Any
import kotlin.String
import kotlin.Suppress
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

public open class CfnWorkteam internal constructor(
  private val cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   *
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The name of the work team.
   */
  public open fun attrWorkteamName(): String = unwrap(this).getAttrWorkteamName()

  /**
   * A description of the work team.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * A description of the work team.
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
   * A list of `MemberDefinition` objects that contains objects that identify the workers that make
   * up the work team.
   */
  public open fun memberDefinitions(): Any? = unwrap(this).getMemberDefinitions()

  /**
   * A list of `MemberDefinition` objects that contains objects that identify the workers that make
   * up the work team.
   */
  public open fun memberDefinitions(`value`: IResolvable) {
    unwrap(this).setMemberDefinitions(`value`.let(IResolvable::unwrap))
  }

  /**
   * A list of `MemberDefinition` objects that contains objects that identify the workers that make
   * up the work team.
   */
  public open fun memberDefinitions(__idx_ac66f0: List<Any>) {
    unwrap(this).setMemberDefinitions(__idx_ac66f0)
  }

  /**
   * A list of `MemberDefinition` objects that contains objects that identify the workers that make
   * up the work team.
   */
  public open fun memberDefinitions(vararg __idx_ac66f0: Any): Unit =
      memberDefinitions(__idx_ac66f0.toList())

  /**
   * Configures SNS notifications of available or expiring work items for work teams.
   */
  public open fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  /**
   * Configures SNS notifications of available or expiring work items for work teams.
   */
  public open fun notificationConfiguration(`value`: IResolvable) {
    unwrap(this).setNotificationConfiguration(`value`.let(IResolvable::unwrap))
  }

  /**
   * Configures SNS notifications of available or expiring work items for work teams.
   */
  public open fun notificationConfiguration(`value`: NotificationConfigurationProperty) {
    unwrap(this).setNotificationConfiguration(`value`.let(NotificationConfigurationProperty::unwrap))
  }

  /**
   * Configures SNS notifications of available or expiring work items for work teams.
   */
  @Suppress("INAPPLICABLE_JVM_NAME")
  @JvmName("b4f9648ce0d0ab886d93ea696074e8617fa160fcdf56814b46727711a401d3c1")
  public open
      fun notificationConfiguration(`value`: NotificationConfigurationProperty.Builder.() -> Unit):
      Unit = notificationConfiguration(NotificationConfigurationProperty(`value`))

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag::unwrap))
  }

  /**
   * An array of key-value pairs.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * The name of the workforce.
   */
  public open fun workforceName(): String? = unwrap(this).getWorkforceName()

  /**
   * The name of the workforce.
   */
  public open fun workforceName(`value`: String) {
    unwrap(this).setWorkforceName(`value`)
  }

  /**
   * The name of the work team.
   */
  public open fun workteamName(): String? = unwrap(this).getWorkteamName()

  /**
   * The name of the work team.
   */
  public open fun workteamName(`value`: String) {
    unwrap(this).setWorkteamName(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.sagemaker.CfnWorkteam].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * A description of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description)
     * @param description A description of the work team. 
     */
    public fun description(description: String)

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team. 
     */
    public fun memberDefinitions(memberDefinitions: IResolvable)

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team. 
     */
    public fun memberDefinitions(memberDefinitions: List<Any>)

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team. 
     */
    public fun memberDefinitions(vararg memberDefinitions: Any)

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams. 
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams. 
     */
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty)

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("083cb38abe11109526f7d9c60158b98954de160d78691ac73dde5f8f23605ee2")
    public
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
     * @param tags An array of key-value pairs. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * The name of the workforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workforcename)
     * @param workforceName The name of the workforce. 
     */
    public fun workforceName(workforceName: String)

    /**
     * The name of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname)
     * @param workteamName The name of the work team. 
     */
    public fun workteamName(workteamName: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnWorkteam.Builder =
        software.amazon.awscdk.services.sagemaker.CfnWorkteam.Builder.create(scope, id)

    /**
     * A description of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description)
     * @param description A description of the work team. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team. 
     */
    override fun memberDefinitions(memberDefinitions: IResolvable) {
      cdkBuilder.memberDefinitions(memberDefinitions.let(IResolvable::unwrap))
    }

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team. 
     */
    override fun memberDefinitions(memberDefinitions: List<Any>) {
      cdkBuilder.memberDefinitions(memberDefinitions)
    }

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team. 
     */
    override fun memberDefinitions(vararg memberDefinitions: Any): Unit =
        memberDefinitions(memberDefinitions.toList())

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams. 
     */
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams. 
     */
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(NotificationConfigurationProperty::unwrap))
    }

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("083cb38abe11109526f7d9c60158b98954de160d78691ac73dde5f8f23605ee2")
    override
        fun notificationConfiguration(notificationConfiguration: NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(NotificationConfigurationProperty(notificationConfiguration))

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
     * @param tags An array of key-value pairs. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * The name of the workforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workforcename)
     * @param workforceName The name of the workforce. 
     */
    override fun workforceName(workforceName: String) {
      cdkBuilder.workforceName(workforceName)
    }

    /**
     * The name of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname)
     * @param workteamName The name of the work team. 
     */
    override fun workteamName(workteamName: String) {
      cdkBuilder.workteamName(workteamName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnWorkteam = cdkBuilder.build()
  }

  public companion object {
    init {

    }

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnWorkteam {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnWorkteam(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam): CfnWorkteam
        = CfnWorkteam(cdkObject)

    internal fun unwrap(wrapped: CfnWorkteam): software.amazon.awscdk.services.sagemaker.CfnWorkteam
        = wrapped.cdkObject
  }

  public interface NotificationConfigurationProperty {
    /**
     * The ARN for the Amazon SNS topic to which notifications should be published.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html#cfn-sagemaker-workteam-notificationconfiguration-notificationtopicarn)
     */
    public fun notificationTopicArn(): String

    /**
     * A builder for [NotificationConfigurationProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param notificationTopicArn The ARN for the Amazon SNS topic to which notifications should
       * be published. 
       */
      public fun notificationTopicArn(notificationTopicArn: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty.builder()

      /**
       * @param notificationTopicArn The ARN for the Amazon SNS topic to which notifications should
       * be published. 
       */
      override fun notificationTopicArn(notificationTopicArn: String) {
        cdkBuilder.notificationTopicArn(notificationTopicArn)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty,
    ) : NotificationConfigurationProperty {
      /**
       * The ARN for the Amazon SNS topic to which notifications should be published.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-notificationconfiguration.html#cfn-sagemaker-workteam-notificationconfiguration-notificationtopicarn)
       */
      override fun notificationTopicArn(): String = unwrap(this).getNotificationTopicArn()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}):
          NotificationConfigurationProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty):
          NotificationConfigurationProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: NotificationConfigurationProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.NotificationConfigurationProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface CognitoMemberDefinitionProperty {
    /**
     * An identifier for an application client.
     *
     * You must create the app client ID using Amazon Cognito .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitoclientid)
     */
    public fun cognitoClientId(): String

    /**
     * An identifier for a user group.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitousergroup)
     */
    public fun cognitoUserGroup(): String

    /**
     * An identifier for a user pool.
     *
     * The user pool must be in the same region as the service that you are calling.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitouserpool)
     */
    public fun cognitoUserPool(): String

    /**
     * A builder for [CognitoMemberDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cognitoClientId An identifier for an application client. 
       * You must create the app client ID using Amazon Cognito .
       */
      public fun cognitoClientId(cognitoClientId: String)

      /**
       * @param cognitoUserGroup An identifier for a user group. 
       */
      public fun cognitoUserGroup(cognitoUserGroup: String)

      /**
       * @param cognitoUserPool An identifier for a user pool. 
       * The user pool must be in the same region as the service that you are calling.
       */
      public fun cognitoUserPool(cognitoUserPool: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty.builder()

      /**
       * @param cognitoClientId An identifier for an application client. 
       * You must create the app client ID using Amazon Cognito .
       */
      override fun cognitoClientId(cognitoClientId: String) {
        cdkBuilder.cognitoClientId(cognitoClientId)
      }

      /**
       * @param cognitoUserGroup An identifier for a user group. 
       */
      override fun cognitoUserGroup(cognitoUserGroup: String) {
        cdkBuilder.cognitoUserGroup(cognitoUserGroup)
      }

      /**
       * @param cognitoUserPool An identifier for a user pool. 
       * The user pool must be in the same region as the service that you are calling.
       */
      override fun cognitoUserPool(cognitoUserPool: String) {
        cdkBuilder.cognitoUserPool(cognitoUserPool)
      }

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty,
    ) : CognitoMemberDefinitionProperty {
      /**
       * An identifier for an application client.
       *
       * You must create the app client ID using Amazon Cognito .
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitoclientid)
       */
      override fun cognitoClientId(): String = unwrap(this).getCognitoClientId()

      /**
       * An identifier for a user group.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitousergroup)
       */
      override fun cognitoUserGroup(): String = unwrap(this).getCognitoUserGroup()

      /**
       * An identifier for a user pool.
       *
       * The user pool must be in the same region as the service that you are calling.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-cognitomemberdefinition.html#cfn-sagemaker-workteam-cognitomemberdefinition-cognitouserpool)
       */
      override fun cognitoUserPool(): String = unwrap(this).getCognitoUserPool()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): CognitoMemberDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty):
          CognitoMemberDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: CognitoMemberDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.CognitoMemberDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface OidcMemberDefinitionProperty {
    /**
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-oidcmemberdefinition.html#cfn-sagemaker-workteam-oidcmemberdefinition-oidcgroups)
     */
    public fun oidcGroups(): List<String>

    /**
     * A builder for [OidcMemberDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param oidcGroups the value to be set. 
       */
      public fun oidcGroups(oidcGroups: List<String>)

      /**
       * @param oidcGroups the value to be set. 
       */
      public fun oidcGroups(vararg oidcGroups: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty.Builder
          =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty.builder()

      /**
       * @param oidcGroups the value to be set. 
       */
      override fun oidcGroups(oidcGroups: List<String>) {
        cdkBuilder.oidcGroups(oidcGroups)
      }

      /**
       * @param oidcGroups the value to be set. 
       */
      override fun oidcGroups(vararg oidcGroups: String): Unit = oidcGroups(oidcGroups.toList())

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty,
    ) : OidcMemberDefinitionProperty {
      /**
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-oidcmemberdefinition.html#cfn-sagemaker-workteam-oidcmemberdefinition-oidcgroups)
       */
      override fun oidcGroups(): List<String> = unwrap(this).getOidcGroups()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): OidcMemberDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty):
          OidcMemberDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: OidcMemberDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.OidcMemberDefinitionProperty =
          (wrapped as Wrapper).cdkObject
    }
  }

  public interface MemberDefinitionProperty {
    /**
     * The Amazon Cognito user group that is part of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-memberdefinition.html#cfn-sagemaker-workteam-memberdefinition-cognitomemberdefinition)
     */
    public fun cognitoMemberDefinition(): Any? = unwrap(this).getCognitoMemberDefinition()

    /**
     * A list user groups that exist in your OIDC Identity Provider (IdP).
     *
     * One to ten groups can be used to create a single private work team. When you add a user group
     * to the list of `Groups` , you can add that user group to one or more private work teams. If you
     * add a user group to a private work team, all workers in that user group are added to the work
     * team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-memberdefinition.html#cfn-sagemaker-workteam-memberdefinition-oidcmemberdefinition)
     */
    public fun oidcMemberDefinition(): Any? = unwrap(this).getOidcMemberDefinition()

    /**
     * A builder for [MemberDefinitionProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
       */
      public fun cognitoMemberDefinition(cognitoMemberDefinition: IResolvable)

      /**
       * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
       */
      public fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty)

      /**
       * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d936a3be26a7dcfeba5b0b94a753e20bd47ca892ad5971d4635f88e6d8ac7cf")
      public
          fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty.Builder.() -> Unit)

      /**
       * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider
       * (IdP).
       * One to ten groups can be used to create a single private work team. When you add a user
       * group to the list of `Groups` , you can add that user group to one or more private work teams.
       * If you add a user group to a private work team, all workers in that user group are added to
       * the work team.
       */
      public fun oidcMemberDefinition(oidcMemberDefinition: IResolvable)

      /**
       * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider
       * (IdP).
       * One to ten groups can be used to create a single private work team. When you add a user
       * group to the list of `Groups` , you can add that user group to one or more private work teams.
       * If you add a user group to a private work team, all workers in that user group are added to
       * the work team.
       */
      public fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty)

      /**
       * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider
       * (IdP).
       * One to ten groups can be used to create a single private work team. When you add a user
       * group to the list of `Groups` , you can add that user group to one or more private work teams.
       * If you add a user group to a private work team, all workers in that user group are added to
       * the work team.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8713a5a802d8145a000b18d1466ed8dc1e9bae556ce03ee06a10d3f28b790da9")
      public
          fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty.Builder.() -> Unit)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty.Builder =
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty.builder()

      /**
       * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
       */
      override fun cognitoMemberDefinition(cognitoMemberDefinition: IResolvable) {
        cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
       */
      override
          fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty) {
        cdkBuilder.cognitoMemberDefinition(cognitoMemberDefinition.let(CognitoMemberDefinitionProperty::unwrap))
      }

      /**
       * @param cognitoMemberDefinition The Amazon Cognito user group that is part of the work team.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("7d936a3be26a7dcfeba5b0b94a753e20bd47ca892ad5971d4635f88e6d8ac7cf")
      override
          fun cognitoMemberDefinition(cognitoMemberDefinition: CognitoMemberDefinitionProperty.Builder.() -> Unit):
          Unit = cognitoMemberDefinition(CognitoMemberDefinitionProperty(cognitoMemberDefinition))

      /**
       * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider
       * (IdP).
       * One to ten groups can be used to create a single private work team. When you add a user
       * group to the list of `Groups` , you can add that user group to one or more private work teams.
       * If you add a user group to a private work team, all workers in that user group are added to
       * the work team.
       */
      override fun oidcMemberDefinition(oidcMemberDefinition: IResolvable) {
        cdkBuilder.oidcMemberDefinition(oidcMemberDefinition.let(IResolvable::unwrap))
      }

      /**
       * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider
       * (IdP).
       * One to ten groups can be used to create a single private work team. When you add a user
       * group to the list of `Groups` , you can add that user group to one or more private work teams.
       * If you add a user group to a private work team, all workers in that user group are added to
       * the work team.
       */
      override fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty) {
        cdkBuilder.oidcMemberDefinition(oidcMemberDefinition.let(OidcMemberDefinitionProperty::unwrap))
      }

      /**
       * @param oidcMemberDefinition A list user groups that exist in your OIDC Identity Provider
       * (IdP).
       * One to ten groups can be used to create a single private work team. When you add a user
       * group to the list of `Groups` , you can add that user group to one or more private work teams.
       * If you add a user group to a private work team, all workers in that user group are added to
       * the work team.
       */
      @Suppress("INAPPLICABLE_JVM_NAME")
      @JvmName("8713a5a802d8145a000b18d1466ed8dc1e9bae556ce03ee06a10d3f28b790da9")
      override
          fun oidcMemberDefinition(oidcMemberDefinition: OidcMemberDefinitionProperty.Builder.() -> Unit):
          Unit = oidcMemberDefinition(OidcMemberDefinitionProperty(oidcMemberDefinition))

      public fun build():
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty =
          cdkBuilder.build()
    }

    private class Wrapper internal constructor(
      internal val cdkObject:
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty,
    ) : MemberDefinitionProperty {
      /**
       * The Amazon Cognito user group that is part of the work team.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-memberdefinition.html#cfn-sagemaker-workteam-memberdefinition-cognitomemberdefinition)
       */
      override fun cognitoMemberDefinition(): Any? = unwrap(this).getCognitoMemberDefinition()

      /**
       * A list user groups that exist in your OIDC Identity Provider (IdP).
       *
       * One to ten groups can be used to create a single private work team. When you add a user
       * group to the list of `Groups` , you can add that user group to one or more private work teams.
       * If you add a user group to a private work team, all workers in that user group are added to
       * the work team.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-sagemaker-workteam-memberdefinition.html#cfn-sagemaker-workteam-memberdefinition-oidcmemberdefinition)
       */
      override fun oidcMemberDefinition(): Any? = unwrap(this).getOidcMemberDefinition()
    }

    public companion object {
      init {

      }

      public operator fun invoke(block: Builder.() -> Unit = {}): MemberDefinitionProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty):
          MemberDefinitionProperty = Wrapper(cdkObject)

      internal fun unwrap(wrapped: MemberDefinitionProperty):
          software.amazon.awscdk.services.sagemaker.CfnWorkteam.MemberDefinitionProperty = (wrapped
          as Wrapper).cdkObject
    }
  }
}
