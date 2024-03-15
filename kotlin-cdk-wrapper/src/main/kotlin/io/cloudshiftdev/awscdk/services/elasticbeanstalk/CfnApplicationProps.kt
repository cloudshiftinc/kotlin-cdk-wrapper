@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationProps {
  public fun applicationName(): String? = unwrap(this).getApplicationName()

  public fun description(): String? = unwrap(this).getDescription()

  public fun resourceLifecycleConfig(): Any? = unwrap(this).getResourceLifecycleConfig()

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun description(description: String)

    public fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable)

    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2df784e19c008bde534c16beab91231a961c5298ed7467b5f513de7fd516a3cf")
    public
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun resourceLifecycleConfig(resourceLifecycleConfig: IResolvable) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(IResolvable::unwrap))
    }

    override
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty) {
      cdkBuilder.resourceLifecycleConfig(resourceLifecycleConfig.let(CfnApplication.ApplicationResourceLifecycleConfigProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("2df784e19c008bde534c16beab91231a961c5298ed7467b5f513de7fd516a3cf")
    override
        fun resourceLifecycleConfig(resourceLifecycleConfig: CfnApplication.ApplicationResourceLifecycleConfigProperty.Builder.() -> Unit):
        Unit =
        resourceLifecycleConfig(CfnApplication.ApplicationResourceLifecycleConfigProperty(resourceLifecycleConfig))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps,
  ) : CdkObject(cdkObject), CfnApplicationProps {
    override fun applicationName(): String? = unwrap(this).getApplicationName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun resourceLifecycleConfig(): Any? = unwrap(this).getResourceLifecycleConfig()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps):
        CfnApplicationProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationProps
  }
}
