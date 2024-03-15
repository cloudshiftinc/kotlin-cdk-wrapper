@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk

public enum class AssetHashType(
  private val cdkObject: software.amazon.awscdk.AssetHashType,
) {
  SOURCE(software.amazon.awscdk.AssetHashType.SOURCE),
  OUTPUT(software.amazon.awscdk.AssetHashType.OUTPUT),
  CUSTOM(software.amazon.awscdk.AssetHashType.CUSTOM),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.AssetHashType): AssetHashType = when
        (cdkObject) {
      software.amazon.awscdk.AssetHashType.SOURCE -> AssetHashType.SOURCE
      software.amazon.awscdk.AssetHashType.OUTPUT -> AssetHashType.OUTPUT
      software.amazon.awscdk.AssetHashType.CUSTOM -> AssetHashType.CUSTOM
    }

    internal fun unwrap(wrapped: AssetHashType): software.amazon.awscdk.AssetHashType =
        wrapped.cdkObject
  }
}
