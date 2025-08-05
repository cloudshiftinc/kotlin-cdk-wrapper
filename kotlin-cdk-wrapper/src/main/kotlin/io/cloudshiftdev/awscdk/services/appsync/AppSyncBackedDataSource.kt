@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.iam.IGrantable
import io.cloudshiftdev.awscdk.services.iam.IPrincipal

/**
 * Abstract AppSync datasource implementation.
 *
 * Do not use directly but use subclasses for resource backed datasources
 *
 * Example:
 *
 * ```
 * EventApi api;
 * AppSyncDynamoDbDataSource ddbDataSource;
 * AppSyncEventBridgeDataSource ebDataSource;
 * // DynamoDB data source for publish handler
 * api.addChannelNamespace("ddb-eb-ns", ChannelNamespaceOptions.builder()
 * .code(Code.fromInline("/ * event handler code here.*&#47;"))
 * .publishHandlerConfig(HandlerConfig.builder()
 * .dataSource(ddbDataSource)
 * .build())
 * .subscribeHandlerConfig(HandlerConfig.builder()
 * .dataSource(ebDataSource)
 * .build())
 * .build());
 * ```
 */
public abstract class AppSyncBackedDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncBackedDataSource,
) : AppSyncBaseDataSource(cdkObject),
    IGrantable {
  /**
   * The principal of the data source to be IGrantable.
   */
  public override fun grantPrincipal(): IPrincipal =
      unwrap(this).getGrantPrincipal().let(IPrincipal::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncBackedDataSource,
  ) : AppSyncBackedDataSource(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncBackedDataSource):
        AppSyncBackedDataSource = CdkObjectWrappers.wrap(cdkObject) as? AppSyncBackedDataSource ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncBackedDataSource):
        software.amazon.awscdk.services.appsync.AppSyncBackedDataSource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncBackedDataSource
  }
}
