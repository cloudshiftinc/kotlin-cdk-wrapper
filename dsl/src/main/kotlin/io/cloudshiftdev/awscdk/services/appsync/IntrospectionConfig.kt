package io.cloudshiftdev.awscdk.services.appsync

public enum class IntrospectionConfig(
  private val cdkObject: software.amazon.awscdk.services.appsync.IntrospectionConfig,
) {
  ENABLED(software.amazon.awscdk.services.appsync.IntrospectionConfig.ENABLED),
  DISABLED(software.amazon.awscdk.services.appsync.IntrospectionConfig.DISABLED),
  ;

  public companion object {
    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.IntrospectionConfig):
        IntrospectionConfig = when (cdkObject) {
      software.amazon.awscdk.services.appsync.IntrospectionConfig.ENABLED ->
          IntrospectionConfig.ENABLED
      software.amazon.awscdk.services.appsync.IntrospectionConfig.DISABLED ->
          IntrospectionConfig.DISABLED
    }

    internal fun unwrap(wrapped: IntrospectionConfig):
        software.amazon.awscdk.services.appsync.IntrospectionConfig = wrapped.cdkObject
  }
}
