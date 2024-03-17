@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.stepfunctions.tasks

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import io.cloudshiftdev.awscdk.services.ecs.FargatePlatformVersion
import kotlin.Unit

/**
 * Properties to define an ECS service.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ecs.*;
 * import io.cloudshiftdev.awscdk.services.stepfunctions.tasks.*;
 * EcsFargateLaunchTargetOptions ecsFargateLaunchTargetOptions =
 * EcsFargateLaunchTargetOptions.builder()
 * .platformVersion(FargatePlatformVersion.LATEST)
 * .build();
 * ```
 */
public interface EcsFargateLaunchTargetOptions {
  /**
   * Refers to a specific runtime environment for Fargate task infrastructure.
   *
   * Fargate platform version is a combination of the kernel and container runtime versions.
   *
   * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
   */
  public fun platformVersion(): FargatePlatformVersion

  /**
   * A builder for [EcsFargateLaunchTargetOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param platformVersion Refers to a specific runtime environment for Fargate task
     * infrastructure. 
     * Fargate platform version is a combination of the kernel and container runtime versions.
     */
    public fun platformVersion(platformVersion: FargatePlatformVersion)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions.Builder =
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions.builder()

    /**
     * @param platformVersion Refers to a specific runtime environment for Fargate task
     * infrastructure. 
     * Fargate platform version is a combination of the kernel and container runtime versions.
     */
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
    /**
     * Refers to a specific runtime environment for Fargate task infrastructure.
     *
     * Fargate platform version is a combination of the kernel and container runtime versions.
     *
     * [Documentation](https://docs.aws.amazon.com/AmazonECS/latest/developerguide/platform_versions.html)
     */
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
        EcsFargateLaunchTargetOptions = CdkObjectWrappers.wrap(cdkObject) as?
        EcsFargateLaunchTargetOptions ?: Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsFargateLaunchTargetOptions):
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.stepfunctions.tasks.EcsFargateLaunchTargetOptions
  }
}
