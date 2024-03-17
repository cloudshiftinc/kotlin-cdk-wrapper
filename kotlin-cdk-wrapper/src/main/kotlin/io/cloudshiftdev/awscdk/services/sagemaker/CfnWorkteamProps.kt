@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.sagemaker

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Properties for defining a `CfnWorkteam`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.sagemaker.*;
 * CfnWorkteamProps cfnWorkteamProps = CfnWorkteamProps.builder()
 * .description("description")
 * .memberDefinitions(List.of(MemberDefinitionProperty.builder()
 * .cognitoMemberDefinition(CognitoMemberDefinitionProperty.builder()
 * .cognitoClientId("cognitoClientId")
 * .cognitoUserGroup("cognitoUserGroup")
 * .cognitoUserPool("cognitoUserPool")
 * .build())
 * .oidcMemberDefinition(OidcMemberDefinitionProperty.builder()
 * .oidcGroups(List.of("oidcGroups"))
 * .build())
 * .build()))
 * .notificationConfiguration(NotificationConfigurationProperty.builder()
 * .notificationTopicArn("notificationTopicArn")
 * .build())
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .workforceName("workforceName")
 * .workteamName("workteamName")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html)
 */
public interface CfnWorkteamProps {
  /**
   * A description of the work team.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A list of `MemberDefinition` objects that contains objects that identify the workers that make
   * up the work team.
   *
   * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
   * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
   * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
   */
  public fun memberDefinitions(): Any? = unwrap(this).getMemberDefinitions()

  /**
   * Configures SNS notifications of available or expiring work items for work teams.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
   */
  public fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

  /**
   * An array of key-value pairs.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * The name of the workforce.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workforcename)
   */
  public fun workforceName(): String? = unwrap(this).getWorkforceName()

  /**
   * The name of the work team.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname)
   */
  public fun workteamName(): String? = unwrap(this).getWorkteamName()

  /**
   * A builder for [CfnWorkteamProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description A description of the work team.
     */
    public fun description(description: String)

    /**
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team.
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     */
    public fun memberDefinitions(memberDefinitions: IResolvable)

    /**
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team.
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     */
    public fun memberDefinitions(memberDefinitions: List<Any>)

    /**
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team.
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     */
    public fun memberDefinitions(vararg memberDefinitions: Any)

    /**
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams.
     */
    public fun notificationConfiguration(notificationConfiguration: IResolvable)

    /**
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams.
     */
    public
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty)

    /**
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1cd934c3bbb5c01df7e69929c175810c0ac4c2cd6b97f60cb64913ab3b71070")
    public
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty.Builder.() -> Unit)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags An array of key-value pairs.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param workforceName The name of the workforce.
     */
    public fun workforceName(workforceName: String)

    /**
     * @param workteamName The name of the work team.
     */
    public fun workteamName(workteamName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.sagemaker.CfnWorkteamProps.Builder =
        software.amazon.awscdk.services.sagemaker.CfnWorkteamProps.builder()

    /**
     * @param description A description of the work team.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team.
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     */
    override fun memberDefinitions(memberDefinitions: IResolvable) {
      cdkBuilder.memberDefinitions(memberDefinitions.let(IResolvable::unwrap))
    }

    /**
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team.
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     */
    override fun memberDefinitions(memberDefinitions: List<Any>) {
      cdkBuilder.memberDefinitions(memberDefinitions)
    }

    /**
     * @param memberDefinitions A list of `MemberDefinition` objects that contains objects that
     * identify the workers that make up the work team.
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     */
    override fun memberDefinitions(vararg memberDefinitions: Any): Unit =
        memberDefinitions(memberDefinitions.toList())

    /**
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams.
     */
    override fun notificationConfiguration(notificationConfiguration: IResolvable) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(IResolvable::unwrap))
    }

    /**
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams.
     */
    override
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty) {
      cdkBuilder.notificationConfiguration(notificationConfiguration.let(CfnWorkteam.NotificationConfigurationProperty::unwrap))
    }

    /**
     * @param notificationConfiguration Configures SNS notifications of available or expiring work
     * items for work teams.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("b1cd934c3bbb5c01df7e69929c175810c0ac4c2cd6b97f60cb64913ab3b71070")
    override
        fun notificationConfiguration(notificationConfiguration: CfnWorkteam.NotificationConfigurationProperty.Builder.() -> Unit):
        Unit =
        notificationConfiguration(CfnWorkteam.NotificationConfigurationProperty(notificationConfiguration))

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags An array of key-value pairs.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param workforceName The name of the workforce.
     */
    override fun workforceName(workforceName: String) {
      cdkBuilder.workforceName(workforceName)
    }

    /**
     * @param workteamName The name of the work team.
     */
    override fun workteamName(workteamName: String) {
      cdkBuilder.workteamName(workteamName)
    }

    public fun build(): software.amazon.awscdk.services.sagemaker.CfnWorkteamProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteamProps,
  ) : CdkObject(cdkObject), CfnWorkteamProps {
    /**
     * A description of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * A list of `MemberDefinition` objects that contains objects that identify the workers that
     * make up the work team.
     *
     * Workforces can be created using Amazon Cognito or your own OIDC Identity Provider (IdP). For
     * private workforces created using Amazon Cognito use `CognitoMemberDefinition` . For workforces
     * created using your own OIDC identity provider (IdP) use `OidcMemberDefinition` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-memberdefinitions)
     */
    override fun memberDefinitions(): Any? = unwrap(this).getMemberDefinitions()

    /**
     * Configures SNS notifications of available or expiring work items for work teams.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-notificationconfiguration)
     */
    override fun notificationConfiguration(): Any? = unwrap(this).getNotificationConfiguration()

    /**
     * An array of key-value pairs.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * The name of the workforce.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workforcename)
     */
    override fun workforceName(): String? = unwrap(this).getWorkforceName()

    /**
     * The name of the work team.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-sagemaker-workteam.html#cfn-sagemaker-workteam-workteamname)
     */
    override fun workteamName(): String? = unwrap(this).getWorkteamName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnWorkteamProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.sagemaker.CfnWorkteamProps):
        CfnWorkteamProps = CdkObjectWrappers.wrap(cdkObject) as? CfnWorkteamProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnWorkteamProps):
        software.amazon.awscdk.services.sagemaker.CfnWorkteamProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.sagemaker.CfnWorkteamProps
  }
}
