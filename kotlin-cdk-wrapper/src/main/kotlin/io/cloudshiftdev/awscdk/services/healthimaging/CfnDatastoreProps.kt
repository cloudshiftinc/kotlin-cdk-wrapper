@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.healthimaging

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit
import kotlin.collections.Map

public interface CfnDatastoreProps {
  public fun datastoreName(): String? = unwrap(this).getDatastoreName()

  public fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

  public fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()

  @CdkDslMarker
  public interface Builder {
    public fun datastoreName(datastoreName: String)

    public fun kmsKeyArn(kmsKeyArn: String)

    public fun tags(tags: Map<String, String>)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.healthimaging.CfnDatastoreProps.Builder
        = software.amazon.awscdk.services.healthimaging.CfnDatastoreProps.builder()

    override fun datastoreName(datastoreName: String) {
      cdkBuilder.datastoreName(datastoreName)
    }

    override fun kmsKeyArn(kmsKeyArn: String) {
      cdkBuilder.kmsKeyArn(kmsKeyArn)
    }

    override fun tags(tags: Map<String, String>) {
      cdkBuilder.tags(tags)
    }

    public fun build(): software.amazon.awscdk.services.healthimaging.CfnDatastoreProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.healthimaging.CfnDatastoreProps,
  ) : CdkObject(cdkObject), CfnDatastoreProps {
    override fun datastoreName(): String? = unwrap(this).getDatastoreName()

    override fun kmsKeyArn(): String? = unwrap(this).getKmsKeyArn()

    override fun tags(): Map<String, String> = unwrap(this).getTags() ?: emptyMap()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnDatastoreProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.healthimaging.CfnDatastoreProps):
        CfnDatastoreProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnDatastoreProps):
        software.amazon.awscdk.services.healthimaging.CfnDatastoreProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.healthimaging.CfnDatastoreProps
  }
}
