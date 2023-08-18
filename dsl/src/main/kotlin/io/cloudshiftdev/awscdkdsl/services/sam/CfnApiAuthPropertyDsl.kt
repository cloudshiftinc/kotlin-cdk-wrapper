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

package io.cloudshiftdev.awscdkdsl.services.sam

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import io.cloudshiftdev.awscdkdsl.common.MapBuilder
import kotlin.Any
import kotlin.Boolean
import kotlin.String
import kotlin.Unit
import software.amazon.awscdk.IResolvable
import software.amazon.awscdk.services.sam.CfnApi

/**
 * Example:
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import software.amazon.awscdk.services.sam.*;
 * Object authorizers;
 * AuthProperty authProperty = AuthProperty.builder()
 * .addDefaultAuthorizerToCorsPreflight(false)
 * .authorizers(authorizers)
 * .defaultAuthorizer("defaultAuthorizer")
 * .build();
 * ```
 *
 * [Documentation](http://docs.aws.amazon.com/AWSCloudFormation/latest/UserGuide/aws-properties-serverless-api-auth.html)
 */
@CdkDslMarker
public class CfnApiAuthPropertyDsl {
    private val cdkBuilder: CfnApi.AuthProperty.Builder = CfnApi.AuthProperty.builder()

    /** @param addDefaultAuthorizerToCorsPreflight the value to be set. */
    public fun addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight: Boolean) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
    }

    /** @param addDefaultAuthorizerToCorsPreflight the value to be set. */
    public fun addDefaultAuthorizerToCorsPreflight(
        addDefaultAuthorizerToCorsPreflight: IResolvable
    ) {
        cdkBuilder.addDefaultAuthorizerToCorsPreflight(addDefaultAuthorizerToCorsPreflight)
    }

    /** @param authorizers the value to be set. */
    public fun authorizers(authorizers: MapBuilder.() -> Unit = {}) {
        val builder = MapBuilder()
        builder.apply(authorizers)
        cdkBuilder.authorizers(builder.map)
    }

    /** @param authorizers the value to be set. */
    public fun authorizers(authorizers: Any) {
        cdkBuilder.authorizers(authorizers)
    }

    /** @param defaultAuthorizer the value to be set. */
    public fun defaultAuthorizer(defaultAuthorizer: String) {
        cdkBuilder.defaultAuthorizer(defaultAuthorizer)
    }

    public fun build(): CfnApi.AuthProperty = cdkBuilder.build()
}
