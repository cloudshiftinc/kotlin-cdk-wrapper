@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

public enum class NetworkType(
  private val cdkObject: software.amazon.awscdk.services.rds.NetworkType,
) {
  IPV4(software.amazon.awscdk.services.rds.NetworkType.IPV4),
  DUAL(software.amazon.awscdk.services.rds.NetworkType.DUAL),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.NetworkType): NetworkType =
        when (cdkObject) {
      software.amazon.awscdk.services.rds.NetworkType.IPV4 -> NetworkType.IPV4
      software.amazon.awscdk.services.rds.NetworkType.DUAL -> NetworkType.DUAL
    }

    internal fun unwrap(wrapped: NetworkType): software.amazon.awscdk.services.rds.NetworkType =
        wrapped.cdkObject
  }
}
