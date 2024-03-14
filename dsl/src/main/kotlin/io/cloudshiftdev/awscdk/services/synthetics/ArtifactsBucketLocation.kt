package io.cloudshiftdev.awscdk.services.synthetics

import io.cloudshiftdev.awscdk.services.s3.IBucket
import kotlin.String
import kotlin.Unit

public interface ArtifactsBucketLocation {
  public fun bucket(): IBucket

  public fun prefix(): String? = unwrap(this).getPrefix()

  public interface Builder {
    public fun bucket(bucket: IBucket)

    public fun prefix(prefix: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation.Builder =
        software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation.builder()

    override fun bucket(bucket: IBucket) {
      cdkBuilder.bucket(bucket.let(IBucket::unwrap))
    }

    override fun prefix(prefix: String) {
      cdkBuilder.prefix(prefix)
    }

    public fun build(): software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation,
  ) : ArtifactsBucketLocation {
    override fun bucket(): IBucket = unwrap(this).getBucket().let(IBucket::wrap)

    override fun prefix(): String? = unwrap(this).getPrefix()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ArtifactsBucketLocation {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation):
        ArtifactsBucketLocation = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ArtifactsBucketLocation):
        software.amazon.awscdk.services.synthetics.ArtifactsBucketLocation = (wrapped as
        Wrapper).cdkObject
  }
}
