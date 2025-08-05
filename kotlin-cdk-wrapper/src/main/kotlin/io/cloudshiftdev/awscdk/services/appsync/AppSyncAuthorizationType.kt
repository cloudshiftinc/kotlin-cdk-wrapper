@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

public enum class AppSyncAuthorizationType(
  private val cdkObject: software.amazon.awscdk.services.appsync.AppSyncAuthorizationType,
) {
  API_KEY(software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.API_KEY),
  IAM(software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.IAM),
  USER_POOL(software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.USER_POOL),
  OIDC(software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.OIDC),
  LAMBDA(software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.LAMBDA),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncAuthorizationType):
        AppSyncAuthorizationType = when (cdkObject) {
      software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.API_KEY ->
          AppSyncAuthorizationType.API_KEY
      software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.IAM ->
          AppSyncAuthorizationType.IAM
      software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.USER_POOL ->
          AppSyncAuthorizationType.USER_POOL
      software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.OIDC ->
          AppSyncAuthorizationType.OIDC
      software.amazon.awscdk.services.appsync.AppSyncAuthorizationType.LAMBDA ->
          AppSyncAuthorizationType.LAMBDA
    }

    internal fun unwrap(wrapped: AppSyncAuthorizationType):
        software.amazon.awscdk.services.appsync.AppSyncAuthorizationType = wrapped.cdkObject
  }
}
