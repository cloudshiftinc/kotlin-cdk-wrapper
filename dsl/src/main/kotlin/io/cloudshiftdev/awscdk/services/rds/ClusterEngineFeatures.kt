package io.cloudshiftdev.awscdk.services.rds

import kotlin.String
import kotlin.Unit

public interface ClusterEngineFeatures {
  public fun s3Export(): String? = unwrap(this).getS3Export()

  public fun s3Import(): String? = unwrap(this).getS3Import()

  public interface Builder {
    public fun s3Export(s3Export: String) {
    }

    public fun s3Import(s3Import: String) {
    }
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.ClusterEngineFeatures.Builder =
        software.amazon.awscdk.services.rds.ClusterEngineFeatures.builder()

    public override fun s3Export(s3Export: String) {
      cdkBuilder.s3Export(s3Export)
    }

    public override fun s3Import(s3Import: String) {
      cdkBuilder.s3Import(s3Import)
    }

    public fun build(): software.amazon.awscdk.services.rds.ClusterEngineFeatures =
        cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.rds.ClusterEngineFeatures,
  ) : ClusterEngineFeatures {
    public override fun s3Export(): String? = unwrap(this).getS3Export()

    public override fun s3Import(): String? = unwrap(this).getS3Import()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): ClusterEngineFeatures {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.ClusterEngineFeatures):
        ClusterEngineFeatures = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ClusterEngineFeatures):
        software.amazon.awscdk.services.rds.ClusterEngineFeatures = (wrapped as Wrapper).cdkObject
  }
}
