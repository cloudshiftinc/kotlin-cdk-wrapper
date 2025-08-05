@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.collections.List

/**
 * A class used to generate resource arns for AppSync Event APIs.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.appsync.*;
 * AppSyncEventResource appSyncEventResource = AppSyncEventResource.all();
 * ```
 */
public open class AppSyncEventResource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncEventResource,
) : CdkObject(cdkObject) {
  /**
   * Return the Resource ARN.
   *
   * @param api The AppSync API to give permissions. 
   */
  public open fun resourceArns(api: EventApiBase): List<String> =
      unwrap(this).resourceArns(api.let(EventApiBase.Companion::unwrap))

  public companion object {
    public fun all(): AppSyncEventResource =
        software.amazon.awscdk.services.appsync.AppSyncEventResource.all().let(AppSyncEventResource::wrap)

    public fun allChannelNamespaces(): AppSyncEventResource =
        software.amazon.awscdk.services.appsync.AppSyncEventResource.allChannelNamespaces().let(AppSyncEventResource::wrap)

    public fun forAPI(): AppSyncEventResource =
        software.amazon.awscdk.services.appsync.AppSyncEventResource.forAPI().let(AppSyncEventResource::wrap)

    public fun ofChannelNamespace(channelNamespace: String): AppSyncEventResource =
        software.amazon.awscdk.services.appsync.AppSyncEventResource.ofChannelNamespace(channelNamespace).let(AppSyncEventResource::wrap)

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncEventResource):
        AppSyncEventResource = AppSyncEventResource(cdkObject)

    internal fun unwrap(wrapped: AppSyncEventResource):
        software.amazon.awscdk.services.appsync.AppSyncEventResource = wrapped.cdkObject as
        software.amazon.awscdk.services.appsync.AppSyncEventResource
  }
}
