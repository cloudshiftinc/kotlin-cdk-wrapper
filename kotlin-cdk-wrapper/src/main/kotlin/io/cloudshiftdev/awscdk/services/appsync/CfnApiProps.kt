@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

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
 * Properties for defining a `CfnApi`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * CfnApiProps cfnApiProps = CfnApiProps.builder()
 * .name("name")
 * // the properties below are optional
 * .eventConfig(EventConfigProperty.builder()
 * .authProviders(List.of(AuthProviderProperty.builder()
 * .authType("authType")
 * // the properties below are optional
 * .cognitoConfig(CognitoConfigProperty.builder()
 * .awsRegion("awsRegion")
 * .userPoolId("userPoolId")
 * // the properties below are optional
 * .appIdClientRegex("appIdClientRegex")
 * .build())
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfigProperty.builder()
 * .authorizerUri("authorizerUri")
 * // the properties below are optional
 * .authorizerResultTtlInSeconds(123)
 * .identityValidationExpression("identityValidationExpression")
 * .build())
 * .openIdConnectConfig(OpenIDConnectConfigProperty.builder()
 * .issuer("issuer")
 * // the properties below are optional
 * .authTtl(123)
 * .clientId("clientId")
 * .iatTtl(123)
 * .build())
 * .build()))
 * .connectionAuthModes(List.of(AuthModeProperty.builder()
 * .authType("authType")
 * .build()))
 * .defaultPublishAuthModes(List.of(AuthModeProperty.builder()
 * .authType("authType")
 * .build()))
 * .defaultSubscribeAuthModes(List.of(AuthModeProperty.builder()
 * .authType("authType")
 * .build()))
 * // the properties below are optional
 * .logConfig(EventLogConfigProperty.builder()
 * .cloudWatchLogsRoleArn("cloudWatchLogsRoleArn")
 * .logLevel("logLevel")
 * .build())
 * .build())
 * .ownerContact("ownerContact")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html)
 */
public interface CfnApiProps {
  /**
   * Describes the authorization configuration for connections, message publishing, message
   * subscriptions, and logging for an Event API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-eventconfig)
   */
  public fun eventConfig(): Any? = unwrap(this).getEventConfig()

  /**
   * The name of the `Api` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-name)
   */
  public fun name(): String

  /**
   * The owner contact information for an API resource.
   *
   * This field accepts any string input with a length of 0 - 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-ownercontact)
   */
  public fun ownerContact(): String? = unwrap(this).getOwnerContact()

  /**
   * A set of tags (key-value pairs) for this API.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * A builder for [CfnApiProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param eventConfig Describes the authorization configuration for connections, message
     * publishing, message subscriptions, and logging for an Event API.
     */
    public fun eventConfig(eventConfig: IResolvable)

    /**
     * @param eventConfig Describes the authorization configuration for connections, message
     * publishing, message subscriptions, and logging for an Event API.
     */
    public fun eventConfig(eventConfig: CfnApi.EventConfigProperty)

    /**
     * @param eventConfig Describes the authorization configuration for connections, message
     * publishing, message subscriptions, and logging for an Event API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eac6e24db4b318e7549f3a7e57753ffcff41f5cb8d7fa126c27c248dcfe76d6")
    public fun eventConfig(eventConfig: CfnApi.EventConfigProperty.Builder.() -> Unit)

    /**
     * @param name The name of the `Api` . 
     */
    public fun name(name: String)

    /**
     * @param ownerContact The owner contact information for an API resource.
     * This field accepts any string input with a length of 0 - 256 characters.
     */
    public fun ownerContact(ownerContact: String)

    /**
     * @param tags A set of tags (key-value pairs) for this API.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags A set of tags (key-value pairs) for this API.
     */
    public fun tags(vararg tags: CfnTag)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiProps.Builder =
        software.amazon.awscdk.services.appsync.CfnApiProps.builder()

    /**
     * @param eventConfig Describes the authorization configuration for connections, message
     * publishing, message subscriptions, and logging for an Event API.
     */
    override fun eventConfig(eventConfig: IResolvable) {
      cdkBuilder.eventConfig(eventConfig.let(IResolvable.Companion::unwrap))
    }

    /**
     * @param eventConfig Describes the authorization configuration for connections, message
     * publishing, message subscriptions, and logging for an Event API.
     */
    override fun eventConfig(eventConfig: CfnApi.EventConfigProperty) {
      cdkBuilder.eventConfig(eventConfig.let(CfnApi.EventConfigProperty.Companion::unwrap))
    }

    /**
     * @param eventConfig Describes the authorization configuration for connections, message
     * publishing, message subscriptions, and logging for an Event API.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("6eac6e24db4b318e7549f3a7e57753ffcff41f5cb8d7fa126c27c248dcfe76d6")
    override fun eventConfig(eventConfig: CfnApi.EventConfigProperty.Builder.() -> Unit): Unit =
        eventConfig(CfnApi.EventConfigProperty(eventConfig))

    /**
     * @param name The name of the `Api` . 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param ownerContact The owner contact information for an API resource.
     * This field accepts any string input with a length of 0 - 256 characters.
     */
    override fun ownerContact(ownerContact: String) {
      cdkBuilder.ownerContact(ownerContact)
    }

    /**
     * @param tags A set of tags (key-value pairs) for this API.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * @param tags A set of tags (key-value pairs) for this API.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiProps = cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.CfnApiProps,
  ) : CdkObject(cdkObject),
      CfnApiProps {
    /**
     * Describes the authorization configuration for connections, message publishing, message
     * subscriptions, and logging for an Event API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-eventconfig)
     */
    override fun eventConfig(): Any? = unwrap(this).getEventConfig()

    /**
     * The name of the `Api` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * The owner contact information for an API resource.
     *
     * This field accepts any string input with a length of 0 - 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-ownercontact)
     */
    override fun ownerContact(): String? = unwrap(this).getOwnerContact()

    /**
     * A set of tags (key-value pairs) for this API.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-appsync-api.html#cfn-appsync-api-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiProps): CfnApiProps =
        CdkObjectWrappers.wrap(cdkObject) as? CfnApiProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiProps): software.amazon.awscdk.services.appsync.CfnApiProps =
        (wrapped as CdkObject).cdkObject as software.amazon.awscdk.services.appsync.CfnApiProps
  }
}
