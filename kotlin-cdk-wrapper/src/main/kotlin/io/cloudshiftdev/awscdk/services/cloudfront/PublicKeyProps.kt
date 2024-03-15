@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cloudfront

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface PublicKeyProps {
  public fun comment(): String? = unwrap(this).getComment()

  public fun encodedKey(): String

  public fun publicKeyName(): String? = unwrap(this).getPublicKeyName()

  @CdkDslMarker
  public interface Builder {
    public fun comment(comment: String)

    public fun encodedKey(encodedKey: String)

    public fun publicKeyName(publicKeyName: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cloudfront.PublicKeyProps.Builder =
        software.amazon.awscdk.services.cloudfront.PublicKeyProps.builder()

    override fun comment(comment: String) {
      cdkBuilder.comment(comment)
    }

    override fun encodedKey(encodedKey: String) {
      cdkBuilder.encodedKey(encodedKey)
    }

    override fun publicKeyName(publicKeyName: String) {
      cdkBuilder.publicKeyName(publicKeyName)
    }

    public fun build(): software.amazon.awscdk.services.cloudfront.PublicKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cloudfront.PublicKeyProps,
  ) : CdkObject(cdkObject), PublicKeyProps {
    override fun comment(): String? = unwrap(this).getComment()

    override fun encodedKey(): String = unwrap(this).getEncodedKey()

    override fun publicKeyName(): String? = unwrap(this).getPublicKeyName()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): PublicKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cloudfront.PublicKeyProps):
        PublicKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: PublicKeyProps):
        software.amazon.awscdk.services.cloudfront.PublicKeyProps = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cloudfront.PublicKeyProps
  }
}
