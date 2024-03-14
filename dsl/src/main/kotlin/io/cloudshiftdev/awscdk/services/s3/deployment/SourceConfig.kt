package io.cloudshiftdev.awscdk.services.s3.deployment

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface SourceConfig {
  public fun bucket(): IBucket

  public fun markers(): Map<String, Any> = unwrap(this).getMarkers() ?: emptyMap()

  public fun zipObjectKey(): String

  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun markers(markers: Map<String, Any>)

    public fun zipObjectKey(zipObjectKey: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.deployment.SourceConfig.Builder =
        software.amazon.awscdk.services.s3.deployment.SourceConfig.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun markers(markers: Map<String, Any>) {
      cdkBuilder.markers(markers)
    }

    override fun zipObjectKey(zipObjectKey: String) {
      cdkBuilder.zipObjectKey(zipObjectKey)
    }

    public fun build(): software.amazon.awscdk.services.s3.deployment.SourceConfig =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.deployment.SourceConfig,
  ) : SourceConfig {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun markers(): Map<String, Any> = unwrap(this).getMarkers() ?: emptyMap()

    override fun zipObjectKey(): String = unwrap(this).getZipObjectKey()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): SourceConfig {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.deployment.SourceConfig):
        SourceConfig = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SourceConfig):
        software.amazon.awscdk.services.s3.deployment.SourceConfig = (wrapped as Wrapper).cdkObject
  }
}
