@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

public enum class IgnoreMode(
  private val cdkObject: software.amazon.awscdk.IgnoreMode,
) {
  GLOB(software.amazon.awscdk.IgnoreMode.GLOB),
  GIT(software.amazon.awscdk.IgnoreMode.GIT),
  DOCKER(software.amazon.awscdk.IgnoreMode.DOCKER),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.IgnoreMode): IgnoreMode = when (cdkObject) {
      software.amazon.awscdk.IgnoreMode.GLOB -> IgnoreMode.GLOB
      software.amazon.awscdk.IgnoreMode.GIT -> IgnoreMode.GIT
      software.amazon.awscdk.IgnoreMode.DOCKER -> IgnoreMode.DOCKER
    }

    internal fun unwrap(wrapped: IgnoreMode): software.amazon.awscdk.IgnoreMode = wrapped.cdkObject
  }
}
