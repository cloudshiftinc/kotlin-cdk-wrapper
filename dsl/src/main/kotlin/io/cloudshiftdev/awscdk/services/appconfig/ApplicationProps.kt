package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.CdkObject
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import kotlin.String
import kotlin.Unit

public interface ApplicationProps {
  /**
   * The name of the application.
   *
   * Default: - A name is generated.
   */
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  /**
   * The description for the application.
   *
   * Default: - No description.
   */
  public fun description(): String? = unwrap(this).getDescription()

  /**
   * A builder for [ApplicationProps]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param applicationName The name of the application.
     */
    public fun applicationName(applicationName: String)

    /**
     * @param description The description for the application.
     */
    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ApplicationProps.Builder =
        software.amazon.awscdk.services.appconfig.ApplicationProps.builder()

    /**
     * @param applicationName The name of the application.
     */
    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    /**
     * @param description The description for the application.
     */
    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ApplicationProps,
  ) : CdkObject(cdkObject), ApplicationProps {
    /**
     * The name of the application.
     *
     * Default: - A name is generated.
     */
    override fun applicationName(): String? = unwrap(this).getApplicationName()

    /**
     * The description for the application.
     *
     * Default: - No description.
     */
    override fun description(): String? = unwrap(this).getDescription()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): ApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appconfig.ApplicationProps):
        ApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: ApplicationProps):
        software.amazon.awscdk.services.appconfig.ApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.appconfig.ApplicationProps
  }
}
