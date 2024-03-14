package io.cloudshiftdev.awscdk.services.s3

import kotlin.String
import kotlin.Unit

public interface Location {
  public fun bucketName(): String

  public fun objectKey(): String

  public fun objectVersion(): String? = unwrap(this).getObjectVersion()

  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun objectKey(objectKey: String)

    public fun objectVersion(objectVersion: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.s3.Location.Builder =
        software.amazon.awscdk.services.s3.Location.builder()

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun objectKey(objectKey: String) {
      cdkBuilder.objectKey(objectKey)
    }

    override fun objectVersion(objectVersion: String) {
      cdkBuilder.objectVersion(objectVersion)
    }

    public fun build(): software.amazon.awscdk.services.s3.Location = cdkBuilder.build()
  }

  private class Wrapper internal constructor(
    internal val cdkObject: software.amazon.awscdk.services.s3.Location,
  ) : Location {
    override fun bucketName(): String = unwrap(this).getBucketName()

    override fun objectKey(): String = unwrap(this).getObjectKey()

    override fun objectVersion(): String? = unwrap(this).getObjectVersion()
  }

  public companion object {
    init {

    }

    public operator fun invoke(block: Builder.() -> Unit = {}): Location {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3.Location): Location =
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: Location): software.amazon.awscdk.services.s3.Location = (wrapped
        as Wrapper).cdkObject
  }
}
