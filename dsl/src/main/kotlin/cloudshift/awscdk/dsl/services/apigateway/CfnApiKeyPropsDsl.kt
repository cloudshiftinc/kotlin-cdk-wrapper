@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package cloudshift.awscdk.dsl.services.apigateway

import cloudshift.awscdk.common.CdkDslMarker
import cloudshift.awscdk.dsl.CfnTagDsl
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.apigateway.CfnApiKeyProps

/**
 * Properties for defining a `CfnApiKey`.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
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
@CdkDslMarker
public class CfnApiKeyPropsDsl {
  private val cdkBuilder: CfnApiKeyProps.Builder = CfnApiKeyProps.builder()

  private val _stageKeys: MutableList<Any> = mutableListOf()

  private val _tags: MutableList<CfnTag> = mutableListOf()

  /**
   * @param customerId An AWS Marketplace customer identifier, when integrating with the AWS SaaS
   * Marketplace.
   */
  public fun customerId(customerId: String) {
    cdkBuilder.customerId(customerId)
  }

  /**
   * @param description The description of the ApiKey.
   */
  public fun description(description: String) {
    cdkBuilder.description(description)
  }

  /**
   * @param enabled Specifies whether the ApiKey can be used by callers.
   */
  public fun enabled(enabled: Boolean) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param enabled Specifies whether the ApiKey can be used by callers.
   */
  public fun enabled(enabled: IResolvable) {
    cdkBuilder.enabled(enabled)
  }

  /**
   * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier is
   * distinct from the created API key value.
   * This parameter is deprecated and should not be used.
   */
  public fun generateDistinctId(generateDistinctId: Boolean) {
    cdkBuilder.generateDistinctId(generateDistinctId)
  }

  /**
   * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier is
   * distinct from the created API key value.
   * This parameter is deprecated and should not be used.
   */
  public fun generateDistinctId(generateDistinctId: IResolvable) {
    cdkBuilder.generateDistinctId(generateDistinctId)
  }

  /**
   * @param name A name for the API key.
   * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that ID
   * for the API key name. For more information, see [Name
   * Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html) .
   *
   *
   * If you specify a name, you cannot perform updates that require replacement of this resource.
   * You can perform updates that require no or some interruption. If you must replace the resource,
   * specify a new name.
   */
  public fun name(name: String) {
    cdkBuilder.name(name)
  }

  /**
   * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   */
  public fun stageKeys(vararg stageKeys: Any) {
    _stageKeys.addAll(listOf(*stageKeys))
  }

  /**
   * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   */
  public fun stageKeys(stageKeys: Collection<Any>) {
    _stageKeys.addAll(stageKeys)
  }

  /**
   * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
   */
  public fun stageKeys(stageKeys: IResolvable) {
    cdkBuilder.stageKeys(stageKeys)
  }

  /**
   * @param tags The key-value map of strings.
   * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
   * not start with `aws:` . The tag value can be up to 256 characters.
   */
  public fun tags(tags: CfnTagDsl.() -> Unit) {
    _tags.add(CfnTagDsl().apply(tags).build())
  }

  /**
   * @param tags The key-value map of strings.
   * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
   * not start with `aws:` . The tag value can be up to 256 characters.
   */
  public fun tags(tags: Collection<CfnTag>) {
    _tags.addAll(tags)
  }

  /**
   * @param value Specifies a value of the API key.
   */
  public fun `value`(`value`: String) {
    cdkBuilder.`value`(`value`)
  }

  public fun build(): CfnApiKeyProps {
    if(_stageKeys.isNotEmpty()) cdkBuilder.stageKeys(_stageKeys)
    if(_tags.isNotEmpty()) cdkBuilder.tags(_tags)
    return cdkBuilder.build()
  }
}
