@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appconfig

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface ApplicationProps {
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  public fun description(): String? = unwrap(this).getDescription()

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun description(description: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appconfig.ApplicationProps.Builder =
        software.amazon.awscdk.services.appconfig.ApplicationProps.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    public fun build(): software.amazon.awscdk.services.appconfig.ApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appconfig.ApplicationProps,
  ) : CdkObject(cdkObject), ApplicationProps {
    override fun applicationName(): String? = unwrap(this).getApplicationName()

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
