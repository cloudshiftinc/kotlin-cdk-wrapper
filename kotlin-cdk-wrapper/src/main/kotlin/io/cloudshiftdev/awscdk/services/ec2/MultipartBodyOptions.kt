@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.ec2

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface MultipartBodyOptions {
  public fun body(): String? = unwrap(this).getBody()

  public fun contentType(): String

  public fun transferEncoding(): String? = unwrap(this).getTransferEncoding()

  @CdkDslMarker
  public interface Builder {
    public fun body(body: String)

    public fun contentType(contentType: String)

    public fun transferEncoding(transferEncoding: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.ec2.MultipartBodyOptions.Builder =
        software.amazon.awscdk.services.ec2.MultipartBodyOptions.builder()

    override fun body(body: String) {
      cdkBuilder.body(body)
    }

    override fun contentType(contentType: String) {
      cdkBuilder.contentType(contentType)
    }

    override fun transferEncoding(transferEncoding: String) {
      cdkBuilder.transferEncoding(transferEncoding)
    }

    public fun build(): software.amazon.awscdk.services.ec2.MultipartBodyOptions =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.ec2.MultipartBodyOptions,
  ) : CdkObject(cdkObject), MultipartBodyOptions {
    override fun body(): String? = unwrap(this).getBody()

    override fun contentType(): String = unwrap(this).getContentType()

    override fun transferEncoding(): String? = unwrap(this).getTransferEncoding()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): MultipartBodyOptions {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.ec2.MultipartBodyOptions):
        MultipartBodyOptions = Wrapper(cdkObject)

    internal fun unwrap(wrapped: MultipartBodyOptions):
        software.amazon.awscdk.services.ec2.MultipartBodyOptions = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.ec2.MultipartBodyOptions
  }
}
