@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `EcsApplication`.
 *
 * Example:
 *
 * ```
 * EcsApplication application = EcsApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
public interface EcsApplicationProps {
  /**
   * The physical, human-readable name of the CodeDeploy Application.
   *
   * Default: an auto-generated name will be used
   */
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * A builder for [EcsApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The physical, human-readable name of the CodeDeploy Application.
     */
    public fun applicationName(applicationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.codedeploy.EcsApplicationProps.Builder =
        software.amazon.awscdk.services.codedeploy.EcsApplicationProps.builder()

    /**
     * @param applicationName The physical, human-readable name of the CodeDeploy Application.
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.EcsApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    cdkObject: software.amazon.awscdk.services.codedeploy.EcsApplicationProps,
  ) : CdkObject(cdkObject), EcsApplicationProps {
    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     */
    override fun applicationName(): String? = unwrap(this).getApplicationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): EcsApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.EcsApplicationProps):
        EcsApplicationProps = CdkObjectWrappers.wrap(cdkObject) as? EcsApplicationProps ?:
        Wrapper(cdkObject)

    internal fun unwrap(wrapped: EcsApplicationProps):
        software.amazon.awscdk.services.codedeploy.EcsApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.EcsApplicationProps
  }
}
