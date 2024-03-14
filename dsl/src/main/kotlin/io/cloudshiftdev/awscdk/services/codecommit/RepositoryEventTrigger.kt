package io.cloudshiftdev.awscdk.services.codecommit

public enum class RepositoryEventTrigger(
  private val cdkObject: software.amazon.awscdk.services.codecommit.RepositoryEventTrigger,
) {
  ALL(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.ALL),
  UPDATE_REF(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.UPDATE_REF),
  CREATE_REF(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.CREATE_REF),
  DELETE_REF(software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.DELETE_REF),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.codecommit.RepositoryEventTrigger):
        RepositoryEventTrigger = when (cdkObject) {
      software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.ALL ->
          RepositoryEventTrigger.ALL
      software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.UPDATE_REF ->
          RepositoryEventTrigger.UPDATE_REF
      software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.CREATE_REF ->
          RepositoryEventTrigger.CREATE_REF
      software.amazon.awscdk.services.codecommit.RepositoryEventTrigger.DELETE_REF ->
          RepositoryEventTrigger.DELETE_REF
    }

    internal fun unwrap(wrapped: RepositoryEventTrigger):
        software.amazon.awscdk.services.codecommit.RepositoryEventTrigger = wrapped.cdkObject
  }
}
