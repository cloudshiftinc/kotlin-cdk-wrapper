@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnResource
import io.cloudshiftdev.awscdk.CfnTag
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
import kotlin.String
import kotlin.Unit
import kotlin.collections.List
import io.cloudshiftdev.constructs.Construct as CloudshiftdevConstructsConstruct
import software.constructs.Construct as SoftwareConstructsConstruct

/**
 * The `AWS::ApiGateway::ApiKey` resource creates a unique key that you can distribute to clients
 * who are executing API Gateway `Method` resources that require an API key.
 *
 * To specify which API key clients must use, map the API key with the `RestApi` and `Stage`
 * resources that include the methods that require a key.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnApiKey cfnApiKey = CfnApiKey.Builder.create(this, "MyCfnApiKey")
 * .customerId("customerId")
 * .description("description")
 * .enabled(false)
 * .generateDistinctId(false)
 * .name("name")
 * .stageKeys(List.of(StageKeyProperty.builder()
 * .restApiId("restApiId")
 * .stageName("stageName")
 * .build()))
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .value("value")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html)
 */
public open class CfnApiKey(
  cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey,
) : CfnResource(cdkObject), IInspectable, ITaggable {
  public constructor(scope: CloudshiftdevConstructsConstruct, id: String) :
      this(software.amazon.awscdk.services.apigateway.CfnApiKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id)
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiKeyProps,
  ) :
      this(software.amazon.awscdk.services.apigateway.CfnApiKey(scope.let(CloudshiftdevConstructsConstruct.Companion::unwrap),
      id, props.let(CfnApiKeyProps.Companion::unwrap))
  )

  public constructor(
    scope: CloudshiftdevConstructsConstruct,
    id: String,
    props: CfnApiKeyProps.Builder.() -> Unit,
  ) : this(scope, id, CfnApiKeyProps(props)
  )

  /**
   * The ID for the API key.
   *
   * For example: `abc123` .
   */
  public open fun attrApiKeyId(): String = unwrap(this).getAttrApiKeyId()

  /**
   * An AWS Marketplace customer identifier, when integrating with the AWS SaaS Marketplace.
   */
  public open fun customerId(): String? = unwrap(this).getCustomerId()

  /**
   * An AWS Marketplace customer identifier, when integrating with the AWS SaaS Marketplace.
   */
  public open fun customerId(`value`: String) {
    unwrap(this).setCustomerId(`value`)
  }

  /**
   * The description of the ApiKey.
   */
  public open fun description(): String? = unwrap(this).getDescription()

  /**
   * The description of the ApiKey.
   */
  public open fun description(`value`: String) {
    unwrap(this).setDescription(`value`)
  }

  /**
   * Specifies whether the ApiKey can be used by callers.
   */
  public open fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether the ApiKey can be used by callers.
   */
  public open fun enabled(`value`: Boolean) {
    unwrap(this).setEnabled(`value`)
  }

  /**
   * Specifies whether the ApiKey can be used by callers.
   */
  public open fun enabled(`value`: IResolvable) {
    unwrap(this).setEnabled(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the created
   * API key value.
   */
  public open fun generateDistinctId(): Any? = unwrap(this).getGenerateDistinctId()

  /**
   * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the created
   * API key value.
   */
  public open fun generateDistinctId(`value`: Boolean) {
    unwrap(this).setGenerateDistinctId(`value`)
  }

  /**
   * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the created
   * API key value.
   */
  public open fun generateDistinctId(`value`: IResolvable) {
    unwrap(this).setGenerateDistinctId(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * Examines the CloudFormation resource and discloses attributes.
   *
   * @param inspector tree inspector to collect and process attributes. 
   */
  public override fun inspect(inspector: TreeInspector) {
    unwrap(this).inspect(inspector.let(TreeInspector.Companion::unwrap))
  }

  /**
   * A name for the API key.
   */
  public open fun name(): String? = unwrap(this).getName()

  /**
   * A name for the API key.
   */
  public open fun name(`value`: String) {
    unwrap(this).setName(`value`)
  }

  /**
   * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   */
  public open fun stageKeys(): Any? = unwrap(this).getStageKeys()

  /**
   * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   */
  public open fun stageKeys(`value`: IResolvable) {
    unwrap(this).setStageKeys(`value`.let(IResolvable.Companion::unwrap))
  }

  /**
   * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   */
  public open fun stageKeys(`value`: List<Any>) {
    unwrap(this).setStageKeys(`value`.map{CdkObjectWrappers.unwrap(it)})
  }

  /**
   * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   */
  public open fun stageKeys(vararg `value`: Any): Unit = stageKeys(`value`.toList())

  /**
   * Tag Manager which manages the tags for this resource.
   */
  public override fun tags(): TagManager = unwrap(this).getTags().let(TagManager::wrap)

  /**
   * The key-value map of strings.
   */
  public open fun tagsRaw(): List<CfnTag> = unwrap(this).getTagsRaw()?.map(CfnTag::wrap) ?:
      emptyList()

  /**
   * The key-value map of strings.
   */
  public open fun tagsRaw(`value`: List<CfnTag>) {
    unwrap(this).setTagsRaw(`value`.map(CfnTag.Companion::unwrap))
  }

  /**
   * The key-value map of strings.
   */
  public open fun tagsRaw(vararg `value`: CfnTag): Unit = tagsRaw(`value`.toList())

  /**
   * Specifies a value of the API key.
   */
  public open fun `value`(): String? = unwrap(this).getValue()

  /**
   * Specifies a value of the API key.
   */
  public open fun `value`(`value`: String) {
    unwrap(this).setValue(`value`)
  }

  /**
   * A fluent builder for [io.cloudshiftdev.awscdk.services.apigateway.CfnApiKey].
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * An AWS Marketplace customer identifier, when integrating with the AWS SaaS Marketplace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid)
     * @param customerId An AWS Marketplace customer identifier, when integrating with the AWS SaaS
     * Marketplace. 
     */
    public fun customerId(customerId: String)

    /**
     * The description of the ApiKey.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description)
     * @param description The description of the ApiKey. 
     */
    public fun description(description: String)

    /**
     * Specifies whether the ApiKey can be used by callers.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
     * @param enabled Specifies whether the ApiKey can be used by callers. 
     */
    public fun enabled(enabled: Boolean)

    /**
     * Specifies whether the ApiKey can be used by callers.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
     * @param enabled Specifies whether the ApiKey can be used by callers. 
     */
    public fun enabled(enabled: IResolvable)

    /**
     * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the
     * created API key value.
     *
     * This parameter is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value. 
     */
    public fun generateDistinctId(generateDistinctId: Boolean)

    /**
     * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the
     * created API key value.
     *
     * This parameter is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value. 
     */
    public fun generateDistinctId(generateDistinctId: IResolvable)

    /**
     * A name for the API key.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name)
     * @param name A name for the API key. 
     */
    public fun name(name: String)

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key. 
     */
    public fun stageKeys(stageKeys: IResolvable)

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key. 
     */
    public fun stageKeys(stageKeys: List<Any>)

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key. 
     */
    public fun stageKeys(vararg stageKeys: Any)

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
     * @param tags The key-value map of strings. 
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
     * @param tags The key-value map of strings. 
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * Specifies a value of the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-value)
     * @param value Specifies a value of the API key. 
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl(
    scope: SoftwareConstructsConstruct,
    id: String,
  ) : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnApiKey.Builder =
        software.amazon.awscdk.services.apigateway.CfnApiKey.Builder.create(scope, id)

    /**
     * An AWS Marketplace customer identifier, when integrating with the AWS SaaS Marketplace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid)
     * @param customerId An AWS Marketplace customer identifier, when integrating with the AWS SaaS
     * Marketplace. 
     */
    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    /**
     * The description of the ApiKey.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description)
     * @param description The description of the ApiKey. 
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * Specifies whether the ApiKey can be used by callers.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
     * @param enabled Specifies whether the ApiKey can be used by callers. 
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether the ApiKey can be used by callers.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
     * @param enabled Specifies whether the ApiKey can be used by callers. 
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable.Companion::unwrap))
    }

    /**
     * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the
     * created API key value.
     *
     * This parameter is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value. 
     */
    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    /**
     * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the
     * created API key value.
     *
     * This parameter is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value. 
     */
    override fun generateDistinctId(generateDistinctId: IResolvable) {
      cdkBuilder.generateDistinctId(generateDistinctId.let(IResolvable.Companion::unwrap))
    }

    /**
     * A name for the API key.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     *
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name)
     * @param name A name for the API key. 
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key. 
     */
    override fun stageKeys(stageKeys: IResolvable) {
      cdkBuilder.stageKeys(stageKeys.let(IResolvable.Companion::unwrap))
    }

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key. 
     */
    override fun stageKeys(stageKeys: List<Any>) {
      cdkBuilder.stageKeys(stageKeys.map{CdkObjectWrappers.unwrap(it)})
    }

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key. 
     */
    override fun stageKeys(vararg stageKeys: Any): Unit = stageKeys(stageKeys.toList())

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
     * @param tags The key-value map of strings. 
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag.Companion::unwrap))
    }

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
     * @param tags The key-value map of strings. 
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * Specifies a value of the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-value)
     * @param value Specifies a value of the API key. 
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnApiKey = cdkBuilder.build()
  }

  public companion object {
    public val CFN_RESOURCE_TYPE_NAME: String =
        software.amazon.awscdk.services.apigateway.CfnApiKey.CFN_RESOURCE_TYPE_NAME

    public operator fun invoke(
      scope: CloudshiftdevConstructsConstruct,
      id: String,
      block: Builder.() -> Unit = {},
    ): CfnApiKey {
      val builderImpl = BuilderImpl(CloudshiftdevConstructsConstruct.unwrap(scope), id)
      return CfnApiKey(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey): CfnApiKey =
        CfnApiKey(cdkObject)

    internal fun unwrap(wrapped: CfnApiKey): software.amazon.awscdk.services.apigateway.CfnApiKey =
        wrapped.cdkObject as software.amazon.awscdk.services.apigateway.CfnApiKey
  }

  /**
   * `StageKey` is a property of the
   * [AWS::ApiGateway::ApiKey](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html)
   * resource that specifies the stage to associate with the API key. This association allows only
   * clients with the key to make requests to methods in that stage.
   *
   * Example:
   *
   * ```
   * // The code below shows an example of how to instantiate this type.
   * // The values are placeholders you should change.
   * import io.cloudshiftdev.awscdk.services.apigateway.*;
   * StageKeyProperty stageKeyProperty = StageKeyProperty.builder()
   * .restApiId("restApiId")
   * .stageName("stageName")
   * .build();
   * ```
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html)
   */
  public interface StageKeyProperty {
    /**
     * The string identifier of the associated RestApi.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid)
     */
    public fun restApiId(): String? = unwrap(this).getRestApiId()

    /**
     * The stage name associated with the stage key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename)
     */
    public fun stageName(): String? = unwrap(this).getStageName()

    /**
     * A builder for [StageKeyProperty]
     */
    @CdkDslMarker
    public interface Builder {
      /**
       * @param restApiId The string identifier of the associated RestApi.
       */
      public fun restApiId(restApiId: String)

      /**
       * @param stageName The stage name associated with the stage key.
       */
      public fun stageName(stageName: String)
    }

    private class BuilderImpl : Builder {
      private val cdkBuilder:
          software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty.Builder =
          software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty.builder()

      /**
       * @param restApiId The string identifier of the associated RestApi.
       */
      override fun restApiId(restApiId: String) {
        cdkBuilder.restApiId(restApiId)
      }

      /**
       * @param stageName The stage name associated with the stage key.
       */
      override fun stageName(stageName: String) {
        cdkBuilder.stageName(stageName)
      }

      public fun build(): software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty =
          cdkBuilder.build()
    }

    private class Wrapper(
      cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty,
    ) : CdkObject(cdkObject), StageKeyProperty {
      /**
       * The string identifier of the associated RestApi.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-restapiid)
       */
      override fun restApiId(): String? = unwrap(this).getRestApiId()

      /**
       * The stage name associated with the stage key.
       *
       * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-apigateway-apikey-stagekey.html#cfn-apigateway-apikey-stagekey-stagename)
       */
      override fun stageName(): String? = unwrap(this).getStageName()
    }

    public companion object {
      public operator fun invoke(block: Builder.() -> Unit = {}): StageKeyProperty {
        val builderImpl = BuilderImpl()
        return Wrapper(builderImpl.apply(block).build())
      }

      internal
          fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty):
          StageKeyProperty = CdkObjectWrappers.wrap(cdkObject) as? StageKeyProperty ?:
          Wrapper(cdkObject)

      internal fun unwrap(wrapped: StageKeyProperty):
          software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty = (wrapped as
          CdkObject).cdkObject as
          software.amazon.awscdk.services.apigateway.CfnApiKey.StageKeyProperty
    }
  }
}
