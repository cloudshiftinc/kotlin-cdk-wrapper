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

package io.cloudshiftdev.awscdkdsl

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.collections.Collection
import kotlin.collections.Map
import kotlin.collections.MutableList
import software.amazon.awscdk.CustomResourceProviderOptions
import software.amazon.awscdk.Duration
import software.amazon.awscdk.Size

/**
 * Initialization options for custom resource providers.
 *
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.*;
 * Object policyStatements;
 * Size size;
 * CustomResourceProviderOptions customResourceProviderOptions =
 * CustomResourceProviderOptions.builder()
 * .description("description")
 * .environment(Map.of(
 * "environmentKey", "environment"))
 * .memorySize(size)
 * .policyStatements(List.of(policyStatements))
 * .timeout(Duration.minutes(30))
 * .useCfnResponseWrapper(false)
 * .build();
 * ```
 */
@CdkDslMarker
public class CustomResourceProviderOptionsDsl {
    private val cdkBuilder: CustomResourceProviderOptions.Builder =
        CustomResourceProviderOptions.builder()

    private val _policyStatements: MutableList<Any> = mutableListOf()

    /** @param description A description of the function. */
    public fun description(description: String) {
        cdkBuilder.description(description)
    }

    /** @param environment Key-value pairs that are passed to Lambda as Environment. */
    public fun environment(environment: Map<String, String>) {
        cdkBuilder.environment(environment)
    }

    /**
     * @param memorySize The amount of memory that your function has access to. Increasing the
     *   function's memory also increases its CPU allocation.
     */
    public fun memorySize(memorySize: Size) {
        cdkBuilder.memorySize(memorySize)
    }

    /**
     * @param policyStatements A set of IAM policy statements to include in the inline policy of the
     *   provider's lambda function. **Please note**: these are direct IAM JSON policy blobs, *not*
     *   `iam.PolicyStatement` objects like you will see in the rest of the CDK.
     */
    public fun policyStatements(vararg policyStatements: Any) {
        _policyStatements.addAll(listOf(*policyStatements))
    }

    /**
     * @param policyStatements A set of IAM policy statements to include in the inline policy of the
     *   provider's lambda function. **Please note**: these are direct IAM JSON policy blobs, *not*
     *   `iam.PolicyStatement` objects like you will see in the rest of the CDK.
     */
    public fun policyStatements(policyStatements: Collection<Any>) {
        _policyStatements.addAll(policyStatements)
    }

    /** @param timeout AWS Lambda timeout for the provider. */
    public fun timeout(timeout: Duration) {
        cdkBuilder.timeout(timeout)
    }

    /**
     * @param useCfnResponseWrapper Whether or not the cloudformation response wrapper
     *   (`nodejs-entrypoint.ts`) is used. If set to `true`, `nodejs-entrypoint.js` is bundled in
     *   the same asset as the custom resource and set as the entrypoint. If set to `false`, the
     *   custom resource provided is the entrypoint.
     */
    public fun useCfnResponseWrapper(useCfnResponseWrapper: Boolean) {
        cdkBuilder.useCfnResponseWrapper(useCfnResponseWrapper)
    }

    public fun build(): CustomResourceProviderOptions {
        if (_policyStatements.isNotEmpty()) cdkBuilder.policyStatements(_policyStatements)
        return cdkBuilder.build()
    }
}
