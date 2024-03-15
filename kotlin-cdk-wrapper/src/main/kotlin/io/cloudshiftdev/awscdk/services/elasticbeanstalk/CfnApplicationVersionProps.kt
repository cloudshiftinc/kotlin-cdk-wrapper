@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.elasticbeanstalk

import io.cloudshiftdev.awscdk.IResolvable
import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Any
import kotlin.String
import kotlin.Unit
import kotlin.jvm.JvmName

public interface CfnApplicationVersionProps {
  public fun applicationName(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun sourceBundle(): Any

  @CdkDslMarker
  public interface Builder {
    public fun applicationName(applicationName: String)

    public fun description(description: String)

    public fun sourceBundle(sourceBundle: IResolvable)

    public fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty)

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df635ebf23329c6182636200cb1c2635bd1d9642bff7f0b6805bf134ef95d6b8")
    public
        fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty.Builder.() -> Unit)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.Builder =
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps.builder()

    override fun applicationName(applicationName: String) {
      cdkBuilder.applicationName(applicationName)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun sourceBundle(sourceBundle: IResolvable) {
      cdkBuilder.sourceBundle(sourceBundle.let(IResolvable::unwrap))
    }

    override fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty) {
      cdkBuilder.sourceBundle(sourceBundle.let(CfnApplicationVersion.SourceBundleProperty::unwrap))
    }

    @kotlin.Suppress("INAPPLICABLE_JVM_NAME")
    @JvmName("df635ebf23329c6182636200cb1c2635bd1d9642bff7f0b6805bf134ef95d6b8")
    override
        fun sourceBundle(sourceBundle: CfnApplicationVersion.SourceBundleProperty.Builder.() -> Unit):
        Unit = sourceBundle(CfnApplicationVersion.SourceBundleProperty(sourceBundle))

    public fun build(): software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
        = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps,
  ) : CdkObject(cdkObject), CfnApplicationVersionProps {
    override fun applicationName(): String = unwrap(this).getApplicationName()

    override fun description(): String? = unwrap(this).getDescription()

    override fun sourceBundle(): Any = unwrap(this).getSourceBundle()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApplicationVersionProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps):
        CfnApplicationVersionProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApplicationVersionProps):
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps = (wrapped as
        CdkObject).cdkObject as
        software.amazon.awscdk.services.elasticbeanstalk.CfnApplicationVersionProps
  }
}
