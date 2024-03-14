package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.Suppress
import kotlin.Unit
import kotlin.jvm.JvmName

public interface DataSource {
  /**
   * S3 location of the data source that is associated with a channel.
   */
  public fun s3DataSource(): S3DataSource

  /**
   * A builder for [DataSource]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    public fun s3DataSource(s3DataSource: S3DataSource)

    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebbc3bbf36c06c717e037f58161a4876fd4251eb0fb934c9de190c21961c9d1")
    public fun s3DataSource(s3DataSource: S3DataSource.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.stepfunctions.tasks.DataSource.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.DataSource.builder()

    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    override fun s3DataSource(s3DataSource: S3DataSource) {
      cdkBuilder.s3DataSource(s3DataSource.let(S3DataSource::unwrap))
    }

    /**
     * @param s3DataSource S3 location of the data source that is associated with a channel. 
     */
    @Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2ebbc3bbf36c06c717e037f58161a4876fd4251eb0fb934c9de190c21961c9d1")
    override fun s3DataSource(s3DataSource: S3DataSource.Builder.() -> Unit): Unit =
        s3DataSource(S3DataSource(s3DataSource))

    public fun build(): software.amazon.awscdk.services.stepfunctions.tasks.DataSource =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DataSource,
  ) : CdkObject(cdkObject), DataSource {
    /**
     * S3 location of the data source that is associated with a channel.
     */
    override fun s3DataSource(): S3DataSource =
        unwrap(this).getS3DataSource().let(S3DataSource::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): DataSource {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.DataSource):
        DataSource = Wrapper(cdkObject)

    internal fun unwrap(wrapped: DataSource):
        software.amazon.awscdk.services.stepfunctions.tasks.DataSource = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.stepfunctions.tasks.DataSource
  }
}
