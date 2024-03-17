@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.Unit
import kotlin.collections.List
import kotlin.jvm.JvmName

/**
 * Configuration of the API authorization modes.
 *
 * Example:
 *
 * ```
 * import io.cloudshiftdev.awscdk.services.lambda.*;
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
public interface AuthorizationConfig {
  /**
   * Additional authorization modes.
   *
   * Default: - No other modes
   */
  public fun additionalAuthorizationModes(): List<AuthorizationMode> =
      unwrap(this).getAdditionalAuthorizationModes()?.map(AuthorizationMode::wrap) ?: emptyList()

  /**
   * Optional authorization configuration.
   *
   * Default: - API Key authorization
   */
  public fun defaultAuthorization(): AuthorizationMode? =
      unwrap(this).getDefaultAuthorization()?.let(AuthorizationMode::wrap)

  /**
   * A builder for [AuthorizationConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param additionalAuthorizationModes Additional authorization modes.
     */
    public fun additionalAuthorizationModes(additionalAuthorizationModes: List<AuthorizationMode>)

    /**
     * @param additionalAuthorizationModes Additional authorization modes.
     */
    public fun additionalAuthorizationModes(vararg additionalAuthorizationModes: AuthorizationMode)

    /**
     * @param defaultAuthorization Optional authorization configuration.
     */
    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode)

    /**
     * @param defaultAuthorization Optional authorization configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4692d9be17568762847112a3ed1c1df1ac4768f899c97e5b4e77df5dca3c48ad")
    public fun defaultAuthorization(defaultAuthorization: AuthorizationMode.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AuthorizationConfig.Builder =
        software.amazon.awscdk.services.appsync.AuthorizationConfig.builder()

    /**
     * @param additionalAuthorizationModes Additional authorization modes.
     */
    override
        fun additionalAuthorizationModes(additionalAuthorizationModes: List<AuthorizationMode>) {
      cdkBuilder.additionalAuthorizationModes(additionalAuthorizationModes.map(AuthorizationMode::unwrap))
    }

    /**
     * @param additionalAuthorizationModes Additional authorization modes.
     */
    override fun additionalAuthorizationModes(vararg
        additionalAuthorizationModes: AuthorizationMode): Unit =
        additionalAuthorizationModes(additionalAuthorizationModes.toList())

    /**
     * @param defaultAuthorization Optional authorization configuration.
     */
    override fun defaultAuthorization(defaultAuthorization: AuthorizationMode) {
      cdkBuilder.defaultAuthorization(defaultAuthorization.let(AuthorizationMode::unwrap))
    }

    /**
     * @param defaultAuthorization Optional authorization configuration.
     */
    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("4692d9be17568762847112a3ed1c1df1ac4768f899c97e5b4e77df5dca3c48ad")
    override fun defaultAuthorization(defaultAuthorization: AuthorizationMode.Builder.() -> Unit):
        Unit = defaultAuthorization(AuthorizationMode(defaultAuthorization))

    public fun build(): software.amazon.awscdk.services.appsync.AuthorizationConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.AuthorizationConfig,
  ) : CdkObject(cdkObject), AuthorizationConfig {
    /**
     * Additional authorization modes.
     *
     * Default: - No other modes
     */
    override fun additionalAuthorizationModes(): List<AuthorizationMode> =
        unwrap(this).getAdditionalAuthorizationModes()?.map(AuthorizationMode::wrap) ?: emptyList()

    /**
     * Optional authorization configuration.
     *
     * Default: - API Key authorization
     */
    override fun defaultAuthorization(): AuthorizationMode? =
        unwrap(this).getDefaultAuthorization()?.let(AuthorizationMode::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuthorizationConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AuthorizationConfig):
        AuthorizationConfig = CdkObjectWrappers.wrap(cdkObject) as? AuthorizationConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuthorizationConfig):
        software.amazon.awscdk.services.appsync.AuthorizationConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AuthorizationConfig
  }
}
