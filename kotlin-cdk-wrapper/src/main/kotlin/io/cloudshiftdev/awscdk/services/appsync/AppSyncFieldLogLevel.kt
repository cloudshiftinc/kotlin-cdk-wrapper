@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

public enum class AppSyncFieldLogLevel(
  private val cdkObject: software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel,
) {
  NONE(software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.NONE),
  ERROR(software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.ERROR),
  INFO(software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.INFO),
  DEBUG(software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.DEBUG),
  ALL(software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.ALL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel):
        AppSyncFieldLogLevel = when (cdkObject) {
      software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.NONE -> AppSyncFieldLogLevel.NONE
      software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.ERROR ->
          AppSyncFieldLogLevel.ERROR
      software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.INFO -> AppSyncFieldLogLevel.INFO
      software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.DEBUG ->
          AppSyncFieldLogLevel.DEBUG
      software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel.ALL -> AppSyncFieldLogLevel.ALL
    }

    internal fun unwrap(wrapped: AppSyncFieldLogLevel):
        software.amazon.awscdk.services.appsync.AppSyncFieldLogLevel = wrapped.cdkObject
  }
}
