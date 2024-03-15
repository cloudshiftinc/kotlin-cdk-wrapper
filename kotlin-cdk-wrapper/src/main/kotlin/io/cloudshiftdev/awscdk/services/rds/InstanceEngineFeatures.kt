@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.rds

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface InstanceEngineFeatures {
  public fun s3Export(): String? = unwrap(this).getS3Export()

  public fun s3Import(): String? = unwrap(this).getS3Import()

  @CdkDslMarker
  public interface Builder {
    public fun s3Export(s3Export: String)

    public fun s3Import(s3Import: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.rds.InstanceEngineFeatures.Builder =
        software.amazon.awscdk.services.rds.InstanceEngineFeatures.builder()

    override fun s3Export(s3Export: String) {
      cdkBuilder.s3Export(s3Export)
    }

    override fun s3Import(s3Import: String) {
      cdkBuilder.s3Import(s3Import)
    }

    public fun build(): software.amazon.awscdk.services.rds.InstanceEngineFeatures =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.rds.InstanceEngineFeatures,
  ) : CdkObject(cdkObject), InstanceEngineFeatures {
    override fun s3Export(): String? = unwrap(this).getS3Export()

    override fun s3Import(): String? = unwrap(this).getS3Import()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): InstanceEngineFeatures {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.rds.InstanceEngineFeatures):
        InstanceEngineFeatures = Wrapper(cdkObject)

    internal fun unwrap(wrapped: InstanceEngineFeatures):
        software.amazon.awscdk.services.rds.InstanceEngineFeatures = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.rds.InstanceEngineFeatures
  }
}
