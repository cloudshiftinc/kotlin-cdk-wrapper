@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

public enum class AppSyncDataSourceType(
  private val cdkObject: software.amazon.awscdk.services.appsync.AppSyncDataSourceType,
) {
  LAMBDA(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.LAMBDA),
  DYNAMODB(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.DYNAMODB),
  EVENTBRIDGE(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.EVENTBRIDGE),
  OPENSEARCH_SERVICE(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.OPENSEARCH_SERVICE),
  HTTP(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.HTTP),
  RELATIONAL_DATABASE(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.RELATIONAL_DATABASE),
  BEDROCK(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.BEDROCK),
  ELASTICSEARCH(software.amazon.awscdk.services.appsync.AppSyncDataSourceType.ELASTICSEARCH),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.AppSyncDataSourceType):
        AppSyncDataSourceType = when (cdkObject) {
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.LAMBDA ->
          AppSyncDataSourceType.LAMBDA
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.DYNAMODB ->
          AppSyncDataSourceType.DYNAMODB
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.EVENTBRIDGE ->
          AppSyncDataSourceType.EVENTBRIDGE
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.OPENSEARCH_SERVICE ->
          AppSyncDataSourceType.OPENSEARCH_SERVICE
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.HTTP ->
          AppSyncDataSourceType.HTTP
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.RELATIONAL_DATABASE ->
          AppSyncDataSourceType.RELATIONAL_DATABASE
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.BEDROCK ->
          AppSyncDataSourceType.BEDROCK
      software.amazon.awscdk.services.appsync.AppSyncDataSourceType.ELASTICSEARCH ->
          AppSyncDataSourceType.ELASTICSEARCH
    }

    internal fun unwrap(wrapped: AppSyncDataSourceType):
        software.amazon.awscdk.services.appsync.AppSyncDataSourceType = wrapped.cdkObject
  }
}
