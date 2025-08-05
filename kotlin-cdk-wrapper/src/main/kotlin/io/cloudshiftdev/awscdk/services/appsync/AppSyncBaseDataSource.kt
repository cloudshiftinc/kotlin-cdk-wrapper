@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.constructs.Construct
import kotlin.String

/**
 * Abstract AppSync datasource implementation.
 *
 * Do not use directly but use subclasses for concrete datasources
 */
public abstract class AppSyncBaseDataSource(
  cdkObject: software.amazon.awscdk.services.appsync.AppSyncBaseDataSource,
) : Construct(cdkObject) {
  /**
   * The name of the data source.
   */
  public open fun name(): String = unwrap(this).getName()

  /**
   * The underlying CFN data source resource.
   */
  public open fun resource(): CfnDataSource = unwrap(this).getResource().let(CfnDataSource::wrap)

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.appsync.AppSyncBaseDataSource,
  ) : AppSyncBaseDataSource(cdkObject)

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncBaseDataSource):
        AppSyncBaseDataSource = CdkObjectWrappers.wrap(cdkObject) as? AppSyncBaseDataSource ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: AppSyncBaseDataSource):
        software.amazon.awscdk.services.appsync.AppSyncBaseDataSource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appsync.AppSyncBaseDataSource
  }
}
