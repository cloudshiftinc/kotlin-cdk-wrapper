@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

public enum class FieldLogLevel(
  private val cdkObject: software.amazon.awscdk.services.appsync.FieldLogLevel,
) {
  NONE(software.amazon.awscdk.services.appsync.FieldLogLevel.NONE),
  ERROR(software.amazon.awscdk.services.appsync.FieldLogLevel.ERROR),
  INFO(software.amazon.awscdk.services.appsync.FieldLogLevel.INFO),
  DEBUG(software.amazon.awscdk.services.appsync.FieldLogLevel.DEBUG),
  ALL(software.amazon.awscdk.services.appsync.FieldLogLevel.ALL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.FieldLogLevel):
        FieldLogLevel = when (cdkObject) {
      software.amazon.awscdk.services.appsync.FieldLogLevel.NONE -> FieldLogLevel.NONE
      software.amazon.awscdk.services.appsync.FieldLogLevel.ERROR -> FieldLogLevel.ERROR
      software.amazon.awscdk.services.appsync.FieldLogLevel.INFO -> FieldLogLevel.INFO
      software.amazon.awscdk.services.appsync.FieldLogLevel.DEBUG -> FieldLogLevel.DEBUG
      software.amazon.awscdk.services.appsync.FieldLogLevel.ALL -> FieldLogLevel.ALL
    }

    internal fun unwrap(wrapped: FieldLogLevel):
        software.amazon.awscdk.services.appsync.FieldLogLevel = wrapped.cdkObject
  }
}
