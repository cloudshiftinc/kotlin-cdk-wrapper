package io.cloudshiftdev.awscdk.services.apigateway

import kotlin.String
import kotlin.Unit

public interface ApiDefinitionS3Location {
  public fun bucket(): String

  public fun key(): String

  public fun version(): String? = unwrap(this).getVersion()

  public interface Builder {
    public fun bucket(bucket: String)

    public fun key(key: String)

    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location.Builder =
        software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location.builder()

    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location,
  ) : ApiDefinitionS3Location {
    override fun bucket(): String = unwrap(this).getBucket()

    override fun key(): String = unwrap(this).getKey()

    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDefinitionS3Location {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location):
        ApiDefinitionS3Location = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDefinitionS3Location):
        software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location = (wrapped as
        Wrapper).cdkObject
  }
}
