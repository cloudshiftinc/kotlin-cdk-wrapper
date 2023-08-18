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

package io.cloudshiftdev.awscdkdsl.services.iot

import io.cloudshiftdev.awscdkdsl.CfnTagDsl
import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CfnTag
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.iot.CfnAuthorizer
import software.constructs.Construct

/**
 * Specifies an authorizer.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.iot.*;
 * CfnAuthorizer cfnAuthorizer = CfnAuthorizer.Builder.create(this, "MyCfnAuthorizer")
 * .authorizerFunctionArn("authorizerFunctionArn")
 * // the properties below are optional
 * .authorizerName("authorizerName")
 * .enableCachingForHttp(false)
 * .signingDisabled(false)
 * .status("status")
 * .tags(List.of(CfnTag.builder()
 * .key("key")
 * .value("value")
 * .build()))
 * .tokenKeyName("tokenKeyName")
 * .tokenSigningPublicKeys(Map.of(
 * "tokenSigningPublicKeysKey", "tokenSigningPublicKeys"))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html)
 */
@CdkDslMarker
public class CfnAuthorizerDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnAuthorizer.Builder = CfnAuthorizer.Builder.create(scope, id)

    private val _tags: MutableList<CfnTag> = mutableListOf()

    /**
     * The authorizer's Lambda function ARN.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizerfunctionarn)
     *
     * @param authorizerFunctionArn The authorizer's Lambda function ARN.
     */
    public fun authorizerFunctionArn(authorizerFunctionArn: String) {
        cdkBuilder.authorizerFunctionArn(authorizerFunctionArn)
    }

    /**
     * The authorizer name.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-authorizername)
     *
     * @param authorizerName The authorizer name.
     */
    public fun authorizerName(authorizerName: String) {
        cdkBuilder.authorizerName(authorizerName)
    }

    /**
     * When `true` , the result from the authorizer's Lambda function is cached for clients that use
     * persistent HTTP connections.
     *
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
     *
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     *   cached for clients that use persistent HTTP connections.
     */
    public fun enableCachingForHttp(enableCachingForHttp: Boolean) {
        cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    /**
     * When `true` , the result from the authorizer's Lambda function is cached for clients that use
     * persistent HTTP connections.
     *
     * The results are cached for the time specified by the Lambda function in
     * `refreshAfterInSeconds` . This value doesn't affect authorization of clients that use MQTT
     * connections.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-enablecachingforhttp)
     *
     * @param enableCachingForHttp When `true` , the result from the authorizer's Lambda function is
     *   cached for clients that use persistent HTTP connections.
     */
    public fun enableCachingForHttp(enableCachingForHttp: IResolvable) {
        cdkBuilder.enableCachingForHttp(enableCachingForHttp)
    }

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
     *
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     *   authorization request.
     */
    public fun signingDisabled(signingDisabled: Boolean) {
        cdkBuilder.signingDisabled(signingDisabled)
    }

    /**
     * Specifies whether AWS IoT validates the token signature in an authorization request.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-signingdisabled)
     *
     * @param signingDisabled Specifies whether AWS IoT validates the token signature in an
     *   authorization request.
     */
    public fun signingDisabled(signingDisabled: IResolvable) {
        cdkBuilder.signingDisabled(signingDisabled)
    }

    /**
     * The status of the authorizer.
     *
     * Valid values: `ACTIVE` | `INACTIVE`
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-status)
     *
     * @param status The status of the authorizer.
     */
    public fun status(status: String) {
        cdkBuilder.status(status)
    }

    /**
     * Metadata which can be used to manage the custom authorizer.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tags)
     *
     * @param tags Metadata which can be used to manage the custom authorizer.
     */
    public fun tags(tags: CfnTagDsl.() -> Unit) {
        _tags.add(CfnTagDsl().apply(tags).build())
    }

    /**
     * Metadata which can be used to manage the custom authorizer.
     *
     * For URI Request parameters use format: ...key1=value1&amp;key2=value2...
     *
     * For the CLI command-line parameter use format: &amp;&amp;tags
     * "key1=value1&amp;key2=value2..."
     *
     * For the cli-input-json file use format: "tags": "key1=value1&amp;key2=value2..."
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tags)
     *
     * @param tags Metadata which can be used to manage the custom authorizer.
     */
    public fun tags(tags: Collection<CfnTag>) {
        _tags.addAll(tags)
    }

    /**
     * The key used to extract the token from the HTTP headers.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokenkeyname)
     *
     * @param tokenKeyName The key used to extract the token from the HTTP headers.
     */
    public fun tokenKeyName(tokenKeyName: String) {
        cdkBuilder.tokenKeyName(tokenKeyName)
    }

    /**
     * The public keys used to validate the token signature returned by your custom authentication
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
     *
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     *   by your custom authentication service.
     */
    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: Map<String, String>) {
        cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    /**
     * The public keys used to validate the token signature returned by your custom authentication
     * service.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-iot-authorizer.html#cfn-iot-authorizer-tokensigningpublickeys)
     *
     * @param tokenSigningPublicKeys The public keys used to validate the token signature returned
     *   by your custom authentication service.
     */
    public fun tokenSigningPublicKeys(tokenSigningPublicKeys: IResolvable) {
        cdkBuilder.tokenSigningPublicKeys(tokenSigningPublicKeys)
    }

    public fun build(): CfnAuthorizer {
        if (_tags.isNotEmpty()) cdkBuilder.tags(_tags)
        return cdkBuilder.build()
    }
}
