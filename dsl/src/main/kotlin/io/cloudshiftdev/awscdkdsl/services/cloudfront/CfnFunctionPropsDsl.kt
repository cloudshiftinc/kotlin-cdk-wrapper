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

package io.cloudshiftdev.awscdkdsl.services.cloudfront

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Boolean
import kotlin.String
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnFunction
import software.amazon.awscdk.services.cloudfront.CfnFunctionProps

/**
 * Properties for defining a `CfnFunction`.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * CfnFunctionProps cfnFunctionProps = CfnFunctionProps.builder()
 * .functionCode("functionCode")
 * .functionConfig(FunctionConfigProperty.builder()
 * .comment("comment")
 * .runtime("runtime")
 * // the properties below are optional
 * .keyValueStoreAssociations(List.of(KeyValueStoreAssociationProperty.builder()
 * .keyValueStoreArn("keyValueStoreArn")
 * .build()))
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
public class CfnFunctionPropsDsl {
    private val cdkBuilder: CfnFunctionProps.Builder = CfnFunctionProps.builder()

    /**
     * @param autoPublish A flag that determines whether to automatically publish the function to
     *   the `LIVE` stage when it’s created. To automatically publish to the `LIVE` stage, set this
     *   property to `true` .
     */
    public fun autoPublish(autoPublish: Boolean) {
        cdkBuilder.autoPublish(autoPublish)
    }

    /**
     * @param autoPublish A flag that determines whether to automatically publish the function to
     *   the `LIVE` stage when it’s created. To automatically publish to the `LIVE` stage, set this
     *   property to `true` .
     */
    public fun autoPublish(autoPublish: IResolvable) {
        cdkBuilder.autoPublish(autoPublish)
    }

    /**
     * @param functionCode The function code. For more information about writing a CloudFront
     *   function, see
     *   [Writing function code for CloudFront Functions](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/writing-function-code.html)
     *   in the *Amazon CloudFront Developer Guide* .
     */
    public fun functionCode(functionCode: String) {
        cdkBuilder.functionCode(functionCode)
    }

    /** @param functionConfig Contains configuration information about a CloudFront function. */
    public fun functionConfig(functionConfig: IResolvable) {
        cdkBuilder.functionConfig(functionConfig)
    }

    /** @param functionConfig Contains configuration information about a CloudFront function. */
    public fun functionConfig(functionConfig: CfnFunction.FunctionConfigProperty) {
        cdkBuilder.functionConfig(functionConfig)
    }

    /** @param functionMetadata Contains metadata about a CloudFront function. */
    public fun functionMetadata(functionMetadata: IResolvable) {
        cdkBuilder.functionMetadata(functionMetadata)
    }

    /** @param functionMetadata Contains metadata about a CloudFront function. */
    public fun functionMetadata(functionMetadata: CfnFunction.FunctionMetadataProperty) {
        cdkBuilder.functionMetadata(functionMetadata)
    }

    /** @param name A name to identify the function. */
    public fun name(name: String) {
        cdkBuilder.name(name)
    }

    public fun build(): CfnFunctionProps = cdkBuilder.build()
}
