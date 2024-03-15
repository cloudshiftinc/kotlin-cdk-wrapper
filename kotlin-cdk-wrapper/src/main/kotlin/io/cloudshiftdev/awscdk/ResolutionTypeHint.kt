@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

public enum class ResolutionTypeHint(
  private val cdkObject: software.amazon.awscdk.ResolutionTypeHint,
) {
  STRING(software.amazon.awscdk.ResolutionTypeHint.STRING),
  NUMBER(software.amazon.awscdk.ResolutionTypeHint.NUMBER),
  STRING_LIST(software.amazon.awscdk.ResolutionTypeHint.STRING_LIST),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.ResolutionTypeHint): ResolutionTypeHint =
        when (cdkObject) {
      software.amazon.awscdk.ResolutionTypeHint.STRING -> ResolutionTypeHint.STRING
      software.amazon.awscdk.ResolutionTypeHint.NUMBER -> ResolutionTypeHint.NUMBER
      software.amazon.awscdk.ResolutionTypeHint.STRING_LIST -> ResolutionTypeHint.STRING_LIST
    }

    internal fun unwrap(wrapped: ResolutionTypeHint): software.amazon.awscdk.ResolutionTypeHint =
        wrapped.cdkObject
  }
}
