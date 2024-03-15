@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.Unit

public interface PrefixListOptions {
  public fun maxEntries(): Number? = unwrap(this).getMaxEntries()

  @CdkDslMarker
  public interface Builder {
    public fun maxEntries(maxEntries: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.PrefixListOptions.Builder =
        software.amazon.awscdk.services.ec2.PrefixListOptions.builder()

    override fun maxEntries(maxEntries: Number) {
      cdkBuilder.maxEntries(maxEntries)
    }

    public fun build(): software.amazon.awscdk.services.ec2.PrefixListOptions = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.PrefixListOptions,
  ) : CdkObject(cdkObject), PrefixListOptions {
    override fun maxEntries(): Number? = unwrap(this).getMaxEntries()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PrefixListOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.PrefixListOptions):
        PrefixListOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PrefixListOptions):
        software.amazon.awscdk.services.ec2.PrefixListOptions = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.ec2.PrefixListOptions
  }
}
