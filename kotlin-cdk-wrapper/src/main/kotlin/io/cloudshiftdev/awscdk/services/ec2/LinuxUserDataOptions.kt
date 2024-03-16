@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import io.cloudshiftdev.awscdk.common.CdkObjectWrappers
import kotlin.String
import kotlin.Unit

/**
 * Options when constructing UserData for Linux.
 *
 * Example:
 *
 * ```
 * // The code below shows an example of how to instantiate this type.
 * // The values are placeholders you should change.
 * import io.cloudshiftdev.awscdk.services.ec2.*;
 * LinuxUserDataOptions linuxUserDataOptions = LinuxUserDataOptions.builder()
 * .shebang("shebang")
 * .build();
 * ```
 */
public interface LinuxUserDataOptions {
  /**
   * Shebang for the UserData script.
   *
   * Default: "#!/bin/bash"
   */
  public fun shebang(): String? = unwrap(this).getShebang()

  /**
   * A builder for [LinuxUserDataOptions]
   */
  @CdkDslMarker
  public interface Builder {
    /**
     * @param shebang Shebang for the UserData script.
     */
    public fun shebang(shebang: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.LinuxUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.LinuxUserDataOptions.builder()

    /**
     * @param shebang Shebang for the UserData script.
     */
    override fun shebang(shebang: String) {
      cdkBuilder.shebang(shebang)
    }

    public fun build(): software.amazon.awscdk.services.ec2.LinuxUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.LinuxUserDataOptions,
  ) : CdkObject(cdkObject), LinuxUserDataOptions {
    /**
     * Shebang for the UserData script.
     *
     * Default: "#!/bin/bash"
     */
    override fun shebang(): String? = unwrap(this).getShebang()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): LinuxUserDataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.LinuxUserDataOptions):
        LinuxUserDataOptions = CdkObjectWrappers.wrap(cdkObject) as LinuxUserDataOptions

    internal fun unwrap(wrapped: LinuxUserDataOptions):
        software.amazon.awscdk.services.ec2.LinuxUserDataOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.LinuxUserDataOptions
  }
}
