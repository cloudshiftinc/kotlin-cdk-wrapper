package io.cloudshiftdev.awscdk.services.fsx

public enum class LustreAutoImportPolicy(
  private val cdkObject: software.amazon.awscdk.services.fsx.LustreAutoImportPolicy,
) {
  NONE(software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NONE),
  NEW(software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NEW),
  NEW_CHANGED(software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NEW_CHANGED),
  NEW_CHANGED_DELETED(software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NEW_CHANGED_DELETED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.fsx.LustreAutoImportPolicy):
        LustreAutoImportPolicy = when (cdkObject) {
      software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NONE -> LustreAutoImportPolicy.NONE
      software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NEW -> LustreAutoImportPolicy.NEW
      software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NEW_CHANGED ->
          LustreAutoImportPolicy.NEW_CHANGED
      software.amazon.awscdk.services.fsx.LustreAutoImportPolicy.NEW_CHANGED_DELETED ->
          LustreAutoImportPolicy.NEW_CHANGED_DELETED
    }

    internal fun unwrap(wrapped: LustreAutoImportPolicy):
        software.amazon.awscdk.services.fsx.LustreAutoImportPolicy = wrapped.cdkObject
  }
}
