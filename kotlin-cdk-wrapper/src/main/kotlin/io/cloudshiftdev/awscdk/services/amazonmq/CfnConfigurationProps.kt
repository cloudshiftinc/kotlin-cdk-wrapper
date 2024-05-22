@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnConfiguration`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amazonmq.*;
 * CfnConfigurationProps cfnConfigurationProps = CfnConfigurationProps.builder()
 * .data("data")
 * .engineType("engineType")
 * .engineVersion("engineVersion")
 * .name("name")
 * // the properties below are optional
 * .authenticationStrategy("authenticationStrategy")
 * .description("description")
 * .tags(List.of(TagsEntryProperty.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html)
 */
public interface CfnConfigurationProps {
  /**
   * Optional.
   *
   * The authentication strategy associated with the configuration. The default is `SIMPLE` .
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-authenticationstrategy)
   */
  public fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  /**
   * The base64-encoded XML configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data)
   */
  public fun `data`(): String

  /**
   * The description of the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The type of broker engine.
   *
   * Note: Currently, Amazon MQ only supports ACTIVEMQ for creating and editing broker
   * configurations.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype)
   */
  public fun engineType(): String

  /**
   * The version of the broker engine.
   *
   * For a list of supported engine versions, see
   * [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion)
   */
  public fun engineVersion(): String

  /**
   * The name of the configuration.
   *
   * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
   * (- . _ ~). This value must be 1-150 characters long.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name)
   */
  public fun name(): String

  /**
   * Create tags when creating the configuration.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
   */
  public fun tags(): List<CfnConfiguration.TagsEntryProperty> =
      unwrap(this).getTags()?.map(CfnConfiguration.TagsEntryProperty::wrap) ?: emptyList()

  /**
   * A builder for [CfnConfigurationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param authenticationStrategy Optional.
     * The authentication strategy associated with the configuration. The default is `SIMPLE` .
     */
    public fun authenticationStrategy(authenticationStrategy: String)

    /**
     * @param data The base64-encoded XML configuration. 
     */
    public fun `data`(`data`: String)

    /**
     * @param description The description of the configuration.
     */
    public fun description(description: String)

    /**
     * @param engineType The type of broker engine. 
     * Note: Currently, Amazon MQ only supports ACTIVEMQ for creating and editing broker
     * configurations.
     */
    public fun engineType(engineType: String)

    /**
     * @param engineVersion The version of the broker engine. 
     * For a list of supported engine versions, see
     * [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
     */
    public fun engineVersion(engineVersion: String)

    /**
     * @param name The name of the configuration. 
     * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
     * (- . _ ~). This value must be 1-150 characters long.
     */
    public fun name(name: String)

    /**
     * @param tags Create tags when creating the configuration.
     */
    public fun tags(tags: List<CfnConfiguration.TagsEntryProperty>)

    /**
     * @param tags Create tags when creating the configuration.
     */
    public fun tags(vararg tags: CfnConfiguration.TagsEntryProperty)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfigurationProps.builder()

    /**
     * @param authenticationStrategy Optional.
     * The authentication strategy associated with the configuration. The default is `SIMPLE` .
     */
    override fun authenticationStrategy(authenticationStrategy: String) {
      cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    /**
     * @param data The base64-encoded XML configuration. 
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * @param description The description of the configuration.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param engineType The type of broker engine. 
     * Note: Currently, Amazon MQ only supports ACTIVEMQ for creating and editing broker
     * configurations.
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * @param engineVersion The version of the broker engine. 
     * For a list of supported engine versions, see
     * [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * @param name The name of the configuration. 
     * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
     * (- . _ ~). This value must be 1-150 characters long.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param tags Create tags when creating the configuration.
     */
    override fun tags(tags: List<CfnConfiguration.TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(CfnConfiguration.TagsEntryProperty.Companion::unwrap))
    }

    /**
     * @param tags Create tags when creating the configuration.
     */
    override fun tags(vararg tags: CfnConfiguration.TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfigurationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps,
  ) : CdkObject(cdkObject), CfnConfigurationProps {
    /**
     * Optional.
     *
     * The authentication strategy associated with the configuration. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-authenticationstrategy)
     */
    override fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

    /**
     * The base64-encoded XML configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data)
     */
    override fun `data`(): String = unwrap(this).getData()

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The type of broker engine.
     *
     * Note: Currently, Amazon MQ only supports ACTIVEMQ for creating and editing broker
     * configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype)
     */
    override fun engineType(): String = unwrap(this).getEngineType()

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion)
     */
    override fun engineVersion(): String = unwrap(this).getEngineVersion()

    /**
     * The name of the configuration.
     *
     * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
     * (- . _ ~). This value must be 1-150 characters long.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name)
     */
    override fun name(): String = unwrap(this).getName()

    /**
     * Create tags when creating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
     */
    override fun tags(): List<CfnConfiguration.TagsEntryProperty> =
        unwrap(this).getTags()?.map(CfnConfiguration.TagsEntryProperty::wrap) ?: emptyList()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnConfigurationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfigurationProps):
        CfnConfigurationProps = CdkObjectWrappers.wrap(cdkObject) as? CfnConfigurationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnConfigurationProps):
        software.amazon.awscdk.services.amazonmq.CfnConfigurationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.amazonmq.CfnConfigurationProps
  }
}
