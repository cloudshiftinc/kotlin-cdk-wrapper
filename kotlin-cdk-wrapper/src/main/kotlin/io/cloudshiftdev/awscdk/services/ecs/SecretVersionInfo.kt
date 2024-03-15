@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ecs

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface SecretVersionInfo {
  public fun versionId(): String? = unwrap(this).getVersionId()

  public fun versionStage(): String? = unwrap(this).getVersionStage()

  @CdkDslMarker
  public interface Builder {
    public fun versionId(versionId: String)

    public fun versionStage(versionStage: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ecs.SecretVersionInfo.Builder =
        software.amazon.awscdk.services.ecs.SecretVersionInfo.builder()

    override fun versionId(versionId: String) {
      cdkBuilder.versionId(versionId)
    }

    override fun versionStage(versionStage: String) {
      cdkBuilder.versionStage(versionStage)
    }

    public fun build(): software.amazon.awscdk.services.ecs.SecretVersionInfo = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ecs.SecretVersionInfo,
  ) : CdkObject(cdkObject), SecretVersionInfo {
    override fun versionId(): String? = unwrap(this).getVersionId()

    override fun versionStage(): String? = unwrap(this).getVersionStage()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): SecretVersionInfo {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ecs.SecretVersionInfo):
        SecretVersionInfo = Wrapper(cdkObject)

    internal fun unwrap(wrapped: SecretVersionInfo):
        software.amazon.awscdk.services.ecs.SecretVersionInfo = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ecs.SecretVersionInfo
  }
}
