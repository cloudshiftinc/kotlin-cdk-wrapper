package io.cloudshiftdev.awscdk.services.codedeploy

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ServerApplicationProps {
  /**
   * The physical, human-readable name of the CodeDeploy Application.
   *
   * Default: an auto-generated name will be used
   */
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * A builder for [ServerApplicationProps]
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
        software.amazon.awscdk.services.codedeploy.ServerApplicationProps.Builder =
        software.amazon.awscdk.services.codedeploy.ServerApplicationProps.builder()

    /**
     * @param applicationName The physical, human-readable name of the CodeDeploy Application.
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    public fun build(): software.amazon.awscdk.services.codedeploy.ServerApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.codedeploy.ServerApplicationProps,
  ) : CdkObject(cdkObject), ServerApplicationProps {
    /**
     * The physical, human-readable name of the CodeDeploy Application.
     *
     * Default: an auto-generated name will be used
     */
    override fun applicationName(): String? = unwrap(this).getApplicationName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ServerApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.codedeploy.ServerApplicationProps):
        ServerApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ServerApplicationProps):
        software.amazon.awscdk.services.codedeploy.ServerApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.codedeploy.ServerApplicationProps
  }
}
