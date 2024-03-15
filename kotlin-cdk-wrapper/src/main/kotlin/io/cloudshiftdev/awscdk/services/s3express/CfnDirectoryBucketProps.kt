@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.s3express

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnDirectoryBucketProps {
  public fun bucketName(): String? = unwrap(this).getBucketName()

  public fun dataRedundancy(): String

  public fun locationName(): String

  @CdkDslMarker
  public interface Builder {
    public fun bucketName(bucketName: String)

    public fun dataRedundancy(dataRedundancy: String)

    public fun locationName(locationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps.Builder =
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps.builder()

    override fun bucketName(bucketName: String) {
      cdkBuilder.bucketName(bucketName)
    }

    override fun dataRedundancy(dataRedundancy: String) {
      cdkBuilder.dataRedundancy(dataRedundancy)
    }

    override fun locationName(locationName: String) {
      cdkBuilder.locationName(locationName)
    }

    public fun build(): software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps,
  ) : CdkObject(cdkObject), CfnDirectoryBucketProps {
    override fun bucketName(): String? = unwrap(this).getBucketName()

    override fun dataRedundancy(): String = unwrap(this).getDataRedundancy()

    override fun locationName(): String = unwrap(this).getLocationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDirectoryBucketProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps):
        CfnDirectoryBucketProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDirectoryBucketProps):
        software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.s3express.CfnDirectoryBucketProps
  }
}
