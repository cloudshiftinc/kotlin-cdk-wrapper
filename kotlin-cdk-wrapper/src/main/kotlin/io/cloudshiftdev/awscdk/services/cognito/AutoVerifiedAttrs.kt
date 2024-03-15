@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Boolean
import kotlin.Unit

public interface AutoVerifiedAttrs {
  public fun email(): Boolean? = unwrap(this).getEmail()

  public fun phone(): Boolean? = unwrap(this).getPhone()

  @CdkDslMarker
  public interface Builder {
    public fun email(email: Boolean)

    public fun phone(phone: Boolean)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.cognito.AutoVerifiedAttrs.Builder =
        software.amazon.awscdk.services.cognito.AutoVerifiedAttrs.builder()

    override fun email(email: Boolean) {
      cdkBuilder.email(email)
    }

    override fun phone(phone: Boolean) {
      cdkBuilder.phone(phone)
    }

    public fun build(): software.amazon.awscdk.services.cognito.AutoVerifiedAttrs =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.cognito.AutoVerifiedAttrs,
  ) : CdkObject(cdkObject), AutoVerifiedAttrs {
    override fun email(): Boolean? = unwrap(this).getEmail()

    override fun phone(): Boolean? = unwrap(this).getPhone()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): AutoVerifiedAttrs {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.cognito.AutoVerifiedAttrs):
        AutoVerifiedAttrs = Wrapper(cdkObject)

    internal fun unwrap(wrapped: AutoVerifiedAttrs):
        software.amazon.awscdk.services.cognito.AutoVerifiedAttrs = (wrapped as CdkObject).cdkObject
        as software.amazon.awscdk.services.cognito.AutoVerifiedAttrs
  }
}