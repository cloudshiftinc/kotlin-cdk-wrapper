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
import kotlin.Any
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.cloudfront.CfnFunction

/**
 * Contains configuration information about a CloudFront function.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.cloudfront.*;
 * FunctionConfigProperty functionConfigProperty = FunctionConfigProperty.builder()
 * .comment("comment")
 * .runtime("runtime")
 * // the properties below are optional
 * .keyValueStoreAssociations(List.of(KeyValueStoreAssociationProperty.builder()
 * .keyValueStoreArn("keyValueStoreArn")
 * .build()))
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-cloudfront-function-functionconfig.html)
 */
@CdkDslMarker
public class CfnFunctionFunctionConfigPropertyDsl {
    private val cdkBuilder: CfnFunction.FunctionConfigProperty.Builder =
        CfnFunction.FunctionConfigProperty.builder()

    private val _keyValueStoreAssociations: MutableList<Any> = mutableListOf()

    /** @param comment A comment to describe the function. */
    public fun comment(comment: String) {
        cdkBuilder.comment(comment)
    }

    /** @param keyValueStoreAssociations The configuration for the key value store associations. */
    public fun keyValueStoreAssociations(vararg keyValueStoreAssociations: Any) {
        _keyValueStoreAssociations.addAll(listOf(*keyValueStoreAssociations))
    }

    /** @param keyValueStoreAssociations The configuration for the key value store associations. */
    public fun keyValueStoreAssociations(keyValueStoreAssociations: Collection<Any>) {
        _keyValueStoreAssociations.addAll(keyValueStoreAssociations)
    }

    /** @param keyValueStoreAssociations The configuration for the key value store associations. */
    public fun keyValueStoreAssociations(keyValueStoreAssociations: IResolvable) {
        cdkBuilder.keyValueStoreAssociations(keyValueStoreAssociations)
    }

    /** @param runtime The function's runtime environment version. */
    public fun runtime(runtime: String) {
        cdkBuilder.runtime(runtime)
    }

    public fun build(): CfnFunction.FunctionConfigProperty {
        if (_keyValueStoreAssociations.isNotEmpty())
            cdkBuilder.keyValueStoreAssociations(_keyValueStoreAssociations)
        return cdkBuilder.build()
    }
}
