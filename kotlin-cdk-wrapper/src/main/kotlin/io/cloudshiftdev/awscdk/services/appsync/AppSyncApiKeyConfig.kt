@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.Expiration
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Configuration for API Key authorization in AppSync.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.*;
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * Expiration expiration;
 * AppSyncApiKeyConfig appSyncApiKeyConfig = AppSyncApiKeyConfig.builder()
 * .description("description")
 * .expires(expiration)
 * .name("name")
 * .build();
 * ```
 */
public interface AppSyncApiKeyConfig {
  /**
   * Description of API key.
   *
   * Default: - 'Default API Key created by CDK'
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * The time from creation time after which the API key expires.
   *
   * It must be a minimum of 1 day and a maximum of 365 days from date of creation.
   * Rounded down to the nearest hour.
   *
   * Default: - 7 days rounded down to nearest hour
   */
  public fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

  /**
   * Unique name of the API Key.
   *
   * Default: - 'DefaultAPIKey'
   */
  public fun name(): String? = unwrap(this).getName()

  /**
   * A builder for [AppSyncApiKeyConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param description Description of API key.
     */
    public fun description(description: String)

    /**
     * @param expires The time from creation time after which the API key expires.
     * It must be a minimum of 1 day and a maximum of 365 days from date of creation.
     * Rounded down to the nearest hour.
     */
    public fun expires(expires: Expiration)

    /**
     * @param name Unique name of the API Key.
     */
    public fun name(name: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncApiKeyConfig.Builder =
        software.amazon.awscdk.services.appsync.AppSyncApiKeyConfig.builder()

    /**
     * @param description Description of API key.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    /**
     * @param expires The time from creation time after which the API key expires.
     * It must be a minimum of 1 day and a maximum of 365 days from date of creation.
     * Rounded down to the nearest hour.
     */
    override fun expires(expires: Expiration) {
      cdkBuilder.expires(expires.let(Expiration.Companion::unwrap))
    }

    /**
     * @param name Unique name of the API Key.
     */
    override fun name(name: String) {
      cdkBuilder.name(name)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncApiKeyConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncApiKeyConfig,
  ) : CdkObject(cdkObject),
      AppSyncApiKeyConfig {
    /**
     * Description of API key.
     *
     * Default: - 'Default API Key created by CDK'
     */
    override fun description(): String? = unwrap(this).getDescription()

    /**
     * The time from creation time after which the API key expires.
     *
     * It must be a minimum of 1 day and a maximum of 365 days from date of creation.
     * Rounded down to the nearest hour.
     *
     * Default: - 7 days rounded down to nearest hour
     */
    override fun expires(): Expiration? = unwrap(this).getExpires()?.let(Expiration::wrap)

    /**
     * Unique name of the API Key.
     *
     * Default: - 'DefaultAPIKey'
     */
    override fun name(): String? = unwrap(this).getName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncApiKeyConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncApiKeyConfig):
        AppSyncApiKeyConfig = CdkObjectWrappers.wrap(cdkObject) as? AppSyncApiKeyConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncApiKeyConfig):
        software.amazon.awscdk.services.appsync.AppSyncApiKeyConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncApiKeyConfig
  }
}
