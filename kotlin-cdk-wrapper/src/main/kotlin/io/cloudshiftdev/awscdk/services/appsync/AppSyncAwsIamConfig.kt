@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * The authorization config in case the HTTP endpoint requires authorization.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * AppSyncAwsIamConfig appSyncAwsIamConfig = AppSyncAwsIamConfig.builder()
 * .signingRegion("signingRegion")
 * .signingServiceName("signingServiceName")
 * .build();
 * ```
 */
public interface AppSyncAwsIamConfig {
  /**
   * The signing region for AWS IAM authorization.
   */
  public fun signingRegion(): String

  /**
   * The signing service name for AWS IAM authorization.
   */
  public fun signingServiceName(): String

  /**
   * A builder for [AppSyncAwsIamConfig]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param signingRegion The signing region for AWS IAM authorization. 
     */
    public fun signingRegion(signingRegion: String)

    /**
     * @param signingServiceName The signing service name for AWS IAM authorization. 
     */
    public fun signingServiceName(signingServiceName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.AppSyncAwsIamConfig.Builder =
        software.amazon.awscdk.services.appsync.AppSyncAwsIamConfig.builder()

    /**
     * @param signingRegion The signing region for AWS IAM authorization. 
     */
    override fun signingRegion(signingRegion: String) {
      cdkBuilder.signingRegion(signingRegion)
    }

    /**
     * @param signingServiceName The signing service name for AWS IAM authorization. 
     */
    override fun signingServiceName(signingServiceName: String) {
      cdkBuilder.signingServiceName(signingServiceName)
    }

    public fun build(): software.amazon.awscdk.services.appsync.AppSyncAwsIamConfig =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncAwsIamConfig,
  ) : CdkObject(cdkObject),
      AppSyncAwsIamConfig {
    /**
     * The signing region for AWS IAM authorization.
     */
    override fun signingRegion(): String = unwrap(this).getSigningRegion()

    /**
     * The signing service name for AWS IAM authorization.
     */
    override fun signingServiceName(): String = unwrap(this).getSigningServiceName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AppSyncAwsIamConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncAwsIamConfig):
        AppSyncAwsIamConfig = CdkObjectWrappers.wrap(cdkObject) as? AppSyncAwsIamConfig ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncAwsIamConfig):
        software.amazon.awscdk.services.appsync.AppSyncAwsIamConfig = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncAwsIamConfig
  }
}
