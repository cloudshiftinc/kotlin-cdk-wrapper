@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.logs

public enum class JsonMutatorType(
  private val cdkObject: software.amazon.awscdk.services.logs.JsonMutatorType,
) {
  ADD_KEYS(software.amazon.awscdk.services.logs.JsonMutatorType.ADD_KEYS),
  DELETE_KEYS(software.amazon.awscdk.services.logs.JsonMutatorType.DELETE_KEYS),
  MOVE_KEYS(software.amazon.awscdk.services.logs.JsonMutatorType.MOVE_KEYS),
  RENAME_KEYS(software.amazon.awscdk.services.logs.JsonMutatorType.RENAME_KEYS),
  COPY_VALUE(software.amazon.awscdk.services.logs.JsonMutatorType.COPY_VALUE),
  LIST_TO_MAP(software.amazon.awscdk.services.logs.JsonMutatorType.LIST_TO_MAP),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.logs.JsonMutatorType):
        JsonMutatorType = when (cdkObject) {
      software.amazon.awscdk.services.logs.JsonMutatorType.ADD_KEYS -> JsonMutatorType.ADD_KEYS
      software.amazon.awscdk.services.logs.JsonMutatorType.DELETE_KEYS ->
          JsonMutatorType.DELETE_KEYS
      software.amazon.awscdk.services.logs.JsonMutatorType.MOVE_KEYS -> JsonMutatorType.MOVE_KEYS
      software.amazon.awscdk.services.logs.JsonMutatorType.RENAME_KEYS ->
          JsonMutatorType.RENAME_KEYS
      software.amazon.awscdk.services.logs.JsonMutatorType.COPY_VALUE -> JsonMutatorType.COPY_VALUE
      software.amazon.awscdk.services.logs.JsonMutatorType.LIST_TO_MAP ->
          JsonMutatorType.LIST_TO_MAP
    }

    internal fun unwrap(wrapped: JsonMutatorType):
        software.amazon.awscdk.services.logs.JsonMutatorType = wrapped.cdkObject
  }
}
