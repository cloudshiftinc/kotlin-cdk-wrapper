@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Construction properties for `LambdaApplication`.
 *
 * Example:
 *
 * ```
 * LambdaApplication application = LambdaApplication.Builder.create(this, "CodeDeployApplication")
 * .applicationName("MyApplication")
 * .build();
 * ```
 */
public interface LambdaApplicationProps {
  /**
   * The physical, human-readable name of the CodeDeploy Application.
   *
   * Default: an auto-generated name will be used
   */
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * A builder for [LambdaApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The physical, human-readable name of the CodeDeploy Application.
     */
    public fun applicationName(applicationName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.codedeploy.LambdaApplicationProps.Builder =
        software.amazon.awscdk.services.codedeploy.LambdaApplicationProps.builder()

    /**
     * @param applicationName The physical, human-readable name of the CodeDeploy Application.
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.LambdaApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.LambdaApplicationProps,
  ) : CdkObject(cdkObject), LambdaApplicationProps {
    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     */
    override fun applicationName(): String? = unwrap(this).getApplicationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LambdaApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.LambdaApplicationProps):
        LambdaApplicationProps = CdkObjectWrappers.wrap(cdkObject) as LambdaApplicationProps

    internal fun unwrap(wrapped: LambdaApplicationProps):
        software.amazon.awscdk.services.codedeploy.LambdaApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.LambdaApplicationProps
  }
}
