package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ApiDefinitionS3Location {
  /**
   * The S3 bucket.
   */
  public fun bucket(): String

  /**
   * The S3 key.
   */
  public fun key(): String

  /**
   * An optional version.
   *
   * Default: - latest version
   */
  public fun version(): String? = unwrap(this).getVersion()

  /**
   * A builder for [ApiDefinitionS3Location]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param bucket The S3 bucket. 
     */
    public fun bucket(bucket: String)

    /**
     * @param key The S3 key. 
     */
    public fun key(key: String)

    /**
     * @param version An optional version.
     */
    public fun version(version: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location.Builder =
        software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location.builder()

    /**
     * @param bucket The S3 bucket. 
     */
    override fun bucket(bucket: String) {
      cdkBuilder.bucket(bucket)
    }

    /**
     * @param key The S3 key. 
     */
    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    /**
     * @param version An optional version.
     */
    override fun version(version: String) {
      cdkBuilder.version(version)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location,
  ) : CdkObject(cdkObject), ApiDefinitionS3Location {
    /**
     * The S3 bucket.
     */
    override fun bucket(): String = unwrap(this).getBucket()

    /**
     * The S3 key.
     */
    override fun key(): String = unwrap(this).getKey()

    /**
     * An optional version.
     *
     * Default: - latest version
     */
    override fun version(): String? = unwrap(this).getVersion()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApiDefinitionS3Location {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location):
        ApiDefinitionS3Location = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApiDefinitionS3Location):
        software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.ApiDefinitionS3Location
  }
}
