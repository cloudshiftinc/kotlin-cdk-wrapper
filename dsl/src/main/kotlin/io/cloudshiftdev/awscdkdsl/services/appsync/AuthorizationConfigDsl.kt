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

package io.cloudshiftdev.awscdkdsl.services.appsync

import io.cloudshiftdev.awscdkdsl.common.CdkDslMarker
import kotlin.Unit
import kotlin.collections.Collection
import kotlin.collections.MutableList
import software.amazon.awscdk.services.appsync.AuthorizationConfig
import software.amazon.awscdk.services.appsync.AuthorizationMode

/**
 * Configuration of the API authorization modes.
 *
 * Example:
 * ```
 * import software.amazon.awscdk.services.lambda.*;
 * Function authFunction;
 * GraphqlApi.Builder.create(this, "api")
 * .name("api")
 * .definition(Definition.fromFile(join(__dirname, "appsync.test.graphql")))
 * .authorizationConfig(AuthorizationConfig.builder()
 * .defaultAuthorization(AuthorizationMode.builder()
 * .authorizationType(AuthorizationType.LAMBDA)
 * .lambdaAuthorizerConfig(LambdaAuthorizerConfig.builder()
 * .handler(authFunction)
 * .build())
 * .build())
 * .build())
 * .build();
 * ```
 */
@CdkDslMarker
public class AuthorizationConfigDsl {
    private val cdkBuilder: AuthorizationConfig.Builder = AuthorizationConfig.builder()

    private val _additionalAuthorizationModes: MutableList<AuthorizationMode> = mutableListOf()

    /** @param additionalAuthorizationModes Additional authorization modes. */
    public fun additionalAuthorizationModes(
        additionalAuthorizationModes: AuthorizationModeDsl.() -> Unit
    ) {
        _additionalAuthorizationModes.add(
            AuthorizationModeDsl().apply(additionalAuthorizationModes).build()
        )
    }

    /** @param additionalAuthorizationModes Additional authorization modes. */
    public fun additionalAuthorizationModes(
        additionalAuthorizationModes: Collection<AuthorizationMode>
    ) {
        _additionalAuthorizationModes.addAll(additionalAuthorizationModes)
    }

    /** @param defaultAuthorization Optional authorization configuration. */
    public fun defaultAuthorization(defaultAuthorization: AuthorizationModeDsl.() -> Unit = {}) {
        val builder = AuthorizationModeDsl()
        builder.apply(defaultAuthorization)
        cdkBuilder.defaultAuthorization(builder.build())
    }

    /** @param defaultAuthorization Optional authorization configuration. */
    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode) {
        cdkBuilder.defaultAuthorization(defaultAuthorization)
    }

    public fun build(): AuthorizationConfig {
        if (_additionalAuthorizationModes.isNotEmpty())
            cdkBuilder.additionalAuthorizationModes(_additionalAuthorizationModes)
        return cdkBuilder.build()
    }
}
