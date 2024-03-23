@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CfnTag
import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.List

/**
 * Properties for defining a `CfnApiKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.apigateway.*;
 * CfnApiKeyProps cfnApiKeyProps = CfnApiKeyProps.builder()
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
public interface CfnApiKeyProps {
  /**
   * An AWS Marketplace customer identifier, when integrating with the AWS SaaS Marketplace.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid)
   */
  public fun customerId(): String? = unwrap(this).getCustomerId()

  /**
   * The description of the ApiKey.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description)
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * Specifies whether the ApiKey can be used by callers.
   *
   * Default: - false
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
   */
  public fun enabled(): Any? = unwrap(this).getEnabled()

  /**
   * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the created
   * API key value.
   *
   * This parameter is deprecated and should not be used.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
   */
  public fun generateDistinctId(): Any? = unwrap(this).getGenerateDistinctId()

  /**
   * A name for the API key.
   *
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the API key name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   *
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name)
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
   */
  public fun stageKeys(): Any? = unwrap(this).getStageKeys()

  /**
   * The key-value map of strings.
   *
   * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
   * not start with `aws:` . The tag value can be up to 256 characters.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
   */
  public fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

  /**
   * Specifies a value of the API key.
   *
   * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-value)
   */
  public fun `value`(): String? = unwrap(this).getValue()

  /**
   * A builder for [CfnApiKeyProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param customerId An AWS Marketplace customer identifier, when integrating with the AWS SaaS
     * Marketplace.
     */
    public fun customerId(customerId: String)

    /**
     * @param description The description of the ApiKey.
     */
    public fun description(description: String)

    /**
     * @param enabled Specifies whether the ApiKey can be used by callers.
     */
    public fun enabled(enabled: Boolean)

    /**
     * @param enabled Specifies whether the ApiKey can be used by callers.
     */
    public fun enabled(enabled: IResolvable)

    /**
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value.
     * This parameter is deprecated and should not be used.
     */
    public fun generateDistinctId(generateDistinctId: Boolean)

    /**
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value.
     * This parameter is deprecated and should not be used.
     */
    public fun generateDistinctId(generateDistinctId: IResolvable)

    /**
     * @param name A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    public fun name(name: String)

    /**
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    public fun stageKeys(stageKeys: IResolvable)

    /**
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    public fun stageKeys(stageKeys: List<Any>)

    /**
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    public fun stageKeys(vararg stageKeys: Any)

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    public fun tags(tags: List<CfnTag>)

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    public fun tags(vararg tags: CfnTag)

    /**
     * @param value Specifies a value of the API key.
     */
    public fun `value`(`value`: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnApiKeyProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnApiKeyProps.builder()

    /**
     * @param customerId An AWS Marketplace customer identifier, when integrating with the AWS SaaS
     * Marketplace.
     */
    override fun customerId(customerId: String) {
      cdkBuilder.customerId(customerId)
    }

    /**
     * @param description The description of the ApiKey.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param enabled Specifies whether the ApiKey can be used by callers.
     */
    override fun enabled(enabled: Boolean) {
      cdkBuilder.enabled(enabled)
    }

    /**
     * @param enabled Specifies whether the ApiKey can be used by callers.
     */
    override fun enabled(enabled: IResolvable) {
      cdkBuilder.enabled(enabled.let(IResolvable::unwrap))
    }

    /**
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value.
     * This parameter is deprecated and should not be used.
     */
    override fun generateDistinctId(generateDistinctId: Boolean) {
      cdkBuilder.generateDistinctId(generateDistinctId)
    }

    /**
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     * is distinct from the created API key value.
     * This parameter is deprecated and should not be used.
     */
    override fun generateDistinctId(generateDistinctId: IResolvable) {
      cdkBuilder.generateDistinctId(generateDistinctId.let(IResolvable::unwrap))
    }

    /**
     * @param name A name for the API key.
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name. For more information, see [Name
     * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
     *
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the resource,
     * specify a new name.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    /**
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    override fun stageKeys(stageKeys: IResolvable) {
      cdkBuilder.stageKeys(stageKeys.let(IResolvable::unwrap))
    }

    /**
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    override fun stageKeys(stageKeys: List<Any>) {
      cdkBuilder.stageKeys(stageKeys)
    }

    /**
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    override fun stageKeys(vararg stageKeys: Any): Unit = stageKeys(stageKeys.toList())

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    override fun tags(tags: List<CfnTag>) {
      cdkBuilder.tags(tags.map(CfnTag::unwrap))
    }

    /**
     * @param tags The key-value map of strings.
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     */
    override fun tags(vararg tags: CfnTag): Unit = tags(tags.toList())

    /**
     * @param value Specifies a value of the API key.
     */
    override fun `value`(`value`: String) {
      cdkBuilder.`value`(`value`)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnApiKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKeyProps,
  ) : CdkObject(cdkObject), CfnApiKeyProps {
    /**
     * An AWS Marketplace customer identifier, when integrating with the AWS SaaS Marketplace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid)
     */
    override fun customerId(): String? = unwrap(this).getCustomerId()

    /**
     * The description of the ApiKey.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description)
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * Specifies whether the ApiKey can be used by callers.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
     */
    override fun enabled(): Any? = unwrap(this).getEnabled()

    /**
     * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the
     * created API key value.
     *
     * This parameter is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
     */
    override fun generateDistinctId(): Any? = unwrap(this).getGenerateDistinctId()

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
     */
    override fun name(): String? = unwrap(this).getName()

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     */
    override fun stageKeys(): Any? = unwrap(this).getStageKeys()

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
     */
    override fun tags(): List<CfnTag> = unwrap(this).getTags()?.map(CfnTag::wrap) ?: emptyList()

    /**
     * Specifies a value of the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-value)
     */
    override fun `value`(): String? = unwrap(this).getValue()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnApiKeyProps):
        CfnApiKeyProps = CdkObjectWrappers.wrap(cdkObject) as? CfnApiKeyProps ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiKeyProps):
        software.amazon.awscdk.services.apigateway.CfnApiKeyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.apigateway.CfnApiKeyProps
  }
}
