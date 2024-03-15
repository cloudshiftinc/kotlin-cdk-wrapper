@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface LinuxUserDataOptions {
  public fun shebang(): String? = unwrap(this).getShebang()

  @CdkDslMarker
  public interface Builder {
    public fun shebang(shebang: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LinuxUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.LinuxUserDataOptions.builder()

    override fun shebang(shebang: String) {
      cdkBuilder.shebang(shebang)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LinuxUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LinuxUserDataOptions,
  ) : CdkObject(cdkObject), LinuxUserDataOptions {
    override fun shebang(): String? = unwrap(this).getShebang()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LinuxUserDataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LinuxUserDataOptions):
        LinuxUserDataOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: LinuxUserDataOptions):
        software.amazon.awscdk.services.ec2.LinuxUserDataOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.LinuxUserDataOptions
  }
}
