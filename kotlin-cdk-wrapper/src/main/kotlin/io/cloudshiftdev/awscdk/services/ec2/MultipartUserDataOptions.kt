@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface MultipartUserDataOptions {
  public fun partsSeparator(): String? = unwrap(this).getPartsSeparator()

  @CdkDslMarker
  public interface Builder {
    public fun partsSeparator(partsSeparator: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MultipartUserDataOptions.Builder =
        software.amazon.awscdk.services.ec2.MultipartUserDataOptions.builder()

    override fun partsSeparator(partsSeparator: String) {
      cdkBuilder.partsSeparator(partsSeparator)
    }

    public fun build(): software.amazon.awscdk.services.ec2.MultipartUserDataOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.MultipartUserDataOptions,
  ) : CdkObject(cdkObject), MultipartUserDataOptions {
    override fun partsSeparator(): String? = unwrap(this).getPartsSeparator()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultipartUserDataOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MultipartUserDataOptions):
        MultipartUserDataOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultipartUserDataOptions):
        software.amazon.awscdk.services.ec2.MultipartUserDataOptions = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.ec2.MultipartUserDataOptions
  }
}
