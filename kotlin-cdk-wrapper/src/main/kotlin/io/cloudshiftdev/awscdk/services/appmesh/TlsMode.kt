@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appmesh

public enum class TlsMode(
  private val cdkObject: software.amazon.awscdk.services.appmesh.TlsMode,
) {
  STRICT(software.amazon.awscdk.services.appmesh.TlsMode.STRICT),
  PERMISSIVE(software.amazon.awscdk.services.appmesh.TlsMode.PERMISSIVE),
  DISABLED(software.amazon.awscdk.services.appmesh.TlsMode.DISABLED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appmesh.TlsMode): TlsMode = when
        (cdkObject) {
      software.amazon.awscdk.services.appmesh.TlsMode.STRICT -> TlsMode.STRICT
      software.amazon.awscdk.services.appmesh.TlsMode.PERMISSIVE -> TlsMode.PERMISSIVE
      software.amazon.awscdk.services.appmesh.TlsMode.DISABLED -> TlsMode.DISABLED
    }

    internal fun unwrap(wrapped: TlsMode): software.amazon.awscdk.services.appmesh.TlsMode =
        wrapped.cdkObject
  }
}
