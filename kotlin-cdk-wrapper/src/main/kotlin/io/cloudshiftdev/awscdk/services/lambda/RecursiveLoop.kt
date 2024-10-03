@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.lambda

public enum class RecursiveLoop(
  private val cdkObject: software.amazon.awscdk.services.lambda.RecursiveLoop,
) {
  ALLOW(software.amazon.awscdk.services.lambda.RecursiveLoop.ALLOW),
  TERMINATE(software.amazon.awscdk.services.lambda.RecursiveLoop.TERMINATE),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.lambda.RecursiveLoop):
        RecursiveLoop = when (cdkObject) {
      software.amazon.awscdk.services.lambda.RecursiveLoop.ALLOW -> RecursiveLoop.ALLOW
      software.amazon.awscdk.services.lambda.RecursiveLoop.TERMINATE -> RecursiveLoop.TERMINATE
    }

    internal fun unwrap(wrapped: RecursiveLoop):
        software.amazon.awscdk.services.lambda.RecursiveLoop = wrapped.cdkObject
  }
}
