@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.amazonmq

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.IInspectable
import io.cloudshiftdev.awscdk.ITaggable
import io.cloudshiftdev.awscdk.TagManager
import io.cloudshiftdev.awscdk.TreeInspector
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Number
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * Creates a new configuration for the specified configuration name.
 *
 * Amazon MQ uses the default configuration (the engine type and version).
 *
 *
 * Does not apply to RabbitMQ brokers.
 *
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.amazonmq.*;
 * CfnConfiguration cfnConfiguration = CfnConfiguration.Builder.create(this, "MyCfnConfiguration")
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
public open class CfnConfiguration internal constructor(
  internal override val cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfiguration,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  /**
   * The Amazon Resource Name (ARN) of the Amazon MQ configuration.
   *
   * `arn:aws:mq:us-east-2:123456789012:configuration:MyConfigurationDevelopment:c-1234a5b6-78cd-901e-2fgh-3i45j6k178l9`
   */
  public open fun attrArn(): String = unwrap(this).getAttrArn()

  /**
   * The ID of the Amazon MQ configuration.
   *
   * `c-1234a5b6-78cd-901e-2fgh-3i45j6k178l9`
   */
  public open fun attrId(): String = unwrap(this).getAttrId()

  /**
   * The revision number of the configuration.
   *
   * `1`
   */
  public open fun attrRevision(): Number = unwrap(this).getAttrRevision()

  /**
   * Optional.
   */
  public open fun authenticationStrategy(): String? = unwrap(this).getAuthenticationStrategy()

  /**
   * Optional.
   */
  public open fun authenticationStrategy(`value`: String) {
    unwrap(this).setAuthenticationStrategy(`value`)
  }

  /**
   * The base64-encoded XML configuration.
   */
  public open fun `data`(): String = unwrap(this).getData()

  /**
   * The base64-encoded XML configuration.
   */
  public open fun `data`(`value`: String) {
    unwrap(this).setData(`value`)
  }

  /**
   * The description of the configuration.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the configuration.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * The type of broker engine.
   */
  public open fun engineType(): String = unwrap(this).getEngineType()

  /**
   * The type of broker engine.
   */
  public open fun engineType(`value`: String) {
    unwrap(this).setEngineType(`value`)
  }

  /**
   * The version of the broker engine.
   */
  public open fun engineVersion(): String = unwrap(this).getEngineVersion()

  /**
   * The version of the broker engine.
   */
  public open fun engineVersion(`value`: String) {
    unwrap(this).setEngineVersion(`value`)
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
   * The name of the configuration.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The name of the configuration.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * Create tags when creating the configuration.
   */
  public open fun tagsRaw(): List<TagsEntryProperty> =
      unwrap(this).getTagsRaw()?.map(TagsEntryProperty::wrap) ?: emptyList()

  /**
   * Create tags when creating the configuration.
   */
  public open fun tagsRaw(`value`: List<TagsEntryProperty>) {
    unwrap(this).setTagsRaw(`value`.map(TagsEntryProperty::unwrap))
  }

  /**
   * Create tags when creating the configuration.
   */
  public open fun tagsRaw(vararg `value`: TagsEntryProperty): Unit = tagsRaw(`value`.toList())

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.amazonmq.CfnConfiguration].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * Optional.
     *
     * The authentication strategy associated with the configuration. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-authenticationstrategy)
     * @param authenticationStrategy Optional. 
     */
    public fun authenticationStrategy(authenticationStrategy: String)

    /**
     * The base64-encoded XML configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data)
     * @param data The base64-encoded XML configuration. 
     */
    public fun `data`(`data`: String)

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description)
     * @param description The description of the configuration. 
     */
    public fun description(description: String)

    /**
     * The type of broker engine.
     *
     * Note: Currently, Amazon MQ only supports ACTIVEMQ for creating and editing broker
     * configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype)
     * @param engineType The type of broker engine. 
     */
    public fun engineType(engineType: String)

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion)
     * @param engineVersion The version of the broker engine. 
     */
    public fun engineVersion(engineVersion: String)

    /**
     * The name of the configuration.
     *
     * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
     * (- . _ ~). This value must be 1-150 characters long.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name)
     * @param name The name of the configuration. 
     */
    public fun name(name: String)

    /**
     * Create tags when creating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
     * @param tags Create tags when creating the configuration. 
     */
    public fun tags(tags: List<TagsEntryProperty>)

    /**
     * Create tags when creating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
     * @param tags Create tags when creating the configuration. 
     */
    public fun tags(vararg tags: TagsEntryProperty)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.amazonmq.CfnConfiguration.Builder =
        software.amazon.awscdk.services.amazonmq.CfnConfiguration.Builder.create(scope, id)

    /**
     * Optional.
     *
     * The authentication strategy associated with the configuration. The default is `SIMPLE` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-authenticationstrategy)
     * @param authenticationStrategy Optional. 
     */
    override fun authenticationStrategy(authenticationStrategy: String) {
      cdkBuilder.authenticationStrategy(authenticationStrategy)
    }

    /**
     * The base64-encoded XML configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-data)
     * @param data The base64-encoded XML configuration. 
     */
    override fun `data`(`data`: String) {
      cdkBuilder.`data`(`data`)
    }

    /**
     * The description of the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-description)
     * @param description The description of the configuration. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * The type of broker engine.
     *
     * Note: Currently, Amazon MQ only supports ACTIVEMQ for creating and editing broker
     * configurations.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-enginetype)
     * @param engineType The type of broker engine. 
     */
    override fun engineType(engineType: String) {
      cdkBuilder.engineType(engineType)
    }

    /**
     * The version of the broker engine.
     *
     * For a list of supported engine versions, see
     * [](https://docs.aws.amazon.com/amazon-mq/latest/developer-guide/broker-engine.html)
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-engineversion)
     * @param engineVersion The version of the broker engine. 
     */
    override fun engineVersion(engineVersion: String) {
      cdkBuilder.engineVersion(engineVersion)
    }

    /**
     * The name of the configuration.
     *
     * This value can contain only alphanumeric characters, dashes, periods, underscores, and tildes
     * (- . _ ~). This value must be 1-150 characters long.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-name)
     * @param name The name of the configuration. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * Create tags when creating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
     * @param tags Create tags when creating the configuration. 
     */
    override fun tags(tags: List<TagsEntryProperty>) {
      cdkBuilder.tags(tags.map(TagsEntryProperty::unwrap))
    }

    /**
     * Create tags when creating the configuration.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-amazonmq-configuration.html#cfn-amazonmq-configuration-tags)
     * @param tags Create tags when creating the configuration. 
     */
    override fun tags(vararg tags: TagsEntryProperty): Unit = tags(tags.toList())

    public fun build(): software.amazon.awscdk.services.amazonmq.CfnConfiguration =
        cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.amazonmq.CfnConfiguration.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnConfiguration {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnConfiguration(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfiguration):
        CfnConfiguration = CfnConfiguration(cdkObject)

    internal fun unwrap(wrapped: CfnConfiguration):
        software.amazon.awscdk.services.amazonmq.CfnConfiguration = wrapped.cdkObject
  }

  /**
   * A key-value pair to associate with the configuration.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.amazonmq.*;
   * TagsEntryProperty tagsEntryProperty = TagsEntryProperty.builder()
   * .key("key")
   * .value("value")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configuration-tagsentry.html)
   */
  public interface TagsEntryProperty {
    /**
     * The key in a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configuration-tagsentry.html#cfn-amazonmq-configuration-tagsentry-key)
     */
    public fun key(): String

    /**
     * The value in a key-value pair.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configuration-tagsentry.html#cfn-amazonmq-configuration-tagsentry-value)
     */
    public fun `value`(): String

    /**
     * A builder for [TagsEntryProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param key The key in a key-value pair. 
       */
      public fun key(key: String)

      /**
       * @param value The value in a key-value pair. 
       */
      public fun `value`(`value`: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.Builder =
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty.builder()

      /**
       * @param key The key in a key-value pair. 
       */
      override fun key(key: String) {
        cdkBuilder.key(key)
      }

      /**
       * @param value The value in a key-value pair. 
       */
      override fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
      }

      public fun build():
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      override val cdkObject:
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty,
    ) : CdkObject(cdkObject), TagsEntryProperty {
      /**
       * The key in a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configuration-tagsentry.html#cfn-amazonmq-configuration-tagsentry-key)
       */
      override fun key(): String = unwrap(this).getKey()

      /**
       * The value in a key-value pair.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-amazonmq-configuration-tagsentry.html#cfn-amazonmq-configuration-tagsentry-value)
       */
      override fun `value`(): String = unwrap(this).getValue()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): TagsEntryProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty):
          TagsEntryProperty = CdkObjectWrappers.wrap(cdkObject) as TagsEntryProperty

      internal fun unwrap(wrapped: TagsEntryProperty):
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.amazonmq.CfnConfiguration.TagsEntryProperty
    }
  }
}
