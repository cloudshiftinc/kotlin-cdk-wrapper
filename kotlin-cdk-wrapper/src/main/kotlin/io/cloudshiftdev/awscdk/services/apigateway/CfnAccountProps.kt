@file:Suppress("RedundantVisibilityModifier","RedundantUnitReturnType","RemoveRedundantQualifierName","unused","UnusedImport","ClassName","REDUNDANT_PROJECTION","DEPRECATION")

package io.cloudshiftdev.awscdk.services.apigateway

import io.cloudshiftdev.awscdk.common.CdkDslMarker
import io.cloudshiftdev.awscdk.common.CdkObject
import kotlin.String
import kotlin.Unit

public interface CfnAccountProps {
  public fun cloudWatchRoleArn(): String? = unwrap(this).getCloudWatchRoleArn()

  @CdkDslMarker
  public interface Builder {
    public fun cloudWatchRoleArn(cloudWatchRoleArn: String)
  }

  private class BuilderImpl : Builder {
    private val cdkBuilder: software.amazon.awscdk.services.apigateway.CfnAccountProps.Builder =
        software.amazon.awscdk.services.apigateway.CfnAccountProps.builder()

    override fun cloudWatchRoleArn(cloudWatchRoleArn: String) {
      cdkBuilder.cloudWatchRoleArn(cloudWatchRoleArn)
    }

    public fun build(): software.amazon.awscdk.services.apigateway.CfnAccountProps =
        cdkBuilder.build()
  }

  private class Wrapper(
    override val cdkObject: software.amazon.awscdk.services.apigateway.CfnAccountProps,
  ) : CdkObject(cdkObject), CfnAccountProps {
    override fun cloudWatchRoleArn(): String? = unwrap(this).getCloudWatchRoleArn()
  }

  public companion object {
    public operator fun invoke(block: Builder.() -> Unit = {}): CfnAccountProps {
      val builderImpl = BuilderImpl()
      return Wrapper(builderImpl.apply(block).build())
    }

    internal fun wrap(cdkObject: software.amazon.awscdk.services.apigateway.CfnAccountProps):
        CfnAccountProps = Wrapper(cdkObject)

    internal fun unwrap(wrapped: CfnAccountProps):
        software.amazon.awscdk.services.apigateway.CfnAccountProps = (wrapped as
        CdkObject).cdkObject as software.amazon.awscdk.services.apigateway.CfnAccountProps
  }
}
