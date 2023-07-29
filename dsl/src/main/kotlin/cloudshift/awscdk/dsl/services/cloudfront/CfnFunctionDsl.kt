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

package cloudshift.awscdk.dsl.services.cloudfront

import cloudshift.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.constructs.Construct

/**
 * Creates a CloudFront function.
 *
 * To create a function, you provide the function code and some configuration information about the
 * function. The response contains an Amazon Resource Name (ARN) that uniquely identifies the
 * function, and the function’s stage.
 *
 * By default, when you create a function, it’s in the `DEVELOPMENT` stage. In this stage, you can
 * [test the function](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/test-function.html)
 * in the CloudFront console (or with `TestFunction` in the CloudFront API).
 *
 * When you’re ready to use your function with a CloudFront distribution, publish the function to
 * the `LIVE` stage. You can do this in the CloudFront console, with `PublishFunction` in the
 * CloudFront API, or by updating the `AWS::CloudFront::Function` resource with the `AutoPublish`
 * property set to `true` . When the function is published to the `LIVE` stage, you can attach it to
 * a distribution’s cache behavior, using the function’s ARN.
 *
 * To automatically publish the function to the `LIVE` stage when it’s created, set the
 * `AutoPublish` property to `true` .
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnFunction cfnFunction = CfnFunction.Builder.create(this, "MyCfnFunction")
 * .functionCode("functionCode")
 * .functionConfig(FunctionConfigProperty.builder()
 * .comment("comment")
 * .runtime("runtime")
 * .build())
 * .name("name")
 * // the properties below are optional
 * .autoPublish(false)
 * .functionMetadata(FunctionMetadataProperty.builder()
 * .functionArn("functionArn")
 * .build())
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html)
 */
@CdkDslMarker
public class CfnFunctionDsl(
    scope: Construct,
    id: String,
) {
    private val cdkBuilder: CfnFunction.Builder = CfnFunction.Builder.create(scope, id)

    /**
     * A flag that determines whether to automatically publish the function to the `LIVE` stage when
     * it’s created.
     *
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
     *
     * @param autoPublish A flag that determines whether to automatically publish the function to
     *   the `LIVE` stage when it’s created.
     */
    public fun autoPublish(autoPublish: Boolean) {
        cdkBuilder.autoPublish(autoPublish)
    }

    /**
     * A flag that determines whether to automatically publish the function to the `LIVE` stage when
     * it’s created.
     *
     * To automatically publish to the `LIVE` stage, set this property to `true` .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-autopublish)
     *
     * @param autoPublish A flag that determines whether to automatically publish the function to
     *   the `LIVE` stage when it’s created.
     */
    public fun autoPublish(autoPublish: IResolvable) {
        cdkBuilder.autoPublish(autoPublish)
    }

    /**
     * The function code.
     *
     * For more information about writing a CloudFront function, see
     * [Writing function code for CloudFront Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
     * in the *Amazon CloudFront Developer Guide* .
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functioncode)
     *
     * @param functionCode The function code.
     */
    public fun functionCode(functionCode: String) {
        cdkBuilder.functionCode(functionCode)
    }

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     *
     * @param functionConfig Contains configuration information about a CloudFront function.
     */
    public fun functionConfig(functionConfig: IResolvable) {
        cdkBuilder.functionConfig(functionConfig)
    }

    /**
     * Contains configuration information about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionconfig)
     *
     * @param functionConfig Contains configuration information about a CloudFront function.
     */
    public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty) {
        cdkBuilder.functionConfig(functionConfig)
    }

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     *
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    public fun functionMetadata(functionMetadata: IResolvable) {
        cdkBuilder.functionMetadata(functionMetadata)
    }

    /**
     * Contains metadata about a CloudFront function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-functionmetadata)
     *
     * @param functionMetadata Contains metadata about a CloudFront function.
     */
    public fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty) {
        cdkBuilder.functionMetadata(functionMetadata)
    }

    /**
     * A name to identify the function.
     *
     * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-resource-cloudfront-function.html#cfn-cloudfront-function-name)
     *
     * @param name A name to identify the function.
     */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnFunction = cdkBuilder.build()
}
