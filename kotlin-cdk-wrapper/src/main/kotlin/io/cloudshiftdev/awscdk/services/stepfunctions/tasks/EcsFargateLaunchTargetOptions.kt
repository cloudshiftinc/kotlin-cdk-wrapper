@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import kotlin.Unit

public interface EcsFargateLaunchTargetOptions {
  public fun platformVersion(): FargatePlatformVersion

  @CdkDslMarker
  public interface Builder {
    public fun platformVersion(platformVersion: FargatePlatformVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions.builder()

    override fun platformVersion(platformVersion: FargatePlatformVersion) {
      cdkBuilder.platformVersion(platformVersion.let(FargatePlatformVersion::unwrap))
    }

    public fun build():
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions,
  ) : CdkObject(cdkObject), EcsFargateLaunchTargetOptions {
    override fun platformVersion(): FargatePlatformVersion =
        unwrap(this).getPlatformVersion().let(FargatePlatformVersion::wrap)
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsFargateLaunchTargetOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions):
        EcsFargateLaunchTargetOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsFargateLaunchTargetOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions
  }
}
