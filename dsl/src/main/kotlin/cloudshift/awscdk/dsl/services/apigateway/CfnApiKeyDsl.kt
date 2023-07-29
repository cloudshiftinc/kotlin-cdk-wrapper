@file:Suppress(
    "RedundantVisibilityModifier",
    "RedundantUnitReturnType",
    "RemoveRedundantQualifierName",
    "unused",
    "UnusedImport",
    "ClassName",
    "REDUNDANT_PROJECTION",
    "DEPRECATION"
)

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
import software.amazon.awscdk.services.apigateway.CfnApiKey
import software.constructs.Construct

/**
 * The `AWS::ApiGateway::ApiKey` resource creates a unique key that you can distribute to clients
 * who are executing API Gateway `Method` resources that require an API key.
 *
 * To specify which API key clients must use, map the API key with the `RestApi` and `Stage`
 * resources that include the methods that require a key.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.apigateway.*;
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
@CdkDslMarker
public class CfnApiKeyDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnApiKey.Builder = CfnApiKey.Builder.create(scope, id)

    private val _stageKeys: MutableList<Any> = mutableListOf()

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * An AWS Marketplace customer identifier, when integrating with the AWS SaaS Marketplace.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-customerid)
     *
     * @param customerId An AWS Marketplace customer identifier, when integrating with the AWS SaaS
     *   Marketplace.
     */
    public fun customerId(customerId: String) {
        cdkBuilder.customerId(customerId)
    }

    /**
     * The description of the ApiKey.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-description)
     *
     * @param description The description of the ApiKey.
     */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /**
     * Specifies whether the ApiKey can be used by callers.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
     *
     * @param enabled Specifies whether the ApiKey can be used by callers.
     */
    public fun enabled(enabled: Boolean) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether the ApiKey can be used by callers.
     *
     * Default: - false
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-enabled)
     *
     * @param enabled Specifies whether the ApiKey can be used by callers.
     */
    public fun enabled(enabled: IResolvable) {
        cdkBuilder.enabled(enabled)
    }

    /**
     * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the
     * created API key value.
     *
     * This parameter is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
     *
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     *   is distinct from the created API key value.
     */
    public fun generateDistinctId(generateDistinctId: Boolean) {
        cdkBuilder.generateDistinctId(generateDistinctId)
    }

    /**
     * Specifies whether ( `true` ) or not ( `false` ) the key identifier is distinct from the
     * created API key value.
     *
     * This parameter is deprecated and should not be used.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-generatedistinctid)
     *
     * @param generateDistinctId Specifies whether ( `true` ) or not ( `false` ) the key identifier
     *   is distinct from the created API key value.
     */
    public fun generateDistinctId(generateDistinctId: IResolvable) {
        cdkBuilder.generateDistinctId(generateDistinctId)
    }

    /**
     * A name for the API key.
     *
     * If you don't specify a name, AWS CloudFormation generates a unique physical ID and uses that
     * ID for the API key name. For more information, see
     * [Name Type](https://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-name.html)
     * .
     *
     * If you specify a name, you cannot perform updates that require replacement of this resource.
     * You can perform updates that require no or some interruption. If you must replace the
     * resource, specify a new name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-name)
     *
     * @param name A name for the API key.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     *
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    public fun stageKeys(vararg stageKeys: Any) {
        _stageKeys.addAll(listOf(*stageKeys))
    }

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     *
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    public fun stageKeys(stageKeys: Collection<Any>) {
        _stageKeys.addAll(stageKeys)
    }

    /**
     * DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-stagekeys)
     *
     * @param stageKeys DEPRECATED FOR USAGE PLANS - Specifies stages associated with the API key.
     */
    public fun stageKeys(stageKeys: IResolvable) {
        cdkBuilder.stageKeys(stageKeys)
    }

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
     *
     * @param tags The key-value map of strings.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * The key-value map of strings.
     *
     * The valid character set is [a-zA-Z+-=._:/]. The tag key can be up to 128 characters and must
     * not start with `aws:` . The tag value can be up to 256 characters.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-tags)
     *
     * @param tags The key-value map of strings.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * Specifies a value of the API key.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-apigateway-apikey.html#cfn-apigateway-apikey-value)
     *
     * @param value Specifies a value of the API key.
     */
    public fun `value`(`value`: String) {
        cdkBuilder.`value`(`value`)
    }

    public fun build(): CfnApiKey {
        if (_stageKeys.isNotEmpty()) cdkBuilder.stageKeys(_stageKeys)
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
