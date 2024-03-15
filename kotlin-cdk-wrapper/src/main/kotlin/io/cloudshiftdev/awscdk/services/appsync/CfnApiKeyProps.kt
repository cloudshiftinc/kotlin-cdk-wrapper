@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.appsync

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.Number
import kotlin.String
import kotlin.Unit

public interface CfnApiKeyProps {
  public fun apiId(): String

  public fun description(): String? = unwrap(this).getDescription()

  public fun expires(): Number? = unwrap(this).getExpires()

  @CdkDslMarker
  public interface Builder {
    public fun apiId(apiId: String)

    public fun description(description: String)

    public fun expires(expires: Number)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.appsync.CfnApiKeyProps.Builder =
        software.amazon.awscdk.services.appsync.CfnApiKeyProps.builder()

    override fun apiId(apiId: String) {
      cdkBuilder.apiId(apiId)
    }

    override fun description(description: String) {
      cdkBuilder.description(description)
    }

    override fun expires(expires: Number) {
      cdkBuilder.expires(expires)
    }

    public fun build(): software.amazon.awscdk.services.appsync.CfnApiKeyProps = cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.appsync.CfnApiKeyProps,
  ) : CdkObject(cdkObject), CfnApiKeyProps {
    override fun apiId(): String = unwrap(this).getApiId()

    override fun description(): String? = unwrap(this).getDescription()

    override fun expires(): Number? = unwrap(this).getExpires()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnApiKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.appsync.CfnApiKeyProps):
        CfnApiKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnApiKeyProps):
        software.amazon.awscdk.services.appsync.CfnApiKeyProps = (wrapped as CdkObject).cdkObject as
        software.amazon.awscdk.services.appsync.CfnApiKeyProps
  }
}
