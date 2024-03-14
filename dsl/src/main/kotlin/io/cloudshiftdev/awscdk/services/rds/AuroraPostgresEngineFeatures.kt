package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Boolean
import kotlin.Unit

public interface AuroraPostgresEngineFeatures {
  /**
   * Whether this version of the Aurora Postgres cluster engine supports the S3 data export feature.
   *
   * Default: false
   */
  public fun s3Export(): Boolean? = unwrap(this).getS3Export()

  /**
   * Whether this version of the Aurora Postgres cluster engine supports the S3 data import feature.
   *
   * Default: false
   */
  public fun s3Import(): Boolean? = unwrap(this).getS3Import()

  /**
   * A builder for [AuroraPostgresEngineFeatures]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3Export Whether this version of the Aurora Postgres cluster engine supports the S3
     * data export feature.
     */
    public fun s3Export(s3Export: Boolean)

    /**
     * @param s3Import Whether this version of the Aurora Postgres cluster engine supports the S3
     * data import feature.
     */
    public fun s3Import(s3Import: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures.Builder
        = software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures.builder()

    /**
     * @param s3Export Whether this version of the Aurora Postgres cluster engine supports the S3
     * data export feature.
     */
    override fun s3Export(s3Export: Boolean) {
      cdkBuilder.s3Export(s3Export)
    }

    /**
     * @param s3Import Whether this version of the Aurora Postgres cluster engine supports the S3
     * data import feature.
     */
    override fun s3Import(s3Import: Boolean) {
      cdkBuilder.s3Import(s3Import)
    }

    public fun build(): software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures,
  ) : CdkObject(cdkObject), AuroraPostgresEngineFeatures {
    /**
     * Whether this version of the Aurora Postgres cluster engine supports the S3 data export
     * feature.
     *
     * Default: false
     */
    override fun s3Export(): Boolean? = unwrap(this).getS3Export()

    /**
     * Whether this version of the Aurora Postgres cluster engine supports the S3 data import
     * feature.
     *
     * Default: false
     */
    override fun s3Import(): Boolean? = unwrap(this).getS3Import()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AuroraPostgresEngineFeatures {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures):
        AuroraPostgresEngineFeatures = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AuroraPostgresEngineFeatures):
        software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.AuroraPostgresEngineFeatures
  }
}
