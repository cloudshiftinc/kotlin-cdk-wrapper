@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.connect

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnSecurityKeyProps {
  public fun instanceId(): String

  public fun key(): String

  @CdkDslMarker
  public interface Builder {
    public fun instanceId(instanceId: String)

    public fun key(key: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.connect.CfnSecurityKeyProps.Builder =
        software.amazon.awscdk.services.connect.CfnSecurityKeyProps.builder()

    override fun instanceId(instanceId: String) {
      cdkBuilder.instanceId(instanceId)
    }

    override fun key(key: String) {
      cdkBuilder.key(key)
    }

    public fun build(): software.amazon.awscdk.services.connect.CfnSecurityKeyProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKeyProps,
  ) : CdkObject(cdkObject), CfnSecurityKeyProps {
    override fun instanceId(): String = unwrap(this).getInstanceId()

    override fun key(): String = unwrap(this).getKey()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnSecurityKeyProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.connect.CfnSecurityKeyProps):
        CfnSecurityKeyProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnSecurityKeyProps):
        software.amazon.awscdk.services.connect.CfnSecurityKeyProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.connect.CfnSecurityKeyProps
  }
}
