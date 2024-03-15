@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.cognito

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnUserPoolUICustomizationAttachmentProps {
  public fun clientId(): String

  public fun css(): String? = unwrap(this).getCss()

  public fun userPoolId(): String

  @CdkDslMarker
  public interface Builder {
    public fun clientId(clientId: String)

    public fun css(css: String)

    public fun userPoolId(userPoolId: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder:
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps.Builder =
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps.builder()

    override fun clientId(clientId: String) {
      cdkBuilder.clientId(clientId)
    }

    override fun css(css: String) {
      cdkBuilder.css(css)
    }

    override fun userPoolId(userPoolId: String) {
      cdkBuilder.userPoolId(userPoolId)
    }

    public fun build():
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject:
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps,
  ) : CdkObject(cdkObject), CfnUserPoolUICustomizationAttachmentProps {
    override fun clientId(): String = unwrap(this).getClientId()

    override fun css(): String? = unwrap(this).getCss()

    override fun userPoolId(): String = unwrap(this).getUserPoolId()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}):
        CfnUserPoolUICustomizationAttachmentProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal
        fun wrap(cdkObject: software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps):
        CfnUserPoolUICustomizationAttachmentProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnUserPoolUICustomizationAttachmentProps):
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps = (wrapped
        as CdkObject).cdkObject as
        software.amazon.awscdk.services.cognito.CfnUserPoolUICustomizationAttachmentProps
  }
}
