@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

public enum class URLEncodingFormat(
  private val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat,
) {
  BRACKETS(software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.BRACKETS),
  COMMAS(software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.COMMAS),
  DEFAULT(software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.DEFAULT),
  INDICES(software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.INDICES),
  NONE(software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.NONE),
  REPEAT(software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.REPEAT),
  ;

  public companion object {
    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat):
        URLEncodingFormat = when (cdkObject) {
      software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.BRACKETS ->
          URLEncodingFormat.BRACKETS
      software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.COMMAS ->
          URLEncodingFormat.COMMAS
      software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.DEFAULT ->
          URLEncodingFormat.DEFAULT
      software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.INDICES ->
          URLEncodingFormat.INDICES
      software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.NONE ->
          URLEncodingFormat.NONE
      software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat.REPEAT ->
          URLEncodingFormat.REPEAT
    }

    internal fun unwrap(wrapped: URLEncodingFormat):
        software.amazon.awscdk.services.stepfunctions.tasks.URLEncodingFormat = wrapped.cdkObject
  }
}
