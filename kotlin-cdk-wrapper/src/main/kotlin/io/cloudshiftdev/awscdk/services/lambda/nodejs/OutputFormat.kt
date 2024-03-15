@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda.nodejs

public enum class OutputFormat(
  private val cdkObject: software.amazon.awscdk.services.lambda.nodejs.OutputFormat,
) {
  CJS(software.amazon.awscdk.services.lambda.nodejs.OutputFormat.CJS),
  ESM(software.amazon.awscdk.services.lambda.nodejs.OutputFormat.ESM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.nodejs.OutputFormat):
        OutputFormat = when (cdkObject) {
      software.amazon.awscdk.services.lambda.nodejs.OutputFormat.CJS -> OutputFormat.CJS
      software.amazon.awscdk.services.lambda.nodejs.OutputFormat.ESM -> OutputFormat.ESM
    }

    internal fun unwrap(wrapped: OutputFormat):
        software.amazon.awscdk.services.lambda.nodejs.OutputFormat = wrapped.cdkObject
  }
}
